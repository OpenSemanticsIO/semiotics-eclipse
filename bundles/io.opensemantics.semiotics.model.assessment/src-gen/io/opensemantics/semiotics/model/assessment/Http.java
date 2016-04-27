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
 * A representation of the model object '<em><b>Http</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Http#getRequest <em>Request</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Http#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getHttp()
 * @model
 * @generated
 */
public interface Http extends GraphNode {
	/**
   * Returns the value of the '<em><b>Request</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Request</em>' attribute.
   * @see #setRequest(String)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getHttp_Request()
   * @model
   * @generated
   */
	String getRequest();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Http#getRequest <em>Request</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Request</em>' attribute.
   * @see #getRequest()
   * @generated
   */
	void setRequest(String value);

	/**
   * Returns the value of the '<em><b>Response</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Response</em>' attribute.
   * @see #setResponse(String)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getHttp_Response()
   * @model
   * @generated
   */
	String getResponse();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Http#getResponse <em>Response</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response</em>' attribute.
   * @see #getResponse()
   * @generated
   */
	void setResponse(String value);

} // Http
