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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controllers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Controllers#getApplication <em>Application</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Controllers#getControllers <em>Controllers</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getControllers()
 * @model
 * @generated
 */
public interface Controllers extends EObject {
	/**
   * Returns the value of the '<em><b>Application</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Application#getControllers <em>Controllers</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Application</em>' container reference.
   * @see #setApplication(Application)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getControllers_Application()
   * @see io.opensemantics.semiotics.model.assessment.Application#getControllers
   * @model opposite="controllers" transient="false"
   * @generated
   */
	Application getApplication();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Controllers#getApplication <em>Application</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Application</em>' container reference.
   * @see #getApplication()
   * @generated
   */
	void setApplication(Application value);

	/**
   * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
   * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Controller}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controllers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Controllers</em>' containment reference list.
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getControllers_Controllers()
   * @model containment="true"
   * @generated
   */
	EList<Controller> getControllers();

} // Controllers
