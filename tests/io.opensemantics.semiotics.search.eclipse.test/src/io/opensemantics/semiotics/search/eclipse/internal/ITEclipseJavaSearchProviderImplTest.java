package io.opensemantics.semiotics.search.eclipse.internal;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.opensemantics.semiotics.search.SearchLanguageType;
import io.opensemantics.semiotics.search.eclipse.EclipseFactory;
import io.opensemantics.semiotics.search.eclipse.EclipseJavaSearch;
import io.opensemantics.semiotics.search.eclipse.LimitTo;
import io.opensemantics.semiotics.search.eclipse.SearchForNature;
import io.opensemantics.semiotics.search.eclipse.test.util.ProjectImporter;

public class ITEclipseJavaSearchProviderImplTest {

  private ProjectImporter projectBuilder;
  private final String PROJECT = "io.opensemantics.semiotics.search.eclipse.itest";

  @Before
  public void setUp() throws Exception {
    projectBuilder = new ProjectImporter(getClass().getResource("/resources/" + PROJECT + "/.project"));
    projectBuilder.addResourceToWorkspace();
  }

  @After
  public void tearDown() throws Exception {
    projectBuilder.removeResourceFromWorkspace();
  }

  @Test
  public void shouldSearch() {
    EclipseJavaSearch javaSearch = EclipseFactory.eINSTANCE.createEclipseJavaSearch();
    javaSearch.setDescription("io.opensemantics.semiotics.search.eclipse.itest.Callee.called()");
    javaSearch.setLanguage(SearchLanguageType.JAVA);
    javaSearch.setSearchFor(SearchForNature.METHOD);
    javaSearch.setLimitTo(LimitTo.REFERENCES);

    EclipseJavaSearchProviderImpl searchImpl = new EclipseJavaSearchProviderImpl();
    searchImpl.search(javaSearch);
    assertTrue(!javaSearch.getResult().getMatches().isEmpty());
    assertTrue(javaSearch.getResult().getDescription().equals(javaSearch.getDescription()));
  }

}
