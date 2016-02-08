package io.opensemantics.semiotics.search.core.internal.eclipse;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import io.opensemantics.semiotics.search.spi.JavaSearchService;

public class EclipseJavaSearchServiceImplTest {

  private JavaSearchService javaService;

  @Before
  public void setUp() throws Exception {
    // Test the service
    final BundleContext ctx = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    final ServiceReference<JavaSearchService> svcRef = ctx.getServiceReference(JavaSearchService.class);
    assertNotNull("No service reference", svcRef);
    javaService = ctx.getService(svcRef);
    assertNotNull("JavaSearchService is null", javaService);
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testPatternSearch() {
    // Create workspace and project

  }

}
