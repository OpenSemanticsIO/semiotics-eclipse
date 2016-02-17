/**
 * 
 */
package io.opensemantics.semiotics.search.ui;

import java.util.List;

import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.ISearchResult;
import org.eclipse.search.ui.ISearchResultListener;

import io.opensemantics.semiotics.search.SearchFactory;
import io.opensemantics.semiotics.search.SearchResult;
import io.opensemantics.semiotics.search.SearchResults;

/**
 * @author jonpasski
 *
 */
public class ModelSearchResult implements ISearchResult {

  private final ISearchQuery query;
  // package private
  final ListenerList listeners;
  private final SearchResults searchResults;
  private final SearchResultContentAdapter contentAdapter;

  /**
   * 
   */
  public ModelSearchResult(ISearchQuery query) {
    this.query = query;
    listeners = new ListenerList();
    searchResults = SearchFactory.eINSTANCE.createSearchResults();
    contentAdapter = new SearchResultContentAdapter(this);
    searchResults.eAdapters().add(contentAdapter);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.search.ui.ISearchResult#addListener(org.eclipse.search.ui.
   * ISearchResultListener)
   */
  @Override
  public void addListener(ISearchResultListener listener) {
    listeners.add(listener);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.search.ui.ISearchResult#getImageDescriptor()
   */
  @Override
  public ImageDescriptor getImageDescriptor() {
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.search.ui.ISearchResult#getLabel()
   */
  @Override
  public String getLabel() {
    // TODO Auto-generated method stub
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.search.ui.ISearchResult#getQuery()
   */
  @Override
  public ISearchQuery getQuery() {
    return query;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.search.ui.ISearchResult#getTooltip()
   */
  @Override
  public String getTooltip() {
    return "Found results in the workspace";
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.eclipse.search.ui.ISearchResult#removeListener(org.eclipse.search.ui.
   * ISearchResultListener)
   */
  @Override
  public void removeListener(ISearchResultListener listener) {
    listeners.remove(listener);
  }

  public void addResults(List<SearchResult> searchResults) {
    // Notification occurs via the EContentAdapter added to
    // the SearchResults object.
    this.searchResults.getSearchResults().addAll(searchResults);
  }

}
