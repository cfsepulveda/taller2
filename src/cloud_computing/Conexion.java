/**
 */
package cloud_computing;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link cloud_computing.Conexion#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link cloud_computing.Conexion#getNombreConexion <em>Nombre Conexion</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getConexion()
 * @model
 * @generated
 */
public interface Conexion extends EObject {
	/**
	 * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.Atributos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributos</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getConexion_Atributos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Atributos> getAtributos();

	/**
	 * Returns the value of the '<em><b>Nombre Conexion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Conexion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

} // Conexion
