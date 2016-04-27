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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Task#getTasks <em>Tasks</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Task#getAffects <em>Affects</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Task#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Label, Notes {
	/**
   * Returns the value of the '<em><b>Tasks</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Tasks#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' container reference.
   * @see #setTasks(Tasks)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getTask_Tasks()
   * @see io.opensemantics.semiotics.model.assessment.Tasks#getTasks
   * @model opposite="tasks" transient="false"
   * @generated
   */
	Tasks getTasks();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Task#getTasks <em>Tasks</em>}' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tasks</em>' container reference.
   * @see #getTasks()
   * @generated
   */
	void setTasks(Tasks value);

	/**
   * Returns the value of the '<em><b>Affects</b></em>' reference list.
   * The list contents are of type {@link io.opensemantics.semiotics.model.assessment.Node}.
   * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Node#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Affects</em>' reference list.
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getTask_Affects()
   * @see io.opensemantics.semiotics.model.assessment.Node#getTasks
   * @model opposite="tasks"
   * @generated
   */
	EList<Node> getAffects();

	/**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * The literals are from the enumeration {@link io.opensemantics.semiotics.model.assessment.TaskStatus}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see io.opensemantics.semiotics.model.assessment.TaskStatus
   * @see #setStatus(TaskStatus)
   * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getTask_Status()
   * @model
   * @generated
   */
	TaskStatus getStatus();

	/**
   * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Task#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see io.opensemantics.semiotics.model.assessment.TaskStatus
   * @see #getStatus()
   * @generated
   */
	void setStatus(TaskStatus value);

} // Task
