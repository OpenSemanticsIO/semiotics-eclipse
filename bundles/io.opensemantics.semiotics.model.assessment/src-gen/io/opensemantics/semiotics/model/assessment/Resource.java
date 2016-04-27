/**
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
 */
package io.opensemantics.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Resource#getResources <em>Resources</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Resource#getSnippets <em>Snippets</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends Label, Notes, Contents {
	/**
   * Returns the value of the '<em><b>Resources</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Resources#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' container reference.
   * @see #setResources(Resources)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getResource_Resources()
   * @see io.opensemantics.semiotics.model.assessment.Resources#getResources
   * @model opposite="resources" transient="false"
   * @generated
   */
	Resources getResources();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Resource#getResources <em>Resources</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resources</em>' container reference.
   * @see #getResources()
   * @generated
   */
	void setResources(Resources value);

	/**
   * Returns the value of the '<em><b>Snippets</b></em>' reference list.
   * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Snippet}.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Snippet#getResource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snippets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Snippets</em>' reference list.
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getResource_Snippets()
   * @see io.opensemantics.semiotics.model.assessment.Snippet#getResource
   * @model opposite="resource"
   * @generated
   */
	EList<Snippet> getSnippets();

} // Resource
