/**
 */
package cloud_computing.impl;

import cloud_computing.Cloud_computingPackage;
import cloud_computing.Servidor;
import cloud_computing.TamanoMaquina;
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
 *   <li>{@link cloud_computing.impl.ServidorImpl#getTamanoM <em>Tamano M</em>}</li>
 *   <li>{@link cloud_computing.impl.ServidorImpl#getServidor <em>Servidor</em>}</li>
 *   <li>{@link cloud_computing.impl.ServidorImpl#getVpcs <em>Vpcs</em>}</li>
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
	 * The default value of the '{@link #getTamanoM() <em>Tamano M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanoM()
	 * @generated
	 * @ordered
	 */
	protected static final TamanoMaquina TAMANO_M_EDEFAULT = TamanoMaquina.MICRO;

	/**
	 * The cached value of the '{@link #getTamanoM() <em>Tamano M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTamanoM()
	 * @generated
	 * @ordered
	 */
	protected TamanoMaquina tamanoM = TAMANO_M_EDEFAULT;

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
	 * The cached value of the '{@link #getVpcs() <em>Vpcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcs()
	 * @generated
	 * @ordered
	 */
	protected EList<VPC> vpcs;

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
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public TamanoMaquina getTamanoM() {
		return tamanoM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTamanoM(TamanoMaquina newTamanoM) {
		TamanoMaquina oldTamanoM = tamanoM;
		tamanoM = newTamanoM == null ? TAMANO_M_EDEFAULT : newTamanoM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SERVIDOR__TAMANO_M, oldTamanoM, tamanoM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public EList<VPC> getVpcs() {
		if (vpcs == null) {
			vpcs = new EObjectContainmentEList<VPC>(VPC.class, this, Cloud_computingPackage.SERVIDOR__VPCS);
		}
		return vpcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cloud_computingPackage.SERVIDOR__VPCS:
				return ((InternalEList<?>)getVpcs()).basicRemove(otherEnd, msgs);
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
			case Cloud_computingPackage.SERVIDOR__TAMANO_M:
				return getTamanoM();
			case Cloud_computingPackage.SERVIDOR__SERVIDOR:
				return getServidor();
			case Cloud_computingPackage.SERVIDOR__VPCS:
				return getVpcs();
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
			case Cloud_computingPackage.SERVIDOR__TAMANO_M:
				setTamanoM((TamanoMaquina)newValue);
				return;
			case Cloud_computingPackage.SERVIDOR__SERVIDOR:
				getServidor().clear();
				getServidor().addAll((Collection<? extends Servidor>)newValue);
				return;
			case Cloud_computingPackage.SERVIDOR__VPCS:
				getVpcs().clear();
				getVpcs().addAll((Collection<? extends VPC>)newValue);
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
			case Cloud_computingPackage.SERVIDOR__TAMANO_M:
				setTamanoM(TAMANO_M_EDEFAULT);
				return;
			case Cloud_computingPackage.SERVIDOR__SERVIDOR:
				getServidor().clear();
				return;
			case Cloud_computingPackage.SERVIDOR__VPCS:
				getVpcs().clear();
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
			case Cloud_computingPackage.SERVIDOR__TAMANO_M:
				return tamanoM != TAMANO_M_EDEFAULT;
			case Cloud_computingPackage.SERVIDOR__SERVIDOR:
				return servidor != null && !servidor.isEmpty();
			case Cloud_computingPackage.SERVIDOR__VPCS:
				return vpcs != null && !vpcs.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(", TamanoM: ");
		result.append(tamanoM);
		result.append(')');
		return result.toString();
	}

} //ServidorImpl
