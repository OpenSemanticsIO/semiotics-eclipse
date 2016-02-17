package io.opensemantics.semiotics.search.spi;

import io.opensemantics.semiotics.search.Search;
import io.opensemantics.semiotics.search.SearchResult;

public interface SearchService {
  /**
   * 
   * @param search
   *          The search graph
   * @param result
   *          Reference to a result that is updated with search matches
   */
  void search(Search search, SearchResult result);
}
