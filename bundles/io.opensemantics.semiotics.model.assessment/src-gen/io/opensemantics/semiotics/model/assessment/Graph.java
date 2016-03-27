/**
 */
package io.opensemantics.semiotics.model.assessment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Graph#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getGraph()
 * @model abstract="true"
 * @generated
 */
public interface Graph<T extends Node> extends EObject {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Node#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Node)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getGraph_Root()
	 * @see io.opensemantics.semiotics.model.assessment.Node#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	T getRoot();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Graph#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(T value);

} // Graph
