/**
 */
package cloud_computing.impl;

import cloud_computing.Cloud_computingPackage;
import cloud_computing.ServidorAplicacion;
import cloud_computing.SistemaOperativo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servidor Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.ServidorAplicacionImpl#getSistemaO <em>Sistema O</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServidorAplicacionImpl extends ServidorImpl implements ServidorAplicacion {
	/**
	 * The default value of the '{@link #getSistemaO() <em>Sistema O</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemaO()
	 * @generated
	 * @ordered
	 */
	protected static final SistemaOperativo SISTEMA_O_EDEFAULT = SistemaOperativo.WINDOWS;

	/**
	 * The cached value of the '{@link #getSistemaO() <em>Sistema O</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemaO()
	 * @generated
	 * @ordered
	 */
	protected SistemaOperativo sistemaO = SISTEMA_O_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServidorAplicacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cloud_computingPackage.Literals.SERVIDOR_APLICACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SistemaOperativo getSistemaO() {
		return sistemaO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSistemaO(SistemaOperativo newSistemaO) {
		SistemaOperativo oldSistemaO = sistemaO;
		sistemaO = newSistemaO == null ? SISTEMA_O_EDEFAULT : newSistemaO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SERVIDOR_APLICACION__SISTEMA_O, oldSistemaO, sistemaO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cloud_computingPackage.SERVIDOR_APLICACION__SISTEMA_O:
				return getSistemaO();
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
			case Cloud_computingPackage.SERVIDOR_APLICACION__SISTEMA_O:
				setSistemaO((SistemaOperativo)newValue);
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
			case Cloud_computingPackage.SERVIDOR_APLICACION__SISTEMA_O:
				setSistemaO(SISTEMA_O_EDEFAULT);
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
			case Cloud_computingPackage.SERVIDOR_APLICACION__SISTEMA_O:
				return sistemaO != SISTEMA_O_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (sistemaO: ");
		result.append(sistemaO);
		result.append(')');
		return result.toString();
	}

} //ServidorAplicacionImpl
