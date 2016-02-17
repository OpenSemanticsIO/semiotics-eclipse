package io.opensemantics.semiotics.search.eclipse.internal;

import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;

import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearch;

public class SearchScopeAdapter {

  public SearchScopeAdapter() {
    // TODO Auto-generated constructor stub
  }

  public static IJavaSearchScope toSearchScope(EclipseJavaSearch search) {
    return SearchEngine.createWorkspaceScope();
  }
}
