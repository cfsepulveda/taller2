/**
 */
package cloud_computing.impl;

import cloud_computing.AmbienteDesplegue;
import cloud_computing.Cloud_computingPackage;
import cloud_computing.Conexion;
import cloud_computing.Gateway;
import cloud_computing.Proveedor;
import cloud_computing.ProveedorServicio;
import cloud_computing.Rules;
import cloud_computing.SecurityGroup;
import cloud_computing.Subred;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proveedor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.ProveedorImpl#getConexion <em>Conexion</em>}</li>
 *   <li>{@link cloud_computing.impl.ProveedorImpl#getAmbientedesplegue <em>Ambientedesplegue</em>}</li>
 *   <li>{@link cloud_computing.impl.ProveedorImpl#getVpc <em>Vpc</em>}</li>
 *   <li>{@link cloud_computing.impl.ProveedorImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link cloud_computing.impl.ProveedorImpl#getSecuritygroup <em>Securitygroup</em>}</li>
 *   <li>{@link cloud_computing.impl.ProveedorImpl#getSubred <em>Subred</em>}</li>
 *   <li>{@link cloud_computing.impl.ProveedorImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProveedorImpl extends MinimalEObjectImpl.Container implements Proveedor {
	/**
	 * The cached value of the '{@link #getConexion() <em>Conexion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConexion()
	 * @generated
	 * @ordered
	 */
	protected EList<Conexion> conexion;

	/**
	 * The cached value of the '{@link #getAmbientedesplegue() <em>Ambientedesplegue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientedesplegue()
	 * @generated
	 * @ordered
	 */
	protected EList<AmbienteDesplegue> ambientedesplegue;

	/**
	 * The cached value of the '{@link #getVpc() <em>Vpc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc()
	 * @generated
	 * @ordered
	 */
	protected EList<Gateway> vpc;

	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final ProveedorServicio NOMBRE_EDEFAULT = ProveedorServicio.AWS;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected ProveedorServicio nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecuritygroup() <em>Securitygroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritygroup()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> securitygroup;

	/**
	 * The cached value of the '{@link #getSubred() <em>Subred</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubred()
	 * @generated
	 * @ordered
	 */
	protected EList<Subred> subred;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rules> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProveedorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cloud_computingPackage.Literals.PROVEEDOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conexion> getConexion() {
		if (conexion == null) {
			conexion = new EObjectContainmentEList<Conexion>(Conexion.class, this, Cloud_computingPackage.PROVEEDOR__CONEXION);
		}
		return conexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AmbienteDesplegue> getAmbientedesplegue() {
		if (ambientedesplegue == null) {
			ambientedesplegue = new EObjectContainmentEList<AmbienteDesplegue>(AmbienteDesplegue.class, this, Cloud_computingPackage.PROVEEDOR__AMBIENTEDESPLEGUE);
		}
		return ambientedesplegue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gateway> getVpc() {
		if (vpc == null) {
			vpc = new EObjectContainmentEList<Gateway>(Gateway.class, this, Cloud_computingPackage.PROVEEDOR__VPC);
		}
		return vpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProveedorServicio getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(ProveedorServicio newNombre) {
		ProveedorServicio oldNombre = nombre;
		nombre = newNombre == null ? NOMBRE_EDEFAULT : newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.PROVEEDOR__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGroup> getSecuritygroup() {
		if (securitygroup == null) {
			securitygroup = new EObjectContainmentEList<SecurityGroup>(SecurityGroup.class, this, Cloud_computingPackage.PROVEEDOR__SECURITYGROUP);
		}
		return securitygroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subred> getSubred() {
		if (subred == null) {
			subred = new EObjectContainmentEList<Subred>(Subred.class, this, Cloud_computingPackage.PROVEEDOR__SUBRED);
		}
		return subred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rules> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rules>(Rules.class, this, Cloud_computingPackage.PROVEEDOR__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cloud_computingPackage.PROVEEDOR__CONEXION:
				return ((InternalEList<?>)getConexion()).basicRemove(otherEnd, msgs);
			case Cloud_computingPackage.PROVEEDOR__AMBIENTEDESPLEGUE:
				return ((InternalEList<?>)getAmbientedesplegue()).basicRemove(otherEnd, msgs);
			case Cloud_computingPackage.PROVEEDOR__VPC:
				return ((InternalEList<?>)getVpc()).basicRemove(otherEnd, msgs);
			case Cloud_computingPackage.PROVEEDOR__SECURITYGROUP:
				return ((InternalEList<?>)getSecuritygroup()).basicRemove(otherEnd, msgs);
			case Cloud_computingPackage.PROVEEDOR__SUBRED:
				return ((InternalEList<?>)getSubred()).basicRemove(otherEnd, msgs);
			case Cloud_computingPackage.PROVEEDOR__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case Cloud_computingPackage.PROVEEDOR__CONEXION:
				return getConexion();
			case Cloud_computingPackage.PROVEEDOR__AMBIENTEDESPLEGUE:
				return getAmbientedesplegue();
			case Cloud_computingPackage.PROVEEDOR__VPC:
				return getVpc();
			case Cloud_computingPackage.PROVEEDOR__NOMBRE:
				return getNombre();
			case Cloud_computingPackage.PROVEEDOR__SECURITYGROUP:
				return getSecuritygroup();
			case Cloud_computingPackage.PROVEEDOR__SUBRED:
				return getSubred();
			case Cloud_computingPackage.PROVEEDOR__RULES:
				return getRules();
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
			case Cloud_computingPackage.PROVEEDOR__CONEXION:
				getConexion().clear();
				getConexion().addAll((Collection<? extends Conexion>)newValue);
				return;
			case Cloud_computingPackage.PROVEEDOR__AMBIENTEDESPLEGUE:
				getAmbientedesplegue().clear();
				getAmbientedesplegue().addAll((Collection<? extends AmbienteDesplegue>)newValue);
				return;
			case Cloud_computingPackage.PROVEEDOR__VPC:
				getVpc().clear();
				getVpc().addAll((Collection<? extends Gateway>)newValue);
				return;
			case Cloud_computingPackage.PROVEEDOR__NOMBRE:
				setNombre((ProveedorServicio)newValue);
				return;
			case Cloud_computingPackage.PROVEEDOR__SECURITYGROUP:
				getSecuritygroup().clear();
				getSecuritygroup().addAll((Collection<? extends SecurityGroup>)newValue);
				return;
			case Cloud_computingPackage.PROVEEDOR__SUBRED:
				getSubred().clear();
				getSubred().addAll((Collection<? extends Subred>)newValue);
				return;
			case Cloud_computingPackage.PROVEEDOR__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rules>)newValue);
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
			case Cloud_computingPackage.PROVEEDOR__CONEXION:
				getConexion().clear();
				return;
			case Cloud_computingPackage.PROVEEDOR__AMBIENTEDESPLEGUE:
				getAmbientedesplegue().clear();
				return;
			case Cloud_computingPackage.PROVEEDOR__VPC:
				getVpc().clear();
				return;
			case Cloud_computingPackage.PROVEEDOR__NOMBRE:
				setNombre(NOMBRE_EDEFAULT);
				return;
			case Cloud_computingPackage.PROVEEDOR__SECURITYGROUP:
				getSecuritygroup().clear();
				return;
			case Cloud_computingPackage.PROVEEDOR__SUBRED:
				getSubred().clear();
				return;
			case Cloud_computingPackage.PROVEEDOR__RULES:
				getRules().clear();
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
			case Cloud_computingPackage.PROVEEDOR__CONEXION:
				return conexion != null && !conexion.isEmpty();
			case Cloud_computingPackage.PROVEEDOR__AMBIENTEDESPLEGUE:
				return ambientedesplegue != null && !ambientedesplegue.isEmpty();
			case Cloud_computingPackage.PROVEEDOR__VPC:
				return vpc != null && !vpc.isEmpty();
			case Cloud_computingPackage.PROVEEDOR__NOMBRE:
				return nombre != NOMBRE_EDEFAULT;
			case Cloud_computingPackage.PROVEEDOR__SECURITYGROUP:
				return securitygroup != null && !securitygroup.isEmpty();
			case Cloud_computingPackage.PROVEEDOR__SUBRED:
				return subred != null && !subred.isEmpty();
			case Cloud_computingPackage.PROVEEDOR__RULES:
				return rules != null && !rules.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ProveedorImpl
