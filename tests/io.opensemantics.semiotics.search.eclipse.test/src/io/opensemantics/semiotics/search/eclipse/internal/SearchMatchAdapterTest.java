package io.opensemantics.semiotics.search.eclipse.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.search.SearchMatch;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearchMatch;

public class SearchMatchAdapterTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void shouldAdapt() {
    final int length = 10;
    final int offset = 5;
    IJavaElement javaElement = Mockito.mock(IJavaElement.class);
    SearchMatch match = new SearchMatch(javaElement, SearchMatch.A_ACCURATE, offset, length, null, null);
    io.opensemantics.semiotics.search.SearchMatch adapted = SearchMatchAdapter.toSearchMatch(match);
    assertTrue(adapted instanceof EclipseJavaSearchMatch);
    EclipseJavaSearchMatch eclipseMatch = (EclipseJavaSearchMatch) adapted;
    assertEquals(eclipseMatch.getLength(), length);
    assertEquals(eclipseMatch.getOffset(), offset);
    assertTrue(eclipseMatch.isAccurate());
    assertEquals(eclipseMatch.getElement(), javaElement);
  }

}
