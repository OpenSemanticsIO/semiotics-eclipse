package io.opensemantics.semiotics.ui.handler;

import java.util.Iterator;

import javax.inject.Inject;

import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;

import io.opensemantics.semiotics.search.Application;
import io.opensemantics.semiotics.ui.Activator;

public class AddSelectionsToApplicationAsSinks {

  public AddSelectionsToApplicationAsSinks() {
  }

  @Inject
  ESelectionService selectionService;

  @Execute
  public void execute(Shell shell, MMenuElement menu) {
    final Object selected = selectionService.getSelection();
    if ((selected == null) || (menu == null) || !(selected instanceof IStructuredSelection))
      return;

    for (Application app : Activator.getApplicationProvider().getApplications()) {
      if (app.getName().equals(menu.getLabel())) {
        Activator.getDefault().getLog().log(
            new Status(Status.INFO, Activator.PLUGIN_ID, String.format("Selected application: %s", app.getName())));
      }
    }

    @SuppressWarnings("rawtypes")
    final Iterator selectionIterator = ((IStructuredSelection) selected).iterator();

    while (selectionIterator.hasNext()) {
      Object selection = selectionIterator.next();
      // Right-clicking onto an empty search result yields a null first
      // element
      if (selection == null)
        continue;

      Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID,
          String.format("selected class: %s\nselected: %s", selection.getClass().getName(), selection)));
    }
  }
}
