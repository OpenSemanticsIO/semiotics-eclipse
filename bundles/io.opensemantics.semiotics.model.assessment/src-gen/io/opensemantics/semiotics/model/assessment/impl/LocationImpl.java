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
import io.opensemantics.semiotics.model.assessment.Location;
import io.opensemantics.semiotics.model.assessment.Resource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.LocationImpl#getLineStart <em>Line Start</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.LocationImpl#getLineEnd <em>Line End</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.LocationImpl#getColumnStart <em>Column Start</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.LocationImpl#getColumnEnd <em>Column End</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.LocationImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.LOCATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCATION__LINE_START, oldLineStart, lineStart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCATION__LINE_END, oldLineEnd, lineEnd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCATION__COLUMN_START, oldColumnStart, columnStart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCATION__COLUMN_END, oldColumnEnd, columnEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (eContainerFeatureID() != AssessmentPackage.LOCATION__RESOURCE) return null;
		return (Resource)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResource(Resource newResource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newResource, AssessmentPackage.LOCATION__RESOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		if (newResource != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.LOCATION__RESOURCE && newResource != null)) {
			if (EcoreUtil.isAncestor(this, newResource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newResource != null)
				msgs = ((InternalEObject)newResource).eInverseAdd(this, AssessmentPackage.RESOURCE__LOCATION, Resource.class, msgs);
			msgs = basicSetResource(newResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.LOCATION__RESOURCE, newResource, newResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AssessmentPackage.LOCATION__RESOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case AssessmentPackage.LOCATION__RESOURCE:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AssessmentPackage.LOCATION__RESOURCE:
				return eInternalContainer().eInverseRemove(this, AssessmentPackage.RESOURCE__LOCATION, Resource.class, msgs);
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
			case AssessmentPackage.LOCATION__LINE_START:
				return getLineStart();
			case AssessmentPackage.LOCATION__LINE_END:
				return getLineEnd();
			case AssessmentPackage.LOCATION__COLUMN_START:
				return getColumnStart();
			case AssessmentPackage.LOCATION__COLUMN_END:
				return getColumnEnd();
			case AssessmentPackage.LOCATION__RESOURCE:
				return getResource();
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
			case AssessmentPackage.LOCATION__LINE_START:
				setLineStart((Integer)newValue);
				return;
			case AssessmentPackage.LOCATION__LINE_END:
				setLineEnd((Integer)newValue);
				return;
			case AssessmentPackage.LOCATION__COLUMN_START:
				setColumnStart((Integer)newValue);
				return;
			case AssessmentPackage.LOCATION__COLUMN_END:
				setColumnEnd((Integer)newValue);
				return;
			case AssessmentPackage.LOCATION__RESOURCE:
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
			case AssessmentPackage.LOCATION__LINE_START:
				setLineStart(LINE_START_EDEFAULT);
				return;
			case AssessmentPackage.LOCATION__LINE_END:
				setLineEnd(LINE_END_EDEFAULT);
				return;
			case AssessmentPackage.LOCATION__COLUMN_START:
				setColumnStart(COLUMN_START_EDEFAULT);
				return;
			case AssessmentPackage.LOCATION__COLUMN_END:
				setColumnEnd(COLUMN_END_EDEFAULT);
				return;
			case AssessmentPackage.LOCATION__RESOURCE:
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
			case AssessmentPackage.LOCATION__LINE_START:
				return lineStart != LINE_START_EDEFAULT;
			case AssessmentPackage.LOCATION__LINE_END:
				return lineEnd != LINE_END_EDEFAULT;
			case AssessmentPackage.LOCATION__COLUMN_START:
				return columnStart != COLUMN_START_EDEFAULT;
			case AssessmentPackage.LOCATION__COLUMN_END:
				return columnEnd != COLUMN_END_EDEFAULT;
			case AssessmentPackage.LOCATION__RESOURCE:
				return getResource() != null;
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
		result.append(" (lineStart: ");
		result.append(lineStart);
		result.append(", lineEnd: ");
		result.append(lineEnd);
		result.append(", columnStart: ");
		result.append(columnStart);
		result.append(", columnEnd: ");
		result.append(columnEnd);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
