/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.core.impl;

import java.util.Collection;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.Foreach;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.impl.ForeachImpl#getDo <em>Do</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.impl.ForeachImpl#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeachImpl extends CommandImpl implements Foreach {
	/**
	 * The cached value of the '{@link #getDo() <em>Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDo()
	 * @generated
	 * @ordered
	 */
	protected Command do_;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.FOREACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command getDo() {
		return do_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDo(Command newDo, NotificationChain msgs) {
		Command oldDo = do_;
		do_ = newDo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FOREACH__DO, oldDo, newDo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDo(Command newDo) {
		if (newDo != do_) {
			NotificationChain msgs = null;
			if (do_ != null)
				msgs = ((InternalEObject)do_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FOREACH__DO, null, msgs);
			if (newDo != null)
				msgs = ((InternalEObject)newDo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FOREACH__DO, null, msgs);
			msgs = basicSetDo(newDo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FOREACH__DO, newDo, newDo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<EObject>(EObject.class, this, CorePackage.FOREACH__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FOREACH__DO:
				return basicSetDo(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.FOREACH__DO:
				return getDo();
			case CorePackage.FOREACH__INPUT:
				return getInput();
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
			case CorePackage.FOREACH__DO:
				setDo((Command)newValue);
				return;
			case CorePackage.FOREACH__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends EObject>)newValue);
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
			case CorePackage.FOREACH__DO:
				setDo((Command)null);
				return;
			case CorePackage.FOREACH__INPUT:
				getInput().clear();
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
			case CorePackage.FOREACH__DO:
				return do_ != null;
			case CorePackage.FOREACH__INPUT:
				return input != null && !input.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForeachImpl
