/**
 * 
 */
package io.opensemantics.semiotics.search.test.mocks;

import java.util.List;

import io.opensemantics.semiotics.search.Search;
import io.opensemantics.semiotics.search.SearchLanguageType;
import io.opensemantics.semiotics.search.SearchResult;
import io.opensemantics.semiotics.search.spi.SearchProvider;

/**
 * @author jonpasski
 *
 */
public class MockSearchProvider implements SearchProvider {

  /**
   * 
   */
  public MockSearchProvider() {
  }

  /*
   * (non-Javadoc)
   * 
   * @see io.opensemantics.semiotics.search.spi.SearchProvider#search(io.
   * opensemantics.semiotics.search.Search, java.util.List)
   */
  @Override
  public List<SearchResult> search(Search search, List<SearchResult> previous) {
    return previous;
  }

  /*
   * (non-Javadoc)
   * 
   * @see io.opensemantics.semiotics.search.spi.SearchProvider#supports(io.
   * opensemantics.semiotics.search.Search)
   */
  @Override
  public boolean supports(Search search) {
    return (search.getLanguage().equals(SearchLanguageType.JAVA) && search.getDescription().equals("MOCKED"));
  }

}
