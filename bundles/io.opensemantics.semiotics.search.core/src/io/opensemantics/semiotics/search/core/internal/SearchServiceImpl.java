/**
 * 
 */
package io.opensemantics.semiotics.search.core.internal;

import java.util.List;

import io.opensemantics.semiotics.search.JavaSearch;
import io.opensemantics.semiotics.search.Search;
import io.opensemantics.semiotics.search.SearchResult;
import io.opensemantics.semiotics.search.spi.JavaSearchService;
import io.opensemantics.semiotics.search.spi.SearchService;

/**
 * @author jonpasski
 *
 */
public class SearchServiceImpl implements SearchService {

  private JavaSearchService javaService;

  /**
   * 
   */
  public SearchServiceImpl() {
    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * io.opensemantics.semiotics.search.spi.SearchService#search(io.opensemantics
   * .semiotics.search.Search, io.opensemantics.semiotics.search.SearchResult[])
   */
  @Override
  public List<SearchResult> search(Search search, List<SearchResult> prior) {
    // TODO : rework to not be type dependent
    if (search instanceof JavaSearch) {
      return javaService.search((JavaSearch) search, prior);
    }
    return null;
  }

  public void bindJavaService(JavaSearchService service) {
    this.javaService = service;
  }
}
