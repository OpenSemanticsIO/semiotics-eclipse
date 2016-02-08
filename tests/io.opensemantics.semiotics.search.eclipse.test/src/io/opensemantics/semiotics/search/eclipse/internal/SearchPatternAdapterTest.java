package io.opensemantics.semiotics.search.eclipse.internal;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.SearchPattern;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.opensemantics.semiotics.search.eclipse.EclipseFactory;
import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearch;
import io.opensemantics.semiotics.search.eclipse.LimitTo;
import io.opensemantics.semiotics.search.eclipse.LimitToFineGrain;
import io.opensemantics.semiotics.search.eclipse.MatchFlag;
import io.opensemantics.semiotics.search.eclipse.MatchRule;
import io.opensemantics.semiotics.search.eclipse.SearchForNature;

public class SearchPatternAdapterTest {

  final String pattern = "foo.bar";
  final int searchFor = IJavaSearchConstants.TYPE;
  final int limitTo = IJavaSearchConstants.REFERENCES | IJavaSearchConstants.RETURN_TYPE_REFERENCE;
  final int matchRule = SearchPattern.R_PATTERN_MATCH | SearchPattern.R_EQUIVALENT_MATCH;

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testSearchPatternEquivalence() {
    final SearchPattern patternA = SearchPattern.createPattern(pattern, searchFor, limitTo, matchRule);
    final SearchPattern patternB = SearchPattern.createPattern(pattern, searchFor, limitTo, matchRule);
    // There doesn't seem to be a way to compare to SearchPatterns
    // for equivalence fully. There is getMatchRule(). Examining the toString()
    // implementation shows this could work. But the test is extremely brittle
    assertTrue(patternA.toString().equals(patternB.toString()));
  }

  @Test
  /*
   * @see testSearchPatternEquivalence()
   */
  public void testSearchPatterns() {
    final SearchPattern patternA = SearchPattern.createPattern(pattern, searchFor, limitTo, matchRule);
    final EclipseJavaSearch eclipseSearch = EclipseFactory.eINSTANCE.createEclipseJavaSearch();
    eclipseSearch.setPattern(pattern);
    eclipseSearch.setSearchFor(SearchForNature.TYPE);
    eclipseSearch.setLimitTo(LimitTo.REFERENCES);
    eclipseSearch.setMatchRule(MatchRule.PATTERN);
    eclipseSearch.setMatchFlag(MatchFlag.EQUIVALENT);
    EList<LimitToFineGrain> fineGrain = eclipseSearch.getLimitToFineGrains();
    fineGrain.add(LimitToFineGrain.RETURN_TYPE_REFERENCE);
    final SearchPattern patternB = SearchPatternAdapter.toPattern(eclipseSearch);
    assertTrue(patternA.toString().equals(patternB.toString()));
  }
}
