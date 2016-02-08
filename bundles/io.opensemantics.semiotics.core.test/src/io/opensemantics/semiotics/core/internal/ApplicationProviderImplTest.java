package io.opensemantics.semiotics.core.internal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.ECPProviderRegistry;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import io.opensemantics.semiotics.core.ApplicationProvider;
import io.opensemantics.semiotics.search.Application;
import io.opensemantics.semiotics.search.SearchFactory;

public class ApplicationProviderImplTest {

  private ApplicationProvider provider;
  private ECPProvider ecpProvider;
  private ECPProjectManager ecpManager;

  @Before
  public void setUp() {
    // Test the service
    final BundleContext ctx = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    final ServiceReference<ApplicationProvider> svcRef = ctx.getServiceReference(ApplicationProvider.class);
    assertNotNull("No service reference", svcRef);
    provider = ctx.getService(svcRef);
    assertNotNull("ApplicationProvider is null", provider);

    // Setup ECP
    ECPProviderRegistry registry = ECPUtil.getECPProviderRegistry();
    assertNotNull(registry);
    ecpProvider = registry.getProvider("org.eclipse.emf.ecp.emfstore.provider");
    ecpManager = ECPUtil.getECPProjectManager();
    assertNotNull(ecpManager);
  }

  @Test
  public void testAddAndRemove() {
    final Application app = SearchFactory.eINSTANCE.createApplication();
    assertTrue("Application added to provider", provider.add(app));
    assertTrue("Application removed from provider", provider.remove(app));
    assertFalse("Application already removed from provider", provider.remove(app));
  }

  @Test
  public void testApplications() {
    final Application app = SearchFactory.eINSTANCE.createApplication();
    provider.add(app);
    for (Application _app : provider.getApplications()) {
      assertTrue("Application added is the same as iterated", app.equals(_app));
      provider.remove(app);
      return;
    }
    assertFalse("Did not find added application", false);
  }

  @Test
  public void applicationShouldExistFromProject() throws Exception {
    ECPProject project = ecpManager.createProject(ecpProvider, "testProject");
    EList<Object> contents = project.getContents();
    final Application app = SearchFactory.eINSTANCE.createApplication();
    app.setName("name");
    assertTrue(contents.add(app));
    boolean iterated = false;
    for (Application _app : provider.getApplications()) {
      assertTrue("Application added to project contents is same as iterated", app.equals(_app));
      iterated = true;
    }
    assertTrue("Need to iterate at least once", iterated);
    assertTrue(contents.remove(app));
  }
}
