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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snippet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Snippet#getLineEnd <em>Line End</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Snippet#getColumnStart <em>Column Start</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Snippet#getColumnEnd <em>Column End</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Snippet#getLineStart <em>Line Start</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Snippet#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getSnippet()
 * @model
 * @generated
 */
public interface Snippet extends GraphNode, Contents {
	/**
	 * Returns the value of the '<em><b>Line End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line End</em>' attribute.
	 * @see #setLineEnd(int)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getSnippet_LineEnd()
	 * @model
	 * @generated
	 */
	int getLineEnd();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Snippet#getLineEnd <em>Line End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line End</em>' attribute.
	 * @see #getLineEnd()
	 * @generated
	 */
	void setLineEnd(int value);

	/**
	 * Returns the value of the '<em><b>Column Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Start</em>' attribute.
	 * @see #setColumnStart(int)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getSnippet_ColumnStart()
	 * @model
	 * @generated
	 */
	int getColumnStart();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Snippet#getColumnStart <em>Column Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Start</em>' attribute.
	 * @see #getColumnStart()
	 * @generated
	 */
	void setColumnStart(int value);

	/**
	 * Returns the value of the '<em><b>Column End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column End</em>' attribute.
	 * @see #setColumnEnd(int)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getSnippet_ColumnEnd()
	 * @model
	 * @generated
	 */
	int getColumnEnd();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Snippet#getColumnEnd <em>Column End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column End</em>' attribute.
	 * @see #getColumnEnd()
	 * @generated
	 */
	void setColumnEnd(int value);

	/**
	 * Returns the value of the '<em><b>Line Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Start</em>' attribute.
	 * @see #setLineStart(int)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getSnippet_LineStart()
	 * @model
	 * @generated
	 */
	int getLineStart();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Snippet#getLineStart <em>Line Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Start</em>' attribute.
	 * @see #getLineStart()
	 * @generated
	 */
	void setLineStart(int value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Resource#getSnippets <em>Snippets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getSnippet_Resource()
	 * @see io.opensemantics.semiotics.model.assessment.Resource#getSnippets
	 * @model opposite="snippets"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Snippet#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // Snippet
