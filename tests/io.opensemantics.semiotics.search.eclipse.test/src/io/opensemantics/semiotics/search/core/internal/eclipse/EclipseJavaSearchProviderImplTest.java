package io.opensemantics.semiotics.search.core.internal.eclipse;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import io.opensemantics.semiotics.search.eclipse.internal.EclipseJavaSearchProviderImpl;
import io.opensemantics.semiotics.search.spi.SearchProvider;

public class EclipseJavaSearchProviderImplTest {

  private SearchProvider provider;

  @Before
  public void setUp() throws Exception {
    // Test the service
    final BundleContext ctx = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    final ServiceReference<SearchProvider> svcRef = ctx.getServiceReference(SearchProvider.class);
    assertNotNull("No service reference", svcRef);
    provider = ctx.getService(svcRef);
    assertNotNull("SearchProvider is null", provider);
    assertTrue(provider instanceof EclipseJavaSearchProviderImpl);
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testPatternSearch() {
    // Create workspace and project

  }

}
