/**
 */
package cloud_computing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.Atributos#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cloud_computing.Atributos#getTipoDato <em>Tipo Dato</em>}</li>
 *   <li>{@link cloud_computing.Atributos#getTipoConexion <em>Tipo Conexion</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getAtributos()
 * @model
 * @generated
 */
public interface Atributos extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see cloud_computing.Cloud_computingPackage#getAtributos_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link cloud_computing.Atributos#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Dato</em>' attribute.
	 * @see #setTipoDato(String)
	 * @see cloud_computing.Cloud_computingPackage#getAtributos_TipoDato()
	 * @model
	 * @generated
	 */
	String getTipoDato();

	/**
	 * Sets the value of the '{@link cloud_computing.Atributos#getTipoDato <em>Tipo Dato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Dato</em>' attribute.
	 * @see #getTipoDato()
	 * @generated
	 */
	void setTipoDato(String value);

	/**
	 * Returns the value of the '<em><b>Tipo Conexion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Conexion</em>' attribute.
	 * @see #setTipoConexion(String)
	 * @see cloud_computing.Cloud_computingPackage#getAtributos_TipoConexion()
	 * @model
	 * @generated
	 */
	String getTipoConexion();

	/**
	 * Sets the value of the '{@link cloud_computing.Atributos#getTipoConexion <em>Tipo Conexion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Conexion</em>' attribute.
	 * @see #getTipoConexion()
	 * @generated
	 */
	void setTipoConexion(String value);

} // Atributos
