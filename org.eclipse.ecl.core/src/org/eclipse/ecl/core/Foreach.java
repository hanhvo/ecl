/**
 * <copyright>
 * </copyright>
 *
 * $Id: Foreach.java,v 1.3 2011/01/31 14:20:11 alena Exp $
 */
package org.eclipse.ecl.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.Foreach#getDo <em>Do</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.Foreach#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getForeach()
 * @model
 * @generated
 */
public interface Foreach extends Command {
	/**
	 * Returns the value of the '<em><b>Do</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' containment reference.
	 * @see #setDo(Command)
	 * @see org.eclipse.ecl.core.CorePackage#getForeach_Do()
	 * @model containment="true"
	 * @generated
	 */
	Command getDo();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.Foreach#getDo <em>Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do</em>' containment reference.
	 * @see #getDo()
	 * @generated
	 */
	void setDo(Command value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see org.eclipse.ecl.core.CorePackage#getForeach_Input()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getInput();

} // Foreach
