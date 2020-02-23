/**
 */
package cloud_computing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.Gateway#getName <em>Name</em>}</li>
 *   <li>{@link cloud_computing.Gateway#getVpc <em>Vpc</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cloud_computing.Cloud_computingPackage#getGateway_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloud_computing.Gateway#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vpc</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.VPC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getGateway_Vpc()
	 * @model containment="true"
	 * @generated
	 */
	EList<VPC> getVpc();

} // Gateway
