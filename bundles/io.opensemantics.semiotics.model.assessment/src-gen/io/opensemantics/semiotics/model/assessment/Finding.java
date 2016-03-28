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
 * A representation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Finding#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Finding#getDescription <em>Description</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Finding#getReproducer <em>Reproducer</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Finding#getRemediation <em>Remediation</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Finding#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getFinding()
 * @model
 * @generated
 */
public interface Finding extends EObject {
	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Assessment#getFindings <em>Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment</em>' container reference.
	 * @see #setAssessment(Assessment)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getFinding_Assessment()
	 * @see io.opensemantics.semiotics.model.assessment.Assessment#getFindings
	 * @model opposite="findings" transient="false"
	 * @generated
	 */
	Assessment getAssessment();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Finding#getAssessment <em>Assessment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment</em>' container reference.
	 * @see #getAssessment()
	 * @generated
	 */
	void setAssessment(Assessment value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getFinding_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Finding#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Reproducer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reproducer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reproducer</em>' attribute.
	 * @see #setReproducer(String)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getFinding_Reproducer()
	 * @model
	 * @generated
	 */
	String getReproducer();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Finding#getReproducer <em>Reproducer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reproducer</em>' attribute.
	 * @see #getReproducer()
	 * @generated
	 */
	void setReproducer(String value);

	/**
	 * Returns the value of the '<em><b>Remediation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remediation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remediation</em>' attribute.
	 * @see #setRemediation(String)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getFinding_Remediation()
	 * @model
	 * @generated
	 */
	String getRemediation();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Finding#getRemediation <em>Remediation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remediation</em>' attribute.
	 * @see #getRemediation()
	 * @generated
	 */
	void setRemediation(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' attribute.
	 * @see #setReferences(String)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getFinding_References()
	 * @model
	 * @generated
	 */
	String getReferences();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Finding#getReferences <em>References</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' attribute.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(String value);

} // Finding
