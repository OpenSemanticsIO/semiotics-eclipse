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
 * A representation of the model object '<em><b>Entitlement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Entitlement#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Entitlement#getEntitlements <em>Entitlements</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getEntitlement()
 * @model
 * @generated
 */
public interface Entitlement extends Node {
	/**
   * Returns the value of the '<em><b>Accounts</b></em>' reference list.
   * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Account}.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Account#getEntitlements <em>Entitlements</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Accounts</em>' reference list.
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getEntitlement_Accounts()
   * @see io.opensemantics.semiotics.model.assessment.Account#getEntitlements
   * @model opposite="entitlements"
   * @generated
   */
	EList<Account> getAccounts();

	/**
   * Returns the value of the '<em><b>Entitlements</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Entitlements#getEntitlements <em>Entitlements</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entitlements</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Entitlements</em>' container reference.
   * @see #setEntitlements(Entitlements)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getEntitlement_Entitlements()
   * @see io.opensemantics.semiotics.model.assessment.Entitlements#getEntitlements
   * @model opposite="entitlements" transient="false"
   * @generated
   */
	Entitlements getEntitlements();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Entitlement#getEntitlements <em>Entitlements</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entitlements</em>' container reference.
   * @see #getEntitlements()
   * @generated
   */
	void setEntitlements(Entitlements value);

} // Entitlement
