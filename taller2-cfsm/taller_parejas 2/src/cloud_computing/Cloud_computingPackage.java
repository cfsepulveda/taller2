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
	 * The meta object id for the '{@link cloud_computing.impl.LoginImpl <em>Login</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.LoginImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getLogin()
	 * @generated
	 */
	int LOGIN = 0;

	/**
	 * The feature id for the '<em><b>Nombre Conexion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__NOMBRE_CONEXION = 0;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__USUARIO = 1;

	/**
	 * The feature id for the '<em><b>Contrasena</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__CONTRASENA = 2;

	/**
	 * The feature id for the '<em><b>Access Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__ACCESS_ID = 3;

	/**
	 * The feature id for the '<em><b>Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__SECRET = 4;

	/**
	 * The number of structural features of the '<em>Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.InfraestructuraImpl <em>Infraestructura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.InfraestructuraImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getInfraestructura()
	 * @generated
	 */
	int INFRAESTRUCTURA = 1;

	/**
	 * The feature id for the '<em><b>Logins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA__LOGINS = 0;

	/**
	 * The feature id for the '<em><b>Ambientesdesplegue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA__AMBIENTESDESPLEGUE = 1;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA__TIPO = 2;

	/**
	 * The feature id for the '<em><b>Securitygroups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA__SECURITYGROUPS = 3;

	/**
	 * The feature id for the '<em><b>Nombre Proyecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA__NOMBRE_PROYECTO = 4;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA__GATEWAY = 5;

	/**
	 * The number of structural features of the '<em>Infraestructura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Infraestructura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRAESTRUCTURA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.AmbienteDesplegueImpl <em>Ambiente Desplegue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.AmbienteDesplegueImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getAmbienteDesplegue()
	 * @generated
	 */
	int AMBIENTE_DESPLEGUE = 2;

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
	 * The feature id for the '<em><b>Servidores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLEGUE__SERVIDORES = 2;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLEGUE__VPC = 3;

	/**
	 * The feature id for the '<em><b>Conexion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLEGUE__CONEXION = 4;

	/**
	 * The number of structural features of the '<em>Ambiente Desplegue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMBIENTE_DESPLEGUE_FEATURE_COUNT = 5;

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
	int SERVIDOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tamano M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__TAMANO_M = 1;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__VPC = 2;

	/**
	 * The feature id for the '<em><b>Subred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__SUBRED = 3;

	/**
	 * The feature id for the '<em><b>Serversecuritygroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR__SERVERSECURITYGROUP = 4;

	/**
	 * The number of structural features of the '<em>Servidor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_FEATURE_COUNT = 5;

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
	int SERVIDOR_APLICACION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION__NAME = SERVIDOR__NAME;

	/**
	 * The feature id for the '<em><b>Tamano M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION__TAMANO_M = SERVIDOR__TAMANO_M;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION__VPC = SERVIDOR__VPC;

	/**
	 * The feature id for the '<em><b>Subred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION__SUBRED = SERVIDOR__SUBRED;

	/**
	 * The feature id for the '<em><b>Serversecuritygroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_APLICACION__SERVERSECURITYGROUP = SERVIDOR__SERVERSECURITYGROUP;

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
	int SERVIDOR_BASE_DE_DATOS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__NAME = SERVIDOR__NAME;

	/**
	 * The feature id for the '<em><b>Tamano M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__TAMANO_M = SERVIDOR__TAMANO_M;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__VPC = SERVIDOR__VPC;

	/**
	 * The feature id for the '<em><b>Subred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__SUBRED = SERVIDOR__SUBRED;

	/**
	 * The feature id for the '<em><b>Serversecuritygroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__SERVERSECURITYGROUP = SERVIDOR__SERVERSECURITYGROUP;

	/**
	 * The feature id for the '<em><b>Sistema Manejador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS__SISTEMA_MANEJADOR = SERVIDOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Servidor Base De Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS_FEATURE_COUNT = SERVIDOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Servidor Base De Datos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_BASE_DE_DATOS_OPERATION_COUNT = SERVIDOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link cloud_computing.impl.VPCImpl <em>VPC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.VPCImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getVPC()
	 * @generated
	 */
	int VPC = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subred</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC__SUBRED = 1;

	/**
	 * The number of structural features of the '<em>VPC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPC_FEATURE_COUNT = 2;

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
	int RULES = 7;

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
	 * The feature id for the '<em><b>Direccion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__DIRECCION = 5;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = 6;

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
	int SECURITY_GROUP = 8;

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
	 * The feature id for the '<em><b>Rules SG</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__RULES_SG = 2;

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
	int SUBRED = 9;

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
	int SERVIDOR_ALMACENAMIENTO = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__NAME = SERVIDOR__NAME;

	/**
	 * The feature id for the '<em><b>Tamano M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__TAMANO_M = SERVIDOR__TAMANO_M;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__VPC = SERVIDOR__VPC;

	/**
	 * The feature id for the '<em><b>Subred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__SUBRED = SERVIDOR__SUBRED;

	/**
	 * The feature id for the '<em><b>Serversecuritygroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVIDOR_ALMACENAMIENTO__SERVERSECURITYGROUP = SERVIDOR__SERVERSECURITYGROUP;

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
	 * The meta object id for the '{@link cloud_computing.impl.ConexionImpl <em>Conexion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.ConexionImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getConexion()
	 * @generated
	 */
	int CONEXION = 11;

	/**
	 * The feature id for the '<em><b>Servidor2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION__SERVIDOR2 = 0;

	/**
	 * The feature id for the '<em><b>Servidor1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONEXION__SERVIDOR1 = 1;

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
	 * The meta object id for the '{@link cloud_computing.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.impl.GatewayImpl
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 12;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Vpc</b></em>' reference.
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
	 * The meta object id for the '{@link cloud_computing.Ambiente <em>Ambiente</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.Ambiente
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getAmbiente()
	 * @generated
	 */
	int AMBIENTE = 13;

	/**
	 * The meta object id for the '{@link cloud_computing.TamanoMaquina <em>Tamano Maquina</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.TamanoMaquina
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getTamanoMaquina()
	 * @generated
	 */
	int TAMANO_MAQUINA = 14;

	/**
	 * The meta object id for the '{@link cloud_computing.SistemaManejador <em>Sistema Manejador</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.SistemaManejador
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getSistemaManejador()
	 * @generated
	 */
	int SISTEMA_MANEJADOR = 15;

	/**
	 * The meta object id for the '{@link cloud_computing.SistemaOperativo <em>Sistema Operativo</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.SistemaOperativo
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getSistemaOperativo()
	 * @generated
	 */
	int SISTEMA_OPERATIVO = 16;

	/**
	 * The meta object id for the '{@link cloud_computing.ProveedorServicio <em>Proveedor Servicio</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.ProveedorServicio
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getProveedorServicio()
	 * @generated
	 */
	int PROVEEDOR_SERVICIO = 17;

	/**
	 * The meta object id for the '{@link cloud_computing.Direccion <em>Direccion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cloud_computing.Direccion
	 * @see cloud_computing.impl.Cloud_computingPackageImpl#getDireccion()
	 * @generated
	 */
	int DIRECCION = 18;


	/**
	 * Returns the meta object for class '{@link cloud_computing.Login <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login</em>'.
	 * @see cloud_computing.Login
	 * @generated
	 */
	EClass getLogin();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Login#getNombreConexion <em>Nombre Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Conexion</em>'.
	 * @see cloud_computing.Login#getNombreConexion()
	 * @see #getLogin()
	 * @generated
	 */
	EAttribute getLogin_NombreConexion();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Login#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usuario</em>'.
	 * @see cloud_computing.Login#getUsuario()
	 * @see #getLogin()
	 * @generated
	 */
	EAttribute getLogin_Usuario();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Login#getContrasena <em>Contrasena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrasena</em>'.
	 * @see cloud_computing.Login#getContrasena()
	 * @see #getLogin()
	 * @generated
	 */
	EAttribute getLogin_Contrasena();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Login#getAccessId <em>Access Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Id</em>'.
	 * @see cloud_computing.Login#getAccessId()
	 * @see #getLogin()
	 * @generated
	 */
	EAttribute getLogin_AccessId();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Login#getSecret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secret</em>'.
	 * @see cloud_computing.Login#getSecret()
	 * @see #getLogin()
	 * @generated
	 */
	EAttribute getLogin_Secret();

	/**
	 * Returns the meta object for class '{@link cloud_computing.Infraestructura <em>Infraestructura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infraestructura</em>'.
	 * @see cloud_computing.Infraestructura
	 * @generated
	 */
	EClass getInfraestructura();

	/**
	 * Returns the meta object for the containment reference '{@link cloud_computing.Infraestructura#getLogins <em>Logins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logins</em>'.
	 * @see cloud_computing.Infraestructura#getLogins()
	 * @see #getInfraestructura()
	 * @generated
	 */
	EReference getInfraestructura_Logins();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Infraestructura#getAmbientesdesplegue <em>Ambientesdesplegue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ambientesdesplegue</em>'.
	 * @see cloud_computing.Infraestructura#getAmbientesdesplegue()
	 * @see #getInfraestructura()
	 * @generated
	 */
	EReference getInfraestructura_Ambientesdesplegue();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Infraestructura#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see cloud_computing.Infraestructura#getTipo()
	 * @see #getInfraestructura()
	 * @generated
	 */
	EAttribute getInfraestructura_Tipo();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Infraestructura#getSecuritygroups <em>Securitygroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Securitygroups</em>'.
	 * @see cloud_computing.Infraestructura#getSecuritygroups()
	 * @see #getInfraestructura()
	 * @generated
	 */
	EReference getInfraestructura_Securitygroups();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Infraestructura#getNombreProyecto <em>Nombre Proyecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre Proyecto</em>'.
	 * @see cloud_computing.Infraestructura#getNombreProyecto()
	 * @see #getInfraestructura()
	 * @generated
	 */
	EAttribute getInfraestructura_NombreProyecto();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.Infraestructura#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gateway</em>'.
	 * @see cloud_computing.Infraestructura#getGateway()
	 * @see #getInfraestructura()
	 * @generated
	 */
	EReference getInfraestructura_Gateway();

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
	 * Returns the meta object for the containment reference list '{@link cloud_computing.AmbienteDesplegue#getServidores <em>Servidores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Servidores</em>'.
	 * @see cloud_computing.AmbienteDesplegue#getServidores()
	 * @see #getAmbienteDesplegue()
	 * @generated
	 */
	EReference getAmbienteDesplegue_Servidores();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.AmbienteDesplegue#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vpc</em>'.
	 * @see cloud_computing.AmbienteDesplegue#getVpc()
	 * @see #getAmbienteDesplegue()
	 * @generated
	 */
	EReference getAmbienteDesplegue_Vpc();

	/**
	 * Returns the meta object for the containment reference list '{@link cloud_computing.AmbienteDesplegue#getConexion <em>Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conexion</em>'.
	 * @see cloud_computing.AmbienteDesplegue#getConexion()
	 * @see #getAmbienteDesplegue()
	 * @generated
	 */
	EReference getAmbienteDesplegue_Conexion();

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
	 * Returns the meta object for the attribute '{@link cloud_computing.Servidor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cloud_computing.Servidor#getName()
	 * @see #getServidor()
	 * @generated
	 */
	EAttribute getServidor_Name();

	/**
	 * Returns the meta object for the attribute '{@link cloud_computing.Servidor#getTamanoM <em>Tamano M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tamano M</em>'.
	 * @see cloud_computing.Servidor#getTamanoM()
	 * @see #getServidor()
	 * @generated
	 */
	EAttribute getServidor_TamanoM();

	/**
	 * Returns the meta object for the reference '{@link cloud_computing.Servidor#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vpc</em>'.
	 * @see cloud_computing.Servidor#getVpc()
	 * @see #getServidor()
	 * @generated
	 */
	EReference getServidor_Vpc();

	/**
	 * Returns the meta object for the reference '{@link cloud_computing.Servidor#getSubred <em>Subred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subred</em>'.
	 * @see cloud_computing.Servidor#getSubred()
	 * @see #getServidor()
	 * @generated
	 */
	EReference getServidor_Subred();

	/**
	 * Returns the meta object for the reference list '{@link cloud_computing.Servidor#getServersecuritygroup <em>Serversecuritygroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Serversecuritygroup</em>'.
	 * @see cloud_computing.Servidor#getServersecuritygroup()
	 * @see #getServidor()
	 * @generated
	 */
	EReference getServidor_Serversecuritygroup();

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
	 * Returns the meta object for the containment reference list '{@link cloud_computing.VPC#getSubred <em>Subred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subred</em>'.
	 * @see cloud_computing.VPC#getSubred()
	 * @see #getVPC()
	 * @generated
	 */
	EReference getVPC_Subred();

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
	 * Returns the meta object for the attribute '{@link cloud_computing.Rules#getDireccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direccion</em>'.
	 * @see cloud_computing.Rules#getDireccion()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Direccion();

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
	 * Returns the meta object for the containment reference list '{@link cloud_computing.SecurityGroup#getRulesSG <em>Rules SG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules SG</em>'.
	 * @see cloud_computing.SecurityGroup#getRulesSG()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EReference getSecurityGroup_RulesSG();

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
	 * Returns the meta object for class '{@link cloud_computing.Conexion <em>Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conexion</em>'.
	 * @see cloud_computing.Conexion
	 * @generated
	 */
	EClass getConexion();

	/**
	 * Returns the meta object for the reference '{@link cloud_computing.Conexion#getServidor2 <em>Servidor2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servidor2</em>'.
	 * @see cloud_computing.Conexion#getServidor2()
	 * @see #getConexion()
	 * @generated
	 */
	EReference getConexion_Servidor2();

	/**
	 * Returns the meta object for the reference '{@link cloud_computing.Conexion#getServidor1 <em>Servidor1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Servidor1</em>'.
	 * @see cloud_computing.Conexion#getServidor1()
	 * @see #getConexion()
	 * @generated
	 */
	EReference getConexion_Servidor1();

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
	 * Returns the meta object for the attribute '{@link cloud_computing.Gateway#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see cloud_computing.Gateway#getNombre()
	 * @see #getGateway()
	 * @generated
	 */
	EAttribute getGateway_Nombre();

	/**
	 * Returns the meta object for the reference '{@link cloud_computing.Gateway#getVpc <em>Vpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vpc</em>'.
	 * @see cloud_computing.Gateway#getVpc()
	 * @see #getGateway()
	 * @generated
	 */
	EReference getGateway_Vpc();

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
	 * Returns the meta object for enum '{@link cloud_computing.TamanoMaquina <em>Tamano Maquina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tamano Maquina</em>'.
	 * @see cloud_computing.TamanoMaquina
	 * @generated
	 */
	EEnum getTamanoMaquina();

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
	 * Returns the meta object for enum '{@link cloud_computing.Direccion <em>Direccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direccion</em>'.
	 * @see cloud_computing.Direccion
	 * @generated
	 */
	EEnum getDireccion();

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
		 * The meta object literal for the '{@link cloud_computing.impl.LoginImpl <em>Login</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.LoginImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getLogin()
		 * @generated
		 */
		EClass LOGIN = eINSTANCE.getLogin();

		/**
		 * The meta object literal for the '<em><b>Nombre Conexion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN__NOMBRE_CONEXION = eINSTANCE.getLogin_NombreConexion();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN__USUARIO = eINSTANCE.getLogin_Usuario();

		/**
		 * The meta object literal for the '<em><b>Contrasena</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN__CONTRASENA = eINSTANCE.getLogin_Contrasena();

		/**
		 * The meta object literal for the '<em><b>Access Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN__ACCESS_ID = eINSTANCE.getLogin_AccessId();

		/**
		 * The meta object literal for the '<em><b>Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN__SECRET = eINSTANCE.getLogin_Secret();

		/**
		 * The meta object literal for the '{@link cloud_computing.impl.InfraestructuraImpl <em>Infraestructura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.InfraestructuraImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getInfraestructura()
		 * @generated
		 */
		EClass INFRAESTRUCTURA = eINSTANCE.getInfraestructura();

		/**
		 * The meta object literal for the '<em><b>Logins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRAESTRUCTURA__LOGINS = eINSTANCE.getInfraestructura_Logins();

		/**
		 * The meta object literal for the '<em><b>Ambientesdesplegue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRAESTRUCTURA__AMBIENTESDESPLEGUE = eINSTANCE.getInfraestructura_Ambientesdesplegue();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRAESTRUCTURA__TIPO = eINSTANCE.getInfraestructura_Tipo();

		/**
		 * The meta object literal for the '<em><b>Securitygroups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRAESTRUCTURA__SECURITYGROUPS = eINSTANCE.getInfraestructura_Securitygroups();

		/**
		 * The meta object literal for the '<em><b>Nombre Proyecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFRAESTRUCTURA__NOMBRE_PROYECTO = eINSTANCE.getInfraestructura_NombreProyecto();

		/**
		 * The meta object literal for the '<em><b>Gateway</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRAESTRUCTURA__GATEWAY = eINSTANCE.getInfraestructura_Gateway();

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
		 * The meta object literal for the '<em><b>Servidores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMBIENTE_DESPLEGUE__SERVIDORES = eINSTANCE.getAmbienteDesplegue_Servidores();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMBIENTE_DESPLEGUE__VPC = eINSTANCE.getAmbienteDesplegue_Vpc();

		/**
		 * The meta object literal for the '<em><b>Conexion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMBIENTE_DESPLEGUE__CONEXION = eINSTANCE.getAmbienteDesplegue_Conexion();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR__NAME = eINSTANCE.getServidor_Name();

		/**
		 * The meta object literal for the '<em><b>Tamano M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR__TAMANO_M = eINSTANCE.getServidor_TamanoM();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVIDOR__VPC = eINSTANCE.getServidor_Vpc();

		/**
		 * The meta object literal for the '<em><b>Subred</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVIDOR__SUBRED = eINSTANCE.getServidor_Subred();

		/**
		 * The meta object literal for the '<em><b>Serversecuritygroup</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVIDOR__SERVERSECURITYGROUP = eINSTANCE.getServidor_Serversecuritygroup();

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
		 * The meta object literal for the '<em><b>Sistema Manejador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVIDOR_BASE_DE_DATOS__SISTEMA_MANEJADOR = eINSTANCE.getServidorBaseDeDatos_SistemaManejador();

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
		 * The meta object literal for the '<em><b>Subred</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VPC__SUBRED = eINSTANCE.getVPC_Subred();

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
		 * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__DIRECCION = eINSTANCE.getRules_Direccion();

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
		 * The meta object literal for the '<em><b>Rules SG</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP__RULES_SG = eINSTANCE.getSecurityGroup_RulesSG();

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
		 * The meta object literal for the '{@link cloud_computing.impl.ConexionImpl <em>Conexion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.impl.ConexionImpl
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getConexion()
		 * @generated
		 */
		EClass CONEXION = eINSTANCE.getConexion();

		/**
		 * The meta object literal for the '<em><b>Servidor2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONEXION__SERVIDOR2 = eINSTANCE.getConexion_Servidor2();

		/**
		 * The meta object literal for the '<em><b>Servidor1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONEXION__SERVIDOR1 = eINSTANCE.getConexion_Servidor1();

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
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATEWAY__NOMBRE = eINSTANCE.getGateway_Nombre();

		/**
		 * The meta object literal for the '<em><b>Vpc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATEWAY__VPC = eINSTANCE.getGateway_Vpc();

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
		 * The meta object literal for the '{@link cloud_computing.TamanoMaquina <em>Tamano Maquina</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.TamanoMaquina
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getTamanoMaquina()
		 * @generated
		 */
		EEnum TAMANO_MAQUINA = eINSTANCE.getTamanoMaquina();

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

		/**
		 * The meta object literal for the '{@link cloud_computing.Direccion <em>Direccion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cloud_computing.Direccion
		 * @see cloud_computing.impl.Cloud_computingPackageImpl#getDireccion()
		 * @generated
		 */
		EEnum DIRECCION = eINSTANCE.getDireccion();

	}

} //Cloud_computingPackage
