/**
 */
package cloud_computing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servidor Aplicacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.ServidorAplicacion#getSistemaO <em>Sistema O</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getServidorAplicacion()
 * @model
 * @generated
 */
public interface ServidorAplicacion extends Servidor {
	/**
	 * Returns the value of the '<em><b>Sistema O</b></em>' attribute.
	 * The literals are from the enumeration {@link cloud_computing.SistemaOperativo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sistema O</em>' attribute.
	 * @see cloud_computing.SistemaOperativo
	 * @see #setSistemaO(SistemaOperativo)
	 * @see cloud_computing.Cloud_computingPackage#getServidorAplicacion_SistemaO()
	 * @model
	 * @generated
	 */
	SistemaOperativo getSistemaO();

	/**
	 * Sets the value of the '{@link cloud_computing.ServidorAplicacion#getSistemaO <em>Sistema O</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sistema O</em>' attribute.
	 * @see cloud_computing.SistemaOperativo
	 * @see #getSistemaO()
	 * @generated
	 */
	void setSistemaO(SistemaOperativo value);

} // ServidorAplicacion
