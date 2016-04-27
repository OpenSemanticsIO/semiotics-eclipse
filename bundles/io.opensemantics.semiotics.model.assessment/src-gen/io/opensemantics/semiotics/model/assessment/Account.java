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
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Account#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Account#getEntitlements <em>Entitlements</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Account#getEmail <em>Email</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Account#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends Node {
	/**
   * Returns the value of the '<em><b>Accounts</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Accounts#getAccounts <em>Accounts</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Accounts</em>' container reference.
   * @see #setAccounts(Accounts)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getAccount_Accounts()
   * @see io.opensemantics.semiotics.model.assessment.Accounts#getAccounts
   * @model opposite="accounts" transient="false"
   * @generated
   */
	Accounts getAccounts();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Account#getAccounts <em>Accounts</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accounts</em>' container reference.
   * @see #getAccounts()
   * @generated
   */
	void setAccounts(Accounts value);

	/**
   * Returns the value of the '<em><b>Entitlements</b></em>' reference list.
   * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Entitlement}.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Entitlement#getAccounts <em>Accounts</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entitlements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Entitlements</em>' reference list.
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getAccount_Entitlements()
   * @see io.opensemantics.semiotics.model.assessment.Entitlement#getAccounts
   * @model opposite="accounts"
   * @generated
   */
	EList<Entitlement> getEntitlements();

	/**
   * Returns the value of the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Email</em>' attribute.
   * @see #setEmail(String)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getAccount_Email()
   * @model
   * @generated
   */
	String getEmail();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Account#getEmail <em>Email</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Email</em>' attribute.
   * @see #getEmail()
   * @generated
   */
	void setEmail(String value);

	/**
   * Returns the value of the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' attribute.
   * @see #setPassword(String)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getAccount_Password()
   * @model
   * @generated
   */
	String getPassword();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Account#getPassword <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' attribute.
   * @see #getPassword()
   * @generated
   */
	void setPassword(String value);

} // Account
