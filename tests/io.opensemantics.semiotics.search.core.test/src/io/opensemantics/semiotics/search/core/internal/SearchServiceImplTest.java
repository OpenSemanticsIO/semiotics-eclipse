package io.opensemantics.semiotics.search.core.internal;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import io.opensemantics.semiotics.search.spi.SearchService;

public class SearchServiceImplTest {

  private SearchService service;

  @Before
  public void setUp() throws Exception {
    // Test the service
    final BundleContext ctx = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    final ServiceReference<SearchService> svcRef = ctx.getServiceReference(SearchService.class);
    assertNotNull("No service reference", svcRef);
    service = ctx.getService(svcRef);
    assertNotNull("SearchService is null", service);
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testJavaSearch() {
    // SearchResult[] results = service.search(search, null);
  }

}
