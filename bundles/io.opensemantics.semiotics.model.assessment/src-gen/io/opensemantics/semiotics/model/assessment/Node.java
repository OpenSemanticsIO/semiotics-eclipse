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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Node#getChildren <em>Children</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Node#getParent <em>Parent</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Node#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Node#getReferredBy <em>Referred By</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends Label, Notes {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.GraphNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphNode> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Node)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getNode_Parent()
	 * @model
	 * @generated
	 */
	Node getParent();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Node#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Node value);

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Node}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Node#getReferredBy <em>Referred By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getNode_RefersTo()
	 * @see io.opensemantics.semiotics.model.assessment.Node#getReferredBy
	 * @model opposite="referredBy"
	 * @generated
	 */
	EList<Node> getRefersTo();

	/**
	 * Returns the value of the '<em><b>Referred By</b></em>' reference list.
	 * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Node}.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Node#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred By</em>' reference list.
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getNode_ReferredBy()
	 * @see io.opensemantics.semiotics.model.assessment.Node#getRefersTo
	 * @model opposite="refersTo"
	 * @generated
	 */
	EList<Node> getReferredBy();

} // Node
