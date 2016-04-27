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
 * A representation of the model object '<em><b>Applications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Applications#getApplications <em>Applications</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Applications#getAssessment <em>Assessment</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplications()
 * @model
 * @generated
 */
public interface Applications extends EObject {
	/**
   * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
   * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Application}.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Application#getApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Applications</em>' containment reference list.
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplications_Applications()
   * @see io.opensemantics.semiotics.model.assessment.Application#getApplications
   * @model opposite="applications" containment="true"
   * @generated
   */
	EList<Application> getApplications();

	/**
   * Returns the value of the '<em><b>Assessment</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Assessment#getApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Assessment</em>' container reference.
   * @see #setAssessment(Assessment)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplications_Assessment()
   * @see io.opensemantics.semiotics.model.assessment.Assessment#getApplications
   * @model opposite="applications" transient="false"
   * @generated
   */
	Assessment getAssessment();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Applications#getAssessment <em>Assessment</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assessment</em>' container reference.
   * @see #getAssessment()
   * @generated
   */
	void setAssessment(Assessment value);

} // Applications
