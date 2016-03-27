/**
 */
package io.opensemantics.semiotics.model.assessment.util;

import io.opensemantics.semiotics.model.assessment.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage
 * @generated
 */
public class AssessmentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AssessmentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AssessmentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentSwitch<Adapter> modelSwitch =
		new AssessmentSwitch<Adapter>() {
			@Override
			public Adapter caseServiceNode(ServiceNode object) {
				return createServiceNodeAdapter();
			}
			@Override
			public Adapter caseHttpService(HttpService object) {
				return createHttpServiceAdapter();
			}
			@Override
			public Adapter caseHttpNode(HttpNode object) {
				return createHttpNodeAdapter();
			}
			@Override
			public <T extends Node> Adapter caseGraph(Graph<T> object) {
				return createGraphAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseAssessment(Assessment object) {
				return createAssessmentAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseHS2Node(HS2Node object) {
				return createHS2NodeAdapter();
			}
			@Override
			public <S extends ServiceNode> Adapter caseService(Service<S> object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseHS2(HS2 object) {
				return createHS2Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link io.opensemantics.semiotics.model.assessment.ServiceNode <em>Service Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.opensemantics.semiotics.model.assessment.ServiceNode
	 * @generated
	 */
	public Adapter createServiceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.opensemantics.semiotics.model.assessment.HttpService <em>Http Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.opensemantics.semiotics.model.assessment.HttpService
	 * @generated
	 */
	public Adapter createHttpServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.opensemantics.semiotics.model.assessment.HttpNode <em>Http Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.opensemantics.semiotics.model.assessment.HttpNode
	 * @generated
	 */
	public Adapter createHttpNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.opensemantics.semiotics.model.assessment.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.opensemantics.semiotics.model.assessment.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.opensemantics.semiotics.model.assessment.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.opensemantics.semiotics.model.assessment.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.opensemantics.semiotics.model.assessment.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.opensemantics.semiotics.model.assessment.Assessment
	 * @generated
	 */
	public Adapter createAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.opensemantics.semiotics.model.assessment.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.opensemantics.semiotics.model.assessment.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.opensemantics.semiotics.model.assessment.HS2Node <em>HS2 Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.opensemantics.semiotics.model.assessment.HS2Node
	 * @generated
	 */
	public Adapter createHS2NodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.opensemantics.semiotics.model.assessment.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.opensemantics.semiotics.model.assessment.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link io.opensemantics.semiotics.model.assessment.HS2 <em>HS2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see io.opensemantics.semiotics.model.assessment.HS2
	 * @generated
	 */
	public Adapter createHS2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AssessmentAdapterFactory
