/**
 *
 * $Id$
 */
package cloud_computing.validation;

import cloud_computing.AmbienteDesplegue;
import cloud_computing.Conexion;
import cloud_computing.Gateway;
import cloud_computing.ProveedorServicio;
import cloud_computing.Rules;
import cloud_computing.SecurityGroup;
import cloud_computing.Subred;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link cloud_computing.Infraestructura}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InfraestructuraValidator {
	boolean validate();

	boolean validateConexiones(EList<Conexion> value);
	boolean validateAmbientesdesplegue(EList<AmbienteDesplegue> value);
	boolean validateGate(EList<Gateway> value);
	boolean validateTipo(ProveedorServicio value);
	boolean validateSecuritygroups(EList<SecurityGroup> value);
	boolean validateSubredes(EList<Subred> value);
	boolean validateRules(EList<Rules> value);
	boolean validateNombreProyecto(String value);
}