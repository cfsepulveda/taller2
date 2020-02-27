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
 *   <li>{@link cloud_computing.Conexion#getRecurso1 <em>Recurso1</em>}</li>
 *   <li>{@link cloud_computing.Conexion#getRecurso2 <em>Recurso2</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getConexion()
 * @model
 * @generated
 */
public interface Conexion extends EObject {
	/**
	 * Returns the value of the '<em><b>Recurso1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurso1</em>' attribute.
	 * @see #setRecurso1(String)
	 * @see cloud_computing.Cloud_computingPackage#getConexion_Recurso1()
	 * @model
	 * @generated
	 */
	String getRecurso1();

	/**
	 * Sets the value of the '{@link cloud_computing.Conexion#getRecurso1 <em>Recurso1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurso1</em>' attribute.
	 * @see #getRecurso1()
	 * @generated
	 */
	void setRecurso1(String value);

	/**
	 * Returns the value of the '<em><b>Recurso2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurso2</em>' attribute.
	 * @see #setRecurso2(String)
	 * @see cloud_computing.Cloud_computingPackage#getConexion_Recurso2()
	 * @model
	 * @generated
	 */
	String getRecurso2();

	/**
	 * Sets the value of the '{@link cloud_computing.Conexion#getRecurso2 <em>Recurso2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurso2</em>' attribute.
	 * @see #getRecurso2()
	 * @generated
	 */
	void setRecurso2(String value);

} // Conexion
