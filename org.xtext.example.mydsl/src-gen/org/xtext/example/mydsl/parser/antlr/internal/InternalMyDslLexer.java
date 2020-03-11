package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_EQUALS=5;
    public static final int T__59=59;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=12;
    public static final int RULE_COMMA=8;
    public static final int RULE_OPEN_BRACKET=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=13;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_CLOSE_BRACE=10;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_CLOSE_BRACKET=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_OPEN_BRACE=4;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SEMI_COLON=6;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'Infraestructura' )
            // InternalMyDsl.g:11:9: 'Infraestructura'
            {
            match("Infraestructura"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'tipo' )
            // InternalMyDsl.g:12:9: 'tipo'
            {
            match("tipo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'login' )
            // InternalMyDsl.g:13:9: 'login'
            {
            match("login"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'securityGroup' )
            // InternalMyDsl.g:14:9: 'securityGroup'
            {
            match("securityGroup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'ambientesdespliegue' )
            // InternalMyDsl.g:15:9: 'ambientesdespliegue'
            {
            match("ambientesdespliegue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'nombreConexion' )
            // InternalMyDsl.g:16:9: 'nombreConexion'
            {
            match("nombreConexion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'usuario' )
            // InternalMyDsl.g:17:9: 'usuario'
            {
            match("usuario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'contrasena' )
            // InternalMyDsl.g:18:9: 'contrasena'
            {
            match("contrasena"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'accessId' )
            // InternalMyDsl.g:19:9: 'accessId'
            {
            match("accessId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'secret' )
            // InternalMyDsl.g:20:9: 'secret'
            {
            match("secret"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'alias' )
            // InternalMyDsl.g:21:9: 'alias'
            {
            match("alias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'nombre' )
            // InternalMyDsl.g:22:9: 'nombre'
            {
            match("nombre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( 'vpc' )
            // InternalMyDsl.g:23:9: 'vpc'
            {
            match("vpc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( 'ambientes' )
            // InternalMyDsl.g:24:9: 'ambientes'
            {
            match("ambientes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'conexion' )
            // InternalMyDsl.g:25:9: 'conexion'
            {
            match("conexion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'description' )
            // InternalMyDsl.g:26:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( 'name' )
            // InternalMyDsl.g:27:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( 'cidr' )
            // InternalMyDsl.g:28:9: 'cidr'
            {
            match("cidr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( 'az' )
            // InternalMyDsl.g:29:9: 'az'
            {
            match("az"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'subred' )
            // InternalMyDsl.g:30:9: 'subred'
            {
            match("subred"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'Server' )
            // InternalMyDsl.g:31:9: 'Server'
            {
            match("Server"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( 'dimension' )
            // InternalMyDsl.g:32:9: 'dimension'
            {
            match("dimension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( 'os' )
            // InternalMyDsl.g:33:9: 'os'
            {
            match("os"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'Database' )
            // InternalMyDsl.g:34:9: 'Database'
            {
            match("Database"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'STORAGE' )
            // InternalMyDsl.g:35:9: 'STORAGE'
            {
            match("STORAGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'gigas' )
            // InternalMyDsl.g:36:9: 'gigas'
            {
            match("gigas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'servidorUno' )
            // InternalMyDsl.g:37:9: 'servidorUno'
            {
            match("servidorUno"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'servidorDos' )
            // InternalMyDsl.g:38:9: 'servidorDos'
            {
            match("servidorDos"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'AWS' )
            // InternalMyDsl.g:39:9: 'AWS'
            {
            match("AWS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'GCP' )
            // InternalMyDsl.g:40:9: 'GCP'
            {
            match("GCP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( 'DESARROLLO' )
            // InternalMyDsl.g:41:9: 'DESARROLLO'
            {
            match("DESARROLLO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( 'PRUEBAS' )
            // InternalMyDsl.g:42:9: 'PRUEBAS'
            {
            match("PRUEBAS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:7: ( 'QA' )
            // InternalMyDsl.g:43:9: 'QA'
            {
            match("QA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:44:7: ( 'PRODUCCION' )
            // InternalMyDsl.g:44:9: 'PRODUCCION'
            {
            match("PRODUCCION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:45:7: ( 'MICRO' )
            // InternalMyDsl.g:45:9: 'MICRO'
            {
            match("MICRO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:46:7: ( 'SMALL' )
            // InternalMyDsl.g:46:9: 'SMALL'
            {
            match("SMALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:47:7: ( 'MEDIUM' )
            // InternalMyDsl.g:47:9: 'MEDIUM'
            {
            match("MEDIUM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:48:7: ( 'LARGE' )
            // InternalMyDsl.g:48:9: 'LARGE'
            {
            match("LARGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:49:7: ( 'WINDOWS' )
            // InternalMyDsl.g:49:9: 'WINDOWS'
            {
            match("WINDOWS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:50:7: ( 'lINUX' )
            // InternalMyDsl.g:50:9: 'lINUX'
            {
            match("lINUX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:51:7: ( 'MAC' )
            // InternalMyDsl.g:51:9: 'MAC'
            {
            match("MAC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:52:7: ( 'PostgreSQL' )
            // InternalMyDsl.g:52:9: 'PostgreSQL'
            {
            match("PostgreSQL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:53:7: ( 'MySQL' )
            // InternalMyDsl.g:53:9: 'MySQL'
            {
            match("MySQL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:54:7: ( 'Oracle' )
            // InternalMyDsl.g:54:9: 'Oracle'
            {
            match("Oracle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:55:7: ( 'SQLServer' )
            // InternalMyDsl.g:55:9: 'SQLServer'
            {
            match("SQLServer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:56:7: ( 'NoSql' )
            // InternalMyDsl.g:56:9: 'NoSql'
            {
            match("NoSql"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:57:7: ( 'Aurora' )
            // InternalMyDsl.g:57:9: 'Aurora'
            {
            match("Aurora"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:58:7: ( 'MariaDB' )
            // InternalMyDsl.g:58:9: 'MariaDB'
            {
            match("MariaDB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:59:7: ( 'DocumentDB' )
            // InternalMyDsl.g:59:9: 'DocumentDB'
            {
            match("DocumentDB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:60:7: ( 'Dynamo' )
            // InternalMyDsl.g:60:9: 'Dynamo'
            {
            match("Dynamo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:61:7: ( 'Cassandra' )
            // InternalMyDsl.g:61:9: 'Cassandra'
            {
            match("Cassandra"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:62:7: ( 'Redis' )
            // InternalMyDsl.g:62:9: 'Redis'
            {
            match("Redis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2262:13: ( '=' )
            // InternalMyDsl.g:2262:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_SEMI_COLON"
    public final void mRULE_SEMI_COLON() throws RecognitionException {
        try {
            int _type = RULE_SEMI_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2264:17: ( ';' )
            // InternalMyDsl.g:2264:19: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMI_COLON"

    // $ANTLR start "RULE_OPEN_BRACE"
    public final void mRULE_OPEN_BRACE() throws RecognitionException {
        try {
            int _type = RULE_OPEN_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2266:17: ( '{' )
            // InternalMyDsl.g:2266:19: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPEN_BRACE"

    // $ANTLR start "RULE_CLOSE_BRACE"
    public final void mRULE_CLOSE_BRACE() throws RecognitionException {
        try {
            int _type = RULE_CLOSE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2268:18: ( '}' )
            // InternalMyDsl.g:2268:20: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSE_BRACE"

    // $ANTLR start "RULE_OPEN_BRACKET"
    public final void mRULE_OPEN_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_OPEN_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2270:19: ( '[' )
            // InternalMyDsl.g:2270:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPEN_BRACKET"

    // $ANTLR start "RULE_CLOSE_BRACKET"
    public final void mRULE_CLOSE_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_CLOSE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2272:20: ( ']' )
            // InternalMyDsl.g:2272:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSE_BRACKET"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2274:12: ( ',' )
            // InternalMyDsl.g:2274:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2276:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:2276:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:2276:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:2276:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:2276:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2278:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:2278:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:2278:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:2278:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2280:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:2280:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:2280:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:2280:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:2280:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:2280:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2280:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2280:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:2280:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:2280:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2280:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2282:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:2282:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:2282:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:2282:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2284:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:2284:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:2284:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:2284:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:2284:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:2284:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:2284:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:2284:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2286:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:2286:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:2286:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2288:16: ( . )
            // InternalMyDsl.g:2288:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_EQUALS | RULE_SEMI_COLON | RULE_OPEN_BRACE | RULE_CLOSE_BRACE | RULE_OPEN_BRACKET | RULE_CLOSE_BRACKET | RULE_COMMA | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=66;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMyDsl.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:322: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:334: RULE_SEMI_COLON
                {
                mRULE_SEMI_COLON(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:350: RULE_OPEN_BRACE
                {
                mRULE_OPEN_BRACE(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:366: RULE_CLOSE_BRACE
                {
                mRULE_CLOSE_BRACE(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:383: RULE_OPEN_BRACKET
                {
                mRULE_OPEN_BRACKET(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:401: RULE_CLOSE_BRACKET
                {
                mRULE_CLOSE_BRACKET(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:420: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:431: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:439: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:448: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:460: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 64 :
                // InternalMyDsl.g:1:476: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 65 :
                // InternalMyDsl.g:1:492: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 66 :
                // InternalMyDsl.g:1:500: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\31\52\7\uffff\1\50\2\uffff\3\50\2\uffff\1\52\1\uffff\10\52\1\155\14\52\1\172\12\52\1\u0086\13\52\14\uffff\12\52\1\uffff\5\52\1\u00a3\6\52\1\uffff\5\52\1\u00af\1\52\1\u00b1\3\52\1\uffff\2\52\1\u00b7\11\52\1\u00c1\12\52\1\u00cc\3\52\1\u00d0\1\uffff\13\52\1\uffff\1\52\1\uffff\5\52\1\uffff\11\52\1\uffff\1\u00eb\1\u00ec\6\52\1\u00f3\1\52\1\uffff\3\52\1\uffff\4\52\1\u00fc\5\52\1\u0102\4\52\1\u0107\1\52\1\u0109\1\52\1\u010b\2\52\1\u010e\1\52\1\u0110\1\52\2\uffff\1\52\1\u0113\1\52\1\u0115\2\52\1\uffff\1\u0119\5\52\1\u011f\1\52\1\uffff\4\52\1\u0125\1\uffff\1\u0126\3\52\1\uffff\1\u012a\1\uffff\1\52\1\uffff\1\52\1\u012d\1\uffff\1\52\1\uffff\2\52\1\uffff\1\52\1\uffff\3\52\1\uffff\1\u0135\4\52\1\uffff\1\u013a\4\52\2\uffff\1\u013f\2\52\1\uffff\1\u0142\1\u0143\1\uffff\5\52\1\u014a\1\52\1\uffff\1\52\1\u014d\2\52\1\uffff\1\52\1\u0151\2\52\1\uffff\2\52\2\uffff\5\52\1\u015c\1\uffff\2\52\1\uffff\1\52\1\u0160\1\u0161\1\uffff\4\52\1\u0166\5\52\1\uffff\1\52\1\u016d\1\52\2\uffff\1\u016f\1\u0170\1\u0171\1\u0172\1\uffff\2\52\1\u0175\1\u0176\2\52\1\uffff\1\u0179\4\uffff\2\52\2\uffff\2\52\1\uffff\1\52\1\u017f\3\52\1\uffff\1\52\1\u0184\1\u0185\1\52\2\uffff\3\52\1\u018a\1\uffff";
    static final String DFA12_eofS =
        "\u018b\uffff";
    static final String DFA12_minS =
        "\1\0\1\156\1\151\1\111\1\145\1\143\1\141\1\163\1\151\1\160\1\145\1\115\1\163\1\105\1\151\1\127\1\103\1\122\3\101\1\111\1\162\1\157\1\141\1\145\7\uffff\1\101\2\uffff\2\0\1\52\2\uffff\1\146\1\uffff\1\160\1\147\1\116\1\143\2\142\1\143\1\151\1\60\2\155\1\165\1\156\1\144\1\143\1\163\1\155\1\162\1\117\1\101\1\114\1\60\1\164\1\123\1\143\1\156\1\147\1\123\1\162\1\120\1\117\1\163\1\60\1\103\1\104\1\103\1\123\1\162\1\122\1\116\1\141\1\123\1\163\1\144\14\uffff\1\162\1\157\1\151\1\125\1\162\1\166\1\162\1\151\1\145\1\141\1\uffff\1\142\1\145\1\141\1\145\1\162\1\60\1\143\1\145\1\166\1\122\1\114\1\123\1\uffff\1\141\1\101\1\165\2\141\1\60\1\157\1\60\1\105\1\104\1\164\1\uffff\1\122\1\111\1\60\1\121\1\151\1\107\1\104\1\143\1\161\1\163\1\151\1\141\1\60\1\156\1\130\1\162\1\145\1\151\2\145\2\163\1\162\1\60\2\162\1\170\1\60\1\uffff\1\162\1\156\1\145\1\101\1\114\1\145\1\142\1\122\2\155\1\163\1\uffff\1\162\1\uffff\1\102\1\125\1\147\1\117\1\125\1\uffff\1\114\1\141\1\105\1\117\2\154\1\141\1\163\1\145\1\uffff\2\60\1\151\1\164\2\144\1\156\1\163\1\60\1\145\1\uffff\1\151\1\141\1\151\1\uffff\1\151\1\163\1\162\1\107\1\60\1\162\1\141\1\122\1\145\1\157\1\60\1\141\1\101\1\103\1\162\1\60\1\115\1\60\1\104\1\60\1\127\1\145\1\60\1\156\1\60\1\163\2\uffff\1\164\1\60\1\157\1\60\1\164\1\111\1\uffff\1\60\1\157\1\163\1\157\1\160\1\151\1\60\1\105\1\uffff\1\166\1\163\1\117\1\156\1\60\1\uffff\1\60\1\123\1\103\1\145\1\uffff\1\60\1\uffff\1\102\1\uffff\1\123\1\60\1\uffff\1\144\1\uffff\1\164\1\171\1\uffff\1\162\1\uffff\1\145\1\144\1\157\1\uffff\1\60\1\145\1\156\1\164\1\157\1\uffff\1\60\2\145\1\114\1\164\2\uffff\1\60\1\111\1\123\1\uffff\2\60\1\uffff\2\162\1\107\1\104\1\163\1\60\1\156\1\uffff\1\156\1\60\1\151\1\156\1\uffff\1\162\1\60\1\114\1\104\1\uffff\1\117\1\121\2\uffff\1\141\1\165\1\162\1\156\1\157\1\60\1\uffff\1\145\1\141\1\uffff\1\157\2\60\1\uffff\1\117\1\102\1\116\1\114\1\60\1\143\2\157\1\163\1\145\1\uffff\1\170\1\60\1\156\2\uffff\4\60\1\uffff\1\164\1\165\2\60\1\163\1\151\1\uffff\1\60\4\uffff\1\165\1\160\2\uffff\1\160\1\157\1\uffff\1\162\1\60\1\154\1\156\1\141\1\uffff\1\151\2\60\1\145\2\uffff\1\147\1\165\1\145\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\156\1\151\1\157\1\165\1\172\1\157\1\163\1\157\1\160\1\151\1\145\1\163\1\171\1\151\1\165\1\103\1\157\1\101\1\171\1\101\1\111\1\162\1\157\1\141\1\145\7\uffff\1\172\2\uffff\2\uffff\1\57\2\uffff\1\146\1\uffff\1\160\1\147\1\116\1\162\2\142\1\143\1\151\1\172\2\155\1\165\1\156\1\144\1\143\1\163\1\155\1\162\1\117\1\101\1\114\1\172\1\164\1\123\1\143\1\156\1\147\1\123\1\162\1\120\1\125\1\163\1\172\1\103\1\104\1\103\1\123\1\162\1\122\1\116\1\141\1\123\1\163\1\144\14\uffff\1\162\1\157\1\151\1\125\1\165\1\166\1\162\1\151\1\145\1\141\1\uffff\1\142\1\145\1\141\1\164\1\162\1\172\1\143\1\145\1\166\1\122\1\114\1\123\1\uffff\1\141\1\101\1\165\2\141\1\172\1\157\1\172\1\105\1\104\1\164\1\uffff\1\122\1\111\1\172\1\121\1\151\1\107\1\104\1\143\1\161\1\163\1\151\1\141\1\172\1\156\1\130\1\162\1\145\1\151\2\145\2\163\1\162\1\172\2\162\1\170\1\172\1\uffff\1\162\1\156\1\145\1\101\1\114\1\145\1\142\1\122\2\155\1\163\1\uffff\1\162\1\uffff\1\102\1\125\1\147\1\117\1\125\1\uffff\1\114\1\141\1\105\1\117\2\154\1\141\1\163\1\145\1\uffff\2\172\1\151\1\164\2\144\1\156\1\163\1\172\1\145\1\uffff\1\151\1\141\1\151\1\uffff\1\151\1\163\1\162\1\107\1\172\1\162\1\141\1\122\1\145\1\157\1\172\1\141\1\101\1\103\1\162\1\172\1\115\1\172\1\104\1\172\1\127\1\145\1\172\1\156\1\172\1\163\2\uffff\1\164\1\172\1\157\1\172\1\164\1\111\1\uffff\1\172\1\157\1\163\1\157\1\160\1\151\1\172\1\105\1\uffff\1\166\1\163\1\117\1\156\1\172\1\uffff\1\172\1\123\1\103\1\145\1\uffff\1\172\1\uffff\1\102\1\uffff\1\123\1\172\1\uffff\1\144\1\uffff\1\164\1\171\1\uffff\1\162\1\uffff\1\145\1\144\1\157\1\uffff\1\172\1\145\1\156\1\164\1\157\1\uffff\1\172\2\145\1\114\1\164\2\uffff\1\172\1\111\1\123\1\uffff\2\172\1\uffff\2\162\1\107\1\125\1\163\1\172\1\156\1\uffff\1\156\1\172\1\151\1\156\1\uffff\1\162\1\172\1\114\1\104\1\uffff\1\117\1\121\2\uffff\1\141\1\165\1\162\1\156\1\157\1\172\1\uffff\1\145\1\141\1\uffff\1\157\2\172\1\uffff\1\117\1\102\1\116\1\114\1\172\1\143\2\157\1\163\1\145\1\uffff\1\170\1\172\1\156\2\uffff\4\172\1\uffff\1\164\1\165\2\172\1\163\1\151\1\uffff\1\172\4\uffff\1\165\1\160\2\uffff\1\160\1\157\1\uffff\1\162\1\172\1\154\1\156\1\141\1\uffff\1\151\2\172\1\145\2\uffff\1\147\1\165\1\145\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\32\uffff\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\uffff\1\74\1\75\3\uffff\1\101\1\102\1\uffff\1\74\54\uffff\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\75\1\76\1\77\1\100\1\101\12\uffff\1\23\14\uffff\1\27\13\uffff\1\41\34\uffff\1\15\13\uffff\1\35\1\uffff\1\36\5\uffff\1\51\11\uffff\1\2\12\uffff\1\21\3\uffff\1\22\32\uffff\1\3\1\50\6\uffff\1\13\10\uffff\1\44\5\uffff\1\32\4\uffff\1\43\1\uffff\1\53\1\uffff\1\46\2\uffff\1\56\1\uffff\1\64\2\uffff\1\12\1\uffff\1\24\3\uffff\1\14\5\uffff\1\25\5\uffff\1\62\1\57\3\uffff\1\45\2\uffff\1\54\7\uffff\1\7\4\uffff\1\31\4\uffff\1\40\2\uffff\1\60\1\47\6\uffff\1\11\2\uffff\1\17\3\uffff\1\30\12\uffff\1\16\3\uffff\1\26\1\55\4\uffff\1\63\6\uffff\1\10\1\uffff\1\37\1\61\1\42\1\52\2\uffff\1\33\1\34\2\uffff\1\20\5\uffff\1\4\4\uffff\1\6\1\1\4\uffff\1\5";
    static final String DFA12_specialS =
        "\1\0\43\uffff\1\1\1\2\u0165\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\50\2\47\2\50\1\47\22\50\1\47\1\50\1\44\4\50\1\45\4\50\1\40\2\50\1\46\12\43\1\50\1\33\1\50\1\32\3\50\1\17\1\42\1\30\1\15\2\42\1\20\1\42\1\1\2\42\1\24\1\23\1\27\1\26\1\21\1\22\1\31\1\13\3\42\1\25\3\42\1\36\1\50\1\37\1\41\1\42\1\50\1\5\1\42\1\10\1\12\2\42\1\16\4\42\1\3\1\42\1\6\1\14\3\42\1\4\1\2\1\7\1\11\4\42\1\34\1\50\1\35\uff82\50",
            "\1\51",
            "\1\53",
            "\1\55\45\uffff\1\54",
            "\1\56\17\uffff\1\57",
            "\1\61\10\uffff\1\62\1\60\14\uffff\1\63",
            "\1\65\15\uffff\1\64",
            "\1\66",
            "\1\70\5\uffff\1\67",
            "\1\71",
            "\1\72\3\uffff\1\73",
            "\1\76\3\uffff\1\77\2\uffff\1\75\20\uffff\1\74",
            "\1\100",
            "\1\102\33\uffff\1\101\15\uffff\1\103\11\uffff\1\104",
            "\1\105",
            "\1\106\35\uffff\1\107",
            "\1\110",
            "\1\111\34\uffff\1\112",
            "\1\113",
            "\1\116\3\uffff\1\115\3\uffff\1\114\27\uffff\1\120\27\uffff\1\117",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\0\137",
            "\0\137",
            "\1\140\4\uffff\1\141",
            "",
            "",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147\16\uffff\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0084\5\uffff\1\u0083",
            "\1\u0085",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0097\2\uffff\1\u0096",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a1\16\uffff\1\u00a0",
            "\1\u00a2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0108",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010c",
            "\1\u010d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0111",
            "",
            "",
            "\1\u0112",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0114",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0116",
            "\1\u0117",
            "",
            "\12\52\7\uffff\2\52\1\u0118\27\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0120",
            "",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u012b",
            "",
            "\1\u012c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u012e",
            "",
            "\1\u012f",
            "\1\u0130",
            "",
            "\1\u0131",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0140",
            "\1\u0141",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0148\20\uffff\1\u0147",
            "\1\u0149",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u014b",
            "",
            "\1\u014c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u014e",
            "\1\u014f",
            "",
            "\1\u0150",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0152",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\3\52\1\u015b\26\52",
            "",
            "\1\u015d",
            "\1\u015e",
            "",
            "\1\u015f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "",
            "\1\u016c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u016e",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0173",
            "\1\u0174",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0177",
            "\1\u0178",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\u017a",
            "\1\u017b",
            "",
            "",
            "\1\u017c",
            "\1\u017d",
            "",
            "\1\u017e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "",
            "\1\u0183",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0186",
            "",
            "",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | RULE_EQUALS | RULE_SEMI_COLON | RULE_OPEN_BRACE | RULE_CLOSE_BRACE | RULE_OPEN_BRACKET | RULE_CLOSE_BRACKET | RULE_COMMA | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='I') ) {s = 1;}

                        else if ( (LA12_0=='t') ) {s = 2;}

                        else if ( (LA12_0=='l') ) {s = 3;}

                        else if ( (LA12_0=='s') ) {s = 4;}

                        else if ( (LA12_0=='a') ) {s = 5;}

                        else if ( (LA12_0=='n') ) {s = 6;}

                        else if ( (LA12_0=='u') ) {s = 7;}

                        else if ( (LA12_0=='c') ) {s = 8;}

                        else if ( (LA12_0=='v') ) {s = 9;}

                        else if ( (LA12_0=='d') ) {s = 10;}

                        else if ( (LA12_0=='S') ) {s = 11;}

                        else if ( (LA12_0=='o') ) {s = 12;}

                        else if ( (LA12_0=='D') ) {s = 13;}

                        else if ( (LA12_0=='g') ) {s = 14;}

                        else if ( (LA12_0=='A') ) {s = 15;}

                        else if ( (LA12_0=='G') ) {s = 16;}

                        else if ( (LA12_0=='P') ) {s = 17;}

                        else if ( (LA12_0=='Q') ) {s = 18;}

                        else if ( (LA12_0=='M') ) {s = 19;}

                        else if ( (LA12_0=='L') ) {s = 20;}

                        else if ( (LA12_0=='W') ) {s = 21;}

                        else if ( (LA12_0=='O') ) {s = 22;}

                        else if ( (LA12_0=='N') ) {s = 23;}

                        else if ( (LA12_0=='C') ) {s = 24;}

                        else if ( (LA12_0=='R') ) {s = 25;}

                        else if ( (LA12_0=='=') ) {s = 26;}

                        else if ( (LA12_0==';') ) {s = 27;}

                        else if ( (LA12_0=='{') ) {s = 28;}

                        else if ( (LA12_0=='}') ) {s = 29;}

                        else if ( (LA12_0=='[') ) {s = 30;}

                        else if ( (LA12_0==']') ) {s = 31;}

                        else if ( (LA12_0==',') ) {s = 32;}

                        else if ( (LA12_0=='^') ) {s = 33;}

                        else if ( (LA12_0=='B'||(LA12_0>='E' && LA12_0<='F')||LA12_0=='H'||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='T' && LA12_0<='V')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='e' && LA12_0<='f')||(LA12_0>='h' && LA12_0<='k')||LA12_0=='m'||(LA12_0>='p' && LA12_0<='r')||(LA12_0>='w' && LA12_0<='z')) ) {s = 34;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 35;}

                        else if ( (LA12_0=='\"') ) {s = 36;}

                        else if ( (LA12_0=='\'') ) {s = 37;}

                        else if ( (LA12_0=='/') ) {s = 38;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 39;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||LA12_0==':'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( ((LA12_36>='\u0000' && LA12_36<='\uFFFF')) ) {s = 95;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_37 = input.LA(1);

                        s = -1;
                        if ( ((LA12_37>='\u0000' && LA12_37<='\uFFFF')) ) {s = 95;}

                        else s = 40;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}