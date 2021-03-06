/**
 */
package cloud_computing.impl;

import cloud_computing.Cloud_computingPackage;
import cloud_computing.ServidorBaseDeDatos;
import cloud_computing.SistemaManejador;
import cloud_computing.TipoBaseDeDatos;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servidor Base De Datos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.ServidorBaseDeDatosImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link cloud_computing.impl.ServidorBaseDeDatosImpl#getSistemaManejador <em>Sistema Manejador</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServidorBaseDeDatosImpl extends ServidorImpl implements ServidorBaseDeDatos {
	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoBaseDeDatos TIPO_EDEFAULT = TipoBaseDeDatos.RELACIONAL;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoBaseDeDatos tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getSistemaManejador() <em>Sistema Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemaManejador()
	 * @generated
	 * @ordered
	 */
	protected static final SistemaManejador SISTEMA_MANEJADOR_EDEFAULT = SistemaManejador.POSTGRE_SQL;

	/**
	 * The cached value of the '{@link #getSistemaManejador() <em>Sistema Manejador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSistemaManejador()
	 * @generated
	 * @ordered
	 */
	protected SistemaManejador sistemaManejador = SISTEMA_MANEJADOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServidorBaseDeDatosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cloud_computingPackage.Literals.SERVIDOR_BASE_DE_DATOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoBaseDeDatos getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoBaseDeDatos newTipo) {
		TipoBaseDeDatos oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaManejador getSistemaManejador() {
		return sistemaManejador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSistemaManejador(SistemaManejador newSistemaManejador) {
		SistemaManejador oldSistemaManejador = sistemaManejador;
		sistemaManejador = newSistemaManejador == null ? SISTEMA_MANEJADOR_EDEFAULT : newSistemaManejador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS__SISTEMA_MANEJADOR, oldSistemaManejador, sistemaManejador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS__TIPO:
				return getTipo();
			case Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS__SISTEMA_MANEJADOR:
				return getSistemaManejador();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS__TIPO:
				setTipo((TipoBaseDeDatos)newValue);
				return;
			case Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS__SISTEMA_MANEJADOR:
				setSistemaManejador((SistemaManejador)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS__SISTEMA_MANEJADOR:
				setSistemaManejador(SISTEMA_MANEJADOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS__TIPO:
				return tipo != TIPO_EDEFAULT;
			case Cloud_computingPackage.SERVIDOR_BASE_DE_DATOS__SISTEMA_MANEJADOR:
				return sistemaManejador != SISTEMA_MANEJADOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(", sistemaManejador: ");
		result.append(sistemaManejador);
		result.append(')');
		return result.toString();
	}

} //ServidorBaseDeDatosImpl
