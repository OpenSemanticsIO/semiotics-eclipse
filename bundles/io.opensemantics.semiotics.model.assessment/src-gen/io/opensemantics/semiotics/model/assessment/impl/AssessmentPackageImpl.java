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
import io.opensemantics.semiotics.model.assessment.Accounts;
import io.opensemantics.semiotics.model.assessment.Application;
import io.opensemantics.semiotics.model.assessment.Applications;
import io.opensemantics.semiotics.model.assessment.Assessment;
import io.opensemantics.semiotics.model.assessment.AssessmentFactory;
import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Contents;
import io.opensemantics.semiotics.model.assessment.Control;
import io.opensemantics.semiotics.model.assessment.Controller;
import io.opensemantics.semiotics.model.assessment.Controllers;
import io.opensemantics.semiotics.model.assessment.Entitlement;
import io.opensemantics.semiotics.model.assessment.Entitlements;
import io.opensemantics.semiotics.model.assessment.Finding;
import io.opensemantics.semiotics.model.assessment.Findings;
import io.opensemantics.semiotics.model.assessment.Generic;
import io.opensemantics.semiotics.model.assessment.Graph;
import io.opensemantics.semiotics.model.assessment.GraphNode;
import io.opensemantics.semiotics.model.assessment.Http;
import io.opensemantics.semiotics.model.assessment.HttpMethod;
import io.opensemantics.semiotics.model.assessment.Label;
import io.opensemantics.semiotics.model.assessment.Language;
import io.opensemantics.semiotics.model.assessment.Model;
import io.opensemantics.semiotics.model.assessment.Models;
import io.opensemantics.semiotics.model.assessment.Node;
import io.opensemantics.semiotics.model.assessment.Notes;
import io.opensemantics.semiotics.model.assessment.Resource;
import io.opensemantics.semiotics.model.assessment.Resources;
import io.opensemantics.semiotics.model.assessment.Scm;
import io.opensemantics.semiotics.model.assessment.Sink;
import io.opensemantics.semiotics.model.assessment.Sinks;
import io.opensemantics.semiotics.model.assessment.Snippet;
import io.opensemantics.semiotics.model.assessment.Task;
import io.opensemantics.semiotics.model.assessment.TaskStatus;
import io.opensemantics.semiotics.model.assessment.Tasks;
import io.opensemantics.semiotics.model.assessment.Url;
import io.opensemantics.semiotics.model.assessment.UrlPattern;
import io.opensemantics.semiotics.model.assessment.View;

import io.opensemantics.semiotics.model.assessment.Views;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssessmentPackageImpl extends EPackageImpl implements AssessmentPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass httpEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass nodeEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass assessmentEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass applicationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass sinkEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass controllerEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass viewEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass modelEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass findingEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass accountEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass entitlementEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass taskEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass scmEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass snippetEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass urlEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass graphEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass genericEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass graphNodeEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass controlEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass resourceEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass labelEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass contentsEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass notesEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass applicationsEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass findingsEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass accountsEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass controllersEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass entitlementsEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass modelsEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass viewsEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass sinksEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass resourcesEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass tasksEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum httpMethodEEnum = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum urlPatternEEnum = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum languageEEnum = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum taskStatusEEnum = null;

	/**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private AssessmentPackageImpl() {
    super(eNS_URI, AssessmentFactory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AssessmentPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static AssessmentPackage init() {
    if (isInited) return (AssessmentPackage)EPackage.Registry.INSTANCE.getEPackage(AssessmentPackage.eNS_URI);

    // Obtain or create and register package
    AssessmentPackageImpl theAssessmentPackage = (AssessmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AssessmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AssessmentPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theAssessmentPackage.createPackageContents();

    // Initialize created meta-data
    theAssessmentPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAssessmentPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AssessmentPackage.eNS_URI, theAssessmentPackage);
    return theAssessmentPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getHttp() {
    return httpEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getHttp_Request() {
    return (EAttribute)httpEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getHttp_Response() {
    return (EAttribute)httpEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNode() {
    return nodeEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getNode_Children() {
    return (EReference)nodeEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getNode_Parent() {
    return (EReference)nodeEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getNode_RefersTo() {
    return (EReference)nodeEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getNode_ReferredBy() {
    return (EReference)nodeEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getNode_Tasks() {
    return (EReference)nodeEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getNode_Findings() {
    return (EReference)nodeEClass.getEStructuralFeatures().get(5);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAssessment() {
    return assessmentEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAssessment_Applications() {
    return (EReference)assessmentEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAssessment_Findings() {
    return (EReference)assessmentEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAssessment_Tasks() {
    return (EReference)assessmentEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getApplication() {
    return applicationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getApplication_Accounts() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getApplication_Entitlements() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getApplication_Controllers() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getApplication_Models() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getApplication_Scm() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getApplication_Views() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(5);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getApplication_Sinks() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(6);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getApplication_Languages() {
    return (EAttribute)applicationEClass.getEStructuralFeatures().get(7);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getApplication_Resources() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(8);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getApplication_Applications() {
    return (EReference)applicationEClass.getEStructuralFeatures().get(9);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplication_InternalURL() {
    return (EAttribute)applicationEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplication_ExternalURL() {
    return (EAttribute)applicationEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSink() {
    return sinkEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSink_Cwes() {
    return (EAttribute)sinkEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSink_Sinks() {
    return (EReference)sinkEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getController() {
    return controllerEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getController_Application() {
    return (EReference)controllerEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getView() {
    return viewEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getView_Views() {
    return (EReference)viewEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getModel() {
    return modelEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getModel_Models() {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getFinding() {
    return findingEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getFinding_Findings() {
    return (EReference)findingEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getFinding_Reproducer() {
    return (EAttribute)findingEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getFinding_Remediation() {
    return (EAttribute)findingEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getFinding_References() {
    return (EAttribute)findingEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getFinding_Affects() {
    return (EReference)findingEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAccount() {
    return accountEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAccount_Accounts() {
    return (EReference)accountEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAccount_Entitlements() {
    return (EReference)accountEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAccount_Email() {
    return (EAttribute)accountEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAccount_Password() {
    return (EAttribute)accountEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEntitlement() {
    return entitlementEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getEntitlement_Accounts() {
    return (EReference)entitlementEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getEntitlement_Entitlements() {
    return (EReference)entitlementEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTask() {
    return taskEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getTask_Tasks() {
    return (EReference)taskEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getTask_Affects() {
    return (EReference)taskEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getTask_Status() {
    return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getScm() {
    return scmEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getScm_Repository() {
    return (EAttribute)scmEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getScm_BranchTag() {
    return (EAttribute)scmEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getScm_Application() {
    return (EReference)scmEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSnippet() {
    return snippetEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSnippet_LineEnd() {
    return (EAttribute)snippetEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSnippet_ColumnStart() {
    return (EAttribute)snippetEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSnippet_ColumnEnd() {
    return (EAttribute)snippetEClass.getEStructuralFeatures().get(2);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getSnippet_LineStart() {
    return (EAttribute)snippetEClass.getEStructuralFeatures().get(3);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSnippet_Resource() {
    return (EReference)snippetEClass.getEStructuralFeatures().get(4);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getUrl() {
    return urlEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getUrl_Pattern() {
    return (EAttribute)urlEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getUrl_PatternType() {
    return (EAttribute)urlEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getGraph() {
    return graphEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getGraph_Root() {
    return (EReference)graphEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getGeneric() {
    return genericEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getGraphNode() {
    return graphNodeEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getControl() {
    return controlEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getResource() {
    return resourceEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getResource_Resources() {
    return (EReference)resourceEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getResource_Snippets() {
    return (EReference)resourceEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getLabel() {
    return labelEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getLabel_Label() {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getContents() {
    return contentsEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getContents_Contents() {
    return (EAttribute)contentsEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNotes() {
    return notesEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNotes_Notes() {
    return (EAttribute)notesEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getApplications() {
    return applicationsEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getApplications_Applications() {
    return (EReference)applicationsEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getApplications_Assessment() {
    return (EReference)applicationsEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getFindings() {
    return findingsEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getFindings_Findings() {
    return (EReference)findingsEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getFindings_Assessment() {
    return (EReference)findingsEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAccounts() {
    return accountsEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAccounts_Application() {
    return (EReference)accountsEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAccounts_Accounts() {
    return (EReference)accountsEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getControllers() {
    return controllersEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getControllers_Application() {
    return (EReference)controllersEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getControllers_Controllers() {
    return (EReference)controllersEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getEntitlements() {
    return entitlementsEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getEntitlements_Application() {
    return (EReference)entitlementsEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getEntitlements_Entitlements() {
    return (EReference)entitlementsEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getModels() {
    return modelsEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getModels_Application() {
    return (EReference)modelsEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getModels_Models() {
    return (EReference)modelsEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getViews() {
    return viewsEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getViews_Application() {
    return (EReference)viewsEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getViews_Views() {
    return (EReference)viewsEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getSinks() {
    return sinksEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSinks_Application() {
    return (EReference)sinksEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getSinks_Sinks() {
    return (EReference)sinksEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getResources() {
    return resourcesEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getResources_Application() {
    return (EReference)resourcesEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getResources_Resources() {
    return (EReference)resourcesEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getTasks() {
    return tasksEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getTasks_Assessment() {
    return (EReference)tasksEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getTasks_Tasks() {
    return (EReference)tasksEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getHttpMethod() {
    return httpMethodEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getUrlPattern() {
    return urlPatternEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getLanguage() {
    return languageEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getTaskStatus() {
    return taskStatusEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssessmentFactory getAssessmentFactory() {
    return (AssessmentFactory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isCreated = false;

	/**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    httpEClass = createEClass(HTTP);
    createEAttribute(httpEClass, HTTP__REQUEST);
    createEAttribute(httpEClass, HTTP__RESPONSE);

    nodeEClass = createEClass(NODE);
    createEReference(nodeEClass, NODE__CHILDREN);
    createEReference(nodeEClass, NODE__PARENT);
    createEReference(nodeEClass, NODE__REFERS_TO);
    createEReference(nodeEClass, NODE__REFERRED_BY);
    createEReference(nodeEClass, NODE__TASKS);
    createEReference(nodeEClass, NODE__FINDINGS);

    assessmentEClass = createEClass(ASSESSMENT);
    createEReference(assessmentEClass, ASSESSMENT__APPLICATIONS);
    createEReference(assessmentEClass, ASSESSMENT__FINDINGS);
    createEReference(assessmentEClass, ASSESSMENT__TASKS);

    applicationEClass = createEClass(APPLICATION);
    createEReference(applicationEClass, APPLICATION__ACCOUNTS);
    createEReference(applicationEClass, APPLICATION__ENTITLEMENTS);
    createEReference(applicationEClass, APPLICATION__CONTROLLERS);
    createEReference(applicationEClass, APPLICATION__MODELS);
    createEReference(applicationEClass, APPLICATION__SCM);
    createEReference(applicationEClass, APPLICATION__VIEWS);
    createEReference(applicationEClass, APPLICATION__SINKS);
    createEAttribute(applicationEClass, APPLICATION__LANGUAGES);
    createEReference(applicationEClass, APPLICATION__RESOURCES);
    createEReference(applicationEClass, APPLICATION__APPLICATIONS);
    createEAttribute(applicationEClass, APPLICATION__INTERNAL_URL);
    createEAttribute(applicationEClass, APPLICATION__EXTERNAL_URL);

    sinkEClass = createEClass(SINK);
    createEAttribute(sinkEClass, SINK__CWES);
    createEReference(sinkEClass, SINK__SINKS);

    controllerEClass = createEClass(CONTROLLER);
    createEReference(controllerEClass, CONTROLLER__APPLICATION);

    viewEClass = createEClass(VIEW);
    createEReference(viewEClass, VIEW__VIEWS);

    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__MODELS);

    findingEClass = createEClass(FINDING);
    createEReference(findingEClass, FINDING__FINDINGS);
    createEAttribute(findingEClass, FINDING__REPRODUCER);
    createEAttribute(findingEClass, FINDING__REMEDIATION);
    createEAttribute(findingEClass, FINDING__REFERENCES);
    createEReference(findingEClass, FINDING__AFFECTS);

    accountEClass = createEClass(ACCOUNT);
    createEReference(accountEClass, ACCOUNT__ACCOUNTS);
    createEReference(accountEClass, ACCOUNT__ENTITLEMENTS);
    createEAttribute(accountEClass, ACCOUNT__EMAIL);
    createEAttribute(accountEClass, ACCOUNT__PASSWORD);

    entitlementEClass = createEClass(ENTITLEMENT);
    createEReference(entitlementEClass, ENTITLEMENT__ACCOUNTS);
    createEReference(entitlementEClass, ENTITLEMENT__ENTITLEMENTS);

    taskEClass = createEClass(TASK);
    createEReference(taskEClass, TASK__TASKS);
    createEReference(taskEClass, TASK__AFFECTS);
    createEAttribute(taskEClass, TASK__STATUS);

    scmEClass = createEClass(SCM);
    createEAttribute(scmEClass, SCM__REPOSITORY);
    createEAttribute(scmEClass, SCM__BRANCH_TAG);
    createEReference(scmEClass, SCM__APPLICATION);

    snippetEClass = createEClass(SNIPPET);
    createEAttribute(snippetEClass, SNIPPET__LINE_END);
    createEAttribute(snippetEClass, SNIPPET__COLUMN_START);
    createEAttribute(snippetEClass, SNIPPET__COLUMN_END);
    createEAttribute(snippetEClass, SNIPPET__LINE_START);
    createEReference(snippetEClass, SNIPPET__RESOURCE);

    urlEClass = createEClass(URL);
    createEAttribute(urlEClass, URL__PATTERN);
    createEAttribute(urlEClass, URL__PATTERN_TYPE);

    graphEClass = createEClass(GRAPH);
    createEReference(graphEClass, GRAPH__ROOT);

    genericEClass = createEClass(GENERIC);

    graphNodeEClass = createEClass(GRAPH_NODE);

    controlEClass = createEClass(CONTROL);

    resourceEClass = createEClass(RESOURCE);
    createEReference(resourceEClass, RESOURCE__RESOURCES);
    createEReference(resourceEClass, RESOURCE__SNIPPETS);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__LABEL);

    contentsEClass = createEClass(CONTENTS);
    createEAttribute(contentsEClass, CONTENTS__CONTENTS);

    notesEClass = createEClass(NOTES);
    createEAttribute(notesEClass, NOTES__NOTES);

    applicationsEClass = createEClass(APPLICATIONS);
    createEReference(applicationsEClass, APPLICATIONS__APPLICATIONS);
    createEReference(applicationsEClass, APPLICATIONS__ASSESSMENT);

    findingsEClass = createEClass(FINDINGS);
    createEReference(findingsEClass, FINDINGS__FINDINGS);
    createEReference(findingsEClass, FINDINGS__ASSESSMENT);

    accountsEClass = createEClass(ACCOUNTS);
    createEReference(accountsEClass, ACCOUNTS__APPLICATION);
    createEReference(accountsEClass, ACCOUNTS__ACCOUNTS);

    controllersEClass = createEClass(CONTROLLERS);
    createEReference(controllersEClass, CONTROLLERS__APPLICATION);
    createEReference(controllersEClass, CONTROLLERS__CONTROLLERS);

    entitlementsEClass = createEClass(ENTITLEMENTS);
    createEReference(entitlementsEClass, ENTITLEMENTS__APPLICATION);
    createEReference(entitlementsEClass, ENTITLEMENTS__ENTITLEMENTS);

    modelsEClass = createEClass(MODELS);
    createEReference(modelsEClass, MODELS__APPLICATION);
    createEReference(modelsEClass, MODELS__MODELS);

    viewsEClass = createEClass(VIEWS);
    createEReference(viewsEClass, VIEWS__APPLICATION);
    createEReference(viewsEClass, VIEWS__VIEWS);

    sinksEClass = createEClass(SINKS);
    createEReference(sinksEClass, SINKS__APPLICATION);
    createEReference(sinksEClass, SINKS__SINKS);

    resourcesEClass = createEClass(RESOURCES);
    createEReference(resourcesEClass, RESOURCES__APPLICATION);
    createEReference(resourcesEClass, RESOURCES__RESOURCES);

    tasksEClass = createEClass(TASKS);
    createEReference(tasksEClass, TASKS__ASSESSMENT);
    createEReference(tasksEClass, TASKS__TASKS);

    // Create enums
    httpMethodEEnum = createEEnum(HTTP_METHOD);
    urlPatternEEnum = createEEnum(URL_PATTERN);
    languageEEnum = createEEnum(LANGUAGE);
    taskStatusEEnum = createEEnum(TASK_STATUS);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters
    ETypeParameter graphEClass_T = addETypeParameter(graphEClass, "T");

    // Set bounds for type parameters
    EGenericType g1 = createEGenericType(this.getNode());
    graphEClass_T.getEBounds().add(g1);

    // Add supertypes to classes
    httpEClass.getESuperTypes().add(this.getGraphNode());
    nodeEClass.getESuperTypes().add(this.getLabel());
    nodeEClass.getESuperTypes().add(this.getNotes());
    assessmentEClass.getESuperTypes().add(this.getLabel());
    assessmentEClass.getESuperTypes().add(this.getNotes());
    applicationEClass.getESuperTypes().add(this.getLabel());
    applicationEClass.getESuperTypes().add(this.getNotes());
    sinkEClass.getESuperTypes().add(this.getNode());
    controllerEClass.getESuperTypes().add(this.getNode());
    viewEClass.getESuperTypes().add(this.getNode());
    modelEClass.getESuperTypes().add(this.getNode());
    findingEClass.getESuperTypes().add(this.getLabel());
    findingEClass.getESuperTypes().add(this.getNotes());
    accountEClass.getESuperTypes().add(this.getNode());
    entitlementEClass.getESuperTypes().add(this.getNode());
    taskEClass.getESuperTypes().add(this.getLabel());
    taskEClass.getESuperTypes().add(this.getNotes());
    snippetEClass.getESuperTypes().add(this.getGraphNode());
    snippetEClass.getESuperTypes().add(this.getContents());
    genericEClass.getESuperTypes().add(this.getGraphNode());
    graphNodeEClass.getESuperTypes().add(this.getNode());
    controlEClass.getESuperTypes().add(this.getGraphNode());
    resourceEClass.getESuperTypes().add(this.getLabel());
    resourceEClass.getESuperTypes().add(this.getNotes());
    resourceEClass.getESuperTypes().add(this.getContents());

    // Initialize classes, features, and operations; add parameters
    initEClass(httpEClass, Http.class, "Http", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttp_Request(), ecorePackage.getEString(), "request", null, 0, 1, Http.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHttp_Response(), ecorePackage.getEString(), "response", null, 0, 1, Http.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNode_Children(), this.getGraphNode(), null, "children", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Parent(), this.getNode(), null, "parent", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_RefersTo(), this.getNode(), this.getNode_ReferredBy(), "refersTo", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_ReferredBy(), this.getNode(), this.getNode_RefersTo(), "referredBy", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Tasks(), this.getTask(), this.getTask_Affects(), "tasks", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNode_Findings(), this.getFinding(), this.getFinding_Affects(), "findings", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assessmentEClass, Assessment.class, "Assessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssessment_Applications(), this.getApplications(), this.getApplications_Assessment(), "applications", null, 0, 1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssessment_Findings(), this.getFindings(), this.getFindings_Assessment(), "findings", null, 0, 1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssessment_Tasks(), this.getTasks(), this.getTasks_Assessment(), "tasks", null, 0, 1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplication_Accounts(), this.getAccounts(), null, "accounts", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Entitlements(), this.getEntitlements(), null, "entitlements", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Controllers(), this.getControllers(), this.getControllers_Application(), "controllers", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Models(), this.getModels(), this.getModels_Application(), "models", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Scm(), this.getScm(), this.getScm_Application(), "scm", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Views(), this.getViews(), this.getViews_Application(), "views", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Sinks(), this.getSinks(), null, "sinks", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplication_Languages(), this.getLanguage(), "languages", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Resources(), this.getResources(), this.getResources_Application(), "resources", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplication_Applications(), this.getApplications(), this.getApplications_Applications(), "applications", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplication_InternalURL(), ecorePackage.getEString(), "internalURL", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplication_ExternalURL(), ecorePackage.getEString(), "externalURL", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sinkEClass, Sink.class, "Sink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSink_Cwes(), ecorePackage.getEInt(), "cwes", null, 0, -1, Sink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSink_Sinks(), this.getSinks(), this.getSinks_Sinks(), "sinks", null, 0, 1, Sink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getController_Application(), this.getApplication(), null, "application", null, 0, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getView_Views(), this.getViews(), this.getViews_Views(), "views", null, 0, 1, View.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Models(), this.getModels(), this.getModels_Models(), "models", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(findingEClass, Finding.class, "Finding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFinding_Findings(), this.getFindings(), this.getFindings_Findings(), "findings", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFinding_Reproducer(), ecorePackage.getEString(), "reproducer", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFinding_Remediation(), ecorePackage.getEString(), "remediation", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFinding_References(), ecorePackage.getEString(), "references", null, 0, 1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFinding_Affects(), this.getNode(), this.getNode_Findings(), "affects", null, 0, -1, Finding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accountEClass, Account.class, "Account", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAccount_Accounts(), this.getAccounts(), this.getAccounts_Accounts(), "accounts", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccount_Entitlements(), this.getEntitlement(), this.getEntitlement_Accounts(), "entitlements", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAccount_Email(), ecorePackage.getEString(), "email", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAccount_Password(), ecorePackage.getEString(), "password", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entitlementEClass, Entitlement.class, "Entitlement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntitlement_Accounts(), this.getAccount(), this.getAccount_Entitlements(), "accounts", null, 0, -1, Entitlement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntitlement_Entitlements(), this.getEntitlements(), this.getEntitlements_Entitlements(), "entitlements", null, 0, 1, Entitlement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTask_Tasks(), this.getTasks(), this.getTasks_Tasks(), "tasks", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Affects(), this.getNode(), this.getNode_Tasks(), "affects", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTask_Status(), this.getTaskStatus(), "status", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scmEClass, Scm.class, "Scm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScm_Repository(), ecorePackage.getEString(), "repository", null, 0, 1, Scm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScm_BranchTag(), ecorePackage.getEString(), "branchTag", null, 0, 1, Scm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScm_Application(), this.getApplication(), this.getApplication_Scm(), "application", null, 0, 1, Scm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(snippetEClass, Snippet.class, "Snippet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSnippet_LineEnd(), ecorePackage.getEInt(), "lineEnd", null, 0, 1, Snippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSnippet_ColumnStart(), ecorePackage.getEInt(), "columnStart", null, 0, 1, Snippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSnippet_ColumnEnd(), ecorePackage.getEInt(), "columnEnd", null, 0, 1, Snippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSnippet_LineStart(), ecorePackage.getEInt(), "lineStart", null, 0, 1, Snippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSnippet_Resource(), this.getResource(), this.getResource_Snippets(), "resource", null, 0, 1, Snippet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlEClass, Url.class, "Url", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUrl_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, Url.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUrl_PatternType(), this.getUrlPattern(), "patternType", null, 0, 1, Url.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graphEClass, Graph.class, "Graph", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    g1 = createEGenericType(graphEClass_T);
    initEReference(getGraph_Root(), g1, null, "root", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericEClass, Generic.class, "Generic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(graphNodeEClass, GraphNode.class, "GraphNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResource_Resources(), this.getResources(), this.getResources_Resources(), "resources", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResource_Snippets(), this.getSnippet(), this.getSnippet_Resource(), "snippets", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Label(), ecorePackage.getEString(), "label", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contentsEClass, Contents.class, "Contents", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getContents_Contents(), ecorePackage.getEString(), "contents", null, 0, 1, Contents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notesEClass, Notes.class, "Notes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNotes_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, Notes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationsEClass, Applications.class, "Applications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getApplications_Applications(), this.getApplication(), this.getApplication_Applications(), "applications", null, 0, -1, Applications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApplications_Assessment(), this.getAssessment(), this.getAssessment_Applications(), "assessment", null, 0, 1, Applications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(findingsEClass, Findings.class, "Findings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFindings_Findings(), this.getFinding(), this.getFinding_Findings(), "findings", null, 0, -1, Findings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFindings_Assessment(), this.getAssessment(), this.getAssessment_Findings(), "assessment", null, 0, 1, Findings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accountsEClass, Accounts.class, "Accounts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAccounts_Application(), this.getApplication(), null, "application", null, 0, 1, Accounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccounts_Accounts(), this.getAccount(), this.getAccount_Accounts(), "accounts", null, 0, -1, Accounts.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(controllersEClass, Controllers.class, "Controllers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getControllers_Application(), this.getApplication(), this.getApplication_Controllers(), "application", null, 0, 1, Controllers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControllers_Controllers(), this.getController(), null, "controllers", null, 0, -1, Controllers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entitlementsEClass, Entitlements.class, "Entitlements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntitlements_Application(), this.getApplication(), null, "application", null, 0, 1, Entitlements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntitlements_Entitlements(), this.getEntitlement(), this.getEntitlement_Entitlements(), "entitlements", null, 0, -1, Entitlements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelsEClass, Models.class, "Models", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModels_Application(), this.getApplication(), this.getApplication_Models(), "application", null, 0, 1, Models.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModels_Models(), this.getModel(), this.getModel_Models(), "models", null, 0, -1, Models.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewsEClass, Views.class, "Views", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getViews_Application(), this.getApplication(), this.getApplication_Views(), "application", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getViews_Views(), this.getView(), this.getView_Views(), "views", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sinksEClass, Sinks.class, "Sinks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSinks_Application(), this.getApplication(), null, "application", null, 0, 1, Sinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSinks_Sinks(), this.getSink(), this.getSink_Sinks(), "sinks", null, 0, -1, Sinks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resourcesEClass, Resources.class, "Resources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResources_Application(), this.getApplication(), this.getApplication_Resources(), "application", null, 0, 1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResources_Resources(), this.getResource(), this.getResource_Resources(), "resources", null, 0, -1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tasksEClass, Tasks.class, "Tasks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTasks_Assessment(), this.getAssessment(), this.getAssessment_Tasks(), "assessment", null, 0, 1, Tasks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTasks_Tasks(), this.getTask(), this.getTask_Tasks(), "tasks", null, 0, -1, Tasks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(httpMethodEEnum, HttpMethod.class, "HttpMethod");
    addEEnumLiteral(httpMethodEEnum, HttpMethod.GET);
    addEEnumLiteral(httpMethodEEnum, HttpMethod.HEAD);
    addEEnumLiteral(httpMethodEEnum, HttpMethod.POST);
    addEEnumLiteral(httpMethodEEnum, HttpMethod.PUT);
    addEEnumLiteral(httpMethodEEnum, HttpMethod.DELETE);
    addEEnumLiteral(httpMethodEEnum, HttpMethod.OPTIONS);
    addEEnumLiteral(httpMethodEEnum, HttpMethod.TRACE);
    addEEnumLiteral(httpMethodEEnum, HttpMethod.CONNECT);
    addEEnumLiteral(httpMethodEEnum, HttpMethod.PATCH);

    initEEnum(urlPatternEEnum, UrlPattern.class, "UrlPattern");
    addEEnumLiteral(urlPatternEEnum, UrlPattern.ANT);

    initEEnum(languageEEnum, Language.class, "Language");
    addEEnumLiteral(languageEEnum, Language.JAVA);
    addEEnumLiteral(languageEEnum, Language.PYTHON);
    addEEnumLiteral(languageEEnum, Language.CSHARP);
    addEEnumLiteral(languageEEnum, Language.SCALA);
    addEEnumLiteral(languageEEnum, Language.PHP);
    addEEnumLiteral(languageEEnum, Language.CCPP);
    addEEnumLiteral(languageEEnum, Language.RUBY);
    addEEnumLiteral(languageEEnum, Language.OTHER);

    initEEnum(taskStatusEEnum, TaskStatus.class, "TaskStatus");
    addEEnumLiteral(taskStatusEEnum, TaskStatus.TODO);
    addEEnumLiteral(taskStatusEEnum, TaskStatus.IN_PROGRESS);
    addEEnumLiteral(taskStatusEEnum, TaskStatus.SKIPPED);
    addEEnumLiteral(taskStatusEEnum, TaskStatus.DONE);

    // Create resource
    createResource(eNS_URI);
  }

} //AssessmentPackageImpl
