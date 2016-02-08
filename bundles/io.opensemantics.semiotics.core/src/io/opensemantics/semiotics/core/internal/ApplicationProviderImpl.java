package io.opensemantics.semiotics.core.internal;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPUtil;

import io.opensemantics.semiotics.core.ApplicationProvider;
import io.opensemantics.semiotics.search.Application;

public class ApplicationProviderImpl implements ApplicationProvider {

  private CopyOnWriteArraySet<Application> _applications;

  public ApplicationProviderImpl() {
    _applications = new CopyOnWriteArraySet<>();
  }

  @Override
  public boolean add(Application application) {
    return _applications.add(application);
  }

  @Override
  public boolean remove(Application application) {
    return _applications.remove(application);
  }

  @Override
  public Iterable<Application> getApplications() {
    // TODO https://www.eclipse.org/forums/index.php?t=rview&goto=1719754
    // Look into using a ChangeObserver (via ChangeBroker) to add / remove
    // Still fuzzy on how to initially prime the pump. Maybe use code
    // in getProjectApplications ?
    return getProjectApplications();
  }

  private Collection<Application> getProjectApplications() {
    final CopyOnWriteArraySet<Application> cache = new CopyOnWriteArraySet<>(_applications);
    for (ECPProject project : ECPUtil.getECPProjectManager().getProjects()) {
      for (Object obj : project.getContents()) {
        if (obj instanceof Application) {
          Application app = (Application) obj;
          // TODO : use / enforce EMF validation
          // Got constraints to work (and invariants) but
          // looking more for a required value to be set versus
          // once set ensuring it's a certain length.
          if ((app.getName() != null) && (!app.getName().isEmpty()))
            cache.add(app);
        }
      }
    }
    return cache;
  }
}
