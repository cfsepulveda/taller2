/**
 */
package cloud_computing.impl;

import cloud_computing.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cloud_computingFactoryImpl extends EFactoryImpl implements Cloud_computingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cloud_computingFactory init() {
		try {
			Cloud_computingFactory theCloud_computingFactory = (Cloud_computingFactory)EPackage.Registry.INSTANCE.getEFactory(Cloud_computingPackage.eNS_URI);
			if (theCloud_computingFactory != null) {
				return theCloud_computingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Cloud_computingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud_computingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Cloud_computingPackage.LOGIN: return createLogin();
			case Cloud_computingPackage.INFRAESTRUCTURA: return createInfraestructura();
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE: return createAmbienteDesplegue();
			case Cloud_computingPackage.SERVIDOR_APLICACION: return createServidorAplicacion();
			case Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS: return createServidorBaseDeDatos();
			case Cloud_computingPackage.VPC: return createVPC();
			case Cloud_computingPackage.RULES: return createRules();
			case Cloud_computingPackage.SECURITY_GROUP: return createSecurityGroup();
			case Cloud_computingPackage.SUBRED: return createSubred();
			case Cloud_computingPackage.SERVIDOR_ALMACENAMIENTO: return createServidorAlmacenamiento();
			case Cloud_computingPackage.CONEXION: return createConexion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Cloud_computingPackage.AMBIENTE:
				return createAmbienteFromString(eDataType, initialValue);
			case Cloud_computingPackage.TAMANO_MAQUINA:
				return createTamanoMaquinaFromString(eDataType, initialValue);
			case Cloud_computingPackage.TIPO_BASE_DE_DATOS:
				return createTipoBaseDeDatosFromString(eDataType, initialValue);
			case Cloud_computingPackage.SISTEMA_MANEJADOR:
				return createSistemaManejadorFromString(eDataType, initialValue);
			case Cloud_computingPackage.SISTEMA_OPERATIVO:
				return createSistemaOperativoFromString(eDataType, initialValue);
			case Cloud_computingPackage.PROVEEDOR_SERVICIO:
				return createProveedorServicioFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Cloud_computingPackage.AMBIENTE:
				return convertAmbienteToString(eDataType, instanceValue);
			case Cloud_computingPackage.TAMANO_MAQUINA:
				return convertTamanoMaquinaToString(eDataType, instanceValue);
			case Cloud_computingPackage.TIPO_BASE_DE_DATOS:
				return convertTipoBaseDeDatosToString(eDataType, instanceValue);
			case Cloud_computingPackage.SISTEMA_MANEJADOR:
				return convertSistemaManejadorToString(eDataType, instanceValue);
			case Cloud_computingPackage.SISTEMA_OPERATIVO:
				return convertSistemaOperativoToString(eDataType, instanceValue);
			case Cloud_computingPackage.PROVEEDOR_SERVICIO:
				return convertProveedorServicioToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Login createLogin() {
		LoginImpl login = new LoginImpl();
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Infraestructura createInfraestructura() {
		InfraestructuraImpl infraestructura = new InfraestructuraImpl();
		return infraestructura;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmbienteDesplegue createAmbienteDesplegue() {
		AmbienteDesplegueImpl ambienteDesplegue = new AmbienteDesplegueImpl();
		return ambienteDesplegue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServidorAplicacion createServidorAplicacion() {
		ServidorAplicacionImpl servidorAplicacion = new ServidorAplicacionImpl();
		return servidorAplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServidorBaseDeDatos createServidorBaseDeDatos() {
		ServidorBaseDeDatosImpl servidorBaseDeDatos = new ServidorBaseDeDatosImpl();
		return servidorBaseDeDatos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VPC createVPC() {
		VPCImpl vpc = new VPCImpl();
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rules createRules() {
		RulesImpl rules = new RulesImpl();
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityGroup createSecurityGroup() {
		SecurityGroupImpl securityGroup = new SecurityGroupImpl();
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subred createSubred() {
		SubredImpl subred = new SubredImpl();
		return subred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServidorAlmacenamiento createServidorAlmacenamiento() {
		ServidorAlmacenamientoImpl servidorAlmacenamiento = new ServidorAlmacenamientoImpl();
		return servidorAlmacenamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conexion createConexion() {
		ConexionImpl conexion = new ConexionImpl();
		return conexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ambiente createAmbienteFromString(EDataType eDataType, String initialValue) {
		Ambiente result = Ambiente.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmbienteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TamanoMaquina createTamanoMaquinaFromString(EDataType eDataType, String initialValue) {
		TamanoMaquina result = TamanoMaquina.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTamanoMaquinaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoBaseDeDatos createTipoBaseDeDatosFromString(EDataType eDataType, String initialValue) {
		TipoBaseDeDatos result = TipoBaseDeDatos.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoBaseDeDatosToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaManejador createSistemaManejadorFromString(EDataType eDataType, String initialValue) {
		SistemaManejador result = SistemaManejador.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSistemaManejadorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaOperativo createSistemaOperativoFromString(EDataType eDataType, String initialValue) {
		SistemaOperativo result = SistemaOperativo.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSistemaOperativoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProveedorServicio createProveedorServicioFromString(EDataType eDataType, String initialValue) {
		ProveedorServicio result = ProveedorServicio.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProveedorServicioToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cloud_computingPackage getCloud_computingPackage() {
		return (Cloud_computingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Cloud_computingPackage getPackage() {
		return Cloud_computingPackage.eINSTANCE;
	}

} //Cloud_computingFactoryImpl
