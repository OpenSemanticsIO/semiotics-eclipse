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
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.View#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getView()
 * @model
 * @generated
 */
public interface View extends Node {
	/**
   * Returns the value of the '<em><b>Views</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Views#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Views</em>' container reference.
   * @see #setViews(Views)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getView_Views()
   * @see io.opensemantics.semiotics.model.assessment.Views#getViews
   * @model opposite="views" transient="false"
   * @generated
   */
	Views getViews();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.View#getViews <em>Views</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Views</em>' container reference.
   * @see #getViews()
   * @generated
   */
	void setViews(Views value);

} // View
