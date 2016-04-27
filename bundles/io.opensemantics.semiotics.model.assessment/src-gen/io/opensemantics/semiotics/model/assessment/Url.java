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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Url</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Url#getPattern <em>Pattern</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Url#getPatternType <em>Pattern Type</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getUrl()
 * @model
 * @generated
 */
public interface Url extends EObject {
	/**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getUrl_Pattern()
   * @model
   * @generated
   */
	String getPattern();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Url#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
	void setPattern(String value);

	/**
   * Returns the value of the '<em><b>Pattern Type</b></em>' attribute.
   * The literals are from the enumeration {@link io.opensemantics.semiotics.model.assessment.UrlPattern}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern Type</em>' attribute.
   * @see io.opensemantics.semiotics.model.assessment.UrlPattern
   * @see #setPatternType(UrlPattern)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getUrl_PatternType()
   * @model
   * @generated
   */
	UrlPattern getPatternType();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Url#getPatternType <em>Pattern Type</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern Type</em>' attribute.
   * @see io.opensemantics.semiotics.model.assessment.UrlPattern
   * @see #getPatternType()
   * @generated
   */
	void setPatternType(UrlPattern value);

} // Url
