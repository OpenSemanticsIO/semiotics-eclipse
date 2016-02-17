package io.opensemantics.semiotics.search.spi;

import io.opensemantics.semiotics.search.Search;

public interface SearchService {
  /**
   * 
   * @param search
   *          The search graph
   */
  void search(Search search);
}
