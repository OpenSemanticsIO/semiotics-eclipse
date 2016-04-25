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
import io.opensemantics.semiotics.model.assessment.Resource;
import io.opensemantics.semiotics.model.assessment.Snippet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Snippet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.SnippetImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.SnippetImpl#getLineEnd <em>Line End</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.SnippetImpl#getColumnStart <em>Column Start</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.SnippetImpl#getColumnEnd <em>Column End</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.SnippetImpl#getLineStart <em>Line Start</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.SnippetImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SnippetImpl extends GraphNodeImpl implements Snippet {
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
	 * The default value of the '{@link #getLineEnd() <em>Line End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineEnd() <em>Line End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineEnd()
	 * @generated
	 * @ordered
	 */
	protected int lineEnd = LINE_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnStart() <em>Column Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnStart()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumnStart() <em>Column Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnStart()
	 * @generated
	 * @ordered
	 */
	protected int columnStart = COLUMN_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnEnd() <em>Column End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumnEnd() <em>Column End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnEnd()
	 * @generated
	 * @ordered
	 */
	protected int columnEnd = COLUMN_END_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineStart() <em>Line Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStart()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineStart() <em>Line Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStart()
	 * @generated
	 * @ordered
	 */
	protected int lineStart = LINE_START_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SnippetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.SNIPPET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineEnd() {
		return lineEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineEnd(int newLineEnd) {
		int oldLineEnd = lineEnd;
		lineEnd = newLineEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SNIPPET__LINE_END, oldLineEnd, lineEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumnStart() {
		return columnStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnStart(int newColumnStart) {
		int oldColumnStart = columnStart;
		columnStart = newColumnStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SNIPPET__COLUMN_START, oldColumnStart, columnStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumnEnd() {
		return columnEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnEnd(int newColumnEnd) {
		int oldColumnEnd = columnEnd;
		columnEnd = newColumnEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SNIPPET__COLUMN_END, oldColumnEnd, columnEnd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SNIPPET__CONTENTS, oldContents, contents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineStart() {
		return lineStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStart(int newLineStart) {
		int oldLineStart = lineStart;
		lineStart = newLineStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SNIPPET__LINE_START, oldLineStart, lineStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AssessmentPackage.SNIPPET__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.SNIPPET__RESOURCE, oldResource, newResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		if (newResource != resource) {
			NotificationChain msgs = null;
			if (resource != null)
				msgs = ((InternalEObject)resource).eInverseRemove(this, AssessmentPackage.RESOURCE__SNIPPETS, Resource.class, msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, AssessmentPackage.RESOURCE__SNIPPETS, Resource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.SNIPPET__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.SNIPPET__RESOURCE:
				if (resource != null)
					msgs = ((InternalEObject)resource).eInverseRemove(this, AssessmentPackage.RESOURCE__SNIPPETS, Resource.class, msgs);
				return basicSetResource((Resource)otherEnd, msgs);
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
			case AssessmentPackage.SNIPPET__RESOURCE:
				return basicSetResource(null, msgs);
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
			case AssessmentPackage.SNIPPET__CONTENTS:
				return getContents();
			case AssessmentPackage.SNIPPET__LINE_END:
				return getLineEnd();
			case AssessmentPackage.SNIPPET__COLUMN_START:
				return getColumnStart();
			case AssessmentPackage.SNIPPET__COLUMN_END:
				return getColumnEnd();
			case AssessmentPackage.SNIPPET__LINE_START:
				return getLineStart();
			case AssessmentPackage.SNIPPET__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case AssessmentPackage.SNIPPET__CONTENTS:
				setContents((String)newValue);
				return;
			case AssessmentPackage.SNIPPET__LINE_END:
				setLineEnd((Integer)newValue);
				return;
			case AssessmentPackage.SNIPPET__COLUMN_START:
				setColumnStart((Integer)newValue);
				return;
			case AssessmentPackage.SNIPPET__COLUMN_END:
				setColumnEnd((Integer)newValue);
				return;
			case AssessmentPackage.SNIPPET__LINE_START:
				setLineStart((Integer)newValue);
				return;
			case AssessmentPackage.SNIPPET__RESOURCE:
				setResource((Resource)newValue);
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
			case AssessmentPackage.SNIPPET__CONTENTS:
				setContents(CONTENTS_EDEFAULT);
				return;
			case AssessmentPackage.SNIPPET__LINE_END:
				setLineEnd(LINE_END_EDEFAULT);
				return;
			case AssessmentPackage.SNIPPET__COLUMN_START:
				setColumnStart(COLUMN_START_EDEFAULT);
				return;
			case AssessmentPackage.SNIPPET__COLUMN_END:
				setColumnEnd(COLUMN_END_EDEFAULT);
				return;
			case AssessmentPackage.SNIPPET__LINE_START:
				setLineStart(LINE_START_EDEFAULT);
				return;
			case AssessmentPackage.SNIPPET__RESOURCE:
				setResource((Resource)null);
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
			case AssessmentPackage.SNIPPET__CONTENTS:
				return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
			case AssessmentPackage.SNIPPET__LINE_END:
				return lineEnd != LINE_END_EDEFAULT;
			case AssessmentPackage.SNIPPET__COLUMN_START:
				return columnStart != COLUMN_START_EDEFAULT;
			case AssessmentPackage.SNIPPET__COLUMN_END:
				return columnEnd != COLUMN_END_EDEFAULT;
			case AssessmentPackage.SNIPPET__LINE_START:
				return lineStart != LINE_START_EDEFAULT;
			case AssessmentPackage.SNIPPET__RESOURCE:
				return resource != null;
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
		if (baseClass == Contents.class) {
			switch (derivedFeatureID) {
				case AssessmentPackage.SNIPPET__CONTENTS: return AssessmentPackage.CONTENTS__CONTENTS;
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
		if (baseClass == Contents.class) {
			switch (baseFeatureID) {
				case AssessmentPackage.CONTENTS__CONTENTS: return AssessmentPackage.SNIPPET__CONTENTS;
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
		result.append(" (contents: ");
		result.append(contents);
		result.append(", lineEnd: ");
		result.append(lineEnd);
		result.append(", columnStart: ");
		result.append(columnStart);
		result.append(", columnEnd: ");
		result.append(columnEnd);
		result.append(", lineStart: ");
		result.append(lineStart);
		result.append(')');
		return result.toString();
	}

} //SnippetImpl
