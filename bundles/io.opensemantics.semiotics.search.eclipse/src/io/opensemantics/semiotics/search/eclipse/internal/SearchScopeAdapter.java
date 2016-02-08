package io.opensemantics.semiotics.search.eclipse.internal;

import java.util.List;

import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;

import io.opensemantics.semiotics.search.SearchResult;

public class SearchScopeAdapter {

  public SearchScopeAdapter() {
    // TODO Auto-generated constructor stub
  }

  public static IJavaSearchScope toSearchScope(List<SearchResult> prior) {
    if ((prior == null) || (prior.isEmpty()))
      return SearchEngine.createWorkspaceScope();

    throw new UnsupportedOperationException("Not implemented yet");
  }
}
