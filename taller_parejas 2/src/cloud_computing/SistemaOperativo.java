/**
 */
package cloud_computing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sistema Operativo</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloud_computing.Cloud_computingPackage#getSistemaOperativo()
 * @model
 * @generated
 */
public enum SistemaOperativo implements Enumerator {
	/**
	 * The '<em><b>WINDOWS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOWS(0, "WINDOWS", "WINDOWS"),

	/**
	 * The '<em><b>LINUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX_VALUE
	 * @generated
	 * @ordered
	 */
	LINUX(1, "lINUX", "lINUX"),

	/**
	 * The '<em><b>MAC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAC_VALUE
	 * @generated
	 * @ordered
	 */
	MAC(2, "MAC", "MAC");

	/**
	 * The '<em><b>WINDOWS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOWS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WINDOWS_VALUE = 0;

	/**
	 * The '<em><b>LINUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINUX
	 * @model name="lINUX"
	 * @generated
	 * @ordered
	 */
	public static final int LINUX_VALUE = 1;

	/**
	 * The '<em><b>MAC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Sistema Operativo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SistemaOperativo[] VALUES_ARRAY =
		new SistemaOperativo[] {
			WINDOWS,
			LINUX,
			MAC,
		};

	/**
	 * A public read-only list of all the '<em><b>Sistema Operativo</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SistemaOperativo> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sistema Operativo</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SistemaOperativo get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SistemaOperativo result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sistema Operativo</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SistemaOperativo getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SistemaOperativo result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sistema Operativo</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SistemaOperativo get(int value) {
		switch (value) {
			case WINDOWS_VALUE: return WINDOWS;
			case LINUX_VALUE: return LINUX;
			case MAC_VALUE: return MAC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SistemaOperativo(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SistemaOperativo
