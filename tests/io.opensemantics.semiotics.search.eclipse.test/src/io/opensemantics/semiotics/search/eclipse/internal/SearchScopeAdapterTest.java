package io.opensemantics.semiotics.search.eclipse.internal;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.opensemantics.semiotics.search.SearchResult;
import io.opensemantics.semiotics.search.eclipse.test.util.ProjectImporter;

public class SearchScopeAdapterTest extends SearchScopeAdapter {

  private ProjectImporter projectBuilder;
  private final String PROJECT = "io.opensemantics.semiotics.search.eclipse.itest";

  @Before
  public void setUp() throws Exception {
    // When creating a workspace search scope in a JUnit test,
    // the workspace used is a JUnit-specific sub-directory
    // located under the main workspace, which is initially empty.
    projectBuilder = new ProjectImporter(getClass().getResource("/resources/" + PROJECT + "/.project"));
    projectBuilder.addResourceToWorkspace();
  }

  @After
  public void tearDown() throws Exception {
    projectBuilder.removeResourceFromWorkspace();
  }

  @Test
  public void testWorkspaceScope() {
    List<SearchResult> prior = new ArrayList<>();
    IJavaSearchScope scope = SearchScopeAdapter.toSearchScope(prior);
    boolean found = false;
    for (IPath path : scope.enclosingProjectsAndJars()) {
      if (path.lastSegment().equals(PROJECT)) {
        found = true;
        break;
      }
    }
    assertTrue(found);
  }

}
