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

import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Http;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.HttpImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.HttpImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HttpImpl extends GraphNodeImpl implements Http {
	/**
   * The default value of the '{@link #getRequest() <em>Request</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRequest()
   * @generated
   * @ordered
   */
	protected static final String REQUEST_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getRequest() <em>Request</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRequest()
   * @generated
   * @ordered
   */
	protected String request = REQUEST_EDEFAULT;

	/**
   * The default value of the '{@link #getResponse() <em>Response</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
	protected static final String RESPONSE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getResponse() <em>Response</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getResponse()
   * @generated
   * @ordered
   */
	protected String response = RESPONSE_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HttpImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.HTTP;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getRequest() {
    return request;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRequest(String newRequest) {
    String oldRequest = request;
    request = newRequest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.HTTP__REQUEST, oldRequest, request));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getResponse() {
    return response;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setResponse(String newResponse) {
    String oldResponse = response;
    response = newResponse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.HTTP__RESPONSE, oldResponse, response));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case AssessmentPackage.HTTP__REQUEST:
        return getRequest();
      case AssessmentPackage.HTTP__RESPONSE:
        return getResponse();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case AssessmentPackage.HTTP__REQUEST:
        setRequest((String)newValue);
        return;
      case AssessmentPackage.HTTP__RESPONSE:
        setResponse((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID) {
      case AssessmentPackage.HTTP__REQUEST:
        setRequest(REQUEST_EDEFAULT);
        return;
      case AssessmentPackage.HTTP__RESPONSE:
        setResponse(RESPONSE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case AssessmentPackage.HTTP__REQUEST:
        return REQUEST_EDEFAULT == null ? request != null : !REQUEST_EDEFAULT.equals(request);
      case AssessmentPackage.HTTP__RESPONSE:
        return RESPONSE_EDEFAULT == null ? response != null : !RESPONSE_EDEFAULT.equals(response);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (request: ");
    result.append(request);
    result.append(", response: ");
    result.append(response);
    result.append(')');
    return result.toString();
  }

} //HttpImpl
