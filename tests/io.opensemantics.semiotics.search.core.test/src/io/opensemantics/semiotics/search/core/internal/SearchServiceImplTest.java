package io.opensemantics.semiotics.search.core.internal;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import io.opensemantics.semiotics.search.spi.SearchService;

public class SearchServiceImplTest {

  private SearchService service;

  @Test
  public void shouldReferenceSearchService() {
    final BundleContext ctx = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    final ServiceReference<SearchService> svcRef = ctx.getServiceReference(SearchService.class);
    assertNotNull("No service reference", svcRef);
    service = ctx.getService(svcRef);
    assertNotNull("SearchService is null", service);
    assertTrue(service instanceof SearchServiceImpl);
  }
}
