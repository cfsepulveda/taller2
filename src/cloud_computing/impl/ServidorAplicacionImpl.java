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
 *   <li>{@link cloud_computing.impl.ServidorAplicacionImpl#getSistemaOperativo <em>Sistema Operativo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServidorAplicacionImpl extends ServidorImpl implements ServidorAplicacion {
	/**
	 * The default value of the '{@link #getSistemaOperativo() <em>Sistema Operativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemaOperativo()
	 * @generated
	 * @ordered
	 */
	protected static final SistemaOperativo SISTEMA_OPERATIVO_EDEFAULT = SistemaOperativo.WINDOWS;

	/**
	 * The cached value of the '{@link #getSistemaOperativo() <em>Sistema Operativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemaOperativo()
	 * @generated
	 * @ordered
	 */
	protected SistemaOperativo sistemaOperativo = SISTEMA_OPERATIVO_EDEFAULT;

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
	public SistemaOperativo getSistemaOperativo() {
		return sistemaOperativo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSistemaOperativo(SistemaOperativo newSistemaOperativo) {
		SistemaOperativo oldSistemaOperativo = sistemaOperativo;
		sistemaOperativo = newSistemaOperativo == null ? SISTEMA_OPERATIVO_EDEFAULT : newSistemaOperativo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SERVIDOR_APLICACION__SISTEMA_OPERATIVO, oldSistemaOperativo, sistemaOperativo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cloud_computingPackage.SERVIDOR_APLICACION__SISTEMA_OPERATIVO:
				return getSistemaOperativo();
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
			case Cloud_computingPackage.SERVIDOR_APLICACION__SISTEMA_OPERATIVO:
				setSistemaOperativo((SistemaOperativo)newValue);
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
			case Cloud_computingPackage.SERVIDOR_APLICACION__SISTEMA_OPERATIVO:
				setSistemaOperativo(SISTEMA_OPERATIVO_EDEFAULT);
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
			case Cloud_computingPackage.SERVIDOR_APLICACION__SISTEMA_OPERATIVO:
				return sistemaOperativo != SISTEMA_OPERATIVO_EDEFAULT;
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
		result.append(" (sistemaOperativo: ");
		result.append(sistemaOperativo);
		result.append(')');
		return result.toString();
	}

} //ServidorAplicacionImpl
