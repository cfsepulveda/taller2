/**
 *
 * $Id$
 */
package cloud_computing.validation;


/**
 * A sample validator interface for {@link cloud_computing.Atributos}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AtributosValidator {
	boolean validate();

	boolean validateNombre(String value);
	boolean validateTipoDato(String value);
	boolean validateTipoConexion(String value);
}
