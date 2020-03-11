/**
 */
package cloud_computing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infraestructura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.Infraestructura#getLogins <em>Logins</em>}</li>
 *   <li>{@link cloud_computing.Infraestructura#getAmbientesdesplegue <em>Ambientesdesplegue</em>}</li>
 *   <li>{@link cloud_computing.Infraestructura#getTipo <em>Tipo</em>}</li>
 *   <li>{@link cloud_computing.Infraestructura#getSecuritygroups <em>Securitygroups</em>}</li>
 *   <li>{@link cloud_computing.Infraestructura#getNombreProyecto <em>Nombre Proyecto</em>}</li>
 *   <li>{@link cloud_computing.Infraestructura#getGateway <em>Gateway</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getInfraestructura()
 * @model
 * @generated
 */
public interface Infraestructura extends EObject {
	/**
	 * Returns the value of the '<em><b>Logins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logins</em>' containment reference.
	 * @see #setLogins(Login)
	 * @see cloud_computing.Cloud_computingPackage#getInfraestructura_Logins()
	 * @model containment="true"
	 * @generated
	 */
	Login getLogins();

	/**
	 * Sets the value of the '{@link cloud_computing.Infraestructura#getLogins <em>Logins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logins</em>' containment reference.
	 * @see #getLogins()
	 * @generated
	 */
	void setLogins(Login value);

	/**
	 * Returns the value of the '<em><b>Ambientesdesplegue</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.AmbienteDesplegue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ambientesdesplegue</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getInfraestructura_Ambientesdesplegue()
	 * @model containment="true"
	 * @generated
	 */
	EList<AmbienteDesplegue> getAmbientesdesplegue();

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link cloud_computing.ProveedorServicio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see cloud_computing.ProveedorServicio
	 * @see #setTipo(ProveedorServicio)
	 * @see cloud_computing.Cloud_computingPackage#getInfraestructura_Tipo()
	 * @model
	 * @generated
	 */
	ProveedorServicio getTipo();

	/**
	 * Sets the value of the '{@link cloud_computing.Infraestructura#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see cloud_computing.ProveedorServicio
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(ProveedorServicio value);

	/**
	 * Returns the value of the '<em><b>Securitygroups</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.SecurityGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitygroups</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getInfraestructura_Securitygroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityGroup> getSecuritygroups();

	/**
	 * Returns the value of the '<em><b>Nombre Proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Proyecto</em>' attribute.
	 * @see #setNombreProyecto(String)
	 * @see cloud_computing.Cloud_computingPackage#getInfraestructura_NombreProyecto()
	 * @model
	 * @generated
	 */
	String getNombreProyecto();

	/**
	 * Sets the value of the '{@link cloud_computing.Infraestructura#getNombreProyecto <em>Nombre Proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Proyecto</em>' attribute.
	 * @see #getNombreProyecto()
	 * @generated
	 */
	void setNombreProyecto(String value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.Gateway}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getInfraestructura_Gateway()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gateway> getGateway();

} // Infraestructura