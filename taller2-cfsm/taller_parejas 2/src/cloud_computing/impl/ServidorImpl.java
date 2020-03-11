/**
 */
package cloud_computing.impl;

import cloud_computing.Cloud_computingPackage;
import cloud_computing.SecurityGroup;
import cloud_computing.Servidor;
import cloud_computing.Subred;
import cloud_computing.TamanoMaquina;
import cloud_computing.VPC;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link cloud_computing.impl.ServidorImpl#getVpc <em>Vpc</em>}</li>
 *   <li>{@link cloud_computing.impl.ServidorImpl#getSubred <em>Subred</em>}</li>
 *   <li>{@link cloud_computing.impl.ServidorImpl#getServersecuritygroup <em>Serversecuritygroup</em>}</li>
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
	 * The cached value of the '{@link #getVpc() <em>Vpc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc()
	 * @generated
	 * @ordered
	 */
	protected VPC vpc;

	/**
	 * The cached value of the '{@link #getSubred() <em>Subred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubred()
	 * @generated
	 * @ordered
	 */
	protected Subred subred;

	/**
	 * The cached value of the '{@link #getServersecuritygroup() <em>Serversecuritygroup</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServersecuritygroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> serversecuritygroup;

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
	public VPC getVpc() {
		if (vpc != null && vpc.eIsProxy()) {
			InternalEObject oldVpc = (InternalEObject)vpc;
			vpc = (VPC)eResolveProxy(oldVpc);
			if (vpc != oldVpc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cloud_computingPackage.SERVIDOR__VPC, oldVpc, vpc));
			}
		}
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPC basicGetVpc() {
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVpc(VPC newVpc) {
		VPC oldVpc = vpc;
		vpc = newVpc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SERVIDOR__VPC, oldVpc, vpc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subred getSubred() {
		if (subred != null && subred.eIsProxy()) {
			InternalEObject oldSubred = (InternalEObject)subred;
			subred = (Subred)eResolveProxy(oldSubred);
			if (subred != oldSubred) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cloud_computingPackage.SERVIDOR__SUBRED, oldSubred, subred));
			}
		}
		return subred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subred basicGetSubred() {
		return subred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubred(Subred newSubred) {
		Subred oldSubred = subred;
		subred = newSubred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SERVIDOR__SUBRED, oldSubred, subred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityGroup> getServersecuritygroup() {
		if (serversecuritygroup == null) {
			serversecuritygroup = new EObjectResolvingEList<SecurityGroup>(SecurityGroup.class, this, Cloud_computingPackage.SERVIDOR__SERVERSECURITYGROUP);
		}
		return serversecuritygroup;
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
			case Cloud_computingPackage.SERVIDOR__VPC:
				if (resolve) return getVpc();
				return basicGetVpc();
			case Cloud_computingPackage.SERVIDOR__SUBRED:
				if (resolve) return getSubred();
				return basicGetSubred();
			case Cloud_computingPackage.SERVIDOR__SERVERSECURITYGROUP:
				return getServersecuritygroup();
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
			case Cloud_computingPackage.SERVIDOR__VPC:
				setVpc((VPC)newValue);
				return;
			case Cloud_computingPackage.SERVIDOR__SUBRED:
				setSubred((Subred)newValue);
				return;
			case Cloud_computingPackage.SERVIDOR__SERVERSECURITYGROUP:
				getServersecuritygroup().clear();
				getServersecuritygroup().addAll((Collection<? extends SecurityGroup>)newValue);
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
			case Cloud_computingPackage.SERVIDOR__VPC:
				setVpc((VPC)null);
				return;
			case Cloud_computingPackage.SERVIDOR__SUBRED:
				setSubred((Subred)null);
				return;
			case Cloud_computingPackage.SERVIDOR__SERVERSECURITYGROUP:
				getServersecuritygroup().clear();
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
			case Cloud_computingPackage.SERVIDOR__VPC:
				return vpc != null;
			case Cloud_computingPackage.SERVIDOR__SUBRED:
				return subred != null;
			case Cloud_computingPackage.SERVIDOR__SERVERSECURITYGROUP:
				return serversecuritygroup != null && !serversecuritygroup.isEmpty();
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
