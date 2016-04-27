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

import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Node;
import io.opensemantics.semiotics.model.assessment.Notes;
import io.opensemantics.semiotics.model.assessment.Task;

import io.opensemantics.semiotics.model.assessment.TaskStatus;
import io.opensemantics.semiotics.model.assessment.Tasks;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.TaskImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.TaskImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.TaskImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.TaskImpl#getAffects <em>Affects</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.TaskImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
	protected static final String LABEL_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
	protected String label = LABEL_EDEFAULT;

	/**
   * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNotes()
   * @generated
   * @ordered
   */
	protected static final String NOTES_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNotes()
   * @generated
   * @ordered
   */
	protected String notes = NOTES_EDEFAULT;

	/**
   * The cached value of the '{@link #getAffects() <em>Affects</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAffects()
   * @generated
   * @ordered
   */
	protected EList<Node> affects;

	/**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
	protected static final TaskStatus STATUS_EDEFAULT = TaskStatus.TODO;

	/**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
	protected TaskStatus status = STATUS_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TaskImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.TASK;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLabel() {
    return label;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLabel(String newLabel) {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.TASK__LABEL, oldLabel, label));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getNotes() {
    return notes;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNotes(String newNotes) {
    String oldNotes = notes;
    notes = newNotes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.TASK__NOTES, oldNotes, notes));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Tasks getTasks() {
    if (eContainerFeatureID() != AssessmentPackage.TASK__TASKS) return null;
    return (Tasks)eInternalContainer();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTasks(Tasks newTasks, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newTasks, AssessmentPackage.TASK__TASKS, msgs);
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTasks(Tasks newTasks) {
    if (newTasks != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.TASK__TASKS && newTasks != null)) {
      if (EcoreUtil.isAncestor(this, newTasks))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newTasks != null)
        msgs = ((InternalEObject)newTasks).eInverseAdd(this, AssessmentPackage.TASKS__TASKS, Tasks.class, msgs);
      msgs = basicSetTasks(newTasks, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.TASK__TASKS, newTasks, newTasks));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Node> getAffects() {
    if (affects == null) {
      affects = new EObjectWithInverseResolvingEList.ManyInverse<Node>(Node.class, this, AssessmentPackage.TASK__AFFECTS, AssessmentPackage.NODE__TASKS);
    }
    return affects;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public TaskStatus getStatus() {
    return status;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setStatus(TaskStatus newStatus) {
    TaskStatus oldStatus = status;
    status = newStatus == null ? STATUS_EDEFAULT : newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.TASK__STATUS, oldStatus, status));
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
      case AssessmentPackage.TASK__TASKS:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetTasks((Tasks)otherEnd, msgs);
      case AssessmentPackage.TASK__AFFECTS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getAffects()).basicAdd(otherEnd, msgs);
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
      case AssessmentPackage.TASK__TASKS:
        return basicSetTasks(null, msgs);
      case AssessmentPackage.TASK__AFFECTS:
        return ((InternalEList<?>)getAffects()).basicRemove(otherEnd, msgs);
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
      case AssessmentPackage.TASK__TASKS:
        return eInternalContainer().eInverseRemove(this, AssessmentPackage.TASKS__TASKS, Tasks.class, msgs);
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
      case AssessmentPackage.TASK__LABEL:
        return getLabel();
      case AssessmentPackage.TASK__NOTES:
        return getNotes();
      case AssessmentPackage.TASK__TASKS:
        return getTasks();
      case AssessmentPackage.TASK__AFFECTS:
        return getAffects();
      case AssessmentPackage.TASK__STATUS:
        return getStatus();
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
      case AssessmentPackage.TASK__LABEL:
        setLabel((String)newValue);
        return;
      case AssessmentPackage.TASK__NOTES:
        setNotes((String)newValue);
        return;
      case AssessmentPackage.TASK__TASKS:
        setTasks((Tasks)newValue);
        return;
      case AssessmentPackage.TASK__AFFECTS:
        getAffects().clear();
        getAffects().addAll((Collection<? extends Node>)newValue);
        return;
      case AssessmentPackage.TASK__STATUS:
        setStatus((TaskStatus)newValue);
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
      case AssessmentPackage.TASK__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case AssessmentPackage.TASK__NOTES:
        setNotes(NOTES_EDEFAULT);
        return;
      case AssessmentPackage.TASK__TASKS:
        setTasks((Tasks)null);
        return;
      case AssessmentPackage.TASK__AFFECTS:
        getAffects().clear();
        return;
      case AssessmentPackage.TASK__STATUS:
        setStatus(STATUS_EDEFAULT);
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
      case AssessmentPackage.TASK__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case AssessmentPackage.TASK__NOTES:
        return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
      case AssessmentPackage.TASK__TASKS:
        return getTasks() != null;
      case AssessmentPackage.TASK__AFFECTS:
        return affects != null && !affects.isEmpty();
      case AssessmentPackage.TASK__STATUS:
        return status != STATUS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == Notes.class) {
      switch (derivedFeatureID) {
        case AssessmentPackage.TASK__NOTES: return AssessmentPackage.NOTES__NOTES;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == Notes.class) {
      switch (baseFeatureID) {
        case AssessmentPackage.NOTES__NOTES: return AssessmentPackage.TASK__NOTES;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (label: ");
    result.append(label);
    result.append(", notes: ");
    result.append(notes);
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //TaskImpl
