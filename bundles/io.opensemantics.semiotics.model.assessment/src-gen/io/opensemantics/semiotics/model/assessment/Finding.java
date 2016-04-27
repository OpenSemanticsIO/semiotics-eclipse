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
 * A representation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Finding#getFindings <em>Findings</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Finding#getReproducer <em>Reproducer</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Finding#getRemediation <em>Remediation</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Finding#getReferences <em>References</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Finding#getAffects <em>Affects</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getFinding()
 * @model
 * @generated
 */
public interface Finding extends Label, Notes {
	/**
   * Returns the value of the '<em><b>Findings</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Findings#getFindings <em>Findings</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Findings</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Findings</em>' container reference.
   * @see #setFindings(Findings)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getFinding_Findings()
   * @see io.opensemantics.semiotics.model.assessment.Findings#getFindings
   * @model opposite="findings" transient="false"
   * @generated
   */
	Findings getFindings();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Finding#getFindings <em>Findings</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Findings</em>' container reference.
   * @see #getFindings()
   * @generated
   */
	void setFindings(Findings value);

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

	/**
   * Returns the value of the '<em><b>Affects</b></em>' reference list.
   * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Node}.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Node#getFindings <em>Findings</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Affects</em>' reference list.
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getFinding_Affects()
   * @see io.opensemantics.semiotics.model.assessment.Node#getFindings
   * @model opposite="findings"
   * @generated
   */
	EList<Node> getAffects();

} // Finding
