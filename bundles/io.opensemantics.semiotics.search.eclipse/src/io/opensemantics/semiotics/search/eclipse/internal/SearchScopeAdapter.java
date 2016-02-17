package io.opensemantics.semiotics.search.eclipse.internal;

import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;

import io.opensemantics.semiotics.search.SearchResult;

public class SearchScopeAdapter {

  public SearchScopeAdapter() {
    // TODO Auto-generated constructor stub
  }

  public static IJavaSearchScope toSearchScope(SearchResult result) {
    return SearchEngine.createWorkspaceScope();
  }
}
