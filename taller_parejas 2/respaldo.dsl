// automatically generated by Xtext
grammar org.xtext.example.mydsl.MyDsl with org.eclipse.xtext.common.Terminals

import "https://uniandes.edu.co/cloud_computing"
import "http://www.eclipse.org/emf/2002/Ecore" as ecore

Infraestructura returns Infraestructura:
	{Infraestructura}
	'Infraestructura' nombreProyecto=EString
	OPEN_BRACE
	('tipo' EQUALS tipo=ProveedorServicio) SEMI_COLON
	('conexion' EQUALS conexiones+=Conexion) SEMI_COLON
	('ambientesdespliegue' EQUALS '[' ambientesdesplegue+=AmbienteDesplegue ("," ambientesdesplegue+=AmbienteDesplegue)*
	']')?

	//		('nombre' nombre=ProveedorServicio)?
	//		('conexiones' OPEN_BRACE conexiones+=Conexion ( "," conexiones+=Conexion)* CLOSE_BRACE )?
	//		('ambientesdesplegue' OPEN_BRACE ambientesdesplegue+=AmbienteDesplegue ( "," ambientesdesplegue+=AmbienteDesplegue)* CLOSE_BRACE )?
	//		('gate' OPEN_BRACE gate+=Gateway ( "," gate+=Gateway)* CLOSE_BRACE )?
	//		('securitygroups' OPEN_BRACE securitygroups+=SecurityGroup ( "," securitygroups+=SecurityGroup)* CLOSE_BRACE )?
	//		('subredes' OPEN_BRACE subredes+=Subred ( "," subredes+=Subred)* CLOSE_BRACE )?
	//		('rules' OPEN_BRACE rules+=Rules ( "," rules+=Rules)* CLOSE_BRACE )?
	CLOSE_BRACE;

Servidor returns Servidor:
	ServidorAplicacion | ServidorBaseDeDatos | ServidorAlmacenamiento;
	//
//
EString returns ecore::EString:
	STRING | ID;
	//
//Proveedor returns Proveedor:
//	{Proveedor}
//	'Proveedor'
//	OPEN_BRACE
//		('nombre' nombre=ProveedorServicio)?
//		('conexiones' OPEN_BRACE conexiones+=Conexion ( "," conexiones+=Conexion)* CLOSE_BRACE )?
//		('ambientesdesplegue' OPEN_BRACE ambientesdesplegue+=AmbienteDesplegue ( "," ambientesdesplegue+=AmbienteDesplegue)* CLOSE_BRACE )?
//		('gate' OPEN_BRACE gate+=Gateway ( "," gate+=Gateway)* CLOSE_BRACE )?
//		('securitygroups' OPEN_BRACE securitygroups+=SecurityGroup ( "," securitygroups+=SecurityGroup)* CLOSE_BRACE )?
//		('subredes' OPEN_BRACE subredes+=Subred ( "," subredes+=Subred)* CLOSE_BRACE )?
//		('rules' OPEN_BRACE rules+=Rules ( "," rules+=Rules)* CLOSE_BRACE )?
//	CLOSE_BRACE;
//
Conexion returns Conexion:
	{Conexion}
	OPEN_BRACE
	('nombreConexion' EQUALS nombreConexion=EString SEMI_COLON)?
	('usuario' EQUALS usuario=EString SEMI_COLON)?
	('contrasena' EQUALS contrasena=EString SEMI_COLON)?
	('accessId' EQUALS accessId=EString SEMI_COLON)?
	('secret' EQUALS secret=EString SEMI_COLON)?
	CLOSE_BRACE;

AmbienteDesplegue returns AmbienteDesplegue:
	{AmbienteDesplegue}
	OPEN_BRACE
	('alias' EQUALS alias=EString)? SEMI_COLON
	('nombre' EQUALS tipoAmbiente=Ambiente) SEMI_COLON
	('servidores' EQUALS '[' servidores+=Servidor ("," servidores+=Servidor)* ']') SEMI_COLON
	CLOSE_BRACE;

	//
//Gateway returns Gateway:
//	{Gateway}
//	'Gateway'
//	name=EString
//	OPEN_BRACE
//		('vpc' OPEN_BRACE vpc+=VPC ( "," vpc+=VPC)* CLOSE_BRACE )?
//	CLOSE_BRACE;
//
enum ProveedorServicio returns ProveedorServicio:
	AWS='AWS' | GCP='GCP';
	//
//SecurityGroup returns SecurityGroup:
//	{SecurityGroup}
//	'SecurityGroup'
//	name=EString
//	OPEN_BRACE
//		('description' description=EString)?
//		('rulesSG' OPEN_BRACE rulesSG+=Rules ( "," rulesSG+=Rules)* CLOSE_BRACE )?
//	CLOSE_BRACE;
//
//Subred returns Subred:
//	{Subred}
//	'Subred'
//	name=EString
//	OPEN_BRACE
//		('cidr' cidr=EString)?
//		('az' az=EString)?
//	CLOSE_BRACE;
//
//Rules returns Rules:
//	{Rules}
//	'Rules'
//	OPEN_BRACE
//		('type' type=EString)?
//		('protocol' protocol=EString)?
//		('portRange' portRange=EString)?
//		('Source' Source=EString)?
//		('description' description=EString)?
//	CLOSE_BRACE;
//
VPC returns VPC:
	{VPC}
	'VPC'
	name=EString;

ServidorAplicacion returns ServidorAplicacion:
	{ServidorAplicacion}
	'servidorAplicacion' EQUALS
	OPEN_BRACE
	('nombre' EQUALS nombre=EString) SEMI_COLON
	('dimension' EQUALS TamanoM=TamanoMaquina) SEMI_COLON
	('os' EQUALS sistemaO=SistemaOperativo) SEMI_COLON
	//		('servidor' EQUALS OPEN_PARENTHESIS servidor+=[Servidor|EString] ( "," servidor+=[Servidor|EString])* CLOSE_PARENTHESIS )?SEMI_COLON
	//		('vpcs' OPEN_BRACE vpcs+=VPC ( "," vpcs+=VPC)* CLOSE_BRACE )?SEMI_COLON
	CLOSE_BRACE;

ServidorBaseDeDatos returns ServidorBaseDeDatos:
	{ServidorBaseDeDatos}
	'servidorBaseDeDatos' EQUALS
	OPEN_BRACE
	('nombre' EQUALS nombre=EString)? SEMI_COLON
	('dimension' EQUALS TamanoM=TamanoMaquina) SEMI_COLON
	('tipo' EQUALS sistemaManejador=SistemaManejador) SEMI_COLON
	//('servidor' EQUALS OPEN_PARENTHESIS servidor+=[Servidor|EString] ("," servidor+=[Servidor|EString])* CLOSE_PARENTHESIS)? SEMI_COLON
	//('vpcs' OPEN_BRACE vpcs+=VPC ( "," vpcs+=VPC)* CLOSE_BRACE )?
	CLOSE_BRACE;

ServidorAlmacenamiento returns ServidorAlmacenamiento:
	{ServidorAlmacenamiento}
	'servidorAlmacenamiento' EQUALS
	OPEN_BRACE
	('nombre' EQUALS nombre=EString)? SEMI_COLON
	('dimension' EQUALS TamanoM=TamanoMaquina)? SEMI_COLON
	('gigas' EQUALS tamanoInicial=EString)? SEMI_COLON
	//('servidor' EQUALS OPEN_PARENTHESIS servidor+=[Servidor|EString] ("," servidor+=[Servidor|EString])*CLOSE_PARENTHESIS)? SEMI_COLON
	//('vpcs' OPEN_BRACE vpcs+=VPC ( "," vpcs+=VPC)* CLOSE_BRACE )?
	CLOSE_BRACE;

enum Ambiente returns Ambiente:
	DESARROLLO='DESARROLLO' | PRUEBAS='PRUEBAS' | QA='QA' | PRODUCCION='PRODUCCION';

enum TamanoMaquina returns TamanoMaquina:
	MICRO='MICRO' | SMALL='SMALL' | MEDIUM='MEDIUM' | LARGE='LARGE';

enum SistemaOperativo returns SistemaOperativo:
	WINDOWS='WINDOWS' | lINUX='lINUX' | MAC='MAC';

enum SistemaManejador returns SistemaManejador:
	PostgreSQL='PostgreSQL' | MySQL='MySQL' | Oracle='Oracle' | SQLServer='SQLServer' | NoSql='NoSql' | Aurora='Aurora' |
	MariaDB='MariaDB' | DocumentDB='DocumentDB' | Dynamo='Dynamo' | Cassandra='Cassandra' | Redis='Redis';

terminal EQUALS:
	"=";

terminal SEMI_COLON:
	";";

terminal OPEN_BRACE:
	"{";

terminal CLOSE_BRACE:
	"}";

terminal OPEN_PARENTHESIS:
	"(";

terminal CLOSE_PARENTHESIS:
	")";