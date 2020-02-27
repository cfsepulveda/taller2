/**
 */
package cloud_computing.impl;

import cloud_computing.Cloud_computingPackage;
import cloud_computing.Conexion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conexion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.ConexionImpl#getRecurso1 <em>Recurso1</em>}</li>
 *   <li>{@link cloud_computing.impl.ConexionImpl#getRecurso2 <em>Recurso2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConexionImpl extends MinimalEObjectImpl.Container implements Conexion {
	/**
	 * The default value of the '{@link #getRecurso1() <em>Recurso1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurso1()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURSO1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurso1() <em>Recurso1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurso1()
	 * @generated
	 * @ordered
	 */
	protected String recurso1 = RECURSO1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurso2() <em>Recurso2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurso2()
	 * @generated
	 * @ordered
	 */
	protected static final String RECURSO2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecurso2() <em>Recurso2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurso2()
	 * @generated
	 * @ordered
	 */
	protected String recurso2 = RECURSO2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConexionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cloud_computingPackage.Literals.CONEXION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecurso1() {
		return recurso1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurso1(String newRecurso1) {
		String oldRecurso1 = recurso1;
		recurso1 = newRecurso1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.CONEXION__RECURSO1, oldRecurso1, recurso1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecurso2() {
		return recurso2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurso2(String newRecurso2) {
		String oldRecurso2 = recurso2;
		recurso2 = newRecurso2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.CONEXION__RECURSO2, oldRecurso2, recurso2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cloud_computingPackage.CONEXION__RECURSO1:
				return getRecurso1();
			case Cloud_computingPackage.CONEXION__RECURSO2:
				return getRecurso2();
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
			case Cloud_computingPackage.CONEXION__RECURSO1:
				setRecurso1((String)newValue);
				return;
			case Cloud_computingPackage.CONEXION__RECURSO2:
				setRecurso2((String)newValue);
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
			case Cloud_computingPackage.CONEXION__RECURSO1:
				setRecurso1(RECURSO1_EDEFAULT);
				return;
			case Cloud_computingPackage.CONEXION__RECURSO2:
				setRecurso2(RECURSO2_EDEFAULT);
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
			case Cloud_computingPackage.CONEXION__RECURSO1:
				return RECURSO1_EDEFAULT == null ? recurso1 != null : !RECURSO1_EDEFAULT.equals(recurso1);
			case Cloud_computingPackage.CONEXION__RECURSO2:
				return RECURSO2_EDEFAULT == null ? recurso2 != null : !RECURSO2_EDEFAULT.equals(recurso2);
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
		result.append(" (recurso1: ");
		result.append(recurso1);
		result.append(", recurso2: ");
		result.append(recurso2);
		result.append(')');
		return result.toString();
	}

} //ConexionImpl
