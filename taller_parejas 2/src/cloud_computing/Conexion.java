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
 *   <li>{@link cloud_computing.Conexion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cloud_computing.Conexion#getServidor2 <em>Servidor2</em>}</li>
 *   <li>{@link cloud_computing.Conexion#getServidor1 <em>Servidor1</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getConexion()
 * @model
 * @generated
 */
public interface Conexion extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see cloud_computing.Cloud_computingPackage#getConexion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link cloud_computing.Conexion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Servidor2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servidor2</em>' reference.
	 * @see #setServidor2(Servidor)
	 * @see cloud_computing.Cloud_computingPackage#getConexion_Servidor2()
	 * @model
	 * @generated
	 */
	Servidor getServidor2();

	/**
	 * Sets the value of the '{@link cloud_computing.Conexion#getServidor2 <em>Servidor2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servidor2</em>' reference.
	 * @see #getServidor2()
	 * @generated
	 */
	void setServidor2(Servidor value);

	/**
	 * Returns the value of the '<em><b>Servidor1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servidor1</em>' reference.
	 * @see #setServidor1(Servidor)
	 * @see cloud_computing.Cloud_computingPackage#getConexion_Servidor1()
	 * @model
	 * @generated
	 */
	Servidor getServidor1();

	/**
	 * Sets the value of the '{@link cloud_computing.Conexion#getServidor1 <em>Servidor1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servidor1</em>' reference.
	 * @see #getServidor1()
	 * @generated
	 */
	void setServidor1(Servidor value);

} // Conexion
