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
package io.opensemantics.semiotics.model.assessment.impl;

import io.opensemantics.semiotics.model.assessment.Account;
import io.opensemantics.semiotics.model.assessment.Accounts;
import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Entitlement;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.AccountImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.AccountImpl#getEntitlements <em>Entitlements</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.AccountImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.AccountImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends NodeImpl implements Account {
	/**
   * The cached value of the '{@link #getEntitlements() <em>Entitlements</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEntitlements()
   * @generated
   * @ordered
   */
	protected EList<Entitlement> entitlements;

	/**
   * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEmail()
   * @generated
   * @ordered
   */
	protected static final String EMAIL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEmail()
   * @generated
   * @ordered
   */
	protected String email = EMAIL_EDEFAULT;

	/**
   * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
	protected String password = PASSWORD_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AccountImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.ACCOUNT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Accounts getAccounts() {
    if (eContainerFeatureID() != AssessmentPackage.ACCOUNT__ACCOUNTS) return null;
    return (Accounts)eInternalContainer();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAccounts(Accounts newAccounts, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newAccounts, AssessmentPackage.ACCOUNT__ACCOUNTS, msgs);
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAccounts(Accounts newAccounts) {
    if (newAccounts != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.ACCOUNT__ACCOUNTS && newAccounts != null)) {
      if (EcoreUtil.isAncestor(this, newAccounts))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newAccounts != null)
        msgs = ((InternalEObject)newAccounts).eInverseAdd(this, AssessmentPackage.ACCOUNTS__ACCOUNTS, Accounts.class, msgs);
      msgs = basicSetAccounts(newAccounts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ACCOUNT__ACCOUNTS, newAccounts, newAccounts));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Entitlement> getEntitlements() {
    if (entitlements == null) {
      entitlements = new EObjectWithInverseResolvingEList.ManyInverse<Entitlement>(Entitlement.class, this, AssessmentPackage.ACCOUNT__ENTITLEMENTS, AssessmentPackage.ENTITLEMENT__ACCOUNTS);
    }
    return entitlements;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getEmail() {
    return email;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEmail(String newEmail) {
    String oldEmail = email;
    email = newEmail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ACCOUNT__EMAIL, oldEmail, email));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getPassword() {
    return password;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setPassword(String newPassword) {
    String oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ACCOUNT__PASSWORD, oldPassword, password));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AssessmentPackage.ACCOUNT__ACCOUNTS:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetAccounts((Accounts)otherEnd, msgs);
      case AssessmentPackage.ACCOUNT__ENTITLEMENTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntitlements()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AssessmentPackage.ACCOUNT__ACCOUNTS:
        return basicSetAccounts(null, msgs);
      case AssessmentPackage.ACCOUNT__ENTITLEMENTS:
        return ((InternalEList<?>)getEntitlements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case AssessmentPackage.ACCOUNT__ACCOUNTS:
        return eInternalContainer().eInverseRemove(this, AssessmentPackage.ACCOUNTS__ACCOUNTS, Accounts.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case AssessmentPackage.ACCOUNT__ACCOUNTS:
        return getAccounts();
      case AssessmentPackage.ACCOUNT__ENTITLEMENTS:
        return getEntitlements();
      case AssessmentPackage.ACCOUNT__EMAIL:
        return getEmail();
      case AssessmentPackage.ACCOUNT__PASSWORD:
        return getPassword();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case AssessmentPackage.ACCOUNT__ACCOUNTS:
        setAccounts((Accounts)newValue);
        return;
      case AssessmentPackage.ACCOUNT__ENTITLEMENTS:
        getEntitlements().clear();
        getEntitlements().addAll((Collection<? extends Entitlement>)newValue);
        return;
      case AssessmentPackage.ACCOUNT__EMAIL:
        setEmail((String)newValue);
        return;
      case AssessmentPackage.ACCOUNT__PASSWORD:
        setPassword((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID) {
      case AssessmentPackage.ACCOUNT__ACCOUNTS:
        setAccounts((Accounts)null);
        return;
      case AssessmentPackage.ACCOUNT__ENTITLEMENTS:
        getEntitlements().clear();
        return;
      case AssessmentPackage.ACCOUNT__EMAIL:
        setEmail(EMAIL_EDEFAULT);
        return;
      case AssessmentPackage.ACCOUNT__PASSWORD:
        setPassword(PASSWORD_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case AssessmentPackage.ACCOUNT__ACCOUNTS:
        return getAccounts() != null;
      case AssessmentPackage.ACCOUNT__ENTITLEMENTS:
        return entitlements != null && !entitlements.isEmpty();
      case AssessmentPackage.ACCOUNT__EMAIL:
        return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
      case AssessmentPackage.ACCOUNT__PASSWORD:
        return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (email: ");
    result.append(email);
    result.append(", password: ");
    result.append(password);
    result.append(')');
    return result.toString();
  }

} //AccountImpl
