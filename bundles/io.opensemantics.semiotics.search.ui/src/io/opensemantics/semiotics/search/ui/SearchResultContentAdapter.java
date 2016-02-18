/**
 * 
 */
package io.opensemantics.semiotics.search.ui;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.search.ui.ISearchResultListener;
import org.eclipse.search.ui.SearchResultEvent;

import io.opensemantics.semiotics.search.SearchPackage;
import io.opensemantics.semiotics.search.SearchResult;

/**
 * @author jonpasski
 *
 */
public class SearchResultContentAdapter extends EContentAdapter {

  private ModelSearchResult searchResult;

  /**
   * 
   */
  public SearchResultContentAdapter(ModelSearchResult searchResult) {
    super();
    this.searchResult = searchResult;
  }

  /*
   * (non-Javadoc) This adapter is concerned with matches added to some
   * SearchResult
   * 
   * @see
   * org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.
   * common.notify.Notification)
   */
  @Override
  public void notifyChanged(Notification notification) {
    super.notifyChanged(notification);

    if (notification.isTouch())
      return;

    switch (notification.getFeatureID(SearchResult.class)) {
    // TODO fix
    case SearchPackage.SEARCH_RESULT__MATCHES:

      final SearchResultEvent event;
      switch (notification.getEventType()) {
      case Notification.ADD:
      case Notification.ADD_MANY:
      case Notification.REMOVE:
      case Notification.REMOVE_MANY:
      case Notification.MOVE:
      default:
        event = new ModelSearchResultEvent(searchResult);
        for (Object listener : searchResult.listeners.getListeners()) {
          ((ISearchResultListener) listener).searchResultChanged(event);
        }
      }
      break;

    default:
      // TODO
      break;
    }
  }
}
