package io.opensemantics.semiotics.search.eclipse.internal;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.search.SearchMatch;

import io.opensemantics.semiotics.search.SearchResult;
import io.opensemantics.semiotics.search.eclipse.EclipseFactory;
import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearchResult;

public class SearchMatchAdapter {

  public SearchMatchAdapter() {
    // TODO Auto-generated constructor stub
  }

  public static SearchResult toSearchResult(SearchMatch match) {
    final EclipseJavaSearchResult result = EclipseFactory.eINSTANCE.createEclipseJavaSearchResult();
    final Object element = match.getElement();
    if ((element != null) && (element instanceof IJavaElement)) {
      IJavaElement javaElement = (IJavaElement) element;
      result.setElement(javaElement);
    }
    result.setLength(match.getLength());
    result.setOffset(match.getOffset());

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
    result.setAccurate(accuracy);

    return result;
  }
}
