/**
 */
package cloud_computing.impl;

import cloud_computing.Cloud_computingPackage;
import cloud_computing.Servidor;
import cloud_computing.TamañoMaquina;
import cloud_computing.VPC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servidor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.ServidorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cloud_computing.impl.ServidorImpl#getTamañoMaquina <em>Tamaño Maquina</em>}</li>
 *   <li>{@link cloud_computing.impl.ServidorImpl#getServidor <em>Servidor</em>}</li>
 *   <li>{@link cloud_computing.impl.ServidorImpl#getVpc <em>Vpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServidorImpl extends MinimalEObjectImpl.Container implements Servidor {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTamañoMaquina() <em>Tamaño Maquina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamañoMaquina()
	 * @generated
	 * @ordered
	 */
	protected static final TamañoMaquina TAMAÑO_MAQUINA_EDEFAULT = TamañoMaquina.MICRO;

	/**
	 * The cached value of the '{@link #getTamañoMaquina() <em>Tamaño Maquina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamañoMaquina()
	 * @generated
	 * @ordered
	 */
	protected TamañoMaquina tamañoMaquina = TAMAÑO_MAQUINA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServidor() <em>Servidor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServidor()
	 * @generated
	 * @ordered
	 */
	protected EList<Servidor> servidor;

	/**
	 * The cached value of the '{@link #getVpc() <em>Vpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc()
	 * @generated
	 * @ordered
	 */
	protected EList<VPC> vpc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServidorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cloud_computingPackage.Literals.SERVIDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SERVIDOR__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TamañoMaquina getTamañoMaquina() {
		return tamañoMaquina;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTamañoMaquina(TamañoMaquina newTamañoMaquina) {
		TamañoMaquina oldTamañoMaquina = tamañoMaquina;
		tamañoMaquina = newTamañoMaquina == null ? TAMAÑO_MAQUINA_EDEFAULT : newTamañoMaquina;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SERVIDOR__TAMAÑO_MAQUINA, oldTamañoMaquina, tamañoMaquina));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Servidor> getServidor() {
		if (servidor == null) {
			servidor = new EObjectResolvingEList<Servidor>(Servidor.class, this, Cloud_computingPackage.SERVIDOR__SERVIDOR);
		}
		return servidor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VPC> getVpc() {
		if (vpc == null) {
			vpc = new EObjectContainmentEList<VPC>(VPC.class, this, Cloud_computingPackage.SERVIDOR__VPC);
		}
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cloud_computingPackage.SERVIDOR__VPC:
				return ((InternalEList<?>)getVpc()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cloud_computingPackage.SERVIDOR__NOMBRE:
				return getNombre();
			case Cloud_computingPackage.SERVIDOR__TAMAÑO_MAQUINA:
				return getTamañoMaquina();
			case Cloud_computingPackage.SERVIDOR__SERVIDOR:
				return getServidor();
			case Cloud_computingPackage.SERVIDOR__VPC:
				return getVpc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Cloud_computingPackage.SERVIDOR__NOMBRE:
				setNombre((String)newValue);
				return;
			case Cloud_computingPackage.SERVIDOR__TAMAÑO_MAQUINA:
				setTamañoMaquina((TamañoMaquina)newValue);
				return;
			case Cloud_computingPackage.SERVIDOR__SERVIDOR:
				getServidor().clear();
				getServidor().addAll((Collection<? extends Servidor>)newValue);
				return;
			case Cloud_computingPackage.SERVIDOR__VPC:
				getVpc().clear();
				getVpc().addAll((Collection<? extends VPC>)newValue);
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
			case Cloud_computingPackage.SERVIDOR__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Cloud_computingPackage.SERVIDOR__TAMAÑO_MAQUINA:
				setTamañoMaquina(TAMAÑO_MAQUINA_EDEFAULT);
				return;
			case Cloud_computingPackage.SERVIDOR__SERVIDOR:
				getServidor().clear();
				return;
			case Cloud_computingPackage.SERVIDOR__VPC:
				getVpc().clear();
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
			case Cloud_computingPackage.SERVIDOR__NOMBRE:
				return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
			case Cloud_computingPackage.SERVIDOR__TAMAÑO_MAQUINA:
				return tamañoMaquina != TAMAÑO_MAQUINA_EDEFAULT;
			case Cloud_computingPackage.SERVIDOR__SERVIDOR:
				return servidor != null && !servidor.isEmpty();
			case Cloud_computingPackage.SERVIDOR__VPC:
				return vpc != null && !vpc.isEmpty();
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", TamañoMaquina: ");
		result.append(tamañoMaquina);
		result.append(')');
		return result.toString();
	}

} //ServidorImpl
