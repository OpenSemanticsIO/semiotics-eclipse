/**
 * 
 */
package io.opensemantics.semiotics.search.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.ISearchResult;

import io.opensemantics.semiotics.search.Search;
import io.opensemantics.semiotics.search.spi.SearchService;

/**
 * @author jonpasski
 *
 */
public class ModelSearchQuery implements ISearchQuery {

  private final Search search;
  private final ModelSearchResult searchResult;

  /**
   * 
   */
  public ModelSearchQuery(Search search) {
    this.search = search;
    this.searchResult = new ModelSearchResult(this);

  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.search.ui.ISearchQuery#canRerun()
   */
  @Override
  public boolean canRerun() {
    return true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.search.ui.ISearchQuery#canRunInBackground()
   */
  @Override
  public boolean canRunInBackground() {
    // TODO Auto-generated method stub
    return false;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.search.ui.ISearchQuery#getLabel()
   */
  @Override
  public String getLabel() {
    // TODO Auto-generated method stub
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.search.ui.ISearchQuery#getSearchResult()
   */
  @Override
  public ISearchResult getSearchResult() {
    // TODO Auto-generated method stub
    return null;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.search.ui.ISearchQuery#run(org.eclipse.core.runtime.
   * IProgressMonitor)
   */
  @Override
  public IStatus run(IProgressMonitor monitor) throws OperationCanceledException {
    IStatus result;
    SearchService searchService = Activator.getSearchService();
    if (searchService != null) {
      searchService.search(search);
      result = Status.OK_STATUS;
    } else {
      result = new Status(Status.WARNING, Activator.PLUGIN_ID, "SearchService not initialized");
    }
    return result;
  }

}
