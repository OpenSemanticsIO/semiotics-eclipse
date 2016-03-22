package io.opensemantics.semiotics.model;

import java.util.HashSet;
import java.util.Set;

public class ECPFilterProvider implements org.eclipse.emf.ecp.core.util.ECPFilterProvider {

  // https://bugs.eclipse.org/bugs/show_bug.cgi?id=453329#c1
  // Caused by: org.xml.sax.SAXParseExceptionpublicId:
  // platform:/plugin/org.eclipse.emf.ecore.xcore.lib/model/XcoreLang.xcore;
  // systemId:
  // platform:/plugin/org.eclipse.emf.ecore.xcore.lib/model/XcoreLang.xcore;
  // lineNumber: 1; columnNumber: 1; Content is not allowed in prolog.
  @Override
  public Set<String> getHiddenPackages() {
    Set<String> results = new HashSet<>();
    results.add("xcore.lang");
    return results;
  }
}
