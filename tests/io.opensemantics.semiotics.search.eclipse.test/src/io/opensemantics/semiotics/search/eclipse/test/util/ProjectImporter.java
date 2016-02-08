package io.opensemantics.semiotics.search.eclipse.test.util;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;

public class ProjectImporter {

  private static final String PLUGIN_ID = "io.opensemantics.semiotics.search.eclipse.test";
  private URL path;
  private IProject project;

  public ProjectImporter(URL resource) {
    // TODO Auto-generated constructor stub
    this.path = resource;
  }

  /*
   * IWorkspace ws = ResourcesPlugin.getWorkspace(); IProject project =
   * ws.getRoot().getProject("External Files"); if (!project.exists())
   * project.create(null); if (!project.isOpen()) project.open(null); ... IPath
   * location = new Path(name); IFile file =
   * project.getFile(location.lastSegment()); file.createLink(location,
   * IResource.NONE, null); ... IProjectDescription description =
   * ResourcesPlugin.getWorkspace().loadProjectDescription( new
   * Path("PROJECT_PATH/.project")); IProject project =
   * ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
   * project.create(description, null); project.open(null)
   */

  /*
   * Construct an appropriate File URL from a bundle URL. Add the project to the
   * workspace.
   */
  public void addResourceToWorkspace() throws CoreException, IOException {
    URL resolved = FileLocator.toFileURL(path);
    IProjectDescription description = ResourcesPlugin.getWorkspace()
        .loadProjectDescription(new Path(resolved.getPath()));
    project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
    if (project.exists())
      throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, project.getName() + " already exists"));

    project.create(description, null);
    if (project.isOpen())
      throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, project.getName() + " already opened"));

    project.open(null);
  }

  /*
   * Remove a previously created project from the workspace
   */
  public void removeResourceFromWorkspace() throws CoreException {
    if (!project.isOpen())
      throw new CoreException(new Status(Status.ERROR, PLUGIN_ID, project.getName() + " already opened"));

    project.close(null);
    project.delete(/* deleteContent */false, /* force */true, null);
  }
}
