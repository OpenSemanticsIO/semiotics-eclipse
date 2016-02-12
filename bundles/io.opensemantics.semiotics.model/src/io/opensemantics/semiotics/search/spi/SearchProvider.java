package io.opensemantics.semiotics.search.spi;

import java.util.List;

import io.opensemantics.semiotics.search.Search;
import io.opensemantics.semiotics.search.SearchResult;

public interface SearchProvider {

  /**
   * 
   * @param search
   *          The item to be searched
   * @param previous
   *          Previous search results or null
   * @return A list of search results or null
   */
  List<SearchResult> search(Search search, List<SearchResult> previous);

  /**
   * 
   * @param search
   *          A search
   * @return true if the provided search is supported by this provider
   */
  boolean supports(Search search);
}
