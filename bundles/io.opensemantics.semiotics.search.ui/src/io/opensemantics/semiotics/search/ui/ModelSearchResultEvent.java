/**
 * 
 */
package io.opensemantics.semiotics.search.ui;

import org.eclipse.search.ui.ISearchResult;
import org.eclipse.search.ui.SearchResultEvent;

/**
 * @author jonpasski
 *
 */
public class ModelSearchResultEvent extends SearchResultEvent {

  /**
   * 
   */
  private static final long serialVersionUID = 748745231590665400L;

  /**
   * @param searchResult
   */
  public ModelSearchResultEvent(ISearchResult searchResult) {
    super(searchResult);
  }

}
