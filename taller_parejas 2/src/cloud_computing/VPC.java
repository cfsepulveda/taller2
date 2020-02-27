/**
 */
package cloud_computing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VPC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.VPC#getName <em>Name</em>}</li>
 *   <li>{@link cloud_computing.VPC#getSubred <em>Subred</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getVPC()
 * @model
 * @generated
 */
public interface VPC extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cloud_computing.Cloud_computingPackage#getVPC_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloud_computing.VPC#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subred</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.Subred}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subred</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getVPC_Subred()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Subred> getSubred();

} // VPC
