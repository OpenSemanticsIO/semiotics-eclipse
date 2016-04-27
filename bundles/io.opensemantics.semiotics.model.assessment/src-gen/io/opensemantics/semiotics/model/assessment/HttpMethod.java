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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Http Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getHttpMethod()
 * @model
 * @generated
 */
public enum HttpMethod implements Enumerator {
	/**
   * The '<em><b>GET</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #GET_VALUE
   * @generated
   * @ordered
   */
	GET(0, "GET", "GET"),

	/**
   * The '<em><b>HEAD</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #HEAD_VALUE
   * @generated
   * @ordered
   */
	HEAD(0, "HEAD", "HEAD"),

	/**
   * The '<em><b>POST</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #POST_VALUE
   * @generated
   * @ordered
   */
	POST(0, "POST", "POST"),

	/**
   * The '<em><b>PUT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #PUT_VALUE
   * @generated
   * @ordered
   */
	PUT(0, "PUT", "PUT"),

	/**
   * The '<em><b>DELETE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #DELETE_VALUE
   * @generated
   * @ordered
   */
	DELETE(0, "DELETE", "DELETE"),

	/**
   * The '<em><b>OPTIONS</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #OPTIONS_VALUE
   * @generated
   * @ordered
   */
	OPTIONS(0, "OPTIONS", "OPTIONS"),

	/**
   * The '<em><b>TRACE</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #TRACE_VALUE
   * @generated
   * @ordered
   */
	TRACE(0, "TRACE", "TRACE"),

	/**
   * The '<em><b>CONNECT</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #CONNECT_VALUE
   * @generated
   * @ordered
   */
	CONNECT(0, "CONNECT", "CONNECT"),

	/**
   * The '<em><b>PATCH</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #PATCH_VALUE
   * @generated
   * @ordered
   */
	PATCH(0, "PATCH", "PATCH");

	/**
   * The '<em><b>GET</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #GET
   * @model
   * @generated
   * @ordered
   */
	public static final int GET_VALUE = 0;

	/**
   * The '<em><b>HEAD</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HEAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #HEAD
   * @model
   * @generated
   * @ordered
   */
	public static final int HEAD_VALUE = 0;

	/**
   * The '<em><b>POST</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #POST
   * @model
   * @generated
   * @ordered
   */
	public static final int POST_VALUE = 0;

	/**
   * The '<em><b>PUT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #PUT
   * @model
   * @generated
   * @ordered
   */
	public static final int PUT_VALUE = 0;

	/**
   * The '<em><b>DELETE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #DELETE
   * @model
   * @generated
   * @ordered
   */
	public static final int DELETE_VALUE = 0;

	/**
   * The '<em><b>OPTIONS</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPTIONS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #OPTIONS
   * @model
   * @generated
   * @ordered
   */
	public static final int OPTIONS_VALUE = 0;

	/**
   * The '<em><b>TRACE</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #TRACE
   * @model
   * @generated
   * @ordered
   */
	public static final int TRACE_VALUE = 0;

	/**
   * The '<em><b>CONNECT</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #CONNECT
   * @model
   * @generated
   * @ordered
   */
	public static final int CONNECT_VALUE = 0;

	/**
   * The '<em><b>PATCH</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PATCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #PATCH
   * @model
   * @generated
   * @ordered
   */
	public static final int PATCH_VALUE = 0;

	/**
   * An array of all the '<em><b>Http Method</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final HttpMethod[] VALUES_ARRAY =
		new HttpMethod[] {
      GET,
      HEAD,
      POST,
      PUT,
      DELETE,
      OPTIONS,
      TRACE,
      CONNECT,
      PATCH,
    };

	/**
   * A public read-only list of all the '<em><b>Http Method</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<HttpMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Http Method</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static HttpMethod get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      HttpMethod result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Http Method</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static HttpMethod getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      HttpMethod result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Http Method</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static HttpMethod get(int value) {
    switch (value) {
      case GET_VALUE: return GET;
    }
    return null;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final int value;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String name;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String literal;

	/**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private HttpMethod(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLiteral() {
    return literal;
  }

	/**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    return literal;
  }
	
} //HttpMethod
