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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see io.opensemantics.semiotics.model.assessment.AssessmentFactory
 * @model kind="package"
 * @generated
 */
public interface AssessmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assessment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://io/opensemantics/semiotics/model/assessment";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "io.opensemantics.semiotics.model.assessment";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssessmentPackage eINSTANCE = io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.Label <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.Label
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 21;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.NodeImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = LABEL__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NOTES = LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT = LABEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = LABEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.HttpImpl <em>Http</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.HttpImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHttp()
	 * @generated
	 */
	int HTTP = 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.AssessmentImpl <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 2;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 3;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.GraphImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 16;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.SinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.SinkImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getSink()
	 * @generated
	 */
	int SINK = 4;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.ControllerImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 5;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.ViewImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 6;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.ModelImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 7;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl <em>Finding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.FindingImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getFinding()
	 * @generated
	 */
	int FINDING = 8;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.AccountImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 9;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.EntitlementImpl <em>Entitlement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.EntitlementImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getEntitlement()
	 * @generated
	 */
	int ENTITLEMENT = 10;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.TaskImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 11;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.ScmImpl <em>Scm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.ScmImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getScm()
	 * @generated
	 */
	int SCM = 12;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.LibraryImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 13;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.GraphNodeImpl <em>Graph Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.GraphNodeImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getGraphNode()
	 * @generated
	 */
	int GRAPH_NODE = 18;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__NOTES = NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__PARENT = NODE__PARENT;

	/**
	 * The number of structural features of the '<em>Graph Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Graph Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP__LABEL = GRAPH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP__NOTES = GRAPH_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP__CHILDREN = GRAPH_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP__PARENT = GRAPH_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP__REQUEST = GRAPH_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP__RESPONSE = GRAPH_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Http</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_FEATURE_COUNT = GRAPH_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Http</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_OPERATION_COUNT = GRAPH_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__APPLICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Findings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__FINDINGS = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__TASKS = 2;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LABEL = LABEL__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NOTES = LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ASSESSMENT = LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ACCOUNTS = LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entitlements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ENTITLEMENTS = LABEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONTROLLERS = LABEL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__MODELS = LABEL_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SCM = LABEL_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LIBRARIES = LABEL_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__VIEWS = LABEL_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sinks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SINKS = LABEL_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__LANGUAGES = LABEL_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__RESOURCES = LABEL_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Urls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__URLS = LABEL_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = LABEL_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__NOTES = NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Cwes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__CWES = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__APPLICATION = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NOTES = NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__APPLICATION = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NOTES = NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__APPLICATION = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NOTES = NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__APPLICATION = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__LABEL = LABEL__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__NOTES = LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__ASSESSMENT = LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reproducer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__REPRODUCER = LABEL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remediation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__REMEDIATION = LABEL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING__REFERENCES = LABEL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_FEATURE_COUNT = LABEL_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Finding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDING_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NOTES = NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__APPLICATION = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entitlements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ENTITLEMENTS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NAME = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__EMAIL = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PASSWORD = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT__NOTES = NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Principals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT__PRINCIPALS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT__APPLICATION = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entitlement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entitlement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITLEMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NOTES = NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMPLETED = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ASSESSMENT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM__REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Branch Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM__BRANCH_TAG = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM__APPLICATION = 2;

	/**
	 * The number of structural features of the '<em>Scm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCM_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__LABEL = NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NOTES = NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__GROUP = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ARTIFACT = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__VERSION = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__APPLICATION = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.SnippetImpl <em>Snippet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.SnippetImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getSnippet()
	 * @generated
	 */
	int SNIPPET = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__LABEL = GRAPH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__NOTES = GRAPH_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__CHILDREN = GRAPH_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__PARENT = GRAPH_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__CONTENTS = GRAPH_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__LINE_END = GRAPH_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Column Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__COLUMN_START = GRAPH_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Column End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__COLUMN_END = GRAPH_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__LINE_START = GRAPH_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET__RESOURCE = GRAPH_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_FEATURE_COUNT = GRAPH_NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_OPERATION_COUNT = GRAPH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.UrlImpl <em>Url</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.UrlImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getUrl()
	 * @generated
	 */
	int URL = 15;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Pattern Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL__PATTERN_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Url</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ROOT = 0;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.GenericImpl <em>Generic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.GenericImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getGeneric()
	 * @generated
	 */
	int GENERIC = 17;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC__LABEL = GRAPH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC__NOTES = GRAPH_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC__CHILDREN = GRAPH_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC__PARENT = GRAPH_NODE__PARENT;

	/**
	 * The number of structural features of the '<em>Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_FEATURE_COUNT = GRAPH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_OPERATION_COUNT = GRAPH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.ControlImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 19;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__LABEL = GRAPH_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NOTES = GRAPH_NODE__NOTES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CHILDREN = GRAPH_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__PARENT = GRAPH_NODE__PARENT;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = GRAPH_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_OPERATION_COUNT = GRAPH_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.ResourceImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 20;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LABEL = LABEL__LABEL;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NOTES = LABEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__APPLICATION = LABEL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Snippets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__SNIPPETS = LABEL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = LABEL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.Contents <em>Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.Contents
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getContents()
	 * @generated
	 */
	int CONTENTS = 22;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS__CONTENTS = 0;

	/**
	 * The number of structural features of the '<em>Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.Notes <em>Notes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.Notes
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getNotes()
	 * @generated
	 */
	int NOTES = 23;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES__NOTES = 0;

	/**
	 * The number of structural features of the '<em>Notes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Notes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.HttpMethod
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 24;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.UrlPattern <em>Url Pattern</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.UrlPattern
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getUrlPattern()
	 * @generated
	 */
	int URL_PATTERN = 25;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.Language
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 26;


	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Http <em>Http</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Http
	 * @generated
	 */
	EClass getHttp();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Http#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Http#getRequest()
	 * @see #getHttp()
	 * @generated
	 */
	EAttribute getHttp_Request();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Http#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Http#getResponse()
	 * @see #getHttp()
	 * @generated
	 */
	EAttribute getHttp_Response();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Node#getChildren()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Children();

	/**
	 * Returns the meta object for the reference '{@link io.opensemantics.semiotics.model.assessment.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Node#getParent()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parent();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Assessment
	 * @generated
	 */
	EClass getAssessment();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Assessment#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Assessment#getApplications()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Applications();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Assessment#getFindings <em>Findings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Findings</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Assessment#getFindings()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Findings();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Assessment#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Assessment#getTasks()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Tasks();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Application#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Assessment</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getAssessment()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Assessment();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Application#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getAccounts()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Accounts();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Application#getEntitlements <em>Entitlements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entitlements</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getEntitlements()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Entitlements();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Application#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getControllers()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Controllers();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Application#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getModels()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Models();

	/**
	 * Returns the meta object for the containment reference '{@link io.opensemantics.semiotics.model.assessment.Application#getScm <em>Scm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scm</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getScm()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Scm();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Application#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getLibraries()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Application#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getViews()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Application#getSinks <em>Sinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sinks</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getSinks()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Sinks();

	/**
	 * Returns the meta object for the attribute list '{@link io.opensemantics.semiotics.model.assessment.Application#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Languages</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getLanguages()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Languages();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Application#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getResources()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link io.opensemantics.semiotics.model.assessment.Application#getUrls <em>Urls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Urls</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Application#getUrls()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Urls();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for the attribute list '{@link io.opensemantics.semiotics.model.assessment.Sink#getCwes <em>Cwes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cwes</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Sink#getCwes()
	 * @see #getSink()
	 * @generated
	 */
	EAttribute getSink_Cwes();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Sink#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Sink#getApplication()
	 * @see #getSink()
	 * @generated
	 */
	EReference getSink_Application();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Controller#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Controller#getApplication()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Application();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.View#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.View#getApplication()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Application();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Model#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Model#getApplication()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Application();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Finding <em>Finding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finding</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Finding
	 * @generated
	 */
	EClass getFinding();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Finding#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Assessment</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Finding#getAssessment()
	 * @see #getFinding()
	 * @generated
	 */
	EReference getFinding_Assessment();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Finding#getReproducer <em>Reproducer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reproducer</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Finding#getReproducer()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Reproducer();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Finding#getRemediation <em>Remediation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remediation</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Finding#getRemediation()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_Remediation();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Finding#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>References</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Finding#getReferences()
	 * @see #getFinding()
	 * @generated
	 */
	EAttribute getFinding_References();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Account#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Account#getApplication()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Application();

	/**
	 * Returns the meta object for the reference list '{@link io.opensemantics.semiotics.model.assessment.Account#getEntitlements <em>Entitlements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entitlements</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Account#getEntitlements()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Entitlements();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Account#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Account#getName()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Name();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Account#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Account#getEmail()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Email();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Account#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Account#getPassword()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Password();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Entitlement <em>Entitlement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entitlement</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Entitlement
	 * @generated
	 */
	EClass getEntitlement();

	/**
	 * Returns the meta object for the reference list '{@link io.opensemantics.semiotics.model.assessment.Entitlement#getPrincipals <em>Principals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Principals</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Entitlement#getPrincipals()
	 * @see #getEntitlement()
	 * @generated
	 */
	EReference getEntitlement_Principals();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Entitlement#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Entitlement#getApplication()
	 * @see #getEntitlement()
	 * @generated
	 */
	EReference getEntitlement_Application();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Task#isCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Task#isCompleted()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Completed();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Task#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Assessment</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Task#getAssessment()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Assessment();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Scm <em>Scm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scm</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Scm
	 * @generated
	 */
	EClass getScm();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Scm#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Scm#getRepository()
	 * @see #getScm()
	 * @generated
	 */
	EAttribute getScm_Repository();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Scm#getBranchTag <em>Branch Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch Tag</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Scm#getBranchTag()
	 * @see #getScm()
	 * @generated
	 */
	EAttribute getScm_BranchTag();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Scm#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Scm#getApplication()
	 * @see #getScm()
	 * @generated
	 */
	EReference getScm_Application();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Library#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Library#getGroup()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Group();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Library#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Library#getArtifact()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Library#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Library#getVersion()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Version();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Library#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Library#getApplication()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Application();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Snippet <em>Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snippet</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Snippet
	 * @generated
	 */
	EClass getSnippet();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Snippet#getLineEnd <em>Line End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line End</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Snippet#getLineEnd()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_LineEnd();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Snippet#getColumnStart <em>Column Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column Start</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Snippet#getColumnStart()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_ColumnStart();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Snippet#getColumnEnd <em>Column End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column End</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Snippet#getColumnEnd()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_ColumnEnd();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Snippet#getLineStart <em>Line Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Start</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Snippet#getLineStart()
	 * @see #getSnippet()
	 * @generated
	 */
	EAttribute getSnippet_LineStart();

	/**
	 * Returns the meta object for the reference '{@link io.opensemantics.semiotics.model.assessment.Snippet#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Snippet#getResource()
	 * @see #getSnippet()
	 * @generated
	 */
	EReference getSnippet_Resource();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Url
	 * @generated
	 */
	EClass getUrl();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Url#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Url#getPattern()
	 * @see #getUrl()
	 * @generated
	 */
	EAttribute getUrl_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Url#getPatternType <em>Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Type</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Url#getPatternType()
	 * @see #getUrl()
	 * @generated
	 */
	EAttribute getUrl_PatternType();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference '{@link io.opensemantics.semiotics.model.assessment.Graph#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Graph#getRoot()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Root();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Generic <em>Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Generic
	 * @generated
	 */
	EClass getGeneric();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.GraphNode <em>Graph Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Node</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.GraphNode
	 * @generated
	 */
	EClass getGraphNode();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Resource#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Resource#getApplication()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Application();

	/**
	 * Returns the meta object for the reference list '{@link io.opensemantics.semiotics.model.assessment.Resource#getSnippets <em>Snippets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Snippets</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Resource#getSnippets()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Snippets();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Label#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Label#getLabel()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Label();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Contents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contents</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Contents
	 * @generated
	 */
	EClass getContents();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Contents#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Contents#getContents()
	 * @see #getContents()
	 * @generated
	 */
	EAttribute getContents_Contents();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Notes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notes</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Notes
	 * @generated
	 */
	EClass getNotes();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.Notes#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Notes#getNotes()
	 * @see #getNotes()
	 * @generated
	 */
	EAttribute getNotes_Notes();

	/**
	 * Returns the meta object for enum '{@link io.opensemantics.semiotics.model.assessment.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the meta object for enum '{@link io.opensemantics.semiotics.model.assessment.UrlPattern <em>Url Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Url Pattern</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.UrlPattern
	 * @generated
	 */
	EEnum getUrlPattern();

	/**
	 * Returns the meta object for enum '{@link io.opensemantics.semiotics.model.assessment.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssessmentFactory getAssessmentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.HttpImpl <em>Http</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.HttpImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHttp()
		 * @generated
		 */
		EClass HTTP = eINSTANCE.getHttp();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP__REQUEST = eINSTANCE.getHttp_Request();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP__RESPONSE = eINSTANCE.getHttp_Response();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.NodeImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN = eINSTANCE.getNode_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARENT = eINSTANCE.getNode_Parent();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.AssessmentImpl <em>Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessment()
		 * @generated
		 */
		EClass ASSESSMENT = eINSTANCE.getAssessment();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__APPLICATIONS = eINSTANCE.getAssessment_Applications();

		/**
		 * The meta object literal for the '<em><b>Findings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__FINDINGS = eINSTANCE.getAssessment_Findings();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__TASKS = eINSTANCE.getAssessment_Tasks();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ASSESSMENT = eINSTANCE.getApplication_Assessment();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ACCOUNTS = eINSTANCE.getApplication_Accounts();

		/**
		 * The meta object literal for the '<em><b>Entitlements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__ENTITLEMENTS = eINSTANCE.getApplication_Entitlements();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONTROLLERS = eINSTANCE.getApplication_Controllers();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__MODELS = eINSTANCE.getApplication_Models();

		/**
		 * The meta object literal for the '<em><b>Scm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SCM = eINSTANCE.getApplication_Scm();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__LIBRARIES = eINSTANCE.getApplication_Libraries();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__VIEWS = eINSTANCE.getApplication_Views();

		/**
		 * The meta object literal for the '<em><b>Sinks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SINKS = eINSTANCE.getApplication_Sinks();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__LANGUAGES = eINSTANCE.getApplication_Languages();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__RESOURCES = eINSTANCE.getApplication_Resources();

		/**
		 * The meta object literal for the '<em><b>Urls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__URLS = eINSTANCE.getApplication_Urls();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.SinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.SinkImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '<em><b>Cwes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINK__CWES = eINSTANCE.getSink_Cwes();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINK__APPLICATION = eINSTANCE.getSink_Application();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.ControllerImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__APPLICATION = eINSTANCE.getController_Application();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.ViewImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__APPLICATION = eINSTANCE.getView_Application();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.ModelImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__APPLICATION = eINSTANCE.getModel_Application();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.FindingImpl <em>Finding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.FindingImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getFinding()
		 * @generated
		 */
		EClass FINDING = eINSTANCE.getFinding();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINDING__ASSESSMENT = eINSTANCE.getFinding_Assessment();

		/**
		 * The meta object literal for the '<em><b>Reproducer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__REPRODUCER = eINSTANCE.getFinding_Reproducer();

		/**
		 * The meta object literal for the '<em><b>Remediation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__REMEDIATION = eINSTANCE.getFinding_Remediation();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINDING__REFERENCES = eINSTANCE.getFinding_References();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.AccountImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__APPLICATION = eINSTANCE.getAccount_Application();

		/**
		 * The meta object literal for the '<em><b>Entitlements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__ENTITLEMENTS = eINSTANCE.getAccount_Entitlements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__NAME = eINSTANCE.getAccount_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__EMAIL = eINSTANCE.getAccount_Email();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__PASSWORD = eINSTANCE.getAccount_Password();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.EntitlementImpl <em>Entitlement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.EntitlementImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getEntitlement()
		 * @generated
		 */
		EClass ENTITLEMENT = eINSTANCE.getEntitlement();

		/**
		 * The meta object literal for the '<em><b>Principals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITLEMENT__PRINCIPALS = eINSTANCE.getEntitlement_Principals();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITLEMENT__APPLICATION = eINSTANCE.getEntitlement_Application();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.TaskImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__COMPLETED = eINSTANCE.getTask_Completed();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ASSESSMENT = eINSTANCE.getTask_Assessment();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.ScmImpl <em>Scm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.ScmImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getScm()
		 * @generated
		 */
		EClass SCM = eINSTANCE.getScm();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCM__REPOSITORY = eINSTANCE.getScm_Repository();

		/**
		 * The meta object literal for the '<em><b>Branch Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCM__BRANCH_TAG = eINSTANCE.getScm_BranchTag();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCM__APPLICATION = eINSTANCE.getScm_Application();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.LibraryImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__GROUP = eINSTANCE.getLibrary_Group();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__ARTIFACT = eINSTANCE.getLibrary_Artifact();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__VERSION = eINSTANCE.getLibrary_Version();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__APPLICATION = eINSTANCE.getLibrary_Application();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.SnippetImpl <em>Snippet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.SnippetImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getSnippet()
		 * @generated
		 */
		EClass SNIPPET = eINSTANCE.getSnippet();

		/**
		 * The meta object literal for the '<em><b>Line End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__LINE_END = eINSTANCE.getSnippet_LineEnd();

		/**
		 * The meta object literal for the '<em><b>Column Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__COLUMN_START = eINSTANCE.getSnippet_ColumnStart();

		/**
		 * The meta object literal for the '<em><b>Column End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__COLUMN_END = eINSTANCE.getSnippet_ColumnEnd();

		/**
		 * The meta object literal for the '<em><b>Line Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET__LINE_START = eINSTANCE.getSnippet_LineStart();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNIPPET__RESOURCE = eINSTANCE.getSnippet_Resource();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.UrlImpl <em>Url</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.UrlImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getUrl()
		 * @generated
		 */
		EClass URL = eINSTANCE.getUrl();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL__PATTERN = eINSTANCE.getUrl_Pattern();

		/**
		 * The meta object literal for the '<em><b>Pattern Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL__PATTERN_TYPE = eINSTANCE.getUrl_PatternType();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.GraphImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__ROOT = eINSTANCE.getGraph_Root();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.GenericImpl <em>Generic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.GenericImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getGeneric()
		 * @generated
		 */
		EClass GENERIC = eINSTANCE.getGeneric();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.GraphNodeImpl <em>Graph Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.GraphNodeImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getGraphNode()
		 * @generated
		 */
		EClass GRAPH_NODE = eINSTANCE.getGraphNode();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.ControlImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.ResourceImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__APPLICATION = eINSTANCE.getResource_Application();

		/**
		 * The meta object literal for the '<em><b>Snippets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__SNIPPETS = eINSTANCE.getResource_Snippets();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.Label <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.Label
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__LABEL = eINSTANCE.getLabel_Label();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.Contents <em>Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.Contents
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getContents()
		 * @generated
		 */
		EClass CONTENTS = eINSTANCE.getContents();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENTS__CONTENTS = eINSTANCE.getContents_Contents();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.Notes <em>Notes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.Notes
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getNotes()
		 * @generated
		 */
		EClass NOTES = eINSTANCE.getNotes();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTES__NOTES = eINSTANCE.getNotes_Notes();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.HttpMethod
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.UrlPattern <em>Url Pattern</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.UrlPattern
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getUrlPattern()
		 * @generated
		 */
		EEnum URL_PATTERN = eINSTANCE.getUrlPattern();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.Language
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

	}

} //AssessmentPackage
