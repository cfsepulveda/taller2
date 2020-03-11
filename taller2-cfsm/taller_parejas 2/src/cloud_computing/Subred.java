/**
 */
package cloud_computing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subred</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.Subred#getName <em>Name</em>}</li>
 *   <li>{@link cloud_computing.Subred#getCidr <em>Cidr</em>}</li>
 *   <li>{@link cloud_computing.Subred#getAz <em>Az</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getSubred()
 * @model
 * @generated
 */
public interface Subred extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cloud_computing.Cloud_computingPackage#getSubred_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloud_computing.Subred#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr</em>' attribute.
	 * @see #setCidr(String)
	 * @see cloud_computing.Cloud_computingPackage#getSubred_Cidr()
	 * @model
	 * @generated
	 */
	String getCidr();

	/**
	 * Sets the value of the '{@link cloud_computing.Subred#getCidr <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr</em>' attribute.
	 * @see #getCidr()
	 * @generated
	 */
	void setCidr(String value);

	/**
	 * Returns the value of the '<em><b>Az</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Az</em>' attribute.
	 * @see #setAz(String)
	 * @see cloud_computing.Cloud_computingPackage#getSubred_Az()
	 * @model
	 * @generated
	 */
	String getAz();

	/**
	 * Sets the value of the '{@link cloud_computing.Subred#getAz <em>Az</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Az</em>' attribute.
	 * @see #getAz()
	 * @generated
	 */
	void setAz(String value);

} // Subred
