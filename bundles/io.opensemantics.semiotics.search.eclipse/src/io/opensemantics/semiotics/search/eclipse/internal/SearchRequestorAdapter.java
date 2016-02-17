package io.opensemantics.semiotics.search.eclipse.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchRequestor;

import io.opensemantics.semiotics.search.SearchResult;
import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearch;

public class SearchRequestorAdapter extends SearchRequestor {

  private final SearchResult result;
  private final EclipseJavaSearch search;

  public SearchRequestorAdapter(EclipseJavaSearch search, SearchResult result) {
    super();
    result.setSearch(search);
    this.search = search;
    this.result = result;
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
   * Update matches based upon a match
   * 
   * @see
   * org.eclipse.jdt.core.search.SearchRequestor#acceptSearchMatch(org.eclipse.
   * jdt.core.search.SearchMatch)
   */
  @Override
  public void acceptSearchMatch(SearchMatch match) throws CoreException {
    io.opensemantics.semiotics.search.SearchMatch otherMatch = SearchMatchAdapter.toSearchMatch(match);
    result.getMatches().add(otherMatch);
  }

}
