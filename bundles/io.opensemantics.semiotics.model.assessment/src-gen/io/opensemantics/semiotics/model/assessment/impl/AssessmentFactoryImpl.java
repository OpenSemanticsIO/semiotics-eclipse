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
package io.opensemantics.semiotics.model.assessment.impl;

import io.opensemantics.semiotics.model.assessment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssessmentFactoryImpl extends EFactoryImpl implements AssessmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssessmentFactory init() {
		try {
			AssessmentFactory theAssessmentFactory = (AssessmentFactory)EPackage.Registry.INSTANCE.getEFactory(AssessmentPackage.eNS_URI);
			if (theAssessmentFactory != null) {
				return theAssessmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AssessmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AssessmentPackage.SERVICE_NODE: return createServiceNode();
			case AssessmentPackage.HTTP_SERVICE: return createHttpService();
			case AssessmentPackage.HTTP_NODE: return createHttpNode();
			case AssessmentPackage.ASSESSMENT: return createAssessment();
			case AssessmentPackage.APPLICATION: return createApplication();
			case AssessmentPackage.HS2_NODE: return createHS2Node();
			case AssessmentPackage.SERVICE: return createService();
			case AssessmentPackage.HS2: return createHS2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceNode createServiceNode() {
		ServiceNodeImpl serviceNode = new ServiceNodeImpl();
		return serviceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpService createHttpService() {
		HttpServiceImpl httpService = new HttpServiceImpl();
		return httpService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpNode createHttpNode() {
		HttpNodeImpl httpNode = new HttpNodeImpl();
		return httpNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assessment createAssessment() {
		AssessmentImpl assessment = new AssessmentImpl();
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HS2Node createHS2Node() {
		HS2NodeImpl hs2Node = new HS2NodeImpl();
		return hs2Node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <S extends ServiceNode> Service<S> createService() {
		ServiceImpl<S> service = new ServiceImpl<S>();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HS2 createHS2() {
		HS2Impl hs2 = new HS2Impl();
		return hs2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentPackage getAssessmentPackage() {
		return (AssessmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AssessmentPackage getPackage() {
		return AssessmentPackage.eINSTANCE;
	}

} //AssessmentFactoryImpl
