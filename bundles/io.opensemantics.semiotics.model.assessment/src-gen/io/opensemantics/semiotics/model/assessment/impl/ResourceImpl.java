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
import io.opensemantics.semiotics.model.assessment.Contents;
import io.opensemantics.semiotics.model.assessment.Notes;
import io.opensemantics.semiotics.model.assessment.Resource;

import io.opensemantics.semiotics.model.assessment.Resources;
import io.opensemantics.semiotics.model.assessment.Snippet;
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
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ResourceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ResourceImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ResourceImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ResourceImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ResourceImpl#getSnippets <em>Snippets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceImpl extends MinimalEObjectImpl.Container implements Resource {
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
   * The default value of the '{@link #getContents() <em>Contents</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
	protected static final String CONTENTS_EDEFAULT = null;
	/**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
	protected String contents = CONTENTS_EDEFAULT;
	/**
   * The cached value of the '{@link #getSnippets() <em>Snippets</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSnippets()
   * @generated
   * @ordered
   */
	protected EList<Snippet> snippets;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ResourceImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.RESOURCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.RESOURCE__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.RESOURCE__NOTES, oldNotes, notes));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getContents() {
    return contents;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setContents(String newContents) {
    String oldContents = contents;
    contents = newContents;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.RESOURCE__CONTENTS, oldContents, contents));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Resources getResources() {
    if (eContainerFeatureID() != AssessmentPackage.RESOURCE__RESOURCES) return null;
    return (Resources)eInternalContainer();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetResources(Resources newResources, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newResources, AssessmentPackage.RESOURCE__RESOURCES, msgs);
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setResources(Resources newResources) {
    if (newResources != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.RESOURCE__RESOURCES && newResources != null)) {
      if (EcoreUtil.isAncestor(this, newResources))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newResources != null)
        msgs = ((InternalEObject)newResources).eInverseAdd(this, AssessmentPackage.RESOURCES__RESOURCES, Resources.class, msgs);
      msgs = basicSetResources(newResources, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.RESOURCE__RESOURCES, newResources, newResources));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Snippet> getSnippets() {
    if (snippets == null) {
      snippets = new EObjectWithInverseResolvingEList<Snippet>(Snippet.class, this, AssessmentPackage.RESOURCE__SNIPPETS, AssessmentPackage.SNIPPET__RESOURCE);
    }
    return snippets;
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
      case AssessmentPackage.RESOURCE__RESOURCES:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetResources((Resources)otherEnd, msgs);
      case AssessmentPackage.RESOURCE__SNIPPETS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSnippets()).basicAdd(otherEnd, msgs);
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
      case AssessmentPackage.RESOURCE__RESOURCES:
        return basicSetResources(null, msgs);
      case AssessmentPackage.RESOURCE__SNIPPETS:
        return ((InternalEList<?>)getSnippets()).basicRemove(otherEnd, msgs);
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
      case AssessmentPackage.RESOURCE__RESOURCES:
        return eInternalContainer().eInverseRemove(this, AssessmentPackage.RESOURCES__RESOURCES, Resources.class, msgs);
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
      case AssessmentPackage.RESOURCE__LABEL:
        return getLabel();
      case AssessmentPackage.RESOURCE__NOTES:
        return getNotes();
      case AssessmentPackage.RESOURCE__CONTENTS:
        return getContents();
      case AssessmentPackage.RESOURCE__RESOURCES:
        return getResources();
      case AssessmentPackage.RESOURCE__SNIPPETS:
        return getSnippets();
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
      case AssessmentPackage.RESOURCE__LABEL:
        setLabel((String)newValue);
        return;
      case AssessmentPackage.RESOURCE__NOTES:
        setNotes((String)newValue);
        return;
      case AssessmentPackage.RESOURCE__CONTENTS:
        setContents((String)newValue);
        return;
      case AssessmentPackage.RESOURCE__RESOURCES:
        setResources((Resources)newValue);
        return;
      case AssessmentPackage.RESOURCE__SNIPPETS:
        getSnippets().clear();
        getSnippets().addAll((Collection<? extends Snippet>)newValue);
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
      case AssessmentPackage.RESOURCE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case AssessmentPackage.RESOURCE__NOTES:
        setNotes(NOTES_EDEFAULT);
        return;
      case AssessmentPackage.RESOURCE__CONTENTS:
        setContents(CONTENTS_EDEFAULT);
        return;
      case AssessmentPackage.RESOURCE__RESOURCES:
        setResources((Resources)null);
        return;
      case AssessmentPackage.RESOURCE__SNIPPETS:
        getSnippets().clear();
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
      case AssessmentPackage.RESOURCE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case AssessmentPackage.RESOURCE__NOTES:
        return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
      case AssessmentPackage.RESOURCE__CONTENTS:
        return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
      case AssessmentPackage.RESOURCE__RESOURCES:
        return getResources() != null;
      case AssessmentPackage.RESOURCE__SNIPPETS:
        return snippets != null && !snippets.isEmpty();
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
        case AssessmentPackage.RESOURCE__NOTES: return AssessmentPackage.NOTES__NOTES;
        default: return -1;
      }
    }
    if (baseClass == Contents.class) {
      switch (derivedFeatureID) {
        case AssessmentPackage.RESOURCE__CONTENTS: return AssessmentPackage.CONTENTS__CONTENTS;
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
        case AssessmentPackage.NOTES__NOTES: return AssessmentPackage.RESOURCE__NOTES;
        default: return -1;
      }
    }
    if (baseClass == Contents.class) {
      switch (baseFeatureID) {
        case AssessmentPackage.CONTENTS__CONTENTS: return AssessmentPackage.RESOURCE__CONTENTS;
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
    result.append(", contents: ");
    result.append(contents);
    result.append(')');
    return result.toString();
  }

} //ResourceImpl
