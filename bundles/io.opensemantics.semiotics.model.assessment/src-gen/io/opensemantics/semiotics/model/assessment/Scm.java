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
 * A representation of the model object '<em><b>Scm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Scm#getRepository <em>Repository</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Scm#getBranchTag <em>Branch Tag</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Scm#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getScm()
 * @model
 * @generated
 */
public interface Scm extends EObject {
	/**
   * Returns the value of the '<em><b>Repository</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Repository</em>' attribute.
   * @see #setRepository(String)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getScm_Repository()
   * @model
   * @generated
   */
	String getRepository();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Scm#getRepository <em>Repository</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repository</em>' attribute.
   * @see #getRepository()
   * @generated
   */
	void setRepository(String value);

	/**
   * Returns the value of the '<em><b>Branch Tag</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Branch Tag</em>' attribute.
   * @see #setBranchTag(String)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getScm_BranchTag()
   * @model
   * @generated
   */
	String getBranchTag();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Scm#getBranchTag <em>Branch Tag</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Branch Tag</em>' attribute.
   * @see #getBranchTag()
   * @generated
   */
	void setBranchTag(String value);

	/**
   * Returns the value of the '<em><b>Application</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Application#getScm <em>Scm</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Application</em>' container reference.
   * @see #setApplication(Application)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getScm_Application()
   * @see io.opensemantics.semiotics.model.assessment.Application#getScm
   * @model opposite="scm" transient="false"
   * @generated
   */
	Application getApplication();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Scm#getApplication <em>Application</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application</em>' container reference.
   * @see #getApplication()
   * @generated
   */
	void setApplication(Application value);

} // Scm
