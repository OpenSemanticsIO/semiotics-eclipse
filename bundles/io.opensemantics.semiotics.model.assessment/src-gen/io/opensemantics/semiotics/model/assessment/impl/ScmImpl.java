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
import io.opensemantics.semiotics.model.assessment.Scm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ScmImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ScmImpl#getBranchTag <em>Branch Tag</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ScmImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScmImpl extends MinimalEObjectImpl.Container implements Scm {
	/**
   * The default value of the '{@link #getRepository() <em>Repository</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRepository()
   * @generated
   * @ordered
   */
	protected static final String REPOSITORY_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRepository() <em>Repository</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRepository()
   * @generated
   * @ordered
   */
	protected String repository = REPOSITORY_EDEFAULT;

	/**
   * The default value of the '{@link #getBranchTag() <em>Branch Tag</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBranchTag()
   * @generated
   * @ordered
   */
	protected static final String BRANCH_TAG_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getBranchTag() <em>Branch Tag</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getBranchTag()
   * @generated
   * @ordered
   */
	protected String branchTag = BRANCH_TAG_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ScmImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.SCM;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getRepository() {
    return repository;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRepository(String newRepository) {
    String oldRepository = repository;
    repository = newRepository;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SCM__REPOSITORY, oldRepository, repository));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getBranchTag() {
    return branchTag;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setBranchTag(String newBranchTag) {
    String oldBranchTag = branchTag;
    branchTag = newBranchTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SCM__BRANCH_TAG, oldBranchTag, branchTag));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Application getApplication() {
    if (eContainerFeatureID() != AssessmentPackage.SCM__APPLICATION) return null;
    return (Application)eInternalContainer();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newApplication, AssessmentPackage.SCM__APPLICATION, msgs);
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setApplication(Application newApplication) {
    if (newApplication != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.SCM__APPLICATION && newApplication != null)) {
      if (EcoreUtil.isAncestor(this, newApplication))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newApplication != null)
        msgs = ((InternalEObject)newApplication).eInverseAdd(this, AssessmentPackage.APPLICATION__SCM, Application.class, msgs);
      msgs = basicSetApplication(newApplication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SCM__APPLICATION, newApplication, newApplication));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AssessmentPackage.SCM__APPLICATION:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetApplication((Application)otherEnd, msgs);
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
      case AssessmentPackage.SCM__APPLICATION:
        return basicSetApplication(null, msgs);
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
      case AssessmentPackage.SCM__APPLICATION:
        return eInternalContainer().eInverseRemove(this, AssessmentPackage.APPLICATION__SCM, Application.class, msgs);
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
      case AssessmentPackage.SCM__REPOSITORY:
        return getRepository();
      case AssessmentPackage.SCM__BRANCH_TAG:
        return getBranchTag();
      case AssessmentPackage.SCM__APPLICATION:
        return getApplication();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case AssessmentPackage.SCM__REPOSITORY:
        setRepository((String)newValue);
        return;
      case AssessmentPackage.SCM__BRANCH_TAG:
        setBranchTag((String)newValue);
        return;
      case AssessmentPackage.SCM__APPLICATION:
        setApplication((Application)newValue);
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
      case AssessmentPackage.SCM__REPOSITORY:
        setRepository(REPOSITORY_EDEFAULT);
        return;
      case AssessmentPackage.SCM__BRANCH_TAG:
        setBranchTag(BRANCH_TAG_EDEFAULT);
        return;
      case AssessmentPackage.SCM__APPLICATION:
        setApplication((Application)null);
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
      case AssessmentPackage.SCM__REPOSITORY:
        return REPOSITORY_EDEFAULT == null ? repository != null : !REPOSITORY_EDEFAULT.equals(repository);
      case AssessmentPackage.SCM__BRANCH_TAG:
        return BRANCH_TAG_EDEFAULT == null ? branchTag != null : !BRANCH_TAG_EDEFAULT.equals(branchTag);
      case AssessmentPackage.SCM__APPLICATION:
        return getApplication() != null;
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
    result.append(" (repository: ");
    result.append(repository);
    result.append(", branchTag: ");
    result.append(branchTag);
    result.append(')');
    return result.toString();
  }

} //ScmImpl
