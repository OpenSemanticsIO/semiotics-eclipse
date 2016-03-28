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
 * A representation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Assessment#getApplications <em>Applications</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Assessment#getFindings <em>Findings</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Assessment#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getAssessment()
 * @model
 * @generated
 */
public interface Assessment extends EObject {
	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Application}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Application#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getAssessment_Applications()
	 * @see io.opensemantics.semiotics.model.assessment.Application#getAssessment
	 * @model opposite="assessment" containment="true"
	 * @generated
	 */
	EList<Application> getApplications();

	/**
	 * Returns the value of the '<em><b>Findings</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Finding}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Finding#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Findings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Findings</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getAssessment_Findings()
	 * @see io.opensemantics.semiotics.model.assessment.Finding#getAssessment
	 * @model opposite="assessment" containment="true"
	 * @generated
	 */
	EList<Finding> getFindings();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Task}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Task#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getAssessment_Tasks()
	 * @see io.opensemantics.semiotics.model.assessment.Task#getAssessment
	 * @model opposite="assessment" containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // Assessment
