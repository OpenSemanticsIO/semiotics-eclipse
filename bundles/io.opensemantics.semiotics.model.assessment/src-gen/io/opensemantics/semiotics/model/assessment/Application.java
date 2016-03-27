/**
 */
package io.opensemantics.semiotics.model.assessment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Application#getAssessment <em>Assessment</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Assessment#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment</em>' container reference.
	 * @see #setAssessment(Assessment)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getApplication_Assessment()
	 * @see io.opensemantics.semiotics.model.assessment.Assessment#getApplications
	 * @model opposite="applications" transient="false"
	 * @generated
	 */
	Assessment getAssessment();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Application#getAssessment <em>Assessment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment</em>' container reference.
	 * @see #getAssessment()
	 * @generated
	 */
	void setAssessment(Assessment value);

} // Application
