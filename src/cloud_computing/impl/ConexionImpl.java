/**
 */
package cloud_computing.impl;

import cloud_computing.Atributos;
import cloud_computing.Cloud_computingPackage;
import cloud_computing.Conexion;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conexion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.ConexionImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link cloud_computing.impl.ConexionImpl#getNombreConexion <em>Nombre Conexion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConexionImpl extends MinimalEObjectImpl.Container implements Conexion {
	/**
	 * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtributos()
	 * @generated
	 * @ordered
	 */
	protected EList<Atributos> atributos;

	/**
	 * The default value of the '{@link #getNombreConexion() <em>Nombre Conexion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreConexion()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_CONEXION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreConexion() <em>Nombre Conexion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreConexion()
	 * @generated
	 * @ordered
	 */
	protected String nombreConexion = NOMBRE_CONEXION_EDEFAULT;

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
	public EList<Atributos> getAtributos() {
		if (atributos == null) {
			atributos = new EObjectContainmentEList<Atributos>(Atributos.class, this, Cloud_computingPackage.CONEXION__ATRIBUTOS);
		}
		return atributos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombreConexion() {
		return nombreConexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreConexion(String newNombreConexion) {
		String oldNombreConexion = nombreConexion;
		nombreConexion = newNombreConexion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.CONEXION__NOMBRE_CONEXION, oldNombreConexion, nombreConexion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cloud_computingPackage.CONEXION__ATRIBUTOS:
				return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
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
			case Cloud_computingPackage.CONEXION__ATRIBUTOS:
				return getAtributos();
			case Cloud_computingPackage.CONEXION__NOMBRE_CONEXION:
				return getNombreConexion();
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
			case Cloud_computingPackage.CONEXION__ATRIBUTOS:
				getAtributos().clear();
				getAtributos().addAll((Collection<? extends Atributos>)newValue);
				return;
			case Cloud_computingPackage.CONEXION__NOMBRE_CONEXION:
				setNombreConexion((String)newValue);
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
			case Cloud_computingPackage.CONEXION__ATRIBUTOS:
				getAtributos().clear();
				return;
			case Cloud_computingPackage.CONEXION__NOMBRE_CONEXION:
				setNombreConexion(NOMBRE_CONEXION_EDEFAULT);
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
			case Cloud_computingPackage.CONEXION__ATRIBUTOS:
				return atributos != null && !atributos.isEmpty();
			case Cloud_computingPackage.CONEXION__NOMBRE_CONEXION:
				return NOMBRE_CONEXION_EDEFAULT == null ? nombreConexion != null : !NOMBRE_CONEXION_EDEFAULT.equals(nombreConexion);
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
		result.append(" (nombreConexion: ");
		result.append(nombreConexion);
		result.append(')');
		return result.toString();
	}

} //ConexionImpl
