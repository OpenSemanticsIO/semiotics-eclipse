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

import io.opensemantics.semiotics.model.assessment.Account;
import io.opensemantics.semiotics.model.assessment.Application;
import io.opensemantics.semiotics.model.assessment.Assessment;
import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Controller;
import io.opensemantics.semiotics.model.assessment.Entitlement;
import io.opensemantics.semiotics.model.assessment.Language;
import io.opensemantics.semiotics.model.assessment.Library;
import io.opensemantics.semiotics.model.assessment.Model;
import io.opensemantics.semiotics.model.assessment.Notes;
import io.opensemantics.semiotics.model.assessment.Resource;
import io.opensemantics.semiotics.model.assessment.Scm;
import io.opensemantics.semiotics.model.assessment.Sink;
import io.opensemantics.semiotics.model.assessment.Url;
import io.opensemantics.semiotics.model.assessment.View;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getEntitlements <em>Entitlements</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getControllers <em>Controllers</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getModels <em>Models</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getScm <em>Scm</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getViews <em>Views</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getSinks <em>Sinks</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getUrls <em>Urls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
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
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> accounts;

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
	 * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllers;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> models;

	/**
	 * The cached value of the '{@link #getScm() <em>Scm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScm()
	 * @generated
	 * @ordered
	 */
	protected Scm scm;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViews()
	 * @generated
	 * @ordered
	 */
	protected EList<View> views;

	/**
	 * The cached value of the '{@link #getSinks() <em>Sinks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Sink> sinks;

	/**
	 * The cached value of the '{@link #getLanguages() <em>Languages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> languages;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resources;

	/**
	 * The cached value of the '{@link #getUrls() <em>Urls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrls()
	 * @generated
	 * @ordered
	 */
	protected EList<Url> urls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AssessmentPackage.Literals.APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assessment getAssessment() {
		if (eContainerFeatureID() != AssessmentPackage.APPLICATION__ASSESSMENT) return null;
		return (Assessment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssessment(Assessment newAssessment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssessment, AssessmentPackage.APPLICATION__ASSESSMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessment(Assessment newAssessment) {
		if (newAssessment != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.APPLICATION__ASSESSMENT && newAssessment != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__ASSESSMENT, newAssessment, newAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Account> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectContainmentWithInverseEList<Account>(Account.class, this, AssessmentPackage.APPLICATION__ACCOUNTS, AssessmentPackage.ACCOUNT__APPLICATION);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entitlement> getEntitlements() {
		if (entitlements == null) {
			entitlements = new EObjectContainmentWithInverseEList<Entitlement>(Entitlement.class, this, AssessmentPackage.APPLICATION__ENTITLEMENTS, AssessmentPackage.ENTITLEMENT__APPLICATION);
		}
		return entitlements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getControllers() {
		if (controllers == null) {
			controllers = new EObjectContainmentWithInverseEList<Controller>(Controller.class, this, AssessmentPackage.APPLICATION__CONTROLLERS, AssessmentPackage.CONTROLLER__APPLICATION);
		}
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModels() {
		if (models == null) {
			models = new EObjectContainmentWithInverseEList<Model>(Model.class, this, AssessmentPackage.APPLICATION__MODELS, AssessmentPackage.MODEL__APPLICATION);
		}
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scm getScm() {
		return scm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScm(Scm newScm, NotificationChain msgs) {
		Scm oldScm = scm;
		scm = newScm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__SCM, oldScm, newScm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScm(Scm newScm) {
		if (newScm != scm) {
			NotificationChain msgs = null;
			if (scm != null)
				msgs = ((InternalEObject)scm).eInverseRemove(this, AssessmentPackage.SCM__APPLICATION, Scm.class, msgs);
			if (newScm != null)
				msgs = ((InternalEObject)newScm).eInverseAdd(this, AssessmentPackage.SCM__APPLICATION, Scm.class, msgs);
			msgs = basicSetScm(newScm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__SCM, newScm, newScm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectContainmentWithInverseEList<Library>(Library.class, this, AssessmentPackage.APPLICATION__LIBRARIES, AssessmentPackage.LIBRARY__APPLICATION);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getViews() {
		if (views == null) {
			views = new EObjectContainmentWithInverseEList<View>(View.class, this, AssessmentPackage.APPLICATION__VIEWS, AssessmentPackage.VIEW__APPLICATION);
		}
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sink> getSinks() {
		if (sinks == null) {
			sinks = new EObjectContainmentWithInverseEList<Sink>(Sink.class, this, AssessmentPackage.APPLICATION__SINKS, AssessmentPackage.SINK__APPLICATION);
		}
		return sinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Language> getLanguages() {
		if (languages == null) {
			languages = new EDataTypeUniqueEList<Language>(Language.class, this, AssessmentPackage.APPLICATION__LANGUAGES);
		}
		return languages;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResources() {
		if (resources == null) {
			resources = new EObjectContainmentWithInverseEList<Resource>(Resource.class, this, AssessmentPackage.APPLICATION__RESOURCES, AssessmentPackage.RESOURCE__APPLICATION);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Url> getUrls() {
		if (urls == null) {
			urls = new EObjectContainmentEList<Url>(Url.class, this, AssessmentPackage.APPLICATION__URLS);
		}
		return urls;
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
			case AssessmentPackage.APPLICATION__ASSESSMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssessment((Assessment)otherEnd, msgs);
			case AssessmentPackage.APPLICATION__ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccounts()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__ENTITLEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntitlements()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__CONTROLLERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControllers()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModels()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__SCM:
				if (scm != null)
					msgs = ((InternalEObject)scm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__SCM, null, msgs);
				return basicSetScm((Scm)otherEnd, msgs);
			case AssessmentPackage.APPLICATION__LIBRARIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLibraries()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__VIEWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViews()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__SINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSinks()).basicAdd(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__RESOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResources()).basicAdd(otherEnd, msgs);
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
			case AssessmentPackage.APPLICATION__ASSESSMENT:
				return basicSetAssessment(null, msgs);
			case AssessmentPackage.APPLICATION__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__ENTITLEMENTS:
				return ((InternalEList<?>)getEntitlements()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__CONTROLLERS:
				return ((InternalEList<?>)getControllers()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__SCM:
				return basicSetScm(null, msgs);
			case AssessmentPackage.APPLICATION__LIBRARIES:
				return ((InternalEList<?>)getLibraries()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__VIEWS:
				return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__SINKS:
				return ((InternalEList<?>)getSinks()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
			case AssessmentPackage.APPLICATION__URLS:
				return ((InternalEList<?>)getUrls()).basicRemove(otherEnd, msgs);
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
			case AssessmentPackage.APPLICATION__ASSESSMENT:
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
			case AssessmentPackage.APPLICATION__LABEL:
				return getLabel();
			case AssessmentPackage.APPLICATION__NOTES:
				return getNotes();
			case AssessmentPackage.APPLICATION__ASSESSMENT:
				return getAssessment();
			case AssessmentPackage.APPLICATION__ACCOUNTS:
				return getAccounts();
			case AssessmentPackage.APPLICATION__ENTITLEMENTS:
				return getEntitlements();
			case AssessmentPackage.APPLICATION__CONTROLLERS:
				return getControllers();
			case AssessmentPackage.APPLICATION__MODELS:
				return getModels();
			case AssessmentPackage.APPLICATION__SCM:
				return getScm();
			case AssessmentPackage.APPLICATION__LIBRARIES:
				return getLibraries();
			case AssessmentPackage.APPLICATION__VIEWS:
				return getViews();
			case AssessmentPackage.APPLICATION__SINKS:
				return getSinks();
			case AssessmentPackage.APPLICATION__LANGUAGES:
				return getLanguages();
			case AssessmentPackage.APPLICATION__RESOURCES:
				return getResources();
			case AssessmentPackage.APPLICATION__URLS:
				return getUrls();
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
			case AssessmentPackage.APPLICATION__LABEL:
				setLabel((String)newValue);
				return;
			case AssessmentPackage.APPLICATION__NOTES:
				setNotes((String)newValue);
				return;
			case AssessmentPackage.APPLICATION__ASSESSMENT:
				setAssessment((Assessment)newValue);
				return;
			case AssessmentPackage.APPLICATION__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Account>)newValue);
				return;
			case AssessmentPackage.APPLICATION__ENTITLEMENTS:
				getEntitlements().clear();
				getEntitlements().addAll((Collection<? extends Entitlement>)newValue);
				return;
			case AssessmentPackage.APPLICATION__CONTROLLERS:
				getControllers().clear();
				getControllers().addAll((Collection<? extends Controller>)newValue);
				return;
			case AssessmentPackage.APPLICATION__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends Model>)newValue);
				return;
			case AssessmentPackage.APPLICATION__SCM:
				setScm((Scm)newValue);
				return;
			case AssessmentPackage.APPLICATION__LIBRARIES:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case AssessmentPackage.APPLICATION__VIEWS:
				getViews().clear();
				getViews().addAll((Collection<? extends View>)newValue);
				return;
			case AssessmentPackage.APPLICATION__SINKS:
				getSinks().clear();
				getSinks().addAll((Collection<? extends Sink>)newValue);
				return;
			case AssessmentPackage.APPLICATION__LANGUAGES:
				getLanguages().clear();
				getLanguages().addAll((Collection<? extends Language>)newValue);
				return;
			case AssessmentPackage.APPLICATION__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case AssessmentPackage.APPLICATION__URLS:
				getUrls().clear();
				getUrls().addAll((Collection<? extends Url>)newValue);
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
			case AssessmentPackage.APPLICATION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case AssessmentPackage.APPLICATION__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case AssessmentPackage.APPLICATION__ASSESSMENT:
				setAssessment((Assessment)null);
				return;
			case AssessmentPackage.APPLICATION__ACCOUNTS:
				getAccounts().clear();
				return;
			case AssessmentPackage.APPLICATION__ENTITLEMENTS:
				getEntitlements().clear();
				return;
			case AssessmentPackage.APPLICATION__CONTROLLERS:
				getControllers().clear();
				return;
			case AssessmentPackage.APPLICATION__MODELS:
				getModels().clear();
				return;
			case AssessmentPackage.APPLICATION__SCM:
				setScm((Scm)null);
				return;
			case AssessmentPackage.APPLICATION__LIBRARIES:
				getLibraries().clear();
				return;
			case AssessmentPackage.APPLICATION__VIEWS:
				getViews().clear();
				return;
			case AssessmentPackage.APPLICATION__SINKS:
				getSinks().clear();
				return;
			case AssessmentPackage.APPLICATION__LANGUAGES:
				getLanguages().clear();
				return;
			case AssessmentPackage.APPLICATION__RESOURCES:
				getResources().clear();
				return;
			case AssessmentPackage.APPLICATION__URLS:
				getUrls().clear();
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
			case AssessmentPackage.APPLICATION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case AssessmentPackage.APPLICATION__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case AssessmentPackage.APPLICATION__ASSESSMENT:
				return getAssessment() != null;
			case AssessmentPackage.APPLICATION__ACCOUNTS:
				return accounts != null && !accounts.isEmpty();
			case AssessmentPackage.APPLICATION__ENTITLEMENTS:
				return entitlements != null && !entitlements.isEmpty();
			case AssessmentPackage.APPLICATION__CONTROLLERS:
				return controllers != null && !controllers.isEmpty();
			case AssessmentPackage.APPLICATION__MODELS:
				return models != null && !models.isEmpty();
			case AssessmentPackage.APPLICATION__SCM:
				return scm != null;
			case AssessmentPackage.APPLICATION__LIBRARIES:
				return libraries != null && !libraries.isEmpty();
			case AssessmentPackage.APPLICATION__VIEWS:
				return views != null && !views.isEmpty();
			case AssessmentPackage.APPLICATION__SINKS:
				return sinks != null && !sinks.isEmpty();
			case AssessmentPackage.APPLICATION__LANGUAGES:
				return languages != null && !languages.isEmpty();
			case AssessmentPackage.APPLICATION__RESOURCES:
				return resources != null && !resources.isEmpty();
			case AssessmentPackage.APPLICATION__URLS:
				return urls != null && !urls.isEmpty();
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
				case AssessmentPackage.APPLICATION__NOTES: return AssessmentPackage.NOTES__NOTES;
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
				case AssessmentPackage.NOTES__NOTES: return AssessmentPackage.APPLICATION__NOTES;
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
		result.append(", languages: ");
		result.append(languages);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
