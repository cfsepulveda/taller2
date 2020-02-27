/**
 *
 * $Id$
 */
package cloud_computing.validation;


/**
 * A sample validator interface for {@link cloud_computing.Login}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LoginValidator {
	boolean validate();

	boolean validateNombreConexion(String value);
	boolean validateUsuario(String value);
	boolean validateContrasena(String value);
	boolean validateAccessId(String value);
	boolean validateSecret(String value);
}
