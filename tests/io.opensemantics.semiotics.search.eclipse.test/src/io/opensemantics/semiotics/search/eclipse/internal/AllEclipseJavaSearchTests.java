package io.opensemantics.semiotics.search.eclipse.internal;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ITEclipseJavaSearchProviderImplTest.class, SearchMatchAdapterTest.class, SearchPatternAdapterTest.class,
    SearchRequestorAdapterTest.class, SearchScopeAdapterTest.class })
public class AllEclipseJavaSearchTests {

}
