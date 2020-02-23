/**
 */
package cloud_computing.impl;

import cloud_computing.Cloud_computingPackage;
import cloud_computing.Subred;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subred</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloud_computing.impl.SubredImpl#getName <em>Name</em>}</li>
 *   <li>{@link cloud_computing.impl.SubredImpl#getCidr <em>Cidr</em>}</li>
 *   <li>{@link cloud_computing.impl.SubredImpl#getAz <em>Az</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubredImpl extends MinimalEObjectImpl.Container implements Subred {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidr() <em>Cidr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr()
	 * @generated
	 * @ordered
	 */
	protected String cidr = CIDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAz() <em>Az</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAz()
	 * @generated
	 * @ordered
	 */
	protected static final String AZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAz() <em>Az</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAz()
	 * @generated
	 * @ordered
	 */
	protected String az = AZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cloud_computingPackage.Literals.SUBRED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SUBRED__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCidr() {
		return cidr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCidr(String newCidr) {
		String oldCidr = cidr;
		cidr = newCidr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SUBRED__CIDR, oldCidr, cidr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAz() {
		return az;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAz(String newAz) {
		String oldAz = az;
		az = newAz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cloud_computingPackage.SUBRED__AZ, oldAz, az));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cloud_computingPackage.SUBRED__NAME:
				return getName();
			case Cloud_computingPackage.SUBRED__CIDR:
				return getCidr();
			case Cloud_computingPackage.SUBRED__AZ:
				return getAz();
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
			case Cloud_computingPackage.SUBRED__NAME:
				setName((String)newValue);
				return;
			case Cloud_computingPackage.SUBRED__CIDR:
				setCidr((String)newValue);
				return;
			case Cloud_computingPackage.SUBRED__AZ:
				setAz((String)newValue);
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
			case Cloud_computingPackage.SUBRED__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Cloud_computingPackage.SUBRED__CIDR:
				setCidr(CIDR_EDEFAULT);
				return;
			case Cloud_computingPackage.SUBRED__AZ:
				setAz(AZ_EDEFAULT);
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
			case Cloud_computingPackage.SUBRED__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Cloud_computingPackage.SUBRED__CIDR:
				return CIDR_EDEFAULT == null ? cidr != null : !CIDR_EDEFAULT.equals(cidr);
			case Cloud_computingPackage.SUBRED__AZ:
				return AZ_EDEFAULT == null ? az != null : !AZ_EDEFAULT.equals(az);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", cidr: ");
		result.append(cidr);
		result.append(", az: ");
		result.append(az);
		result.append(')');
		return result.toString();
	}

} //SubredImpl
