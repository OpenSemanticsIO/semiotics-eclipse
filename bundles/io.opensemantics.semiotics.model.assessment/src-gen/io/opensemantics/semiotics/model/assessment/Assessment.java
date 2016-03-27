/**
 */
package io.opensemantics.semiotics.model.assessment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.Assessment#getApplications <em>Applications</em>}</li>
 * </ul>
 *
 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getAssessment()
 * @model
 * @generated
 */
public interface Assessment extends EObject {
	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link io.opensemantics.semiotics.model.assessment.Application#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference.
	 * @see #setApplications(Application)
	 * @see io.opensemantics.semiotics.model.assessment.AssessmentPackage#getAssessment_Applications()
	 * @see io.opensemantics.semiotics.model.assessment.Application#getAssessment
	 * @model opposite="assessment" containment="true"
	 * @generated
	 */
	Application getApplications();

	/**
	 * Sets the value of the '{@link io.opensemantics.semiotics.model.assessment.Assessment#getApplications <em>Applications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applications</em>' containment reference.
	 * @see #getApplications()
	 * @generated
	 */
	void setApplications(Application value);

} // Assessment
