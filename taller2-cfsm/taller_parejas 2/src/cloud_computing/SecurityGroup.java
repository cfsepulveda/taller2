/**
 */
package cloud_computing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.SecurityGroup#getName <em>Name</em>}</li>
 *   <li>{@link cloud_computing.SecurityGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link cloud_computing.SecurityGroup#getRulesSG <em>Rules SG</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getSecurityGroup()
 * @model
 * @generated
 */
public interface SecurityGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see cloud_computing.Cloud_computingPackage#getSecurityGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link cloud_computing.SecurityGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cloud_computing.Cloud_computingPackage#getSecurityGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cloud_computing.SecurityGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Rules SG</b></em>' containment reference list.
	 * The list contents are of type {@link cloud_computing.Rules}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules SG</em>' containment reference list.
	 * @see cloud_computing.Cloud_computingPackage#getSecurityGroup_RulesSG()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rules> getRulesSG();

} // SecurityGroup
