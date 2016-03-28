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
 * A representation of the model object '<em><b>Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Sink#getCwes <em>Cwes</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Sink#isTainted <em>Tainted</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Sink#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getSink()
 * @model
 * @generated
 */
public interface Sink extends Graph<Node> {
	/**
	 * Returns the value of the '<em><b>Cwes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cwes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cwes</em>' attribute list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getSink_Cwes()
	 * @model
	 * @generated
	 */
	EList<Integer> getCwes();

	/**
	 * Returns the value of the '<em><b>Tainted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tainted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tainted</em>' attribute.
	 * @see #setTainted(boolean)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getSink_Tainted()
	 * @model
	 * @generated
	 */
	boolean isTainted();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Sink#isTainted <em>Tainted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tainted</em>' attribute.
	 * @see #isTainted()
	 * @generated
	 */
	void setTainted(boolean value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Application#getSinks <em>Sinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' container reference.
	 * @see #setApplication(Application)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getSink_Application()
	 * @see io.opensemantics.semiotics.model.assessment.Application#getSinks
	 * @model opposite="sinks" transient="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Sink#getApplication <em>Application</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' container reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // Sink
