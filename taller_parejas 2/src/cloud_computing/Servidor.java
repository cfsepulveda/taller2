/**
 */
package cloud_computing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servidor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.Servidor#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cloud_computing.Servidor#getTamanoM <em>Tamano M</em>}</li>
 *   <li>{@link cloud_computing.Servidor#getVpc <em>Vpc</em>}</li>
 *   <li>{@link cloud_computing.Servidor#getSubred <em>Subred</em>}</li>
 *   <li>{@link cloud_computing.Servidor#getServersecuritygroup <em>Serversecuritygroup</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getServidor()
 * @model abstract="true"
 * @generated
 */
public interface Servidor extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see cloud_computing.Cloud_computingPackage#getServidor_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link cloud_computing.Servidor#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Tamano M</b></em>' attribute.
	 * The literals are from the enumeration {@link cloud_computing.TamanoMaquina}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamano M</em>' attribute.
	 * @see cloud_computing.TamanoMaquina
	 * @see #setTamanoM(TamanoMaquina)
	 * @see cloud_computing.Cloud_computingPackage#getServidor_TamanoM()
	 * @model
	 * @generated
	 */
	TamanoMaquina getTamanoM();

	/**
	 * Sets the value of the '{@link cloud_computing.Servidor#getTamanoM <em>Tamano M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tamano M</em>' attribute.
	 * @see cloud_computing.TamanoMaquina
	 * @see #getTamanoM()
	 * @generated
	 */
	void setTamanoM(TamanoMaquina value);

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' reference.
	 * @see #setVpc(VPC)
	 * @see cloud_computing.Cloud_computingPackage#getServidor_Vpc()
	 * @model required="true"
	 * @generated
	 */
	VPC getVpc();

	/**
	 * Sets the value of the '{@link cloud_computing.Servidor#getVpc <em>Vpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc</em>' reference.
	 * @see #getVpc()
	 * @generated
	 */
	void setVpc(VPC value);

	/**
	 * Returns the value of the '<em><b>Subred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subred</em>' reference.
	 * @see #setSubred(Subred)
	 * @see cloud_computing.Cloud_computingPackage#getServidor_Subred()
	 * @model required="true"
	 * @generated
	 */
	Subred getSubred();

	/**
	 * Sets the value of the '{@link cloud_computing.Servidor#getSubred <em>Subred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subred</em>' reference.
	 * @see #getSubred()
	 * @generated
	 */
	void setSubred(Subred value);

	/**
	 * Returns the value of the '<em><b>Serversecuritygroup</b></em>' reference list.
	 * The list contents are of type {@link cloud_computing.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serversecuritygroup</em>' reference list.
	 * @see cloud_computing.Cloud_computingPackage#getServidor_Serversecuritygroup()
	 * @model required="true"
	 * @generated
	 */
	EList<SecurityGroup> getServersecuritygroup();

} // Servidor
