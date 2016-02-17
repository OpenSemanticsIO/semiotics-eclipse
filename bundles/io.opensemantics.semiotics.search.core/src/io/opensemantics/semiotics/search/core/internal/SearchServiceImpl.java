/**
 * 
 */
package io.opensemantics.semiotics.search.core.internal;

import java.util.concurrent.CopyOnWriteArrayList;

import io.opensemantics.semiotics.search.Search;
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
  public void search(Search search) {

    for (SearchProvider provider : providers) {
      if (provider.supports(search)) {
        provider.search(search);
      }
    }
  }

  protected void bindProvider(SearchProvider provider) {
    this.providers.add(provider);
  }

  protected void unbindProvider(SearchProvider provider) {
    this.providers.remove(provider);
  }
}
