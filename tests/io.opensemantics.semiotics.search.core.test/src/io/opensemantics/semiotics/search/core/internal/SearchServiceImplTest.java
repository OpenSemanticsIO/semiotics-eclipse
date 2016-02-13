package io.opensemantics.semiotics.search.core.internal;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import io.opensemantics.semiotics.search.Search;
import io.opensemantics.semiotics.search.SearchLanguageType;
import io.opensemantics.semiotics.search.SearchResult;
import io.opensemantics.semiotics.search.spi.SearchService;

public class SearchServiceImplTest {

  private SearchService service;

  @Before
  public void shouldReferenceSearchService() {
    final BundleContext ctx = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    final ServiceReference<SearchService> svcRef = ctx.getServiceReference(SearchService.class);
    assertNotNull("No service reference", svcRef);
    service = ctx.getService(svcRef);
    assertNotNull("SearchService is null", service);
    assertTrue(service instanceof SearchServiceImpl);
  }

  /*
   * Note: if this test is failing it could be because of timing issues between
   * OSGI and JUnit. Look into bndtools maybe?
   * 
   * @see
   * http://stackoverflow.com/questions/7161338/using-osgi-declarative-services-
   * in-the-context-of-a-junit-test
   */
  @Test
  public void shouldReferenceMockProvider() {
    Search search = Mockito.mock(Search.class);
    when(search.getLanguage()).thenReturn(SearchLanguageType.JAVA);
    when(search.getDescription()).thenReturn("MOCKED");

    SearchResult result = Mockito.mock(SearchResult.class);
    List<SearchResult> results = new ArrayList<>();
    results.add(result);

    List<SearchResult> newResults = service.search(search, results);
    assertTrue(newResults.contains(result));
  }

  @Test
  public void shouldSearchWithNullPrevious() {
    Search search = Mockito.mock(Search.class);
    when(search.getLanguage()).thenReturn(SearchLanguageType.JAVA);
    when(search.getDescription()).thenReturn("MOCKED");

    List<SearchResult> newResults = service.search(search, null);
    assertTrue(newResults.isEmpty());

  }
}
