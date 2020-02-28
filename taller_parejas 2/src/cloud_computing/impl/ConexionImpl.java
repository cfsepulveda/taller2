/**
 */
package cloud_computing.impl;

import cloud_computing.Cloud_computingPackage;
import cloud_computing.Conexion;
import cloud_computing.Servidor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link cloud_computing.impl.ConexionImpl#getServidor2 <em>Servidor2</em>}</li>
 *   <li>{@link cloud_computing.impl.ConexionImpl#getServidor1 <em>Servidor1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConexionImpl extends MinimalEObjectImpl.Container implements Conexion {
	/**
	 * The cached value of the '{@link #getServidor2() <em>Servidor2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServidor2()
	 * @generated
	 * @ordered
	 */
	protected Servidor servidor2;

	/**
	 * The cached value of the '{@link #getServidor1() <em>Servidor1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServidor1()
	 * @generated
	 * @ordered
	 */
	protected Servidor servidor1;

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
	public Servidor getServidor2() {
		if (servidor2 != null && servidor2.eIsProxy()) {
			InternalEObject oldServidor2 = (InternalEObject)servidor2;
			servidor2 = (Servidor)eResolveProxy(oldServidor2);
			if (servidor2 != oldServidor2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cloud_computingPackage.CONEXION__SERVIDOR2, oldServidor2, servidor2));
			}
		}
		return servidor2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servidor basicGetServidor2() {
		return servidor2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServidor2(Servidor newServidor2) {
		Servidor oldServidor2 = servidor2;
		servidor2 = newServidor2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.CONEXION__SERVIDOR2, oldServidor2, servidor2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Servidor getServidor1() {
		if (servidor1 != null && servidor1.eIsProxy()) {
			InternalEObject oldServidor1 = (InternalEObject)servidor1;
			servidor1 = (Servidor)eResolveProxy(oldServidor1);
			if (servidor1 != oldServidor1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cloud_computingPackage.CONEXION__SERVIDOR1, oldServidor1, servidor1));
			}
		}
		return servidor1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servidor basicGetServidor1() {
		return servidor1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServidor1(Servidor newServidor1) {
		Servidor oldServidor1 = servidor1;
		servidor1 = newServidor1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.CONEXION__SERVIDOR1, oldServidor1, servidor1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cloud_computingPackage.CONEXION__SERVIDOR2:
				if (resolve) return getServidor2();
				return basicGetServidor2();
			case Cloud_computingPackage.CONEXION__SERVIDOR1:
				if (resolve) return getServidor1();
				return basicGetServidor1();
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
			case Cloud_computingPackage.CONEXION__SERVIDOR2:
				setServidor2((Servidor)newValue);
				return;
			case Cloud_computingPackage.CONEXION__SERVIDOR1:
				setServidor1((Servidor)newValue);
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
			case Cloud_computingPackage.CONEXION__SERVIDOR2:
				setServidor2((Servidor)null);
				return;
			case Cloud_computingPackage.CONEXION__SERVIDOR1:
				setServidor1((Servidor)null);
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
			case Cloud_computingPackage.CONEXION__SERVIDOR2:
				return servidor2 != null;
			case Cloud_computingPackage.CONEXION__SERVIDOR1:
				return servidor1 != null;
		}
		return super.eIsSet(featureID);
	}

} //ConexionImpl
