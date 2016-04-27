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

import io.opensemantics.semiotics.model.assessment.Application;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entitlements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.EntitlementsImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.EntitlementsImpl#getEntitlements <em>Entitlements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitlementsImpl extends MinimalEObjectImpl.Container implements Entitlements {
	/**
   * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getApplication()
   * @generated
   * @ordered
   */
	protected Application application;

	/**
   * The cached value of the '{@link #getEntitlements() <em>Entitlements</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEntitlements()
   * @generated
   * @ordered
   */
	protected EList<Entitlement> entitlements;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EntitlementsImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.ENTITLEMENTS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Application getApplication() {
    if (application != null && application.eIsProxy()) {
      InternalEObject oldApplication = (InternalEObject)application;
      application = (Application)eResolveProxy(oldApplication);
      if (application != oldApplication) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessmentPackage.ENTITLEMENTS__APPLICATION, oldApplication, application));
      }
    }
    return application;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Application basicGetApplication() {
    return application;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setApplication(Application newApplication) {
    Application oldApplication = application;
    application = newApplication;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ENTITLEMENTS__APPLICATION, oldApplication, application));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Entitlement> getEntitlements() {
    if (entitlements == null) {
      entitlements = new EObjectContainmentWithInverseEList<Entitlement>(Entitlement.class, this, AssessmentPackage.ENTITLEMENTS__ENTITLEMENTS, AssessmentPackage.ENTITLEMENT__ENTITLEMENTS);
    }
    return entitlements;
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
      case AssessmentPackage.ENTITLEMENTS__ENTITLEMENTS:
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
      case AssessmentPackage.ENTITLEMENTS__ENTITLEMENTS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case AssessmentPackage.ENTITLEMENTS__APPLICATION:
        if (resolve) return getApplication();
        return basicGetApplication();
      case AssessmentPackage.ENTITLEMENTS__ENTITLEMENTS:
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
      case AssessmentPackage.ENTITLEMENTS__APPLICATION:
        setApplication((Application)newValue);
        return;
      case AssessmentPackage.ENTITLEMENTS__ENTITLEMENTS:
        getEntitlements().clear();
        getEntitlements().addAll((Collection<? extends Entitlement>)newValue);
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
      case AssessmentPackage.ENTITLEMENTS__APPLICATION:
        setApplication((Application)null);
        return;
      case AssessmentPackage.ENTITLEMENTS__ENTITLEMENTS:
        getEntitlements().clear();
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
      case AssessmentPackage.ENTITLEMENTS__APPLICATION:
        return application != null;
      case AssessmentPackage.ENTITLEMENTS__ENTITLEMENTS:
        return entitlements != null && !entitlements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntitlementsImpl
