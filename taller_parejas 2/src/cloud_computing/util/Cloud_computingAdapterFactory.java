/**
 */
package cloud_computing.util;

import cloud_computing.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cloud_computing.Cloud_computingPackage
 * @generated
 */
public class Cloud_computingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cloud_computingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud_computingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Cloud_computingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cloud_computingSwitch<Adapter> modelSwitch =
		new Cloud_computingSwitch<Adapter>() {
			@Override
			public Adapter caseConexion(Conexion object) {
				return createConexionAdapter();
			}
			@Override
			public Adapter caseAtributos(Atributos object) {
				return createAtributosAdapter();
			}
			@Override
			public Adapter caseInfraestructura(Infraestructura object) {
				return createInfraestructuraAdapter();
			}
			@Override
			public Adapter caseAmbienteDesplegue(AmbienteDesplegue object) {
				return createAmbienteDesplegueAdapter();
			}
			@Override
			public Adapter caseServidor(Servidor object) {
				return createServidorAdapter();
			}
			@Override
			public Adapter caseServidorAplicacion(ServidorAplicacion object) {
				return createServidorAplicacionAdapter();
			}
			@Override
			public Adapter caseServidorBaseDeDatos(ServidorBaseDeDatos object) {
				return createServidorBaseDeDatosAdapter();
			}
			@Override
			public Adapter caseGateway(Gateway object) {
				return createGatewayAdapter();
			}
			@Override
			public Adapter caseVPC(VPC object) {
				return createVPCAdapter();
			}
			@Override
			public Adapter caseRules(Rules object) {
				return createRulesAdapter();
			}
			@Override
			public Adapter caseSecurityGroup(SecurityGroup object) {
				return createSecurityGroupAdapter();
			}
			@Override
			public Adapter caseSubred(Subred object) {
				return createSubredAdapter();
			}
			@Override
			public Adapter caseServidorAlmacenamiento(ServidorAlmacenamiento object) {
				return createServidorAlmacenamientoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.Conexion <em>Conexion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.Conexion
	 * @generated
	 */
	public Adapter createConexionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.Atributos <em>Atributos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.Atributos
	 * @generated
	 */
	public Adapter createAtributosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.Infraestructura <em>Infraestructura</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.Infraestructura
	 * @generated
	 */
	public Adapter createInfraestructuraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.AmbienteDesplegue <em>Ambiente Desplegue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.AmbienteDesplegue
	 * @generated
	 */
	public Adapter createAmbienteDesplegueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.Servidor <em>Servidor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.Servidor
	 * @generated
	 */
	public Adapter createServidorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.ServidorAplicacion <em>Servidor Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.ServidorAplicacion
	 * @generated
	 */
	public Adapter createServidorAplicacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.ServidorBaseDeDatos <em>Servidor Base De Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.ServidorBaseDeDatos
	 * @generated
	 */
	public Adapter createServidorBaseDeDatosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.VPC <em>VPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.VPC
	 * @generated
	 */
	public Adapter createVPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.Rules
	 * @generated
	 */
	public Adapter createRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.SecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.SecurityGroup
	 * @generated
	 */
	public Adapter createSecurityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.Subred <em>Subred</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.Subred
	 * @generated
	 */
	public Adapter createSubredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloud_computing.ServidorAlmacenamiento <em>Servidor Almacenamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloud_computing.ServidorAlmacenamiento
	 * @generated
	 */
	public Adapter createServidorAlmacenamientoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Cloud_computingAdapterFactory
