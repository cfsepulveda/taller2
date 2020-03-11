/**
 */
package cloud_computing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sistema Manejador</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cloud_computing.Cloud_computingPackage#getSistemaManejador()
 * @model
 * @generated
 */
public enum SistemaManejador implements Enumerator {
	/**
	 * The '<em><b>Postgre SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSTGRE_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	POSTGRE_SQL(0, "PostgreSQL", "PostgreSQL"),

	/**
	 * The '<em><b>My SQL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	MY_SQL(1, "MySQL", "MySQL"),

	/**
	 * The '<em><b>Oracle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORACLE_VALUE
	 * @generated
	 * @ordered
	 */
	ORACLE(2, "Oracle", "Oracle"),

	/**
	 * The '<em><b>SQL Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SQL_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	SQL_SERVER(3, "SQLServer", "SQLServer"),

	/**
	 * The '<em><b>No Sql</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SQL_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SQL(4, "NoSql", "NoSql"),

	/**
	 * The '<em><b>Aurora</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AURORA_VALUE
	 * @generated
	 * @ordered
	 */
	AURORA(5, "Aurora", "Aurora"),

	/**
	 * The '<em><b>Maria DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARIA_DB_VALUE
	 * @generated
	 * @ordered
	 */
	MARIA_DB(6, "MariaDB", "MariaDB"),

	/**
	 * The '<em><b>Document DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_DB_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_DB(7, "DocumentDB", "DocumentDB"),

	/**
	 * The '<em><b>Dynamo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYNAMO_VALUE
	 * @generated
	 * @ordered
	 */
	DYNAMO(8, "Dynamo", "Dynamo"),

	/**
	 * The '<em><b>Cassandra</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA_VALUE
	 * @generated
	 * @ordered
	 */
	CASSANDRA(9, "Cassandra", "Cassandra"),

	/**
	 * The '<em><b>Redis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDIS_VALUE
	 * @generated
	 * @ordered
	 */
	REDIS(10, "Redis", "Redis");

	/**
	 * The '<em><b>Postgre SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Postgre SQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSTGRE_SQL
	 * @model name="PostgreSQL"
	 * @generated
	 * @ordered
	 */
	public static final int POSTGRE_SQL_VALUE = 0;

	/**
	 * The '<em><b>My SQL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>My SQL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MY_SQL
	 * @model name="MySQL"
	 * @generated
	 * @ordered
	 */
	public static final int MY_SQL_VALUE = 1;

	/**
	 * The '<em><b>Oracle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oracle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORACLE
	 * @model name="Oracle"
	 * @generated
	 * @ordered
	 */
	public static final int ORACLE_VALUE = 2;

	/**
	 * The '<em><b>SQL Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SQL Server</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SQL_SERVER
	 * @model name="SQLServer"
	 * @generated
	 * @ordered
	 */
	public static final int SQL_SERVER_VALUE = 3;

	/**
	 * The '<em><b>No Sql</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Sql</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_SQL
	 * @model name="NoSql"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SQL_VALUE = 4;

	/**
	 * The '<em><b>Aurora</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aurora</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AURORA
	 * @model name="Aurora"
	 * @generated
	 * @ordered
	 */
	public static final int AURORA_VALUE = 5;

	/**
	 * The '<em><b>Maria DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maria DB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MARIA_DB
	 * @model name="MariaDB"
	 * @generated
	 * @ordered
	 */
	public static final int MARIA_DB_VALUE = 6;

	/**
	 * The '<em><b>Document DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Document DB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_DB
	 * @model name="DocumentDB"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_DB_VALUE = 7;

	/**
	 * The '<em><b>Dynamo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dynamo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYNAMO
	 * @model name="Dynamo"
	 * @generated
	 * @ordered
	 */
	public static final int DYNAMO_VALUE = 8;

	/**
	 * The '<em><b>Cassandra</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cassandra</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASSANDRA
	 * @model name="Cassandra"
	 * @generated
	 * @ordered
	 */
	public static final int CASSANDRA_VALUE = 9;

	/**
	 * The '<em><b>Redis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Redis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REDIS
	 * @model name="Redis"
	 * @generated
	 * @ordered
	 */
	public static final int REDIS_VALUE = 10;

	/**
	 * An array of all the '<em><b>Sistema Manejador</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SistemaManejador[] VALUES_ARRAY =
		new SistemaManejador[] {
			POSTGRE_SQL,
			MY_SQL,
			ORACLE,
			SQL_SERVER,
			NO_SQL,
			AURORA,
			MARIA_DB,
			DOCUMENT_DB,
			DYNAMO,
			CASSANDRA,
			REDIS,
		};

	/**
	 * A public read-only list of all the '<em><b>Sistema Manejador</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SistemaManejador> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sistema Manejador</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SistemaManejador get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SistemaManejador result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sistema Manejador</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SistemaManejador getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SistemaManejador result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sistema Manejador</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SistemaManejador get(int value) {
		switch (value) {
			case POSTGRE_SQL_VALUE: return POSTGRE_SQL;
			case MY_SQL_VALUE: return MY_SQL;
			case ORACLE_VALUE: return ORACLE;
			case SQL_SERVER_VALUE: return SQL_SERVER;
			case NO_SQL_VALUE: return NO_SQL;
			case AURORA_VALUE: return AURORA;
			case MARIA_DB_VALUE: return MARIA_DB;
			case DOCUMENT_DB_VALUE: return DOCUMENT_DB;
			case DYNAMO_VALUE: return DYNAMO;
			case CASSANDRA_VALUE: return CASSANDRA;
			case REDIS_VALUE: return REDIS;
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
	private SistemaManejador(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //SistemaManejador
