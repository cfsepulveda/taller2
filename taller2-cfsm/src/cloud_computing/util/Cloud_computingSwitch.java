/**
 */
package cloud_computing.util;

import cloud_computing.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cloud_computing.Cloud_computingPackage
 * @generated
 */
public class Cloud_computingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Cloud_computingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloud_computingSwitch() {
		if (modelPackage == null) {
			modelPackage = Cloud_computingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Cloud_computingPackage.CONEXION: {
				Conexion conexion = (Conexion)theEObject;
				T result = caseConexion(conexion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.ATRIBUTOS: {
				Atributos atributos = (Atributos)theEObject;
				T result = caseAtributos(atributos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.PROVEEDOR: {
				Proveedor proveedor = (Proveedor)theEObject;
				T result = caseProveedor(proveedor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE: {
				AmbienteDesplegue ambienteDesplegue = (AmbienteDesplegue)theEObject;
				T result = caseAmbienteDesplegue(ambienteDesplegue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.SERVIDOR: {
				Servidor servidor = (Servidor)theEObject;
				T result = caseServidor(servidor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.SERVIDOR_APLICACION: {
				ServidorAplicacion servidorAplicacion = (ServidorAplicacion)theEObject;
				T result = caseServidorAplicacion(servidorAplicacion);
				if (result == null) result = caseServidor(servidorAplicacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS: {
				ServidorBaseDeDatos servidorBaseDeDatos = (ServidorBaseDeDatos)theEObject;
				T result = caseServidorBaseDeDatos(servidorBaseDeDatos);
				if (result == null) result = caseServidor(servidorBaseDeDatos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.GATEWAY: {
				Gateway gateway = (Gateway)theEObject;
				T result = caseGateway(gateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.VPC: {
				VPC vpc = (VPC)theEObject;
				T result = caseVPC(vpc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.RULES: {
				Rules rules = (Rules)theEObject;
				T result = caseRules(rules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.SECURITY_GROUP: {
				SecurityGroup securityGroup = (SecurityGroup)theEObject;
				T result = caseSecurityGroup(securityGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.SUBRED: {
				Subred subred = (Subred)theEObject;
				T result = caseSubred(subred);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Cloud_computingPackage.SERVIDOR_ALMACENAMIENTO: {
				ServidorAlmacenamiento servidorAlmacenamiento = (ServidorAlmacenamiento)theEObject;
				T result = caseServidorAlmacenamiento(servidorAlmacenamiento);
				if (result == null) result = caseServidor(servidorAlmacenamiento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conexion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conexion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConexion(Conexion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atributos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atributos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtributos(Atributos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proveedor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proveedor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProveedor(Proveedor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ambiente Desplegue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ambiente Desplegue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAmbienteDesplegue(AmbienteDesplegue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servidor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servidor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServidor(Servidor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servidor Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servidor Aplicacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServidorAplicacion(ServidorAplicacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servidor Base De Datos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servidor Base De Datos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServidorBaseDeDatos(ServidorBaseDeDatos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VPC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VPC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVPC(VPC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRules(Rules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityGroup(SecurityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subred</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subred</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubred(Subred object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Servidor Almacenamiento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Servidor Almacenamiento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServidorAlmacenamiento(ServidorAlmacenamiento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Cloud_computingSwitch
