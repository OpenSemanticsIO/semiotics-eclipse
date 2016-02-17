package io.opensemantics.semiotics.search.spi;

import io.opensemantics.semiotics.search.Search;

public interface SearchProvider {

  /**
   * 
   * @param search
   *          The search graph
   * @param previous
   *          A result whose matches are updated directly by the provider
   */
  void search(Search search);

  /**
   * 
   * @param search
   *          A search
   * @return true if the provided search is supported by this provider
   */
  boolean supports(Search search);
}
