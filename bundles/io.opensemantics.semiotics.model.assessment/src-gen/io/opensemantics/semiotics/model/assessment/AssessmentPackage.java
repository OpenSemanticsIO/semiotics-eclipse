/*******************************************************************************
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
 *******************************************************************************/
/**
 */
package io.opensemantics.semiotics.model.assessment;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.NodeImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GRAPH = 2;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.ServiceNodeImpl <em>Service Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.ServiceNodeImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getServiceNode()
	 * @generated
	 */
	int SERVICE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NODE__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NODE__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NODE__GRAPH = NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NODE__DESCRIPTION = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.GraphImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 3;

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
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.HttpServiceImpl <em>Http Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.HttpServiceImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHttpService()
	 * @generated
	 */
	int HTTP_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_SERVICE__ROOT = GRAPH__ROOT;

	/**
	 * The number of structural features of the '<em>Http Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_SERVICE_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Http Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_SERVICE_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.HttpNodeImpl <em>Http Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.HttpNodeImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHttpNode()
	 * @generated
	 */
	int HTTP_NODE = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NODE__CHILDREN = NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NODE__PARENT = NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NODE__GRAPH = NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NODE__DESCRIPTION = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Http Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Http Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.AssessmentImpl <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 5;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__APPLICATIONS = 0;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.ApplicationImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 6;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__ASSESSMENT = 0;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.HS2NodeImpl <em>HS2 Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.HS2NodeImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHS2Node()
	 * @generated
	 */
	int HS2_NODE = 7;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS2_NODE__CHILDREN = SERVICE_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS2_NODE__PARENT = SERVICE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS2_NODE__GRAPH = SERVICE_NODE__GRAPH;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS2_NODE__DESCRIPTION = SERVICE_NODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>HS2 Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS2_NODE_FEATURE_COUNT = SERVICE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HS2 Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS2_NODE_OPERATION_COUNT = SERVICE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.ServiceImpl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 8;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ROOT = GRAPH__ROOT;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = GRAPH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = GRAPH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link io.opensemantics.semiotics.model.assessment.impl.HS2Impl <em>HS2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see io.opensemantics.semiotics.model.assessment.impl.HS2Impl
	 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHS2()
	 * @generated
	 */
	int HS2 = 9;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS2__ROOT = SERVICE__ROOT;

	/**
	 * The number of structural features of the '<em>HS2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS2_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>HS2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HS2_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.ServiceNode <em>Service Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Node</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.ServiceNode
	 * @generated
	 */
	EClass getServiceNode();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.ServiceNode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.ServiceNode#getDescription()
	 * @see #getServiceNode()
	 * @generated
	 */
	EAttribute getServiceNode_Description();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.HttpService <em>Http Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Service</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.HttpService
	 * @generated
	 */
	EClass getHttpService();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.HttpNode <em>Http Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Node</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.HttpNode
	 * @generated
	 */
	EClass getHttpNode();

	/**
	 * Returns the meta object for the attribute '{@link io.opensemantics.semiotics.model.assessment.HttpNode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.HttpNode#getDescription()
	 * @see #getHttpNode()
	 * @generated
	 */
	EAttribute getHttpNode_Description();

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
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Node#getParent()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Parent();

	/**
	 * Returns the meta object for the container reference '{@link io.opensemantics.semiotics.model.assessment.Node#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Node#getGraph()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Graph();

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
	 * Returns the meta object for the containment reference '{@link io.opensemantics.semiotics.model.assessment.Assessment#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applications</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Assessment#getApplications()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Applications();

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
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.HS2Node <em>HS2 Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HS2 Node</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.HS2Node
	 * @generated
	 */
	EClass getHS2Node();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link io.opensemantics.semiotics.model.assessment.HS2 <em>HS2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HS2</em>'.
	 * @see io.opensemantics.semiotics.model.assessment.HS2
	 * @generated
	 */
	EClass getHS2();

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
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.ServiceNodeImpl <em>Service Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.ServiceNodeImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getServiceNode()
		 * @generated
		 */
		EClass SERVICE_NODE = eINSTANCE.getServiceNode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_NODE__DESCRIPTION = eINSTANCE.getServiceNode_Description();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.HttpServiceImpl <em>Http Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.HttpServiceImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHttpService()
		 * @generated
		 */
		EClass HTTP_SERVICE = eINSTANCE.getHttpService();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.HttpNodeImpl <em>Http Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.HttpNodeImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHttpNode()
		 * @generated
		 */
		EClass HTTP_NODE = eINSTANCE.getHttpNode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_NODE__DESCRIPTION = eINSTANCE.getHttpNode_Description();

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
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PARENT = eINSTANCE.getNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__GRAPH = eINSTANCE.getNode_Graph();

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
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__APPLICATIONS = eINSTANCE.getAssessment_Applications();

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
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.HS2NodeImpl <em>HS2 Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.HS2NodeImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHS2Node()
		 * @generated
		 */
		EClass HS2_NODE = eINSTANCE.getHS2Node();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.ServiceImpl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link io.opensemantics.semiotics.model.assessment.impl.HS2Impl <em>HS2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see io.opensemantics.semiotics.model.assessment.impl.HS2Impl
		 * @see io.opensemantics.semiotics.model.assessment.impl.AssessmentPackageImpl#getHS2()
		 * @generated
		 */
		EClass HS2 = eINSTANCE.getHS2();

	}

} //AssessmentPackage
