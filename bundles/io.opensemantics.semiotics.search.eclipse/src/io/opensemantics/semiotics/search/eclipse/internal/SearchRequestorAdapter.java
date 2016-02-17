package io.opensemantics.semiotics.search.eclipse.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchRequestor;

import io.opensemantics.semiotics.search.eclipse.EclipseFactory;
import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearch;
import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearchResult;

public class SearchRequestorAdapter extends SearchRequestor {

  private final EclipseJavaSearchResult result;

  public SearchRequestorAdapter(EclipseJavaSearch search) {
    super();
    result = EclipseFactory.eINSTANCE.createEclipseJavaSearchResult();
    result.setSearch(search);
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
