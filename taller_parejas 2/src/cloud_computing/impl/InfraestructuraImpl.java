/**
 */
package cloud_computing.impl;

import cloud_computing.AmbienteDesplegue;
import cloud_computing.Cloud_computingPackage;
import cloud_computing.Gateway;
import cloud_computing.Infraestructura;
import cloud_computing.Login;
import cloud_computing.ProveedorServicio;
import cloud_computing.Rules;
import cloud_computing.SecurityGroup;

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
 * An implementation of the model object '<em><b>Infraestructura</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.InfraestructuraImpl#getLogins <em>Logins</em>}</li>
 *   <li>{@link cloud_computing.impl.InfraestructuraImpl#getAmbientesdesplegue <em>Ambientesdesplegue</em>}</li>
 *   <li>{@link cloud_computing.impl.InfraestructuraImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link cloud_computing.impl.InfraestructuraImpl#getSecuritygroups <em>Securitygroups</em>}</li>
 *   <li>{@link cloud_computing.impl.InfraestructuraImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link cloud_computing.impl.InfraestructuraImpl#getNombreProyecto <em>Nombre Proyecto</em>}</li>
 *   <li>{@link cloud_computing.impl.InfraestructuraImpl#getGateway <em>Gateway</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfraestructuraImpl extends MinimalEObjectImpl.Container implements Infraestructura {
	/**
	 * The cached value of the '{@link #getLogins() <em>Logins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogins()
	 * @generated
	 * @ordered
	 */
	protected Login logins;

	/**
	 * The cached value of the '{@link #getAmbientesdesplegue() <em>Ambientesdesplegue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbientesdesplegue()
	 * @generated
	 * @ordered
	 */
	protected EList<AmbienteDesplegue> ambientesdesplegue;

	/**
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final ProveedorServicio TIPO_EDEFAULT = ProveedorServicio.AWS;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected ProveedorServicio tipo = TIPO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecuritygroups() <em>Securitygroups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritygroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> securitygroups;

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
	 * The default value of the '{@link #getNombreProyecto() <em>Nombre Proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreProyecto()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_PROYECTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombreProyecto() <em>Nombre Proyecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreProyecto()
	 * @generated
	 * @ordered
	 */
	protected String nombreProyecto = NOMBRE_PROYECTO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected EList<Gateway> gateway;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfraestructuraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cloud_computingPackage.Literals.INFRAESTRUCTURA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Login getLogins() {
		return logins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogins(Login newLogins, NotificationChain msgs) {
		Login oldLogins = logins;
		logins = newLogins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.INFRAESTRUCTURA__LOGINS, oldLogins, newLogins);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogins(Login newLogins) {
		if (newLogins != logins) {
			NotificationChain msgs = null;
			if (logins != null)
				msgs = ((InternalEObject)logins).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cloud_computingPackage.INFRAESTRUCTURA__LOGINS, null, msgs);
			if (newLogins != null)
				msgs = ((InternalEObject)newLogins).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cloud_computingPackage.INFRAESTRUCTURA__LOGINS, null, msgs);
			msgs = basicSetLogins(newLogins, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.INFRAESTRUCTURA__LOGINS, newLogins, newLogins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AmbienteDesplegue> getAmbientesdesplegue() {
		if (ambientesdesplegue == null) {
			ambientesdesplegue = new EObjectContainmentEList<AmbienteDesplegue>(AmbienteDesplegue.class, this, Cloud_computingPackage.INFRAESTRUCTURA__AMBIENTESDESPLEGUE);
		}
		return ambientesdesplegue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProveedorServicio getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipo(ProveedorServicio newTipo) {
		ProveedorServicio oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.INFRAESTRUCTURA__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityGroup> getSecuritygroups() {
		if (securitygroups == null) {
			securitygroups = new EObjectContainmentEList<SecurityGroup>(SecurityGroup.class, this, Cloud_computingPackage.INFRAESTRUCTURA__SECURITYGROUPS);
		}
		return securitygroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rules> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rules>(Rules.class, this, Cloud_computingPackage.INFRAESTRUCTURA__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombreProyecto() {
		return nombreProyecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombreProyecto(String newNombreProyecto) {
		String oldNombreProyecto = nombreProyecto;
		nombreProyecto = newNombreProyecto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.INFRAESTRUCTURA__NOMBRE_PROYECTO, oldNombreProyecto, nombreProyecto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gateway> getGateway() {
		if (gateway == null) {
			gateway = new EObjectContainmentEList<Gateway>(Gateway.class, this, Cloud_computingPackage.INFRAESTRUCTURA__GATEWAY);
		}
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cloud_computingPackage.INFRAESTRUCTURA__LOGINS:
				return basicSetLogins(null, msgs);
			case Cloud_computingPackage.INFRAESTRUCTURA__AMBIENTESDESPLEGUE:
				return ((InternalEList<?>)getAmbientesdesplegue()).basicRemove(otherEnd, msgs);
			case Cloud_computingPackage.INFRAESTRUCTURA__SECURITYGROUPS:
				return ((InternalEList<?>)getSecuritygroups()).basicRemove(otherEnd, msgs);
			case Cloud_computingPackage.INFRAESTRUCTURA__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case Cloud_computingPackage.INFRAESTRUCTURA__GATEWAY:
				return ((InternalEList<?>)getGateway()).basicRemove(otherEnd, msgs);
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
			case Cloud_computingPackage.INFRAESTRUCTURA__LOGINS:
				return getLogins();
			case Cloud_computingPackage.INFRAESTRUCTURA__AMBIENTESDESPLEGUE:
				return getAmbientesdesplegue();
			case Cloud_computingPackage.INFRAESTRUCTURA__TIPO:
				return getTipo();
			case Cloud_computingPackage.INFRAESTRUCTURA__SECURITYGROUPS:
				return getSecuritygroups();
			case Cloud_computingPackage.INFRAESTRUCTURA__RULES:
				return getRules();
			case Cloud_computingPackage.INFRAESTRUCTURA__NOMBRE_PROYECTO:
				return getNombreProyecto();
			case Cloud_computingPackage.INFRAESTRUCTURA__GATEWAY:
				return getGateway();
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
			case Cloud_computingPackage.INFRAESTRUCTURA__LOGINS:
				setLogins((Login)newValue);
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__AMBIENTESDESPLEGUE:
				getAmbientesdesplegue().clear();
				getAmbientesdesplegue().addAll((Collection<? extends AmbienteDesplegue>)newValue);
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__TIPO:
				setTipo((ProveedorServicio)newValue);
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__SECURITYGROUPS:
				getSecuritygroups().clear();
				getSecuritygroups().addAll((Collection<? extends SecurityGroup>)newValue);
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rules>)newValue);
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__NOMBRE_PROYECTO:
				setNombreProyecto((String)newValue);
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__GATEWAY:
				getGateway().clear();
				getGateway().addAll((Collection<? extends Gateway>)newValue);
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
			case Cloud_computingPackage.INFRAESTRUCTURA__LOGINS:
				setLogins((Login)null);
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__AMBIENTESDESPLEGUE:
				getAmbientesdesplegue().clear();
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__SECURITYGROUPS:
				getSecuritygroups().clear();
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__RULES:
				getRules().clear();
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__NOMBRE_PROYECTO:
				setNombreProyecto(NOMBRE_PROYECTO_EDEFAULT);
				return;
			case Cloud_computingPackage.INFRAESTRUCTURA__GATEWAY:
				getGateway().clear();
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
			case Cloud_computingPackage.INFRAESTRUCTURA__LOGINS:
				return logins != null;
			case Cloud_computingPackage.INFRAESTRUCTURA__AMBIENTESDESPLEGUE:
				return ambientesdesplegue != null && !ambientesdesplegue.isEmpty();
			case Cloud_computingPackage.INFRAESTRUCTURA__TIPO:
				return tipo != TIPO_EDEFAULT;
			case Cloud_computingPackage.INFRAESTRUCTURA__SECURITYGROUPS:
				return securitygroups != null && !securitygroups.isEmpty();
			case Cloud_computingPackage.INFRAESTRUCTURA__RULES:
				return rules != null && !rules.isEmpty();
			case Cloud_computingPackage.INFRAESTRUCTURA__NOMBRE_PROYECTO:
				return NOMBRE_PROYECTO_EDEFAULT == null ? nombreProyecto != null : !NOMBRE_PROYECTO_EDEFAULT.equals(nombreProyecto);
			case Cloud_computingPackage.INFRAESTRUCTURA__GATEWAY:
				return gateway != null && !gateway.isEmpty();
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
		result.append(" (tipo: ");
		result.append(tipo);
		result.append(", nombreProyecto: ");
		result.append(nombreProyecto);
		result.append(')');
		return result.toString();
	}

} //InfraestructuraImpl
