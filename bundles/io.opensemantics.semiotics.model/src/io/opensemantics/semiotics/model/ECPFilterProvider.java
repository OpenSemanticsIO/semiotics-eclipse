/*******************************************************************************
 * Copyright 2016 OpenSemantics.IO
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
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
    //results.add("xcore.lang");
    return results;
  }
}
