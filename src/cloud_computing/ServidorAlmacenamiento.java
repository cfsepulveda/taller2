/**
 */
package cloud_computing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servidor Almacenamiento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.ServidorAlmacenamiento#getTamanoInicial <em>Tamano Inicial</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getServidorAlmacenamiento()
 * @model
 * @generated
 */
public interface ServidorAlmacenamiento extends Servidor {
	/**
	 * Returns the value of the '<em><b>Tamano Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tamano Inicial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tamano Inicial</em>' attribute.
	 * @see #setTamanoInicial(String)
	 * @see cloud_computing.Cloud_computingPackage#getServidorAlmacenamiento_TamanoInicial()
	 * @model
	 * @generated
	 */
	String getTamanoInicial();

	/**
	 * Sets the value of the '{@link cloud_computing.ServidorAlmacenamiento#getTamanoInicial <em>Tamano Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tamano Inicial</em>' attribute.
	 * @see #getTamanoInicial()
	 * @generated
	 */
	void setTamanoInicial(String value);

} // ServidorAlmacenamiento
