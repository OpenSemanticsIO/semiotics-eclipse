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
import io.opensemantics.semiotics.model.assessment.Applications;
import io.opensemantics.semiotics.model.assessment.Assessment;
import io.opensemantics.semiotics.model.assessment.AssessmentPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Applications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationsImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationsImpl#getAssessment <em>Assessment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationsImpl extends MinimalEObjectImpl.Container implements Applications {
	/**
   * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getApplications()
   * @generated
   * @ordered
   */
	protected EList<Application> applications;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ApplicationsImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.APPLICATIONS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Application> getApplications() {
    if (applications == null) {
      applications = new EObjectContainmentWithInverseEList<Application>(Application.class, this, AssessmentPackage.APPLICATIONS__APPLICATIONS, AssessmentPackage.APPLICATION__APPLICATIONS);
    }
    return applications;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Assessment getAssessment() {
    if (eContainerFeatureID() != AssessmentPackage.APPLICATIONS__ASSESSMENT) return null;
    return (Assessment)eInternalContainer();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAssessment(Assessment newAssessment, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newAssessment, AssessmentPackage.APPLICATIONS__ASSESSMENT, msgs);
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAssessment(Assessment newAssessment) {
    if (newAssessment != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.APPLICATIONS__ASSESSMENT && newAssessment != null)) {
      if (EcoreUtil.isAncestor(this, newAssessment))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newAssessment != null)
        msgs = ((InternalEObject)newAssessment).eInverseAdd(this, AssessmentPackage.ASSESSMENT__APPLICATIONS, Assessment.class, msgs);
      msgs = basicSetAssessment(newAssessment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATIONS__ASSESSMENT, newAssessment, newAssessment));
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
      case AssessmentPackage.APPLICATIONS__APPLICATIONS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getApplications()).basicAdd(otherEnd, msgs);
      case AssessmentPackage.APPLICATIONS__ASSESSMENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetAssessment((Assessment)otherEnd, msgs);
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
      case AssessmentPackage.APPLICATIONS__APPLICATIONS:
        return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
      case AssessmentPackage.APPLICATIONS__ASSESSMENT:
        return basicSetAssessment(null, msgs);
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
      case AssessmentPackage.APPLICATIONS__ASSESSMENT:
        return eInternalContainer().eInverseRemove(this, AssessmentPackage.ASSESSMENT__APPLICATIONS, Assessment.class, msgs);
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
      case AssessmentPackage.APPLICATIONS__APPLICATIONS:
        return getApplications();
      case AssessmentPackage.APPLICATIONS__ASSESSMENT:
        return getAssessment();
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
      case AssessmentPackage.APPLICATIONS__APPLICATIONS:
        getApplications().clear();
        getApplications().addAll((Collection<? extends Application>)newValue);
        return;
      case AssessmentPackage.APPLICATIONS__ASSESSMENT:
        setAssessment((Assessment)newValue);
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
      case AssessmentPackage.APPLICATIONS__APPLICATIONS:
        getApplications().clear();
        return;
      case AssessmentPackage.APPLICATIONS__ASSESSMENT:
        setAssessment((Assessment)null);
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
      case AssessmentPackage.APPLICATIONS__APPLICATIONS:
        return applications != null && !applications.isEmpty();
      case AssessmentPackage.APPLICATIONS__ASSESSMENT:
        return getAssessment() != null;
    }
    return super.eIsSet(featureID);
  }

} //ApplicationsImpl
