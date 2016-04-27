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

import io.opensemantics.semiotics.model.assessment.Applications;
import io.opensemantics.semiotics.model.assessment.Assessment;
import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Findings;
import io.opensemantics.semiotics.model.assessment.Notes;
import io.opensemantics.semiotics.model.assessment.Tasks;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.AssessmentImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.AssessmentImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.AssessmentImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.AssessmentImpl#getFindings <em>Findings</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.AssessmentImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentImpl extends MinimalEObjectImpl.Container implements Assessment {
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
   * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getApplications()
   * @generated
   * @ordered
   */
	protected Applications applications;

	/**
   * The cached value of the '{@link #getFindings() <em>Findings</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFindings()
   * @generated
   * @ordered
   */
	protected Findings findings;

	/**
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTasks()
   * @generated
   * @ordered
   */
	protected Tasks tasks;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AssessmentImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.ASSESSMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ASSESSMENT__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ASSESSMENT__NOTES, oldNotes, notes));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Applications getApplications() {
    return applications;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetApplications(Applications newApplications, NotificationChain msgs) {
    Applications oldApplications = applications;
    applications = newApplications;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.ASSESSMENT__APPLICATIONS, oldApplications, newApplications);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setApplications(Applications newApplications) {
    if (newApplications != applications) {
      NotificationChain msgs = null;
      if (applications != null)
        msgs = ((InternalEObject)applications).eInverseRemove(this, AssessmentPackage.APPLICATIONS__ASSESSMENT, Applications.class, msgs);
      if (newApplications != null)
        msgs = ((InternalEObject)newApplications).eInverseAdd(this, AssessmentPackage.APPLICATIONS__ASSESSMENT, Applications.class, msgs);
      msgs = basicSetApplications(newApplications, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ASSESSMENT__APPLICATIONS, newApplications, newApplications));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Findings getFindings() {
    return findings;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFindings(Findings newFindings, NotificationChain msgs) {
    Findings oldFindings = findings;
    findings = newFindings;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.ASSESSMENT__FINDINGS, oldFindings, newFindings);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFindings(Findings newFindings) {
    if (newFindings != findings) {
      NotificationChain msgs = null;
      if (findings != null)
        msgs = ((InternalEObject)findings).eInverseRemove(this, AssessmentPackage.FINDINGS__ASSESSMENT, Findings.class, msgs);
      if (newFindings != null)
        msgs = ((InternalEObject)newFindings).eInverseAdd(this, AssessmentPackage.FINDINGS__ASSESSMENT, Findings.class, msgs);
      msgs = basicSetFindings(newFindings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ASSESSMENT__FINDINGS, newFindings, newFindings));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Tasks getTasks() {
    return tasks;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetTasks(Tasks newTasks, NotificationChain msgs) {
    Tasks oldTasks = tasks;
    tasks = newTasks;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.ASSESSMENT__TASKS, oldTasks, newTasks);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setTasks(Tasks newTasks) {
    if (newTasks != tasks) {
      NotificationChain msgs = null;
      if (tasks != null)
        msgs = ((InternalEObject)tasks).eInverseRemove(this, AssessmentPackage.TASKS__ASSESSMENT, Tasks.class, msgs);
      if (newTasks != null)
        msgs = ((InternalEObject)newTasks).eInverseAdd(this, AssessmentPackage.TASKS__ASSESSMENT, Tasks.class, msgs);
      msgs = basicSetTasks(newTasks, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.ASSESSMENT__TASKS, newTasks, newTasks));
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
      case AssessmentPackage.ASSESSMENT__APPLICATIONS:
        if (applications != null)
          msgs = ((InternalEObject)applications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.ASSESSMENT__APPLICATIONS, null, msgs);
        return basicSetApplications((Applications)otherEnd, msgs);
      case AssessmentPackage.ASSESSMENT__FINDINGS:
        if (findings != null)
          msgs = ((InternalEObject)findings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.ASSESSMENT__FINDINGS, null, msgs);
        return basicSetFindings((Findings)otherEnd, msgs);
      case AssessmentPackage.ASSESSMENT__TASKS:
        if (tasks != null)
          msgs = ((InternalEObject)tasks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.ASSESSMENT__TASKS, null, msgs);
        return basicSetTasks((Tasks)otherEnd, msgs);
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
      case AssessmentPackage.ASSESSMENT__APPLICATIONS:
        return basicSetApplications(null, msgs);
      case AssessmentPackage.ASSESSMENT__FINDINGS:
        return basicSetFindings(null, msgs);
      case AssessmentPackage.ASSESSMENT__TASKS:
        return basicSetTasks(null, msgs);
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
      case AssessmentPackage.ASSESSMENT__LABEL:
        return getLabel();
      case AssessmentPackage.ASSESSMENT__NOTES:
        return getNotes();
      case AssessmentPackage.ASSESSMENT__APPLICATIONS:
        return getApplications();
      case AssessmentPackage.ASSESSMENT__FINDINGS:
        return getFindings();
      case AssessmentPackage.ASSESSMENT__TASKS:
        return getTasks();
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
      case AssessmentPackage.ASSESSMENT__LABEL:
        setLabel((String)newValue);
        return;
      case AssessmentPackage.ASSESSMENT__NOTES:
        setNotes((String)newValue);
        return;
      case AssessmentPackage.ASSESSMENT__APPLICATIONS:
        setApplications((Applications)newValue);
        return;
      case AssessmentPackage.ASSESSMENT__FINDINGS:
        setFindings((Findings)newValue);
        return;
      case AssessmentPackage.ASSESSMENT__TASKS:
        setTasks((Tasks)newValue);
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
      case AssessmentPackage.ASSESSMENT__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case AssessmentPackage.ASSESSMENT__NOTES:
        setNotes(NOTES_EDEFAULT);
        return;
      case AssessmentPackage.ASSESSMENT__APPLICATIONS:
        setApplications((Applications)null);
        return;
      case AssessmentPackage.ASSESSMENT__FINDINGS:
        setFindings((Findings)null);
        return;
      case AssessmentPackage.ASSESSMENT__TASKS:
        setTasks((Tasks)null);
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
      case AssessmentPackage.ASSESSMENT__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case AssessmentPackage.ASSESSMENT__NOTES:
        return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
      case AssessmentPackage.ASSESSMENT__APPLICATIONS:
        return applications != null;
      case AssessmentPackage.ASSESSMENT__FINDINGS:
        return findings != null;
      case AssessmentPackage.ASSESSMENT__TASKS:
        return tasks != null;
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
        case AssessmentPackage.ASSESSMENT__NOTES: return AssessmentPackage.NOTES__NOTES;
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
        case AssessmentPackage.NOTES__NOTES: return AssessmentPackage.ASSESSMENT__NOTES;
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

} //AssessmentImpl
