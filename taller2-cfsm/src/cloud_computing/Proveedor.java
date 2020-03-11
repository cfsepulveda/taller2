/**
 */
package cloud_computing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proveedor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.Proveedor#getConexion <em>Conexion</em>}</li>
 *   <li>{@link cloud_computing.Proveedor#getAmbientedesplegue <em>Ambientedesplegue</em>}</li>
 *   <li>{@link cloud_computing.Proveedor#getVpc <em>Vpc</em>}</li>
 *   <li>{@link cloud_computing.Proveedor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cloud_computing.Proveedor#getSecuritygroup <em>Securitygroup</em>}</li>
 *   <li>{@link cloud_computing.Proveedor#getSubred <em>Subred</em>}</li>
 *   <li>{@link cloud_computing.Proveedor#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getProveedor()
 * @model
 * @generated
 */
public interface Proveedor extends EObject {
	/**
	 * Returns the value of the '<em><b>Conexion</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.Conexion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conexion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conexion</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getProveedor_Conexion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conexion> getConexion();

	/**
	 * Returns the value of the '<em><b>Ambientedesplegue</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.AmbienteDesplegue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambientedesplegue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambientedesplegue</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getProveedor_Ambientedesplegue()
	 * @model containment="true"
	 * @generated
	 */
	EList<AmbienteDesplegue> getAmbientedesplegue();

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.Gateway}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getProveedor_Vpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gateway> getVpc();

	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * The literals are from the enumeration {@link cloud_computing.ProveedorServicio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see cloud_computing.ProveedorServicio
	 * @see #setNombre(ProveedorServicio)
	 * @see cloud_computing.Cloud_computingPackage#getProveedor_Nombre()
	 * @model
	 * @generated
	 */
	ProveedorServicio getNombre();

	/**
	 * Sets the value of the '{@link cloud_computing.Proveedor#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see cloud_computing.ProveedorServicio
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(ProveedorServicio value);

	/**
	 * Returns the value of the '<em><b>Securitygroup</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitygroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitygroup</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getProveedor_Securitygroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityGroup> getSecuritygroup();

	/**
	 * Returns the value of the '<em><b>Subred</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.Subred}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subred</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subred</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getProveedor_Subred()
	 * @model containment="true"
	 * @generated
	 */
	EList<Subred> getSubred();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.Rules}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getProveedor_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rules> getRules();

} // Proveedor
