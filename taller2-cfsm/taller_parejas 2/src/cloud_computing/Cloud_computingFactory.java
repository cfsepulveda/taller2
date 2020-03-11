/**
 */
package cloud_computing;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cloud_computing.Cloud_computingPackage
 * @generated
 */
public interface Cloud_computingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cloud_computingFactory eINSTANCE = cloud_computing.impl.Cloud_computingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Login</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Login</em>'.
	 * @generated
	 */
	Login createLogin();

	/**
	 * Returns a new object of class '<em>Infraestructura</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infraestructura</em>'.
	 * @generated
	 */
	Infraestructura createInfraestructura();

	/**
	 * Returns a new object of class '<em>Ambiente Desplegue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ambiente Desplegue</em>'.
	 * @generated
	 */
	AmbienteDesplegue createAmbienteDesplegue();

	/**
	 * Returns a new object of class '<em>Servidor Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servidor Aplicacion</em>'.
	 * @generated
	 */
	ServidorAplicacion createServidorAplicacion();

	/**
	 * Returns a new object of class '<em>Servidor Base De Datos</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servidor Base De Datos</em>'.
	 * @generated
	 */
	ServidorBaseDeDatos createServidorBaseDeDatos();

	/**
	 * Returns a new object of class '<em>VPC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VPC</em>'.
	 * @generated
	 */
	VPC createVPC();

	/**
	 * Returns a new object of class '<em>Rules</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rules</em>'.
	 * @generated
	 */
	Rules createRules();

	/**
	 * Returns a new object of class '<em>Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Group</em>'.
	 * @generated
	 */
	SecurityGroup createSecurityGroup();

	/**
	 * Returns a new object of class '<em>Subred</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subred</em>'.
	 * @generated
	 */
	Subred createSubred();

	/**
	 * Returns a new object of class '<em>Servidor Almacenamiento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servidor Almacenamiento</em>'.
	 * @generated
	 */
	ServidorAlmacenamiento createServidorAlmacenamiento();

	/**
	 * Returns a new object of class '<em>Conexion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conexion</em>'.
	 * @generated
	 */
	Conexion createConexion();

	/**
	 * Returns a new object of class '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gateway</em>'.
	 * @generated
	 */
	Gateway createGateway();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Cloud_computingPackage getCloud_computingPackage();

} //Cloud_computingFactory
