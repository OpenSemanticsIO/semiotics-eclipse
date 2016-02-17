package io.opensemantics.semiotics.search.eclipse.internal;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.search.SearchMatch;

import io.opensemantics.semiotics.search.eclipse.EclipseFactory;
import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearchMatch;

public class SearchMatchAdapter {

  public SearchMatchAdapter() {
    // TODO Auto-generated constructor stub
  }

  public static io.opensemantics.semiotics.search.SearchMatch toSearchMatch(SearchMatch match) {
    final EclipseJavaSearchMatch modelSearchMatch = EclipseFactory.eINSTANCE.createEclipseJavaSearchMatch();
    final Object element = match.getElement();
    if ((element != null) && (element instanceof IJavaElement)) {
      IJavaElement javaElement = (IJavaElement) element;
      modelSearchMatch.setElement(javaElement);
    }
    modelSearchMatch.setLength(match.getLength());
    modelSearchMatch.setOffset(match.getOffset());

    final boolean accuracy;
    switch (match.getAccuracy()) {
    case SearchMatch.A_ACCURATE:
      accuracy = true;
      break;
    case SearchMatch.A_INACCURATE:
      accuracy = false;
      break;
    default:
      throw new RuntimeException("SearchMatch accuracy is unknown value: " + match.getAccuracy());
    }
    modelSearchMatch.setAccurate(accuracy);

    return modelSearchMatch;
  }
}
