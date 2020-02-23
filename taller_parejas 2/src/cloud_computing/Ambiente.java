/**
 */
package cloud_computing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ambiente</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloud_computing.Cloud_computingPackage#getAmbiente()
 * @model
 * @generated
 */
public enum Ambiente implements Enumerator {
	/**
	 * The '<em><b>DESARROLLO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESARROLLO_VALUE
	 * @generated
	 * @ordered
	 */
	DESARROLLO(0, "DESARROLLO", "DESARROLLO"),

	/**
	 * The '<em><b>PRUEBAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRUEBAS_VALUE
	 * @generated
	 * @ordered
	 */
	PRUEBAS(1, "PRUEBAS", "PRUEBAS"),

	/**
	 * The '<em><b>QA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QA_VALUE
	 * @generated
	 * @ordered
	 */
	QA(2, "QA", "QA"),

	/**
	 * The '<em><b>PRODUCCION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCCION_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCCION(3, "PRODUCCION", "PRODUCCION");

	/**
	 * The '<em><b>DESARROLLO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESARROLLO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DESARROLLO_VALUE = 0;

	/**
	 * The '<em><b>PRUEBAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRUEBAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRUEBAS_VALUE = 1;

	/**
	 * The '<em><b>QA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QA_VALUE = 2;

	/**
	 * The '<em><b>PRODUCCION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCCION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCCION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Ambiente</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Ambiente[] VALUES_ARRAY =
		new Ambiente[] {
			DESARROLLO,
			PRUEBAS,
			QA,
			PRODUCCION,
		};

	/**
	 * A public read-only list of all the '<em><b>Ambiente</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Ambiente> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ambiente</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ambiente get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ambiente result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ambiente</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ambiente getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Ambiente result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ambiente</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Ambiente get(int value) {
		switch (value) {
			case DESARROLLO_VALUE: return DESARROLLO;
			case PRUEBAS_VALUE: return PRUEBAS;
			case QA_VALUE: return QA;
			case PRODUCCION_VALUE: return PRODUCCION;
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
	private Ambiente(int value, String name, String literal) {
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
	
} //Ambiente
