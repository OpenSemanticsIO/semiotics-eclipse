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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage
 * @generated
 */
public interface AssessmentFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	AssessmentFactory eINSTANCE = io.opensemantics.semiotics.model.assessment.impl.AssessmentFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Http</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Http</em>'.
   * @generated
   */
	Http createHttp();

	/**
   * Returns a new object of class '<em>Assessment</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Assessment</em>'.
   * @generated
   */
	Assessment createAssessment();

	/**
   * Returns a new object of class '<em>Application</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Application</em>'.
   * @generated
   */
	Application createApplication();

	/**
   * Returns a new object of class '<em>Sink</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Sink</em>'.
   * @generated
   */
	Sink createSink();

	/**
   * Returns a new object of class '<em>Controller</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Controller</em>'.
   * @generated
   */
	Controller createController();

	/**
   * Returns a new object of class '<em>View</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>View</em>'.
   * @generated
   */
	View createView();

	/**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
	Model createModel();

	/**
   * Returns a new object of class '<em>Finding</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Finding</em>'.
   * @generated
   */
	Finding createFinding();

	/**
   * Returns a new object of class '<em>Account</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Account</em>'.
   * @generated
   */
	Account createAccount();

	/**
   * Returns a new object of class '<em>Entitlement</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Entitlement</em>'.
   * @generated
   */
	Entitlement createEntitlement();

	/**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
	Task createTask();

	/**
   * Returns a new object of class '<em>Scm</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Scm</em>'.
   * @generated
   */
	Scm createScm();

	/**
   * Returns a new object of class '<em>Snippet</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Snippet</em>'.
   * @generated
   */
	Snippet createSnippet();

	/**
   * Returns a new object of class '<em>Url</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Url</em>'.
   * @generated
   */
	Url createUrl();

	/**
   * Returns a new object of class '<em>Generic</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic</em>'.
   * @generated
   */
	Generic createGeneric();

	/**
   * Returns a new object of class '<em>Control</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Control</em>'.
   * @generated
   */
	Control createControl();

	/**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
	Resource createResource();

	/**
   * Returns a new object of class '<em>Applications</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Applications</em>'.
   * @generated
   */
	Applications createApplications();

	/**
   * Returns a new object of class '<em>Findings</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Findings</em>'.
   * @generated
   */
	Findings createFindings();

	/**
   * Returns a new object of class '<em>Accounts</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Accounts</em>'.
   * @generated
   */
	Accounts createAccounts();

	/**
   * Returns a new object of class '<em>Controllers</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Controllers</em>'.
   * @generated
   */
	Controllers createControllers();

	/**
   * Returns a new object of class '<em>Entitlements</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Entitlements</em>'.
   * @generated
   */
	Entitlements createEntitlements();

	/**
   * Returns a new object of class '<em>Models</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Models</em>'.
   * @generated
   */
	Models createModels();

	/**
   * Returns a new object of class '<em>Views</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Views</em>'.
   * @generated
   */
	Views createViews();

	/**
   * Returns a new object of class '<em>Sinks</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Sinks</em>'.
   * @generated
   */
	Sinks createSinks();

	/**
   * Returns a new object of class '<em>Resources</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Resources</em>'.
   * @generated
   */
	Resources createResources();

	/**
   * Returns a new object of class '<em>Tasks</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Tasks</em>'.
   * @generated
   */
	Tasks createTasks();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	AssessmentPackage getAssessmentPackage();

} //AssessmentFactory
