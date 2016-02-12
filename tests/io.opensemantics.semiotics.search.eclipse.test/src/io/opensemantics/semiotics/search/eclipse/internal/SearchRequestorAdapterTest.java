package io.opensemantics.semiotics.search.eclipse.internal;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.search.SearchMatch;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import io.opensemantics.semiotics.search.SearchResult;
import io.opensemantics.semiotics.search.eclipse.EclipseFactory;
import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearch;

public class SearchRequestorAdapterTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void shouldAcceptAndAdapt() throws Exception {
    final String description = "This is a description";
    EclipseJavaSearch search = EclipseFactory.eINSTANCE.createEclipseJavaSearch();
    search.setDescription(description);
    List<SearchResult> results = new ArrayList<>();
    IJavaElement javaElement = Mockito.mock(IJavaElement.class);
    SearchMatch match = new SearchMatch(javaElement, SearchMatch.A_ACCURATE, 5, 10, null, null);

    SearchRequestorAdapter adapter = new SearchRequestorAdapter(search, results);
    adapter.acceptSearchMatch(match);

    assertTrue(results.size() == 1);
    SearchResult result = results.get(0);
    assertTrue(result.getDescription().equals(description));
    assertTrue(result.getSearch().equals(search));
  }

}
