/**
 */
package cloud_computing.impl;

import cloud_computing.Atributos;
import cloud_computing.Cloud_computingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.AtributosImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cloud_computing.impl.AtributosImpl#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link cloud_computing.impl.AtributosImpl#getTipoConexion <em>Tipo Conexion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributosImpl extends MinimalEObjectImpl.Container implements Atributos {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_DATO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoDato() <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoDato()
	 * @generated
	 * @ordered
	 */
	protected String tipoDato = TIPO_DATO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTipoConexion() <em>Tipo Conexion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoConexion()
	 * @generated
	 * @ordered
	 */
	protected static final String TIPO_CONEXION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTipoConexion() <em>Tipo Conexion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoConexion()
	 * @generated
	 * @ordered
	 */
	protected String tipoConexion = TIPO_CONEXION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cloud_computingPackage.Literals.ATRIBUTOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.ATRIBUTOS__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTipoDato() {
		return tipoDato;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoDato(String newTipoDato) {
		String oldTipoDato = tipoDato;
		tipoDato = newTipoDato;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.ATRIBUTOS__TIPO_DATO, oldTipoDato, tipoDato));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTipoConexion() {
		return tipoConexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoConexion(String newTipoConexion) {
		String oldTipoConexion = tipoConexion;
		tipoConexion = newTipoConexion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.ATRIBUTOS__TIPO_CONEXION, oldTipoConexion, tipoConexion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cloud_computingPackage.ATRIBUTOS__NOMBRE:
				return getNombre();
			case Cloud_computingPackage.ATRIBUTOS__TIPO_DATO:
				return getTipoDato();
			case Cloud_computingPackage.ATRIBUTOS__TIPO_CONEXION:
				return getTipoConexion();
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
			case Cloud_computingPackage.ATRIBUTOS__NOMBRE:
				setNombre((String)newValue);
				return;
			case Cloud_computingPackage.ATRIBUTOS__TIPO_DATO:
				setTipoDato((String)newValue);
				return;
			case Cloud_computingPackage.ATRIBUTOS__TIPO_CONEXION:
				setTipoConexion((String)newValue);
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
			case Cloud_computingPackage.ATRIBUTOS__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Cloud_computingPackage.ATRIBUTOS__TIPO_DATO:
				setTipoDato(TIPO_DATO_EDEFAULT);
				return;
			case Cloud_computingPackage.ATRIBUTOS__TIPO_CONEXION:
				setTipoConexion(TIPO_CONEXION_EDEFAULT);
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
			case Cloud_computingPackage.ATRIBUTOS__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Cloud_computingPackage.ATRIBUTOS__TIPO_DATO:
				return TIPO_DATO_EDEFAULT == null ? tipoDato != null : !TIPO_DATO_EDEFAULT.equals(tipoDato);
			case Cloud_computingPackage.ATRIBUTOS__TIPO_CONEXION:
				return TIPO_CONEXION_EDEFAULT == null ? tipoConexion != null : !TIPO_CONEXION_EDEFAULT.equals(tipoConexion);
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", tipoDato: ");
		result.append(tipoDato);
		result.append(", tipoConexion: ");
		result.append(tipoConexion);
		result.append(')');
		return result.toString();
	}

} //AtributosImpl
