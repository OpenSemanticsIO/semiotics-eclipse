package io.opensemantics.semiotics.search.ui;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.search.ui.ISearchResultListener;
import org.eclipse.search.ui.SearchResultEvent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.opensemantics.semiotics.search.mock.MockFactory;
import io.opensemantics.semiotics.search.mock.MockSearch;
import io.opensemantics.semiotics.search.mock.MockSearchMatch;
import io.opensemantics.semiotics.search.mock.MockSearchResult;

public class SearchResultContentAdapterTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void shouldAdaptAndNotify() {
    MockSearch search = MockFactory.eINSTANCE.createMockSearch();

    ModelSearchQuery query = new ModelSearchQuery(search);
    final Map<String, Integer> results = new HashMap<>();
    results.put("count", 0);

    query.getSearchResult().addListener(new ISearchResultListener() {

      @Override
      public void searchResultChanged(SearchResultEvent event) {
        results.put("count", results.get("count") + 1);
      }
    });

    MockSearchMatch match = MockFactory.eINSTANCE.createMockSearchMatch();
    MockSearchResult result = MockFactory.eINSTANCE.createMockSearchResult();
    query.search.setResult(result);
    query.search.getResult().getMatches().add(match);
    assertTrue(results.get("count") == 1);
  }

}
