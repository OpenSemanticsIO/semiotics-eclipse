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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Model#getModels <em>Models</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends Node {
	/**
   * Returns the value of the '<em><b>Models</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Models#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Models</em>' container reference.
   * @see #setModels(Models)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getModel_Models()
   * @see io.opensemantics.semiotics.model.assessment.Models#getModels
   * @model opposite="models" transient="false"
   * @generated
   */
	Models getModels();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Model#getModels <em>Models</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Models</em>' container reference.
   * @see #getModels()
   * @generated
   */
	void setModels(Models value);

} // Model
