/**
 */
package cloud_computing.impl;

import cloud_computing.Ambiente;
import cloud_computing.AmbienteDesplegue;
import cloud_computing.Cloud_computingPackage;
import cloud_computing.Servidor;

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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cloud_computingPackage.AMBIENTE_DESPLEGUE__SERVIDORES:
				return ((InternalEList<?>)getServidores()).basicRemove(otherEnd, msgs);
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
