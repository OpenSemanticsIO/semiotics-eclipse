/**
 */
package io.opensemantics.semiotics.model.assessment;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Node#getChildren <em>Children</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Node#getParent <em>Parent</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Node#getGraph <em>Graph</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Node}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Node#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getNode_Children()
	 * @see io.opensemantics.semiotics.model.assessment.Node#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Node> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Node#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Node)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getNode_Parent()
	 * @see io.opensemantics.semiotics.model.assessment.Node#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	Node getParent();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Node#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Node value);

	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Graph#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getNode_Graph()
	 * @see io.opensemantics.semiotics.model.assessment.Graph#getRoot
	 * @model opposite="root" transient="false"
	 * @generated
	 */
	Graph<?> getGraph();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Node#getGraph <em>Graph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph<?> value);

} // Node
