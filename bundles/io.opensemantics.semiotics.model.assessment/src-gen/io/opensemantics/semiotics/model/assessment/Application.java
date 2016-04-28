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
package io.opensemantics.semiotics.model.assessment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getEntitlements <em>Entitlements</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getControllers <em>Controllers</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getModels <em>Models</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getScm <em>Scm</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getViews <em>Views</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getSinks <em>Sinks</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getResources <em>Resources</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getApplications <em>Applications</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getInternalURL <em>Internal URL</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getExternalURL <em>External URL</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends Label, Notes {
	/**
   * Returns the value of the '<em><b>Accounts</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Accounts</em>' containment reference.
   * @see #setAccounts(Accounts)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Accounts()
   * @model containment="true"
   * @generated
   */
	Accounts getAccounts();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getAccounts <em>Accounts</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Accounts</em>' containment reference.
   * @see #getAccounts()
   * @generated
   */
	void setAccounts(Accounts value);

	/**
   * Returns the value of the '<em><b>Entitlements</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entitlements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Entitlements</em>' containment reference.
   * @see #setEntitlements(Entitlements)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Entitlements()
   * @model containment="true"
   * @generated
   */
	Entitlements getEntitlements();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getEntitlements <em>Entitlements</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entitlements</em>' containment reference.
   * @see #getEntitlements()
   * @generated
   */
	void setEntitlements(Entitlements value);

	/**
   * Returns the value of the '<em><b>Controllers</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Controllers#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controllers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Controllers</em>' containment reference.
   * @see #setControllers(Controllers)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Controllers()
   * @see io.opensemantics.semiotics.model.assessment.Controllers#getApplication
   * @model opposite="application" containment="true"
   * @generated
   */
	Controllers getControllers();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getControllers <em>Controllers</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Controllers</em>' containment reference.
   * @see #getControllers()
   * @generated
   */
	void setControllers(Controllers value);

	/**
   * Returns the value of the '<em><b>Models</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Models#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Models</em>' containment reference.
   * @see #setModels(Models)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Models()
   * @see io.opensemantics.semiotics.model.assessment.Models#getApplication
   * @model opposite="application" containment="true"
   * @generated
   */
	Models getModels();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getModels <em>Models</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Models</em>' containment reference.
   * @see #getModels()
   * @generated
   */
	void setModels(Models value);

	/**
   * Returns the value of the '<em><b>Scm</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Scm#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Scm</em>' containment reference.
   * @see #setScm(Scm)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Scm()
   * @see io.opensemantics.semiotics.model.assessment.Scm#getApplication
   * @model opposite="application" containment="true"
   * @generated
   */
	Scm getScm();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getScm <em>Scm</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scm</em>' containment reference.
   * @see #getScm()
   * @generated
   */
	void setScm(Scm value);

	/**
   * Returns the value of the '<em><b>Views</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Views#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Views</em>' containment reference.
   * @see #setViews(Views)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Views()
   * @see io.opensemantics.semiotics.model.assessment.Views#getApplication
   * @model opposite="application" containment="true"
   * @generated
   */
	Views getViews();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getViews <em>Views</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Views</em>' containment reference.
   * @see #getViews()
   * @generated
   */
	void setViews(Views value);

	/**
   * Returns the value of the '<em><b>Sinks</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sinks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sinks</em>' containment reference.
   * @see #setSinks(Sinks)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Sinks()
   * @model containment="true"
   * @generated
   */
	Sinks getSinks();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getSinks <em>Sinks</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sinks</em>' containment reference.
   * @see #getSinks()
   * @generated
   */
	void setSinks(Sinks value);

	/**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Resources#getApplication <em>Application</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference.
   * @see #setResources(Resources)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Resources()
   * @see io.opensemantics.semiotics.model.assessment.Resources#getApplication
   * @model opposite="application" containment="true"
   * @generated
   */
	Resources getResources();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getResources <em>Resources</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resources</em>' containment reference.
   * @see #getResources()
   * @generated
   */
	void setResources(Resources value);

	/**
   * Returns the value of the '<em><b>Applications</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Applications#getApplications <em>Applications</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Applications</em>' container reference.
   * @see #setApplications(Applications)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Applications()
   * @see io.opensemantics.semiotics.model.assessment.Applications#getApplications
   * @model opposite="applications" transient="false"
   * @generated
   */
	Applications getApplications();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getApplications <em>Applications</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Applications</em>' container reference.
   * @see #getApplications()
   * @generated
   */
	void setApplications(Applications value);

	/**
   * Returns the value of the '<em><b>Internal URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Internal URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Internal URL</em>' attribute.
   * @see #setInternalURL(String)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_InternalURL()
   * @model
   * @generated
   */
  String getInternalURL();

  /**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getInternalURL <em>Internal URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Internal URL</em>' attribute.
   * @see #getInternalURL()
   * @generated
   */
  void setInternalURL(String value);

  /**
   * Returns the value of the '<em><b>External URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External URL</em>' attribute.
   * @see #setExternalURL(String)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_ExternalURL()
   * @model
   * @generated
   */
  String getExternalURL();

  /**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getExternalURL <em>External URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External URL</em>' attribute.
   * @see #getExternalURL()
   * @generated
   */
  void setExternalURL(String value);

} // Application
