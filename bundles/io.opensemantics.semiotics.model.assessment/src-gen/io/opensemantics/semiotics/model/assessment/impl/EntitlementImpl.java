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
import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Entitlement;
import io.opensemantics.semiotics.model.assessment.Entitlements;
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
 * An implementation of the model object '<em><b>Entitlement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.EntitlementImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.EntitlementImpl#getEntitlements <em>Entitlements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitlementImpl extends NodeImpl implements Entitlement {
	/**
   * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAccounts()
   * @generated
   * @ordered
   */
	protected EList<Account> accounts;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EntitlementImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.ENTITLEMENT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Account> getAccounts() {
    if (accounts == null) {
      accounts = new EObjectWithInverseResolvingEList.ManyInverse<Account>(Account.class, this, AssessmentPackage.ENTITLEMENT__ACCOUNTS, AssessmentPackage.ACCOUNT__ENTITLEMENTS);
    }
    return accounts;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Entitlements getEntitlements() {
    if (eContainerFeatureID() != AssessmentPackage.ENTITLEMENT__ENTITLEMENTS) return null;
    return (Entitlements)eInternalContainer();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetEntitlements(Entitlements newEntitlements, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newEntitlements, AssessmentPackage.ENTITLEMENT__ENTITLEMENTS, msgs);
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEntitlements(Entitlements newEntitlements) {
    if (newEntitlements != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.ENTITLEMENT__ENTITLEMENTS && newEntitlements != null)) {
      if (EcoreUtil.isAncestor(this, newEntitlements))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newEntitlements != null)
        msgs = ((InternalEObject)newEntitlements).eInverseAdd(this, AssessmentPackage.ENTITLEMENTS__ENTITLEMENTS, Entitlements.class, msgs);
      msgs = basicSetEntitlements(newEntitlements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ENTITLEMENT__ENTITLEMENTS, newEntitlements, newEntitlements));
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
      case AssessmentPackage.ENTITLEMENT__ACCOUNTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccounts()).basicAdd(otherEnd, msgs);
      case AssessmentPackage.ENTITLEMENT__ENTITLEMENTS:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetEntitlements((Entitlements)otherEnd, msgs);
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
      case AssessmentPackage.ENTITLEMENT__ACCOUNTS:
        return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
      case AssessmentPackage.ENTITLEMENT__ENTITLEMENTS:
        return basicSetEntitlements(null, msgs);
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
      case AssessmentPackage.ENTITLEMENT__ENTITLEMENTS:
        return eInternalContainer().eInverseRemove(this, AssessmentPackage.ENTITLEMENTS__ENTITLEMENTS, Entitlements.class, msgs);
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
      case AssessmentPackage.ENTITLEMENT__ACCOUNTS:
        return getAccounts();
      case AssessmentPackage.ENTITLEMENT__ENTITLEMENTS:
        return getEntitlements();
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
      case AssessmentPackage.ENTITLEMENT__ACCOUNTS:
        getAccounts().clear();
        getAccounts().addAll((Collection<? extends Account>)newValue);
        return;
      case AssessmentPackage.ENTITLEMENT__ENTITLEMENTS:
        setEntitlements((Entitlements)newValue);
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
      case AssessmentPackage.ENTITLEMENT__ACCOUNTS:
        getAccounts().clear();
        return;
      case AssessmentPackage.ENTITLEMENT__ENTITLEMENTS:
        setEntitlements((Entitlements)null);
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
      case AssessmentPackage.ENTITLEMENT__ACCOUNTS:
        return accounts != null && !accounts.isEmpty();
      case AssessmentPackage.ENTITLEMENT__ENTITLEMENTS:
        return getEntitlements() != null;
    }
    return super.eIsSet(featureID);
  }

} //EntitlementImpl
