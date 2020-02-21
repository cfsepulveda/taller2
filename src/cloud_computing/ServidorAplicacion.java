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
 *   <li>{@link cloud_computing.ServidorAplicacion#getSistemaOperativo <em>Sistema Operativo</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getServidorAplicacion()
 * @model
 * @generated
 */
public interface ServidorAplicacion extends Servidor {
	/**
	 * Returns the value of the '<em><b>Sistema Operativo</b></em>' attribute.
	 * The literals are from the enumeration {@link cloud_computing.SistemaOperativo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sistema Operativo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sistema Operativo</em>' attribute.
	 * @see cloud_computing.SistemaOperativo
	 * @see #setSistemaOperativo(SistemaOperativo)
	 * @see cloud_computing.Cloud_computingPackage#getServidorAplicacion_SistemaOperativo()
	 * @model
	 * @generated
	 */
	SistemaOperativo getSistemaOperativo();

	/**
	 * Sets the value of the '{@link cloud_computing.ServidorAplicacion#getSistemaOperativo <em>Sistema Operativo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sistema Operativo</em>' attribute.
	 * @see cloud_computing.SistemaOperativo
	 * @see #getSistemaOperativo()
	 * @generated
	 */
	void setSistemaOperativo(SistemaOperativo value);

} // ServidorAplicacion
