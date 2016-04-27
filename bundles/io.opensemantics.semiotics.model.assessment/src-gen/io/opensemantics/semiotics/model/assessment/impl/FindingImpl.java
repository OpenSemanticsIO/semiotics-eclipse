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

import io.opensemantics.semiotics.model.assessment.Findings;
import io.opensemantics.semiotics.model.assessment.Node;
import io.opensemantics.semiotics.model.assessment.Notes;
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
 * An implementation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getFindings <em>Findings</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getReproducer <em>Reproducer</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getRemediation <em>Remediation</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getReferences <em>References</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl#getAffects <em>Affects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindingImpl extends MinimalEObjectImpl.Container implements Finding {
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
   * The default value of the '{@link #getReproducer() <em>Reproducer</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReproducer()
   * @generated
   * @ordered
   */
	protected static final String REPRODUCER_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getReproducer() <em>Reproducer</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReproducer()
   * @generated
   * @ordered
   */
	protected String reproducer = REPRODUCER_EDEFAULT;

	/**
   * The default value of the '{@link #getRemediation() <em>Remediation</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRemediation()
   * @generated
   * @ordered
   */
	protected static final String REMEDIATION_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRemediation() <em>Remediation</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRemediation()
   * @generated
   * @ordered
   */
	protected String remediation = REMEDIATION_EDEFAULT;

	/**
   * The default value of the '{@link #getReferences() <em>References</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
	protected static final String REFERENCES_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getReferences() <em>References</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
	protected String references = REFERENCES_EDEFAULT;

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
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FindingImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.FINDING;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDING__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDING__NOTES, oldNotes, notes));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Findings getFindings() {
    if (eContainerFeatureID() != AssessmentPackage.FINDING__FINDINGS) return null;
    return (Findings)eInternalContainer();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFindings(Findings newFindings, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newFindings, AssessmentPackage.FINDING__FINDINGS, msgs);
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFindings(Findings newFindings) {
    if (newFindings != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.FINDING__FINDINGS && newFindings != null)) {
      if (EcoreUtil.isAncestor(this, newFindings))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newFindings != null)
        msgs = ((InternalEObject)newFindings).eInverseAdd(this, AssessmentPackage.FINDINGS__FINDINGS, Findings.class, msgs);
      msgs = basicSetFindings(newFindings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDING__FINDINGS, newFindings, newFindings));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getReproducer() {
    return reproducer;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setReproducer(String newReproducer) {
    String oldReproducer = reproducer;
    reproducer = newReproducer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDING__REPRODUCER, oldReproducer, reproducer));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getRemediation() {
    return remediation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRemediation(String newRemediation) {
    String oldRemediation = remediation;
    remediation = newRemediation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDING__REMEDIATION, oldRemediation, remediation));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getReferences() {
    return references;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setReferences(String newReferences) {
    String oldReferences = references;
    references = newReferences;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDING__REFERENCES, oldReferences, references));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Node> getAffects() {
    if (affects == null) {
      affects = new EObjectWithInverseResolvingEList.ManyInverse<Node>(Node.class, this, AssessmentPackage.FINDING__AFFECTS, AssessmentPackage.NODE__FINDINGS);
    }
    return affects;
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
      case AssessmentPackage.FINDING__FINDINGS:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetFindings((Findings)otherEnd, msgs);
      case AssessmentPackage.FINDING__AFFECTS:
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
      case AssessmentPackage.FINDING__FINDINGS:
        return basicSetFindings(null, msgs);
      case AssessmentPackage.FINDING__AFFECTS:
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
      case AssessmentPackage.FINDING__FINDINGS:
        return eInternalContainer().eInverseRemove(this, AssessmentPackage.FINDINGS__FINDINGS, Findings.class, msgs);
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
      case AssessmentPackage.FINDING__LABEL:
        return getLabel();
      case AssessmentPackage.FINDING__NOTES:
        return getNotes();
      case AssessmentPackage.FINDING__FINDINGS:
        return getFindings();
      case AssessmentPackage.FINDING__REPRODUCER:
        return getReproducer();
      case AssessmentPackage.FINDING__REMEDIATION:
        return getRemediation();
      case AssessmentPackage.FINDING__REFERENCES:
        return getReferences();
      case AssessmentPackage.FINDING__AFFECTS:
        return getAffects();
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
      case AssessmentPackage.FINDING__LABEL:
        setLabel((String)newValue);
        return;
      case AssessmentPackage.FINDING__NOTES:
        setNotes((String)newValue);
        return;
      case AssessmentPackage.FINDING__FINDINGS:
        setFindings((Findings)newValue);
        return;
      case AssessmentPackage.FINDING__REPRODUCER:
        setReproducer((String)newValue);
        return;
      case AssessmentPackage.FINDING__REMEDIATION:
        setRemediation((String)newValue);
        return;
      case AssessmentPackage.FINDING__REFERENCES:
        setReferences((String)newValue);
        return;
      case AssessmentPackage.FINDING__AFFECTS:
        getAffects().clear();
        getAffects().addAll((Collection<? extends Node>)newValue);
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
      case AssessmentPackage.FINDING__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case AssessmentPackage.FINDING__NOTES:
        setNotes(NOTES_EDEFAULT);
        return;
      case AssessmentPackage.FINDING__FINDINGS:
        setFindings((Findings)null);
        return;
      case AssessmentPackage.FINDING__REPRODUCER:
        setReproducer(REPRODUCER_EDEFAULT);
        return;
      case AssessmentPackage.FINDING__REMEDIATION:
        setRemediation(REMEDIATION_EDEFAULT);
        return;
      case AssessmentPackage.FINDING__REFERENCES:
        setReferences(REFERENCES_EDEFAULT);
        return;
      case AssessmentPackage.FINDING__AFFECTS:
        getAffects().clear();
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
      case AssessmentPackage.FINDING__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case AssessmentPackage.FINDING__NOTES:
        return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
      case AssessmentPackage.FINDING__FINDINGS:
        return getFindings() != null;
      case AssessmentPackage.FINDING__REPRODUCER:
        return REPRODUCER_EDEFAULT == null ? reproducer != null : !REPRODUCER_EDEFAULT.equals(reproducer);
      case AssessmentPackage.FINDING__REMEDIATION:
        return REMEDIATION_EDEFAULT == null ? remediation != null : !REMEDIATION_EDEFAULT.equals(remediation);
      case AssessmentPackage.FINDING__REFERENCES:
        return REFERENCES_EDEFAULT == null ? references != null : !REFERENCES_EDEFAULT.equals(references);
      case AssessmentPackage.FINDING__AFFECTS:
        return affects != null && !affects.isEmpty();
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
        case AssessmentPackage.FINDING__NOTES: return AssessmentPackage.NOTES__NOTES;
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
        case AssessmentPackage.NOTES__NOTES: return AssessmentPackage.FINDING__NOTES;
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
    result.append(", reproducer: ");
    result.append(reproducer);
    result.append(", remediation: ");
    result.append(remediation);
    result.append(", references: ");
    result.append(references);
    result.append(')');
    return result.toString();
  }

} //FindingImpl
