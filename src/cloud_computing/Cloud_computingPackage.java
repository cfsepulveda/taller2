/**
 */
package cloud_computing;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cloud_computing.Cloud_computingFactory
 * @model kind="package"
 * @generated
 */
public interface Cloud_computingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cloud_computing";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://uniandes.edu.co/cloud_computing";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cloud_computing";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cloud_computingPackage eINSTANCE = cloud_computing.impl.Cloud_computingPackageImpl.init();

	/**
	 * The meta object id for the '{@link cloud_computing.impl.ConexionImpl <em>Conexion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.ConexionImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getConexion()
	 * @generated
	 */
	int CONEXION = 0;

	/**
	 * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION__ATRIBUTOS = 0;

	/**
	 * The feature id for the '<em><b>Nombre Conexion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION__NOMBRE_CONEXION = 1;

	/**
	 * The number of structural features of the '<em>Conexion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conexion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.AtributosImpl <em>Atributos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.AtributosImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getAtributos()
	 * @generated
	 */
	int ATRIBUTOS = 1;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tipo Dato</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS__TIPO_DATO = 1;

	/**
	 * The feature id for the '<em><b>Tipo Conexion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS__TIPO_CONEXION = 2;

	/**
	 * The number of structural features of the '<em>Atributos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Atributos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTOS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.ProveedorImpl <em>Proveedor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.ProveedorImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getProveedor()
	 * @generated
	 */
	int PROVEEDOR = 2;

	/**
	 * The feature id for the '<em><b>Conexion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__CONEXION = 0;

	/**
	 * The feature id for the '<em><b>Ambientedesplegue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__AMBIENTEDESPLEGUE = 1;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__VPC = 2;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__NOMBRE = 3;

	/**
	 * The feature id for the '<em><b>Securitygroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__SECURITYGROUP = 4;

	/**
	 * The feature id for the '<em><b>Subred</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__SUBRED = 5;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR__RULES = 6;

	/**
	 * The number of structural features of the '<em>Proveedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Proveedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVEEDOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.AmbienteDesplegueImpl <em>Ambiente Desplegue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.AmbienteDesplegueImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getAmbienteDesplegue()
	 * @generated
	 */
	int AMBIENTE_DESPLEGUE = 3;

	/**
	 * The feature id for the '<em><b>Tipo Ambiente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLEGUE__TIPO_AMBIENTE = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLEGUE__ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Servidor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLEGUE__SERVIDOR = 2;

	/**
	 * The number of structural features of the '<em>Ambiente Desplegue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLEGUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ambiente Desplegue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLEGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.ServidorImpl <em>Servidor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.ServidorImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getServidor()
	 * @generated
	 */
	int SERVIDOR = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Tamaño Maquina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__TAMAÑO_MAQUINA = 1;

	/**
	 * The feature id for the '<em><b>Servidor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__SERVIDOR = 2;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__VPC = 3;

	/**
	 * The number of structural features of the '<em>Servidor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Servidor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.ServidorAplicacionImpl <em>Servidor Aplicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.ServidorAplicacionImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getServidorAplicacion()
	 * @generated
	 */
	int SERVIDOR_APLICACION = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION__NOMBRE = SERVIDOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamaño Maquina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION__TAMAÑO_MAQUINA = SERVIDOR__TAMAÑO_MAQUINA;

	/**
	 * The feature id for the '<em><b>Servidor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION__SERVIDOR = SERVIDOR__SERVIDOR;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION__VPC = SERVIDOR__VPC;

	/**
	 * The feature id for the '<em><b>Sistema Operativo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION__SISTEMA_OPERATIVO = SERVIDOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Servidor Aplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION_FEATURE_COUNT = SERVIDOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Servidor Aplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION_OPERATION_COUNT = SERVIDOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.ServidorBaseDeDatosImpl <em>Servidor Base De Datos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.ServidorBaseDeDatosImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getServidorBaseDeDatos()
	 * @generated
	 */
	int SERVIDOR_BASE_DE_DATOS = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__NOMBRE = SERVIDOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamaño Maquina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__TAMAÑO_MAQUINA = SERVIDOR__TAMAÑO_MAQUINA;

	/**
	 * The feature id for the '<em><b>Servidor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__SERVIDOR = SERVIDOR__SERVIDOR;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__VPC = SERVIDOR__VPC;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__TIPO = SERVIDOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sistema Manejador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__SISTEMA_MANEJADOR = SERVIDOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Servidor Base De Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS_FEATURE_COUNT = SERVIDOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Servidor Base De Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS_OPERATION_COUNT = SERVIDOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.GatewayImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__VPC = 1;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.VPCImpl <em>VPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.VPCImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getVPC()
	 * @generated
	 */
	int VPC = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__NAME = 0;

	/**
	 * The number of structural features of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.RulesImpl <em>Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.RulesImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getRules()
	 * @generated
	 */
	int RULES = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__PROTOCOL = 1;

	/**
	 * The feature id for the '<em><b>Port Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__PORT_RANGE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.SecurityGroupImpl <em>Security Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.SecurityGroupImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getSecurityGroup()
	 * @generated
	 */
	int SECURITY_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__RULES = 2;

	/**
	 * The number of structural features of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.SubredImpl <em>Subred</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.SubredImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getSubred()
	 * @generated
	 */
	int SUBRED = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cidr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED__CIDR = 1;

	/**
	 * The feature id for the '<em><b>Az</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED__AZ = 2;

	/**
	 * The number of structural features of the '<em>Subred</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subred</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBRED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.ServidorAlmacenamientoImpl <em>Servidor Almacenamiento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.ServidorAlmacenamientoImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getServidorAlmacenamiento()
	 * @generated
	 */
	int SERVIDOR_ALMACENAMIENTO = 12;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__NOMBRE = SERVIDOR__NOMBRE;

	/**
	 * The feature id for the '<em><b>Tamaño Maquina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__TAMAÑO_MAQUINA = SERVIDOR__TAMAÑO_MAQUINA;

	/**
	 * The feature id for the '<em><b>Servidor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__SERVIDOR = SERVIDOR__SERVIDOR;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__VPC = SERVIDOR__VPC;

	/**
	 * The feature id for the '<em><b>Tamano Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__TAMANO_INICIAL = SERVIDOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Servidor Almacenamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO_FEATURE_COUNT = SERVIDOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Servidor Almacenamiento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO_OPERATION_COUNT = SERVIDOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloud_computing.Ambiente <em>Ambiente</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.Ambiente
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getAmbiente()
	 * @generated
	 */
	int AMBIENTE = 13;

	/**
	 * The meta object id for the '{@link cloud_computing.TamañoMaquina <em>Tamaño Maquina</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.TamañoMaquina
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getTamañoMaquina()
	 * @generated
	 */
	int TAMAÑO_MAQUINA = 14;

	/**
	 * The meta object id for the '{@link cloud_computing.TipoBaseDeDatos <em>Tipo Base De Datos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.TipoBaseDeDatos
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getTipoBaseDeDatos()
	 * @generated
	 */
	int TIPO_BASE_DE_DATOS = 15;

	/**
	 * The meta object id for the '{@link cloud_computing.SistemaManejador <em>Sistema Manejador</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.SistemaManejador
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getSistemaManejador()
	 * @generated
	 */
	int SISTEMA_MANEJADOR = 16;

	/**
	 * The meta object id for the '{@link cloud_computing.SistemaOperativo <em>Sistema Operativo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.SistemaOperativo
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getSistemaOperativo()
	 * @generated
	 */
	int SISTEMA_OPERATIVO = 17;

	/**
	 * The meta object id for the '{@link cloud_computing.ProveedorServicio <em>Proveedor Servicio</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.ProveedorServicio
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getProveedorServicio()
	 * @generated
	 */
	int PROVEEDOR_SERVICIO = 18;


	/**
	 * Returns the meta object for class '{@link cloud_computing.Conexion <em>Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conexion</em>'.
	 * @see cloud_computing.Conexion
	 * @generated
	 */
	EClass getConexion();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Conexion#getAtributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atributos</em>'.
	 * @see cloud_computing.Conexion#getAtributos()
	 * @see #getConexion()
	 * @generated
	 */
	EReference getConexion_Atributos();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Conexion#getNombreConexion <em>Nombre Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Conexion</em>'.
	 * @see cloud_computing.Conexion#getNombreConexion()
	 * @see #getConexion()
	 * @generated
	 */
	EAttribute getConexion_NombreConexion();

	/**
	 * Returns the meta object for class '{@link cloud_computing.Atributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributos</em>'.
	 * @see cloud_computing.Atributos
	 * @generated
	 */
	EClass getAtributos();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Atributos#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see cloud_computing.Atributos#getNombre()
	 * @see #getAtributos()
	 * @generated
	 */
	EAttribute getAtributos_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Atributos#getTipoDato <em>Tipo Dato</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Dato</em>'.
	 * @see cloud_computing.Atributos#getTipoDato()
	 * @see #getAtributos()
	 * @generated
	 */
	EAttribute getAtributos_TipoDato();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Atributos#getTipoConexion <em>Tipo Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Conexion</em>'.
	 * @see cloud_computing.Atributos#getTipoConexion()
	 * @see #getAtributos()
	 * @generated
	 */
	EAttribute getAtributos_TipoConexion();

	/**
	 * Returns the meta object for class '{@link cloud_computing.Proveedor <em>Proveedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proveedor</em>'.
	 * @see cloud_computing.Proveedor
	 * @generated
	 */
	EClass getProveedor();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Proveedor#getConexion <em>Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conexion</em>'.
	 * @see cloud_computing.Proveedor#getConexion()
	 * @see #getProveedor()
	 * @generated
	 */
	EReference getProveedor_Conexion();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Proveedor#getAmbientedesplegue <em>Ambientedesplegue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ambientedesplegue</em>'.
	 * @see cloud_computing.Proveedor#getAmbientedesplegue()
	 * @see #getProveedor()
	 * @generated
	 */
	EReference getProveedor_Ambientedesplegue();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Proveedor#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vpc</em>'.
	 * @see cloud_computing.Proveedor#getVpc()
	 * @see #getProveedor()
	 * @generated
	 */
	EReference getProveedor_Vpc();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Proveedor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see cloud_computing.Proveedor#getNombre()
	 * @see #getProveedor()
	 * @generated
	 */
	EAttribute getProveedor_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Proveedor#getSecuritygroup <em>Securitygroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Securitygroup</em>'.
	 * @see cloud_computing.Proveedor#getSecuritygroup()
	 * @see #getProveedor()
	 * @generated
	 */
	EReference getProveedor_Securitygroup();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Proveedor#getSubred <em>Subred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subred</em>'.
	 * @see cloud_computing.Proveedor#getSubred()
	 * @see #getProveedor()
	 * @generated
	 */
	EReference getProveedor_Subred();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Proveedor#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see cloud_computing.Proveedor#getRules()
	 * @see #getProveedor()
	 * @generated
	 */
	EReference getProveedor_Rules();

	/**
	 * Returns the meta object for class '{@link cloud_computing.AmbienteDesplegue <em>Ambiente Desplegue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ambiente Desplegue</em>'.
	 * @see cloud_computing.AmbienteDesplegue
	 * @generated
	 */
	EClass getAmbienteDesplegue();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.AmbienteDesplegue#getTipoAmbiente <em>Tipo Ambiente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Ambiente</em>'.
	 * @see cloud_computing.AmbienteDesplegue#getTipoAmbiente()
	 * @see #getAmbienteDesplegue()
	 * @generated
	 */
	EAttribute getAmbienteDesplegue_TipoAmbiente();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.AmbienteDesplegue#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see cloud_computing.AmbienteDesplegue#getAlias()
	 * @see #getAmbienteDesplegue()
	 * @generated
	 */
	EAttribute getAmbienteDesplegue_Alias();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.AmbienteDesplegue#getServidor <em>Servidor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servidor</em>'.
	 * @see cloud_computing.AmbienteDesplegue#getServidor()
	 * @see #getAmbienteDesplegue()
	 * @generated
	 */
	EReference getAmbienteDesplegue_Servidor();

	/**
	 * Returns the meta object for class '{@link cloud_computing.Servidor <em>Servidor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servidor</em>'.
	 * @see cloud_computing.Servidor
	 * @generated
	 */
	EClass getServidor();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Servidor#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see cloud_computing.Servidor#getNombre()
	 * @see #getServidor()
	 * @generated
	 */
	EAttribute getServidor_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Servidor#getTamañoMaquina <em>Tamaño Maquina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tamaño Maquina</em>'.
	 * @see cloud_computing.Servidor#getTamañoMaquina()
	 * @see #getServidor()
	 * @generated
	 */
	EAttribute getServidor_TamañoMaquina();

	/**
	 * Returns the meta object for the reference list '{@link cloud_computing.Servidor#getServidor <em>Servidor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Servidor</em>'.
	 * @see cloud_computing.Servidor#getServidor()
	 * @see #getServidor()
	 * @generated
	 */
	EReference getServidor_Servidor();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Servidor#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vpc</em>'.
	 * @see cloud_computing.Servidor#getVpc()
	 * @see #getServidor()
	 * @generated
	 */
	EReference getServidor_Vpc();

	/**
	 * Returns the meta object for class '{@link cloud_computing.ServidorAplicacion <em>Servidor Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servidor Aplicacion</em>'.
	 * @see cloud_computing.ServidorAplicacion
	 * @generated
	 */
	EClass getServidorAplicacion();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.ServidorAplicacion#getSistemaOperativo <em>Sistema Operativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sistema Operativo</em>'.
	 * @see cloud_computing.ServidorAplicacion#getSistemaOperativo()
	 * @see #getServidorAplicacion()
	 * @generated
	 */
	EAttribute getServidorAplicacion_SistemaOperativo();

	/**
	 * Returns the meta object for class '{@link cloud_computing.ServidorBaseDeDatos <em>Servidor Base De Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servidor Base De Datos</em>'.
	 * @see cloud_computing.ServidorBaseDeDatos
	 * @generated
	 */
	EClass getServidorBaseDeDatos();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.ServidorBaseDeDatos#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see cloud_computing.ServidorBaseDeDatos#getTipo()
	 * @see #getServidorBaseDeDatos()
	 * @generated
	 */
	EAttribute getServidorBaseDeDatos_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.ServidorBaseDeDatos#getSistemaManejador <em>Sistema Manejador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sistema Manejador</em>'.
	 * @see cloud_computing.ServidorBaseDeDatos#getSistemaManejador()
	 * @see #getServidorBaseDeDatos()
	 * @generated
	 */
	EAttribute getServidorBaseDeDatos_SistemaManejador();

	/**
	 * Returns the meta object for class '{@link cloud_computing.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see cloud_computing.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Gateway#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloud_computing.Gateway#getName()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Gateway#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vpc</em>'.
	 * @see cloud_computing.Gateway#getVpc()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Vpc();

	/**
	 * Returns the meta object for class '{@link cloud_computing.VPC <em>VPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPC</em>'.
	 * @see cloud_computing.VPC
	 * @generated
	 */
	EClass getVPC();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.VPC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloud_computing.VPC#getName()
	 * @see #getVPC()
	 * @generated
	 */
	EAttribute getVPC_Name();

	/**
	 * Returns the meta object for class '{@link cloud_computing.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules</em>'.
	 * @see cloud_computing.Rules
	 * @generated
	 */
	EClass getRules();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Rules#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cloud_computing.Rules#getType()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Type();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Rules#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see cloud_computing.Rules#getProtocol()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Rules#getPortRange <em>Port Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Range</em>'.
	 * @see cloud_computing.Rules#getPortRange()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_PortRange();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Rules#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see cloud_computing.Rules#getSource()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Source();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Rules#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cloud_computing.Rules#getDescription()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Description();

	/**
	 * Returns the meta object for class '{@link cloud_computing.SecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group</em>'.
	 * @see cloud_computing.SecurityGroup
	 * @generated
	 */
	EClass getSecurityGroup();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.SecurityGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloud_computing.SecurityGroup#getName()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.SecurityGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cloud_computing.SecurityGroup#getDescription()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EAttribute getSecurityGroup_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.SecurityGroup#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see cloud_computing.SecurityGroup#getRules()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EReference getSecurityGroup_Rules();

	/**
	 * Returns the meta object for class '{@link cloud_computing.Subred <em>Subred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subred</em>'.
	 * @see cloud_computing.Subred
	 * @generated
	 */
	EClass getSubred();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Subred#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloud_computing.Subred#getName()
	 * @see #getSubred()
	 * @generated
	 */
	EAttribute getSubred_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Subred#getCidr <em>Cidr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr</em>'.
	 * @see cloud_computing.Subred#getCidr()
	 * @see #getSubred()
	 * @generated
	 */
	EAttribute getSubred_Cidr();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Subred#getAz <em>Az</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Az</em>'.
	 * @see cloud_computing.Subred#getAz()
	 * @see #getSubred()
	 * @generated
	 */
	EAttribute getSubred_Az();

	/**
	 * Returns the meta object for class '{@link cloud_computing.ServidorAlmacenamiento <em>Servidor Almacenamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servidor Almacenamiento</em>'.
	 * @see cloud_computing.ServidorAlmacenamiento
	 * @generated
	 */
	EClass getServidorAlmacenamiento();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.ServidorAlmacenamiento#getTamanoInicial <em>Tamano Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tamano Inicial</em>'.
	 * @see cloud_computing.ServidorAlmacenamiento#getTamanoInicial()
	 * @see #getServidorAlmacenamiento()
	 * @generated
	 */
	EAttribute getServidorAlmacenamiento_TamanoInicial();

	/**
	 * Returns the meta object for enum '{@link cloud_computing.Ambiente <em>Ambiente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ambiente</em>'.
	 * @see cloud_computing.Ambiente
	 * @generated
	 */
	EEnum getAmbiente();

	/**
	 * Returns the meta object for enum '{@link cloud_computing.TamañoMaquina <em>Tamaño Maquina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tamaño Maquina</em>'.
	 * @see cloud_computing.TamañoMaquina
	 * @generated
	 */
	EEnum getTamañoMaquina();

	/**
	 * Returns the meta object for enum '{@link cloud_computing.TipoBaseDeDatos <em>Tipo Base De Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Base De Datos</em>'.
	 * @see cloud_computing.TipoBaseDeDatos
	 * @generated
	 */
	EEnum getTipoBaseDeDatos();

	/**
	 * Returns the meta object for enum '{@link cloud_computing.SistemaManejador <em>Sistema Manejador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sistema Manejador</em>'.
	 * @see cloud_computing.SistemaManejador
	 * @generated
	 */
	EEnum getSistemaManejador();

	/**
	 * Returns the meta object for enum '{@link cloud_computing.SistemaOperativo <em>Sistema Operativo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sistema Operativo</em>'.
	 * @see cloud_computing.SistemaOperativo
	 * @generated
	 */
	EEnum getSistemaOperativo();

	/**
	 * Returns the meta object for enum '{@link cloud_computing.ProveedorServicio <em>Proveedor Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Proveedor Servicio</em>'.
	 * @see cloud_computing.ProveedorServicio
	 * @generated
	 */
	EEnum getProveedorServicio();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Cloud_computingFactory getCloud_computingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cloud_computing.impl.ConexionImpl <em>Conexion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.ConexionImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getConexion()
		 * @generated
		 */
		EClass CONEXION = eINSTANCE.getConexion();

		/**
		 * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONEXION__ATRIBUTOS = eINSTANCE.getConexion_Atributos();

		/**
		 * The meta object literal for the '<em><b>Nombre Conexion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONEXION__NOMBRE_CONEXION = eINSTANCE.getConexion_NombreConexion();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.AtributosImpl <em>Atributos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.AtributosImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getAtributos()
		 * @generated
		 */
		EClass ATRIBUTOS = eINSTANCE.getAtributos();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTOS__NOMBRE = eINSTANCE.getAtributos_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tipo Dato</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTOS__TIPO_DATO = eINSTANCE.getAtributos_TipoDato();

		/**
		 * The meta object literal for the '<em><b>Tipo Conexion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATRIBUTOS__TIPO_CONEXION = eINSTANCE.getAtributos_TipoConexion();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.ProveedorImpl <em>Proveedor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.ProveedorImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getProveedor()
		 * @generated
		 */
		EClass PROVEEDOR = eINSTANCE.getProveedor();

		/**
		 * The meta object literal for the '<em><b>Conexion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVEEDOR__CONEXION = eINSTANCE.getProveedor_Conexion();

		/**
		 * The meta object literal for the '<em><b>Ambientedesplegue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVEEDOR__AMBIENTEDESPLEGUE = eINSTANCE.getProveedor_Ambientedesplegue();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVEEDOR__VPC = eINSTANCE.getProveedor_Vpc();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROVEEDOR__NOMBRE = eINSTANCE.getProveedor_Nombre();

		/**
		 * The meta object literal for the '<em><b>Securitygroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVEEDOR__SECURITYGROUP = eINSTANCE.getProveedor_Securitygroup();

		/**
		 * The meta object literal for the '<em><b>Subred</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVEEDOR__SUBRED = eINSTANCE.getProveedor_Subred();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVEEDOR__RULES = eINSTANCE.getProveedor_Rules();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.AmbienteDesplegueImpl <em>Ambiente Desplegue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.AmbienteDesplegueImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getAmbienteDesplegue()
		 * @generated
		 */
		EClass AMBIENTE_DESPLEGUE = eINSTANCE.getAmbienteDesplegue();

		/**
		 * The meta object literal for the '<em><b>Tipo Ambiente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMBIENTE_DESPLEGUE__TIPO_AMBIENTE = eINSTANCE.getAmbienteDesplegue_TipoAmbiente();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMBIENTE_DESPLEGUE__ALIAS = eINSTANCE.getAmbienteDesplegue_Alias();

		/**
		 * The meta object literal for the '<em><b>Servidor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMBIENTE_DESPLEGUE__SERVIDOR = eINSTANCE.getAmbienteDesplegue_Servidor();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.ServidorImpl <em>Servidor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.ServidorImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getServidor()
		 * @generated
		 */
		EClass SERVIDOR = eINSTANCE.getServidor();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR__NOMBRE = eINSTANCE.getServidor_Nombre();

		/**
		 * The meta object literal for the '<em><b>Tamaño Maquina</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR__TAMAÑO_MAQUINA = eINSTANCE.getServidor_TamañoMaquina();

		/**
		 * The meta object literal for the '<em><b>Servidor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVIDOR__SERVIDOR = eINSTANCE.getServidor_Servidor();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVIDOR__VPC = eINSTANCE.getServidor_Vpc();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.ServidorAplicacionImpl <em>Servidor Aplicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.ServidorAplicacionImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getServidorAplicacion()
		 * @generated
		 */
		EClass SERVIDOR_APLICACION = eINSTANCE.getServidorAplicacion();

		/**
		 * The meta object literal for the '<em><b>Sistema Operativo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR_APLICACION__SISTEMA_OPERATIVO = eINSTANCE.getServidorAplicacion_SistemaOperativo();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.ServidorBaseDeDatosImpl <em>Servidor Base De Datos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.ServidorBaseDeDatosImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getServidorBaseDeDatos()
		 * @generated
		 */
		EClass SERVIDOR_BASE_DE_DATOS = eINSTANCE.getServidorBaseDeDatos();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR_BASE_DE_DATOS__TIPO = eINSTANCE.getServidorBaseDeDatos_Tipo();

		/**
		 * The meta object literal for the '<em><b>Sistema Manejador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR_BASE_DE_DATOS__SISTEMA_MANEJADOR = eINSTANCE.getServidorBaseDeDatos_SistemaManejador();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.GatewayImpl <em>Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.GatewayImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getGateway()
		 * @generated
		 */
		EClass GATEWAY = eINSTANCE.getGateway();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__NAME = eINSTANCE.getGateway_Name();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__VPC = eINSTANCE.getGateway_Vpc();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.VPCImpl <em>VPC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.VPCImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getVPC()
		 * @generated
		 */
		EClass VPC = eINSTANCE.getVPC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VPC__NAME = eINSTANCE.getVPC_Name();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.RulesImpl <em>Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.RulesImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getRules()
		 * @generated
		 */
		EClass RULES = eINSTANCE.getRules();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__TYPE = eINSTANCE.getRules_Type();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__PROTOCOL = eINSTANCE.getRules_Protocol();

		/**
		 * The meta object literal for the '<em><b>Port Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__PORT_RANGE = eINSTANCE.getRules_PortRange();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__SOURCE = eINSTANCE.getRules_Source();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__DESCRIPTION = eINSTANCE.getRules_Description();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.SecurityGroupImpl <em>Security Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.SecurityGroupImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getSecurityGroup()
		 * @generated
		 */
		EClass SECURITY_GROUP = eINSTANCE.getSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__NAME = eINSTANCE.getSecurityGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_GROUP__DESCRIPTION = eINSTANCE.getSecurityGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP__RULES = eINSTANCE.getSecurityGroup_Rules();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.SubredImpl <em>Subred</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.SubredImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getSubred()
		 * @generated
		 */
		EClass SUBRED = eINSTANCE.getSubred();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBRED__NAME = eINSTANCE.getSubred_Name();

		/**
		 * The meta object literal for the '<em><b>Cidr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBRED__CIDR = eINSTANCE.getSubred_Cidr();

		/**
		 * The meta object literal for the '<em><b>Az</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBRED__AZ = eINSTANCE.getSubred_Az();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.ServidorAlmacenamientoImpl <em>Servidor Almacenamiento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.ServidorAlmacenamientoImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getServidorAlmacenamiento()
		 * @generated
		 */
		EClass SERVIDOR_ALMACENAMIENTO = eINSTANCE.getServidorAlmacenamiento();

		/**
		 * The meta object literal for the '<em><b>Tamano Inicial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR_ALMACENAMIENTO__TAMANO_INICIAL = eINSTANCE.getServidorAlmacenamiento_TamanoInicial();

		/**
		 * The meta object literal for the '{@link cloud_computing.Ambiente <em>Ambiente</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.Ambiente
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getAmbiente()
		 * @generated
		 */
		EEnum AMBIENTE = eINSTANCE.getAmbiente();

		/**
		 * The meta object literal for the '{@link cloud_computing.TamañoMaquina <em>Tamaño Maquina</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.TamañoMaquina
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getTamañoMaquina()
		 * @generated
		 */
		EEnum TAMAÑO_MAQUINA = eINSTANCE.getTamañoMaquina();

		/**
		 * The meta object literal for the '{@link cloud_computing.TipoBaseDeDatos <em>Tipo Base De Datos</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.TipoBaseDeDatos
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getTipoBaseDeDatos()
		 * @generated
		 */
		EEnum TIPO_BASE_DE_DATOS = eINSTANCE.getTipoBaseDeDatos();

		/**
		 * The meta object literal for the '{@link cloud_computing.SistemaManejador <em>Sistema Manejador</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.SistemaManejador
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getSistemaManejador()
		 * @generated
		 */
		EEnum SISTEMA_MANEJADOR = eINSTANCE.getSistemaManejador();

		/**
		 * The meta object literal for the '{@link cloud_computing.SistemaOperativo <em>Sistema Operativo</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.SistemaOperativo
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getSistemaOperativo()
		 * @generated
		 */
		EEnum SISTEMA_OPERATIVO = eINSTANCE.getSistemaOperativo();

		/**
		 * The meta object literal for the '{@link cloud_computing.ProveedorServicio <em>Proveedor Servicio</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.ProveedorServicio
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getProveedorServicio()
		 * @generated
		 */
		EEnum PROVEEDOR_SERVICIO = eINSTANCE.getProveedorServicio();

	}

} //Cloud_computingPackage
