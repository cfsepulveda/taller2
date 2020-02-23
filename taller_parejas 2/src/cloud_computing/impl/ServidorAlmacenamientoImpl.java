/**
 */
package cloud_computing.impl;

import cloud_computing.Cloud_computingPackage;
import cloud_computing.ServidorAlmacenamiento;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servidor Almacenamiento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.ServidorAlmacenamientoImpl#getTamanoInicial <em>Tamano Inicial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServidorAlmacenamientoImpl extends ServidorImpl implements ServidorAlmacenamiento {
	/**
	 * The default value of the '{@link #getTamanoInicial() <em>Tamano Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanoInicial()
	 * @generated
	 * @ordered
	 */
	protected static final String TAMANO_INICIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTamanoInicial() <em>Tamano Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanoInicial()
	 * @generated
	 * @ordered
	 */
	protected String tamanoInicial = TAMANO_INICIAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServidorAlmacenamientoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cloud_computingPackage.Literals.SERVIDOR_ALMACENAMIENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTamanoInicial() {
		return tamanoInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTamanoInicial(String newTamanoInicial) {
		String oldTamanoInicial = tamanoInicial;
		tamanoInicial = newTamanoInicial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SERVIDOR_ALMACENAMIENTO__TAMANO_INICIAL, oldTamanoInicial, tamanoInicial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cloud_computingPackage.SERVIDOR_ALMACENAMIENTO__TAMANO_INICIAL:
				return getTamanoInicial();
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
			case Cloud_computingPackage.SERVIDOR_ALMACENAMIENTO__TAMANO_INICIAL:
				setTamanoInicial((String)newValue);
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
			case Cloud_computingPackage.SERVIDOR_ALMACENAMIENTO__TAMANO_INICIAL:
				setTamanoInicial(TAMANO_INICIAL_EDEFAULT);
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
			case Cloud_computingPackage.SERVIDOR_ALMACENAMIENTO__TAMANO_INICIAL:
				return TAMANO_INICIAL_EDEFAULT == null ? tamanoInicial != null : !TAMANO_INICIAL_EDEFAULT.equals(tamanoInicial);
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
		result.append(" (tamanoInicial: ");
		result.append(tamanoInicial);
		result.append(')');
		return result.toString();
	}

} //ServidorAlmacenamientoImpl
