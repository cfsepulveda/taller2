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
 *   <li>{@link cloud_computing.Servidor#getTamañoMaquina <em>Tamaño Maquina</em>}</li>
 *   <li>{@link cloud_computing.Servidor#getServidor <em>Servidor</em>}</li>
 *   <li>{@link cloud_computing.Servidor#getVpc <em>Vpc</em>}</li>
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
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * Returns the value of the '<em><b>Tamaño Maquina</b></em>' attribute.
	 * The literals are from the enumeration {@link cloud_computing.TamañoMaquina}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tamaño Maquina</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamaño Maquina</em>' attribute.
	 * @see cloud_computing.TamañoMaquina
	 * @see #setTamañoMaquina(TamañoMaquina)
	 * @see cloud_computing.Cloud_computingPackage#getServidor_TamañoMaquina()
	 * @model
	 * @generated
	 */
	TamañoMaquina getTamañoMaquina();

	/**
	 * Sets the value of the '{@link cloud_computing.Servidor#getTamañoMaquina <em>Tamaño Maquina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tamaño Maquina</em>' attribute.
	 * @see cloud_computing.TamañoMaquina
	 * @see #getTamañoMaquina()
	 * @generated
	 */
	void setTamañoMaquina(TamañoMaquina value);

	/**
	 * Returns the value of the '<em><b>Servidor</b></em>' reference list.
	 * The list contents are of type {@link cloud_computing.Servidor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servidor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servidor</em>' reference list.
	 * @see cloud_computing.Cloud_computingPackage#getServidor_Servidor()
	 * @model
	 * @generated
	 */
	EList<Servidor> getServidor();

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.VPC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vpc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getServidor_Vpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<VPC> getVpc();

} // Servidor
