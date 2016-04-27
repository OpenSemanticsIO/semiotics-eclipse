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
 * A representation of the literals of the enumeration '<em><b>Task Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getTaskStatus()
 * @model
 * @generated
 */
public enum TaskStatus implements Enumerator {
	/**
   * The '<em><b>Todo</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #TODO_VALUE
   * @generated
   * @ordered
   */
	TODO(0, "todo", "todo"),

	/**
   * The '<em><b>In progress</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #IN_PROGRESS_VALUE
   * @generated
   * @ordered
   */
	IN_PROGRESS(0, "in_progress", "in_progress"),

	/**
   * The '<em><b>Skipped</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SKIPPED_VALUE
   * @generated
   * @ordered
   */
	SKIPPED(0, "skipped", "skipped"),

	/**
   * The '<em><b>Done</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #DONE_VALUE
   * @generated
   * @ordered
   */
	DONE(0, "done", "done");

	/**
   * The '<em><b>Todo</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Todo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #TODO
   * @model name="todo"
   * @generated
   * @ordered
   */
	public static final int TODO_VALUE = 0;

	/**
   * The '<em><b>In progress</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In progress</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #IN_PROGRESS
   * @model name="in_progress"
   * @generated
   * @ordered
   */
	public static final int IN_PROGRESS_VALUE = 0;

	/**
   * The '<em><b>Skipped</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Skipped</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SKIPPED
   * @model name="skipped"
   * @generated
   * @ordered
   */
	public static final int SKIPPED_VALUE = 0;

	/**
   * The '<em><b>Done</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Done</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #DONE
   * @model name="done"
   * @generated
   * @ordered
   */
	public static final int DONE_VALUE = 0;

	/**
   * An array of all the '<em><b>Task Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final TaskStatus[] VALUES_ARRAY =
		new TaskStatus[] {
      TODO,
      IN_PROGRESS,
      SKIPPED,
      DONE,
    };

	/**
   * A public read-only list of all the '<em><b>Task Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<TaskStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Task Status</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static TaskStatus get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TaskStatus result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Task Status</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static TaskStatus getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      TaskStatus result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Task Status</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
	public static TaskStatus get(int value) {
    switch (value) {
      case TODO_VALUE: return TODO;
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
	private TaskStatus(int value, String name, String literal) {
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
	
} //TaskStatus
