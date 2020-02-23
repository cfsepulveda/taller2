/**
 *
 * $Id$
 */
package cloud_computing.validation;

import cloud_computing.SistemaManejador;
import cloud_computing.TipoBaseDeDatos;

/**
 * A sample validator interface for {@link cloud_computing.ServidorBaseDeDatos}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ServidorBaseDeDatosValidator {
	boolean validate();

	boolean validateTipo(TipoBaseDeDatos value);
	boolean validateSistemaManejador(SistemaManejador value);
}
