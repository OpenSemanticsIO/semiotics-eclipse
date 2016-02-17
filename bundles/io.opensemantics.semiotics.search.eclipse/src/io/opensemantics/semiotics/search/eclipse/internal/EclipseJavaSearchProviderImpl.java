/**
 * 
 */
package io.opensemantics.semiotics.search.eclipse.internal;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;

import io.opensemantics.semiotics.search.Search;
import io.opensemantics.semiotics.search.SearchLanguageType;
import io.opensemantics.semiotics.search.SearchResult;
import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearch;
import io.opensemantics.semiotics.search.spi.SearchProvider;

/**
 * @author jonpasski
 *
 */
// TODO : move to Eclipse-specific classes to separate impls from this bundle
public class EclipseJavaSearchProviderImpl implements SearchProvider {

  /**
   * 
   */
  public EclipseJavaSearchProviderImpl() {
    // TODO Auto-generated constructor stub
  }

  /*
   * (non-Javadoc)
   * 
   * @see io.opensemantics.semiotics.search.spi.JavaSearchService#search(io.
   * opensemantics.semiotics.search.JavaSearch,
   * io.opensemantics.semiotics.search.SearchResult[])
   */
  @Override
  public void search(Search search, SearchResult result) {
    if (supports(search)) {
      EclipseJavaSearch eclipseSearch = (EclipseJavaSearch) search;
      SearchPattern pattern = SearchPatternAdapter.toPattern(eclipseSearch);
      IJavaSearchScope scope = SearchScopeAdapter.toSearchScope(result);
      SearchRequestor requestor = new SearchRequestorAdapter(eclipseSearch, result);
      SearchEngine engine = new SearchEngine();
      try {
        engine.search(pattern, new SearchParticipant[] { SearchEngine.getDefaultSearchParticipant() }, scope, requestor,
            null);
      } catch (CoreException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }

  @Override
  public boolean supports(Search search) {
    return (search.getLanguage().equals(SearchLanguageType.JAVA) && search instanceof EclipseJavaSearch);
  }

}
