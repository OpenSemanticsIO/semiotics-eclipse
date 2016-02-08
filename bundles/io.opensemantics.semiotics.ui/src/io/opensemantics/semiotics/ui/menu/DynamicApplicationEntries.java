package io.opensemantics.semiotics.ui.menu;

import java.util.List;

import org.eclipse.e4.ui.di.AboutToShow;
import org.eclipse.e4.ui.model.application.ui.menu.MDirectMenuItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

import io.opensemantics.semiotics.search.Application;
import io.opensemantics.semiotics.ui.Activator;

public class DynamicApplicationEntries {

  private final String contributionURI;

  public DynamicApplicationEntries() {
    StringBuffer buf = new StringBuffer("bundleclass://");
    buf.append(Activator.PLUGIN_ID);
    buf.append("/");
    buf.append(io.opensemantics.semiotics.ui.handler.AddSelectionsToApplicationAsSinks.class.getName());
    contributionURI = buf.toString();
  }

  @AboutToShow
  public void aboutToShow(List<MMenuElement> items, EModelService modelService) {
    for (Application application : Activator.getApplicationProvider().getApplications()) {
      MDirectMenuItem dynamicItem = modelService.createModelElement(MDirectMenuItem.class);
      dynamicItem.setLabel(application.getName());
      dynamicItem.setContributionURI(contributionURI);
      items.add(dynamicItem);
    }
  }

}
