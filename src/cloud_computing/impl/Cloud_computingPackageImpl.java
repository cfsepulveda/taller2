/**
 */
package cloud_computing.impl;

import cloud_computing.Ambiente;
import cloud_computing.AmbienteDesplegue;
import cloud_computing.Atributos;
import cloud_computing.Cloud_computingFactory;
import cloud_computing.Cloud_computingPackage;
import cloud_computing.Conexion;
import cloud_computing.Gateway;
import cloud_computing.Proveedor;
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
import cloud_computing.TamañoMaquina;
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
	private EClass conexionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proveedorEClass = null;

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
	private EClass gatewayEClass = null;

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
	private EEnum ambienteEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tamañoMaquinaEEnum = null;

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
		Cloud_computingPackageImpl theCloud_computingPackage = (Cloud_computingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Cloud_computingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Cloud_computingPackageImpl());

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
	public EClass getConexion() {
		return conexionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConexion_Atributos() {
		return (EReference)conexionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConexion_NombreConexion() {
		return (EAttribute)conexionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributos() {
		return atributosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributos_Nombre() {
		return (EAttribute)atributosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributos_TipoDato() {
		return (EAttribute)atributosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtributos_TipoConexion() {
		return (EAttribute)atributosEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProveedor() {
		return proveedorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProveedor_Conexion() {
		return (EReference)proveedorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProveedor_Ambientedesplegue() {
		return (EReference)proveedorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProveedor_Vpc() {
		return (EReference)proveedorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProveedor_Nombre() {
		return (EAttribute)proveedorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProveedor_Securitygroup() {
		return (EReference)proveedorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProveedor_Subred() {
		return (EReference)proveedorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProveedor_Rules() {
		return (EReference)proveedorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAmbienteDesplegue() {
		return ambienteDesplegueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmbienteDesplegue_TipoAmbiente() {
		return (EAttribute)ambienteDesplegueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAmbienteDesplegue_Alias() {
		return (EAttribute)ambienteDesplegueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAmbienteDesplegue_Servidor() {
		return (EReference)ambienteDesplegueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServidor() {
		return servidorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidor_Nombre() {
		return (EAttribute)servidorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidor_TamañoMaquina() {
		return (EAttribute)servidorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServidor_Servidor() {
		return (EReference)servidorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServidor_Vpc() {
		return (EReference)servidorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServidorAplicacion() {
		return servidorAplicacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidorAplicacion_SistemaOperativo() {
		return (EAttribute)servidorAplicacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServidorBaseDeDatos() {
		return servidorBaseDeDatosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidorBaseDeDatos_Tipo() {
		return (EAttribute)servidorBaseDeDatosEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidorBaseDeDatos_SistemaManejador() {
		return (EAttribute)servidorBaseDeDatosEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGateway_Name() {
		return (EAttribute)gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateway_Vpc() {
		return (EReference)gatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPC() {
		return vpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVPC_Name() {
		return (EAttribute)vpcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRules() {
		return rulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRules_Type() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRules_Protocol() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRules_PortRange() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRules_Source() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRules_Description() {
		return (EAttribute)rulesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityGroup() {
		return securityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityGroup_Name() {
		return (EAttribute)securityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityGroup_Description() {
		return (EAttribute)securityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityGroup_Rules() {
		return (EReference)securityGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubred() {
		return subredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubred_Name() {
		return (EAttribute)subredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubred_Cidr() {
		return (EAttribute)subredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubred_Az() {
		return (EAttribute)subredEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServidorAlmacenamiento() {
		return servidorAlmacenamientoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServidorAlmacenamiento_TamanoInicial() {
		return (EAttribute)servidorAlmacenamientoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAmbiente() {
		return ambienteEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTamañoMaquina() {
		return tamañoMaquinaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoBaseDeDatos() {
		return tipoBaseDeDatosEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSistemaManejador() {
		return sistemaManejadorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSistemaOperativo() {
		return sistemaOperativoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProveedorServicio() {
		return proveedorServicioEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
		conexionEClass = createEClass(CONEXION);
		createEReference(conexionEClass, CONEXION__ATRIBUTOS);
		createEAttribute(conexionEClass, CONEXION__NOMBRE_CONEXION);

		atributosEClass = createEClass(ATRIBUTOS);
		createEAttribute(atributosEClass, ATRIBUTOS__NOMBRE);
		createEAttribute(atributosEClass, ATRIBUTOS__TIPO_DATO);
		createEAttribute(atributosEClass, ATRIBUTOS__TIPO_CONEXION);

		proveedorEClass = createEClass(PROVEEDOR);
		createEReference(proveedorEClass, PROVEEDOR__CONEXION);
		createEReference(proveedorEClass, PROVEEDOR__AMBIENTEDESPLEGUE);
		createEReference(proveedorEClass, PROVEEDOR__VPC);
		createEAttribute(proveedorEClass, PROVEEDOR__NOMBRE);
		createEReference(proveedorEClass, PROVEEDOR__SECURITYGROUP);
		createEReference(proveedorEClass, PROVEEDOR__SUBRED);
		createEReference(proveedorEClass, PROVEEDOR__RULES);

		ambienteDesplegueEClass = createEClass(AMBIENTE_DESPLEGUE);
		createEAttribute(ambienteDesplegueEClass, AMBIENTE_DESPLEGUE__TIPO_AMBIENTE);
		createEAttribute(ambienteDesplegueEClass, AMBIENTE_DESPLEGUE__ALIAS);
		createEReference(ambienteDesplegueEClass, AMBIENTE_DESPLEGUE__SERVIDOR);

		servidorEClass = createEClass(SERVIDOR);
		createEAttribute(servidorEClass, SERVIDOR__NOMBRE);
		createEAttribute(servidorEClass, SERVIDOR__TAMAÑO_MAQUINA);
		createEReference(servidorEClass, SERVIDOR__SERVIDOR);
		createEReference(servidorEClass, SERVIDOR__VPC);

		servidorAplicacionEClass = createEClass(SERVIDOR_APLICACION);
		createEAttribute(servidorAplicacionEClass, SERVIDOR_APLICACION__SISTEMA_OPERATIVO);

		servidorBaseDeDatosEClass = createEClass(SERVIDOR_BASE_DE_DATOS);
		createEAttribute(servidorBaseDeDatosEClass, SERVIDOR_BASE_DE_DATOS__TIPO);
		createEAttribute(servidorBaseDeDatosEClass, SERVIDOR_BASE_DE_DATOS__SISTEMA_MANEJADOR);

		gatewayEClass = createEClass(GATEWAY);
		createEAttribute(gatewayEClass, GATEWAY__NAME);
		createEReference(gatewayEClass, GATEWAY__VPC);

		vpcEClass = createEClass(VPC);
		createEAttribute(vpcEClass, VPC__NAME);

		rulesEClass = createEClass(RULES);
		createEAttribute(rulesEClass, RULES__TYPE);
		createEAttribute(rulesEClass, RULES__PROTOCOL);
		createEAttribute(rulesEClass, RULES__PORT_RANGE);
		createEAttribute(rulesEClass, RULES__SOURCE);
		createEAttribute(rulesEClass, RULES__DESCRIPTION);

		securityGroupEClass = createEClass(SECURITY_GROUP);
		createEAttribute(securityGroupEClass, SECURITY_GROUP__NAME);
		createEAttribute(securityGroupEClass, SECURITY_GROUP__DESCRIPTION);
		createEReference(securityGroupEClass, SECURITY_GROUP__RULES);

		subredEClass = createEClass(SUBRED);
		createEAttribute(subredEClass, SUBRED__NAME);
		createEAttribute(subredEClass, SUBRED__CIDR);
		createEAttribute(subredEClass, SUBRED__AZ);

		servidorAlmacenamientoEClass = createEClass(SERVIDOR_ALMACENAMIENTO);
		createEAttribute(servidorAlmacenamientoEClass, SERVIDOR_ALMACENAMIENTO__TAMANO_INICIAL);

		// Create enums
		ambienteEEnum = createEEnum(AMBIENTE);
		tamañoMaquinaEEnum = createEEnum(TAMAÑO_MAQUINA);
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
		initEClass(conexionEClass, Conexion.class, "Conexion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConexion_Atributos(), this.getAtributos(), null, "atributos", null, 0, -1, Conexion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConexion_NombreConexion(), ecorePackage.getEString(), "nombreConexion", null, 0, 1, Conexion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atributosEClass, Atributos.class, "Atributos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtributos_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Atributos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributos_TipoDato(), ecorePackage.getEString(), "tipoDato", null, 0, 1, Atributos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtributos_TipoConexion(), ecorePackage.getEString(), "tipoConexion", null, 0, 1, Atributos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proveedorEClass, Proveedor.class, "Proveedor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProveedor_Conexion(), this.getConexion(), null, "conexion", null, 0, -1, Proveedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProveedor_Ambientedesplegue(), this.getAmbienteDesplegue(), null, "ambientedesplegue", null, 0, -1, Proveedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProveedor_Vpc(), this.getGateway(), null, "vpc", null, 0, -1, Proveedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProveedor_Nombre(), this.getProveedorServicio(), "nombre", null, 0, 1, Proveedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProveedor_Securitygroup(), this.getSecurityGroup(), null, "securitygroup", null, 0, -1, Proveedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProveedor_Subred(), this.getSubred(), null, "subred", null, 0, -1, Proveedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProveedor_Rules(), this.getRules(), null, "rules", null, 0, -1, Proveedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ambienteDesplegueEClass, AmbienteDesplegue.class, "AmbienteDesplegue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAmbienteDesplegue_TipoAmbiente(), this.getAmbiente(), "tipoAmbiente", null, 0, 1, AmbienteDesplegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAmbienteDesplegue_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, AmbienteDesplegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAmbienteDesplegue_Servidor(), this.getServidor(), null, "servidor", null, 0, -1, AmbienteDesplegue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorEClass, Servidor.class, "Servidor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidor_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Servidor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServidor_TamañoMaquina(), this.getTamañoMaquina(), "TamañoMaquina", null, 0, 1, Servidor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServidor_Servidor(), this.getServidor(), null, "servidor", null, 0, -1, Servidor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServidor_Vpc(), this.getVPC(), null, "vpc", null, 0, -1, Servidor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorAplicacionEClass, ServidorAplicacion.class, "ServidorAplicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidorAplicacion_SistemaOperativo(), this.getSistemaOperativo(), "sistemaOperativo", null, 0, 1, ServidorAplicacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorBaseDeDatosEClass, ServidorBaseDeDatos.class, "ServidorBaseDeDatos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidorBaseDeDatos_Tipo(), this.getTipoBaseDeDatos(), "tipo", null, 0, 1, ServidorBaseDeDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServidorBaseDeDatos_SistemaManejador(), this.getSistemaManejador(), "sistemaManejador", null, 0, 1, ServidorBaseDeDatos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gatewayEClass, Gateway.class, "Gateway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGateway_Name(), ecorePackage.getEString(), "name", null, 0, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGateway_Vpc(), this.getVPC(), null, "vpc", null, 0, -1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vpcEClass, cloud_computing.VPC.class, "VPC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVPC_Name(), ecorePackage.getEString(), "name", null, 0, 1, cloud_computing.VPC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rulesEClass, Rules.class, "Rules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRules_Type(), ecorePackage.getEString(), "type", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_PortRange(), ecorePackage.getEString(), "portRange", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_Source(), ecorePackage.getEString(), "Source", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRules_Description(), ecorePackage.getEString(), "description", null, 0, 1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityGroupEClass, SecurityGroup.class, "SecurityGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecurityGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecurityGroup_Rules(), this.getRules(), null, "rules", null, 0, -1, SecurityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subredEClass, Subred.class, "Subred", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubred_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subred.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubred_Cidr(), ecorePackage.getEString(), "cidr", null, 0, 1, Subred.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubred_Az(), ecorePackage.getEString(), "az", null, 0, 1, Subred.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servidorAlmacenamientoEClass, ServidorAlmacenamiento.class, "ServidorAlmacenamiento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServidorAlmacenamiento_TamanoInicial(), ecorePackage.getEString(), "tamanoInicial", null, 0, 1, ServidorAlmacenamiento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ambienteEEnum, Ambiente.class, "Ambiente");
		addEEnumLiteral(ambienteEEnum, Ambiente.DESARROLLO);
		addEEnumLiteral(ambienteEEnum, Ambiente.PRUEBAS);
		addEEnumLiteral(ambienteEEnum, Ambiente.QA);
		addEEnumLiteral(ambienteEEnum, Ambiente.PRODUCCION);

		initEEnum(tamañoMaquinaEEnum, TamañoMaquina.class, "TamañoMaquina");
		addEEnumLiteral(tamañoMaquinaEEnum, TamañoMaquina.MICRO);
		addEEnumLiteral(tamañoMaquinaEEnum, TamañoMaquina.SMALL);
		addEEnumLiteral(tamañoMaquinaEEnum, TamañoMaquina.MEDIUM);
		addEEnumLiteral(tamañoMaquinaEEnum, TamañoMaquina.LARGE);

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
