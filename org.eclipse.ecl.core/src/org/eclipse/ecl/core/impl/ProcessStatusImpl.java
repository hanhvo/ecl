/**
 * <copyright>
 * </copyright>
 *
 * $Id: ProcessStatusImpl.java,v 1.3 2011/02/16 06:55:52 alena Exp $
 */
package org.eclipse.ecl.core.impl;

import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.ProcessStatus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.impl.ProcessStatusImpl#getPluginId <em>Plugin Id</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.impl.ProcessStatusImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.impl.ProcessStatusImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.impl.ProcessStatusImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessStatusImpl extends EObjectImpl implements ProcessStatus {
	/**
	 * The default value of the '{@link #getPluginId() <em>Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginId()
	 * @generated
	 * @ordered
	 */
	protected static final String PLUGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluginId() <em>Plugin Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPluginId()
	 * @generated
	 * @ordered
	 */
	protected String pluginId = PLUGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final int CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected int code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final int SEVERITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected int severity = SEVERITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.PROCESS_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluginId() {
		return pluginId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluginId(String newPluginId) {
		String oldPluginId = pluginId;
		pluginId = newPluginId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROCESS_STATUS__PLUGIN_ID, oldPluginId, pluginId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(int newCode) {
		int oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROCESS_STATUS__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROCESS_STATUS__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(int newSeverity) {
		int oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PROCESS_STATUS__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.PROCESS_STATUS__PLUGIN_ID:
				return getPluginId();
			case CorePackage.PROCESS_STATUS__CODE:
				return getCode();
			case CorePackage.PROCESS_STATUS__MESSAGE:
				return getMessage();
			case CorePackage.PROCESS_STATUS__SEVERITY:
				return getSeverity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.PROCESS_STATUS__PLUGIN_ID:
				setPluginId((String)newValue);
				return;
			case CorePackage.PROCESS_STATUS__CODE:
				setCode((Integer)newValue);
				return;
			case CorePackage.PROCESS_STATUS__MESSAGE:
				setMessage((String)newValue);
				return;
			case CorePackage.PROCESS_STATUS__SEVERITY:
				setSeverity((Integer)newValue);
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
			case CorePackage.PROCESS_STATUS__PLUGIN_ID:
				setPluginId(PLUGIN_ID_EDEFAULT);
				return;
			case CorePackage.PROCESS_STATUS__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case CorePackage.PROCESS_STATUS__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case CorePackage.PROCESS_STATUS__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
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
			case CorePackage.PROCESS_STATUS__PLUGIN_ID:
				return PLUGIN_ID_EDEFAULT == null ? pluginId != null : !PLUGIN_ID_EDEFAULT.equals(pluginId);
			case CorePackage.PROCESS_STATUS__CODE:
				return code != CODE_EDEFAULT;
			case CorePackage.PROCESS_STATUS__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case CorePackage.PROCESS_STATUS__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
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
		result.append(" (pluginId: ");
		result.append(pluginId);
		result.append(", code: ");
		result.append(code);
		result.append(", message: ");
		result.append(message);
		result.append(", severity: ");
		result.append(severity);
		result.append(')');
		return result.toString();
	}

} //ProcessStatusImpl
