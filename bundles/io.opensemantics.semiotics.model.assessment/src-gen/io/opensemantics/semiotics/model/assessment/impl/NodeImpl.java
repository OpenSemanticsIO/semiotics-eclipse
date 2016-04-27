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
import io.opensemantics.semiotics.model.assessment.Finding;
import io.opensemantics.semiotics.model.assessment.GraphNode;
import io.opensemantics.semiotics.model.assessment.Node;

import io.opensemantics.semiotics.model.assessment.Notes;
import io.opensemantics.semiotics.model.assessment.Task;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.NodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.NodeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.NodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.NodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.NodeImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.NodeImpl#getReferredBy <em>Referred By</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.NodeImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.NodeImpl#getFindings <em>Findings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NodeImpl extends MinimalEObjectImpl.Container implements Node {
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
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
	protected EList<GraphNode> children;

	/**
   * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getParent()
   * @generated
   * @ordered
   */
	protected Node parent;

	/**
   * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRefersTo()
   * @generated
   * @ordered
   */
	protected EList<Node> refersTo;

	/**
   * The cached value of the '{@link #getReferredBy() <em>Referred By</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReferredBy()
   * @generated
   * @ordered
   */
	protected EList<Node> referredBy;
	/**
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTasks()
   * @generated
   * @ordered
   */
	protected EList<Task> tasks;
	/**
   * The cached value of the '{@link #getFindings() <em>Findings</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFindings()
   * @generated
   * @ordered
   */
	protected EList<Finding> findings;
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NodeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.NODE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<GraphNode> getChildren() {
    if (children == null) {
      children = new EObjectContainmentEList<GraphNode>(GraphNode.class, this, AssessmentPackage.NODE__CHILDREN);
    }
    return children;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Node getParent() {
    if (parent != null && parent.eIsProxy()) {
      InternalEObject oldParent = (InternalEObject)parent;
      parent = (Node)eResolveProxy(oldParent);
      if (parent != oldParent) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessmentPackage.NODE__PARENT, oldParent, parent));
      }
    }
    return parent;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Node basicGetParent() {
    return parent;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setParent(Node newParent) {
    Node oldParent = parent;
    parent = newParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.NODE__PARENT, oldParent, parent));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Node> getRefersTo() {
    if (refersTo == null) {
      refersTo = new EObjectWithInverseResolvingEList.ManyInverse<Node>(Node.class, this, AssessmentPackage.NODE__REFERS_TO, AssessmentPackage.NODE__REFERRED_BY);
    }
    return refersTo;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Node> getReferredBy() {
    if (referredBy == null) {
      referredBy = new EObjectWithInverseResolvingEList.ManyInverse<Node>(Node.class, this, AssessmentPackage.NODE__REFERRED_BY, AssessmentPackage.NODE__REFERS_TO);
    }
    return referredBy;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Task> getTasks() {
    if (tasks == null) {
      tasks = new EObjectWithInverseResolvingEList.ManyInverse<Task>(Task.class, this, AssessmentPackage.NODE__TASKS, AssessmentPackage.TASK__AFFECTS);
    }
    return tasks;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Finding> getFindings() {
    if (findings == null) {
      findings = new EObjectWithInverseResolvingEList.ManyInverse<Finding>(Finding.class, this, AssessmentPackage.NODE__FINDINGS, AssessmentPackage.FINDING__AFFECTS);
    }
    return findings;
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
      case AssessmentPackage.NODE__REFERS_TO:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getRefersTo()).basicAdd(otherEnd, msgs);
      case AssessmentPackage.NODE__REFERRED_BY:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferredBy()).basicAdd(otherEnd, msgs);
      case AssessmentPackage.NODE__TASKS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
      case AssessmentPackage.NODE__FINDINGS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getFindings()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.NODE__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.NODE__NOTES, oldNotes, notes));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AssessmentPackage.NODE__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
      case AssessmentPackage.NODE__REFERS_TO:
        return ((InternalEList<?>)getRefersTo()).basicRemove(otherEnd, msgs);
      case AssessmentPackage.NODE__REFERRED_BY:
        return ((InternalEList<?>)getReferredBy()).basicRemove(otherEnd, msgs);
      case AssessmentPackage.NODE__TASKS:
        return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
      case AssessmentPackage.NODE__FINDINGS:
        return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
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
      case AssessmentPackage.NODE__LABEL:
        return getLabel();
      case AssessmentPackage.NODE__NOTES:
        return getNotes();
      case AssessmentPackage.NODE__CHILDREN:
        return getChildren();
      case AssessmentPackage.NODE__PARENT:
        if (resolve) return getParent();
        return basicGetParent();
      case AssessmentPackage.NODE__REFERS_TO:
        return getRefersTo();
      case AssessmentPackage.NODE__REFERRED_BY:
        return getReferredBy();
      case AssessmentPackage.NODE__TASKS:
        return getTasks();
      case AssessmentPackage.NODE__FINDINGS:
        return getFindings();
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
      case AssessmentPackage.NODE__LABEL:
        setLabel((String)newValue);
        return;
      case AssessmentPackage.NODE__NOTES:
        setNotes((String)newValue);
        return;
      case AssessmentPackage.NODE__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends GraphNode>)newValue);
        return;
      case AssessmentPackage.NODE__PARENT:
        setParent((Node)newValue);
        return;
      case AssessmentPackage.NODE__REFERS_TO:
        getRefersTo().clear();
        getRefersTo().addAll((Collection<? extends Node>)newValue);
        return;
      case AssessmentPackage.NODE__REFERRED_BY:
        getReferredBy().clear();
        getReferredBy().addAll((Collection<? extends Node>)newValue);
        return;
      case AssessmentPackage.NODE__TASKS:
        getTasks().clear();
        getTasks().addAll((Collection<? extends Task>)newValue);
        return;
      case AssessmentPackage.NODE__FINDINGS:
        getFindings().clear();
        getFindings().addAll((Collection<? extends Finding>)newValue);
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
      case AssessmentPackage.NODE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case AssessmentPackage.NODE__NOTES:
        setNotes(NOTES_EDEFAULT);
        return;
      case AssessmentPackage.NODE__CHILDREN:
        getChildren().clear();
        return;
      case AssessmentPackage.NODE__PARENT:
        setParent((Node)null);
        return;
      case AssessmentPackage.NODE__REFERS_TO:
        getRefersTo().clear();
        return;
      case AssessmentPackage.NODE__REFERRED_BY:
        getReferredBy().clear();
        return;
      case AssessmentPackage.NODE__TASKS:
        getTasks().clear();
        return;
      case AssessmentPackage.NODE__FINDINGS:
        getFindings().clear();
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
      case AssessmentPackage.NODE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case AssessmentPackage.NODE__NOTES:
        return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
      case AssessmentPackage.NODE__CHILDREN:
        return children != null && !children.isEmpty();
      case AssessmentPackage.NODE__PARENT:
        return parent != null;
      case AssessmentPackage.NODE__REFERS_TO:
        return refersTo != null && !refersTo.isEmpty();
      case AssessmentPackage.NODE__REFERRED_BY:
        return referredBy != null && !referredBy.isEmpty();
      case AssessmentPackage.NODE__TASKS:
        return tasks != null && !tasks.isEmpty();
      case AssessmentPackage.NODE__FINDINGS:
        return findings != null && !findings.isEmpty();
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
        case AssessmentPackage.NODE__NOTES: return AssessmentPackage.NOTES__NOTES;
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
        case AssessmentPackage.NOTES__NOTES: return AssessmentPackage.NODE__NOTES;
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
    result.append(')');
    return result.toString();
  }

} //NodeImpl
