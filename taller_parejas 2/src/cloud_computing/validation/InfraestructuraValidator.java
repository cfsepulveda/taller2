/**
 *
 * $Id$
 */
package cloud_computing.validation;

import cloud_computing.AmbienteDesplegue;
import cloud_computing.Gateway;
import cloud_computing.Login;
import cloud_computing.ProveedorServicio;
import cloud_computing.SecurityGroup;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link cloud_computing.Infraestructura}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InfraestructuraValidator {
	boolean validate();

	boolean validateLogins(Login value);
	boolean validateAmbientesdesplegue(EList<AmbienteDesplegue> value);
	boolean validateTipo(ProveedorServicio value);
	boolean validateSecuritygroups(EList<SecurityGroup> value);
	boolean validateNombreProyecto(String value);
	boolean validateGateway(EList<Gateway> value);
}
