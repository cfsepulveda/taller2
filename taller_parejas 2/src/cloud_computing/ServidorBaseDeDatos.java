/**
 */
package cloud_computing;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servidor Base De Datos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.ServidorBaseDeDatos#getTipo <em>Tipo</em>}</li>
 *   <li>{@link cloud_computing.ServidorBaseDeDatos#getSistemaManejador <em>Sistema Manejador</em>}</li>
 * </ul>
 *
 * @see cloud_computing.Cloud_computingPackage#getServidorBaseDeDatos()
 * @model
 * @generated
 */
public interface ServidorBaseDeDatos extends Servidor {
	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link cloud_computing.TipoBaseDeDatos}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see cloud_computing.TipoBaseDeDatos
	 * @see #setTipo(TipoBaseDeDatos)
	 * @see cloud_computing.Cloud_computingPackage#getServidorBaseDeDatos_Tipo()
	 * @model
	 * @generated
	 */
	TipoBaseDeDatos getTipo();

	/**
	 * Sets the value of the '{@link cloud_computing.ServidorBaseDeDatos#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see cloud_computing.TipoBaseDeDatos
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoBaseDeDatos value);

	/**
	 * Returns the value of the '<em><b>Sistema Manejador</b></em>' attribute.
	 * The literals are from the enumeration {@link cloud_computing.SistemaManejador}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sistema Manejador</em>' attribute.
	 * @see cloud_computing.SistemaManejador
	 * @see #setSistemaManejador(SistemaManejador)
	 * @see cloud_computing.Cloud_computingPackage#getServidorBaseDeDatos_SistemaManejador()
	 * @model
	 * @generated
	 */
	SistemaManejador getSistemaManejador();

	/**
	 * Sets the value of the '{@link cloud_computing.ServidorBaseDeDatos#getSistemaManejador <em>Sistema Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sistema Manejador</em>' attribute.
	 * @see cloud_computing.SistemaManejador
	 * @see #getSistemaManejador()
	 * @generated
	 */
	void setSistemaManejador(SistemaManejador value);

} // ServidorBaseDeDatos
