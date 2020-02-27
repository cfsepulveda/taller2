/**
 */
package cloud_computing.impl;

import cloud_computing.Ambiente;
import cloud_computing.AmbienteDesplegue;
import cloud_computing.Cloud_computingPackage;
import cloud_computing.Conexion;
import cloud_computing.Servidor;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ambiente Desplegue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.AmbienteDesplegueImpl#getTipoAmbiente <em>Tipo Ambiente</em>}</li>
 *   <li>{@link cloud_computing.impl.AmbienteDesplegueImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link cloud_computing.impl.AmbienteDesplegueImpl#getServidores <em>Servidores</em>}</li>
 *   <li>{@link cloud_computing.impl.AmbienteDesplegueImpl#getConexion <em>Conexion</em>}</li>
 *   <li>{@link cloud_computing.impl.AmbienteDesplegueImpl#getVpc <em>Vpc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmbienteDesplegueImpl extends MinimalEObjectImpl.Container implements AmbienteDesplegue {
	/**
	 * The default value of the '{@link #getTipoAmbiente() <em>Tipo Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAmbiente()
	 * @generated
	 * @ordered
	 */
	protected static final Ambiente TIPO_AMBIENTE_EDEFAULT = Ambiente.DESARROLLO;

	/**
	 * The cached value of the '{@link #getTipoAmbiente() <em>Tipo Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoAmbiente()
	 * @generated
	 * @ordered
	 */
	protected Ambiente tipoAmbiente = TIPO_AMBIENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServidores() <em>Servidores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServidores()
	 * @generated
	 * @ordered
	 */
	protected EList<Servidor> servidores;

	/**
	 * The cached value of the '{@link #getConexion() <em>Conexion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConexion()
	 * @generated
	 * @ordered
	 */
	protected Conexion conexion;

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
	protected AmbienteDesplegueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cloud_computingPackage.Literals.AMBIENTE_DESPLEGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ambiente getTipoAmbiente() {
		return tipoAmbiente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTipoAmbiente(Ambiente newTipoAmbiente) {
		Ambiente oldTipoAmbiente = tipoAmbiente;
		tipoAmbiente = newTipoAmbiente == null ? TIPO_AMBIENTE_EDEFAULT : newTipoAmbiente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.AMBIENTE_DESPLEGUE__TIPO_AMBIENTE, oldTipoAmbiente, tipoAmbiente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.AMBIENTE_DESPLEGUE__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Servidor> getServidores() {
		if (servidores == null) {
			servidores = new EObjectContainmentEList<Servidor>(Servidor.class, this, Cloud_computingPackage.AMBIENTE_DESPLEGUE__SERVIDORES);
		}
		return servidores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conexion getConexion() {
		if (conexion != null && conexion.eIsProxy()) {
			InternalEObject oldConexion = (InternalEObject)conexion;
			conexion = (Conexion)eResolveProxy(oldConexion);
			if (conexion != oldConexion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cloud_computingPackage.AMBIENTE_DESPLEGUE__CONEXION, oldConexion, conexion));
			}
		}
		return conexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conexion basicGetConexion() {
		return conexion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConexion(Conexion newConexion) {
		Conexion oldConexion = conexion;
		conexion = newConexion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.AMBIENTE_DESPLEGUE__CONEXION, oldConexion, conexion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VPC> getVpc() {
		if (vpc == null) {
			vpc = new EObjectContainmentEList<VPC>(VPC.class, this, Cloud_computingPackage.AMBIENTE_DESPLEGUE__VPC);
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
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__SERVIDORES:
				return ((InternalEList<?>)getServidores()).basicRemove(otherEnd, msgs);
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__VPC:
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
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__TIPO_AMBIENTE:
				return getTipoAmbiente();
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__ALIAS:
				return getAlias();
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__SERVIDORES:
				return getServidores();
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__CONEXION:
				if (resolve) return getConexion();
				return basicGetConexion();
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__VPC:
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
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__TIPO_AMBIENTE:
				setTipoAmbiente((Ambiente)newValue);
				return;
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__ALIAS:
				setAlias((String)newValue);
				return;
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__SERVIDORES:
				getServidores().clear();
				getServidores().addAll((Collection<? extends Servidor>)newValue);
				return;
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__CONEXION:
				setConexion((Conexion)newValue);
				return;
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__VPC:
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
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__TIPO_AMBIENTE:
				setTipoAmbiente(TIPO_AMBIENTE_EDEFAULT);
				return;
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__SERVIDORES:
				getServidores().clear();
				return;
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__CONEXION:
				setConexion((Conexion)null);
				return;
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__VPC:
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
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__TIPO_AMBIENTE:
				return tipoAmbiente != TIPO_AMBIENTE_EDEFAULT;
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__SERVIDORES:
				return servidores != null && !servidores.isEmpty();
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__CONEXION:
				return conexion != null;
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__VPC:
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (tipoAmbiente: ");
		result.append(tipoAmbiente);
		result.append(", alias: ");
		result.append(alias);
		result.append(')');
		return result.toString();
	}

} //AmbienteDesplegueImpl
