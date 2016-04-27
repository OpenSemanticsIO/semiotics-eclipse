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

import io.opensemantics.semiotics.model.assessment.Accounts;
import io.opensemantics.semiotics.model.assessment.Application;
import io.opensemantics.semiotics.model.assessment.Applications;
import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Controllers;
import io.opensemantics.semiotics.model.assessment.Entitlements;
import io.opensemantics.semiotics.model.assessment.Language;
import io.opensemantics.semiotics.model.assessment.Models;
import io.opensemantics.semiotics.model.assessment.Notes;
import io.opensemantics.semiotics.model.assessment.Resources;
import io.opensemantics.semiotics.model.assessment.Scm;
import io.opensemantics.semiotics.model.assessment.Sinks;
import io.opensemantics.semiotics.model.assessment.Views;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getEntitlements <em>Entitlements</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getControllers <em>Controllers</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getModels <em>Models</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getScm <em>Scm</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getViews <em>Views</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getSinks <em>Sinks</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getLanguages <em>Languages</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getInternalURL <em>Internal URL</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl#getExternalURL <em>External URL</em>}</li>
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
   * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAccounts()
   * @generated
   * @ordered
   */
	protected Accounts accounts;

	/**
   * The cached value of the '{@link #getEntitlements() <em>Entitlements</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getEntitlements()
   * @generated
   * @ordered
   */
	protected Entitlements entitlements;

	/**
   * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getControllers()
   * @generated
   * @ordered
   */
	protected Controllers controllers;

	/**
   * The cached value of the '{@link #getModels() <em>Models</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getModels()
   * @generated
   * @ordered
   */
	protected Models models;

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
   * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getViews()
   * @generated
   * @ordered
   */
	protected Views views;

	/**
   * The cached value of the '{@link #getSinks() <em>Sinks</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSinks()
   * @generated
   * @ordered
   */
	protected Sinks sinks;

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
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
	protected Resources resources;

	/**
   * The default value of the '{@link #getInternalURL() <em>Internal URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInternalURL()
   * @generated
   * @ordered
   */
  protected static final String INTERNAL_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInternalURL() <em>Internal URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInternalURL()
   * @generated
   * @ordered
   */
  protected String internalURL = INTERNAL_URL_EDEFAULT;

  /**
   * The default value of the '{@link #getExternalURL() <em>External URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalURL()
   * @generated
   * @ordered
   */
  protected static final String EXTERNAL_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExternalURL() <em>External URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalURL()
   * @generated
   * @ordered
   */
  protected String externalURL = EXTERNAL_URL_EDEFAULT;

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
	public Accounts getAccounts() {
    return accounts;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAccounts(Accounts newAccounts, NotificationChain msgs) {
    Accounts oldAccounts = accounts;
    accounts = newAccounts;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__ACCOUNTS, oldAccounts, newAccounts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAccounts(Accounts newAccounts) {
    if (newAccounts != accounts) {
      NotificationChain msgs = null;
      if (accounts != null)
        msgs = ((InternalEObject)accounts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__ACCOUNTS, null, msgs);
      if (newAccounts != null)
        msgs = ((InternalEObject)newAccounts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__ACCOUNTS, null, msgs);
      msgs = basicSetAccounts(newAccounts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__ACCOUNTS, newAccounts, newAccounts));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Entitlements getEntitlements() {
    return entitlements;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetEntitlements(Entitlements newEntitlements, NotificationChain msgs) {
    Entitlements oldEntitlements = entitlements;
    entitlements = newEntitlements;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__ENTITLEMENTS, oldEntitlements, newEntitlements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setEntitlements(Entitlements newEntitlements) {
    if (newEntitlements != entitlements) {
      NotificationChain msgs = null;
      if (entitlements != null)
        msgs = ((InternalEObject)entitlements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__ENTITLEMENTS, null, msgs);
      if (newEntitlements != null)
        msgs = ((InternalEObject)newEntitlements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__ENTITLEMENTS, null, msgs);
      msgs = basicSetEntitlements(newEntitlements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__ENTITLEMENTS, newEntitlements, newEntitlements));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Controllers getControllers() {
    return controllers;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetControllers(Controllers newControllers, NotificationChain msgs) {
    Controllers oldControllers = controllers;
    controllers = newControllers;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__CONTROLLERS, oldControllers, newControllers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setControllers(Controllers newControllers) {
    if (newControllers != controllers) {
      NotificationChain msgs = null;
      if (controllers != null)
        msgs = ((InternalEObject)controllers).eInverseRemove(this, AssessmentPackage.CONTROLLERS__APPLICATION, Controllers.class, msgs);
      if (newControllers != null)
        msgs = ((InternalEObject)newControllers).eInverseAdd(this, AssessmentPackage.CONTROLLERS__APPLICATION, Controllers.class, msgs);
      msgs = basicSetControllers(newControllers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__CONTROLLERS, newControllers, newControllers));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Models getModels() {
    return models;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetModels(Models newModels, NotificationChain msgs) {
    Models oldModels = models;
    models = newModels;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__MODELS, oldModels, newModels);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setModels(Models newModels) {
    if (newModels != models) {
      NotificationChain msgs = null;
      if (models != null)
        msgs = ((InternalEObject)models).eInverseRemove(this, AssessmentPackage.MODELS__APPLICATION, Models.class, msgs);
      if (newModels != null)
        msgs = ((InternalEObject)newModels).eInverseAdd(this, AssessmentPackage.MODELS__APPLICATION, Models.class, msgs);
      msgs = basicSetModels(newModels, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__MODELS, newModels, newModels));
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
	public Views getViews() {
    return views;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetViews(Views newViews, NotificationChain msgs) {
    Views oldViews = views;
    views = newViews;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__VIEWS, oldViews, newViews);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setViews(Views newViews) {
    if (newViews != views) {
      NotificationChain msgs = null;
      if (views != null)
        msgs = ((InternalEObject)views).eInverseRemove(this, AssessmentPackage.VIEWS__APPLICATION, Views.class, msgs);
      if (newViews != null)
        msgs = ((InternalEObject)newViews).eInverseAdd(this, AssessmentPackage.VIEWS__APPLICATION, Views.class, msgs);
      msgs = basicSetViews(newViews, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__VIEWS, newViews, newViews));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Sinks getSinks() {
    return sinks;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetSinks(Sinks newSinks, NotificationChain msgs) {
    Sinks oldSinks = sinks;
    sinks = newSinks;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__SINKS, oldSinks, newSinks);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setSinks(Sinks newSinks) {
    if (newSinks != sinks) {
      NotificationChain msgs = null;
      if (sinks != null)
        msgs = ((InternalEObject)sinks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__SINKS, null, msgs);
      if (newSinks != null)
        msgs = ((InternalEObject)newSinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__SINKS, null, msgs);
      msgs = basicSetSinks(newSinks, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__SINKS, newSinks, newSinks));
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
	public Resources getResources() {
    return resources;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetResources(Resources newResources, NotificationChain msgs) {
    Resources oldResources = resources;
    resources = newResources;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__RESOURCES, oldResources, newResources);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setResources(Resources newResources) {
    if (newResources != resources) {
      NotificationChain msgs = null;
      if (resources != null)
        msgs = ((InternalEObject)resources).eInverseRemove(this, AssessmentPackage.RESOURCES__APPLICATION, Resources.class, msgs);
      if (newResources != null)
        msgs = ((InternalEObject)newResources).eInverseAdd(this, AssessmentPackage.RESOURCES__APPLICATION, Resources.class, msgs);
      msgs = basicSetResources(newResources, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__RESOURCES, newResources, newResources));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Applications getApplications() {
    if (eContainerFeatureID() != AssessmentPackage.APPLICATION__APPLICATIONS) return null;
    return (Applications)eInternalContainer();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetApplications(Applications newApplications, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newApplications, AssessmentPackage.APPLICATION__APPLICATIONS, msgs);
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setApplications(Applications newApplications) {
    if (newApplications != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.APPLICATION__APPLICATIONS && newApplications != null)) {
      if (EcoreUtil.isAncestor(this, newApplications))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newApplications != null)
        msgs = ((InternalEObject)newApplications).eInverseAdd(this, AssessmentPackage.APPLICATIONS__APPLICATIONS, Applications.class, msgs);
      msgs = basicSetApplications(newApplications, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__APPLICATIONS, newApplications, newApplications));
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInternalURL() {
    return internalURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInternalURL(String newInternalURL) {
    String oldInternalURL = internalURL;
    internalURL = newInternalURL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__INTERNAL_URL, oldInternalURL, internalURL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExternalURL() {
    return externalURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternalURL(String newExternalURL) {
    String oldExternalURL = externalURL;
    externalURL = newExternalURL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.APPLICATION__EXTERNAL_URL, oldExternalURL, externalURL));
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
      case AssessmentPackage.APPLICATION__CONTROLLERS:
        if (controllers != null)
          msgs = ((InternalEObject)controllers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__CONTROLLERS, null, msgs);
        return basicSetControllers((Controllers)otherEnd, msgs);
      case AssessmentPackage.APPLICATION__MODELS:
        if (models != null)
          msgs = ((InternalEObject)models).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__MODELS, null, msgs);
        return basicSetModels((Models)otherEnd, msgs);
      case AssessmentPackage.APPLICATION__SCM:
        if (scm != null)
          msgs = ((InternalEObject)scm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__SCM, null, msgs);
        return basicSetScm((Scm)otherEnd, msgs);
      case AssessmentPackage.APPLICATION__VIEWS:
        if (views != null)
          msgs = ((InternalEObject)views).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__VIEWS, null, msgs);
        return basicSetViews((Views)otherEnd, msgs);
      case AssessmentPackage.APPLICATION__RESOURCES:
        if (resources != null)
          msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AssessmentPackage.APPLICATION__RESOURCES, null, msgs);
        return basicSetResources((Resources)otherEnd, msgs);
      case AssessmentPackage.APPLICATION__APPLICATIONS:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetApplications((Applications)otherEnd, msgs);
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
      case AssessmentPackage.APPLICATION__ACCOUNTS:
        return basicSetAccounts(null, msgs);
      case AssessmentPackage.APPLICATION__ENTITLEMENTS:
        return basicSetEntitlements(null, msgs);
      case AssessmentPackage.APPLICATION__CONTROLLERS:
        return basicSetControllers(null, msgs);
      case AssessmentPackage.APPLICATION__MODELS:
        return basicSetModels(null, msgs);
      case AssessmentPackage.APPLICATION__SCM:
        return basicSetScm(null, msgs);
      case AssessmentPackage.APPLICATION__VIEWS:
        return basicSetViews(null, msgs);
      case AssessmentPackage.APPLICATION__SINKS:
        return basicSetSinks(null, msgs);
      case AssessmentPackage.APPLICATION__RESOURCES:
        return basicSetResources(null, msgs);
      case AssessmentPackage.APPLICATION__APPLICATIONS:
        return basicSetApplications(null, msgs);
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
      case AssessmentPackage.APPLICATION__APPLICATIONS:
        return eInternalContainer().eInverseRemove(this, AssessmentPackage.APPLICATIONS__APPLICATIONS, Applications.class, msgs);
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
      case AssessmentPackage.APPLICATION__VIEWS:
        return getViews();
      case AssessmentPackage.APPLICATION__SINKS:
        return getSinks();
      case AssessmentPackage.APPLICATION__LANGUAGES:
        return getLanguages();
      case AssessmentPackage.APPLICATION__RESOURCES:
        return getResources();
      case AssessmentPackage.APPLICATION__APPLICATIONS:
        return getApplications();
      case AssessmentPackage.APPLICATION__INTERNAL_URL:
        return getInternalURL();
      case AssessmentPackage.APPLICATION__EXTERNAL_URL:
        return getExternalURL();
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
      case AssessmentPackage.APPLICATION__ACCOUNTS:
        setAccounts((Accounts)newValue);
        return;
      case AssessmentPackage.APPLICATION__ENTITLEMENTS:
        setEntitlements((Entitlements)newValue);
        return;
      case AssessmentPackage.APPLICATION__CONTROLLERS:
        setControllers((Controllers)newValue);
        return;
      case AssessmentPackage.APPLICATION__MODELS:
        setModels((Models)newValue);
        return;
      case AssessmentPackage.APPLICATION__SCM:
        setScm((Scm)newValue);
        return;
      case AssessmentPackage.APPLICATION__VIEWS:
        setViews((Views)newValue);
        return;
      case AssessmentPackage.APPLICATION__SINKS:
        setSinks((Sinks)newValue);
        return;
      case AssessmentPackage.APPLICATION__LANGUAGES:
        getLanguages().clear();
        getLanguages().addAll((Collection<? extends Language>)newValue);
        return;
      case AssessmentPackage.APPLICATION__RESOURCES:
        setResources((Resources)newValue);
        return;
      case AssessmentPackage.APPLICATION__APPLICATIONS:
        setApplications((Applications)newValue);
        return;
      case AssessmentPackage.APPLICATION__INTERNAL_URL:
        setInternalURL((String)newValue);
        return;
      case AssessmentPackage.APPLICATION__EXTERNAL_URL:
        setExternalURL((String)newValue);
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
      case AssessmentPackage.APPLICATION__ACCOUNTS:
        setAccounts((Accounts)null);
        return;
      case AssessmentPackage.APPLICATION__ENTITLEMENTS:
        setEntitlements((Entitlements)null);
        return;
      case AssessmentPackage.APPLICATION__CONTROLLERS:
        setControllers((Controllers)null);
        return;
      case AssessmentPackage.APPLICATION__MODELS:
        setModels((Models)null);
        return;
      case AssessmentPackage.APPLICATION__SCM:
        setScm((Scm)null);
        return;
      case AssessmentPackage.APPLICATION__VIEWS:
        setViews((Views)null);
        return;
      case AssessmentPackage.APPLICATION__SINKS:
        setSinks((Sinks)null);
        return;
      case AssessmentPackage.APPLICATION__LANGUAGES:
        getLanguages().clear();
        return;
      case AssessmentPackage.APPLICATION__RESOURCES:
        setResources((Resources)null);
        return;
      case AssessmentPackage.APPLICATION__APPLICATIONS:
        setApplications((Applications)null);
        return;
      case AssessmentPackage.APPLICATION__INTERNAL_URL:
        setInternalURL(INTERNAL_URL_EDEFAULT);
        return;
      case AssessmentPackage.APPLICATION__EXTERNAL_URL:
        setExternalURL(EXTERNAL_URL_EDEFAULT);
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
      case AssessmentPackage.APPLICATION__ACCOUNTS:
        return accounts != null;
      case AssessmentPackage.APPLICATION__ENTITLEMENTS:
        return entitlements != null;
      case AssessmentPackage.APPLICATION__CONTROLLERS:
        return controllers != null;
      case AssessmentPackage.APPLICATION__MODELS:
        return models != null;
      case AssessmentPackage.APPLICATION__SCM:
        return scm != null;
      case AssessmentPackage.APPLICATION__VIEWS:
        return views != null;
      case AssessmentPackage.APPLICATION__SINKS:
        return sinks != null;
      case AssessmentPackage.APPLICATION__LANGUAGES:
        return languages != null && !languages.isEmpty();
      case AssessmentPackage.APPLICATION__RESOURCES:
        return resources != null;
      case AssessmentPackage.APPLICATION__APPLICATIONS:
        return getApplications() != null;
      case AssessmentPackage.APPLICATION__INTERNAL_URL:
        return INTERNAL_URL_EDEFAULT == null ? internalURL != null : !INTERNAL_URL_EDEFAULT.equals(internalURL);
      case AssessmentPackage.APPLICATION__EXTERNAL_URL:
        return EXTERNAL_URL_EDEFAULT == null ? externalURL != null : !EXTERNAL_URL_EDEFAULT.equals(externalURL);
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
    result.append(", internalURL: ");
    result.append(internalURL);
    result.append(", externalURL: ");
    result.append(externalURL);
    result.append(')');
    return result.toString();
  }

} //ApplicationImpl
