package io.opensemantics.semiotics.search.eclipse.internal;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchRequestor;

import io.opensemantics.semiotics.search.SearchResult;
import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearch;

public class SearchRequestorAdapter extends SearchRequestor {

  private final List<SearchResult> results;
  private final EclipseJavaSearch search;

  public SearchRequestorAdapter(EclipseJavaSearch search, List<SearchResult> results) {
    super();
    this.search = search;
    this.results = results;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.jdt.core.search.SearchRequestor#beginReporting()
   */
  @Override
  public void beginReporting() {
    // TODO Auto-generated method stub
    super.beginReporting();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.jdt.core.search.SearchRequestor#endReporting()
   */
  @Override
  public void endReporting() {
    // TODO Auto-generated method stub
    super.endReporting();
  }

  /*
   * Create a SearchResult based upon a SearchMatch
   * 
   * @see
   * org.eclipse.jdt.core.search.SearchRequestor#acceptSearchMatch(org.eclipse.
   * jdt.core.search.SearchMatch)
   */
  @Override
  public void acceptSearchMatch(SearchMatch match) throws CoreException {
    SearchResult result = SearchMatchAdapter.toSearchResult(match);
    result.setDescription(search.getDescription());
    result.setSearch(search);
    results.add(result);
  }

}
