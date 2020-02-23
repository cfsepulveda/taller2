/**
 */
package cloud_computing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.Rules#getType <em>Type</em>}</li>
 *   <li>{@link cloud_computing.Rules#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link cloud_computing.Rules#getPortRange <em>Port Range</em>}</li>
 *   <li>{@link cloud_computing.Rules#getSource <em>Source</em>}</li>
 *   <li>{@link cloud_computing.Rules#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getRules()
 * @model
 * @generated
 */
public interface Rules extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see cloud_computing.Cloud_computingPackage#getRules_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link cloud_computing.Rules#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see cloud_computing.Cloud_computingPackage#getRules_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link cloud_computing.Rules#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Port Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Range</em>' attribute.
	 * @see #setPortRange(String)
	 * @see cloud_computing.Cloud_computingPackage#getRules_PortRange()
	 * @model
	 * @generated
	 */
	String getPortRange();

	/**
	 * Sets the value of the '{@link cloud_computing.Rules#getPortRange <em>Port Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Range</em>' attribute.
	 * @see #getPortRange()
	 * @generated
	 */
	void setPortRange(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see cloud_computing.Cloud_computingPackage#getRules_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link cloud_computing.Rules#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see cloud_computing.Cloud_computingPackage#getRules_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link cloud_computing.Rules#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Rules
