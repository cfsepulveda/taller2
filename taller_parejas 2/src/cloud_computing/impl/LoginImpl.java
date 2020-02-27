/**
 */
package cloud_computing.impl;

import cloud_computing.Cloud_computingPackage;
import cloud_computing.Login;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Login</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.LoginImpl#getNombreConexion <em>Nombre Conexion</em>}</li>
 *   <li>{@link cloud_computing.impl.LoginImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link cloud_computing.impl.LoginImpl#getContrasena <em>Contrasena</em>}</li>
 *   <li>{@link cloud_computing.impl.LoginImpl#getAccessId <em>Access Id</em>}</li>
 *   <li>{@link cloud_computing.impl.LoginImpl#getSecret <em>Secret</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoginImpl extends MinimalEObjectImpl.Container implements Login {
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
	 * The default value of the '{@link #getUsuario() <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected static final String USUARIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected String usuario = USUARIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getContrasena() <em>Contrasena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrasena()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRASENA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContrasena() <em>Contrasena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrasena()
	 * @generated
	 * @ordered
	 */
	protected String contrasena = CONTRASENA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessId() <em>Access Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessId() <em>Access Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessId()
	 * @generated
	 * @ordered
	 */
	protected String accessId = ACCESS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecret() <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecret() <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret()
	 * @generated
	 * @ordered
	 */
	protected String secret = SECRET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoginImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cloud_computingPackage.Literals.LOGIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombreConexion() {
		return nombreConexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombreConexion(String newNombreConexion) {
		String oldNombreConexion = nombreConexion;
		nombreConexion = newNombreConexion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.LOGIN__NOMBRE_CONEXION, oldNombreConexion, nombreConexion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsuario() {
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsuario(String newUsuario) {
		String oldUsuario = usuario;
		usuario = newUsuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.LOGIN__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContrasena(String newContrasena) {
		String oldContrasena = contrasena;
		contrasena = newContrasena;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.LOGIN__CONTRASENA, oldContrasena, contrasena));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessId() {
		return accessId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessId(String newAccessId) {
		String oldAccessId = accessId;
		accessId = newAccessId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.LOGIN__ACCESS_ID, oldAccessId, accessId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecret() {
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecret(String newSecret) {
		String oldSecret = secret;
		secret = newSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.LOGIN__SECRET, oldSecret, secret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cloud_computingPackage.LOGIN__NOMBRE_CONEXION:
				return getNombreConexion();
			case Cloud_computingPackage.LOGIN__USUARIO:
				return getUsuario();
			case Cloud_computingPackage.LOGIN__CONTRASENA:
				return getContrasena();
			case Cloud_computingPackage.LOGIN__ACCESS_ID:
				return getAccessId();
			case Cloud_computingPackage.LOGIN__SECRET:
				return getSecret();
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
			case Cloud_computingPackage.LOGIN__NOMBRE_CONEXION:
				setNombreConexion((String)newValue);
				return;
			case Cloud_computingPackage.LOGIN__USUARIO:
				setUsuario((String)newValue);
				return;
			case Cloud_computingPackage.LOGIN__CONTRASENA:
				setContrasena((String)newValue);
				return;
			case Cloud_computingPackage.LOGIN__ACCESS_ID:
				setAccessId((String)newValue);
				return;
			case Cloud_computingPackage.LOGIN__SECRET:
				setSecret((String)newValue);
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
			case Cloud_computingPackage.LOGIN__NOMBRE_CONEXION:
				setNombreConexion(NOMBRE_CONEXION_EDEFAULT);
				return;
			case Cloud_computingPackage.LOGIN__USUARIO:
				setUsuario(USUARIO_EDEFAULT);
				return;
			case Cloud_computingPackage.LOGIN__CONTRASENA:
				setContrasena(CONTRASENA_EDEFAULT);
				return;
			case Cloud_computingPackage.LOGIN__ACCESS_ID:
				setAccessId(ACCESS_ID_EDEFAULT);
				return;
			case Cloud_computingPackage.LOGIN__SECRET:
				setSecret(SECRET_EDEFAULT);
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
			case Cloud_computingPackage.LOGIN__NOMBRE_CONEXION:
				return NOMBRE_CONEXION_EDEFAULT == null ? nombreConexion != null : !NOMBRE_CONEXION_EDEFAULT.equals(nombreConexion);
			case Cloud_computingPackage.LOGIN__USUARIO:
				return USUARIO_EDEFAULT == null ? usuario != null : !USUARIO_EDEFAULT.equals(usuario);
			case Cloud_computingPackage.LOGIN__CONTRASENA:
				return CONTRASENA_EDEFAULT == null ? contrasena != null : !CONTRASENA_EDEFAULT.equals(contrasena);
			case Cloud_computingPackage.LOGIN__ACCESS_ID:
				return ACCESS_ID_EDEFAULT == null ? accessId != null : !ACCESS_ID_EDEFAULT.equals(accessId);
			case Cloud_computingPackage.LOGIN__SECRET:
				return SECRET_EDEFAULT == null ? secret != null : !SECRET_EDEFAULT.equals(secret);
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
		result.append(" (nombreConexion: ");
		result.append(nombreConexion);
		result.append(", usuario: ");
		result.append(usuario);
		result.append(", contrasena: ");
		result.append(contrasena);
		result.append(", accessId: ");
		result.append(accessId);
		result.append(", secret: ");
		result.append(secret);
		result.append(')');
		return result.toString();
	}

} //LoginImpl
