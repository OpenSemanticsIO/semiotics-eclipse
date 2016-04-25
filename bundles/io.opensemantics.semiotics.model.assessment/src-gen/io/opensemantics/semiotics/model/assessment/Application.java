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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getEntitlements <em>Entitlements</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getControllers <em>Controllers</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getModels <em>Models</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getScm <em>Scm</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getViews <em>Views</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getSinks <em>Sinks</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getLanguages <em>Languages</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getResources <em>Resources</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getUrls <em>Urls</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends Label, Notes {
	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Assessment#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment</em>' container reference.
	 * @see #setAssessment(Assessment)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Assessment()
	 * @see io.opensemantics.semiotics.model.assessment.Assessment#getApplications
	 * @model opposite="applications" transient="false"
	 * @generated
	 */
	Assessment getAssessment();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getAssessment <em>Assessment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment</em>' container reference.
	 * @see #getAssessment()
	 * @generated
	 */
	void setAssessment(Assessment value);

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Account}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Account#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Accounts()
	 * @see io.opensemantics.semiotics.model.assessment.Account#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Account> getAccounts();

	/**
	 * Returns the value of the '<em><b>Entitlements</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Entitlement}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Entitlement#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entitlements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entitlements</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Entitlements()
	 * @see io.opensemantics.semiotics.model.assessment.Entitlement#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Entitlement> getEntitlements();

	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Controller}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Controller#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controllers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Controllers()
	 * @see io.opensemantics.semiotics.model.assessment.Controller#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Controller> getControllers();

	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Model}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Model#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Models()
	 * @see io.opensemantics.semiotics.model.assessment.Model#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Model> getModels();

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
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Library}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Library#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Libraries()
	 * @see io.opensemantics.semiotics.model.assessment.Library#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Library> getLibraries();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.View}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.View#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Views()
	 * @see io.opensemantics.semiotics.model.assessment.View#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Sinks</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Sink}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Sink#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sinks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sinks</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Sinks()
	 * @see io.opensemantics.semiotics.model.assessment.Sink#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Sink> getSinks();

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' attribute list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Language}.
	 * The literals are from the enumeration {@link io.opensemantics.semiotics.model.assessment.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' attribute list.
	 * @see io.opensemantics.semiotics.model.assessment.Language
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Languages()
	 * @model
	 * @generated
	 */
	EList<Language> getLanguages();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Resource}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Resource#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Resources()
	 * @see io.opensemantics.semiotics.model.assessment.Resource#getApplication
	 * @model opposite="application" containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Urls</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Url}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urls</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Urls()
	 * @model containment="true"
	 * @generated
	 */
	EList<Url> getUrls();

} // Application
