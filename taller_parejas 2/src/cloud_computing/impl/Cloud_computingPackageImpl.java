/**
 */
package cloud_computing.impl;

import cloud_computing.Ambiente;
import cloud_computing.AmbienteDesplegue;
import cloud_computing.Cloud_computingFactory;
import cloud_computing.Cloud_computingPackage;
import cloud_computing.Conexion;
import cloud_computing.Infraestructura;
import cloud_computing.Login;
import cloud_computing.ProveedorServicio;
import cloud_computing.Rules;
import cloud_computing.SecurityGroup;
import cloud_computing.Servidor;
import cloud_computing.ServidorAlmacenamiento;
import cloud_computing.ServidorAplicacion;
import cloud_computing.ServidorBaseDeDatos;
import cloud_computing.SistemaManejador;
import cloud_computing.SistemaOperativo;
import cloud_computing.Subred;
import cloud_computing.TamanoMaquina;
import cloud_computing.TipoBaseDeDatos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cloud_computingPackageImpl extends EPackageImpl implements Cloud_computingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infraestructuraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ambienteDesplegueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servidorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servidorAplicacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servidorBaseDeDatosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servidorAlmacenamientoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conexionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ambienteEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tamanoMaquinaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoBaseDeDatosEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sistemaManejadorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sistemaOperativoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum proveedorServicioEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cloud_computing.Cloud_computingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Cloud_computingPackageImpl() {
		super(eNS_URI, Cloud_computingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Cloud_computingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Cloud_computingPackage init() {
		if (isInited) return (Cloud_computingPackage)EPackage.Registry.INSTANCE.getEPackage(Cloud_computingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCloud_computingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Cloud_computingPackageImpl theCloud_computingPackage = registeredCloud_computingPackage instanceof Cloud_computingPackageImpl ? (Cloud_computingPackageImpl)registeredCloud_computingPackage : new Cloud_computingPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCloud_computingPackage.createPackageContents();

		// Initialize created meta-data
		theCloud_computingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCloud_computingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Cloud_computingPackage.eNS_URI, theCloud_computingPackage);
		return theCloud_computingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogin() {
		return loginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogin_NombreConexion() {
		return (EAttribute)loginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogin_Usuario() {
		return (EAttribute)loginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogin_Contrasena() {
		return (EAttribute)loginEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogin_AccessId() {
		return (EAttribute)loginEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLogin_Secret() {
		return (EAttribute)loginEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfraestructura() {
		return infraestructuraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfraestructura_Conexiones() {
		return (EReference)infraestructuraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfraestructura_Ambientesdesplegue() {
		return (EReference)infraestructuraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInfraestructura_Tipo() {
		return (EAttribute)infraestructuraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfraestructura_Securitygroups() {
		return (EReference)infraestructuraEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfraestructura_Rules() {
		return (EReference)infraestructuraEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInfraestructura_NombreProyecto() {
		return (EAttribute)infraestructuraEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAmbienteDesplegue() {
		return ambienteDesplegueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmbienteDesplegue_TipoAmbiente() {
		return (EAttribute)ambienteDesplegueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAmbienteDesplegue_Alias() {
		return (EAttribute)ambienteDesplegueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmbienteDesplegue_Servidores() {
		return (EReference)ambienteDesplegueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmbienteDesplegue_Conexion() {
		return (EReference)ambienteDesplegueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAmbienteDesplegue_Vpc() {
		return (EReference)ambienteDesplegueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServidor() {
		return servidorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServidor_Nombre() {
		return (EAttribute)servidorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServidor_TamanoM() {
		return (EAttribute)servidorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServidor_Servidor() {
		return (EReference)servidorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServidor_Vpcs() {
		return (EReference)servidorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServidor_Conexion() {
		return (EReference)servidorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServidorAplicacion() {
		return servidorAplicacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServidorAplicacion_SistemaO() {
		return (EAttribute)servidorAplicacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServidorBaseDeDatos() {
		return servidorBaseDeDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServidorBaseDeDatos_SistemaManejador() {
		return (EAttribute)servidorBaseDeDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVPC() {
		return vpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVPC_Name() {
		return (EAttribute)vpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVPC_Subred() {
		return (EReference)vpcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRules() {
		return rulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRules_Type() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRules_Protocol() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRules_PortRange() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRules_Source() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRules_Description() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityGroup() {
		return securityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroup_Name() {
		return (EAttribute)securityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityGroup_Description() {
		return (EAttribute)securityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityGroup_RulesSG() {
		return (EReference)securityGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubred() {
		return subredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubred_Name() {
		return (EAttribute)subredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubred_Cidr() {
		return (EAttribute)subredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubred_Az() {
		return (EAttribute)subredEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServidorAlmacenamiento() {
		return servidorAlmacenamientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServidorAlmacenamiento_TamanoInicial() {
		return (EAttribute)servidorAlmacenamientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConexion() {
		return conexionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConexion_Recurso1() {
		return (EAttribute)conexionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConexion_Recurso2() {
		return (EAttribute)conexionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAmbiente() {
		return ambienteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTamanoMaquina() {
		return tamanoMaquinaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTipoBaseDeDatos() {
		return tipoBaseDeDatosEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSistemaManejador() {
		return sistemaManejadorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSistemaOperativo() {
		return sistemaOperativoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProveedorServicio() {
		return proveedorServicioEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cloud_computingFactory getCloud_computingFactory() {
		return (Cloud_computingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		loginEClass = createEClass(LOGIN);
		createEAttribute(loginEClass, LOGIN__NOMBRE_CONEXION);
		createEAttribute(loginEClass, LOGIN__USUARIO);
		createEAttribute(loginEClass, LOGIN__CONTRASENA);
		createEAttribute(loginEClass, LOGIN__ACCESS_ID);
		createEAttribute(loginEClass, LOGIN__SECRET);

		infraestructuraEClass = createEClass(INFRAESTRUCTURA);
		createEReference(infraestructuraEClass, INFRAESTRUCTURA__CONEXIONES);
		createEReference(infraestructuraEClass, INFRAESTRUCTURA__AMBIENTESDESPLEGUE);
		createEAttribute(infraestructuraEClass, INFRAESTRUCTURA__TIPO);
		createEReference(infraestructuraEClass, INFRAESTRUCTURA__SECURITYGROUPS);
		createEReference(infraestructuraEClass, INFRAESTRUCTURA__RULES);
		createEAttribute(infraestructuraEClass, INFRAESTRUCTURA__NOMBRE_PROYECTO);

		ambienteDesplegueEClass = createEClass(AMBIENTE_DESPLEGUE);
		createEAttribute(ambienteDesplegueEClass, AMBIENTE_DESPLEGUE__TIPO_AMBIENTE);
		createEAttribute(ambienteDesplegueEClass, AMBIENTE_DESPLEGUE__ALIAS);
		createEReference(ambienteDesplegueEClass, AMBIENTE_DESPLEGUE__SERVIDORES);
		createEReference(ambienteDesplegueEClass, AMBIENTE_DESPLEGUE__CONEXION);
		createEReference(ambienteDesplegueEClass, AMBIENTE_DESPLEGUE__VPC);

		servidorEClass = createEClass(SERVIDOR);
		createEAttribute(servidorEClass, SERVIDOR__NOMBRE);
		createEAttribute(servidorEClass, SERVIDOR__TAMANO_M);
		createEReference(servidorEClass, SERVIDOR__SERVIDOR);
		createEReference(servidorEClass, SERVIDOR__VPCS);
		createEReference(servidorEClass, SERVIDOR__CONEXION);

		servidorAplicacionEClass = createEClass(SERVIDOR_APLICACION);
		createEAttribute(servidorAplicacionEClass, SERVIDOR_APLICACION__SISTEMA_O);

		servidorBaseDeDatosEClass = createEClass(SERVIDOR_BASE_DE_DATOS);
		createEAttribute(servidorBaseDeDatosEClass, SERVIDOR_BASE_DE_DATOS__SISTEMA_MANEJADOR);

		vpcEClass = createEClass(VPC);
		createEAttribute(vpcEClass, VPC__NAME);
		createEReference(vpcEClass, VPC__SUBRED);

		rulesEClass = createEClass(RULES);
		createEAttribute(rulesEClass, RULES__TYPE);
		createEAttribute(rulesEClass, RULES__PROTOCOL);
		createEAttribute(rulesEClass, RULES__PORT_RANGE);
		createEAttribute(rulesEClass, RULES__SOURCE);
		createEAttribute(rulesEClass, RULES__DESCRIPTION);

		securityGroupEClass = createEClass(SECURITY_GROUP);
		createEAttribute(securityGroupEClass, SECURITY_GROUP__NAME);
		createEAttribute(securityGroupEClass, SECURITY_GROUP__DESCRIPTION);
		createEReference(securityGroupEClass, SECURITY_GROUP__RULES_SG);

		subredEClass = createEClass(SUBRED);
		createEAttribute(subredEClass, SUBRED__NAME);
		createEAttribute(subredEClass, SUBRED__CIDR);
		createEAttribute(subredEClass, SUBRED__AZ);

		servidorAlmacenamientoEClass = createEClass(SERVIDOR_ALMACENAMIENTO);
		createEAttribute(servidorAlmacenamientoEClass, SERVIDOR_ALMACENAMIENTO__TAMANO_INICIAL);

		conexionEClass = createEClass(CONEXION);
		createEAttribute(conexionEClass, CONEXION__RECURSO1);
		createEAttribute(conexionEClass, CONEXION__RECURSO2);

		// Create enums
		ambienteEEnum = createEEnum(AMBIENTE);
		tamanoMaquinaEEnum = createEEnum(TAMANO_MAQUINA);
		tipoBaseDeDatosEEnum = createEEnum(TIPO_BASE_DE_DATOS);
		sistemaManejadorEEnum = createEEnum(SISTEMA_MANEJADOR);
		sistemaOperativoEEnum = createEEnum(SISTEMA_OPERATIVO);
		proveedorServicioEEnum = createEEnum(PROVEEDOR_SERVICIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		servidorAplicacionEClass.getESuperTypes().add(this.getServidor());
		servidorBaseDeDatosEClass.getESuperTypes().add(this.getServidor());
		servidorAlmacenamientoEClass.getESuperTypes().add(this.getServidor());

		// Initialize classes, features, and operations; add parameters
		initEClass(loginEClass, Login.class, "Login", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogin_NombreConexion(), ecorePackage.getEString(), "nombreConexion", null, 0, 1, Login.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogin_Usuario(), ecorePackage.getEString(), "usuario", null, 0, 1, Login.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogin_Contrasena(), ecorePackage.getEString(), "contrasena", null, 0, 1, Login.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogin_AccessId(), ecorePackage.getEString(), "accessId", null, 0, 1, Login.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogin_Secret(), ecorePackage.getEString(), "secret", null, 0, 1, Login.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infraestructuraEClass, Infraestructura.class, "Infraestructura", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfraestructura_Conexiones(), this.getLogin(), null, "conexiones", null, 0, -1, Infraestructura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfraestructura_Ambientesdesplegue(), this.getAmbienteDesplegue(), null, "ambientesdesplegue", null, 0, -1, Infraestructura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfraestructura_Tipo(), this.getProveedorServicio(), "tipo", null, 0, 1, Infraestructura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfraestructura_Securitygroups(), this.getSecurityGroup(), null, "securitygroups", null, 0, -1, Infraestructura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfraestructura_Rules(), this.getRules(), null, "rules", null, 0, -1, Infraestructura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfraestructura_NombreProyecto(), ecorePackage.getEString(), "nombreProyecto", null, 0, 1, Infraestructura.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ambienteDesplegueEClass, AmbienteDesplegue.class, "AmbienteDesplegue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmbienteDesplegue_TipoAmbiente(), this.getAmbiente(), "tipoAmbiente", null, 0, 1, AmbienteDesplegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmbienteDesplegue_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, AmbienteDesplegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmbienteDesplegue_Servidores(), this.getServidor(), null, "servidores", null, 0, -1, AmbienteDesplegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmbienteDesplegue_Conexion(), this.getConexion(), null, "conexion", null, 0, 1, AmbienteDesplegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmbienteDesplegue_Vpc(), this.getVPC(), null, "vpc", null, 0, -1, AmbienteDesplegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorEClass, Servidor.class, "Servidor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidor_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Servidor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServidor_TamanoM(), this.getTamanoMaquina(), "TamanoM", null, 0, 1, Servidor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServidor_Servidor(), this.getServidor(), null, "servidor", null, 0, -1, Servidor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServidor_Vpcs(), this.getVPC(), null, "vpcs", null, 0, -1, Servidor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServidor_Conexion(), this.getConexion(), null, "conexion", null, 0, 1, Servidor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorAplicacionEClass, ServidorAplicacion.class, "ServidorAplicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidorAplicacion_SistemaO(), this.getSistemaOperativo(), "sistemaO", null, 0, 1, ServidorAplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorBaseDeDatosEClass, ServidorBaseDeDatos.class, "ServidorBaseDeDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidorBaseDeDatos_SistemaManejador(), this.getSistemaManejador(), "sistemaManejador", null, 0, 1, ServidorBaseDeDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcEClass, cloud_computing.VPC.class, "VPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVPC_Name(), ecorePackage.getEString(), "name", null, 0, 1, cloud_computing.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVPC_Subred(), this.getSubred(), null, "subred", null, 0, -1, cloud_computing.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rulesEClass, Rules.class, "Rules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRules_Type(), ecorePackage.getEString(), "type", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_PortRange(), ecorePackage.getEString(), "portRange", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_Source(), ecorePackage.getEString(), "Source", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_Description(), ecorePackage.getEString(), "description", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityGroupEClass, SecurityGroup.class, "SecurityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityGroup_RulesSG(), this.getRules(), null, "rulesSG", null, 0, -1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subredEClass, Subred.class, "Subred", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubred_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subred.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubred_Cidr(), ecorePackage.getEString(), "cidr", null, 0, 1, Subred.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubred_Az(), ecorePackage.getEString(), "az", null, 0, 1, Subred.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorAlmacenamientoEClass, ServidorAlmacenamiento.class, "ServidorAlmacenamiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidorAlmacenamiento_TamanoInicial(), ecorePackage.getEString(), "tamanoInicial", null, 0, 1, ServidorAlmacenamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conexionEClass, Conexion.class, "Conexion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConexion_Recurso1(), ecorePackage.getEString(), "recurso1", null, 0, 1, Conexion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConexion_Recurso2(), ecorePackage.getEString(), "recurso2", null, 0, 1, Conexion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ambienteEEnum, Ambiente.class, "Ambiente");
		addEEnumLiteral(ambienteEEnum, Ambiente.DESARROLLO);
		addEEnumLiteral(ambienteEEnum, Ambiente.PRUEBAS);
		addEEnumLiteral(ambienteEEnum, Ambiente.QA);
		addEEnumLiteral(ambienteEEnum, Ambiente.PRODUCCION);

		initEEnum(tamanoMaquinaEEnum, TamanoMaquina.class, "TamanoMaquina");
		addEEnumLiteral(tamanoMaquinaEEnum, TamanoMaquina.MICRO);
		addEEnumLiteral(tamanoMaquinaEEnum, TamanoMaquina.SMALL);
		addEEnumLiteral(tamanoMaquinaEEnum, TamanoMaquina.MEDIUM);
		addEEnumLiteral(tamanoMaquinaEEnum, TamanoMaquina.LARGE);

		initEEnum(tipoBaseDeDatosEEnum, TipoBaseDeDatos.class, "TipoBaseDeDatos");
		addEEnumLiteral(tipoBaseDeDatosEEnum, TipoBaseDeDatos.RELACIONAL);
		addEEnumLiteral(tipoBaseDeDatosEEnum, TipoBaseDeDatos.NO_SQL);

		initEEnum(sistemaManejadorEEnum, SistemaManejador.class, "SistemaManejador");
		addEEnumLiteral(sistemaManejadorEEnum, SistemaManejador.POSTGRE_SQL);
		addEEnumLiteral(sistemaManejadorEEnum, SistemaManejador.MY_SQL);
		addEEnumLiteral(sistemaManejadorEEnum, SistemaManejador.ORACLE);
		addEEnumLiteral(sistemaManejadorEEnum, SistemaManejador.SQL_SERVER);
		addEEnumLiteral(sistemaManejadorEEnum, SistemaManejador.NO_SQL);
		addEEnumLiteral(sistemaManejadorEEnum, SistemaManejador.AURORA);
		addEEnumLiteral(sistemaManejadorEEnum, SistemaManejador.MARIA_DB);
		addEEnumLiteral(sistemaManejadorEEnum, SistemaManejador.DOCUMENT_DB);
		addEEnumLiteral(sistemaManejadorEEnum, SistemaManejador.DYNAMO);
		addEEnumLiteral(sistemaManejadorEEnum, SistemaManejador.CASSANDRA);
		addEEnumLiteral(sistemaManejadorEEnum, SistemaManejador.REDIS);

		initEEnum(sistemaOperativoEEnum, SistemaOperativo.class, "SistemaOperativo");
		addEEnumLiteral(sistemaOperativoEEnum, SistemaOperativo.WINDOWS);
		addEEnumLiteral(sistemaOperativoEEnum, SistemaOperativo.LINUX);
		addEEnumLiteral(sistemaOperativoEEnum, SistemaOperativo.MAC);

		initEEnum(proveedorServicioEEnum, ProveedorServicio.class, "ProveedorServicio");
		addEEnumLiteral(proveedorServicioEEnum, ProveedorServicio.AWS);
		addEEnumLiteral(proveedorServicioEEnum, ProveedorServicio.GCP);

		// Create resource
		createResource(eNS_URI);
	}

} //Cloud_computingPackageImpl
