/**
 */
package cloud_computing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conexion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.Conexion#getNombreConexion <em>Nombre Conexion</em>}</li>
 *   <li>{@link cloud_computing.Conexion#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link cloud_computing.Conexion#getContrasena <em>Contrasena</em>}</li>
 *   <li>{@link cloud_computing.Conexion#getAccessId <em>Access Id</em>}</li>
 *   <li>{@link cloud_computing.Conexion#getSecret <em>Secret</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getConexion()
 * @model
 * @generated
 */
public interface Conexion extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Conexion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Conexion</em>' attribute.
	 * @see #setNombreConexion(String)
	 * @see cloud_computing.Cloud_computingPackage#getConexion_NombreConexion()
	 * @model
	 * @generated
	 */
	String getNombreConexion();

	/**
	 * Sets the value of the '{@link cloud_computing.Conexion#getNombreConexion <em>Nombre Conexion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Conexion</em>' attribute.
	 * @see #getNombreConexion()
	 * @generated
	 */
	void setNombreConexion(String value);

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' attribute.
	 * @see #setUsuario(String)
	 * @see cloud_computing.Cloud_computingPackage#getConexion_Usuario()
	 * @model
	 * @generated
	 */
	String getUsuario();

	/**
	 * Sets the value of the '{@link cloud_computing.Conexion#getUsuario <em>Usuario</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' attribute.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(String value);

	/**
	 * Returns the value of the '<em><b>Contrasena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrasena</em>' attribute.
	 * @see #setContrasena(String)
	 * @see cloud_computing.Cloud_computingPackage#getConexion_Contrasena()
	 * @model
	 * @generated
	 */
	String getContrasena();

	/**
	 * Sets the value of the '{@link cloud_computing.Conexion#getContrasena <em>Contrasena</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrasena</em>' attribute.
	 * @see #getContrasena()
	 * @generated
	 */
	void setContrasena(String value);

	/**
	 * Returns the value of the '<em><b>Access Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Id</em>' attribute.
	 * @see #setAccessId(String)
	 * @see cloud_computing.Cloud_computingPackage#getConexion_AccessId()
	 * @model
	 * @generated
	 */
	String getAccessId();

	/**
	 * Sets the value of the '{@link cloud_computing.Conexion#getAccessId <em>Access Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Id</em>' attribute.
	 * @see #getAccessId()
	 * @generated
	 */
	void setAccessId(String value);

	/**
	 * Returns the value of the '<em><b>Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret</em>' attribute.
	 * @see #setSecret(String)
	 * @see cloud_computing.Cloud_computingPackage#getConexion_Secret()
	 * @model
	 * @generated
	 */
	String getSecret();

	/**
	 * Sets the value of the '{@link cloud_computing.Conexion#getSecret <em>Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret</em>' attribute.
	 * @see #getSecret()
	 * @generated
	 */
	void setSecret(String value);

} // Conexion
