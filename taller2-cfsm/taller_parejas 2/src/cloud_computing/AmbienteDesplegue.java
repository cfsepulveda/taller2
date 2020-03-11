/**
 */
package cloud_computing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ambiente Desplegue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.AmbienteDesplegue#getTipoAmbiente <em>Tipo Ambiente</em>}</li>
 *   <li>{@link cloud_computing.AmbienteDesplegue#getAlias <em>Alias</em>}</li>
 *   <li>{@link cloud_computing.AmbienteDesplegue#getServidores <em>Servidores</em>}</li>
 *   <li>{@link cloud_computing.AmbienteDesplegue#getVpc <em>Vpc</em>}</li>
 *   <li>{@link cloud_computing.AmbienteDesplegue#getConexion <em>Conexion</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getAmbienteDesplegue()
 * @model
 * @generated
 */
public interface AmbienteDesplegue extends EObject {
	/**
	 * Returns the value of the '<em><b>Tipo Ambiente</b></em>' attribute.
	 * The literals are from the enumeration {@link cloud_computing.Ambiente}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Ambiente</em>' attribute.
	 * @see cloud_computing.Ambiente
	 * @see #setTipoAmbiente(Ambiente)
	 * @see cloud_computing.Cloud_computingPackage#getAmbienteDesplegue_TipoAmbiente()
	 * @model
	 * @generated
	 */
	Ambiente getTipoAmbiente();

	/**
	 * Sets the value of the '{@link cloud_computing.AmbienteDesplegue#getTipoAmbiente <em>Tipo Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Ambiente</em>' attribute.
	 * @see cloud_computing.Ambiente
	 * @see #getTipoAmbiente()
	 * @generated
	 */
	void setTipoAmbiente(Ambiente value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see cloud_computing.Cloud_computingPackage#getAmbienteDesplegue_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link cloud_computing.AmbienteDesplegue#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Servidores</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.Servidor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servidores</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getAmbienteDesplegue_Servidores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Servidor> getServidores();

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.VPC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getAmbienteDesplegue_Vpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<VPC> getVpc();

	/**
	 * Returns the value of the '<em><b>Conexion</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.Conexion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conexion</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getAmbienteDesplegue_Conexion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conexion> getConexion();

} // AmbienteDesplegue
