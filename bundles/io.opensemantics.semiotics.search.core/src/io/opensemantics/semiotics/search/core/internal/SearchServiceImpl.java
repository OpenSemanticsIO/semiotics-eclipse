/**
 * 
 */
package io.opensemantics.semiotics.search.core.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import io.opensemantics.semiotics.search.Search;
import io.opensemantics.semiotics.search.SearchResult;
import io.opensemantics.semiotics.search.spi.SearchProvider;
import io.opensemantics.semiotics.search.spi.SearchService;

/**
 * @author jonpasski
 *
 */
public class SearchServiceImpl implements SearchService {

  private CopyOnWriteArrayList<SearchProvider> providers;

  public SearchServiceImpl() {
    providers = new CopyOnWriteArrayList<>();
  }

  @Override
  public List<SearchResult> search(Search search, List<SearchResult> previous) {
    List<SearchResult> results = new ArrayList<>(previous);
    for (SearchProvider provider : providers) {
      if (provider.supports(search)) {
        List<SearchResult> tempResults = provider.search(search, results);
        if (tempResults != null) {
          results.addAll(tempResults);
        }
      }
    }
    return results;
  }

  protected void bindProvider(SearchProvider provider) {
    this.providers.add(provider);
  }

  protected void unbindProvider(SearchProvider provider) {
    this.providers.remove(provider);
  }
}
