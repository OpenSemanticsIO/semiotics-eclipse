package io.opensemantics.semiotics.core.ecp;

import java.util.Collection;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.observer.ECPProjectContentChangedObserver;
import org.eclipse.emf.ecp.core.util.observer.ECPProjectOpenClosedObserver;
import org.eclipse.emf.ecp.core.util.observer.ECPProjectsChangedObserver;

import io.opensemantics.semiotics.core.internal.Activator;

public class ProjectObserver
    implements ECPProjectContentChangedObserver, ECPProjectOpenClosedObserver, ECPProjectsChangedObserver {

  public ProjectObserver() {
    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.ecp.core.util.observer.ECPProjectsChangedObserver#
   * projectsChanged(java.util.Collection, java.util.Collection)
   */
  @Override
  public void projectsChanged(Collection<ECPProject> oldProjects, Collection<ECPProject> newProjects) {

  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.ecp.core.util.observer.ECPProjectOpenClosedObserver#
   * projectChanged(org.eclipse.emf.ecp.core.ECPProject, boolean)
   */
  @Override
  public void projectChanged(ECPProject project, boolean opened) {
    Activator.log(IStatus.INFO, "Project: " + project.getName() + " opened? " + opened);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.eclipse.emf.ecp.core.util.observer.ECPProjectContentChangedObserver#
   * objectsChanged(org.eclipse.emf.ecp.core.ECPProject, java.util.Collection)
   */
  @Override
  public Collection<Object> objectsChanged(ECPProject project, Collection<Object> objects) {
    // TODO Auto-generated method stub
    return null;
  }

}
