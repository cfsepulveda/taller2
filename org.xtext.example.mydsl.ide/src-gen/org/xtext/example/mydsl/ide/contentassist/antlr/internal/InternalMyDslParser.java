package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_OPEN_BRACE", "RULE_SEMI_COLON", "RULE_CLOSE_BRACE", "RULE_EQUALS", "RULE_OPEN_BRACKET", "RULE_CLOSE_BRACKET", "RULE_COMMA", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'AWS'", "'GCP'", "'DESARROLLO'", "'PRUEBAS'", "'QA'", "'PRODUCCION'", "'MICRO'", "'SMALL'", "'MEDIUM'", "'LARGE'", "'WINDOWS'", "'lINUX'", "'MAC'", "'PostgreSQL'", "'MySQL'", "'Oracle'", "'SQLServer'", "'NoSql'", "'Aurora'", "'MariaDB'", "'DocumentDB'", "'Dynamo'", "'Cassandra'", "'Redis'", "'Infraestructura'", "'tipo'", "'login'", "'securityGroup'", "'ambientesdespliegue'", "'nombreConexion'", "'usuario'", "'contrasena'", "'accessId'", "'secret'", "'ambientes'", "'alias'", "'nombre'", "'vpc'", "'conexion'", "'description'", "'name'", "'cidr'", "'az'", "'subred'", "'Server'", "'dimension'", "'os'", "'Database'", "'STORAGE'", "'gigas'", "'servidorUno'", "'servidorDos'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_EQUALS=9;
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
    public static final int RULE_ID=5;
    public static final int RULE_COMMA=12;
    public static final int RULE_OPEN_BRACKET=10;
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
    public static final int RULE_STRING=4;
    public static final int RULE_CLOSE_BRACE=8;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_CLOSE_BRACKET=11;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_OPEN_BRACE=6;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SEMI_COLON=7;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleInfraestructura"
    // InternalMyDsl.g:53:1: entryRuleInfraestructura : ruleInfraestructura EOF ;
    public final void entryRuleInfraestructura() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleInfraestructura EOF )
            // InternalMyDsl.g:55:1: ruleInfraestructura EOF
            {
             before(grammarAccess.getInfraestructuraRule()); 
            pushFollow(FOLLOW_1);
            ruleInfraestructura();

            state._fsp--;

             after(grammarAccess.getInfraestructuraRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInfraestructura"


    // $ANTLR start "ruleInfraestructura"
    // InternalMyDsl.g:62:1: ruleInfraestructura : ( ( rule__Infraestructura__Group__0 ) ) ;
    public final void ruleInfraestructura() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Infraestructura__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Infraestructura__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Infraestructura__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Infraestructura__Group__0 )
            {
             before(grammarAccess.getInfraestructuraAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Infraestructura__Group__0 )
            // InternalMyDsl.g:69:4: rule__Infraestructura__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInfraestructura"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleLogin"
    // InternalMyDsl.g:103:1: entryRuleLogin : ruleLogin EOF ;
    public final void entryRuleLogin() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleLogin EOF )
            // InternalMyDsl.g:105:1: ruleLogin EOF
            {
             before(grammarAccess.getLoginRule()); 
            pushFollow(FOLLOW_1);
            ruleLogin();

            state._fsp--;

             after(grammarAccess.getLoginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogin"


    // $ANTLR start "ruleLogin"
    // InternalMyDsl.g:112:1: ruleLogin : ( ( rule__Login__Group__0 ) ) ;
    public final void ruleLogin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Login__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Login__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Login__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Login__Group__0 )
            {
             before(grammarAccess.getLoginAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Login__Group__0 )
            // InternalMyDsl.g:119:4: rule__Login__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogin"


    // $ANTLR start "entryRuleAmbienteDesplegue"
    // InternalMyDsl.g:128:1: entryRuleAmbienteDesplegue : ruleAmbienteDesplegue EOF ;
    public final void entryRuleAmbienteDesplegue() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAmbienteDesplegue EOF )
            // InternalMyDsl.g:130:1: ruleAmbienteDesplegue EOF
            {
             before(grammarAccess.getAmbienteDesplegueRule()); 
            pushFollow(FOLLOW_1);
            ruleAmbienteDesplegue();

            state._fsp--;

             after(grammarAccess.getAmbienteDesplegueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAmbienteDesplegue"


    // $ANTLR start "ruleAmbienteDesplegue"
    // InternalMyDsl.g:137:1: ruleAmbienteDesplegue : ( ( rule__AmbienteDesplegue__Group__0 ) ) ;
    public final void ruleAmbienteDesplegue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__AmbienteDesplegue__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__AmbienteDesplegue__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__AmbienteDesplegue__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__AmbienteDesplegue__Group__0 )
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__AmbienteDesplegue__Group__0 )
            // InternalMyDsl.g:144:4: rule__AmbienteDesplegue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDesplegueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAmbienteDesplegue"


    // $ANTLR start "entryRuleSecurityGroup"
    // InternalMyDsl.g:153:1: entryRuleSecurityGroup : ruleSecurityGroup EOF ;
    public final void entryRuleSecurityGroup() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleSecurityGroup EOF )
            // InternalMyDsl.g:155:1: ruleSecurityGroup EOF
            {
             before(grammarAccess.getSecurityGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleSecurityGroup();

            state._fsp--;

             after(grammarAccess.getSecurityGroupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSecurityGroup"


    // $ANTLR start "ruleSecurityGroup"
    // InternalMyDsl.g:162:1: ruleSecurityGroup : ( ( rule__SecurityGroup__Group__0 ) ) ;
    public final void ruleSecurityGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__SecurityGroup__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__SecurityGroup__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__SecurityGroup__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__SecurityGroup__Group__0 )
            {
             before(grammarAccess.getSecurityGroupAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__SecurityGroup__Group__0 )
            // InternalMyDsl.g:169:4: rule__SecurityGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecurityGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSecurityGroup"


    // $ANTLR start "entryRuleSubred"
    // InternalMyDsl.g:178:1: entryRuleSubred : ruleSubred EOF ;
    public final void entryRuleSubred() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleSubred EOF )
            // InternalMyDsl.g:180:1: ruleSubred EOF
            {
             before(grammarAccess.getSubredRule()); 
            pushFollow(FOLLOW_1);
            ruleSubred();

            state._fsp--;

             after(grammarAccess.getSubredRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubred"


    // $ANTLR start "ruleSubred"
    // InternalMyDsl.g:187:1: ruleSubred : ( ( rule__Subred__Group__0 ) ) ;
    public final void ruleSubred() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Subred__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Subred__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Subred__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Subred__Group__0 )
            {
             before(grammarAccess.getSubredAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Subred__Group__0 )
            // InternalMyDsl.g:194:4: rule__Subred__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubred"


    // $ANTLR start "entryRuleVPC"
    // InternalMyDsl.g:203:1: entryRuleVPC : ruleVPC EOF ;
    public final void entryRuleVPC() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleVPC EOF )
            // InternalMyDsl.g:205:1: ruleVPC EOF
            {
             before(grammarAccess.getVPCRule()); 
            pushFollow(FOLLOW_1);
            ruleVPC();

            state._fsp--;

             after(grammarAccess.getVPCRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVPC"


    // $ANTLR start "ruleVPC"
    // InternalMyDsl.g:212:1: ruleVPC : ( ( rule__VPC__Group__0 ) ) ;
    public final void ruleVPC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__VPC__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__VPC__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__VPC__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__VPC__Group__0 )
            {
             before(grammarAccess.getVPCAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__VPC__Group__0 )
            // InternalMyDsl.g:219:4: rule__VPC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VPC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVPCAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVPC"


    // $ANTLR start "entryRuleServidor"
    // InternalMyDsl.g:228:1: entryRuleServidor : ruleServidor EOF ;
    public final void entryRuleServidor() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleServidor EOF )
            // InternalMyDsl.g:230:1: ruleServidor EOF
            {
             before(grammarAccess.getServidorRule()); 
            pushFollow(FOLLOW_1);
            ruleServidor();

            state._fsp--;

             after(grammarAccess.getServidorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidor"


    // $ANTLR start "ruleServidor"
    // InternalMyDsl.g:237:1: ruleServidor : ( ( rule__Servidor__Alternatives ) ) ;
    public final void ruleServidor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Servidor__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Servidor__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Servidor__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__Servidor__Alternatives )
            {
             before(grammarAccess.getServidorAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__Servidor__Alternatives )
            // InternalMyDsl.g:244:4: rule__Servidor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Servidor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServidorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidor"


    // $ANTLR start "entryRuleServidorAplicacion"
    // InternalMyDsl.g:253:1: entryRuleServidorAplicacion : ruleServidorAplicacion EOF ;
    public final void entryRuleServidorAplicacion() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleServidorAplicacion EOF )
            // InternalMyDsl.g:255:1: ruleServidorAplicacion EOF
            {
             before(grammarAccess.getServidorAplicacionRule()); 
            pushFollow(FOLLOW_1);
            ruleServidorAplicacion();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidorAplicacion"


    // $ANTLR start "ruleServidorAplicacion"
    // InternalMyDsl.g:262:1: ruleServidorAplicacion : ( ( rule__ServidorAplicacion__Group__0 ) ) ;
    public final void ruleServidorAplicacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__ServidorAplicacion__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__ServidorAplicacion__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__ServidorAplicacion__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__ServidorAplicacion__Group__0 )
            {
             before(grammarAccess.getServidorAplicacionAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__ServidorAplicacion__Group__0 )
            // InternalMyDsl.g:269:4: rule__ServidorAplicacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidorAplicacion"


    // $ANTLR start "entryRuleServidorBaseDeDatos"
    // InternalMyDsl.g:278:1: entryRuleServidorBaseDeDatos : ruleServidorBaseDeDatos EOF ;
    public final void entryRuleServidorBaseDeDatos() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleServidorBaseDeDatos EOF )
            // InternalMyDsl.g:280:1: ruleServidorBaseDeDatos EOF
            {
             before(grammarAccess.getServidorBaseDeDatosRule()); 
            pushFollow(FOLLOW_1);
            ruleServidorBaseDeDatos();

            state._fsp--;

             after(grammarAccess.getServidorBaseDeDatosRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidorBaseDeDatos"


    // $ANTLR start "ruleServidorBaseDeDatos"
    // InternalMyDsl.g:287:1: ruleServidorBaseDeDatos : ( ( rule__ServidorBaseDeDatos__Group__0 ) ) ;
    public final void ruleServidorBaseDeDatos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__ServidorBaseDeDatos__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__ServidorBaseDeDatos__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__ServidorBaseDeDatos__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__ServidorBaseDeDatos__Group__0 )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__ServidorBaseDeDatos__Group__0 )
            // InternalMyDsl.g:294:4: rule__ServidorBaseDeDatos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidorBaseDeDatos"


    // $ANTLR start "entryRuleServidorAlmacenamiento"
    // InternalMyDsl.g:303:1: entryRuleServidorAlmacenamiento : ruleServidorAlmacenamiento EOF ;
    public final void entryRuleServidorAlmacenamiento() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleServidorAlmacenamiento EOF )
            // InternalMyDsl.g:305:1: ruleServidorAlmacenamiento EOF
            {
             before(grammarAccess.getServidorAlmacenamientoRule()); 
            pushFollow(FOLLOW_1);
            ruleServidorAlmacenamiento();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidorAlmacenamiento"


    // $ANTLR start "ruleServidorAlmacenamiento"
    // InternalMyDsl.g:312:1: ruleServidorAlmacenamiento : ( ( rule__ServidorAlmacenamiento__Group__0 ) ) ;
    public final void ruleServidorAlmacenamiento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__ServidorAlmacenamiento__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__ServidorAlmacenamiento__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__ServidorAlmacenamiento__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__ServidorAlmacenamiento__Group__0 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__ServidorAlmacenamiento__Group__0 )
            // InternalMyDsl.g:319:4: rule__ServidorAlmacenamiento__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidorAlmacenamiento"


    // $ANTLR start "entryRuleConexion"
    // InternalMyDsl.g:328:1: entryRuleConexion : ruleConexion EOF ;
    public final void entryRuleConexion() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleConexion EOF )
            // InternalMyDsl.g:330:1: ruleConexion EOF
            {
             before(grammarAccess.getConexionRule()); 
            pushFollow(FOLLOW_1);
            ruleConexion();

            state._fsp--;

             after(grammarAccess.getConexionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConexion"


    // $ANTLR start "ruleConexion"
    // InternalMyDsl.g:337:1: ruleConexion : ( ( rule__Conexion__Group__0 ) ) ;
    public final void ruleConexion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Conexion__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Conexion__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Conexion__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Conexion__Group__0 )
            {
             before(grammarAccess.getConexionAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Conexion__Group__0 )
            // InternalMyDsl.g:344:4: rule__Conexion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conexion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConexionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConexion"


    // $ANTLR start "ruleProveedorServicio"
    // InternalMyDsl.g:353:1: ruleProveedorServicio : ( ( rule__ProveedorServicio__Alternatives ) ) ;
    public final void ruleProveedorServicio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:357:1: ( ( ( rule__ProveedorServicio__Alternatives ) ) )
            // InternalMyDsl.g:358:2: ( ( rule__ProveedorServicio__Alternatives ) )
            {
            // InternalMyDsl.g:358:2: ( ( rule__ProveedorServicio__Alternatives ) )
            // InternalMyDsl.g:359:3: ( rule__ProveedorServicio__Alternatives )
            {
             before(grammarAccess.getProveedorServicioAccess().getAlternatives()); 
            // InternalMyDsl.g:360:3: ( rule__ProveedorServicio__Alternatives )
            // InternalMyDsl.g:360:4: rule__ProveedorServicio__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorServicio__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProveedorServicioAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProveedorServicio"


    // $ANTLR start "ruleAmbiente"
    // InternalMyDsl.g:369:1: ruleAmbiente : ( ( rule__Ambiente__Alternatives ) ) ;
    public final void ruleAmbiente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:1: ( ( ( rule__Ambiente__Alternatives ) ) )
            // InternalMyDsl.g:374:2: ( ( rule__Ambiente__Alternatives ) )
            {
            // InternalMyDsl.g:374:2: ( ( rule__Ambiente__Alternatives ) )
            // InternalMyDsl.g:375:3: ( rule__Ambiente__Alternatives )
            {
             before(grammarAccess.getAmbienteAccess().getAlternatives()); 
            // InternalMyDsl.g:376:3: ( rule__Ambiente__Alternatives )
            // InternalMyDsl.g:376:4: rule__Ambiente__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Ambiente__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAmbiente"


    // $ANTLR start "ruleTamanoMaquina"
    // InternalMyDsl.g:385:1: ruleTamanoMaquina : ( ( rule__TamanoMaquina__Alternatives ) ) ;
    public final void ruleTamanoMaquina() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( ( ( rule__TamanoMaquina__Alternatives ) ) )
            // InternalMyDsl.g:390:2: ( ( rule__TamanoMaquina__Alternatives ) )
            {
            // InternalMyDsl.g:390:2: ( ( rule__TamanoMaquina__Alternatives ) )
            // InternalMyDsl.g:391:3: ( rule__TamanoMaquina__Alternatives )
            {
             before(grammarAccess.getTamanoMaquinaAccess().getAlternatives()); 
            // InternalMyDsl.g:392:3: ( rule__TamanoMaquina__Alternatives )
            // InternalMyDsl.g:392:4: rule__TamanoMaquina__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TamanoMaquina__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTamanoMaquinaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTamanoMaquina"


    // $ANTLR start "ruleSistemaOperativo"
    // InternalMyDsl.g:401:1: ruleSistemaOperativo : ( ( rule__SistemaOperativo__Alternatives ) ) ;
    public final void ruleSistemaOperativo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:405:1: ( ( ( rule__SistemaOperativo__Alternatives ) ) )
            // InternalMyDsl.g:406:2: ( ( rule__SistemaOperativo__Alternatives ) )
            {
            // InternalMyDsl.g:406:2: ( ( rule__SistemaOperativo__Alternatives ) )
            // InternalMyDsl.g:407:3: ( rule__SistemaOperativo__Alternatives )
            {
             before(grammarAccess.getSistemaOperativoAccess().getAlternatives()); 
            // InternalMyDsl.g:408:3: ( rule__SistemaOperativo__Alternatives )
            // InternalMyDsl.g:408:4: rule__SistemaOperativo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SistemaOperativo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSistemaOperativoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSistemaOperativo"


    // $ANTLR start "ruleSistemaManejador"
    // InternalMyDsl.g:417:1: ruleSistemaManejador : ( ( rule__SistemaManejador__Alternatives ) ) ;
    public final void ruleSistemaManejador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:421:1: ( ( ( rule__SistemaManejador__Alternatives ) ) )
            // InternalMyDsl.g:422:2: ( ( rule__SistemaManejador__Alternatives ) )
            {
            // InternalMyDsl.g:422:2: ( ( rule__SistemaManejador__Alternatives ) )
            // InternalMyDsl.g:423:3: ( rule__SistemaManejador__Alternatives )
            {
             before(grammarAccess.getSistemaManejadorAccess().getAlternatives()); 
            // InternalMyDsl.g:424:3: ( rule__SistemaManejador__Alternatives )
            // InternalMyDsl.g:424:4: rule__SistemaManejador__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SistemaManejador__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSistemaManejadorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSistemaManejador"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:432:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:436:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:437:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:437:2: ( RULE_STRING )
                    // InternalMyDsl.g:438:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:443:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:443:2: ( RULE_ID )
                    // InternalMyDsl.g:444:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Servidor__Alternatives"
    // InternalMyDsl.g:453:1: rule__Servidor__Alternatives : ( ( ruleServidorAplicacion ) | ( ruleServidorBaseDeDatos ) | ( ruleServidorAlmacenamiento ) );
    public final void rule__Servidor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:457:1: ( ( ruleServidorAplicacion ) | ( ruleServidorBaseDeDatos ) | ( ruleServidorAlmacenamiento ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_OPEN_BRACE) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==43) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE_EQUALS) ) {
                        switch ( input.LA(4) ) {
                        case 62:
                            {
                            alt2=1;
                            }
                            break;
                        case 65:
                            {
                            alt2=2;
                            }
                            break;
                        case 66:
                            {
                            alt2=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:458:2: ( ruleServidorAplicacion )
                    {
                    // InternalMyDsl.g:458:2: ( ruleServidorAplicacion )
                    // InternalMyDsl.g:459:3: ruleServidorAplicacion
                    {
                     before(grammarAccess.getServidorAccess().getServidorAplicacionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleServidorAplicacion();

                    state._fsp--;

                     after(grammarAccess.getServidorAccess().getServidorAplicacionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:464:2: ( ruleServidorBaseDeDatos )
                    {
                    // InternalMyDsl.g:464:2: ( ruleServidorBaseDeDatos )
                    // InternalMyDsl.g:465:3: ruleServidorBaseDeDatos
                    {
                     before(grammarAccess.getServidorAccess().getServidorBaseDeDatosParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleServidorBaseDeDatos();

                    state._fsp--;

                     after(grammarAccess.getServidorAccess().getServidorBaseDeDatosParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:470:2: ( ruleServidorAlmacenamiento )
                    {
                    // InternalMyDsl.g:470:2: ( ruleServidorAlmacenamiento )
                    // InternalMyDsl.g:471:3: ruleServidorAlmacenamiento
                    {
                     before(grammarAccess.getServidorAccess().getServidorAlmacenamientoParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleServidorAlmacenamiento();

                    state._fsp--;

                     after(grammarAccess.getServidorAccess().getServidorAlmacenamientoParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor__Alternatives"


    // $ANTLR start "rule__ProveedorServicio__Alternatives"
    // InternalMyDsl.g:480:1: rule__ProveedorServicio__Alternatives : ( ( ( 'AWS' ) ) | ( ( 'GCP' ) ) );
    public final void rule__ProveedorServicio__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:484:1: ( ( ( 'AWS' ) ) | ( ( 'GCP' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:485:2: ( ( 'AWS' ) )
                    {
                    // InternalMyDsl.g:485:2: ( ( 'AWS' ) )
                    // InternalMyDsl.g:486:3: ( 'AWS' )
                    {
                     before(grammarAccess.getProveedorServicioAccess().getAWSEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:487:3: ( 'AWS' )
                    // InternalMyDsl.g:487:4: 'AWS'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getProveedorServicioAccess().getAWSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:491:2: ( ( 'GCP' ) )
                    {
                    // InternalMyDsl.g:491:2: ( ( 'GCP' ) )
                    // InternalMyDsl.g:492:3: ( 'GCP' )
                    {
                     before(grammarAccess.getProveedorServicioAccess().getGCPEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:493:3: ( 'GCP' )
                    // InternalMyDsl.g:493:4: 'GCP'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getProveedorServicioAccess().getGCPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorServicio__Alternatives"


    // $ANTLR start "rule__Ambiente__Alternatives"
    // InternalMyDsl.g:501:1: rule__Ambiente__Alternatives : ( ( ( 'DESARROLLO' ) ) | ( ( 'PRUEBAS' ) ) | ( ( 'QA' ) ) | ( ( 'PRODUCCION' ) ) );
    public final void rule__Ambiente__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:505:1: ( ( ( 'DESARROLLO' ) ) | ( ( 'PRUEBAS' ) ) | ( ( 'QA' ) ) | ( ( 'PRODUCCION' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:506:2: ( ( 'DESARROLLO' ) )
                    {
                    // InternalMyDsl.g:506:2: ( ( 'DESARROLLO' ) )
                    // InternalMyDsl.g:507:3: ( 'DESARROLLO' )
                    {
                     before(grammarAccess.getAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:508:3: ( 'DESARROLLO' )
                    // InternalMyDsl.g:508:4: 'DESARROLLO'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:512:2: ( ( 'PRUEBAS' ) )
                    {
                    // InternalMyDsl.g:512:2: ( ( 'PRUEBAS' ) )
                    // InternalMyDsl.g:513:3: ( 'PRUEBAS' )
                    {
                     before(grammarAccess.getAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:514:3: ( 'PRUEBAS' )
                    // InternalMyDsl.g:514:4: 'PRUEBAS'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:518:2: ( ( 'QA' ) )
                    {
                    // InternalMyDsl.g:518:2: ( ( 'QA' ) )
                    // InternalMyDsl.g:519:3: ( 'QA' )
                    {
                     before(grammarAccess.getAmbienteAccess().getQAEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:520:3: ( 'QA' )
                    // InternalMyDsl.g:520:4: 'QA'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getAmbienteAccess().getQAEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:524:2: ( ( 'PRODUCCION' ) )
                    {
                    // InternalMyDsl.g:524:2: ( ( 'PRODUCCION' ) )
                    // InternalMyDsl.g:525:3: ( 'PRODUCCION' )
                    {
                     before(grammarAccess.getAmbienteAccess().getPRODUCCIONEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:526:3: ( 'PRODUCCION' )
                    // InternalMyDsl.g:526:4: 'PRODUCCION'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getAmbienteAccess().getPRODUCCIONEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ambiente__Alternatives"


    // $ANTLR start "rule__TamanoMaquina__Alternatives"
    // InternalMyDsl.g:534:1: rule__TamanoMaquina__Alternatives : ( ( ( 'MICRO' ) ) | ( ( 'SMALL' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LARGE' ) ) );
    public final void rule__TamanoMaquina__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:538:1: ( ( ( 'MICRO' ) ) | ( ( 'SMALL' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LARGE' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:539:2: ( ( 'MICRO' ) )
                    {
                    // InternalMyDsl.g:539:2: ( ( 'MICRO' ) )
                    // InternalMyDsl.g:540:3: ( 'MICRO' )
                    {
                     before(grammarAccess.getTamanoMaquinaAccess().getMICROEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:541:3: ( 'MICRO' )
                    // InternalMyDsl.g:541:4: 'MICRO'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoMaquinaAccess().getMICROEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:545:2: ( ( 'SMALL' ) )
                    {
                    // InternalMyDsl.g:545:2: ( ( 'SMALL' ) )
                    // InternalMyDsl.g:546:3: ( 'SMALL' )
                    {
                     before(grammarAccess.getTamanoMaquinaAccess().getSMALLEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:547:3: ( 'SMALL' )
                    // InternalMyDsl.g:547:4: 'SMALL'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoMaquinaAccess().getSMALLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:551:2: ( ( 'MEDIUM' ) )
                    {
                    // InternalMyDsl.g:551:2: ( ( 'MEDIUM' ) )
                    // InternalMyDsl.g:552:3: ( 'MEDIUM' )
                    {
                     before(grammarAccess.getTamanoMaquinaAccess().getMEDIUMEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:553:3: ( 'MEDIUM' )
                    // InternalMyDsl.g:553:4: 'MEDIUM'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoMaquinaAccess().getMEDIUMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:557:2: ( ( 'LARGE' ) )
                    {
                    // InternalMyDsl.g:557:2: ( ( 'LARGE' ) )
                    // InternalMyDsl.g:558:3: ( 'LARGE' )
                    {
                     before(grammarAccess.getTamanoMaquinaAccess().getLARGEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:559:3: ( 'LARGE' )
                    // InternalMyDsl.g:559:4: 'LARGE'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoMaquinaAccess().getLARGEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TamanoMaquina__Alternatives"


    // $ANTLR start "rule__SistemaOperativo__Alternatives"
    // InternalMyDsl.g:567:1: rule__SistemaOperativo__Alternatives : ( ( ( 'WINDOWS' ) ) | ( ( 'lINUX' ) ) | ( ( 'MAC' ) ) );
    public final void rule__SistemaOperativo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( ( ( 'WINDOWS' ) ) | ( ( 'lINUX' ) ) | ( ( 'MAC' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:572:2: ( ( 'WINDOWS' ) )
                    {
                    // InternalMyDsl.g:572:2: ( ( 'WINDOWS' ) )
                    // InternalMyDsl.g:573:3: ( 'WINDOWS' )
                    {
                     before(grammarAccess.getSistemaOperativoAccess().getWINDOWSEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:574:3: ( 'WINDOWS' )
                    // InternalMyDsl.g:574:4: 'WINDOWS'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaOperativoAccess().getWINDOWSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:578:2: ( ( 'lINUX' ) )
                    {
                    // InternalMyDsl.g:578:2: ( ( 'lINUX' ) )
                    // InternalMyDsl.g:579:3: ( 'lINUX' )
                    {
                     before(grammarAccess.getSistemaOperativoAccess().getLINUXEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:580:3: ( 'lINUX' )
                    // InternalMyDsl.g:580:4: 'lINUX'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaOperativoAccess().getLINUXEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:584:2: ( ( 'MAC' ) )
                    {
                    // InternalMyDsl.g:584:2: ( ( 'MAC' ) )
                    // InternalMyDsl.g:585:3: ( 'MAC' )
                    {
                     before(grammarAccess.getSistemaOperativoAccess().getMACEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:586:3: ( 'MAC' )
                    // InternalMyDsl.g:586:4: 'MAC'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaOperativoAccess().getMACEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaOperativo__Alternatives"


    // $ANTLR start "rule__SistemaManejador__Alternatives"
    // InternalMyDsl.g:594:1: rule__SistemaManejador__Alternatives : ( ( ( 'PostgreSQL' ) ) | ( ( 'MySQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'SQLServer' ) ) | ( ( 'NoSql' ) ) | ( ( 'Aurora' ) ) | ( ( 'MariaDB' ) ) | ( ( 'DocumentDB' ) ) | ( ( 'Dynamo' ) ) | ( ( 'Cassandra' ) ) | ( ( 'Redis' ) ) );
    public final void rule__SistemaManejador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( ( ( 'PostgreSQL' ) ) | ( ( 'MySQL' ) ) | ( ( 'Oracle' ) ) | ( ( 'SQLServer' ) ) | ( ( 'NoSql' ) ) | ( ( 'Aurora' ) ) | ( ( 'MariaDB' ) ) | ( ( 'DocumentDB' ) ) | ( ( 'Dynamo' ) ) | ( ( 'Cassandra' ) ) | ( ( 'Redis' ) ) )
            int alt7=11;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 32:
                {
                alt7=2;
                }
                break;
            case 33:
                {
                alt7=3;
                }
                break;
            case 34:
                {
                alt7=4;
                }
                break;
            case 35:
                {
                alt7=5;
                }
                break;
            case 36:
                {
                alt7=6;
                }
                break;
            case 37:
                {
                alt7=7;
                }
                break;
            case 38:
                {
                alt7=8;
                }
                break;
            case 39:
                {
                alt7=9;
                }
                break;
            case 40:
                {
                alt7=10;
                }
                break;
            case 41:
                {
                alt7=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:599:2: ( ( 'PostgreSQL' ) )
                    {
                    // InternalMyDsl.g:599:2: ( ( 'PostgreSQL' ) )
                    // InternalMyDsl.g:600:3: ( 'PostgreSQL' )
                    {
                     before(grammarAccess.getSistemaManejadorAccess().getPostgreSQLEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:601:3: ( 'PostgreSQL' )
                    // InternalMyDsl.g:601:4: 'PostgreSQL'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaManejadorAccess().getPostgreSQLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:605:2: ( ( 'MySQL' ) )
                    {
                    // InternalMyDsl.g:605:2: ( ( 'MySQL' ) )
                    // InternalMyDsl.g:606:3: ( 'MySQL' )
                    {
                     before(grammarAccess.getSistemaManejadorAccess().getMySQLEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:607:3: ( 'MySQL' )
                    // InternalMyDsl.g:607:4: 'MySQL'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaManejadorAccess().getMySQLEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:611:2: ( ( 'Oracle' ) )
                    {
                    // InternalMyDsl.g:611:2: ( ( 'Oracle' ) )
                    // InternalMyDsl.g:612:3: ( 'Oracle' )
                    {
                     before(grammarAccess.getSistemaManejadorAccess().getOracleEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:613:3: ( 'Oracle' )
                    // InternalMyDsl.g:613:4: 'Oracle'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaManejadorAccess().getOracleEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:617:2: ( ( 'SQLServer' ) )
                    {
                    // InternalMyDsl.g:617:2: ( ( 'SQLServer' ) )
                    // InternalMyDsl.g:618:3: ( 'SQLServer' )
                    {
                     before(grammarAccess.getSistemaManejadorAccess().getSQLServerEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:619:3: ( 'SQLServer' )
                    // InternalMyDsl.g:619:4: 'SQLServer'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaManejadorAccess().getSQLServerEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:623:2: ( ( 'NoSql' ) )
                    {
                    // InternalMyDsl.g:623:2: ( ( 'NoSql' ) )
                    // InternalMyDsl.g:624:3: ( 'NoSql' )
                    {
                     before(grammarAccess.getSistemaManejadorAccess().getNoSqlEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:625:3: ( 'NoSql' )
                    // InternalMyDsl.g:625:4: 'NoSql'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaManejadorAccess().getNoSqlEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:629:2: ( ( 'Aurora' ) )
                    {
                    // InternalMyDsl.g:629:2: ( ( 'Aurora' ) )
                    // InternalMyDsl.g:630:3: ( 'Aurora' )
                    {
                     before(grammarAccess.getSistemaManejadorAccess().getAuroraEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:631:3: ( 'Aurora' )
                    // InternalMyDsl.g:631:4: 'Aurora'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaManejadorAccess().getAuroraEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:635:2: ( ( 'MariaDB' ) )
                    {
                    // InternalMyDsl.g:635:2: ( ( 'MariaDB' ) )
                    // InternalMyDsl.g:636:3: ( 'MariaDB' )
                    {
                     before(grammarAccess.getSistemaManejadorAccess().getMariaDBEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:637:3: ( 'MariaDB' )
                    // InternalMyDsl.g:637:4: 'MariaDB'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaManejadorAccess().getMariaDBEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:641:2: ( ( 'DocumentDB' ) )
                    {
                    // InternalMyDsl.g:641:2: ( ( 'DocumentDB' ) )
                    // InternalMyDsl.g:642:3: ( 'DocumentDB' )
                    {
                     before(grammarAccess.getSistemaManejadorAccess().getDocumentDBEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:643:3: ( 'DocumentDB' )
                    // InternalMyDsl.g:643:4: 'DocumentDB'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaManejadorAccess().getDocumentDBEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:647:2: ( ( 'Dynamo' ) )
                    {
                    // InternalMyDsl.g:647:2: ( ( 'Dynamo' ) )
                    // InternalMyDsl.g:648:3: ( 'Dynamo' )
                    {
                     before(grammarAccess.getSistemaManejadorAccess().getDynamoEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:649:3: ( 'Dynamo' )
                    // InternalMyDsl.g:649:4: 'Dynamo'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaManejadorAccess().getDynamoEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:653:2: ( ( 'Cassandra' ) )
                    {
                    // InternalMyDsl.g:653:2: ( ( 'Cassandra' ) )
                    // InternalMyDsl.g:654:3: ( 'Cassandra' )
                    {
                     before(grammarAccess.getSistemaManejadorAccess().getCassandraEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:655:3: ( 'Cassandra' )
                    // InternalMyDsl.g:655:4: 'Cassandra'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaManejadorAccess().getCassandraEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:659:2: ( ( 'Redis' ) )
                    {
                    // InternalMyDsl.g:659:2: ( ( 'Redis' ) )
                    // InternalMyDsl.g:660:3: ( 'Redis' )
                    {
                     before(grammarAccess.getSistemaManejadorAccess().getRedisEnumLiteralDeclaration_10()); 
                    // InternalMyDsl.g:661:3: ( 'Redis' )
                    // InternalMyDsl.g:661:4: 'Redis'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getSistemaManejadorAccess().getRedisEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SistemaManejador__Alternatives"


    // $ANTLR start "rule__Infraestructura__Group__0"
    // InternalMyDsl.g:669:1: rule__Infraestructura__Group__0 : rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1 ;
    public final void rule__Infraestructura__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:1: ( rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1 )
            // InternalMyDsl.g:674:2: rule__Infraestructura__Group__0__Impl rule__Infraestructura__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Infraestructura__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__0"


    // $ANTLR start "rule__Infraestructura__Group__0__Impl"
    // InternalMyDsl.g:681:1: rule__Infraestructura__Group__0__Impl : ( () ) ;
    public final void rule__Infraestructura__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:685:1: ( ( () ) )
            // InternalMyDsl.g:686:1: ( () )
            {
            // InternalMyDsl.g:686:1: ( () )
            // InternalMyDsl.g:687:2: ()
            {
             before(grammarAccess.getInfraestructuraAccess().getInfraestructuraAction_0()); 
            // InternalMyDsl.g:688:2: ()
            // InternalMyDsl.g:688:3: 
            {
            }

             after(grammarAccess.getInfraestructuraAccess().getInfraestructuraAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__0__Impl"


    // $ANTLR start "rule__Infraestructura__Group__1"
    // InternalMyDsl.g:696:1: rule__Infraestructura__Group__1 : rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2 ;
    public final void rule__Infraestructura__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:700:1: ( rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2 )
            // InternalMyDsl.g:701:2: rule__Infraestructura__Group__1__Impl rule__Infraestructura__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Infraestructura__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__1"


    // $ANTLR start "rule__Infraestructura__Group__1__Impl"
    // InternalMyDsl.g:708:1: rule__Infraestructura__Group__1__Impl : ( 'Infraestructura' ) ;
    public final void rule__Infraestructura__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:712:1: ( ( 'Infraestructura' ) )
            // InternalMyDsl.g:713:1: ( 'Infraestructura' )
            {
            // InternalMyDsl.g:713:1: ( 'Infraestructura' )
            // InternalMyDsl.g:714:2: 'Infraestructura'
            {
             before(grammarAccess.getInfraestructuraAccess().getInfraestructuraKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getInfraestructuraKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__1__Impl"


    // $ANTLR start "rule__Infraestructura__Group__2"
    // InternalMyDsl.g:723:1: rule__Infraestructura__Group__2 : rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3 ;
    public final void rule__Infraestructura__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3 )
            // InternalMyDsl.g:728:2: rule__Infraestructura__Group__2__Impl rule__Infraestructura__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Infraestructura__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__2"


    // $ANTLR start "rule__Infraestructura__Group__2__Impl"
    // InternalMyDsl.g:735:1: rule__Infraestructura__Group__2__Impl : ( ( rule__Infraestructura__NombreProyectoAssignment_2 ) ) ;
    public final void rule__Infraestructura__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( ( ( rule__Infraestructura__NombreProyectoAssignment_2 ) ) )
            // InternalMyDsl.g:740:1: ( ( rule__Infraestructura__NombreProyectoAssignment_2 ) )
            {
            // InternalMyDsl.g:740:1: ( ( rule__Infraestructura__NombreProyectoAssignment_2 ) )
            // InternalMyDsl.g:741:2: ( rule__Infraestructura__NombreProyectoAssignment_2 )
            {
             before(grammarAccess.getInfraestructuraAccess().getNombreProyectoAssignment_2()); 
            // InternalMyDsl.g:742:2: ( rule__Infraestructura__NombreProyectoAssignment_2 )
            // InternalMyDsl.g:742:3: rule__Infraestructura__NombreProyectoAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__NombreProyectoAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getNombreProyectoAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__2__Impl"


    // $ANTLR start "rule__Infraestructura__Group__3"
    // InternalMyDsl.g:750:1: rule__Infraestructura__Group__3 : rule__Infraestructura__Group__3__Impl rule__Infraestructura__Group__4 ;
    public final void rule__Infraestructura__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( rule__Infraestructura__Group__3__Impl rule__Infraestructura__Group__4 )
            // InternalMyDsl.g:755:2: rule__Infraestructura__Group__3__Impl rule__Infraestructura__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Infraestructura__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__3"


    // $ANTLR start "rule__Infraestructura__Group__3__Impl"
    // InternalMyDsl.g:762:1: rule__Infraestructura__Group__3__Impl : ( RULE_OPEN_BRACE ) ;
    public final void rule__Infraestructura__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:1: ( ( RULE_OPEN_BRACE ) )
            // InternalMyDsl.g:767:1: ( RULE_OPEN_BRACE )
            {
            // InternalMyDsl.g:767:1: ( RULE_OPEN_BRACE )
            // InternalMyDsl.g:768:2: RULE_OPEN_BRACE
            {
             before(grammarAccess.getInfraestructuraAccess().getOPEN_BRACETerminalRuleCall_3()); 
            match(input,RULE_OPEN_BRACE,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getOPEN_BRACETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__3__Impl"


    // $ANTLR start "rule__Infraestructura__Group__4"
    // InternalMyDsl.g:777:1: rule__Infraestructura__Group__4 : rule__Infraestructura__Group__4__Impl rule__Infraestructura__Group__5 ;
    public final void rule__Infraestructura__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:781:1: ( rule__Infraestructura__Group__4__Impl rule__Infraestructura__Group__5 )
            // InternalMyDsl.g:782:2: rule__Infraestructura__Group__4__Impl rule__Infraestructura__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Infraestructura__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__4"


    // $ANTLR start "rule__Infraestructura__Group__4__Impl"
    // InternalMyDsl.g:789:1: rule__Infraestructura__Group__4__Impl : ( ( rule__Infraestructura__Group_4__0 ) ) ;
    public final void rule__Infraestructura__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( ( ( rule__Infraestructura__Group_4__0 ) ) )
            // InternalMyDsl.g:794:1: ( ( rule__Infraestructura__Group_4__0 ) )
            {
            // InternalMyDsl.g:794:1: ( ( rule__Infraestructura__Group_4__0 ) )
            // InternalMyDsl.g:795:2: ( rule__Infraestructura__Group_4__0 )
            {
             before(grammarAccess.getInfraestructuraAccess().getGroup_4()); 
            // InternalMyDsl.g:796:2: ( rule__Infraestructura__Group_4__0 )
            // InternalMyDsl.g:796:3: rule__Infraestructura__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__4__Impl"


    // $ANTLR start "rule__Infraestructura__Group__5"
    // InternalMyDsl.g:804:1: rule__Infraestructura__Group__5 : rule__Infraestructura__Group__5__Impl rule__Infraestructura__Group__6 ;
    public final void rule__Infraestructura__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:808:1: ( rule__Infraestructura__Group__5__Impl rule__Infraestructura__Group__6 )
            // InternalMyDsl.g:809:2: rule__Infraestructura__Group__5__Impl rule__Infraestructura__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Infraestructura__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__5"


    // $ANTLR start "rule__Infraestructura__Group__5__Impl"
    // InternalMyDsl.g:816:1: rule__Infraestructura__Group__5__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Infraestructura__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:821:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:821:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:822:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_5()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__5__Impl"


    // $ANTLR start "rule__Infraestructura__Group__6"
    // InternalMyDsl.g:831:1: rule__Infraestructura__Group__6 : rule__Infraestructura__Group__6__Impl rule__Infraestructura__Group__7 ;
    public final void rule__Infraestructura__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:835:1: ( rule__Infraestructura__Group__6__Impl rule__Infraestructura__Group__7 )
            // InternalMyDsl.g:836:2: rule__Infraestructura__Group__6__Impl rule__Infraestructura__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Infraestructura__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__6"


    // $ANTLR start "rule__Infraestructura__Group__6__Impl"
    // InternalMyDsl.g:843:1: rule__Infraestructura__Group__6__Impl : ( ( rule__Infraestructura__Group_6__0 ) ) ;
    public final void rule__Infraestructura__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( ( ( rule__Infraestructura__Group_6__0 ) ) )
            // InternalMyDsl.g:848:1: ( ( rule__Infraestructura__Group_6__0 ) )
            {
            // InternalMyDsl.g:848:1: ( ( rule__Infraestructura__Group_6__0 ) )
            // InternalMyDsl.g:849:2: ( rule__Infraestructura__Group_6__0 )
            {
             before(grammarAccess.getInfraestructuraAccess().getGroup_6()); 
            // InternalMyDsl.g:850:2: ( rule__Infraestructura__Group_6__0 )
            // InternalMyDsl.g:850:3: rule__Infraestructura__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__6__Impl"


    // $ANTLR start "rule__Infraestructura__Group__7"
    // InternalMyDsl.g:858:1: rule__Infraestructura__Group__7 : rule__Infraestructura__Group__7__Impl rule__Infraestructura__Group__8 ;
    public final void rule__Infraestructura__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:862:1: ( rule__Infraestructura__Group__7__Impl rule__Infraestructura__Group__8 )
            // InternalMyDsl.g:863:2: rule__Infraestructura__Group__7__Impl rule__Infraestructura__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Infraestructura__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__7"


    // $ANTLR start "rule__Infraestructura__Group__7__Impl"
    // InternalMyDsl.g:870:1: rule__Infraestructura__Group__7__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Infraestructura__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:875:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:875:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:876:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_7()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__7__Impl"


    // $ANTLR start "rule__Infraestructura__Group__8"
    // InternalMyDsl.g:885:1: rule__Infraestructura__Group__8 : rule__Infraestructura__Group__8__Impl rule__Infraestructura__Group__9 ;
    public final void rule__Infraestructura__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:889:1: ( rule__Infraestructura__Group__8__Impl rule__Infraestructura__Group__9 )
            // InternalMyDsl.g:890:2: rule__Infraestructura__Group__8__Impl rule__Infraestructura__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Infraestructura__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__8"


    // $ANTLR start "rule__Infraestructura__Group__8__Impl"
    // InternalMyDsl.g:897:1: rule__Infraestructura__Group__8__Impl : ( ( rule__Infraestructura__Group_8__0 )? ) ;
    public final void rule__Infraestructura__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:901:1: ( ( ( rule__Infraestructura__Group_8__0 )? ) )
            // InternalMyDsl.g:902:1: ( ( rule__Infraestructura__Group_8__0 )? )
            {
            // InternalMyDsl.g:902:1: ( ( rule__Infraestructura__Group_8__0 )? )
            // InternalMyDsl.g:903:2: ( rule__Infraestructura__Group_8__0 )?
            {
             before(grammarAccess.getInfraestructuraAccess().getGroup_8()); 
            // InternalMyDsl.g:904:2: ( rule__Infraestructura__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==45) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:904:3: rule__Infraestructura__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Infraestructura__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInfraestructuraAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__8__Impl"


    // $ANTLR start "rule__Infraestructura__Group__9"
    // InternalMyDsl.g:912:1: rule__Infraestructura__Group__9 : rule__Infraestructura__Group__9__Impl rule__Infraestructura__Group__10 ;
    public final void rule__Infraestructura__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( rule__Infraestructura__Group__9__Impl rule__Infraestructura__Group__10 )
            // InternalMyDsl.g:917:2: rule__Infraestructura__Group__9__Impl rule__Infraestructura__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Infraestructura__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__9"


    // $ANTLR start "rule__Infraestructura__Group__9__Impl"
    // InternalMyDsl.g:924:1: rule__Infraestructura__Group__9__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Infraestructura__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:929:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:929:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:930:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_9()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__9__Impl"


    // $ANTLR start "rule__Infraestructura__Group__10"
    // InternalMyDsl.g:939:1: rule__Infraestructura__Group__10 : rule__Infraestructura__Group__10__Impl rule__Infraestructura__Group__11 ;
    public final void rule__Infraestructura__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( rule__Infraestructura__Group__10__Impl rule__Infraestructura__Group__11 )
            // InternalMyDsl.g:944:2: rule__Infraestructura__Group__10__Impl rule__Infraestructura__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Infraestructura__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__10"


    // $ANTLR start "rule__Infraestructura__Group__10__Impl"
    // InternalMyDsl.g:951:1: rule__Infraestructura__Group__10__Impl : ( ( rule__Infraestructura__Group_10__0 )? ) ;
    public final void rule__Infraestructura__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( ( ( rule__Infraestructura__Group_10__0 )? ) )
            // InternalMyDsl.g:956:1: ( ( rule__Infraestructura__Group_10__0 )? )
            {
            // InternalMyDsl.g:956:1: ( ( rule__Infraestructura__Group_10__0 )? )
            // InternalMyDsl.g:957:2: ( rule__Infraestructura__Group_10__0 )?
            {
             before(grammarAccess.getInfraestructuraAccess().getGroup_10()); 
            // InternalMyDsl.g:958:2: ( rule__Infraestructura__Group_10__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==46) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:958:3: rule__Infraestructura__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Infraestructura__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInfraestructuraAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__10__Impl"


    // $ANTLR start "rule__Infraestructura__Group__11"
    // InternalMyDsl.g:966:1: rule__Infraestructura__Group__11 : rule__Infraestructura__Group__11__Impl ;
    public final void rule__Infraestructura__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( rule__Infraestructura__Group__11__Impl )
            // InternalMyDsl.g:971:2: rule__Infraestructura__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__11"


    // $ANTLR start "rule__Infraestructura__Group__11__Impl"
    // InternalMyDsl.g:977:1: rule__Infraestructura__Group__11__Impl : ( RULE_CLOSE_BRACE ) ;
    public final void rule__Infraestructura__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( ( RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:982:1: ( RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:982:1: ( RULE_CLOSE_BRACE )
            // InternalMyDsl.g:983:2: RULE_CLOSE_BRACE
            {
             before(grammarAccess.getInfraestructuraAccess().getCLOSE_BRACETerminalRuleCall_11()); 
            match(input,RULE_CLOSE_BRACE,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getCLOSE_BRACETerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group__11__Impl"


    // $ANTLR start "rule__Infraestructura__Group_4__0"
    // InternalMyDsl.g:993:1: rule__Infraestructura__Group_4__0 : rule__Infraestructura__Group_4__0__Impl rule__Infraestructura__Group_4__1 ;
    public final void rule__Infraestructura__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( rule__Infraestructura__Group_4__0__Impl rule__Infraestructura__Group_4__1 )
            // InternalMyDsl.g:998:2: rule__Infraestructura__Group_4__0__Impl rule__Infraestructura__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Infraestructura__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_4__0"


    // $ANTLR start "rule__Infraestructura__Group_4__0__Impl"
    // InternalMyDsl.g:1005:1: rule__Infraestructura__Group_4__0__Impl : ( 'tipo' ) ;
    public final void rule__Infraestructura__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:1010:1: ( 'tipo' )
            {
            // InternalMyDsl.g:1010:1: ( 'tipo' )
            // InternalMyDsl.g:1011:2: 'tipo'
            {
             before(grammarAccess.getInfraestructuraAccess().getTipoKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getTipoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_4__0__Impl"


    // $ANTLR start "rule__Infraestructura__Group_4__1"
    // InternalMyDsl.g:1020:1: rule__Infraestructura__Group_4__1 : rule__Infraestructura__Group_4__1__Impl rule__Infraestructura__Group_4__2 ;
    public final void rule__Infraestructura__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( rule__Infraestructura__Group_4__1__Impl rule__Infraestructura__Group_4__2 )
            // InternalMyDsl.g:1025:2: rule__Infraestructura__Group_4__1__Impl rule__Infraestructura__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__Infraestructura__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_4__1"


    // $ANTLR start "rule__Infraestructura__Group_4__1__Impl"
    // InternalMyDsl.g:1032:1: rule__Infraestructura__Group_4__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Infraestructura__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:1037:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:1037:1: ( RULE_EQUALS )
            // InternalMyDsl.g:1038:2: RULE_EQUALS
            {
             before(grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_4_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_4__1__Impl"


    // $ANTLR start "rule__Infraestructura__Group_4__2"
    // InternalMyDsl.g:1047:1: rule__Infraestructura__Group_4__2 : rule__Infraestructura__Group_4__2__Impl ;
    public final void rule__Infraestructura__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( rule__Infraestructura__Group_4__2__Impl )
            // InternalMyDsl.g:1052:2: rule__Infraestructura__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_4__2"


    // $ANTLR start "rule__Infraestructura__Group_4__2__Impl"
    // InternalMyDsl.g:1058:1: rule__Infraestructura__Group_4__2__Impl : ( ( rule__Infraestructura__TipoAssignment_4_2 ) ) ;
    public final void rule__Infraestructura__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( ( ( rule__Infraestructura__TipoAssignment_4_2 ) ) )
            // InternalMyDsl.g:1063:1: ( ( rule__Infraestructura__TipoAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1063:1: ( ( rule__Infraestructura__TipoAssignment_4_2 ) )
            // InternalMyDsl.g:1064:2: ( rule__Infraestructura__TipoAssignment_4_2 )
            {
             before(grammarAccess.getInfraestructuraAccess().getTipoAssignment_4_2()); 
            // InternalMyDsl.g:1065:2: ( rule__Infraestructura__TipoAssignment_4_2 )
            // InternalMyDsl.g:1065:3: rule__Infraestructura__TipoAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__TipoAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getTipoAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_4__2__Impl"


    // $ANTLR start "rule__Infraestructura__Group_6__0"
    // InternalMyDsl.g:1074:1: rule__Infraestructura__Group_6__0 : rule__Infraestructura__Group_6__0__Impl rule__Infraestructura__Group_6__1 ;
    public final void rule__Infraestructura__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( rule__Infraestructura__Group_6__0__Impl rule__Infraestructura__Group_6__1 )
            // InternalMyDsl.g:1079:2: rule__Infraestructura__Group_6__0__Impl rule__Infraestructura__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Infraestructura__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_6__0"


    // $ANTLR start "rule__Infraestructura__Group_6__0__Impl"
    // InternalMyDsl.g:1086:1: rule__Infraestructura__Group_6__0__Impl : ( 'login' ) ;
    public final void rule__Infraestructura__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( ( 'login' ) )
            // InternalMyDsl.g:1091:1: ( 'login' )
            {
            // InternalMyDsl.g:1091:1: ( 'login' )
            // InternalMyDsl.g:1092:2: 'login'
            {
             before(grammarAccess.getInfraestructuraAccess().getLoginKeyword_6_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getLoginKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_6__0__Impl"


    // $ANTLR start "rule__Infraestructura__Group_6__1"
    // InternalMyDsl.g:1101:1: rule__Infraestructura__Group_6__1 : rule__Infraestructura__Group_6__1__Impl rule__Infraestructura__Group_6__2 ;
    public final void rule__Infraestructura__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( rule__Infraestructura__Group_6__1__Impl rule__Infraestructura__Group_6__2 )
            // InternalMyDsl.g:1106:2: rule__Infraestructura__Group_6__1__Impl rule__Infraestructura__Group_6__2
            {
            pushFollow(FOLLOW_5);
            rule__Infraestructura__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_6__1"


    // $ANTLR start "rule__Infraestructura__Group_6__1__Impl"
    // InternalMyDsl.g:1113:1: rule__Infraestructura__Group_6__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Infraestructura__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:1118:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:1118:1: ( RULE_EQUALS )
            // InternalMyDsl.g:1119:2: RULE_EQUALS
            {
             before(grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_6_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_6__1__Impl"


    // $ANTLR start "rule__Infraestructura__Group_6__2"
    // InternalMyDsl.g:1128:1: rule__Infraestructura__Group_6__2 : rule__Infraestructura__Group_6__2__Impl ;
    public final void rule__Infraestructura__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( rule__Infraestructura__Group_6__2__Impl )
            // InternalMyDsl.g:1133:2: rule__Infraestructura__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_6__2"


    // $ANTLR start "rule__Infraestructura__Group_6__2__Impl"
    // InternalMyDsl.g:1139:1: rule__Infraestructura__Group_6__2__Impl : ( ( rule__Infraestructura__LoginsAssignment_6_2 ) ) ;
    public final void rule__Infraestructura__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( ( ( rule__Infraestructura__LoginsAssignment_6_2 ) ) )
            // InternalMyDsl.g:1144:1: ( ( rule__Infraestructura__LoginsAssignment_6_2 ) )
            {
            // InternalMyDsl.g:1144:1: ( ( rule__Infraestructura__LoginsAssignment_6_2 ) )
            // InternalMyDsl.g:1145:2: ( rule__Infraestructura__LoginsAssignment_6_2 )
            {
             before(grammarAccess.getInfraestructuraAccess().getLoginsAssignment_6_2()); 
            // InternalMyDsl.g:1146:2: ( rule__Infraestructura__LoginsAssignment_6_2 )
            // InternalMyDsl.g:1146:3: rule__Infraestructura__LoginsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__LoginsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getLoginsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_6__2__Impl"


    // $ANTLR start "rule__Infraestructura__Group_8__0"
    // InternalMyDsl.g:1155:1: rule__Infraestructura__Group_8__0 : rule__Infraestructura__Group_8__0__Impl rule__Infraestructura__Group_8__1 ;
    public final void rule__Infraestructura__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( rule__Infraestructura__Group_8__0__Impl rule__Infraestructura__Group_8__1 )
            // InternalMyDsl.g:1160:2: rule__Infraestructura__Group_8__0__Impl rule__Infraestructura__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__Infraestructura__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__0"


    // $ANTLR start "rule__Infraestructura__Group_8__0__Impl"
    // InternalMyDsl.g:1167:1: rule__Infraestructura__Group_8__0__Impl : ( 'securityGroup' ) ;
    public final void rule__Infraestructura__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( 'securityGroup' ) )
            // InternalMyDsl.g:1172:1: ( 'securityGroup' )
            {
            // InternalMyDsl.g:1172:1: ( 'securityGroup' )
            // InternalMyDsl.g:1173:2: 'securityGroup'
            {
             before(grammarAccess.getInfraestructuraAccess().getSecurityGroupKeyword_8_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getSecurityGroupKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__0__Impl"


    // $ANTLR start "rule__Infraestructura__Group_8__1"
    // InternalMyDsl.g:1182:1: rule__Infraestructura__Group_8__1 : rule__Infraestructura__Group_8__1__Impl rule__Infraestructura__Group_8__2 ;
    public final void rule__Infraestructura__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( rule__Infraestructura__Group_8__1__Impl rule__Infraestructura__Group_8__2 )
            // InternalMyDsl.g:1187:2: rule__Infraestructura__Group_8__1__Impl rule__Infraestructura__Group_8__2
            {
            pushFollow(FOLLOW_13);
            rule__Infraestructura__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__1"


    // $ANTLR start "rule__Infraestructura__Group_8__1__Impl"
    // InternalMyDsl.g:1194:1: rule__Infraestructura__Group_8__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Infraestructura__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:1199:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:1199:1: ( RULE_EQUALS )
            // InternalMyDsl.g:1200:2: RULE_EQUALS
            {
             before(grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_8_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__1__Impl"


    // $ANTLR start "rule__Infraestructura__Group_8__2"
    // InternalMyDsl.g:1209:1: rule__Infraestructura__Group_8__2 : rule__Infraestructura__Group_8__2__Impl rule__Infraestructura__Group_8__3 ;
    public final void rule__Infraestructura__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( rule__Infraestructura__Group_8__2__Impl rule__Infraestructura__Group_8__3 )
            // InternalMyDsl.g:1214:2: rule__Infraestructura__Group_8__2__Impl rule__Infraestructura__Group_8__3
            {
            pushFollow(FOLLOW_5);
            rule__Infraestructura__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__2"


    // $ANTLR start "rule__Infraestructura__Group_8__2__Impl"
    // InternalMyDsl.g:1221:1: rule__Infraestructura__Group_8__2__Impl : ( RULE_OPEN_BRACKET ) ;
    public final void rule__Infraestructura__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( ( RULE_OPEN_BRACKET ) )
            // InternalMyDsl.g:1226:1: ( RULE_OPEN_BRACKET )
            {
            // InternalMyDsl.g:1226:1: ( RULE_OPEN_BRACKET )
            // InternalMyDsl.g:1227:2: RULE_OPEN_BRACKET
            {
             before(grammarAccess.getInfraestructuraAccess().getOPEN_BRACKETTerminalRuleCall_8_2()); 
            match(input,RULE_OPEN_BRACKET,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getOPEN_BRACKETTerminalRuleCall_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__2__Impl"


    // $ANTLR start "rule__Infraestructura__Group_8__3"
    // InternalMyDsl.g:1236:1: rule__Infraestructura__Group_8__3 : rule__Infraestructura__Group_8__3__Impl rule__Infraestructura__Group_8__4 ;
    public final void rule__Infraestructura__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( rule__Infraestructura__Group_8__3__Impl rule__Infraestructura__Group_8__4 )
            // InternalMyDsl.g:1241:2: rule__Infraestructura__Group_8__3__Impl rule__Infraestructura__Group_8__4
            {
            pushFollow(FOLLOW_14);
            rule__Infraestructura__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__3"


    // $ANTLR start "rule__Infraestructura__Group_8__3__Impl"
    // InternalMyDsl.g:1248:1: rule__Infraestructura__Group_8__3__Impl : ( ( rule__Infraestructura__SecuritygroupsAssignment_8_3 ) ) ;
    public final void rule__Infraestructura__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( ( ( rule__Infraestructura__SecuritygroupsAssignment_8_3 ) ) )
            // InternalMyDsl.g:1253:1: ( ( rule__Infraestructura__SecuritygroupsAssignment_8_3 ) )
            {
            // InternalMyDsl.g:1253:1: ( ( rule__Infraestructura__SecuritygroupsAssignment_8_3 ) )
            // InternalMyDsl.g:1254:2: ( rule__Infraestructura__SecuritygroupsAssignment_8_3 )
            {
             before(grammarAccess.getInfraestructuraAccess().getSecuritygroupsAssignment_8_3()); 
            // InternalMyDsl.g:1255:2: ( rule__Infraestructura__SecuritygroupsAssignment_8_3 )
            // InternalMyDsl.g:1255:3: rule__Infraestructura__SecuritygroupsAssignment_8_3
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__SecuritygroupsAssignment_8_3();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getSecuritygroupsAssignment_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__3__Impl"


    // $ANTLR start "rule__Infraestructura__Group_8__4"
    // InternalMyDsl.g:1263:1: rule__Infraestructura__Group_8__4 : rule__Infraestructura__Group_8__4__Impl rule__Infraestructura__Group_8__5 ;
    public final void rule__Infraestructura__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( rule__Infraestructura__Group_8__4__Impl rule__Infraestructura__Group_8__5 )
            // InternalMyDsl.g:1268:2: rule__Infraestructura__Group_8__4__Impl rule__Infraestructura__Group_8__5
            {
            pushFollow(FOLLOW_14);
            rule__Infraestructura__Group_8__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_8__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__4"


    // $ANTLR start "rule__Infraestructura__Group_8__4__Impl"
    // InternalMyDsl.g:1275:1: rule__Infraestructura__Group_8__4__Impl : ( ( rule__Infraestructura__Group_8_4__0 )* ) ;
    public final void rule__Infraestructura__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( ( ( rule__Infraestructura__Group_8_4__0 )* ) )
            // InternalMyDsl.g:1280:1: ( ( rule__Infraestructura__Group_8_4__0 )* )
            {
            // InternalMyDsl.g:1280:1: ( ( rule__Infraestructura__Group_8_4__0 )* )
            // InternalMyDsl.g:1281:2: ( rule__Infraestructura__Group_8_4__0 )*
            {
             before(grammarAccess.getInfraestructuraAccess().getGroup_8_4()); 
            // InternalMyDsl.g:1282:2: ( rule__Infraestructura__Group_8_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1282:3: rule__Infraestructura__Group_8_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Infraestructura__Group_8_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getInfraestructuraAccess().getGroup_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__4__Impl"


    // $ANTLR start "rule__Infraestructura__Group_8__5"
    // InternalMyDsl.g:1290:1: rule__Infraestructura__Group_8__5 : rule__Infraestructura__Group_8__5__Impl ;
    public final void rule__Infraestructura__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( rule__Infraestructura__Group_8__5__Impl )
            // InternalMyDsl.g:1295:2: rule__Infraestructura__Group_8__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_8__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__5"


    // $ANTLR start "rule__Infraestructura__Group_8__5__Impl"
    // InternalMyDsl.g:1301:1: rule__Infraestructura__Group_8__5__Impl : ( RULE_CLOSE_BRACKET ) ;
    public final void rule__Infraestructura__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( ( RULE_CLOSE_BRACKET ) )
            // InternalMyDsl.g:1306:1: ( RULE_CLOSE_BRACKET )
            {
            // InternalMyDsl.g:1306:1: ( RULE_CLOSE_BRACKET )
            // InternalMyDsl.g:1307:2: RULE_CLOSE_BRACKET
            {
             before(grammarAccess.getInfraestructuraAccess().getCLOSE_BRACKETTerminalRuleCall_8_5()); 
            match(input,RULE_CLOSE_BRACKET,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getCLOSE_BRACKETTerminalRuleCall_8_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8__5__Impl"


    // $ANTLR start "rule__Infraestructura__Group_8_4__0"
    // InternalMyDsl.g:1317:1: rule__Infraestructura__Group_8_4__0 : rule__Infraestructura__Group_8_4__0__Impl rule__Infraestructura__Group_8_4__1 ;
    public final void rule__Infraestructura__Group_8_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( rule__Infraestructura__Group_8_4__0__Impl rule__Infraestructura__Group_8_4__1 )
            // InternalMyDsl.g:1322:2: rule__Infraestructura__Group_8_4__0__Impl rule__Infraestructura__Group_8_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Infraestructura__Group_8_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_8_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8_4__0"


    // $ANTLR start "rule__Infraestructura__Group_8_4__0__Impl"
    // InternalMyDsl.g:1329:1: rule__Infraestructura__Group_8_4__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Infraestructura__Group_8_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( ( RULE_COMMA ) )
            // InternalMyDsl.g:1334:1: ( RULE_COMMA )
            {
            // InternalMyDsl.g:1334:1: ( RULE_COMMA )
            // InternalMyDsl.g:1335:2: RULE_COMMA
            {
             before(grammarAccess.getInfraestructuraAccess().getCOMMATerminalRuleCall_8_4_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getCOMMATerminalRuleCall_8_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8_4__0__Impl"


    // $ANTLR start "rule__Infraestructura__Group_8_4__1"
    // InternalMyDsl.g:1344:1: rule__Infraestructura__Group_8_4__1 : rule__Infraestructura__Group_8_4__1__Impl ;
    public final void rule__Infraestructura__Group_8_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( rule__Infraestructura__Group_8_4__1__Impl )
            // InternalMyDsl.g:1349:2: rule__Infraestructura__Group_8_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_8_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8_4__1"


    // $ANTLR start "rule__Infraestructura__Group_8_4__1__Impl"
    // InternalMyDsl.g:1355:1: rule__Infraestructura__Group_8_4__1__Impl : ( ( rule__Infraestructura__SecuritygroupsAssignment_8_4_1 ) ) ;
    public final void rule__Infraestructura__Group_8_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1359:1: ( ( ( rule__Infraestructura__SecuritygroupsAssignment_8_4_1 ) ) )
            // InternalMyDsl.g:1360:1: ( ( rule__Infraestructura__SecuritygroupsAssignment_8_4_1 ) )
            {
            // InternalMyDsl.g:1360:1: ( ( rule__Infraestructura__SecuritygroupsAssignment_8_4_1 ) )
            // InternalMyDsl.g:1361:2: ( rule__Infraestructura__SecuritygroupsAssignment_8_4_1 )
            {
             before(grammarAccess.getInfraestructuraAccess().getSecuritygroupsAssignment_8_4_1()); 
            // InternalMyDsl.g:1362:2: ( rule__Infraestructura__SecuritygroupsAssignment_8_4_1 )
            // InternalMyDsl.g:1362:3: rule__Infraestructura__SecuritygroupsAssignment_8_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__SecuritygroupsAssignment_8_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getSecuritygroupsAssignment_8_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_8_4__1__Impl"


    // $ANTLR start "rule__Infraestructura__Group_10__0"
    // InternalMyDsl.g:1371:1: rule__Infraestructura__Group_10__0 : rule__Infraestructura__Group_10__0__Impl rule__Infraestructura__Group_10__1 ;
    public final void rule__Infraestructura__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( rule__Infraestructura__Group_10__0__Impl rule__Infraestructura__Group_10__1 )
            // InternalMyDsl.g:1376:2: rule__Infraestructura__Group_10__0__Impl rule__Infraestructura__Group_10__1
            {
            pushFollow(FOLLOW_11);
            rule__Infraestructura__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__0"


    // $ANTLR start "rule__Infraestructura__Group_10__0__Impl"
    // InternalMyDsl.g:1383:1: rule__Infraestructura__Group_10__0__Impl : ( 'ambientesdespliegue' ) ;
    public final void rule__Infraestructura__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( ( 'ambientesdespliegue' ) )
            // InternalMyDsl.g:1388:1: ( 'ambientesdespliegue' )
            {
            // InternalMyDsl.g:1388:1: ( 'ambientesdespliegue' )
            // InternalMyDsl.g:1389:2: 'ambientesdespliegue'
            {
             before(grammarAccess.getInfraestructuraAccess().getAmbientesdespliegueKeyword_10_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getAmbientesdespliegueKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__0__Impl"


    // $ANTLR start "rule__Infraestructura__Group_10__1"
    // InternalMyDsl.g:1398:1: rule__Infraestructura__Group_10__1 : rule__Infraestructura__Group_10__1__Impl rule__Infraestructura__Group_10__2 ;
    public final void rule__Infraestructura__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( rule__Infraestructura__Group_10__1__Impl rule__Infraestructura__Group_10__2 )
            // InternalMyDsl.g:1403:2: rule__Infraestructura__Group_10__1__Impl rule__Infraestructura__Group_10__2
            {
            pushFollow(FOLLOW_13);
            rule__Infraestructura__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__1"


    // $ANTLR start "rule__Infraestructura__Group_10__1__Impl"
    // InternalMyDsl.g:1410:1: rule__Infraestructura__Group_10__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Infraestructura__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1414:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:1415:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:1415:1: ( RULE_EQUALS )
            // InternalMyDsl.g:1416:2: RULE_EQUALS
            {
             before(grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_10_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__1__Impl"


    // $ANTLR start "rule__Infraestructura__Group_10__2"
    // InternalMyDsl.g:1425:1: rule__Infraestructura__Group_10__2 : rule__Infraestructura__Group_10__2__Impl rule__Infraestructura__Group_10__3 ;
    public final void rule__Infraestructura__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( rule__Infraestructura__Group_10__2__Impl rule__Infraestructura__Group_10__3 )
            // InternalMyDsl.g:1430:2: rule__Infraestructura__Group_10__2__Impl rule__Infraestructura__Group_10__3
            {
            pushFollow(FOLLOW_5);
            rule__Infraestructura__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__2"


    // $ANTLR start "rule__Infraestructura__Group_10__2__Impl"
    // InternalMyDsl.g:1437:1: rule__Infraestructura__Group_10__2__Impl : ( RULE_OPEN_BRACKET ) ;
    public final void rule__Infraestructura__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( ( RULE_OPEN_BRACKET ) )
            // InternalMyDsl.g:1442:1: ( RULE_OPEN_BRACKET )
            {
            // InternalMyDsl.g:1442:1: ( RULE_OPEN_BRACKET )
            // InternalMyDsl.g:1443:2: RULE_OPEN_BRACKET
            {
             before(grammarAccess.getInfraestructuraAccess().getOPEN_BRACKETTerminalRuleCall_10_2()); 
            match(input,RULE_OPEN_BRACKET,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getOPEN_BRACKETTerminalRuleCall_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__2__Impl"


    // $ANTLR start "rule__Infraestructura__Group_10__3"
    // InternalMyDsl.g:1452:1: rule__Infraestructura__Group_10__3 : rule__Infraestructura__Group_10__3__Impl rule__Infraestructura__Group_10__4 ;
    public final void rule__Infraestructura__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( rule__Infraestructura__Group_10__3__Impl rule__Infraestructura__Group_10__4 )
            // InternalMyDsl.g:1457:2: rule__Infraestructura__Group_10__3__Impl rule__Infraestructura__Group_10__4
            {
            pushFollow(FOLLOW_16);
            rule__Infraestructura__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__3"


    // $ANTLR start "rule__Infraestructura__Group_10__3__Impl"
    // InternalMyDsl.g:1464:1: rule__Infraestructura__Group_10__3__Impl : ( ( rule__Infraestructura__AmbientesdesplegueAssignment_10_3 ) ) ;
    public final void rule__Infraestructura__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( ( ( rule__Infraestructura__AmbientesdesplegueAssignment_10_3 ) ) )
            // InternalMyDsl.g:1469:1: ( ( rule__Infraestructura__AmbientesdesplegueAssignment_10_3 ) )
            {
            // InternalMyDsl.g:1469:1: ( ( rule__Infraestructura__AmbientesdesplegueAssignment_10_3 ) )
            // InternalMyDsl.g:1470:2: ( rule__Infraestructura__AmbientesdesplegueAssignment_10_3 )
            {
             before(grammarAccess.getInfraestructuraAccess().getAmbientesdesplegueAssignment_10_3()); 
            // InternalMyDsl.g:1471:2: ( rule__Infraestructura__AmbientesdesplegueAssignment_10_3 )
            // InternalMyDsl.g:1471:3: rule__Infraestructura__AmbientesdesplegueAssignment_10_3
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__AmbientesdesplegueAssignment_10_3();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getAmbientesdesplegueAssignment_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__3__Impl"


    // $ANTLR start "rule__Infraestructura__Group_10__4"
    // InternalMyDsl.g:1479:1: rule__Infraestructura__Group_10__4 : rule__Infraestructura__Group_10__4__Impl rule__Infraestructura__Group_10__5 ;
    public final void rule__Infraestructura__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( rule__Infraestructura__Group_10__4__Impl rule__Infraestructura__Group_10__5 )
            // InternalMyDsl.g:1484:2: rule__Infraestructura__Group_10__4__Impl rule__Infraestructura__Group_10__5
            {
            pushFollow(FOLLOW_16);
            rule__Infraestructura__Group_10__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_10__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__4"


    // $ANTLR start "rule__Infraestructura__Group_10__4__Impl"
    // InternalMyDsl.g:1491:1: rule__Infraestructura__Group_10__4__Impl : ( ( rule__Infraestructura__Group_10_4__0 )* ) ;
    public final void rule__Infraestructura__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( ( ( rule__Infraestructura__Group_10_4__0 )* ) )
            // InternalMyDsl.g:1496:1: ( ( rule__Infraestructura__Group_10_4__0 )* )
            {
            // InternalMyDsl.g:1496:1: ( ( rule__Infraestructura__Group_10_4__0 )* )
            // InternalMyDsl.g:1497:2: ( rule__Infraestructura__Group_10_4__0 )*
            {
             before(grammarAccess.getInfraestructuraAccess().getGroup_10_4()); 
            // InternalMyDsl.g:1498:2: ( rule__Infraestructura__Group_10_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1498:3: rule__Infraestructura__Group_10_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Infraestructura__Group_10_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getInfraestructuraAccess().getGroup_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__4__Impl"


    // $ANTLR start "rule__Infraestructura__Group_10__5"
    // InternalMyDsl.g:1506:1: rule__Infraestructura__Group_10__5 : rule__Infraestructura__Group_10__5__Impl rule__Infraestructura__Group_10__6 ;
    public final void rule__Infraestructura__Group_10__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( rule__Infraestructura__Group_10__5__Impl rule__Infraestructura__Group_10__6 )
            // InternalMyDsl.g:1511:2: rule__Infraestructura__Group_10__5__Impl rule__Infraestructura__Group_10__6
            {
            pushFollow(FOLLOW_17);
            rule__Infraestructura__Group_10__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_10__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__5"


    // $ANTLR start "rule__Infraestructura__Group_10__5__Impl"
    // InternalMyDsl.g:1518:1: rule__Infraestructura__Group_10__5__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Infraestructura__Group_10__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:1523:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:1523:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:1524:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_10_5()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_10_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__5__Impl"


    // $ANTLR start "rule__Infraestructura__Group_10__6"
    // InternalMyDsl.g:1533:1: rule__Infraestructura__Group_10__6 : rule__Infraestructura__Group_10__6__Impl ;
    public final void rule__Infraestructura__Group_10__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__Infraestructura__Group_10__6__Impl )
            // InternalMyDsl.g:1538:2: rule__Infraestructura__Group_10__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_10__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__6"


    // $ANTLR start "rule__Infraestructura__Group_10__6__Impl"
    // InternalMyDsl.g:1544:1: rule__Infraestructura__Group_10__6__Impl : ( RULE_CLOSE_BRACKET ) ;
    public final void rule__Infraestructura__Group_10__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( ( RULE_CLOSE_BRACKET ) )
            // InternalMyDsl.g:1549:1: ( RULE_CLOSE_BRACKET )
            {
            // InternalMyDsl.g:1549:1: ( RULE_CLOSE_BRACKET )
            // InternalMyDsl.g:1550:2: RULE_CLOSE_BRACKET
            {
             before(grammarAccess.getInfraestructuraAccess().getCLOSE_BRACKETTerminalRuleCall_10_6()); 
            match(input,RULE_CLOSE_BRACKET,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getCLOSE_BRACKETTerminalRuleCall_10_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10__6__Impl"


    // $ANTLR start "rule__Infraestructura__Group_10_4__0"
    // InternalMyDsl.g:1560:1: rule__Infraestructura__Group_10_4__0 : rule__Infraestructura__Group_10_4__0__Impl rule__Infraestructura__Group_10_4__1 ;
    public final void rule__Infraestructura__Group_10_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__Infraestructura__Group_10_4__0__Impl rule__Infraestructura__Group_10_4__1 )
            // InternalMyDsl.g:1565:2: rule__Infraestructura__Group_10_4__0__Impl rule__Infraestructura__Group_10_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Infraestructura__Group_10_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_10_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10_4__0"


    // $ANTLR start "rule__Infraestructura__Group_10_4__0__Impl"
    // InternalMyDsl.g:1572:1: rule__Infraestructura__Group_10_4__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Infraestructura__Group_10_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( ( RULE_COMMA ) )
            // InternalMyDsl.g:1577:1: ( RULE_COMMA )
            {
            // InternalMyDsl.g:1577:1: ( RULE_COMMA )
            // InternalMyDsl.g:1578:2: RULE_COMMA
            {
             before(grammarAccess.getInfraestructuraAccess().getCOMMATerminalRuleCall_10_4_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getInfraestructuraAccess().getCOMMATerminalRuleCall_10_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10_4__0__Impl"


    // $ANTLR start "rule__Infraestructura__Group_10_4__1"
    // InternalMyDsl.g:1587:1: rule__Infraestructura__Group_10_4__1 : rule__Infraestructura__Group_10_4__1__Impl ;
    public final void rule__Infraestructura__Group_10_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__Infraestructura__Group_10_4__1__Impl )
            // InternalMyDsl.g:1592:2: rule__Infraestructura__Group_10_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__Group_10_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10_4__1"


    // $ANTLR start "rule__Infraestructura__Group_10_4__1__Impl"
    // InternalMyDsl.g:1598:1: rule__Infraestructura__Group_10_4__1__Impl : ( ( rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1 ) ) ;
    public final void rule__Infraestructura__Group_10_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( ( ( rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1 ) ) )
            // InternalMyDsl.g:1603:1: ( ( rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1 ) )
            {
            // InternalMyDsl.g:1603:1: ( ( rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1 ) )
            // InternalMyDsl.g:1604:2: ( rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1 )
            {
             before(grammarAccess.getInfraestructuraAccess().getAmbientesdesplegueAssignment_10_4_1()); 
            // InternalMyDsl.g:1605:2: ( rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1 )
            // InternalMyDsl.g:1605:3: rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInfraestructuraAccess().getAmbientesdesplegueAssignment_10_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__Group_10_4__1__Impl"


    // $ANTLR start "rule__Login__Group__0"
    // InternalMyDsl.g:1614:1: rule__Login__Group__0 : rule__Login__Group__0__Impl rule__Login__Group__1 ;
    public final void rule__Login__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__Login__Group__0__Impl rule__Login__Group__1 )
            // InternalMyDsl.g:1619:2: rule__Login__Group__0__Impl rule__Login__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Login__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__0"


    // $ANTLR start "rule__Login__Group__0__Impl"
    // InternalMyDsl.g:1626:1: rule__Login__Group__0__Impl : ( () ) ;
    public final void rule__Login__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( ( () ) )
            // InternalMyDsl.g:1631:1: ( () )
            {
            // InternalMyDsl.g:1631:1: ( () )
            // InternalMyDsl.g:1632:2: ()
            {
             before(grammarAccess.getLoginAccess().getLoginAction_0()); 
            // InternalMyDsl.g:1633:2: ()
            // InternalMyDsl.g:1633:3: 
            {
            }

             after(grammarAccess.getLoginAccess().getLoginAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__0__Impl"


    // $ANTLR start "rule__Login__Group__1"
    // InternalMyDsl.g:1641:1: rule__Login__Group__1 : rule__Login__Group__1__Impl rule__Login__Group__2 ;
    public final void rule__Login__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__Login__Group__1__Impl rule__Login__Group__2 )
            // InternalMyDsl.g:1646:2: rule__Login__Group__1__Impl rule__Login__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Login__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__1"


    // $ANTLR start "rule__Login__Group__1__Impl"
    // InternalMyDsl.g:1653:1: rule__Login__Group__1__Impl : ( RULE_OPEN_BRACE ) ;
    public final void rule__Login__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( ( RULE_OPEN_BRACE ) )
            // InternalMyDsl.g:1658:1: ( RULE_OPEN_BRACE )
            {
            // InternalMyDsl.g:1658:1: ( RULE_OPEN_BRACE )
            // InternalMyDsl.g:1659:2: RULE_OPEN_BRACE
            {
             before(grammarAccess.getLoginAccess().getOPEN_BRACETerminalRuleCall_1()); 
            match(input,RULE_OPEN_BRACE,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getOPEN_BRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__1__Impl"


    // $ANTLR start "rule__Login__Group__2"
    // InternalMyDsl.g:1668:1: rule__Login__Group__2 : rule__Login__Group__2__Impl rule__Login__Group__3 ;
    public final void rule__Login__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( rule__Login__Group__2__Impl rule__Login__Group__3 )
            // InternalMyDsl.g:1673:2: rule__Login__Group__2__Impl rule__Login__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Login__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__2"


    // $ANTLR start "rule__Login__Group__2__Impl"
    // InternalMyDsl.g:1680:1: rule__Login__Group__2__Impl : ( ( rule__Login__Group_2__0 )? ) ;
    public final void rule__Login__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( ( ( rule__Login__Group_2__0 )? ) )
            // InternalMyDsl.g:1685:1: ( ( rule__Login__Group_2__0 )? )
            {
            // InternalMyDsl.g:1685:1: ( ( rule__Login__Group_2__0 )? )
            // InternalMyDsl.g:1686:2: ( rule__Login__Group_2__0 )?
            {
             before(grammarAccess.getLoginAccess().getGroup_2()); 
            // InternalMyDsl.g:1687:2: ( rule__Login__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==47) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1687:3: rule__Login__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Login__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoginAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__2__Impl"


    // $ANTLR start "rule__Login__Group__3"
    // InternalMyDsl.g:1695:1: rule__Login__Group__3 : rule__Login__Group__3__Impl rule__Login__Group__4 ;
    public final void rule__Login__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( rule__Login__Group__3__Impl rule__Login__Group__4 )
            // InternalMyDsl.g:1700:2: rule__Login__Group__3__Impl rule__Login__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Login__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__3"


    // $ANTLR start "rule__Login__Group__3__Impl"
    // InternalMyDsl.g:1707:1: rule__Login__Group__3__Impl : ( ( rule__Login__Group_3__0 )? ) ;
    public final void rule__Login__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( ( ( rule__Login__Group_3__0 )? ) )
            // InternalMyDsl.g:1712:1: ( ( rule__Login__Group_3__0 )? )
            {
            // InternalMyDsl.g:1712:1: ( ( rule__Login__Group_3__0 )? )
            // InternalMyDsl.g:1713:2: ( rule__Login__Group_3__0 )?
            {
             before(grammarAccess.getLoginAccess().getGroup_3()); 
            // InternalMyDsl.g:1714:2: ( rule__Login__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1714:3: rule__Login__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Login__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoginAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__3__Impl"


    // $ANTLR start "rule__Login__Group__4"
    // InternalMyDsl.g:1722:1: rule__Login__Group__4 : rule__Login__Group__4__Impl rule__Login__Group__5 ;
    public final void rule__Login__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( rule__Login__Group__4__Impl rule__Login__Group__5 )
            // InternalMyDsl.g:1727:2: rule__Login__Group__4__Impl rule__Login__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Login__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__4"


    // $ANTLR start "rule__Login__Group__4__Impl"
    // InternalMyDsl.g:1734:1: rule__Login__Group__4__Impl : ( ( rule__Login__Group_4__0 )? ) ;
    public final void rule__Login__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( ( rule__Login__Group_4__0 )? ) )
            // InternalMyDsl.g:1739:1: ( ( rule__Login__Group_4__0 )? )
            {
            // InternalMyDsl.g:1739:1: ( ( rule__Login__Group_4__0 )? )
            // InternalMyDsl.g:1740:2: ( rule__Login__Group_4__0 )?
            {
             before(grammarAccess.getLoginAccess().getGroup_4()); 
            // InternalMyDsl.g:1741:2: ( rule__Login__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==49) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1741:3: rule__Login__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Login__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoginAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__4__Impl"


    // $ANTLR start "rule__Login__Group__5"
    // InternalMyDsl.g:1749:1: rule__Login__Group__5 : rule__Login__Group__5__Impl rule__Login__Group__6 ;
    public final void rule__Login__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( rule__Login__Group__5__Impl rule__Login__Group__6 )
            // InternalMyDsl.g:1754:2: rule__Login__Group__5__Impl rule__Login__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Login__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__5"


    // $ANTLR start "rule__Login__Group__5__Impl"
    // InternalMyDsl.g:1761:1: rule__Login__Group__5__Impl : ( ( rule__Login__Group_5__0 )? ) ;
    public final void rule__Login__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( ( ( rule__Login__Group_5__0 )? ) )
            // InternalMyDsl.g:1766:1: ( ( rule__Login__Group_5__0 )? )
            {
            // InternalMyDsl.g:1766:1: ( ( rule__Login__Group_5__0 )? )
            // InternalMyDsl.g:1767:2: ( rule__Login__Group_5__0 )?
            {
             before(grammarAccess.getLoginAccess().getGroup_5()); 
            // InternalMyDsl.g:1768:2: ( rule__Login__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==50) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1768:3: rule__Login__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Login__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoginAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__5__Impl"


    // $ANTLR start "rule__Login__Group__6"
    // InternalMyDsl.g:1776:1: rule__Login__Group__6 : rule__Login__Group__6__Impl rule__Login__Group__7 ;
    public final void rule__Login__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( rule__Login__Group__6__Impl rule__Login__Group__7 )
            // InternalMyDsl.g:1781:2: rule__Login__Group__6__Impl rule__Login__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Login__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__6"


    // $ANTLR start "rule__Login__Group__6__Impl"
    // InternalMyDsl.g:1788:1: rule__Login__Group__6__Impl : ( ( rule__Login__Group_6__0 )? ) ;
    public final void rule__Login__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( ( ( rule__Login__Group_6__0 )? ) )
            // InternalMyDsl.g:1793:1: ( ( rule__Login__Group_6__0 )? )
            {
            // InternalMyDsl.g:1793:1: ( ( rule__Login__Group_6__0 )? )
            // InternalMyDsl.g:1794:2: ( rule__Login__Group_6__0 )?
            {
             before(grammarAccess.getLoginAccess().getGroup_6()); 
            // InternalMyDsl.g:1795:2: ( rule__Login__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1795:3: rule__Login__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Login__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoginAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__6__Impl"


    // $ANTLR start "rule__Login__Group__7"
    // InternalMyDsl.g:1803:1: rule__Login__Group__7 : rule__Login__Group__7__Impl ;
    public final void rule__Login__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( rule__Login__Group__7__Impl )
            // InternalMyDsl.g:1808:2: rule__Login__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__7"


    // $ANTLR start "rule__Login__Group__7__Impl"
    // InternalMyDsl.g:1814:1: rule__Login__Group__7__Impl : ( RULE_CLOSE_BRACE ) ;
    public final void rule__Login__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( ( RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:1819:1: ( RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:1819:1: ( RULE_CLOSE_BRACE )
            // InternalMyDsl.g:1820:2: RULE_CLOSE_BRACE
            {
             before(grammarAccess.getLoginAccess().getCLOSE_BRACETerminalRuleCall_7()); 
            match(input,RULE_CLOSE_BRACE,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getCLOSE_BRACETerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__7__Impl"


    // $ANTLR start "rule__Login__Group_2__0"
    // InternalMyDsl.g:1830:1: rule__Login__Group_2__0 : rule__Login__Group_2__0__Impl rule__Login__Group_2__1 ;
    public final void rule__Login__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( rule__Login__Group_2__0__Impl rule__Login__Group_2__1 )
            // InternalMyDsl.g:1835:2: rule__Login__Group_2__0__Impl rule__Login__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Login__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_2__0"


    // $ANTLR start "rule__Login__Group_2__0__Impl"
    // InternalMyDsl.g:1842:1: rule__Login__Group_2__0__Impl : ( 'nombreConexion' ) ;
    public final void rule__Login__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( ( 'nombreConexion' ) )
            // InternalMyDsl.g:1847:1: ( 'nombreConexion' )
            {
            // InternalMyDsl.g:1847:1: ( 'nombreConexion' )
            // InternalMyDsl.g:1848:2: 'nombreConexion'
            {
             before(grammarAccess.getLoginAccess().getNombreConexionKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getNombreConexionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_2__0__Impl"


    // $ANTLR start "rule__Login__Group_2__1"
    // InternalMyDsl.g:1857:1: rule__Login__Group_2__1 : rule__Login__Group_2__1__Impl rule__Login__Group_2__2 ;
    public final void rule__Login__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( rule__Login__Group_2__1__Impl rule__Login__Group_2__2 )
            // InternalMyDsl.g:1862:2: rule__Login__Group_2__1__Impl rule__Login__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Login__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_2__1"


    // $ANTLR start "rule__Login__Group_2__1__Impl"
    // InternalMyDsl.g:1869:1: rule__Login__Group_2__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Login__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:1874:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:1874:1: ( RULE_EQUALS )
            // InternalMyDsl.g:1875:2: RULE_EQUALS
            {
             before(grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_2_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_2__1__Impl"


    // $ANTLR start "rule__Login__Group_2__2"
    // InternalMyDsl.g:1884:1: rule__Login__Group_2__2 : rule__Login__Group_2__2__Impl rule__Login__Group_2__3 ;
    public final void rule__Login__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( rule__Login__Group_2__2__Impl rule__Login__Group_2__3 )
            // InternalMyDsl.g:1889:2: rule__Login__Group_2__2__Impl rule__Login__Group_2__3
            {
            pushFollow(FOLLOW_7);
            rule__Login__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_2__2"


    // $ANTLR start "rule__Login__Group_2__2__Impl"
    // InternalMyDsl.g:1896:1: rule__Login__Group_2__2__Impl : ( ( rule__Login__NombreConexionAssignment_2_2 ) ) ;
    public final void rule__Login__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1900:1: ( ( ( rule__Login__NombreConexionAssignment_2_2 ) ) )
            // InternalMyDsl.g:1901:1: ( ( rule__Login__NombreConexionAssignment_2_2 ) )
            {
            // InternalMyDsl.g:1901:1: ( ( rule__Login__NombreConexionAssignment_2_2 ) )
            // InternalMyDsl.g:1902:2: ( rule__Login__NombreConexionAssignment_2_2 )
            {
             before(grammarAccess.getLoginAccess().getNombreConexionAssignment_2_2()); 
            // InternalMyDsl.g:1903:2: ( rule__Login__NombreConexionAssignment_2_2 )
            // InternalMyDsl.g:1903:3: rule__Login__NombreConexionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Login__NombreConexionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getNombreConexionAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_2__2__Impl"


    // $ANTLR start "rule__Login__Group_2__3"
    // InternalMyDsl.g:1911:1: rule__Login__Group_2__3 : rule__Login__Group_2__3__Impl ;
    public final void rule__Login__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( rule__Login__Group_2__3__Impl )
            // InternalMyDsl.g:1916:2: rule__Login__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_2__3"


    // $ANTLR start "rule__Login__Group_2__3__Impl"
    // InternalMyDsl.g:1922:1: rule__Login__Group_2__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Login__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1926:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:1927:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:1927:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:1928:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_2_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_2__3__Impl"


    // $ANTLR start "rule__Login__Group_3__0"
    // InternalMyDsl.g:1938:1: rule__Login__Group_3__0 : rule__Login__Group_3__0__Impl rule__Login__Group_3__1 ;
    public final void rule__Login__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( rule__Login__Group_3__0__Impl rule__Login__Group_3__1 )
            // InternalMyDsl.g:1943:2: rule__Login__Group_3__0__Impl rule__Login__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Login__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_3__0"


    // $ANTLR start "rule__Login__Group_3__0__Impl"
    // InternalMyDsl.g:1950:1: rule__Login__Group_3__0__Impl : ( 'usuario' ) ;
    public final void rule__Login__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( ( 'usuario' ) )
            // InternalMyDsl.g:1955:1: ( 'usuario' )
            {
            // InternalMyDsl.g:1955:1: ( 'usuario' )
            // InternalMyDsl.g:1956:2: 'usuario'
            {
             before(grammarAccess.getLoginAccess().getUsuarioKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getUsuarioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_3__0__Impl"


    // $ANTLR start "rule__Login__Group_3__1"
    // InternalMyDsl.g:1965:1: rule__Login__Group_3__1 : rule__Login__Group_3__1__Impl rule__Login__Group_3__2 ;
    public final void rule__Login__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( rule__Login__Group_3__1__Impl rule__Login__Group_3__2 )
            // InternalMyDsl.g:1970:2: rule__Login__Group_3__1__Impl rule__Login__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__Login__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_3__1"


    // $ANTLR start "rule__Login__Group_3__1__Impl"
    // InternalMyDsl.g:1977:1: rule__Login__Group_3__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Login__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1981:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:1982:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:1982:1: ( RULE_EQUALS )
            // InternalMyDsl.g:1983:2: RULE_EQUALS
            {
             before(grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_3_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_3__1__Impl"


    // $ANTLR start "rule__Login__Group_3__2"
    // InternalMyDsl.g:1992:1: rule__Login__Group_3__2 : rule__Login__Group_3__2__Impl rule__Login__Group_3__3 ;
    public final void rule__Login__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( rule__Login__Group_3__2__Impl rule__Login__Group_3__3 )
            // InternalMyDsl.g:1997:2: rule__Login__Group_3__2__Impl rule__Login__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Login__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_3__2"


    // $ANTLR start "rule__Login__Group_3__2__Impl"
    // InternalMyDsl.g:2004:1: rule__Login__Group_3__2__Impl : ( ( rule__Login__UsuarioAssignment_3_2 ) ) ;
    public final void rule__Login__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( ( ( rule__Login__UsuarioAssignment_3_2 ) ) )
            // InternalMyDsl.g:2009:1: ( ( rule__Login__UsuarioAssignment_3_2 ) )
            {
            // InternalMyDsl.g:2009:1: ( ( rule__Login__UsuarioAssignment_3_2 ) )
            // InternalMyDsl.g:2010:2: ( rule__Login__UsuarioAssignment_3_2 )
            {
             before(grammarAccess.getLoginAccess().getUsuarioAssignment_3_2()); 
            // InternalMyDsl.g:2011:2: ( rule__Login__UsuarioAssignment_3_2 )
            // InternalMyDsl.g:2011:3: rule__Login__UsuarioAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Login__UsuarioAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getUsuarioAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_3__2__Impl"


    // $ANTLR start "rule__Login__Group_3__3"
    // InternalMyDsl.g:2019:1: rule__Login__Group_3__3 : rule__Login__Group_3__3__Impl ;
    public final void rule__Login__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( rule__Login__Group_3__3__Impl )
            // InternalMyDsl.g:2024:2: rule__Login__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_3__3"


    // $ANTLR start "rule__Login__Group_3__3__Impl"
    // InternalMyDsl.g:2030:1: rule__Login__Group_3__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Login__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:2035:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:2035:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:2036:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_3_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_3__3__Impl"


    // $ANTLR start "rule__Login__Group_4__0"
    // InternalMyDsl.g:2046:1: rule__Login__Group_4__0 : rule__Login__Group_4__0__Impl rule__Login__Group_4__1 ;
    public final void rule__Login__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( rule__Login__Group_4__0__Impl rule__Login__Group_4__1 )
            // InternalMyDsl.g:2051:2: rule__Login__Group_4__0__Impl rule__Login__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Login__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_4__0"


    // $ANTLR start "rule__Login__Group_4__0__Impl"
    // InternalMyDsl.g:2058:1: rule__Login__Group_4__0__Impl : ( 'contrasena' ) ;
    public final void rule__Login__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2062:1: ( ( 'contrasena' ) )
            // InternalMyDsl.g:2063:1: ( 'contrasena' )
            {
            // InternalMyDsl.g:2063:1: ( 'contrasena' )
            // InternalMyDsl.g:2064:2: 'contrasena'
            {
             before(grammarAccess.getLoginAccess().getContrasenaKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getContrasenaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_4__0__Impl"


    // $ANTLR start "rule__Login__Group_4__1"
    // InternalMyDsl.g:2073:1: rule__Login__Group_4__1 : rule__Login__Group_4__1__Impl rule__Login__Group_4__2 ;
    public final void rule__Login__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( rule__Login__Group_4__1__Impl rule__Login__Group_4__2 )
            // InternalMyDsl.g:2078:2: rule__Login__Group_4__1__Impl rule__Login__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Login__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_4__1"


    // $ANTLR start "rule__Login__Group_4__1__Impl"
    // InternalMyDsl.g:2085:1: rule__Login__Group_4__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Login__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:2090:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:2090:1: ( RULE_EQUALS )
            // InternalMyDsl.g:2091:2: RULE_EQUALS
            {
             before(grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_4_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_4__1__Impl"


    // $ANTLR start "rule__Login__Group_4__2"
    // InternalMyDsl.g:2100:1: rule__Login__Group_4__2 : rule__Login__Group_4__2__Impl rule__Login__Group_4__3 ;
    public final void rule__Login__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( rule__Login__Group_4__2__Impl rule__Login__Group_4__3 )
            // InternalMyDsl.g:2105:2: rule__Login__Group_4__2__Impl rule__Login__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Login__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_4__2"


    // $ANTLR start "rule__Login__Group_4__2__Impl"
    // InternalMyDsl.g:2112:1: rule__Login__Group_4__2__Impl : ( ( rule__Login__ContrasenaAssignment_4_2 ) ) ;
    public final void rule__Login__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( ( ( rule__Login__ContrasenaAssignment_4_2 ) ) )
            // InternalMyDsl.g:2117:1: ( ( rule__Login__ContrasenaAssignment_4_2 ) )
            {
            // InternalMyDsl.g:2117:1: ( ( rule__Login__ContrasenaAssignment_4_2 ) )
            // InternalMyDsl.g:2118:2: ( rule__Login__ContrasenaAssignment_4_2 )
            {
             before(grammarAccess.getLoginAccess().getContrasenaAssignment_4_2()); 
            // InternalMyDsl.g:2119:2: ( rule__Login__ContrasenaAssignment_4_2 )
            // InternalMyDsl.g:2119:3: rule__Login__ContrasenaAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Login__ContrasenaAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getContrasenaAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_4__2__Impl"


    // $ANTLR start "rule__Login__Group_4__3"
    // InternalMyDsl.g:2127:1: rule__Login__Group_4__3 : rule__Login__Group_4__3__Impl ;
    public final void rule__Login__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( rule__Login__Group_4__3__Impl )
            // InternalMyDsl.g:2132:2: rule__Login__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_4__3"


    // $ANTLR start "rule__Login__Group_4__3__Impl"
    // InternalMyDsl.g:2138:1: rule__Login__Group_4__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Login__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:2143:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:2143:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:2144:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_4_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_4__3__Impl"


    // $ANTLR start "rule__Login__Group_5__0"
    // InternalMyDsl.g:2154:1: rule__Login__Group_5__0 : rule__Login__Group_5__0__Impl rule__Login__Group_5__1 ;
    public final void rule__Login__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( rule__Login__Group_5__0__Impl rule__Login__Group_5__1 )
            // InternalMyDsl.g:2159:2: rule__Login__Group_5__0__Impl rule__Login__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__Login__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_5__0"


    // $ANTLR start "rule__Login__Group_5__0__Impl"
    // InternalMyDsl.g:2166:1: rule__Login__Group_5__0__Impl : ( 'accessId' ) ;
    public final void rule__Login__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( ( 'accessId' ) )
            // InternalMyDsl.g:2171:1: ( 'accessId' )
            {
            // InternalMyDsl.g:2171:1: ( 'accessId' )
            // InternalMyDsl.g:2172:2: 'accessId'
            {
             before(grammarAccess.getLoginAccess().getAccessIdKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getAccessIdKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_5__0__Impl"


    // $ANTLR start "rule__Login__Group_5__1"
    // InternalMyDsl.g:2181:1: rule__Login__Group_5__1 : rule__Login__Group_5__1__Impl rule__Login__Group_5__2 ;
    public final void rule__Login__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( rule__Login__Group_5__1__Impl rule__Login__Group_5__2 )
            // InternalMyDsl.g:2186:2: rule__Login__Group_5__1__Impl rule__Login__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Login__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_5__1"


    // $ANTLR start "rule__Login__Group_5__1__Impl"
    // InternalMyDsl.g:2193:1: rule__Login__Group_5__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Login__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:2198:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:2198:1: ( RULE_EQUALS )
            // InternalMyDsl.g:2199:2: RULE_EQUALS
            {
             before(grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_5_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_5__1__Impl"


    // $ANTLR start "rule__Login__Group_5__2"
    // InternalMyDsl.g:2208:1: rule__Login__Group_5__2 : rule__Login__Group_5__2__Impl rule__Login__Group_5__3 ;
    public final void rule__Login__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( rule__Login__Group_5__2__Impl rule__Login__Group_5__3 )
            // InternalMyDsl.g:2213:2: rule__Login__Group_5__2__Impl rule__Login__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__Login__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_5__2"


    // $ANTLR start "rule__Login__Group_5__2__Impl"
    // InternalMyDsl.g:2220:1: rule__Login__Group_5__2__Impl : ( ( rule__Login__AccessIdAssignment_5_2 ) ) ;
    public final void rule__Login__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( ( ( rule__Login__AccessIdAssignment_5_2 ) ) )
            // InternalMyDsl.g:2225:1: ( ( rule__Login__AccessIdAssignment_5_2 ) )
            {
            // InternalMyDsl.g:2225:1: ( ( rule__Login__AccessIdAssignment_5_2 ) )
            // InternalMyDsl.g:2226:2: ( rule__Login__AccessIdAssignment_5_2 )
            {
             before(grammarAccess.getLoginAccess().getAccessIdAssignment_5_2()); 
            // InternalMyDsl.g:2227:2: ( rule__Login__AccessIdAssignment_5_2 )
            // InternalMyDsl.g:2227:3: rule__Login__AccessIdAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Login__AccessIdAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getAccessIdAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_5__2__Impl"


    // $ANTLR start "rule__Login__Group_5__3"
    // InternalMyDsl.g:2235:1: rule__Login__Group_5__3 : rule__Login__Group_5__3__Impl ;
    public final void rule__Login__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( rule__Login__Group_5__3__Impl )
            // InternalMyDsl.g:2240:2: rule__Login__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_5__3"


    // $ANTLR start "rule__Login__Group_5__3__Impl"
    // InternalMyDsl.g:2246:1: rule__Login__Group_5__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Login__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2250:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:2251:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:2251:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:2252:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_5_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_5__3__Impl"


    // $ANTLR start "rule__Login__Group_6__0"
    // InternalMyDsl.g:2262:1: rule__Login__Group_6__0 : rule__Login__Group_6__0__Impl rule__Login__Group_6__1 ;
    public final void rule__Login__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( rule__Login__Group_6__0__Impl rule__Login__Group_6__1 )
            // InternalMyDsl.g:2267:2: rule__Login__Group_6__0__Impl rule__Login__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Login__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_6__0"


    // $ANTLR start "rule__Login__Group_6__0__Impl"
    // InternalMyDsl.g:2274:1: rule__Login__Group_6__0__Impl : ( 'secret' ) ;
    public final void rule__Login__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2278:1: ( ( 'secret' ) )
            // InternalMyDsl.g:2279:1: ( 'secret' )
            {
            // InternalMyDsl.g:2279:1: ( 'secret' )
            // InternalMyDsl.g:2280:2: 'secret'
            {
             before(grammarAccess.getLoginAccess().getSecretKeyword_6_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getSecretKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_6__0__Impl"


    // $ANTLR start "rule__Login__Group_6__1"
    // InternalMyDsl.g:2289:1: rule__Login__Group_6__1 : rule__Login__Group_6__1__Impl rule__Login__Group_6__2 ;
    public final void rule__Login__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( rule__Login__Group_6__1__Impl rule__Login__Group_6__2 )
            // InternalMyDsl.g:2294:2: rule__Login__Group_6__1__Impl rule__Login__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__Login__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_6__1"


    // $ANTLR start "rule__Login__Group_6__1__Impl"
    // InternalMyDsl.g:2301:1: rule__Login__Group_6__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Login__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:2306:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:2306:1: ( RULE_EQUALS )
            // InternalMyDsl.g:2307:2: RULE_EQUALS
            {
             before(grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_6_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_6__1__Impl"


    // $ANTLR start "rule__Login__Group_6__2"
    // InternalMyDsl.g:2316:1: rule__Login__Group_6__2 : rule__Login__Group_6__2__Impl rule__Login__Group_6__3 ;
    public final void rule__Login__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( rule__Login__Group_6__2__Impl rule__Login__Group_6__3 )
            // InternalMyDsl.g:2321:2: rule__Login__Group_6__2__Impl rule__Login__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__Login__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_6__2"


    // $ANTLR start "rule__Login__Group_6__2__Impl"
    // InternalMyDsl.g:2328:1: rule__Login__Group_6__2__Impl : ( ( rule__Login__SecretAssignment_6_2 ) ) ;
    public final void rule__Login__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( ( ( rule__Login__SecretAssignment_6_2 ) ) )
            // InternalMyDsl.g:2333:1: ( ( rule__Login__SecretAssignment_6_2 ) )
            {
            // InternalMyDsl.g:2333:1: ( ( rule__Login__SecretAssignment_6_2 ) )
            // InternalMyDsl.g:2334:2: ( rule__Login__SecretAssignment_6_2 )
            {
             before(grammarAccess.getLoginAccess().getSecretAssignment_6_2()); 
            // InternalMyDsl.g:2335:2: ( rule__Login__SecretAssignment_6_2 )
            // InternalMyDsl.g:2335:3: rule__Login__SecretAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Login__SecretAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getSecretAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_6__2__Impl"


    // $ANTLR start "rule__Login__Group_6__3"
    // InternalMyDsl.g:2343:1: rule__Login__Group_6__3 : rule__Login__Group_6__3__Impl ;
    public final void rule__Login__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( rule__Login__Group_6__3__Impl )
            // InternalMyDsl.g:2348:2: rule__Login__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_6__3"


    // $ANTLR start "rule__Login__Group_6__3__Impl"
    // InternalMyDsl.g:2354:1: rule__Login__Group_6__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Login__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2358:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:2359:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:2359:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:2360:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_6_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_6__3__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__0"
    // InternalMyDsl.g:2370:1: rule__AmbienteDesplegue__Group__0 : rule__AmbienteDesplegue__Group__0__Impl rule__AmbienteDesplegue__Group__1 ;
    public final void rule__AmbienteDesplegue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( rule__AmbienteDesplegue__Group__0__Impl rule__AmbienteDesplegue__Group__1 )
            // InternalMyDsl.g:2375:2: rule__AmbienteDesplegue__Group__0__Impl rule__AmbienteDesplegue__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AmbienteDesplegue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__0"


    // $ANTLR start "rule__AmbienteDesplegue__Group__0__Impl"
    // InternalMyDsl.g:2382:1: rule__AmbienteDesplegue__Group__0__Impl : ( () ) ;
    public final void rule__AmbienteDesplegue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2386:1: ( ( () ) )
            // InternalMyDsl.g:2387:1: ( () )
            {
            // InternalMyDsl.g:2387:1: ( () )
            // InternalMyDsl.g:2388:2: ()
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getAmbienteDesplegueAction_0()); 
            // InternalMyDsl.g:2389:2: ()
            // InternalMyDsl.g:2389:3: 
            {
            }

             after(grammarAccess.getAmbienteDesplegueAccess().getAmbienteDesplegueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__0__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__1"
    // InternalMyDsl.g:2397:1: rule__AmbienteDesplegue__Group__1 : rule__AmbienteDesplegue__Group__1__Impl rule__AmbienteDesplegue__Group__2 ;
    public final void rule__AmbienteDesplegue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( rule__AmbienteDesplegue__Group__1__Impl rule__AmbienteDesplegue__Group__2 )
            // InternalMyDsl.g:2402:2: rule__AmbienteDesplegue__Group__1__Impl rule__AmbienteDesplegue__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__AmbienteDesplegue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__1"


    // $ANTLR start "rule__AmbienteDesplegue__Group__1__Impl"
    // InternalMyDsl.g:2409:1: rule__AmbienteDesplegue__Group__1__Impl : ( RULE_OPEN_BRACE ) ;
    public final void rule__AmbienteDesplegue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( ( RULE_OPEN_BRACE ) )
            // InternalMyDsl.g:2414:1: ( RULE_OPEN_BRACE )
            {
            // InternalMyDsl.g:2414:1: ( RULE_OPEN_BRACE )
            // InternalMyDsl.g:2415:2: RULE_OPEN_BRACE
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACETerminalRuleCall_1()); 
            match(input,RULE_OPEN_BRACE,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__1__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__2"
    // InternalMyDsl.g:2424:1: rule__AmbienteDesplegue__Group__2 : rule__AmbienteDesplegue__Group__2__Impl rule__AmbienteDesplegue__Group__3 ;
    public final void rule__AmbienteDesplegue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( rule__AmbienteDesplegue__Group__2__Impl rule__AmbienteDesplegue__Group__3 )
            // InternalMyDsl.g:2429:2: rule__AmbienteDesplegue__Group__2__Impl rule__AmbienteDesplegue__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__AmbienteDesplegue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__2"


    // $ANTLR start "rule__AmbienteDesplegue__Group__2__Impl"
    // InternalMyDsl.g:2436:1: rule__AmbienteDesplegue__Group__2__Impl : ( ( rule__AmbienteDesplegue__Group_2__0 )? ) ;
    public final void rule__AmbienteDesplegue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2440:1: ( ( ( rule__AmbienteDesplegue__Group_2__0 )? ) )
            // InternalMyDsl.g:2441:1: ( ( rule__AmbienteDesplegue__Group_2__0 )? )
            {
            // InternalMyDsl.g:2441:1: ( ( rule__AmbienteDesplegue__Group_2__0 )? )
            // InternalMyDsl.g:2442:2: ( rule__AmbienteDesplegue__Group_2__0 )?
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getGroup_2()); 
            // InternalMyDsl.g:2443:2: ( rule__AmbienteDesplegue__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==53) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2443:3: rule__AmbienteDesplegue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AmbienteDesplegue__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAmbienteDesplegueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__2__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__3"
    // InternalMyDsl.g:2451:1: rule__AmbienteDesplegue__Group__3 : rule__AmbienteDesplegue__Group__3__Impl rule__AmbienteDesplegue__Group__4 ;
    public final void rule__AmbienteDesplegue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( rule__AmbienteDesplegue__Group__3__Impl rule__AmbienteDesplegue__Group__4 )
            // InternalMyDsl.g:2456:2: rule__AmbienteDesplegue__Group__3__Impl rule__AmbienteDesplegue__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__AmbienteDesplegue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__3"


    // $ANTLR start "rule__AmbienteDesplegue__Group__3__Impl"
    // InternalMyDsl.g:2463:1: rule__AmbienteDesplegue__Group__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__AmbienteDesplegue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:2468:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:2468:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:2469:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__3__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__4"
    // InternalMyDsl.g:2478:1: rule__AmbienteDesplegue__Group__4 : rule__AmbienteDesplegue__Group__4__Impl rule__AmbienteDesplegue__Group__5 ;
    public final void rule__AmbienteDesplegue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( rule__AmbienteDesplegue__Group__4__Impl rule__AmbienteDesplegue__Group__5 )
            // InternalMyDsl.g:2483:2: rule__AmbienteDesplegue__Group__4__Impl rule__AmbienteDesplegue__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__AmbienteDesplegue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__4"


    // $ANTLR start "rule__AmbienteDesplegue__Group__4__Impl"
    // InternalMyDsl.g:2490:1: rule__AmbienteDesplegue__Group__4__Impl : ( ( rule__AmbienteDesplegue__Group_4__0 ) ) ;
    public final void rule__AmbienteDesplegue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( ( ( rule__AmbienteDesplegue__Group_4__0 ) ) )
            // InternalMyDsl.g:2495:1: ( ( rule__AmbienteDesplegue__Group_4__0 ) )
            {
            // InternalMyDsl.g:2495:1: ( ( rule__AmbienteDesplegue__Group_4__0 ) )
            // InternalMyDsl.g:2496:2: ( rule__AmbienteDesplegue__Group_4__0 )
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getGroup_4()); 
            // InternalMyDsl.g:2497:2: ( rule__AmbienteDesplegue__Group_4__0 )
            // InternalMyDsl.g:2497:3: rule__AmbienteDesplegue__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDesplegueAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__4__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__5"
    // InternalMyDsl.g:2505:1: rule__AmbienteDesplegue__Group__5 : rule__AmbienteDesplegue__Group__5__Impl rule__AmbienteDesplegue__Group__6 ;
    public final void rule__AmbienteDesplegue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( rule__AmbienteDesplegue__Group__5__Impl rule__AmbienteDesplegue__Group__6 )
            // InternalMyDsl.g:2510:2: rule__AmbienteDesplegue__Group__5__Impl rule__AmbienteDesplegue__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__AmbienteDesplegue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__5"


    // $ANTLR start "rule__AmbienteDesplegue__Group__5__Impl"
    // InternalMyDsl.g:2517:1: rule__AmbienteDesplegue__Group__5__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__AmbienteDesplegue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:2522:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:2522:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:2523:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_5()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__5__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__6"
    // InternalMyDsl.g:2532:1: rule__AmbienteDesplegue__Group__6 : rule__AmbienteDesplegue__Group__6__Impl rule__AmbienteDesplegue__Group__7 ;
    public final void rule__AmbienteDesplegue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( rule__AmbienteDesplegue__Group__6__Impl rule__AmbienteDesplegue__Group__7 )
            // InternalMyDsl.g:2537:2: rule__AmbienteDesplegue__Group__6__Impl rule__AmbienteDesplegue__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__AmbienteDesplegue__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__6"


    // $ANTLR start "rule__AmbienteDesplegue__Group__6__Impl"
    // InternalMyDsl.g:2544:1: rule__AmbienteDesplegue__Group__6__Impl : ( ( rule__AmbienteDesplegue__Group_6__0 ) ) ;
    public final void rule__AmbienteDesplegue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( ( ( rule__AmbienteDesplegue__Group_6__0 ) ) )
            // InternalMyDsl.g:2549:1: ( ( rule__AmbienteDesplegue__Group_6__0 ) )
            {
            // InternalMyDsl.g:2549:1: ( ( rule__AmbienteDesplegue__Group_6__0 ) )
            // InternalMyDsl.g:2550:2: ( rule__AmbienteDesplegue__Group_6__0 )
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getGroup_6()); 
            // InternalMyDsl.g:2551:2: ( rule__AmbienteDesplegue__Group_6__0 )
            // InternalMyDsl.g:2551:3: rule__AmbienteDesplegue__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDesplegueAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__6__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__7"
    // InternalMyDsl.g:2559:1: rule__AmbienteDesplegue__Group__7 : rule__AmbienteDesplegue__Group__7__Impl rule__AmbienteDesplegue__Group__8 ;
    public final void rule__AmbienteDesplegue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( rule__AmbienteDesplegue__Group__7__Impl rule__AmbienteDesplegue__Group__8 )
            // InternalMyDsl.g:2564:2: rule__AmbienteDesplegue__Group__7__Impl rule__AmbienteDesplegue__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__AmbienteDesplegue__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__7"


    // $ANTLR start "rule__AmbienteDesplegue__Group__7__Impl"
    // InternalMyDsl.g:2571:1: rule__AmbienteDesplegue__Group__7__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__AmbienteDesplegue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2575:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:2576:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:2576:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:2577:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_7()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__7__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__8"
    // InternalMyDsl.g:2586:1: rule__AmbienteDesplegue__Group__8 : rule__AmbienteDesplegue__Group__8__Impl rule__AmbienteDesplegue__Group__9 ;
    public final void rule__AmbienteDesplegue__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( rule__AmbienteDesplegue__Group__8__Impl rule__AmbienteDesplegue__Group__9 )
            // InternalMyDsl.g:2591:2: rule__AmbienteDesplegue__Group__8__Impl rule__AmbienteDesplegue__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__AmbienteDesplegue__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__8"


    // $ANTLR start "rule__AmbienteDesplegue__Group__8__Impl"
    // InternalMyDsl.g:2598:1: rule__AmbienteDesplegue__Group__8__Impl : ( 'ambientes' ) ;
    public final void rule__AmbienteDesplegue__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( ( 'ambientes' ) )
            // InternalMyDsl.g:2603:1: ( 'ambientes' )
            {
            // InternalMyDsl.g:2603:1: ( 'ambientes' )
            // InternalMyDsl.g:2604:2: 'ambientes'
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getAmbientesKeyword_8()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getAmbientesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__8__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__9"
    // InternalMyDsl.g:2613:1: rule__AmbienteDesplegue__Group__9 : rule__AmbienteDesplegue__Group__9__Impl rule__AmbienteDesplegue__Group__10 ;
    public final void rule__AmbienteDesplegue__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( rule__AmbienteDesplegue__Group__9__Impl rule__AmbienteDesplegue__Group__10 )
            // InternalMyDsl.g:2618:2: rule__AmbienteDesplegue__Group__9__Impl rule__AmbienteDesplegue__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__AmbienteDesplegue__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__9"


    // $ANTLR start "rule__AmbienteDesplegue__Group__9__Impl"
    // InternalMyDsl.g:2625:1: rule__AmbienteDesplegue__Group__9__Impl : ( RULE_EQUALS ) ;
    public final void rule__AmbienteDesplegue__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2629:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:2630:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:2630:1: ( RULE_EQUALS )
            // InternalMyDsl.g:2631:2: RULE_EQUALS
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_9()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__9__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__10"
    // InternalMyDsl.g:2640:1: rule__AmbienteDesplegue__Group__10 : rule__AmbienteDesplegue__Group__10__Impl rule__AmbienteDesplegue__Group__11 ;
    public final void rule__AmbienteDesplegue__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( rule__AmbienteDesplegue__Group__10__Impl rule__AmbienteDesplegue__Group__11 )
            // InternalMyDsl.g:2645:2: rule__AmbienteDesplegue__Group__10__Impl rule__AmbienteDesplegue__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__AmbienteDesplegue__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__10"


    // $ANTLR start "rule__AmbienteDesplegue__Group__10__Impl"
    // InternalMyDsl.g:2652:1: rule__AmbienteDesplegue__Group__10__Impl : ( RULE_OPEN_BRACKET ) ;
    public final void rule__AmbienteDesplegue__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( ( RULE_OPEN_BRACKET ) )
            // InternalMyDsl.g:2657:1: ( RULE_OPEN_BRACKET )
            {
            // InternalMyDsl.g:2657:1: ( RULE_OPEN_BRACKET )
            // InternalMyDsl.g:2658:2: RULE_OPEN_BRACKET
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACKETTerminalRuleCall_10()); 
            match(input,RULE_OPEN_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACKETTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__10__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__11"
    // InternalMyDsl.g:2667:1: rule__AmbienteDesplegue__Group__11 : rule__AmbienteDesplegue__Group__11__Impl rule__AmbienteDesplegue__Group__12 ;
    public final void rule__AmbienteDesplegue__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( rule__AmbienteDesplegue__Group__11__Impl rule__AmbienteDesplegue__Group__12 )
            // InternalMyDsl.g:2672:2: rule__AmbienteDesplegue__Group__11__Impl rule__AmbienteDesplegue__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDesplegue__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__11"


    // $ANTLR start "rule__AmbienteDesplegue__Group__11__Impl"
    // InternalMyDsl.g:2679:1: rule__AmbienteDesplegue__Group__11__Impl : ( ( rule__AmbienteDesplegue__ServidoresAssignment_11 ) ) ;
    public final void rule__AmbienteDesplegue__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( ( ( rule__AmbienteDesplegue__ServidoresAssignment_11 ) ) )
            // InternalMyDsl.g:2684:1: ( ( rule__AmbienteDesplegue__ServidoresAssignment_11 ) )
            {
            // InternalMyDsl.g:2684:1: ( ( rule__AmbienteDesplegue__ServidoresAssignment_11 ) )
            // InternalMyDsl.g:2685:2: ( rule__AmbienteDesplegue__ServidoresAssignment_11 )
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getServidoresAssignment_11()); 
            // InternalMyDsl.g:2686:2: ( rule__AmbienteDesplegue__ServidoresAssignment_11 )
            // InternalMyDsl.g:2686:3: rule__AmbienteDesplegue__ServidoresAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__ServidoresAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDesplegueAccess().getServidoresAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__11__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__12"
    // InternalMyDsl.g:2694:1: rule__AmbienteDesplegue__Group__12 : rule__AmbienteDesplegue__Group__12__Impl rule__AmbienteDesplegue__Group__13 ;
    public final void rule__AmbienteDesplegue__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( rule__AmbienteDesplegue__Group__12__Impl rule__AmbienteDesplegue__Group__13 )
            // InternalMyDsl.g:2699:2: rule__AmbienteDesplegue__Group__12__Impl rule__AmbienteDesplegue__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDesplegue__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__12"


    // $ANTLR start "rule__AmbienteDesplegue__Group__12__Impl"
    // InternalMyDsl.g:2706:1: rule__AmbienteDesplegue__Group__12__Impl : ( ( rule__AmbienteDesplegue__Group_12__0 )* ) ;
    public final void rule__AmbienteDesplegue__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( ( ( rule__AmbienteDesplegue__Group_12__0 )* ) )
            // InternalMyDsl.g:2711:1: ( ( rule__AmbienteDesplegue__Group_12__0 )* )
            {
            // InternalMyDsl.g:2711:1: ( ( rule__AmbienteDesplegue__Group_12__0 )* )
            // InternalMyDsl.g:2712:2: ( rule__AmbienteDesplegue__Group_12__0 )*
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getGroup_12()); 
            // InternalMyDsl.g:2713:2: ( rule__AmbienteDesplegue__Group_12__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2713:3: rule__AmbienteDesplegue__Group_12__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AmbienteDesplegue__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAmbienteDesplegueAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__12__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__13"
    // InternalMyDsl.g:2721:1: rule__AmbienteDesplegue__Group__13 : rule__AmbienteDesplegue__Group__13__Impl rule__AmbienteDesplegue__Group__14 ;
    public final void rule__AmbienteDesplegue__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2725:1: ( rule__AmbienteDesplegue__Group__13__Impl rule__AmbienteDesplegue__Group__14 )
            // InternalMyDsl.g:2726:2: rule__AmbienteDesplegue__Group__13__Impl rule__AmbienteDesplegue__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__AmbienteDesplegue__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__13"


    // $ANTLR start "rule__AmbienteDesplegue__Group__13__Impl"
    // InternalMyDsl.g:2733:1: rule__AmbienteDesplegue__Group__13__Impl : ( RULE_CLOSE_BRACKET ) ;
    public final void rule__AmbienteDesplegue__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2737:1: ( ( RULE_CLOSE_BRACKET ) )
            // InternalMyDsl.g:2738:1: ( RULE_CLOSE_BRACKET )
            {
            // InternalMyDsl.g:2738:1: ( RULE_CLOSE_BRACKET )
            // InternalMyDsl.g:2739:2: RULE_CLOSE_BRACKET
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACKETTerminalRuleCall_13()); 
            match(input,RULE_CLOSE_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACKETTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__13__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__14"
    // InternalMyDsl.g:2748:1: rule__AmbienteDesplegue__Group__14 : rule__AmbienteDesplegue__Group__14__Impl rule__AmbienteDesplegue__Group__15 ;
    public final void rule__AmbienteDesplegue__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2752:1: ( rule__AmbienteDesplegue__Group__14__Impl rule__AmbienteDesplegue__Group__15 )
            // InternalMyDsl.g:2753:2: rule__AmbienteDesplegue__Group__14__Impl rule__AmbienteDesplegue__Group__15
            {
            pushFollow(FOLLOW_23);
            rule__AmbienteDesplegue__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__14"


    // $ANTLR start "rule__AmbienteDesplegue__Group__14__Impl"
    // InternalMyDsl.g:2760:1: rule__AmbienteDesplegue__Group__14__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__AmbienteDesplegue__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:2765:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:2765:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:2766:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_14()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__14__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__15"
    // InternalMyDsl.g:2775:1: rule__AmbienteDesplegue__Group__15 : rule__AmbienteDesplegue__Group__15__Impl rule__AmbienteDesplegue__Group__16 ;
    public final void rule__AmbienteDesplegue__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( rule__AmbienteDesplegue__Group__15__Impl rule__AmbienteDesplegue__Group__16 )
            // InternalMyDsl.g:2780:2: rule__AmbienteDesplegue__Group__15__Impl rule__AmbienteDesplegue__Group__16
            {
            pushFollow(FOLLOW_23);
            rule__AmbienteDesplegue__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__15"


    // $ANTLR start "rule__AmbienteDesplegue__Group__15__Impl"
    // InternalMyDsl.g:2787:1: rule__AmbienteDesplegue__Group__15__Impl : ( ( rule__AmbienteDesplegue__Group_15__0 )? ) ;
    public final void rule__AmbienteDesplegue__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( ( ( rule__AmbienteDesplegue__Group_15__0 )? ) )
            // InternalMyDsl.g:2792:1: ( ( rule__AmbienteDesplegue__Group_15__0 )? )
            {
            // InternalMyDsl.g:2792:1: ( ( rule__AmbienteDesplegue__Group_15__0 )? )
            // InternalMyDsl.g:2793:2: ( rule__AmbienteDesplegue__Group_15__0 )?
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getGroup_15()); 
            // InternalMyDsl.g:2794:2: ( rule__AmbienteDesplegue__Group_15__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==56) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2794:3: rule__AmbienteDesplegue__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AmbienteDesplegue__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAmbienteDesplegueAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__15__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group__16"
    // InternalMyDsl.g:2802:1: rule__AmbienteDesplegue__Group__16 : rule__AmbienteDesplegue__Group__16__Impl ;
    public final void rule__AmbienteDesplegue__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( rule__AmbienteDesplegue__Group__16__Impl )
            // InternalMyDsl.g:2807:2: rule__AmbienteDesplegue__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__16"


    // $ANTLR start "rule__AmbienteDesplegue__Group__16__Impl"
    // InternalMyDsl.g:2813:1: rule__AmbienteDesplegue__Group__16__Impl : ( RULE_CLOSE_BRACE ) ;
    public final void rule__AmbienteDesplegue__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2817:1: ( ( RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:2818:1: ( RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:2818:1: ( RULE_CLOSE_BRACE )
            // InternalMyDsl.g:2819:2: RULE_CLOSE_BRACE
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACETerminalRuleCall_16()); 
            match(input,RULE_CLOSE_BRACE,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACETerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group__16__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_2__0"
    // InternalMyDsl.g:2829:1: rule__AmbienteDesplegue__Group_2__0 : rule__AmbienteDesplegue__Group_2__0__Impl rule__AmbienteDesplegue__Group_2__1 ;
    public final void rule__AmbienteDesplegue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( rule__AmbienteDesplegue__Group_2__0__Impl rule__AmbienteDesplegue__Group_2__1 )
            // InternalMyDsl.g:2834:2: rule__AmbienteDesplegue__Group_2__0__Impl rule__AmbienteDesplegue__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__AmbienteDesplegue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_2__0"


    // $ANTLR start "rule__AmbienteDesplegue__Group_2__0__Impl"
    // InternalMyDsl.g:2841:1: rule__AmbienteDesplegue__Group_2__0__Impl : ( 'alias' ) ;
    public final void rule__AmbienteDesplegue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( ( 'alias' ) )
            // InternalMyDsl.g:2846:1: ( 'alias' )
            {
            // InternalMyDsl.g:2846:1: ( 'alias' )
            // InternalMyDsl.g:2847:2: 'alias'
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getAliasKeyword_2_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getAliasKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_2__0__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_2__1"
    // InternalMyDsl.g:2856:1: rule__AmbienteDesplegue__Group_2__1 : rule__AmbienteDesplegue__Group_2__1__Impl rule__AmbienteDesplegue__Group_2__2 ;
    public final void rule__AmbienteDesplegue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2860:1: ( rule__AmbienteDesplegue__Group_2__1__Impl rule__AmbienteDesplegue__Group_2__2 )
            // InternalMyDsl.g:2861:2: rule__AmbienteDesplegue__Group_2__1__Impl rule__AmbienteDesplegue__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__AmbienteDesplegue__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_2__1"


    // $ANTLR start "rule__AmbienteDesplegue__Group_2__1__Impl"
    // InternalMyDsl.g:2868:1: rule__AmbienteDesplegue__Group_2__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__AmbienteDesplegue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2872:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:2873:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:2873:1: ( RULE_EQUALS )
            // InternalMyDsl.g:2874:2: RULE_EQUALS
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_2_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_2__1__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_2__2"
    // InternalMyDsl.g:2883:1: rule__AmbienteDesplegue__Group_2__2 : rule__AmbienteDesplegue__Group_2__2__Impl ;
    public final void rule__AmbienteDesplegue__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2887:1: ( rule__AmbienteDesplegue__Group_2__2__Impl )
            // InternalMyDsl.g:2888:2: rule__AmbienteDesplegue__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_2__2"


    // $ANTLR start "rule__AmbienteDesplegue__Group_2__2__Impl"
    // InternalMyDsl.g:2894:1: rule__AmbienteDesplegue__Group_2__2__Impl : ( ( rule__AmbienteDesplegue__AliasAssignment_2_2 ) ) ;
    public final void rule__AmbienteDesplegue__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2898:1: ( ( ( rule__AmbienteDesplegue__AliasAssignment_2_2 ) ) )
            // InternalMyDsl.g:2899:1: ( ( rule__AmbienteDesplegue__AliasAssignment_2_2 ) )
            {
            // InternalMyDsl.g:2899:1: ( ( rule__AmbienteDesplegue__AliasAssignment_2_2 ) )
            // InternalMyDsl.g:2900:2: ( rule__AmbienteDesplegue__AliasAssignment_2_2 )
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getAliasAssignment_2_2()); 
            // InternalMyDsl.g:2901:2: ( rule__AmbienteDesplegue__AliasAssignment_2_2 )
            // InternalMyDsl.g:2901:3: rule__AmbienteDesplegue__AliasAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__AliasAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDesplegueAccess().getAliasAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_2__2__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_4__0"
    // InternalMyDsl.g:2910:1: rule__AmbienteDesplegue__Group_4__0 : rule__AmbienteDesplegue__Group_4__0__Impl rule__AmbienteDesplegue__Group_4__1 ;
    public final void rule__AmbienteDesplegue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2914:1: ( rule__AmbienteDesplegue__Group_4__0__Impl rule__AmbienteDesplegue__Group_4__1 )
            // InternalMyDsl.g:2915:2: rule__AmbienteDesplegue__Group_4__0__Impl rule__AmbienteDesplegue__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__AmbienteDesplegue__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_4__0"


    // $ANTLR start "rule__AmbienteDesplegue__Group_4__0__Impl"
    // InternalMyDsl.g:2922:1: rule__AmbienteDesplegue__Group_4__0__Impl : ( 'nombre' ) ;
    public final void rule__AmbienteDesplegue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2926:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:2927:1: ( 'nombre' )
            {
            // InternalMyDsl.g:2927:1: ( 'nombre' )
            // InternalMyDsl.g:2928:2: 'nombre'
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getNombreKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getNombreKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_4__0__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_4__1"
    // InternalMyDsl.g:2937:1: rule__AmbienteDesplegue__Group_4__1 : rule__AmbienteDesplegue__Group_4__1__Impl rule__AmbienteDesplegue__Group_4__2 ;
    public final void rule__AmbienteDesplegue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2941:1: ( rule__AmbienteDesplegue__Group_4__1__Impl rule__AmbienteDesplegue__Group_4__2 )
            // InternalMyDsl.g:2942:2: rule__AmbienteDesplegue__Group_4__1__Impl rule__AmbienteDesplegue__Group_4__2
            {
            pushFollow(FOLLOW_24);
            rule__AmbienteDesplegue__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_4__1"


    // $ANTLR start "rule__AmbienteDesplegue__Group_4__1__Impl"
    // InternalMyDsl.g:2949:1: rule__AmbienteDesplegue__Group_4__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__AmbienteDesplegue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2953:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:2954:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:2954:1: ( RULE_EQUALS )
            // InternalMyDsl.g:2955:2: RULE_EQUALS
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_4_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_4__1__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_4__2"
    // InternalMyDsl.g:2964:1: rule__AmbienteDesplegue__Group_4__2 : rule__AmbienteDesplegue__Group_4__2__Impl ;
    public final void rule__AmbienteDesplegue__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2968:1: ( rule__AmbienteDesplegue__Group_4__2__Impl )
            // InternalMyDsl.g:2969:2: rule__AmbienteDesplegue__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_4__2"


    // $ANTLR start "rule__AmbienteDesplegue__Group_4__2__Impl"
    // InternalMyDsl.g:2975:1: rule__AmbienteDesplegue__Group_4__2__Impl : ( ( rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2 ) ) ;
    public final void rule__AmbienteDesplegue__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2979:1: ( ( ( rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2 ) ) )
            // InternalMyDsl.g:2980:1: ( ( rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2 ) )
            {
            // InternalMyDsl.g:2980:1: ( ( rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2 ) )
            // InternalMyDsl.g:2981:2: ( rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2 )
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getTipoAmbienteAssignment_4_2()); 
            // InternalMyDsl.g:2982:2: ( rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2 )
            // InternalMyDsl.g:2982:3: rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDesplegueAccess().getTipoAmbienteAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_4__2__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__0"
    // InternalMyDsl.g:2991:1: rule__AmbienteDesplegue__Group_6__0 : rule__AmbienteDesplegue__Group_6__0__Impl rule__AmbienteDesplegue__Group_6__1 ;
    public final void rule__AmbienteDesplegue__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2995:1: ( rule__AmbienteDesplegue__Group_6__0__Impl rule__AmbienteDesplegue__Group_6__1 )
            // InternalMyDsl.g:2996:2: rule__AmbienteDesplegue__Group_6__0__Impl rule__AmbienteDesplegue__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__AmbienteDesplegue__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__0"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__0__Impl"
    // InternalMyDsl.g:3003:1: rule__AmbienteDesplegue__Group_6__0__Impl : ( 'vpc' ) ;
    public final void rule__AmbienteDesplegue__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3007:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:3008:1: ( 'vpc' )
            {
            // InternalMyDsl.g:3008:1: ( 'vpc' )
            // InternalMyDsl.g:3009:2: 'vpc'
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getVpcKeyword_6_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getVpcKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__0__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__1"
    // InternalMyDsl.g:3018:1: rule__AmbienteDesplegue__Group_6__1 : rule__AmbienteDesplegue__Group_6__1__Impl rule__AmbienteDesplegue__Group_6__2 ;
    public final void rule__AmbienteDesplegue__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3022:1: ( rule__AmbienteDesplegue__Group_6__1__Impl rule__AmbienteDesplegue__Group_6__2 )
            // InternalMyDsl.g:3023:2: rule__AmbienteDesplegue__Group_6__1__Impl rule__AmbienteDesplegue__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__AmbienteDesplegue__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__1"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__1__Impl"
    // InternalMyDsl.g:3030:1: rule__AmbienteDesplegue__Group_6__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__AmbienteDesplegue__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3034:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:3035:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:3035:1: ( RULE_EQUALS )
            // InternalMyDsl.g:3036:2: RULE_EQUALS
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_6_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__1__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__2"
    // InternalMyDsl.g:3045:1: rule__AmbienteDesplegue__Group_6__2 : rule__AmbienteDesplegue__Group_6__2__Impl rule__AmbienteDesplegue__Group_6__3 ;
    public final void rule__AmbienteDesplegue__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3049:1: ( rule__AmbienteDesplegue__Group_6__2__Impl rule__AmbienteDesplegue__Group_6__3 )
            // InternalMyDsl.g:3050:2: rule__AmbienteDesplegue__Group_6__2__Impl rule__AmbienteDesplegue__Group_6__3
            {
            pushFollow(FOLLOW_5);
            rule__AmbienteDesplegue__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__2"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__2__Impl"
    // InternalMyDsl.g:3057:1: rule__AmbienteDesplegue__Group_6__2__Impl : ( RULE_OPEN_BRACKET ) ;
    public final void rule__AmbienteDesplegue__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3061:1: ( ( RULE_OPEN_BRACKET ) )
            // InternalMyDsl.g:3062:1: ( RULE_OPEN_BRACKET )
            {
            // InternalMyDsl.g:3062:1: ( RULE_OPEN_BRACKET )
            // InternalMyDsl.g:3063:2: RULE_OPEN_BRACKET
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACKETTerminalRuleCall_6_2()); 
            match(input,RULE_OPEN_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACKETTerminalRuleCall_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__2__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__3"
    // InternalMyDsl.g:3072:1: rule__AmbienteDesplegue__Group_6__3 : rule__AmbienteDesplegue__Group_6__3__Impl rule__AmbienteDesplegue__Group_6__4 ;
    public final void rule__AmbienteDesplegue__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3076:1: ( rule__AmbienteDesplegue__Group_6__3__Impl rule__AmbienteDesplegue__Group_6__4 )
            // InternalMyDsl.g:3077:2: rule__AmbienteDesplegue__Group_6__3__Impl rule__AmbienteDesplegue__Group_6__4
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDesplegue__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__3"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__3__Impl"
    // InternalMyDsl.g:3084:1: rule__AmbienteDesplegue__Group_6__3__Impl : ( ( rule__AmbienteDesplegue__VpcAssignment_6_3 ) ) ;
    public final void rule__AmbienteDesplegue__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3088:1: ( ( ( rule__AmbienteDesplegue__VpcAssignment_6_3 ) ) )
            // InternalMyDsl.g:3089:1: ( ( rule__AmbienteDesplegue__VpcAssignment_6_3 ) )
            {
            // InternalMyDsl.g:3089:1: ( ( rule__AmbienteDesplegue__VpcAssignment_6_3 ) )
            // InternalMyDsl.g:3090:2: ( rule__AmbienteDesplegue__VpcAssignment_6_3 )
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getVpcAssignment_6_3()); 
            // InternalMyDsl.g:3091:2: ( rule__AmbienteDesplegue__VpcAssignment_6_3 )
            // InternalMyDsl.g:3091:3: rule__AmbienteDesplegue__VpcAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__VpcAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDesplegueAccess().getVpcAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__3__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__4"
    // InternalMyDsl.g:3099:1: rule__AmbienteDesplegue__Group_6__4 : rule__AmbienteDesplegue__Group_6__4__Impl rule__AmbienteDesplegue__Group_6__5 ;
    public final void rule__AmbienteDesplegue__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3103:1: ( rule__AmbienteDesplegue__Group_6__4__Impl rule__AmbienteDesplegue__Group_6__5 )
            // InternalMyDsl.g:3104:2: rule__AmbienteDesplegue__Group_6__4__Impl rule__AmbienteDesplegue__Group_6__5
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDesplegue__Group_6__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_6__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__4"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__4__Impl"
    // InternalMyDsl.g:3111:1: rule__AmbienteDesplegue__Group_6__4__Impl : ( ( rule__AmbienteDesplegue__Group_6_4__0 )* ) ;
    public final void rule__AmbienteDesplegue__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3115:1: ( ( ( rule__AmbienteDesplegue__Group_6_4__0 )* ) )
            // InternalMyDsl.g:3116:1: ( ( rule__AmbienteDesplegue__Group_6_4__0 )* )
            {
            // InternalMyDsl.g:3116:1: ( ( rule__AmbienteDesplegue__Group_6_4__0 )* )
            // InternalMyDsl.g:3117:2: ( rule__AmbienteDesplegue__Group_6_4__0 )*
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getGroup_6_4()); 
            // InternalMyDsl.g:3118:2: ( rule__AmbienteDesplegue__Group_6_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:3118:3: rule__AmbienteDesplegue__Group_6_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AmbienteDesplegue__Group_6_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAmbienteDesplegueAccess().getGroup_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__4__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__5"
    // InternalMyDsl.g:3126:1: rule__AmbienteDesplegue__Group_6__5 : rule__AmbienteDesplegue__Group_6__5__Impl ;
    public final void rule__AmbienteDesplegue__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3130:1: ( rule__AmbienteDesplegue__Group_6__5__Impl )
            // InternalMyDsl.g:3131:2: rule__AmbienteDesplegue__Group_6__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_6__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__5"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6__5__Impl"
    // InternalMyDsl.g:3137:1: rule__AmbienteDesplegue__Group_6__5__Impl : ( RULE_CLOSE_BRACKET ) ;
    public final void rule__AmbienteDesplegue__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3141:1: ( ( RULE_CLOSE_BRACKET ) )
            // InternalMyDsl.g:3142:1: ( RULE_CLOSE_BRACKET )
            {
            // InternalMyDsl.g:3142:1: ( RULE_CLOSE_BRACKET )
            // InternalMyDsl.g:3143:2: RULE_CLOSE_BRACKET
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACKETTerminalRuleCall_6_5()); 
            match(input,RULE_CLOSE_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACKETTerminalRuleCall_6_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6__5__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6_4__0"
    // InternalMyDsl.g:3153:1: rule__AmbienteDesplegue__Group_6_4__0 : rule__AmbienteDesplegue__Group_6_4__0__Impl rule__AmbienteDesplegue__Group_6_4__1 ;
    public final void rule__AmbienteDesplegue__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( rule__AmbienteDesplegue__Group_6_4__0__Impl rule__AmbienteDesplegue__Group_6_4__1 )
            // InternalMyDsl.g:3158:2: rule__AmbienteDesplegue__Group_6_4__0__Impl rule__AmbienteDesplegue__Group_6_4__1
            {
            pushFollow(FOLLOW_5);
            rule__AmbienteDesplegue__Group_6_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_6_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6_4__0"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6_4__0__Impl"
    // InternalMyDsl.g:3165:1: rule__AmbienteDesplegue__Group_6_4__0__Impl : ( RULE_COMMA ) ;
    public final void rule__AmbienteDesplegue__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3169:1: ( ( RULE_COMMA ) )
            // InternalMyDsl.g:3170:1: ( RULE_COMMA )
            {
            // InternalMyDsl.g:3170:1: ( RULE_COMMA )
            // InternalMyDsl.g:3171:2: RULE_COMMA
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getCOMMATerminalRuleCall_6_4_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getCOMMATerminalRuleCall_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6_4__0__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6_4__1"
    // InternalMyDsl.g:3180:1: rule__AmbienteDesplegue__Group_6_4__1 : rule__AmbienteDesplegue__Group_6_4__1__Impl ;
    public final void rule__AmbienteDesplegue__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( rule__AmbienteDesplegue__Group_6_4__1__Impl )
            // InternalMyDsl.g:3185:2: rule__AmbienteDesplegue__Group_6_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_6_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6_4__1"


    // $ANTLR start "rule__AmbienteDesplegue__Group_6_4__1__Impl"
    // InternalMyDsl.g:3191:1: rule__AmbienteDesplegue__Group_6_4__1__Impl : ( ( rule__AmbienteDesplegue__VpcAssignment_6_4_1 ) ) ;
    public final void rule__AmbienteDesplegue__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3195:1: ( ( ( rule__AmbienteDesplegue__VpcAssignment_6_4_1 ) ) )
            // InternalMyDsl.g:3196:1: ( ( rule__AmbienteDesplegue__VpcAssignment_6_4_1 ) )
            {
            // InternalMyDsl.g:3196:1: ( ( rule__AmbienteDesplegue__VpcAssignment_6_4_1 ) )
            // InternalMyDsl.g:3197:2: ( rule__AmbienteDesplegue__VpcAssignment_6_4_1 )
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getVpcAssignment_6_4_1()); 
            // InternalMyDsl.g:3198:2: ( rule__AmbienteDesplegue__VpcAssignment_6_4_1 )
            // InternalMyDsl.g:3198:3: rule__AmbienteDesplegue__VpcAssignment_6_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__VpcAssignment_6_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDesplegueAccess().getVpcAssignment_6_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_6_4__1__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_12__0"
    // InternalMyDsl.g:3207:1: rule__AmbienteDesplegue__Group_12__0 : rule__AmbienteDesplegue__Group_12__0__Impl rule__AmbienteDesplegue__Group_12__1 ;
    public final void rule__AmbienteDesplegue__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3211:1: ( rule__AmbienteDesplegue__Group_12__0__Impl rule__AmbienteDesplegue__Group_12__1 )
            // InternalMyDsl.g:3212:2: rule__AmbienteDesplegue__Group_12__0__Impl rule__AmbienteDesplegue__Group_12__1
            {
            pushFollow(FOLLOW_5);
            rule__AmbienteDesplegue__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_12__0"


    // $ANTLR start "rule__AmbienteDesplegue__Group_12__0__Impl"
    // InternalMyDsl.g:3219:1: rule__AmbienteDesplegue__Group_12__0__Impl : ( RULE_COMMA ) ;
    public final void rule__AmbienteDesplegue__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3223:1: ( ( RULE_COMMA ) )
            // InternalMyDsl.g:3224:1: ( RULE_COMMA )
            {
            // InternalMyDsl.g:3224:1: ( RULE_COMMA )
            // InternalMyDsl.g:3225:2: RULE_COMMA
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getCOMMATerminalRuleCall_12_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getCOMMATerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_12__0__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_12__1"
    // InternalMyDsl.g:3234:1: rule__AmbienteDesplegue__Group_12__1 : rule__AmbienteDesplegue__Group_12__1__Impl ;
    public final void rule__AmbienteDesplegue__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3238:1: ( rule__AmbienteDesplegue__Group_12__1__Impl )
            // InternalMyDsl.g:3239:2: rule__AmbienteDesplegue__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_12__1"


    // $ANTLR start "rule__AmbienteDesplegue__Group_12__1__Impl"
    // InternalMyDsl.g:3245:1: rule__AmbienteDesplegue__Group_12__1__Impl : ( ( rule__AmbienteDesplegue__ServidoresAssignment_12_1 ) ) ;
    public final void rule__AmbienteDesplegue__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3249:1: ( ( ( rule__AmbienteDesplegue__ServidoresAssignment_12_1 ) ) )
            // InternalMyDsl.g:3250:1: ( ( rule__AmbienteDesplegue__ServidoresAssignment_12_1 ) )
            {
            // InternalMyDsl.g:3250:1: ( ( rule__AmbienteDesplegue__ServidoresAssignment_12_1 ) )
            // InternalMyDsl.g:3251:2: ( rule__AmbienteDesplegue__ServidoresAssignment_12_1 )
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getServidoresAssignment_12_1()); 
            // InternalMyDsl.g:3252:2: ( rule__AmbienteDesplegue__ServidoresAssignment_12_1 )
            // InternalMyDsl.g:3252:3: rule__AmbienteDesplegue__ServidoresAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__ServidoresAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDesplegueAccess().getServidoresAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_12__1__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__0"
    // InternalMyDsl.g:3261:1: rule__AmbienteDesplegue__Group_15__0 : rule__AmbienteDesplegue__Group_15__0__Impl rule__AmbienteDesplegue__Group_15__1 ;
    public final void rule__AmbienteDesplegue__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3265:1: ( rule__AmbienteDesplegue__Group_15__0__Impl rule__AmbienteDesplegue__Group_15__1 )
            // InternalMyDsl.g:3266:2: rule__AmbienteDesplegue__Group_15__0__Impl rule__AmbienteDesplegue__Group_15__1
            {
            pushFollow(FOLLOW_11);
            rule__AmbienteDesplegue__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__0"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__0__Impl"
    // InternalMyDsl.g:3273:1: rule__AmbienteDesplegue__Group_15__0__Impl : ( 'conexion' ) ;
    public final void rule__AmbienteDesplegue__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3277:1: ( ( 'conexion' ) )
            // InternalMyDsl.g:3278:1: ( 'conexion' )
            {
            // InternalMyDsl.g:3278:1: ( 'conexion' )
            // InternalMyDsl.g:3279:2: 'conexion'
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getConexionKeyword_15_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getConexionKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__0__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__1"
    // InternalMyDsl.g:3288:1: rule__AmbienteDesplegue__Group_15__1 : rule__AmbienteDesplegue__Group_15__1__Impl rule__AmbienteDesplegue__Group_15__2 ;
    public final void rule__AmbienteDesplegue__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3292:1: ( rule__AmbienteDesplegue__Group_15__1__Impl rule__AmbienteDesplegue__Group_15__2 )
            // InternalMyDsl.g:3293:2: rule__AmbienteDesplegue__Group_15__1__Impl rule__AmbienteDesplegue__Group_15__2
            {
            pushFollow(FOLLOW_13);
            rule__AmbienteDesplegue__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__1"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__1__Impl"
    // InternalMyDsl.g:3300:1: rule__AmbienteDesplegue__Group_15__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__AmbienteDesplegue__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3304:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:3305:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:3305:1: ( RULE_EQUALS )
            // InternalMyDsl.g:3306:2: RULE_EQUALS
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_15_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__1__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__2"
    // InternalMyDsl.g:3315:1: rule__AmbienteDesplegue__Group_15__2 : rule__AmbienteDesplegue__Group_15__2__Impl rule__AmbienteDesplegue__Group_15__3 ;
    public final void rule__AmbienteDesplegue__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3319:1: ( rule__AmbienteDesplegue__Group_15__2__Impl rule__AmbienteDesplegue__Group_15__3 )
            // InternalMyDsl.g:3320:2: rule__AmbienteDesplegue__Group_15__2__Impl rule__AmbienteDesplegue__Group_15__3
            {
            pushFollow(FOLLOW_5);
            rule__AmbienteDesplegue__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__2"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__2__Impl"
    // InternalMyDsl.g:3327:1: rule__AmbienteDesplegue__Group_15__2__Impl : ( RULE_OPEN_BRACKET ) ;
    public final void rule__AmbienteDesplegue__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3331:1: ( ( RULE_OPEN_BRACKET ) )
            // InternalMyDsl.g:3332:1: ( RULE_OPEN_BRACKET )
            {
            // InternalMyDsl.g:3332:1: ( RULE_OPEN_BRACKET )
            // InternalMyDsl.g:3333:2: RULE_OPEN_BRACKET
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACKETTerminalRuleCall_15_2()); 
            match(input,RULE_OPEN_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACKETTerminalRuleCall_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__2__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__3"
    // InternalMyDsl.g:3342:1: rule__AmbienteDesplegue__Group_15__3 : rule__AmbienteDesplegue__Group_15__3__Impl rule__AmbienteDesplegue__Group_15__4 ;
    public final void rule__AmbienteDesplegue__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3346:1: ( rule__AmbienteDesplegue__Group_15__3__Impl rule__AmbienteDesplegue__Group_15__4 )
            // InternalMyDsl.g:3347:2: rule__AmbienteDesplegue__Group_15__3__Impl rule__AmbienteDesplegue__Group_15__4
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDesplegue__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__3"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__3__Impl"
    // InternalMyDsl.g:3354:1: rule__AmbienteDesplegue__Group_15__3__Impl : ( ( rule__AmbienteDesplegue__ConexionAssignment_15_3 ) ) ;
    public final void rule__AmbienteDesplegue__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3358:1: ( ( ( rule__AmbienteDesplegue__ConexionAssignment_15_3 ) ) )
            // InternalMyDsl.g:3359:1: ( ( rule__AmbienteDesplegue__ConexionAssignment_15_3 ) )
            {
            // InternalMyDsl.g:3359:1: ( ( rule__AmbienteDesplegue__ConexionAssignment_15_3 ) )
            // InternalMyDsl.g:3360:2: ( rule__AmbienteDesplegue__ConexionAssignment_15_3 )
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getConexionAssignment_15_3()); 
            // InternalMyDsl.g:3361:2: ( rule__AmbienteDesplegue__ConexionAssignment_15_3 )
            // InternalMyDsl.g:3361:3: rule__AmbienteDesplegue__ConexionAssignment_15_3
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__ConexionAssignment_15_3();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDesplegueAccess().getConexionAssignment_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__3__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__4"
    // InternalMyDsl.g:3369:1: rule__AmbienteDesplegue__Group_15__4 : rule__AmbienteDesplegue__Group_15__4__Impl rule__AmbienteDesplegue__Group_15__5 ;
    public final void rule__AmbienteDesplegue__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3373:1: ( rule__AmbienteDesplegue__Group_15__4__Impl rule__AmbienteDesplegue__Group_15__5 )
            // InternalMyDsl.g:3374:2: rule__AmbienteDesplegue__Group_15__4__Impl rule__AmbienteDesplegue__Group_15__5
            {
            pushFollow(FOLLOW_14);
            rule__AmbienteDesplegue__Group_15__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_15__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__4"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__4__Impl"
    // InternalMyDsl.g:3381:1: rule__AmbienteDesplegue__Group_15__4__Impl : ( ( rule__AmbienteDesplegue__Group_15_4__0 )* ) ;
    public final void rule__AmbienteDesplegue__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3385:1: ( ( ( rule__AmbienteDesplegue__Group_15_4__0 )* ) )
            // InternalMyDsl.g:3386:1: ( ( rule__AmbienteDesplegue__Group_15_4__0 )* )
            {
            // InternalMyDsl.g:3386:1: ( ( rule__AmbienteDesplegue__Group_15_4__0 )* )
            // InternalMyDsl.g:3387:2: ( rule__AmbienteDesplegue__Group_15_4__0 )*
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getGroup_15_4()); 
            // InternalMyDsl.g:3388:2: ( rule__AmbienteDesplegue__Group_15_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:3388:3: rule__AmbienteDesplegue__Group_15_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AmbienteDesplegue__Group_15_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAmbienteDesplegueAccess().getGroup_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__4__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__5"
    // InternalMyDsl.g:3396:1: rule__AmbienteDesplegue__Group_15__5 : rule__AmbienteDesplegue__Group_15__5__Impl rule__AmbienteDesplegue__Group_15__6 ;
    public final void rule__AmbienteDesplegue__Group_15__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3400:1: ( rule__AmbienteDesplegue__Group_15__5__Impl rule__AmbienteDesplegue__Group_15__6 )
            // InternalMyDsl.g:3401:2: rule__AmbienteDesplegue__Group_15__5__Impl rule__AmbienteDesplegue__Group_15__6
            {
            pushFollow(FOLLOW_7);
            rule__AmbienteDesplegue__Group_15__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_15__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__5"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__5__Impl"
    // InternalMyDsl.g:3408:1: rule__AmbienteDesplegue__Group_15__5__Impl : ( RULE_CLOSE_BRACKET ) ;
    public final void rule__AmbienteDesplegue__Group_15__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3412:1: ( ( RULE_CLOSE_BRACKET ) )
            // InternalMyDsl.g:3413:1: ( RULE_CLOSE_BRACKET )
            {
            // InternalMyDsl.g:3413:1: ( RULE_CLOSE_BRACKET )
            // InternalMyDsl.g:3414:2: RULE_CLOSE_BRACKET
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACKETTerminalRuleCall_15_5()); 
            match(input,RULE_CLOSE_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACKETTerminalRuleCall_15_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__5__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__6"
    // InternalMyDsl.g:3423:1: rule__AmbienteDesplegue__Group_15__6 : rule__AmbienteDesplegue__Group_15__6__Impl ;
    public final void rule__AmbienteDesplegue__Group_15__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3427:1: ( rule__AmbienteDesplegue__Group_15__6__Impl )
            // InternalMyDsl.g:3428:2: rule__AmbienteDesplegue__Group_15__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_15__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__6"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15__6__Impl"
    // InternalMyDsl.g:3434:1: rule__AmbienteDesplegue__Group_15__6__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__AmbienteDesplegue__Group_15__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3438:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:3439:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:3439:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:3440:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_15_6()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_15_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15__6__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15_4__0"
    // InternalMyDsl.g:3450:1: rule__AmbienteDesplegue__Group_15_4__0 : rule__AmbienteDesplegue__Group_15_4__0__Impl rule__AmbienteDesplegue__Group_15_4__1 ;
    public final void rule__AmbienteDesplegue__Group_15_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3454:1: ( rule__AmbienteDesplegue__Group_15_4__0__Impl rule__AmbienteDesplegue__Group_15_4__1 )
            // InternalMyDsl.g:3455:2: rule__AmbienteDesplegue__Group_15_4__0__Impl rule__AmbienteDesplegue__Group_15_4__1
            {
            pushFollow(FOLLOW_5);
            rule__AmbienteDesplegue__Group_15_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_15_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15_4__0"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15_4__0__Impl"
    // InternalMyDsl.g:3462:1: rule__AmbienteDesplegue__Group_15_4__0__Impl : ( RULE_COMMA ) ;
    public final void rule__AmbienteDesplegue__Group_15_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3466:1: ( ( RULE_COMMA ) )
            // InternalMyDsl.g:3467:1: ( RULE_COMMA )
            {
            // InternalMyDsl.g:3467:1: ( RULE_COMMA )
            // InternalMyDsl.g:3468:2: RULE_COMMA
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getCOMMATerminalRuleCall_15_4_0()); 
            match(input,RULE_COMMA,FOLLOW_2); 
             after(grammarAccess.getAmbienteDesplegueAccess().getCOMMATerminalRuleCall_15_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15_4__0__Impl"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15_4__1"
    // InternalMyDsl.g:3477:1: rule__AmbienteDesplegue__Group_15_4__1 : rule__AmbienteDesplegue__Group_15_4__1__Impl ;
    public final void rule__AmbienteDesplegue__Group_15_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3481:1: ( rule__AmbienteDesplegue__Group_15_4__1__Impl )
            // InternalMyDsl.g:3482:2: rule__AmbienteDesplegue__Group_15_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__Group_15_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15_4__1"


    // $ANTLR start "rule__AmbienteDesplegue__Group_15_4__1__Impl"
    // InternalMyDsl.g:3488:1: rule__AmbienteDesplegue__Group_15_4__1__Impl : ( ( rule__AmbienteDesplegue__ConexionAssignment_15_4_1 ) ) ;
    public final void rule__AmbienteDesplegue__Group_15_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3492:1: ( ( ( rule__AmbienteDesplegue__ConexionAssignment_15_4_1 ) ) )
            // InternalMyDsl.g:3493:1: ( ( rule__AmbienteDesplegue__ConexionAssignment_15_4_1 ) )
            {
            // InternalMyDsl.g:3493:1: ( ( rule__AmbienteDesplegue__ConexionAssignment_15_4_1 ) )
            // InternalMyDsl.g:3494:2: ( rule__AmbienteDesplegue__ConexionAssignment_15_4_1 )
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getConexionAssignment_15_4_1()); 
            // InternalMyDsl.g:3495:2: ( rule__AmbienteDesplegue__ConexionAssignment_15_4_1 )
            // InternalMyDsl.g:3495:3: rule__AmbienteDesplegue__ConexionAssignment_15_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AmbienteDesplegue__ConexionAssignment_15_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAmbienteDesplegueAccess().getConexionAssignment_15_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__Group_15_4__1__Impl"


    // $ANTLR start "rule__SecurityGroup__Group__0"
    // InternalMyDsl.g:3504:1: rule__SecurityGroup__Group__0 : rule__SecurityGroup__Group__0__Impl rule__SecurityGroup__Group__1 ;
    public final void rule__SecurityGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3508:1: ( rule__SecurityGroup__Group__0__Impl rule__SecurityGroup__Group__1 )
            // InternalMyDsl.g:3509:2: rule__SecurityGroup__Group__0__Impl rule__SecurityGroup__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SecurityGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__0"


    // $ANTLR start "rule__SecurityGroup__Group__0__Impl"
    // InternalMyDsl.g:3516:1: rule__SecurityGroup__Group__0__Impl : ( () ) ;
    public final void rule__SecurityGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3520:1: ( ( () ) )
            // InternalMyDsl.g:3521:1: ( () )
            {
            // InternalMyDsl.g:3521:1: ( () )
            // InternalMyDsl.g:3522:2: ()
            {
             before(grammarAccess.getSecurityGroupAccess().getSecurityGroupAction_0()); 
            // InternalMyDsl.g:3523:2: ()
            // InternalMyDsl.g:3523:3: 
            {
            }

             after(grammarAccess.getSecurityGroupAccess().getSecurityGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__0__Impl"


    // $ANTLR start "rule__SecurityGroup__Group__1"
    // InternalMyDsl.g:3531:1: rule__SecurityGroup__Group__1 : rule__SecurityGroup__Group__1__Impl rule__SecurityGroup__Group__2 ;
    public final void rule__SecurityGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3535:1: ( rule__SecurityGroup__Group__1__Impl rule__SecurityGroup__Group__2 )
            // InternalMyDsl.g:3536:2: rule__SecurityGroup__Group__1__Impl rule__SecurityGroup__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__SecurityGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__1"


    // $ANTLR start "rule__SecurityGroup__Group__1__Impl"
    // InternalMyDsl.g:3543:1: rule__SecurityGroup__Group__1__Impl : ( RULE_OPEN_BRACE ) ;
    public final void rule__SecurityGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3547:1: ( ( RULE_OPEN_BRACE ) )
            // InternalMyDsl.g:3548:1: ( RULE_OPEN_BRACE )
            {
            // InternalMyDsl.g:3548:1: ( RULE_OPEN_BRACE )
            // InternalMyDsl.g:3549:2: RULE_OPEN_BRACE
            {
             before(grammarAccess.getSecurityGroupAccess().getOPEN_BRACETerminalRuleCall_1()); 
            match(input,RULE_OPEN_BRACE,FOLLOW_2); 
             after(grammarAccess.getSecurityGroupAccess().getOPEN_BRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__1__Impl"


    // $ANTLR start "rule__SecurityGroup__Group__2"
    // InternalMyDsl.g:3558:1: rule__SecurityGroup__Group__2 : rule__SecurityGroup__Group__2__Impl rule__SecurityGroup__Group__3 ;
    public final void rule__SecurityGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3562:1: ( rule__SecurityGroup__Group__2__Impl rule__SecurityGroup__Group__3 )
            // InternalMyDsl.g:3563:2: rule__SecurityGroup__Group__2__Impl rule__SecurityGroup__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__SecurityGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__2"


    // $ANTLR start "rule__SecurityGroup__Group__2__Impl"
    // InternalMyDsl.g:3570:1: rule__SecurityGroup__Group__2__Impl : ( ( rule__SecurityGroup__Group_2__0 )? ) ;
    public final void rule__SecurityGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3574:1: ( ( ( rule__SecurityGroup__Group_2__0 )? ) )
            // InternalMyDsl.g:3575:1: ( ( rule__SecurityGroup__Group_2__0 )? )
            {
            // InternalMyDsl.g:3575:1: ( ( rule__SecurityGroup__Group_2__0 )? )
            // InternalMyDsl.g:3576:2: ( rule__SecurityGroup__Group_2__0 )?
            {
             before(grammarAccess.getSecurityGroupAccess().getGroup_2()); 
            // InternalMyDsl.g:3577:2: ( rule__SecurityGroup__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==54) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:3577:3: rule__SecurityGroup__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecurityGroup__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSecurityGroupAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__2__Impl"


    // $ANTLR start "rule__SecurityGroup__Group__3"
    // InternalMyDsl.g:3585:1: rule__SecurityGroup__Group__3 : rule__SecurityGroup__Group__3__Impl rule__SecurityGroup__Group__4 ;
    public final void rule__SecurityGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3589:1: ( rule__SecurityGroup__Group__3__Impl rule__SecurityGroup__Group__4 )
            // InternalMyDsl.g:3590:2: rule__SecurityGroup__Group__3__Impl rule__SecurityGroup__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__SecurityGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__3"


    // $ANTLR start "rule__SecurityGroup__Group__3__Impl"
    // InternalMyDsl.g:3597:1: rule__SecurityGroup__Group__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__SecurityGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3601:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:3602:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:3602:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:3603:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getSecurityGroupAccess().getSEMI_COLONTerminalRuleCall_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getSecurityGroupAccess().getSEMI_COLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__3__Impl"


    // $ANTLR start "rule__SecurityGroup__Group__4"
    // InternalMyDsl.g:3612:1: rule__SecurityGroup__Group__4 : rule__SecurityGroup__Group__4__Impl rule__SecurityGroup__Group__5 ;
    public final void rule__SecurityGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3616:1: ( rule__SecurityGroup__Group__4__Impl rule__SecurityGroup__Group__5 )
            // InternalMyDsl.g:3617:2: rule__SecurityGroup__Group__4__Impl rule__SecurityGroup__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__SecurityGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__4"


    // $ANTLR start "rule__SecurityGroup__Group__4__Impl"
    // InternalMyDsl.g:3624:1: rule__SecurityGroup__Group__4__Impl : ( ( rule__SecurityGroup__Group_4__0 )? ) ;
    public final void rule__SecurityGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3628:1: ( ( ( rule__SecurityGroup__Group_4__0 )? ) )
            // InternalMyDsl.g:3629:1: ( ( rule__SecurityGroup__Group_4__0 )? )
            {
            // InternalMyDsl.g:3629:1: ( ( rule__SecurityGroup__Group_4__0 )? )
            // InternalMyDsl.g:3630:2: ( rule__SecurityGroup__Group_4__0 )?
            {
             before(grammarAccess.getSecurityGroupAccess().getGroup_4()); 
            // InternalMyDsl.g:3631:2: ( rule__SecurityGroup__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==57) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:3631:3: rule__SecurityGroup__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecurityGroup__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSecurityGroupAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__4__Impl"


    // $ANTLR start "rule__SecurityGroup__Group__5"
    // InternalMyDsl.g:3639:1: rule__SecurityGroup__Group__5 : rule__SecurityGroup__Group__5__Impl rule__SecurityGroup__Group__6 ;
    public final void rule__SecurityGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3643:1: ( rule__SecurityGroup__Group__5__Impl rule__SecurityGroup__Group__6 )
            // InternalMyDsl.g:3644:2: rule__SecurityGroup__Group__5__Impl rule__SecurityGroup__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__SecurityGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__5"


    // $ANTLR start "rule__SecurityGroup__Group__5__Impl"
    // InternalMyDsl.g:3651:1: rule__SecurityGroup__Group__5__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__SecurityGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3655:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:3656:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:3656:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:3657:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getSecurityGroupAccess().getSEMI_COLONTerminalRuleCall_5()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getSecurityGroupAccess().getSEMI_COLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__5__Impl"


    // $ANTLR start "rule__SecurityGroup__Group__6"
    // InternalMyDsl.g:3666:1: rule__SecurityGroup__Group__6 : rule__SecurityGroup__Group__6__Impl ;
    public final void rule__SecurityGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3670:1: ( rule__SecurityGroup__Group__6__Impl )
            // InternalMyDsl.g:3671:2: rule__SecurityGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__6"


    // $ANTLR start "rule__SecurityGroup__Group__6__Impl"
    // InternalMyDsl.g:3677:1: rule__SecurityGroup__Group__6__Impl : ( RULE_CLOSE_BRACE ) ;
    public final void rule__SecurityGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3681:1: ( ( RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:3682:1: ( RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:3682:1: ( RULE_CLOSE_BRACE )
            // InternalMyDsl.g:3683:2: RULE_CLOSE_BRACE
            {
             before(grammarAccess.getSecurityGroupAccess().getCLOSE_BRACETerminalRuleCall_6()); 
            match(input,RULE_CLOSE_BRACE,FOLLOW_2); 
             after(grammarAccess.getSecurityGroupAccess().getCLOSE_BRACETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group__6__Impl"


    // $ANTLR start "rule__SecurityGroup__Group_2__0"
    // InternalMyDsl.g:3693:1: rule__SecurityGroup__Group_2__0 : rule__SecurityGroup__Group_2__0__Impl rule__SecurityGroup__Group_2__1 ;
    public final void rule__SecurityGroup__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3697:1: ( rule__SecurityGroup__Group_2__0__Impl rule__SecurityGroup__Group_2__1 )
            // InternalMyDsl.g:3698:2: rule__SecurityGroup__Group_2__0__Impl rule__SecurityGroup__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__SecurityGroup__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_2__0"


    // $ANTLR start "rule__SecurityGroup__Group_2__0__Impl"
    // InternalMyDsl.g:3705:1: rule__SecurityGroup__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__SecurityGroup__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3709:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:3710:1: ( 'nombre' )
            {
            // InternalMyDsl.g:3710:1: ( 'nombre' )
            // InternalMyDsl.g:3711:2: 'nombre'
            {
             before(grammarAccess.getSecurityGroupAccess().getNombreKeyword_2_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSecurityGroupAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_2__0__Impl"


    // $ANTLR start "rule__SecurityGroup__Group_2__1"
    // InternalMyDsl.g:3720:1: rule__SecurityGroup__Group_2__1 : rule__SecurityGroup__Group_2__1__Impl rule__SecurityGroup__Group_2__2 ;
    public final void rule__SecurityGroup__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3724:1: ( rule__SecurityGroup__Group_2__1__Impl rule__SecurityGroup__Group_2__2 )
            // InternalMyDsl.g:3725:2: rule__SecurityGroup__Group_2__1__Impl rule__SecurityGroup__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__SecurityGroup__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_2__1"


    // $ANTLR start "rule__SecurityGroup__Group_2__1__Impl"
    // InternalMyDsl.g:3732:1: rule__SecurityGroup__Group_2__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__SecurityGroup__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3736:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:3737:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:3737:1: ( RULE_EQUALS )
            // InternalMyDsl.g:3738:2: RULE_EQUALS
            {
             before(grammarAccess.getSecurityGroupAccess().getEQUALSTerminalRuleCall_2_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getSecurityGroupAccess().getEQUALSTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_2__1__Impl"


    // $ANTLR start "rule__SecurityGroup__Group_2__2"
    // InternalMyDsl.g:3747:1: rule__SecurityGroup__Group_2__2 : rule__SecurityGroup__Group_2__2__Impl ;
    public final void rule__SecurityGroup__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3751:1: ( rule__SecurityGroup__Group_2__2__Impl )
            // InternalMyDsl.g:3752:2: rule__SecurityGroup__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_2__2"


    // $ANTLR start "rule__SecurityGroup__Group_2__2__Impl"
    // InternalMyDsl.g:3758:1: rule__SecurityGroup__Group_2__2__Impl : ( ( rule__SecurityGroup__NameAssignment_2_2 ) ) ;
    public final void rule__SecurityGroup__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3762:1: ( ( ( rule__SecurityGroup__NameAssignment_2_2 ) ) )
            // InternalMyDsl.g:3763:1: ( ( rule__SecurityGroup__NameAssignment_2_2 ) )
            {
            // InternalMyDsl.g:3763:1: ( ( rule__SecurityGroup__NameAssignment_2_2 ) )
            // InternalMyDsl.g:3764:2: ( rule__SecurityGroup__NameAssignment_2_2 )
            {
             before(grammarAccess.getSecurityGroupAccess().getNameAssignment_2_2()); 
            // InternalMyDsl.g:3765:2: ( rule__SecurityGroup__NameAssignment_2_2 )
            // InternalMyDsl.g:3765:3: rule__SecurityGroup__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__SecurityGroup__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSecurityGroupAccess().getNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_2__2__Impl"


    // $ANTLR start "rule__SecurityGroup__Group_4__0"
    // InternalMyDsl.g:3774:1: rule__SecurityGroup__Group_4__0 : rule__SecurityGroup__Group_4__0__Impl rule__SecurityGroup__Group_4__1 ;
    public final void rule__SecurityGroup__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3778:1: ( rule__SecurityGroup__Group_4__0__Impl rule__SecurityGroup__Group_4__1 )
            // InternalMyDsl.g:3779:2: rule__SecurityGroup__Group_4__0__Impl rule__SecurityGroup__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__SecurityGroup__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_4__0"


    // $ANTLR start "rule__SecurityGroup__Group_4__0__Impl"
    // InternalMyDsl.g:3786:1: rule__SecurityGroup__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__SecurityGroup__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3790:1: ( ( 'description' ) )
            // InternalMyDsl.g:3791:1: ( 'description' )
            {
            // InternalMyDsl.g:3791:1: ( 'description' )
            // InternalMyDsl.g:3792:2: 'description'
            {
             before(grammarAccess.getSecurityGroupAccess().getDescriptionKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getSecurityGroupAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_4__0__Impl"


    // $ANTLR start "rule__SecurityGroup__Group_4__1"
    // InternalMyDsl.g:3801:1: rule__SecurityGroup__Group_4__1 : rule__SecurityGroup__Group_4__1__Impl rule__SecurityGroup__Group_4__2 ;
    public final void rule__SecurityGroup__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3805:1: ( rule__SecurityGroup__Group_4__1__Impl rule__SecurityGroup__Group_4__2 )
            // InternalMyDsl.g:3806:2: rule__SecurityGroup__Group_4__1__Impl rule__SecurityGroup__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__SecurityGroup__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_4__1"


    // $ANTLR start "rule__SecurityGroup__Group_4__1__Impl"
    // InternalMyDsl.g:3813:1: rule__SecurityGroup__Group_4__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__SecurityGroup__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3817:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:3818:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:3818:1: ( RULE_EQUALS )
            // InternalMyDsl.g:3819:2: RULE_EQUALS
            {
             before(grammarAccess.getSecurityGroupAccess().getEQUALSTerminalRuleCall_4_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getSecurityGroupAccess().getEQUALSTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_4__1__Impl"


    // $ANTLR start "rule__SecurityGroup__Group_4__2"
    // InternalMyDsl.g:3828:1: rule__SecurityGroup__Group_4__2 : rule__SecurityGroup__Group_4__2__Impl ;
    public final void rule__SecurityGroup__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3832:1: ( rule__SecurityGroup__Group_4__2__Impl )
            // InternalMyDsl.g:3833:2: rule__SecurityGroup__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecurityGroup__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_4__2"


    // $ANTLR start "rule__SecurityGroup__Group_4__2__Impl"
    // InternalMyDsl.g:3839:1: rule__SecurityGroup__Group_4__2__Impl : ( ( rule__SecurityGroup__DescriptionAssignment_4_2 ) ) ;
    public final void rule__SecurityGroup__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3843:1: ( ( ( rule__SecurityGroup__DescriptionAssignment_4_2 ) ) )
            // InternalMyDsl.g:3844:1: ( ( rule__SecurityGroup__DescriptionAssignment_4_2 ) )
            {
            // InternalMyDsl.g:3844:1: ( ( rule__SecurityGroup__DescriptionAssignment_4_2 ) )
            // InternalMyDsl.g:3845:2: ( rule__SecurityGroup__DescriptionAssignment_4_2 )
            {
             before(grammarAccess.getSecurityGroupAccess().getDescriptionAssignment_4_2()); 
            // InternalMyDsl.g:3846:2: ( rule__SecurityGroup__DescriptionAssignment_4_2 )
            // InternalMyDsl.g:3846:3: rule__SecurityGroup__DescriptionAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SecurityGroup__DescriptionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSecurityGroupAccess().getDescriptionAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__Group_4__2__Impl"


    // $ANTLR start "rule__Subred__Group__0"
    // InternalMyDsl.g:3855:1: rule__Subred__Group__0 : rule__Subred__Group__0__Impl rule__Subred__Group__1 ;
    public final void rule__Subred__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3859:1: ( rule__Subred__Group__0__Impl rule__Subred__Group__1 )
            // InternalMyDsl.g:3860:2: rule__Subred__Group__0__Impl rule__Subred__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Subred__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__0"


    // $ANTLR start "rule__Subred__Group__0__Impl"
    // InternalMyDsl.g:3867:1: rule__Subred__Group__0__Impl : ( () ) ;
    public final void rule__Subred__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3871:1: ( ( () ) )
            // InternalMyDsl.g:3872:1: ( () )
            {
            // InternalMyDsl.g:3872:1: ( () )
            // InternalMyDsl.g:3873:2: ()
            {
             before(grammarAccess.getSubredAccess().getSubredAction_0()); 
            // InternalMyDsl.g:3874:2: ()
            // InternalMyDsl.g:3874:3: 
            {
            }

             after(grammarAccess.getSubredAccess().getSubredAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__0__Impl"


    // $ANTLR start "rule__Subred__Group__1"
    // InternalMyDsl.g:3882:1: rule__Subred__Group__1 : rule__Subred__Group__1__Impl rule__Subred__Group__2 ;
    public final void rule__Subred__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3886:1: ( rule__Subred__Group__1__Impl rule__Subred__Group__2 )
            // InternalMyDsl.g:3887:2: rule__Subred__Group__1__Impl rule__Subred__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Subred__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__1"


    // $ANTLR start "rule__Subred__Group__1__Impl"
    // InternalMyDsl.g:3894:1: rule__Subred__Group__1__Impl : ( RULE_OPEN_BRACE ) ;
    public final void rule__Subred__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3898:1: ( ( RULE_OPEN_BRACE ) )
            // InternalMyDsl.g:3899:1: ( RULE_OPEN_BRACE )
            {
            // InternalMyDsl.g:3899:1: ( RULE_OPEN_BRACE )
            // InternalMyDsl.g:3900:2: RULE_OPEN_BRACE
            {
             before(grammarAccess.getSubredAccess().getOPEN_BRACETerminalRuleCall_1()); 
            match(input,RULE_OPEN_BRACE,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getOPEN_BRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__1__Impl"


    // $ANTLR start "rule__Subred__Group__2"
    // InternalMyDsl.g:3909:1: rule__Subred__Group__2 : rule__Subred__Group__2__Impl rule__Subred__Group__3 ;
    public final void rule__Subred__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3913:1: ( rule__Subred__Group__2__Impl rule__Subred__Group__3 )
            // InternalMyDsl.g:3914:2: rule__Subred__Group__2__Impl rule__Subred__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Subred__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__2"


    // $ANTLR start "rule__Subred__Group__2__Impl"
    // InternalMyDsl.g:3921:1: rule__Subred__Group__2__Impl : ( ( rule__Subred__Group_2__0 )? ) ;
    public final void rule__Subred__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3925:1: ( ( ( rule__Subred__Group_2__0 )? ) )
            // InternalMyDsl.g:3926:1: ( ( rule__Subred__Group_2__0 )? )
            {
            // InternalMyDsl.g:3926:1: ( ( rule__Subred__Group_2__0 )? )
            // InternalMyDsl.g:3927:2: ( rule__Subred__Group_2__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_2()); 
            // InternalMyDsl.g:3928:2: ( rule__Subred__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==58) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3928:3: rule__Subred__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__2__Impl"


    // $ANTLR start "rule__Subred__Group__3"
    // InternalMyDsl.g:3936:1: rule__Subred__Group__3 : rule__Subred__Group__3__Impl rule__Subred__Group__4 ;
    public final void rule__Subred__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3940:1: ( rule__Subred__Group__3__Impl rule__Subred__Group__4 )
            // InternalMyDsl.g:3941:2: rule__Subred__Group__3__Impl rule__Subred__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Subred__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__3"


    // $ANTLR start "rule__Subred__Group__3__Impl"
    // InternalMyDsl.g:3948:1: rule__Subred__Group__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Subred__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3952:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:3953:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:3953:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:3954:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getSubredAccess().getSEMI_COLONTerminalRuleCall_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getSEMI_COLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__3__Impl"


    // $ANTLR start "rule__Subred__Group__4"
    // InternalMyDsl.g:3963:1: rule__Subred__Group__4 : rule__Subred__Group__4__Impl rule__Subred__Group__5 ;
    public final void rule__Subred__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3967:1: ( rule__Subred__Group__4__Impl rule__Subred__Group__5 )
            // InternalMyDsl.g:3968:2: rule__Subred__Group__4__Impl rule__Subred__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Subred__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__4"


    // $ANTLR start "rule__Subred__Group__4__Impl"
    // InternalMyDsl.g:3975:1: rule__Subred__Group__4__Impl : ( ( rule__Subred__Group_4__0 )? ) ;
    public final void rule__Subred__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3979:1: ( ( ( rule__Subred__Group_4__0 )? ) )
            // InternalMyDsl.g:3980:1: ( ( rule__Subred__Group_4__0 )? )
            {
            // InternalMyDsl.g:3980:1: ( ( rule__Subred__Group_4__0 )? )
            // InternalMyDsl.g:3981:2: ( rule__Subred__Group_4__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_4()); 
            // InternalMyDsl.g:3982:2: ( rule__Subred__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==59) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3982:3: rule__Subred__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__4__Impl"


    // $ANTLR start "rule__Subred__Group__5"
    // InternalMyDsl.g:3990:1: rule__Subred__Group__5 : rule__Subred__Group__5__Impl rule__Subred__Group__6 ;
    public final void rule__Subred__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3994:1: ( rule__Subred__Group__5__Impl rule__Subred__Group__6 )
            // InternalMyDsl.g:3995:2: rule__Subred__Group__5__Impl rule__Subred__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Subred__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__5"


    // $ANTLR start "rule__Subred__Group__5__Impl"
    // InternalMyDsl.g:4002:1: rule__Subred__Group__5__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Subred__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4006:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:4007:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:4007:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:4008:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getSubredAccess().getSEMI_COLONTerminalRuleCall_5()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getSEMI_COLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__5__Impl"


    // $ANTLR start "rule__Subred__Group__6"
    // InternalMyDsl.g:4017:1: rule__Subred__Group__6 : rule__Subred__Group__6__Impl rule__Subred__Group__7 ;
    public final void rule__Subred__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4021:1: ( rule__Subred__Group__6__Impl rule__Subred__Group__7 )
            // InternalMyDsl.g:4022:2: rule__Subred__Group__6__Impl rule__Subred__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Subred__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__6"


    // $ANTLR start "rule__Subred__Group__6__Impl"
    // InternalMyDsl.g:4029:1: rule__Subred__Group__6__Impl : ( ( rule__Subred__Group_6__0 )? ) ;
    public final void rule__Subred__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4033:1: ( ( ( rule__Subred__Group_6__0 )? ) )
            // InternalMyDsl.g:4034:1: ( ( rule__Subred__Group_6__0 )? )
            {
            // InternalMyDsl.g:4034:1: ( ( rule__Subred__Group_6__0 )? )
            // InternalMyDsl.g:4035:2: ( rule__Subred__Group_6__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_6()); 
            // InternalMyDsl.g:4036:2: ( rule__Subred__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==60) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:4036:3: rule__Subred__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__6__Impl"


    // $ANTLR start "rule__Subred__Group__7"
    // InternalMyDsl.g:4044:1: rule__Subred__Group__7 : rule__Subred__Group__7__Impl rule__Subred__Group__8 ;
    public final void rule__Subred__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4048:1: ( rule__Subred__Group__7__Impl rule__Subred__Group__8 )
            // InternalMyDsl.g:4049:2: rule__Subred__Group__7__Impl rule__Subred__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Subred__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__7"


    // $ANTLR start "rule__Subred__Group__7__Impl"
    // InternalMyDsl.g:4056:1: rule__Subred__Group__7__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Subred__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4060:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:4061:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:4061:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:4062:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getSubredAccess().getSEMI_COLONTerminalRuleCall_7()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getSEMI_COLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__7__Impl"


    // $ANTLR start "rule__Subred__Group__8"
    // InternalMyDsl.g:4071:1: rule__Subred__Group__8 : rule__Subred__Group__8__Impl ;
    public final void rule__Subred__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4075:1: ( rule__Subred__Group__8__Impl )
            // InternalMyDsl.g:4076:2: rule__Subred__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__8"


    // $ANTLR start "rule__Subred__Group__8__Impl"
    // InternalMyDsl.g:4082:1: rule__Subred__Group__8__Impl : ( RULE_CLOSE_BRACE ) ;
    public final void rule__Subred__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4086:1: ( ( RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:4087:1: ( RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:4087:1: ( RULE_CLOSE_BRACE )
            // InternalMyDsl.g:4088:2: RULE_CLOSE_BRACE
            {
             before(grammarAccess.getSubredAccess().getCLOSE_BRACETerminalRuleCall_8()); 
            match(input,RULE_CLOSE_BRACE,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getCLOSE_BRACETerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__8__Impl"


    // $ANTLR start "rule__Subred__Group_2__0"
    // InternalMyDsl.g:4098:1: rule__Subred__Group_2__0 : rule__Subred__Group_2__0__Impl rule__Subred__Group_2__1 ;
    public final void rule__Subred__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4102:1: ( rule__Subred__Group_2__0__Impl rule__Subred__Group_2__1 )
            // InternalMyDsl.g:4103:2: rule__Subred__Group_2__0__Impl rule__Subred__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Subred__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_2__0"


    // $ANTLR start "rule__Subred__Group_2__0__Impl"
    // InternalMyDsl.g:4110:1: rule__Subred__Group_2__0__Impl : ( 'name' ) ;
    public final void rule__Subred__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4114:1: ( ( 'name' ) )
            // InternalMyDsl.g:4115:1: ( 'name' )
            {
            // InternalMyDsl.g:4115:1: ( 'name' )
            // InternalMyDsl.g:4116:2: 'name'
            {
             before(grammarAccess.getSubredAccess().getNameKeyword_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getNameKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_2__0__Impl"


    // $ANTLR start "rule__Subred__Group_2__1"
    // InternalMyDsl.g:4125:1: rule__Subred__Group_2__1 : rule__Subred__Group_2__1__Impl rule__Subred__Group_2__2 ;
    public final void rule__Subred__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4129:1: ( rule__Subred__Group_2__1__Impl rule__Subred__Group_2__2 )
            // InternalMyDsl.g:4130:2: rule__Subred__Group_2__1__Impl rule__Subred__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Subred__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_2__1"


    // $ANTLR start "rule__Subred__Group_2__1__Impl"
    // InternalMyDsl.g:4137:1: rule__Subred__Group_2__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Subred__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4141:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:4142:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:4142:1: ( RULE_EQUALS )
            // InternalMyDsl.g:4143:2: RULE_EQUALS
            {
             before(grammarAccess.getSubredAccess().getEQUALSTerminalRuleCall_2_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getEQUALSTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_2__1__Impl"


    // $ANTLR start "rule__Subred__Group_2__2"
    // InternalMyDsl.g:4152:1: rule__Subred__Group_2__2 : rule__Subred__Group_2__2__Impl ;
    public final void rule__Subred__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4156:1: ( rule__Subred__Group_2__2__Impl )
            // InternalMyDsl.g:4157:2: rule__Subred__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_2__2"


    // $ANTLR start "rule__Subred__Group_2__2__Impl"
    // InternalMyDsl.g:4163:1: rule__Subred__Group_2__2__Impl : ( ( rule__Subred__NameAssignment_2_2 ) ) ;
    public final void rule__Subred__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4167:1: ( ( ( rule__Subred__NameAssignment_2_2 ) ) )
            // InternalMyDsl.g:4168:1: ( ( rule__Subred__NameAssignment_2_2 ) )
            {
            // InternalMyDsl.g:4168:1: ( ( rule__Subred__NameAssignment_2_2 ) )
            // InternalMyDsl.g:4169:2: ( rule__Subred__NameAssignment_2_2 )
            {
             before(grammarAccess.getSubredAccess().getNameAssignment_2_2()); 
            // InternalMyDsl.g:4170:2: ( rule__Subred__NameAssignment_2_2 )
            // InternalMyDsl.g:4170:3: rule__Subred__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Subred__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_2__2__Impl"


    // $ANTLR start "rule__Subred__Group_4__0"
    // InternalMyDsl.g:4179:1: rule__Subred__Group_4__0 : rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1 ;
    public final void rule__Subred__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4183:1: ( rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1 )
            // InternalMyDsl.g:4184:2: rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Subred__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__0"


    // $ANTLR start "rule__Subred__Group_4__0__Impl"
    // InternalMyDsl.g:4191:1: rule__Subred__Group_4__0__Impl : ( 'cidr' ) ;
    public final void rule__Subred__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4195:1: ( ( 'cidr' ) )
            // InternalMyDsl.g:4196:1: ( 'cidr' )
            {
            // InternalMyDsl.g:4196:1: ( 'cidr' )
            // InternalMyDsl.g:4197:2: 'cidr'
            {
             before(grammarAccess.getSubredAccess().getCidrKeyword_4_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getCidrKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__0__Impl"


    // $ANTLR start "rule__Subred__Group_4__1"
    // InternalMyDsl.g:4206:1: rule__Subred__Group_4__1 : rule__Subred__Group_4__1__Impl rule__Subred__Group_4__2 ;
    public final void rule__Subred__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4210:1: ( rule__Subred__Group_4__1__Impl rule__Subred__Group_4__2 )
            // InternalMyDsl.g:4211:2: rule__Subred__Group_4__1__Impl rule__Subred__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Subred__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__1"


    // $ANTLR start "rule__Subred__Group_4__1__Impl"
    // InternalMyDsl.g:4218:1: rule__Subred__Group_4__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Subred__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4222:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:4223:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:4223:1: ( RULE_EQUALS )
            // InternalMyDsl.g:4224:2: RULE_EQUALS
            {
             before(grammarAccess.getSubredAccess().getEQUALSTerminalRuleCall_4_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getEQUALSTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__1__Impl"


    // $ANTLR start "rule__Subred__Group_4__2"
    // InternalMyDsl.g:4233:1: rule__Subred__Group_4__2 : rule__Subred__Group_4__2__Impl ;
    public final void rule__Subred__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4237:1: ( rule__Subred__Group_4__2__Impl )
            // InternalMyDsl.g:4238:2: rule__Subred__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__2"


    // $ANTLR start "rule__Subred__Group_4__2__Impl"
    // InternalMyDsl.g:4244:1: rule__Subred__Group_4__2__Impl : ( ( rule__Subred__CidrAssignment_4_2 ) ) ;
    public final void rule__Subred__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4248:1: ( ( ( rule__Subred__CidrAssignment_4_2 ) ) )
            // InternalMyDsl.g:4249:1: ( ( rule__Subred__CidrAssignment_4_2 ) )
            {
            // InternalMyDsl.g:4249:1: ( ( rule__Subred__CidrAssignment_4_2 ) )
            // InternalMyDsl.g:4250:2: ( rule__Subred__CidrAssignment_4_2 )
            {
             before(grammarAccess.getSubredAccess().getCidrAssignment_4_2()); 
            // InternalMyDsl.g:4251:2: ( rule__Subred__CidrAssignment_4_2 )
            // InternalMyDsl.g:4251:3: rule__Subred__CidrAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Subred__CidrAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getCidrAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__2__Impl"


    // $ANTLR start "rule__Subred__Group_6__0"
    // InternalMyDsl.g:4260:1: rule__Subred__Group_6__0 : rule__Subred__Group_6__0__Impl rule__Subred__Group_6__1 ;
    public final void rule__Subred__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4264:1: ( rule__Subred__Group_6__0__Impl rule__Subred__Group_6__1 )
            // InternalMyDsl.g:4265:2: rule__Subred__Group_6__0__Impl rule__Subred__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Subred__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__0"


    // $ANTLR start "rule__Subred__Group_6__0__Impl"
    // InternalMyDsl.g:4272:1: rule__Subred__Group_6__0__Impl : ( 'az' ) ;
    public final void rule__Subred__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4276:1: ( ( 'az' ) )
            // InternalMyDsl.g:4277:1: ( 'az' )
            {
            // InternalMyDsl.g:4277:1: ( 'az' )
            // InternalMyDsl.g:4278:2: 'az'
            {
             before(grammarAccess.getSubredAccess().getAzKeyword_6_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getAzKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__0__Impl"


    // $ANTLR start "rule__Subred__Group_6__1"
    // InternalMyDsl.g:4287:1: rule__Subred__Group_6__1 : rule__Subred__Group_6__1__Impl rule__Subred__Group_6__2 ;
    public final void rule__Subred__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4291:1: ( rule__Subred__Group_6__1__Impl rule__Subred__Group_6__2 )
            // InternalMyDsl.g:4292:2: rule__Subred__Group_6__1__Impl rule__Subred__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__Subred__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__1"


    // $ANTLR start "rule__Subred__Group_6__1__Impl"
    // InternalMyDsl.g:4299:1: rule__Subred__Group_6__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__Subred__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4303:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:4304:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:4304:1: ( RULE_EQUALS )
            // InternalMyDsl.g:4305:2: RULE_EQUALS
            {
             before(grammarAccess.getSubredAccess().getEQUALSTerminalRuleCall_6_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getEQUALSTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__1__Impl"


    // $ANTLR start "rule__Subred__Group_6__2"
    // InternalMyDsl.g:4314:1: rule__Subred__Group_6__2 : rule__Subred__Group_6__2__Impl ;
    public final void rule__Subred__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4318:1: ( rule__Subred__Group_6__2__Impl )
            // InternalMyDsl.g:4319:2: rule__Subred__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__2"


    // $ANTLR start "rule__Subred__Group_6__2__Impl"
    // InternalMyDsl.g:4325:1: rule__Subred__Group_6__2__Impl : ( ( rule__Subred__AzAssignment_6_2 ) ) ;
    public final void rule__Subred__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4329:1: ( ( ( rule__Subred__AzAssignment_6_2 ) ) )
            // InternalMyDsl.g:4330:1: ( ( rule__Subred__AzAssignment_6_2 ) )
            {
            // InternalMyDsl.g:4330:1: ( ( rule__Subred__AzAssignment_6_2 ) )
            // InternalMyDsl.g:4331:2: ( rule__Subred__AzAssignment_6_2 )
            {
             before(grammarAccess.getSubredAccess().getAzAssignment_6_2()); 
            // InternalMyDsl.g:4332:2: ( rule__Subred__AzAssignment_6_2 )
            // InternalMyDsl.g:4332:3: rule__Subred__AzAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Subred__AzAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getAzAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__2__Impl"


    // $ANTLR start "rule__VPC__Group__0"
    // InternalMyDsl.g:4341:1: rule__VPC__Group__0 : rule__VPC__Group__0__Impl rule__VPC__Group__1 ;
    public final void rule__VPC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4345:1: ( rule__VPC__Group__0__Impl rule__VPC__Group__1 )
            // InternalMyDsl.g:4346:2: rule__VPC__Group__0__Impl rule__VPC__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__VPC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__0"


    // $ANTLR start "rule__VPC__Group__0__Impl"
    // InternalMyDsl.g:4353:1: rule__VPC__Group__0__Impl : ( () ) ;
    public final void rule__VPC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4357:1: ( ( () ) )
            // InternalMyDsl.g:4358:1: ( () )
            {
            // InternalMyDsl.g:4358:1: ( () )
            // InternalMyDsl.g:4359:2: ()
            {
             before(grammarAccess.getVPCAccess().getVPCAction_0()); 
            // InternalMyDsl.g:4360:2: ()
            // InternalMyDsl.g:4360:3: 
            {
            }

             after(grammarAccess.getVPCAccess().getVPCAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__0__Impl"


    // $ANTLR start "rule__VPC__Group__1"
    // InternalMyDsl.g:4368:1: rule__VPC__Group__1 : rule__VPC__Group__1__Impl rule__VPC__Group__2 ;
    public final void rule__VPC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4372:1: ( rule__VPC__Group__1__Impl rule__VPC__Group__2 )
            // InternalMyDsl.g:4373:2: rule__VPC__Group__1__Impl rule__VPC__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__VPC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__1"


    // $ANTLR start "rule__VPC__Group__1__Impl"
    // InternalMyDsl.g:4380:1: rule__VPC__Group__1__Impl : ( RULE_OPEN_BRACE ) ;
    public final void rule__VPC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4384:1: ( ( RULE_OPEN_BRACE ) )
            // InternalMyDsl.g:4385:1: ( RULE_OPEN_BRACE )
            {
            // InternalMyDsl.g:4385:1: ( RULE_OPEN_BRACE )
            // InternalMyDsl.g:4386:2: RULE_OPEN_BRACE
            {
             before(grammarAccess.getVPCAccess().getOPEN_BRACETerminalRuleCall_1()); 
            match(input,RULE_OPEN_BRACE,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getOPEN_BRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__1__Impl"


    // $ANTLR start "rule__VPC__Group__2"
    // InternalMyDsl.g:4395:1: rule__VPC__Group__2 : rule__VPC__Group__2__Impl rule__VPC__Group__3 ;
    public final void rule__VPC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4399:1: ( rule__VPC__Group__2__Impl rule__VPC__Group__3 )
            // InternalMyDsl.g:4400:2: rule__VPC__Group__2__Impl rule__VPC__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__VPC__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__2"


    // $ANTLR start "rule__VPC__Group__2__Impl"
    // InternalMyDsl.g:4407:1: rule__VPC__Group__2__Impl : ( ( rule__VPC__Group_2__0 )? ) ;
    public final void rule__VPC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4411:1: ( ( ( rule__VPC__Group_2__0 )? ) )
            // InternalMyDsl.g:4412:1: ( ( rule__VPC__Group_2__0 )? )
            {
            // InternalMyDsl.g:4412:1: ( ( rule__VPC__Group_2__0 )? )
            // InternalMyDsl.g:4413:2: ( rule__VPC__Group_2__0 )?
            {
             before(grammarAccess.getVPCAccess().getGroup_2()); 
            // InternalMyDsl.g:4414:2: ( rule__VPC__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==58) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:4414:3: rule__VPC__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VPC__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVPCAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__2__Impl"


    // $ANTLR start "rule__VPC__Group__3"
    // InternalMyDsl.g:4422:1: rule__VPC__Group__3 : rule__VPC__Group__3__Impl rule__VPC__Group__4 ;
    public final void rule__VPC__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4426:1: ( rule__VPC__Group__3__Impl rule__VPC__Group__4 )
            // InternalMyDsl.g:4427:2: rule__VPC__Group__3__Impl rule__VPC__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__VPC__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__3"


    // $ANTLR start "rule__VPC__Group__3__Impl"
    // InternalMyDsl.g:4434:1: rule__VPC__Group__3__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__VPC__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4438:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:4439:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:4439:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:4440:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getVPCAccess().getSEMI_COLONTerminalRuleCall_3()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getSEMI_COLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__3__Impl"


    // $ANTLR start "rule__VPC__Group__4"
    // InternalMyDsl.g:4449:1: rule__VPC__Group__4 : rule__VPC__Group__4__Impl rule__VPC__Group__5 ;
    public final void rule__VPC__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4453:1: ( rule__VPC__Group__4__Impl rule__VPC__Group__5 )
            // InternalMyDsl.g:4454:2: rule__VPC__Group__4__Impl rule__VPC__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__VPC__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__4"


    // $ANTLR start "rule__VPC__Group__4__Impl"
    // InternalMyDsl.g:4461:1: rule__VPC__Group__4__Impl : ( ( rule__VPC__Group_4__0 ) ) ;
    public final void rule__VPC__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4465:1: ( ( ( rule__VPC__Group_4__0 ) ) )
            // InternalMyDsl.g:4466:1: ( ( rule__VPC__Group_4__0 ) )
            {
            // InternalMyDsl.g:4466:1: ( ( rule__VPC__Group_4__0 ) )
            // InternalMyDsl.g:4467:2: ( rule__VPC__Group_4__0 )
            {
             before(grammarAccess.getVPCAccess().getGroup_4()); 
            // InternalMyDsl.g:4468:2: ( rule__VPC__Group_4__0 )
            // InternalMyDsl.g:4468:3: rule__VPC__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__VPC__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getVPCAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__4__Impl"


    // $ANTLR start "rule__VPC__Group__5"
    // InternalMyDsl.g:4476:1: rule__VPC__Group__5 : rule__VPC__Group__5__Impl rule__VPC__Group__6 ;
    public final void rule__VPC__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4480:1: ( rule__VPC__Group__5__Impl rule__VPC__Group__6 )
            // InternalMyDsl.g:4481:2: rule__VPC__Group__5__Impl rule__VPC__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__VPC__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__5"


    // $ANTLR start "rule__VPC__Group__5__Impl"
    // InternalMyDsl.g:4488:1: rule__VPC__Group__5__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__VPC__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4492:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:4493:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:4493:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:4494:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getVPCAccess().getSEMI_COLONTerminalRuleCall_5()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getSEMI_COLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__5__Impl"


    // $ANTLR start "rule__VPC__Group__6"
    // InternalMyDsl.g:4503:1: rule__VPC__Group__6 : rule__VPC__Group__6__Impl ;
    public final void rule__VPC__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4507:1: ( rule__VPC__Group__6__Impl )
            // InternalMyDsl.g:4508:2: rule__VPC__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPC__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__6"


    // $ANTLR start "rule__VPC__Group__6__Impl"
    // InternalMyDsl.g:4514:1: rule__VPC__Group__6__Impl : ( RULE_CLOSE_BRACE ) ;
    public final void rule__VPC__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4518:1: ( ( RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:4519:1: ( RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:4519:1: ( RULE_CLOSE_BRACE )
            // InternalMyDsl.g:4520:2: RULE_CLOSE_BRACE
            {
             before(grammarAccess.getVPCAccess().getCLOSE_BRACETerminalRuleCall_6()); 
            match(input,RULE_CLOSE_BRACE,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getCLOSE_BRACETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group__6__Impl"


    // $ANTLR start "rule__VPC__Group_2__0"
    // InternalMyDsl.g:4530:1: rule__VPC__Group_2__0 : rule__VPC__Group_2__0__Impl rule__VPC__Group_2__1 ;
    public final void rule__VPC__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4534:1: ( rule__VPC__Group_2__0__Impl rule__VPC__Group_2__1 )
            // InternalMyDsl.g:4535:2: rule__VPC__Group_2__0__Impl rule__VPC__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__VPC__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_2__0"


    // $ANTLR start "rule__VPC__Group_2__0__Impl"
    // InternalMyDsl.g:4542:1: rule__VPC__Group_2__0__Impl : ( 'name' ) ;
    public final void rule__VPC__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4546:1: ( ( 'name' ) )
            // InternalMyDsl.g:4547:1: ( 'name' )
            {
            // InternalMyDsl.g:4547:1: ( 'name' )
            // InternalMyDsl.g:4548:2: 'name'
            {
             before(grammarAccess.getVPCAccess().getNameKeyword_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getNameKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_2__0__Impl"


    // $ANTLR start "rule__VPC__Group_2__1"
    // InternalMyDsl.g:4557:1: rule__VPC__Group_2__1 : rule__VPC__Group_2__1__Impl rule__VPC__Group_2__2 ;
    public final void rule__VPC__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4561:1: ( rule__VPC__Group_2__1__Impl rule__VPC__Group_2__2 )
            // InternalMyDsl.g:4562:2: rule__VPC__Group_2__1__Impl rule__VPC__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__VPC__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_2__1"


    // $ANTLR start "rule__VPC__Group_2__1__Impl"
    // InternalMyDsl.g:4569:1: rule__VPC__Group_2__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__VPC__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4573:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:4574:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:4574:1: ( RULE_EQUALS )
            // InternalMyDsl.g:4575:2: RULE_EQUALS
            {
             before(grammarAccess.getVPCAccess().getEQUALSTerminalRuleCall_2_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getEQUALSTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_2__1__Impl"


    // $ANTLR start "rule__VPC__Group_2__2"
    // InternalMyDsl.g:4584:1: rule__VPC__Group_2__2 : rule__VPC__Group_2__2__Impl ;
    public final void rule__VPC__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4588:1: ( rule__VPC__Group_2__2__Impl )
            // InternalMyDsl.g:4589:2: rule__VPC__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPC__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_2__2"


    // $ANTLR start "rule__VPC__Group_2__2__Impl"
    // InternalMyDsl.g:4595:1: rule__VPC__Group_2__2__Impl : ( ( rule__VPC__NameAssignment_2_2 ) ) ;
    public final void rule__VPC__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4599:1: ( ( ( rule__VPC__NameAssignment_2_2 ) ) )
            // InternalMyDsl.g:4600:1: ( ( rule__VPC__NameAssignment_2_2 ) )
            {
            // InternalMyDsl.g:4600:1: ( ( rule__VPC__NameAssignment_2_2 ) )
            // InternalMyDsl.g:4601:2: ( rule__VPC__NameAssignment_2_2 )
            {
             before(grammarAccess.getVPCAccess().getNameAssignment_2_2()); 
            // InternalMyDsl.g:4602:2: ( rule__VPC__NameAssignment_2_2 )
            // InternalMyDsl.g:4602:3: rule__VPC__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__VPC__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getVPCAccess().getNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_2__2__Impl"


    // $ANTLR start "rule__VPC__Group_4__0"
    // InternalMyDsl.g:4611:1: rule__VPC__Group_4__0 : rule__VPC__Group_4__0__Impl rule__VPC__Group_4__1 ;
    public final void rule__VPC__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4615:1: ( rule__VPC__Group_4__0__Impl rule__VPC__Group_4__1 )
            // InternalMyDsl.g:4616:2: rule__VPC__Group_4__0__Impl rule__VPC__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__VPC__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_4__0"


    // $ANTLR start "rule__VPC__Group_4__0__Impl"
    // InternalMyDsl.g:4623:1: rule__VPC__Group_4__0__Impl : ( 'subred' ) ;
    public final void rule__VPC__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4627:1: ( ( 'subred' ) )
            // InternalMyDsl.g:4628:1: ( 'subred' )
            {
            // InternalMyDsl.g:4628:1: ( 'subred' )
            // InternalMyDsl.g:4629:2: 'subred'
            {
             before(grammarAccess.getVPCAccess().getSubredKeyword_4_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getSubredKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_4__0__Impl"


    // $ANTLR start "rule__VPC__Group_4__1"
    // InternalMyDsl.g:4638:1: rule__VPC__Group_4__1 : rule__VPC__Group_4__1__Impl rule__VPC__Group_4__2 ;
    public final void rule__VPC__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4642:1: ( rule__VPC__Group_4__1__Impl rule__VPC__Group_4__2 )
            // InternalMyDsl.g:4643:2: rule__VPC__Group_4__1__Impl rule__VPC__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__VPC__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VPC__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_4__1"


    // $ANTLR start "rule__VPC__Group_4__1__Impl"
    // InternalMyDsl.g:4650:1: rule__VPC__Group_4__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__VPC__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4654:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:4655:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:4655:1: ( RULE_EQUALS )
            // InternalMyDsl.g:4656:2: RULE_EQUALS
            {
             before(grammarAccess.getVPCAccess().getEQUALSTerminalRuleCall_4_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getVPCAccess().getEQUALSTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_4__1__Impl"


    // $ANTLR start "rule__VPC__Group_4__2"
    // InternalMyDsl.g:4665:1: rule__VPC__Group_4__2 : rule__VPC__Group_4__2__Impl ;
    public final void rule__VPC__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4669:1: ( rule__VPC__Group_4__2__Impl )
            // InternalMyDsl.g:4670:2: rule__VPC__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VPC__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_4__2"


    // $ANTLR start "rule__VPC__Group_4__2__Impl"
    // InternalMyDsl.g:4676:1: rule__VPC__Group_4__2__Impl : ( ( rule__VPC__SubredAssignment_4_2 ) ) ;
    public final void rule__VPC__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4680:1: ( ( ( rule__VPC__SubredAssignment_4_2 ) ) )
            // InternalMyDsl.g:4681:1: ( ( rule__VPC__SubredAssignment_4_2 ) )
            {
            // InternalMyDsl.g:4681:1: ( ( rule__VPC__SubredAssignment_4_2 ) )
            // InternalMyDsl.g:4682:2: ( rule__VPC__SubredAssignment_4_2 )
            {
             before(grammarAccess.getVPCAccess().getSubredAssignment_4_2()); 
            // InternalMyDsl.g:4683:2: ( rule__VPC__SubredAssignment_4_2 )
            // InternalMyDsl.g:4683:3: rule__VPC__SubredAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__VPC__SubredAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getVPCAccess().getSubredAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__Group_4__2__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__0"
    // InternalMyDsl.g:4692:1: rule__ServidorAplicacion__Group__0 : rule__ServidorAplicacion__Group__0__Impl rule__ServidorAplicacion__Group__1 ;
    public final void rule__ServidorAplicacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4696:1: ( rule__ServidorAplicacion__Group__0__Impl rule__ServidorAplicacion__Group__1 )
            // InternalMyDsl.g:4697:2: rule__ServidorAplicacion__Group__0__Impl rule__ServidorAplicacion__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ServidorAplicacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__0"


    // $ANTLR start "rule__ServidorAplicacion__Group__0__Impl"
    // InternalMyDsl.g:4704:1: rule__ServidorAplicacion__Group__0__Impl : ( () ) ;
    public final void rule__ServidorAplicacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4708:1: ( ( () ) )
            // InternalMyDsl.g:4709:1: ( () )
            {
            // InternalMyDsl.g:4709:1: ( () )
            // InternalMyDsl.g:4710:2: ()
            {
             before(grammarAccess.getServidorAplicacionAccess().getServidorAplicacionAction_0()); 
            // InternalMyDsl.g:4711:2: ()
            // InternalMyDsl.g:4711:3: 
            {
            }

             after(grammarAccess.getServidorAplicacionAccess().getServidorAplicacionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__0__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__1"
    // InternalMyDsl.g:4719:1: rule__ServidorAplicacion__Group__1 : rule__ServidorAplicacion__Group__1__Impl rule__ServidorAplicacion__Group__2 ;
    public final void rule__ServidorAplicacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4723:1: ( rule__ServidorAplicacion__Group__1__Impl rule__ServidorAplicacion__Group__2 )
            // InternalMyDsl.g:4724:2: rule__ServidorAplicacion__Group__1__Impl rule__ServidorAplicacion__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ServidorAplicacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__1"


    // $ANTLR start "rule__ServidorAplicacion__Group__1__Impl"
    // InternalMyDsl.g:4731:1: rule__ServidorAplicacion__Group__1__Impl : ( RULE_OPEN_BRACE ) ;
    public final void rule__ServidorAplicacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4735:1: ( ( RULE_OPEN_BRACE ) )
            // InternalMyDsl.g:4736:1: ( RULE_OPEN_BRACE )
            {
            // InternalMyDsl.g:4736:1: ( RULE_OPEN_BRACE )
            // InternalMyDsl.g:4737:2: RULE_OPEN_BRACE
            {
             before(grammarAccess.getServidorAplicacionAccess().getOPEN_BRACETerminalRuleCall_1()); 
            match(input,RULE_OPEN_BRACE,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getOPEN_BRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__1__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__2"
    // InternalMyDsl.g:4746:1: rule__ServidorAplicacion__Group__2 : rule__ServidorAplicacion__Group__2__Impl rule__ServidorAplicacion__Group__3 ;
    public final void rule__ServidorAplicacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4750:1: ( rule__ServidorAplicacion__Group__2__Impl rule__ServidorAplicacion__Group__3 )
            // InternalMyDsl.g:4751:2: rule__ServidorAplicacion__Group__2__Impl rule__ServidorAplicacion__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAplicacion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__2"


    // $ANTLR start "rule__ServidorAplicacion__Group__2__Impl"
    // InternalMyDsl.g:4758:1: rule__ServidorAplicacion__Group__2__Impl : ( 'tipo' ) ;
    public final void rule__ServidorAplicacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4762:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:4763:1: ( 'tipo' )
            {
            // InternalMyDsl.g:4763:1: ( 'tipo' )
            // InternalMyDsl.g:4764:2: 'tipo'
            {
             before(grammarAccess.getServidorAplicacionAccess().getTipoKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getTipoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__2__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__3"
    // InternalMyDsl.g:4773:1: rule__ServidorAplicacion__Group__3 : rule__ServidorAplicacion__Group__3__Impl rule__ServidorAplicacion__Group__4 ;
    public final void rule__ServidorAplicacion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4777:1: ( rule__ServidorAplicacion__Group__3__Impl rule__ServidorAplicacion__Group__4 )
            // InternalMyDsl.g:4778:2: rule__ServidorAplicacion__Group__3__Impl rule__ServidorAplicacion__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ServidorAplicacion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__3"


    // $ANTLR start "rule__ServidorAplicacion__Group__3__Impl"
    // InternalMyDsl.g:4785:1: rule__ServidorAplicacion__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAplicacion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4789:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:4790:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:4790:1: ( RULE_EQUALS )
            // InternalMyDsl.g:4791:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__3__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__4"
    // InternalMyDsl.g:4800:1: rule__ServidorAplicacion__Group__4 : rule__ServidorAplicacion__Group__4__Impl rule__ServidorAplicacion__Group__5 ;
    public final void rule__ServidorAplicacion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4804:1: ( rule__ServidorAplicacion__Group__4__Impl rule__ServidorAplicacion__Group__5 )
            // InternalMyDsl.g:4805:2: rule__ServidorAplicacion__Group__4__Impl rule__ServidorAplicacion__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ServidorAplicacion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__4"


    // $ANTLR start "rule__ServidorAplicacion__Group__4__Impl"
    // InternalMyDsl.g:4812:1: rule__ServidorAplicacion__Group__4__Impl : ( 'Server' ) ;
    public final void rule__ServidorAplicacion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4816:1: ( ( 'Server' ) )
            // InternalMyDsl.g:4817:1: ( 'Server' )
            {
            // InternalMyDsl.g:4817:1: ( 'Server' )
            // InternalMyDsl.g:4818:2: 'Server'
            {
             before(grammarAccess.getServidorAplicacionAccess().getServerKeyword_4()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getServerKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__4__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__5"
    // InternalMyDsl.g:4827:1: rule__ServidorAplicacion__Group__5 : rule__ServidorAplicacion__Group__5__Impl rule__ServidorAplicacion__Group__6 ;
    public final void rule__ServidorAplicacion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4831:1: ( rule__ServidorAplicacion__Group__5__Impl rule__ServidorAplicacion__Group__6 )
            // InternalMyDsl.g:4832:2: rule__ServidorAplicacion__Group__5__Impl rule__ServidorAplicacion__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ServidorAplicacion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__5"


    // $ANTLR start "rule__ServidorAplicacion__Group__5__Impl"
    // InternalMyDsl.g:4839:1: rule__ServidorAplicacion__Group__5__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAplicacion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4843:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:4844:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:4844:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:4845:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_5()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__5__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__6"
    // InternalMyDsl.g:4854:1: rule__ServidorAplicacion__Group__6 : rule__ServidorAplicacion__Group__6__Impl rule__ServidorAplicacion__Group__7 ;
    public final void rule__ServidorAplicacion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4858:1: ( rule__ServidorAplicacion__Group__6__Impl rule__ServidorAplicacion__Group__7 )
            // InternalMyDsl.g:4859:2: rule__ServidorAplicacion__Group__6__Impl rule__ServidorAplicacion__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__ServidorAplicacion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__6"


    // $ANTLR start "rule__ServidorAplicacion__Group__6__Impl"
    // InternalMyDsl.g:4866:1: rule__ServidorAplicacion__Group__6__Impl : ( ( rule__ServidorAplicacion__Group_6__0 ) ) ;
    public final void rule__ServidorAplicacion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4870:1: ( ( ( rule__ServidorAplicacion__Group_6__0 ) ) )
            // InternalMyDsl.g:4871:1: ( ( rule__ServidorAplicacion__Group_6__0 ) )
            {
            // InternalMyDsl.g:4871:1: ( ( rule__ServidorAplicacion__Group_6__0 ) )
            // InternalMyDsl.g:4872:2: ( rule__ServidorAplicacion__Group_6__0 )
            {
             before(grammarAccess.getServidorAplicacionAccess().getGroup_6()); 
            // InternalMyDsl.g:4873:2: ( rule__ServidorAplicacion__Group_6__0 )
            // InternalMyDsl.g:4873:3: rule__ServidorAplicacion__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__6__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__7"
    // InternalMyDsl.g:4881:1: rule__ServidorAplicacion__Group__7 : rule__ServidorAplicacion__Group__7__Impl rule__ServidorAplicacion__Group__8 ;
    public final void rule__ServidorAplicacion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4885:1: ( rule__ServidorAplicacion__Group__7__Impl rule__ServidorAplicacion__Group__8 )
            // InternalMyDsl.g:4886:2: rule__ServidorAplicacion__Group__7__Impl rule__ServidorAplicacion__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__ServidorAplicacion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__7"


    // $ANTLR start "rule__ServidorAplicacion__Group__7__Impl"
    // InternalMyDsl.g:4893:1: rule__ServidorAplicacion__Group__7__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAplicacion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4897:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:4898:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:4898:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:4899:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_7()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__7__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__8"
    // InternalMyDsl.g:4908:1: rule__ServidorAplicacion__Group__8 : rule__ServidorAplicacion__Group__8__Impl rule__ServidorAplicacion__Group__9 ;
    public final void rule__ServidorAplicacion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4912:1: ( rule__ServidorAplicacion__Group__8__Impl rule__ServidorAplicacion__Group__9 )
            // InternalMyDsl.g:4913:2: rule__ServidorAplicacion__Group__8__Impl rule__ServidorAplicacion__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__ServidorAplicacion__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__8"


    // $ANTLR start "rule__ServidorAplicacion__Group__8__Impl"
    // InternalMyDsl.g:4920:1: rule__ServidorAplicacion__Group__8__Impl : ( ( rule__ServidorAplicacion__Group_8__0 ) ) ;
    public final void rule__ServidorAplicacion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4924:1: ( ( ( rule__ServidorAplicacion__Group_8__0 ) ) )
            // InternalMyDsl.g:4925:1: ( ( rule__ServidorAplicacion__Group_8__0 ) )
            {
            // InternalMyDsl.g:4925:1: ( ( rule__ServidorAplicacion__Group_8__0 ) )
            // InternalMyDsl.g:4926:2: ( rule__ServidorAplicacion__Group_8__0 )
            {
             before(grammarAccess.getServidorAplicacionAccess().getGroup_8()); 
            // InternalMyDsl.g:4927:2: ( rule__ServidorAplicacion__Group_8__0 )
            // InternalMyDsl.g:4927:3: rule__ServidorAplicacion__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__8__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__9"
    // InternalMyDsl.g:4935:1: rule__ServidorAplicacion__Group__9 : rule__ServidorAplicacion__Group__9__Impl rule__ServidorAplicacion__Group__10 ;
    public final void rule__ServidorAplicacion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4939:1: ( rule__ServidorAplicacion__Group__9__Impl rule__ServidorAplicacion__Group__10 )
            // InternalMyDsl.g:4940:2: rule__ServidorAplicacion__Group__9__Impl rule__ServidorAplicacion__Group__10
            {
            pushFollow(FOLLOW_34);
            rule__ServidorAplicacion__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__9"


    // $ANTLR start "rule__ServidorAplicacion__Group__9__Impl"
    // InternalMyDsl.g:4947:1: rule__ServidorAplicacion__Group__9__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAplicacion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4951:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:4952:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:4952:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:4953:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_9()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__9__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__10"
    // InternalMyDsl.g:4962:1: rule__ServidorAplicacion__Group__10 : rule__ServidorAplicacion__Group__10__Impl rule__ServidorAplicacion__Group__11 ;
    public final void rule__ServidorAplicacion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4966:1: ( rule__ServidorAplicacion__Group__10__Impl rule__ServidorAplicacion__Group__11 )
            // InternalMyDsl.g:4967:2: rule__ServidorAplicacion__Group__10__Impl rule__ServidorAplicacion__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__ServidorAplicacion__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__10"


    // $ANTLR start "rule__ServidorAplicacion__Group__10__Impl"
    // InternalMyDsl.g:4974:1: rule__ServidorAplicacion__Group__10__Impl : ( ( rule__ServidorAplicacion__Group_10__0 ) ) ;
    public final void rule__ServidorAplicacion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4978:1: ( ( ( rule__ServidorAplicacion__Group_10__0 ) ) )
            // InternalMyDsl.g:4979:1: ( ( rule__ServidorAplicacion__Group_10__0 ) )
            {
            // InternalMyDsl.g:4979:1: ( ( rule__ServidorAplicacion__Group_10__0 ) )
            // InternalMyDsl.g:4980:2: ( rule__ServidorAplicacion__Group_10__0 )
            {
             before(grammarAccess.getServidorAplicacionAccess().getGroup_10()); 
            // InternalMyDsl.g:4981:2: ( rule__ServidorAplicacion__Group_10__0 )
            // InternalMyDsl.g:4981:3: rule__ServidorAplicacion__Group_10__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_10__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__10__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__11"
    // InternalMyDsl.g:4989:1: rule__ServidorAplicacion__Group__11 : rule__ServidorAplicacion__Group__11__Impl rule__ServidorAplicacion__Group__12 ;
    public final void rule__ServidorAplicacion__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4993:1: ( rule__ServidorAplicacion__Group__11__Impl rule__ServidorAplicacion__Group__12 )
            // InternalMyDsl.g:4994:2: rule__ServidorAplicacion__Group__11__Impl rule__ServidorAplicacion__Group__12
            {
            pushFollow(FOLLOW_21);
            rule__ServidorAplicacion__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__11"


    // $ANTLR start "rule__ServidorAplicacion__Group__11__Impl"
    // InternalMyDsl.g:5001:1: rule__ServidorAplicacion__Group__11__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAplicacion__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5005:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:5006:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:5006:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:5007:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_11()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__11__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__12"
    // InternalMyDsl.g:5016:1: rule__ServidorAplicacion__Group__12 : rule__ServidorAplicacion__Group__12__Impl rule__ServidorAplicacion__Group__13 ;
    public final void rule__ServidorAplicacion__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5020:1: ( rule__ServidorAplicacion__Group__12__Impl rule__ServidorAplicacion__Group__13 )
            // InternalMyDsl.g:5021:2: rule__ServidorAplicacion__Group__12__Impl rule__ServidorAplicacion__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAplicacion__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__12"


    // $ANTLR start "rule__ServidorAplicacion__Group__12__Impl"
    // InternalMyDsl.g:5028:1: rule__ServidorAplicacion__Group__12__Impl : ( 'vpc' ) ;
    public final void rule__ServidorAplicacion__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5032:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:5033:1: ( 'vpc' )
            {
            // InternalMyDsl.g:5033:1: ( 'vpc' )
            // InternalMyDsl.g:5034:2: 'vpc'
            {
             before(grammarAccess.getServidorAplicacionAccess().getVpcKeyword_12()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getVpcKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__12__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__13"
    // InternalMyDsl.g:5043:1: rule__ServidorAplicacion__Group__13 : rule__ServidorAplicacion__Group__13__Impl rule__ServidorAplicacion__Group__14 ;
    public final void rule__ServidorAplicacion__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5047:1: ( rule__ServidorAplicacion__Group__13__Impl rule__ServidorAplicacion__Group__14 )
            // InternalMyDsl.g:5048:2: rule__ServidorAplicacion__Group__13__Impl rule__ServidorAplicacion__Group__14
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAplicacion__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__13"


    // $ANTLR start "rule__ServidorAplicacion__Group__13__Impl"
    // InternalMyDsl.g:5055:1: rule__ServidorAplicacion__Group__13__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAplicacion__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5059:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:5060:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:5060:1: ( RULE_EQUALS )
            // InternalMyDsl.g:5061:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_13()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__13__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__14"
    // InternalMyDsl.g:5070:1: rule__ServidorAplicacion__Group__14 : rule__ServidorAplicacion__Group__14__Impl rule__ServidorAplicacion__Group__15 ;
    public final void rule__ServidorAplicacion__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5074:1: ( rule__ServidorAplicacion__Group__14__Impl rule__ServidorAplicacion__Group__15 )
            // InternalMyDsl.g:5075:2: rule__ServidorAplicacion__Group__14__Impl rule__ServidorAplicacion__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__ServidorAplicacion__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__14"


    // $ANTLR start "rule__ServidorAplicacion__Group__14__Impl"
    // InternalMyDsl.g:5082:1: rule__ServidorAplicacion__Group__14__Impl : ( ( rule__ServidorAplicacion__VpcAssignment_14 ) ) ;
    public final void rule__ServidorAplicacion__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5086:1: ( ( ( rule__ServidorAplicacion__VpcAssignment_14 ) ) )
            // InternalMyDsl.g:5087:1: ( ( rule__ServidorAplicacion__VpcAssignment_14 ) )
            {
            // InternalMyDsl.g:5087:1: ( ( rule__ServidorAplicacion__VpcAssignment_14 ) )
            // InternalMyDsl.g:5088:2: ( rule__ServidorAplicacion__VpcAssignment_14 )
            {
             before(grammarAccess.getServidorAplicacionAccess().getVpcAssignment_14()); 
            // InternalMyDsl.g:5089:2: ( rule__ServidorAplicacion__VpcAssignment_14 )
            // InternalMyDsl.g:5089:3: rule__ServidorAplicacion__VpcAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__VpcAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionAccess().getVpcAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__14__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__15"
    // InternalMyDsl.g:5097:1: rule__ServidorAplicacion__Group__15 : rule__ServidorAplicacion__Group__15__Impl rule__ServidorAplicacion__Group__16 ;
    public final void rule__ServidorAplicacion__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5101:1: ( rule__ServidorAplicacion__Group__15__Impl rule__ServidorAplicacion__Group__16 )
            // InternalMyDsl.g:5102:2: rule__ServidorAplicacion__Group__15__Impl rule__ServidorAplicacion__Group__16
            {
            pushFollow(FOLLOW_31);
            rule__ServidorAplicacion__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__15"


    // $ANTLR start "rule__ServidorAplicacion__Group__15__Impl"
    // InternalMyDsl.g:5109:1: rule__ServidorAplicacion__Group__15__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAplicacion__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5113:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:5114:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:5114:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:5115:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_15()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__15__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__16"
    // InternalMyDsl.g:5124:1: rule__ServidorAplicacion__Group__16 : rule__ServidorAplicacion__Group__16__Impl rule__ServidorAplicacion__Group__17 ;
    public final void rule__ServidorAplicacion__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5128:1: ( rule__ServidorAplicacion__Group__16__Impl rule__ServidorAplicacion__Group__17 )
            // InternalMyDsl.g:5129:2: rule__ServidorAplicacion__Group__16__Impl rule__ServidorAplicacion__Group__17
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAplicacion__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__16"


    // $ANTLR start "rule__ServidorAplicacion__Group__16__Impl"
    // InternalMyDsl.g:5136:1: rule__ServidorAplicacion__Group__16__Impl : ( 'subred' ) ;
    public final void rule__ServidorAplicacion__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5140:1: ( ( 'subred' ) )
            // InternalMyDsl.g:5141:1: ( 'subred' )
            {
            // InternalMyDsl.g:5141:1: ( 'subred' )
            // InternalMyDsl.g:5142:2: 'subred'
            {
             before(grammarAccess.getServidorAplicacionAccess().getSubredKeyword_16()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getSubredKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__16__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__17"
    // InternalMyDsl.g:5151:1: rule__ServidorAplicacion__Group__17 : rule__ServidorAplicacion__Group__17__Impl rule__ServidorAplicacion__Group__18 ;
    public final void rule__ServidorAplicacion__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5155:1: ( rule__ServidorAplicacion__Group__17__Impl rule__ServidorAplicacion__Group__18 )
            // InternalMyDsl.g:5156:2: rule__ServidorAplicacion__Group__17__Impl rule__ServidorAplicacion__Group__18
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAplicacion__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__17"


    // $ANTLR start "rule__ServidorAplicacion__Group__17__Impl"
    // InternalMyDsl.g:5163:1: rule__ServidorAplicacion__Group__17__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAplicacion__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5167:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:5168:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:5168:1: ( RULE_EQUALS )
            // InternalMyDsl.g:5169:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_17()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__17__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__18"
    // InternalMyDsl.g:5178:1: rule__ServidorAplicacion__Group__18 : rule__ServidorAplicacion__Group__18__Impl rule__ServidorAplicacion__Group__19 ;
    public final void rule__ServidorAplicacion__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5182:1: ( rule__ServidorAplicacion__Group__18__Impl rule__ServidorAplicacion__Group__19 )
            // InternalMyDsl.g:5183:2: rule__ServidorAplicacion__Group__18__Impl rule__ServidorAplicacion__Group__19
            {
            pushFollow(FOLLOW_7);
            rule__ServidorAplicacion__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__18"


    // $ANTLR start "rule__ServidorAplicacion__Group__18__Impl"
    // InternalMyDsl.g:5190:1: rule__ServidorAplicacion__Group__18__Impl : ( ( rule__ServidorAplicacion__SubredAssignment_18 ) ) ;
    public final void rule__ServidorAplicacion__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5194:1: ( ( ( rule__ServidorAplicacion__SubredAssignment_18 ) ) )
            // InternalMyDsl.g:5195:1: ( ( rule__ServidorAplicacion__SubredAssignment_18 ) )
            {
            // InternalMyDsl.g:5195:1: ( ( rule__ServidorAplicacion__SubredAssignment_18 ) )
            // InternalMyDsl.g:5196:2: ( rule__ServidorAplicacion__SubredAssignment_18 )
            {
             before(grammarAccess.getServidorAplicacionAccess().getSubredAssignment_18()); 
            // InternalMyDsl.g:5197:2: ( rule__ServidorAplicacion__SubredAssignment_18 )
            // InternalMyDsl.g:5197:3: rule__ServidorAplicacion__SubredAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__SubredAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionAccess().getSubredAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__18__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__19"
    // InternalMyDsl.g:5205:1: rule__ServidorAplicacion__Group__19 : rule__ServidorAplicacion__Group__19__Impl rule__ServidorAplicacion__Group__20 ;
    public final void rule__ServidorAplicacion__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5209:1: ( rule__ServidorAplicacion__Group__19__Impl rule__ServidorAplicacion__Group__20 )
            // InternalMyDsl.g:5210:2: rule__ServidorAplicacion__Group__19__Impl rule__ServidorAplicacion__Group__20
            {
            pushFollow(FOLLOW_35);
            rule__ServidorAplicacion__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__19"


    // $ANTLR start "rule__ServidorAplicacion__Group__19__Impl"
    // InternalMyDsl.g:5217:1: rule__ServidorAplicacion__Group__19__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAplicacion__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5221:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:5222:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:5222:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:5223:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_19()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__19__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__20"
    // InternalMyDsl.g:5232:1: rule__ServidorAplicacion__Group__20 : rule__ServidorAplicacion__Group__20__Impl rule__ServidorAplicacion__Group__21 ;
    public final void rule__ServidorAplicacion__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5236:1: ( rule__ServidorAplicacion__Group__20__Impl rule__ServidorAplicacion__Group__21 )
            // InternalMyDsl.g:5237:2: rule__ServidorAplicacion__Group__20__Impl rule__ServidorAplicacion__Group__21
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAplicacion__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__20"


    // $ANTLR start "rule__ServidorAplicacion__Group__20__Impl"
    // InternalMyDsl.g:5244:1: rule__ServidorAplicacion__Group__20__Impl : ( 'securityGroup' ) ;
    public final void rule__ServidorAplicacion__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5248:1: ( ( 'securityGroup' ) )
            // InternalMyDsl.g:5249:1: ( 'securityGroup' )
            {
            // InternalMyDsl.g:5249:1: ( 'securityGroup' )
            // InternalMyDsl.g:5250:2: 'securityGroup'
            {
             before(grammarAccess.getServidorAplicacionAccess().getSecurityGroupKeyword_20()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getSecurityGroupKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__20__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__21"
    // InternalMyDsl.g:5259:1: rule__ServidorAplicacion__Group__21 : rule__ServidorAplicacion__Group__21__Impl rule__ServidorAplicacion__Group__22 ;
    public final void rule__ServidorAplicacion__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5263:1: ( rule__ServidorAplicacion__Group__21__Impl rule__ServidorAplicacion__Group__22 )
            // InternalMyDsl.g:5264:2: rule__ServidorAplicacion__Group__21__Impl rule__ServidorAplicacion__Group__22
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAplicacion__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__21"


    // $ANTLR start "rule__ServidorAplicacion__Group__21__Impl"
    // InternalMyDsl.g:5271:1: rule__ServidorAplicacion__Group__21__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAplicacion__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5275:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:5276:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:5276:1: ( RULE_EQUALS )
            // InternalMyDsl.g:5277:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_21()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__21__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__22"
    // InternalMyDsl.g:5286:1: rule__ServidorAplicacion__Group__22 : rule__ServidorAplicacion__Group__22__Impl rule__ServidorAplicacion__Group__23 ;
    public final void rule__ServidorAplicacion__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5290:1: ( rule__ServidorAplicacion__Group__22__Impl rule__ServidorAplicacion__Group__23 )
            // InternalMyDsl.g:5291:2: rule__ServidorAplicacion__Group__22__Impl rule__ServidorAplicacion__Group__23
            {
            pushFollow(FOLLOW_7);
            rule__ServidorAplicacion__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__22"


    // $ANTLR start "rule__ServidorAplicacion__Group__22__Impl"
    // InternalMyDsl.g:5298:1: rule__ServidorAplicacion__Group__22__Impl : ( ( rule__ServidorAplicacion__ServersecuritygroupAssignment_22 ) ) ;
    public final void rule__ServidorAplicacion__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5302:1: ( ( ( rule__ServidorAplicacion__ServersecuritygroupAssignment_22 ) ) )
            // InternalMyDsl.g:5303:1: ( ( rule__ServidorAplicacion__ServersecuritygroupAssignment_22 ) )
            {
            // InternalMyDsl.g:5303:1: ( ( rule__ServidorAplicacion__ServersecuritygroupAssignment_22 ) )
            // InternalMyDsl.g:5304:2: ( rule__ServidorAplicacion__ServersecuritygroupAssignment_22 )
            {
             before(grammarAccess.getServidorAplicacionAccess().getServersecuritygroupAssignment_22()); 
            // InternalMyDsl.g:5305:2: ( rule__ServidorAplicacion__ServersecuritygroupAssignment_22 )
            // InternalMyDsl.g:5305:3: rule__ServidorAplicacion__ServersecuritygroupAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__ServersecuritygroupAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionAccess().getServersecuritygroupAssignment_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__22__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__23"
    // InternalMyDsl.g:5313:1: rule__ServidorAplicacion__Group__23 : rule__ServidorAplicacion__Group__23__Impl rule__ServidorAplicacion__Group__24 ;
    public final void rule__ServidorAplicacion__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5317:1: ( rule__ServidorAplicacion__Group__23__Impl rule__ServidorAplicacion__Group__24 )
            // InternalMyDsl.g:5318:2: rule__ServidorAplicacion__Group__23__Impl rule__ServidorAplicacion__Group__24
            {
            pushFollow(FOLLOW_27);
            rule__ServidorAplicacion__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__23"


    // $ANTLR start "rule__ServidorAplicacion__Group__23__Impl"
    // InternalMyDsl.g:5325:1: rule__ServidorAplicacion__Group__23__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAplicacion__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5329:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:5330:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:5330:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:5331:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_23()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__23__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group__24"
    // InternalMyDsl.g:5340:1: rule__ServidorAplicacion__Group__24 : rule__ServidorAplicacion__Group__24__Impl ;
    public final void rule__ServidorAplicacion__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5344:1: ( rule__ServidorAplicacion__Group__24__Impl )
            // InternalMyDsl.g:5345:2: rule__ServidorAplicacion__Group__24__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group__24__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__24"


    // $ANTLR start "rule__ServidorAplicacion__Group__24__Impl"
    // InternalMyDsl.g:5351:1: rule__ServidorAplicacion__Group__24__Impl : ( RULE_CLOSE_BRACE ) ;
    public final void rule__ServidorAplicacion__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5355:1: ( ( RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:5356:1: ( RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:5356:1: ( RULE_CLOSE_BRACE )
            // InternalMyDsl.g:5357:2: RULE_CLOSE_BRACE
            {
             before(grammarAccess.getServidorAplicacionAccess().getCLOSE_BRACETerminalRuleCall_24()); 
            match(input,RULE_CLOSE_BRACE,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getCLOSE_BRACETerminalRuleCall_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group__24__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group_6__0"
    // InternalMyDsl.g:5367:1: rule__ServidorAplicacion__Group_6__0 : rule__ServidorAplicacion__Group_6__0__Impl rule__ServidorAplicacion__Group_6__1 ;
    public final void rule__ServidorAplicacion__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5371:1: ( rule__ServidorAplicacion__Group_6__0__Impl rule__ServidorAplicacion__Group_6__1 )
            // InternalMyDsl.g:5372:2: rule__ServidorAplicacion__Group_6__0__Impl rule__ServidorAplicacion__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAplicacion__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_6__0"


    // $ANTLR start "rule__ServidorAplicacion__Group_6__0__Impl"
    // InternalMyDsl.g:5379:1: rule__ServidorAplicacion__Group_6__0__Impl : ( 'nombre' ) ;
    public final void rule__ServidorAplicacion__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5383:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:5384:1: ( 'nombre' )
            {
            // InternalMyDsl.g:5384:1: ( 'nombre' )
            // InternalMyDsl.g:5385:2: 'nombre'
            {
             before(grammarAccess.getServidorAplicacionAccess().getNombreKeyword_6_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getNombreKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_6__0__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group_6__1"
    // InternalMyDsl.g:5394:1: rule__ServidorAplicacion__Group_6__1 : rule__ServidorAplicacion__Group_6__1__Impl rule__ServidorAplicacion__Group_6__2 ;
    public final void rule__ServidorAplicacion__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5398:1: ( rule__ServidorAplicacion__Group_6__1__Impl rule__ServidorAplicacion__Group_6__2 )
            // InternalMyDsl.g:5399:2: rule__ServidorAplicacion__Group_6__1__Impl rule__ServidorAplicacion__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAplicacion__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_6__1"


    // $ANTLR start "rule__ServidorAplicacion__Group_6__1__Impl"
    // InternalMyDsl.g:5406:1: rule__ServidorAplicacion__Group_6__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAplicacion__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5410:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:5411:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:5411:1: ( RULE_EQUALS )
            // InternalMyDsl.g:5412:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_6_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_6__1__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group_6__2"
    // InternalMyDsl.g:5421:1: rule__ServidorAplicacion__Group_6__2 : rule__ServidorAplicacion__Group_6__2__Impl ;
    public final void rule__ServidorAplicacion__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5425:1: ( rule__ServidorAplicacion__Group_6__2__Impl )
            // InternalMyDsl.g:5426:2: rule__ServidorAplicacion__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_6__2"


    // $ANTLR start "rule__ServidorAplicacion__Group_6__2__Impl"
    // InternalMyDsl.g:5432:1: rule__ServidorAplicacion__Group_6__2__Impl : ( ( rule__ServidorAplicacion__NombreAssignment_6_2 ) ) ;
    public final void rule__ServidorAplicacion__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5436:1: ( ( ( rule__ServidorAplicacion__NombreAssignment_6_2 ) ) )
            // InternalMyDsl.g:5437:1: ( ( rule__ServidorAplicacion__NombreAssignment_6_2 ) )
            {
            // InternalMyDsl.g:5437:1: ( ( rule__ServidorAplicacion__NombreAssignment_6_2 ) )
            // InternalMyDsl.g:5438:2: ( rule__ServidorAplicacion__NombreAssignment_6_2 )
            {
             before(grammarAccess.getServidorAplicacionAccess().getNombreAssignment_6_2()); 
            // InternalMyDsl.g:5439:2: ( rule__ServidorAplicacion__NombreAssignment_6_2 )
            // InternalMyDsl.g:5439:3: rule__ServidorAplicacion__NombreAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__NombreAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionAccess().getNombreAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_6__2__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group_8__0"
    // InternalMyDsl.g:5448:1: rule__ServidorAplicacion__Group_8__0 : rule__ServidorAplicacion__Group_8__0__Impl rule__ServidorAplicacion__Group_8__1 ;
    public final void rule__ServidorAplicacion__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5452:1: ( rule__ServidorAplicacion__Group_8__0__Impl rule__ServidorAplicacion__Group_8__1 )
            // InternalMyDsl.g:5453:2: rule__ServidorAplicacion__Group_8__0__Impl rule__ServidorAplicacion__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAplicacion__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_8__0"


    // $ANTLR start "rule__ServidorAplicacion__Group_8__0__Impl"
    // InternalMyDsl.g:5460:1: rule__ServidorAplicacion__Group_8__0__Impl : ( 'dimension' ) ;
    public final void rule__ServidorAplicacion__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5464:1: ( ( 'dimension' ) )
            // InternalMyDsl.g:5465:1: ( 'dimension' )
            {
            // InternalMyDsl.g:5465:1: ( 'dimension' )
            // InternalMyDsl.g:5466:2: 'dimension'
            {
             before(grammarAccess.getServidorAplicacionAccess().getDimensionKeyword_8_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getDimensionKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_8__0__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group_8__1"
    // InternalMyDsl.g:5475:1: rule__ServidorAplicacion__Group_8__1 : rule__ServidorAplicacion__Group_8__1__Impl rule__ServidorAplicacion__Group_8__2 ;
    public final void rule__ServidorAplicacion__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5479:1: ( rule__ServidorAplicacion__Group_8__1__Impl rule__ServidorAplicacion__Group_8__2 )
            // InternalMyDsl.g:5480:2: rule__ServidorAplicacion__Group_8__1__Impl rule__ServidorAplicacion__Group_8__2
            {
            pushFollow(FOLLOW_36);
            rule__ServidorAplicacion__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_8__1"


    // $ANTLR start "rule__ServidorAplicacion__Group_8__1__Impl"
    // InternalMyDsl.g:5487:1: rule__ServidorAplicacion__Group_8__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAplicacion__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5491:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:5492:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:5492:1: ( RULE_EQUALS )
            // InternalMyDsl.g:5493:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_8_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_8__1__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group_8__2"
    // InternalMyDsl.g:5502:1: rule__ServidorAplicacion__Group_8__2 : rule__ServidorAplicacion__Group_8__2__Impl ;
    public final void rule__ServidorAplicacion__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5506:1: ( rule__ServidorAplicacion__Group_8__2__Impl )
            // InternalMyDsl.g:5507:2: rule__ServidorAplicacion__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_8__2"


    // $ANTLR start "rule__ServidorAplicacion__Group_8__2__Impl"
    // InternalMyDsl.g:5513:1: rule__ServidorAplicacion__Group_8__2__Impl : ( ( rule__ServidorAplicacion__TamanoMAssignment_8_2 ) ) ;
    public final void rule__ServidorAplicacion__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5517:1: ( ( ( rule__ServidorAplicacion__TamanoMAssignment_8_2 ) ) )
            // InternalMyDsl.g:5518:1: ( ( rule__ServidorAplicacion__TamanoMAssignment_8_2 ) )
            {
            // InternalMyDsl.g:5518:1: ( ( rule__ServidorAplicacion__TamanoMAssignment_8_2 ) )
            // InternalMyDsl.g:5519:2: ( rule__ServidorAplicacion__TamanoMAssignment_8_2 )
            {
             before(grammarAccess.getServidorAplicacionAccess().getTamanoMAssignment_8_2()); 
            // InternalMyDsl.g:5520:2: ( rule__ServidorAplicacion__TamanoMAssignment_8_2 )
            // InternalMyDsl.g:5520:3: rule__ServidorAplicacion__TamanoMAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__TamanoMAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionAccess().getTamanoMAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_8__2__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group_10__0"
    // InternalMyDsl.g:5529:1: rule__ServidorAplicacion__Group_10__0 : rule__ServidorAplicacion__Group_10__0__Impl rule__ServidorAplicacion__Group_10__1 ;
    public final void rule__ServidorAplicacion__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5533:1: ( rule__ServidorAplicacion__Group_10__0__Impl rule__ServidorAplicacion__Group_10__1 )
            // InternalMyDsl.g:5534:2: rule__ServidorAplicacion__Group_10__0__Impl rule__ServidorAplicacion__Group_10__1
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAplicacion__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_10__0"


    // $ANTLR start "rule__ServidorAplicacion__Group_10__0__Impl"
    // InternalMyDsl.g:5541:1: rule__ServidorAplicacion__Group_10__0__Impl : ( 'os' ) ;
    public final void rule__ServidorAplicacion__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5545:1: ( ( 'os' ) )
            // InternalMyDsl.g:5546:1: ( 'os' )
            {
            // InternalMyDsl.g:5546:1: ( 'os' )
            // InternalMyDsl.g:5547:2: 'os'
            {
             before(grammarAccess.getServidorAplicacionAccess().getOsKeyword_10_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getOsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_10__0__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group_10__1"
    // InternalMyDsl.g:5556:1: rule__ServidorAplicacion__Group_10__1 : rule__ServidorAplicacion__Group_10__1__Impl rule__ServidorAplicacion__Group_10__2 ;
    public final void rule__ServidorAplicacion__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5560:1: ( rule__ServidorAplicacion__Group_10__1__Impl rule__ServidorAplicacion__Group_10__2 )
            // InternalMyDsl.g:5561:2: rule__ServidorAplicacion__Group_10__1__Impl rule__ServidorAplicacion__Group_10__2
            {
            pushFollow(FOLLOW_37);
            rule__ServidorAplicacion__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_10__1"


    // $ANTLR start "rule__ServidorAplicacion__Group_10__1__Impl"
    // InternalMyDsl.g:5568:1: rule__ServidorAplicacion__Group_10__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAplicacion__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5572:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:5573:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:5573:1: ( RULE_EQUALS )
            // InternalMyDsl.g:5574:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_10_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_10__1__Impl"


    // $ANTLR start "rule__ServidorAplicacion__Group_10__2"
    // InternalMyDsl.g:5583:1: rule__ServidorAplicacion__Group_10__2 : rule__ServidorAplicacion__Group_10__2__Impl ;
    public final void rule__ServidorAplicacion__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5587:1: ( rule__ServidorAplicacion__Group_10__2__Impl )
            // InternalMyDsl.g:5588:2: rule__ServidorAplicacion__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_10__2"


    // $ANTLR start "rule__ServidorAplicacion__Group_10__2__Impl"
    // InternalMyDsl.g:5594:1: rule__ServidorAplicacion__Group_10__2__Impl : ( ( rule__ServidorAplicacion__SistemaOAssignment_10_2 ) ) ;
    public final void rule__ServidorAplicacion__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5598:1: ( ( ( rule__ServidorAplicacion__SistemaOAssignment_10_2 ) ) )
            // InternalMyDsl.g:5599:1: ( ( rule__ServidorAplicacion__SistemaOAssignment_10_2 ) )
            {
            // InternalMyDsl.g:5599:1: ( ( rule__ServidorAplicacion__SistemaOAssignment_10_2 ) )
            // InternalMyDsl.g:5600:2: ( rule__ServidorAplicacion__SistemaOAssignment_10_2 )
            {
             before(grammarAccess.getServidorAplicacionAccess().getSistemaOAssignment_10_2()); 
            // InternalMyDsl.g:5601:2: ( rule__ServidorAplicacion__SistemaOAssignment_10_2 )
            // InternalMyDsl.g:5601:3: rule__ServidorAplicacion__SistemaOAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicacion__SistemaOAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionAccess().getSistemaOAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__Group_10__2__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__0"
    // InternalMyDsl.g:5610:1: rule__ServidorBaseDeDatos__Group__0 : rule__ServidorBaseDeDatos__Group__0__Impl rule__ServidorBaseDeDatos__Group__1 ;
    public final void rule__ServidorBaseDeDatos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5614:1: ( rule__ServidorBaseDeDatos__Group__0__Impl rule__ServidorBaseDeDatos__Group__1 )
            // InternalMyDsl.g:5615:2: rule__ServidorBaseDeDatos__Group__0__Impl rule__ServidorBaseDeDatos__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ServidorBaseDeDatos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__0"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__0__Impl"
    // InternalMyDsl.g:5622:1: rule__ServidorBaseDeDatos__Group__0__Impl : ( () ) ;
    public final void rule__ServidorBaseDeDatos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5626:1: ( ( () ) )
            // InternalMyDsl.g:5627:1: ( () )
            {
            // InternalMyDsl.g:5627:1: ( () )
            // InternalMyDsl.g:5628:2: ()
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getServidorBaseDeDatosAction_0()); 
            // InternalMyDsl.g:5629:2: ()
            // InternalMyDsl.g:5629:3: 
            {
            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getServidorBaseDeDatosAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__0__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__1"
    // InternalMyDsl.g:5637:1: rule__ServidorBaseDeDatos__Group__1 : rule__ServidorBaseDeDatos__Group__1__Impl rule__ServidorBaseDeDatos__Group__2 ;
    public final void rule__ServidorBaseDeDatos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5641:1: ( rule__ServidorBaseDeDatos__Group__1__Impl rule__ServidorBaseDeDatos__Group__2 )
            // InternalMyDsl.g:5642:2: rule__ServidorBaseDeDatos__Group__1__Impl rule__ServidorBaseDeDatos__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ServidorBaseDeDatos__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__1"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__1__Impl"
    // InternalMyDsl.g:5649:1: rule__ServidorBaseDeDatos__Group__1__Impl : ( RULE_OPEN_BRACE ) ;
    public final void rule__ServidorBaseDeDatos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5653:1: ( ( RULE_OPEN_BRACE ) )
            // InternalMyDsl.g:5654:1: ( RULE_OPEN_BRACE )
            {
            // InternalMyDsl.g:5654:1: ( RULE_OPEN_BRACE )
            // InternalMyDsl.g:5655:2: RULE_OPEN_BRACE
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getOPEN_BRACETerminalRuleCall_1()); 
            match(input,RULE_OPEN_BRACE,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getOPEN_BRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__1__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__2"
    // InternalMyDsl.g:5664:1: rule__ServidorBaseDeDatos__Group__2 : rule__ServidorBaseDeDatos__Group__2__Impl rule__ServidorBaseDeDatos__Group__3 ;
    public final void rule__ServidorBaseDeDatos__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5668:1: ( rule__ServidorBaseDeDatos__Group__2__Impl rule__ServidorBaseDeDatos__Group__3 )
            // InternalMyDsl.g:5669:2: rule__ServidorBaseDeDatos__Group__2__Impl rule__ServidorBaseDeDatos__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ServidorBaseDeDatos__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__2"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__2__Impl"
    // InternalMyDsl.g:5676:1: rule__ServidorBaseDeDatos__Group__2__Impl : ( 'tipo' ) ;
    public final void rule__ServidorBaseDeDatos__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5680:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:5681:1: ( 'tipo' )
            {
            // InternalMyDsl.g:5681:1: ( 'tipo' )
            // InternalMyDsl.g:5682:2: 'tipo'
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getTipoKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getTipoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__2__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__3"
    // InternalMyDsl.g:5691:1: rule__ServidorBaseDeDatos__Group__3 : rule__ServidorBaseDeDatos__Group__3__Impl rule__ServidorBaseDeDatos__Group__4 ;
    public final void rule__ServidorBaseDeDatos__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5695:1: ( rule__ServidorBaseDeDatos__Group__3__Impl rule__ServidorBaseDeDatos__Group__4 )
            // InternalMyDsl.g:5696:2: rule__ServidorBaseDeDatos__Group__3__Impl rule__ServidorBaseDeDatos__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__ServidorBaseDeDatos__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__3"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__3__Impl"
    // InternalMyDsl.g:5703:1: rule__ServidorBaseDeDatos__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorBaseDeDatos__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5707:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:5708:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:5708:1: ( RULE_EQUALS )
            // InternalMyDsl.g:5709:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__3__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__4"
    // InternalMyDsl.g:5718:1: rule__ServidorBaseDeDatos__Group__4 : rule__ServidorBaseDeDatos__Group__4__Impl rule__ServidorBaseDeDatos__Group__5 ;
    public final void rule__ServidorBaseDeDatos__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5722:1: ( rule__ServidorBaseDeDatos__Group__4__Impl rule__ServidorBaseDeDatos__Group__5 )
            // InternalMyDsl.g:5723:2: rule__ServidorBaseDeDatos__Group__4__Impl rule__ServidorBaseDeDatos__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ServidorBaseDeDatos__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__4"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__4__Impl"
    // InternalMyDsl.g:5730:1: rule__ServidorBaseDeDatos__Group__4__Impl : ( 'Database' ) ;
    public final void rule__ServidorBaseDeDatos__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5734:1: ( ( 'Database' ) )
            // InternalMyDsl.g:5735:1: ( 'Database' )
            {
            // InternalMyDsl.g:5735:1: ( 'Database' )
            // InternalMyDsl.g:5736:2: 'Database'
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getDatabaseKeyword_4()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getDatabaseKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__4__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__5"
    // InternalMyDsl.g:5745:1: rule__ServidorBaseDeDatos__Group__5 : rule__ServidorBaseDeDatos__Group__5__Impl rule__ServidorBaseDeDatos__Group__6 ;
    public final void rule__ServidorBaseDeDatos__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5749:1: ( rule__ServidorBaseDeDatos__Group__5__Impl rule__ServidorBaseDeDatos__Group__6 )
            // InternalMyDsl.g:5750:2: rule__ServidorBaseDeDatos__Group__5__Impl rule__ServidorBaseDeDatos__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__ServidorBaseDeDatos__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__5"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__5__Impl"
    // InternalMyDsl.g:5757:1: rule__ServidorBaseDeDatos__Group__5__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorBaseDeDatos__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5761:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:5762:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:5762:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:5763:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_5()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__5__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__6"
    // InternalMyDsl.g:5772:1: rule__ServidorBaseDeDatos__Group__6 : rule__ServidorBaseDeDatos__Group__6__Impl rule__ServidorBaseDeDatos__Group__7 ;
    public final void rule__ServidorBaseDeDatos__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5776:1: ( rule__ServidorBaseDeDatos__Group__6__Impl rule__ServidorBaseDeDatos__Group__7 )
            // InternalMyDsl.g:5777:2: rule__ServidorBaseDeDatos__Group__6__Impl rule__ServidorBaseDeDatos__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__ServidorBaseDeDatos__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__6"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__6__Impl"
    // InternalMyDsl.g:5784:1: rule__ServidorBaseDeDatos__Group__6__Impl : ( ( rule__ServidorBaseDeDatos__Group_6__0 )? ) ;
    public final void rule__ServidorBaseDeDatos__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5788:1: ( ( ( rule__ServidorBaseDeDatos__Group_6__0 )? ) )
            // InternalMyDsl.g:5789:1: ( ( rule__ServidorBaseDeDatos__Group_6__0 )? )
            {
            // InternalMyDsl.g:5789:1: ( ( rule__ServidorBaseDeDatos__Group_6__0 )? )
            // InternalMyDsl.g:5790:2: ( rule__ServidorBaseDeDatos__Group_6__0 )?
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getGroup_6()); 
            // InternalMyDsl.g:5791:2: ( rule__ServidorBaseDeDatos__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:5791:3: rule__ServidorBaseDeDatos__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBaseDeDatos__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__6__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__7"
    // InternalMyDsl.g:5799:1: rule__ServidorBaseDeDatos__Group__7 : rule__ServidorBaseDeDatos__Group__7__Impl rule__ServidorBaseDeDatos__Group__8 ;
    public final void rule__ServidorBaseDeDatos__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5803:1: ( rule__ServidorBaseDeDatos__Group__7__Impl rule__ServidorBaseDeDatos__Group__8 )
            // InternalMyDsl.g:5804:2: rule__ServidorBaseDeDatos__Group__7__Impl rule__ServidorBaseDeDatos__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__ServidorBaseDeDatos__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__7"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__7__Impl"
    // InternalMyDsl.g:5811:1: rule__ServidorBaseDeDatos__Group__7__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorBaseDeDatos__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5815:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:5816:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:5816:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:5817:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_7()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__7__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__8"
    // InternalMyDsl.g:5826:1: rule__ServidorBaseDeDatos__Group__8 : rule__ServidorBaseDeDatos__Group__8__Impl rule__ServidorBaseDeDatos__Group__9 ;
    public final void rule__ServidorBaseDeDatos__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5830:1: ( rule__ServidorBaseDeDatos__Group__8__Impl rule__ServidorBaseDeDatos__Group__9 )
            // InternalMyDsl.g:5831:2: rule__ServidorBaseDeDatos__Group__8__Impl rule__ServidorBaseDeDatos__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__ServidorBaseDeDatos__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__8"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__8__Impl"
    // InternalMyDsl.g:5838:1: rule__ServidorBaseDeDatos__Group__8__Impl : ( ( rule__ServidorBaseDeDatos__Group_8__0 ) ) ;
    public final void rule__ServidorBaseDeDatos__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5842:1: ( ( ( rule__ServidorBaseDeDatos__Group_8__0 ) ) )
            // InternalMyDsl.g:5843:1: ( ( rule__ServidorBaseDeDatos__Group_8__0 ) )
            {
            // InternalMyDsl.g:5843:1: ( ( rule__ServidorBaseDeDatos__Group_8__0 ) )
            // InternalMyDsl.g:5844:2: ( rule__ServidorBaseDeDatos__Group_8__0 )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getGroup_8()); 
            // InternalMyDsl.g:5845:2: ( rule__ServidorBaseDeDatos__Group_8__0 )
            // InternalMyDsl.g:5845:3: rule__ServidorBaseDeDatos__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__8__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__9"
    // InternalMyDsl.g:5853:1: rule__ServidorBaseDeDatos__Group__9 : rule__ServidorBaseDeDatos__Group__9__Impl rule__ServidorBaseDeDatos__Group__10 ;
    public final void rule__ServidorBaseDeDatos__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5857:1: ( rule__ServidorBaseDeDatos__Group__9__Impl rule__ServidorBaseDeDatos__Group__10 )
            // InternalMyDsl.g:5858:2: rule__ServidorBaseDeDatos__Group__9__Impl rule__ServidorBaseDeDatos__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__ServidorBaseDeDatos__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__9"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__9__Impl"
    // InternalMyDsl.g:5865:1: rule__ServidorBaseDeDatos__Group__9__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorBaseDeDatos__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5869:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:5870:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:5870:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:5871:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_9()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__9__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__10"
    // InternalMyDsl.g:5880:1: rule__ServidorBaseDeDatos__Group__10 : rule__ServidorBaseDeDatos__Group__10__Impl rule__ServidorBaseDeDatos__Group__11 ;
    public final void rule__ServidorBaseDeDatos__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5884:1: ( rule__ServidorBaseDeDatos__Group__10__Impl rule__ServidorBaseDeDatos__Group__11 )
            // InternalMyDsl.g:5885:2: rule__ServidorBaseDeDatos__Group__10__Impl rule__ServidorBaseDeDatos__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__ServidorBaseDeDatos__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__10"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__10__Impl"
    // InternalMyDsl.g:5892:1: rule__ServidorBaseDeDatos__Group__10__Impl : ( ( rule__ServidorBaseDeDatos__Group_10__0 ) ) ;
    public final void rule__ServidorBaseDeDatos__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5896:1: ( ( ( rule__ServidorBaseDeDatos__Group_10__0 ) ) )
            // InternalMyDsl.g:5897:1: ( ( rule__ServidorBaseDeDatos__Group_10__0 ) )
            {
            // InternalMyDsl.g:5897:1: ( ( rule__ServidorBaseDeDatos__Group_10__0 ) )
            // InternalMyDsl.g:5898:2: ( rule__ServidorBaseDeDatos__Group_10__0 )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getGroup_10()); 
            // InternalMyDsl.g:5899:2: ( rule__ServidorBaseDeDatos__Group_10__0 )
            // InternalMyDsl.g:5899:3: rule__ServidorBaseDeDatos__Group_10__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group_10__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__10__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__11"
    // InternalMyDsl.g:5907:1: rule__ServidorBaseDeDatos__Group__11 : rule__ServidorBaseDeDatos__Group__11__Impl rule__ServidorBaseDeDatos__Group__12 ;
    public final void rule__ServidorBaseDeDatos__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5911:1: ( rule__ServidorBaseDeDatos__Group__11__Impl rule__ServidorBaseDeDatos__Group__12 )
            // InternalMyDsl.g:5912:2: rule__ServidorBaseDeDatos__Group__11__Impl rule__ServidorBaseDeDatos__Group__12
            {
            pushFollow(FOLLOW_21);
            rule__ServidorBaseDeDatos__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__11"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__11__Impl"
    // InternalMyDsl.g:5919:1: rule__ServidorBaseDeDatos__Group__11__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorBaseDeDatos__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5923:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:5924:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:5924:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:5925:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_11()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__11__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__12"
    // InternalMyDsl.g:5934:1: rule__ServidorBaseDeDatos__Group__12 : rule__ServidorBaseDeDatos__Group__12__Impl rule__ServidorBaseDeDatos__Group__13 ;
    public final void rule__ServidorBaseDeDatos__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5938:1: ( rule__ServidorBaseDeDatos__Group__12__Impl rule__ServidorBaseDeDatos__Group__13 )
            // InternalMyDsl.g:5939:2: rule__ServidorBaseDeDatos__Group__12__Impl rule__ServidorBaseDeDatos__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__ServidorBaseDeDatos__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__12"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__12__Impl"
    // InternalMyDsl.g:5946:1: rule__ServidorBaseDeDatos__Group__12__Impl : ( 'vpc' ) ;
    public final void rule__ServidorBaseDeDatos__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5950:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:5951:1: ( 'vpc' )
            {
            // InternalMyDsl.g:5951:1: ( 'vpc' )
            // InternalMyDsl.g:5952:2: 'vpc'
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getVpcKeyword_12()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getVpcKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__12__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__13"
    // InternalMyDsl.g:5961:1: rule__ServidorBaseDeDatos__Group__13 : rule__ServidorBaseDeDatos__Group__13__Impl rule__ServidorBaseDeDatos__Group__14 ;
    public final void rule__ServidorBaseDeDatos__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5965:1: ( rule__ServidorBaseDeDatos__Group__13__Impl rule__ServidorBaseDeDatos__Group__14 )
            // InternalMyDsl.g:5966:2: rule__ServidorBaseDeDatos__Group__13__Impl rule__ServidorBaseDeDatos__Group__14
            {
            pushFollow(FOLLOW_4);
            rule__ServidorBaseDeDatos__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__13"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__13__Impl"
    // InternalMyDsl.g:5973:1: rule__ServidorBaseDeDatos__Group__13__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorBaseDeDatos__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5977:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:5978:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:5978:1: ( RULE_EQUALS )
            // InternalMyDsl.g:5979:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_13()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__13__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__14"
    // InternalMyDsl.g:5988:1: rule__ServidorBaseDeDatos__Group__14 : rule__ServidorBaseDeDatos__Group__14__Impl rule__ServidorBaseDeDatos__Group__15 ;
    public final void rule__ServidorBaseDeDatos__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5992:1: ( rule__ServidorBaseDeDatos__Group__14__Impl rule__ServidorBaseDeDatos__Group__15 )
            // InternalMyDsl.g:5993:2: rule__ServidorBaseDeDatos__Group__14__Impl rule__ServidorBaseDeDatos__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__ServidorBaseDeDatos__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__14"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__14__Impl"
    // InternalMyDsl.g:6000:1: rule__ServidorBaseDeDatos__Group__14__Impl : ( ( rule__ServidorBaseDeDatos__VpcAssignment_14 ) ) ;
    public final void rule__ServidorBaseDeDatos__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6004:1: ( ( ( rule__ServidorBaseDeDatos__VpcAssignment_14 ) ) )
            // InternalMyDsl.g:6005:1: ( ( rule__ServidorBaseDeDatos__VpcAssignment_14 ) )
            {
            // InternalMyDsl.g:6005:1: ( ( rule__ServidorBaseDeDatos__VpcAssignment_14 ) )
            // InternalMyDsl.g:6006:2: ( rule__ServidorBaseDeDatos__VpcAssignment_14 )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getVpcAssignment_14()); 
            // InternalMyDsl.g:6007:2: ( rule__ServidorBaseDeDatos__VpcAssignment_14 )
            // InternalMyDsl.g:6007:3: rule__ServidorBaseDeDatos__VpcAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__VpcAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getVpcAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__14__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__15"
    // InternalMyDsl.g:6015:1: rule__ServidorBaseDeDatos__Group__15 : rule__ServidorBaseDeDatos__Group__15__Impl rule__ServidorBaseDeDatos__Group__16 ;
    public final void rule__ServidorBaseDeDatos__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6019:1: ( rule__ServidorBaseDeDatos__Group__15__Impl rule__ServidorBaseDeDatos__Group__16 )
            // InternalMyDsl.g:6020:2: rule__ServidorBaseDeDatos__Group__15__Impl rule__ServidorBaseDeDatos__Group__16
            {
            pushFollow(FOLLOW_31);
            rule__ServidorBaseDeDatos__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__15"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__15__Impl"
    // InternalMyDsl.g:6027:1: rule__ServidorBaseDeDatos__Group__15__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorBaseDeDatos__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6031:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:6032:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:6032:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:6033:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_15()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__15__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__16"
    // InternalMyDsl.g:6042:1: rule__ServidorBaseDeDatos__Group__16 : rule__ServidorBaseDeDatos__Group__16__Impl rule__ServidorBaseDeDatos__Group__17 ;
    public final void rule__ServidorBaseDeDatos__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6046:1: ( rule__ServidorBaseDeDatos__Group__16__Impl rule__ServidorBaseDeDatos__Group__17 )
            // InternalMyDsl.g:6047:2: rule__ServidorBaseDeDatos__Group__16__Impl rule__ServidorBaseDeDatos__Group__17
            {
            pushFollow(FOLLOW_11);
            rule__ServidorBaseDeDatos__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__16"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__16__Impl"
    // InternalMyDsl.g:6054:1: rule__ServidorBaseDeDatos__Group__16__Impl : ( 'subred' ) ;
    public final void rule__ServidorBaseDeDatos__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6058:1: ( ( 'subred' ) )
            // InternalMyDsl.g:6059:1: ( 'subred' )
            {
            // InternalMyDsl.g:6059:1: ( 'subred' )
            // InternalMyDsl.g:6060:2: 'subred'
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSubredKeyword_16()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getSubredKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__16__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__17"
    // InternalMyDsl.g:6069:1: rule__ServidorBaseDeDatos__Group__17 : rule__ServidorBaseDeDatos__Group__17__Impl rule__ServidorBaseDeDatos__Group__18 ;
    public final void rule__ServidorBaseDeDatos__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6073:1: ( rule__ServidorBaseDeDatos__Group__17__Impl rule__ServidorBaseDeDatos__Group__18 )
            // InternalMyDsl.g:6074:2: rule__ServidorBaseDeDatos__Group__17__Impl rule__ServidorBaseDeDatos__Group__18
            {
            pushFollow(FOLLOW_4);
            rule__ServidorBaseDeDatos__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__17"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__17__Impl"
    // InternalMyDsl.g:6081:1: rule__ServidorBaseDeDatos__Group__17__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorBaseDeDatos__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6085:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:6086:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:6086:1: ( RULE_EQUALS )
            // InternalMyDsl.g:6087:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_17()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__17__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__18"
    // InternalMyDsl.g:6096:1: rule__ServidorBaseDeDatos__Group__18 : rule__ServidorBaseDeDatos__Group__18__Impl rule__ServidorBaseDeDatos__Group__19 ;
    public final void rule__ServidorBaseDeDatos__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6100:1: ( rule__ServidorBaseDeDatos__Group__18__Impl rule__ServidorBaseDeDatos__Group__19 )
            // InternalMyDsl.g:6101:2: rule__ServidorBaseDeDatos__Group__18__Impl rule__ServidorBaseDeDatos__Group__19
            {
            pushFollow(FOLLOW_7);
            rule__ServidorBaseDeDatos__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__18"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__18__Impl"
    // InternalMyDsl.g:6108:1: rule__ServidorBaseDeDatos__Group__18__Impl : ( ( rule__ServidorBaseDeDatos__SubredAssignment_18 ) ) ;
    public final void rule__ServidorBaseDeDatos__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6112:1: ( ( ( rule__ServidorBaseDeDatos__SubredAssignment_18 ) ) )
            // InternalMyDsl.g:6113:1: ( ( rule__ServidorBaseDeDatos__SubredAssignment_18 ) )
            {
            // InternalMyDsl.g:6113:1: ( ( rule__ServidorBaseDeDatos__SubredAssignment_18 ) )
            // InternalMyDsl.g:6114:2: ( rule__ServidorBaseDeDatos__SubredAssignment_18 )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSubredAssignment_18()); 
            // InternalMyDsl.g:6115:2: ( rule__ServidorBaseDeDatos__SubredAssignment_18 )
            // InternalMyDsl.g:6115:3: rule__ServidorBaseDeDatos__SubredAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__SubredAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getSubredAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__18__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__19"
    // InternalMyDsl.g:6123:1: rule__ServidorBaseDeDatos__Group__19 : rule__ServidorBaseDeDatos__Group__19__Impl rule__ServidorBaseDeDatos__Group__20 ;
    public final void rule__ServidorBaseDeDatos__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6127:1: ( rule__ServidorBaseDeDatos__Group__19__Impl rule__ServidorBaseDeDatos__Group__20 )
            // InternalMyDsl.g:6128:2: rule__ServidorBaseDeDatos__Group__19__Impl rule__ServidorBaseDeDatos__Group__20
            {
            pushFollow(FOLLOW_35);
            rule__ServidorBaseDeDatos__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__19"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__19__Impl"
    // InternalMyDsl.g:6135:1: rule__ServidorBaseDeDatos__Group__19__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorBaseDeDatos__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6139:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:6140:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:6140:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:6141:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_19()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__19__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__20"
    // InternalMyDsl.g:6150:1: rule__ServidorBaseDeDatos__Group__20 : rule__ServidorBaseDeDatos__Group__20__Impl rule__ServidorBaseDeDatos__Group__21 ;
    public final void rule__ServidorBaseDeDatos__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6154:1: ( rule__ServidorBaseDeDatos__Group__20__Impl rule__ServidorBaseDeDatos__Group__21 )
            // InternalMyDsl.g:6155:2: rule__ServidorBaseDeDatos__Group__20__Impl rule__ServidorBaseDeDatos__Group__21
            {
            pushFollow(FOLLOW_11);
            rule__ServidorBaseDeDatos__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__20"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__20__Impl"
    // InternalMyDsl.g:6162:1: rule__ServidorBaseDeDatos__Group__20__Impl : ( 'securityGroup' ) ;
    public final void rule__ServidorBaseDeDatos__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6166:1: ( ( 'securityGroup' ) )
            // InternalMyDsl.g:6167:1: ( 'securityGroup' )
            {
            // InternalMyDsl.g:6167:1: ( 'securityGroup' )
            // InternalMyDsl.g:6168:2: 'securityGroup'
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSecurityGroupKeyword_20()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getSecurityGroupKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__20__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__21"
    // InternalMyDsl.g:6177:1: rule__ServidorBaseDeDatos__Group__21 : rule__ServidorBaseDeDatos__Group__21__Impl rule__ServidorBaseDeDatos__Group__22 ;
    public final void rule__ServidorBaseDeDatos__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6181:1: ( rule__ServidorBaseDeDatos__Group__21__Impl rule__ServidorBaseDeDatos__Group__22 )
            // InternalMyDsl.g:6182:2: rule__ServidorBaseDeDatos__Group__21__Impl rule__ServidorBaseDeDatos__Group__22
            {
            pushFollow(FOLLOW_4);
            rule__ServidorBaseDeDatos__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__21"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__21__Impl"
    // InternalMyDsl.g:6189:1: rule__ServidorBaseDeDatos__Group__21__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorBaseDeDatos__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6193:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:6194:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:6194:1: ( RULE_EQUALS )
            // InternalMyDsl.g:6195:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_21()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__21__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__22"
    // InternalMyDsl.g:6204:1: rule__ServidorBaseDeDatos__Group__22 : rule__ServidorBaseDeDatos__Group__22__Impl rule__ServidorBaseDeDatos__Group__23 ;
    public final void rule__ServidorBaseDeDatos__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6208:1: ( rule__ServidorBaseDeDatos__Group__22__Impl rule__ServidorBaseDeDatos__Group__23 )
            // InternalMyDsl.g:6209:2: rule__ServidorBaseDeDatos__Group__22__Impl rule__ServidorBaseDeDatos__Group__23
            {
            pushFollow(FOLLOW_7);
            rule__ServidorBaseDeDatos__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__22"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__22__Impl"
    // InternalMyDsl.g:6216:1: rule__ServidorBaseDeDatos__Group__22__Impl : ( ( rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22 ) ) ;
    public final void rule__ServidorBaseDeDatos__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6220:1: ( ( ( rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22 ) ) )
            // InternalMyDsl.g:6221:1: ( ( rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22 ) )
            {
            // InternalMyDsl.g:6221:1: ( ( rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22 ) )
            // InternalMyDsl.g:6222:2: ( rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22 )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getServersecuritygroupAssignment_22()); 
            // InternalMyDsl.g:6223:2: ( rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22 )
            // InternalMyDsl.g:6223:3: rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getServersecuritygroupAssignment_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__22__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__23"
    // InternalMyDsl.g:6231:1: rule__ServidorBaseDeDatos__Group__23 : rule__ServidorBaseDeDatos__Group__23__Impl rule__ServidorBaseDeDatos__Group__24 ;
    public final void rule__ServidorBaseDeDatos__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6235:1: ( rule__ServidorBaseDeDatos__Group__23__Impl rule__ServidorBaseDeDatos__Group__24 )
            // InternalMyDsl.g:6236:2: rule__ServidorBaseDeDatos__Group__23__Impl rule__ServidorBaseDeDatos__Group__24
            {
            pushFollow(FOLLOW_27);
            rule__ServidorBaseDeDatos__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__23"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__23__Impl"
    // InternalMyDsl.g:6243:1: rule__ServidorBaseDeDatos__Group__23__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorBaseDeDatos__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6247:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:6248:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:6248:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:6249:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_23()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__23__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__24"
    // InternalMyDsl.g:6258:1: rule__ServidorBaseDeDatos__Group__24 : rule__ServidorBaseDeDatos__Group__24__Impl ;
    public final void rule__ServidorBaseDeDatos__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6262:1: ( rule__ServidorBaseDeDatos__Group__24__Impl )
            // InternalMyDsl.g:6263:2: rule__ServidorBaseDeDatos__Group__24__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group__24__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__24"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group__24__Impl"
    // InternalMyDsl.g:6269:1: rule__ServidorBaseDeDatos__Group__24__Impl : ( RULE_CLOSE_BRACE ) ;
    public final void rule__ServidorBaseDeDatos__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6273:1: ( ( RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:6274:1: ( RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:6274:1: ( RULE_CLOSE_BRACE )
            // InternalMyDsl.g:6275:2: RULE_CLOSE_BRACE
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getCLOSE_BRACETerminalRuleCall_24()); 
            match(input,RULE_CLOSE_BRACE,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getCLOSE_BRACETerminalRuleCall_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group__24__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_6__0"
    // InternalMyDsl.g:6285:1: rule__ServidorBaseDeDatos__Group_6__0 : rule__ServidorBaseDeDatos__Group_6__0__Impl rule__ServidorBaseDeDatos__Group_6__1 ;
    public final void rule__ServidorBaseDeDatos__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6289:1: ( rule__ServidorBaseDeDatos__Group_6__0__Impl rule__ServidorBaseDeDatos__Group_6__1 )
            // InternalMyDsl.g:6290:2: rule__ServidorBaseDeDatos__Group_6__0__Impl rule__ServidorBaseDeDatos__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__ServidorBaseDeDatos__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_6__0"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_6__0__Impl"
    // InternalMyDsl.g:6297:1: rule__ServidorBaseDeDatos__Group_6__0__Impl : ( 'nombre' ) ;
    public final void rule__ServidorBaseDeDatos__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6301:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:6302:1: ( 'nombre' )
            {
            // InternalMyDsl.g:6302:1: ( 'nombre' )
            // InternalMyDsl.g:6303:2: 'nombre'
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getNombreKeyword_6_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getNombreKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_6__0__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_6__1"
    // InternalMyDsl.g:6312:1: rule__ServidorBaseDeDatos__Group_6__1 : rule__ServidorBaseDeDatos__Group_6__1__Impl rule__ServidorBaseDeDatos__Group_6__2 ;
    public final void rule__ServidorBaseDeDatos__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6316:1: ( rule__ServidorBaseDeDatos__Group_6__1__Impl rule__ServidorBaseDeDatos__Group_6__2 )
            // InternalMyDsl.g:6317:2: rule__ServidorBaseDeDatos__Group_6__1__Impl rule__ServidorBaseDeDatos__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__ServidorBaseDeDatos__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_6__1"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_6__1__Impl"
    // InternalMyDsl.g:6324:1: rule__ServidorBaseDeDatos__Group_6__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorBaseDeDatos__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6328:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:6329:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:6329:1: ( RULE_EQUALS )
            // InternalMyDsl.g:6330:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_6_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_6__1__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_6__2"
    // InternalMyDsl.g:6339:1: rule__ServidorBaseDeDatos__Group_6__2 : rule__ServidorBaseDeDatos__Group_6__2__Impl ;
    public final void rule__ServidorBaseDeDatos__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6343:1: ( rule__ServidorBaseDeDatos__Group_6__2__Impl )
            // InternalMyDsl.g:6344:2: rule__ServidorBaseDeDatos__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_6__2"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_6__2__Impl"
    // InternalMyDsl.g:6350:1: rule__ServidorBaseDeDatos__Group_6__2__Impl : ( ( rule__ServidorBaseDeDatos__NombreAssignment_6_2 ) ) ;
    public final void rule__ServidorBaseDeDatos__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6354:1: ( ( ( rule__ServidorBaseDeDatos__NombreAssignment_6_2 ) ) )
            // InternalMyDsl.g:6355:1: ( ( rule__ServidorBaseDeDatos__NombreAssignment_6_2 ) )
            {
            // InternalMyDsl.g:6355:1: ( ( rule__ServidorBaseDeDatos__NombreAssignment_6_2 ) )
            // InternalMyDsl.g:6356:2: ( rule__ServidorBaseDeDatos__NombreAssignment_6_2 )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getNombreAssignment_6_2()); 
            // InternalMyDsl.g:6357:2: ( rule__ServidorBaseDeDatos__NombreAssignment_6_2 )
            // InternalMyDsl.g:6357:3: rule__ServidorBaseDeDatos__NombreAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__NombreAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getNombreAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_6__2__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_8__0"
    // InternalMyDsl.g:6366:1: rule__ServidorBaseDeDatos__Group_8__0 : rule__ServidorBaseDeDatos__Group_8__0__Impl rule__ServidorBaseDeDatos__Group_8__1 ;
    public final void rule__ServidorBaseDeDatos__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6370:1: ( rule__ServidorBaseDeDatos__Group_8__0__Impl rule__ServidorBaseDeDatos__Group_8__1 )
            // InternalMyDsl.g:6371:2: rule__ServidorBaseDeDatos__Group_8__0__Impl rule__ServidorBaseDeDatos__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__ServidorBaseDeDatos__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_8__0"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_8__0__Impl"
    // InternalMyDsl.g:6378:1: rule__ServidorBaseDeDatos__Group_8__0__Impl : ( 'dimension' ) ;
    public final void rule__ServidorBaseDeDatos__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6382:1: ( ( 'dimension' ) )
            // InternalMyDsl.g:6383:1: ( 'dimension' )
            {
            // InternalMyDsl.g:6383:1: ( 'dimension' )
            // InternalMyDsl.g:6384:2: 'dimension'
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getDimensionKeyword_8_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getDimensionKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_8__0__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_8__1"
    // InternalMyDsl.g:6393:1: rule__ServidorBaseDeDatos__Group_8__1 : rule__ServidorBaseDeDatos__Group_8__1__Impl rule__ServidorBaseDeDatos__Group_8__2 ;
    public final void rule__ServidorBaseDeDatos__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6397:1: ( rule__ServidorBaseDeDatos__Group_8__1__Impl rule__ServidorBaseDeDatos__Group_8__2 )
            // InternalMyDsl.g:6398:2: rule__ServidorBaseDeDatos__Group_8__1__Impl rule__ServidorBaseDeDatos__Group_8__2
            {
            pushFollow(FOLLOW_36);
            rule__ServidorBaseDeDatos__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_8__1"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_8__1__Impl"
    // InternalMyDsl.g:6405:1: rule__ServidorBaseDeDatos__Group_8__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorBaseDeDatos__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6409:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:6410:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:6410:1: ( RULE_EQUALS )
            // InternalMyDsl.g:6411:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_8_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_8__1__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_8__2"
    // InternalMyDsl.g:6420:1: rule__ServidorBaseDeDatos__Group_8__2 : rule__ServidorBaseDeDatos__Group_8__2__Impl ;
    public final void rule__ServidorBaseDeDatos__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6424:1: ( rule__ServidorBaseDeDatos__Group_8__2__Impl )
            // InternalMyDsl.g:6425:2: rule__ServidorBaseDeDatos__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_8__2"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_8__2__Impl"
    // InternalMyDsl.g:6431:1: rule__ServidorBaseDeDatos__Group_8__2__Impl : ( ( rule__ServidorBaseDeDatos__TamanoMAssignment_8_2 ) ) ;
    public final void rule__ServidorBaseDeDatos__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6435:1: ( ( ( rule__ServidorBaseDeDatos__TamanoMAssignment_8_2 ) ) )
            // InternalMyDsl.g:6436:1: ( ( rule__ServidorBaseDeDatos__TamanoMAssignment_8_2 ) )
            {
            // InternalMyDsl.g:6436:1: ( ( rule__ServidorBaseDeDatos__TamanoMAssignment_8_2 ) )
            // InternalMyDsl.g:6437:2: ( rule__ServidorBaseDeDatos__TamanoMAssignment_8_2 )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getTamanoMAssignment_8_2()); 
            // InternalMyDsl.g:6438:2: ( rule__ServidorBaseDeDatos__TamanoMAssignment_8_2 )
            // InternalMyDsl.g:6438:3: rule__ServidorBaseDeDatos__TamanoMAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__TamanoMAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getTamanoMAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_8__2__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_10__0"
    // InternalMyDsl.g:6447:1: rule__ServidorBaseDeDatos__Group_10__0 : rule__ServidorBaseDeDatos__Group_10__0__Impl rule__ServidorBaseDeDatos__Group_10__1 ;
    public final void rule__ServidorBaseDeDatos__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6451:1: ( rule__ServidorBaseDeDatos__Group_10__0__Impl rule__ServidorBaseDeDatos__Group_10__1 )
            // InternalMyDsl.g:6452:2: rule__ServidorBaseDeDatos__Group_10__0__Impl rule__ServidorBaseDeDatos__Group_10__1
            {
            pushFollow(FOLLOW_11);
            rule__ServidorBaseDeDatos__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_10__0"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_10__0__Impl"
    // InternalMyDsl.g:6459:1: rule__ServidorBaseDeDatos__Group_10__0__Impl : ( 'tipo' ) ;
    public final void rule__ServidorBaseDeDatos__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6463:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:6464:1: ( 'tipo' )
            {
            // InternalMyDsl.g:6464:1: ( 'tipo' )
            // InternalMyDsl.g:6465:2: 'tipo'
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getTipoKeyword_10_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getTipoKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_10__0__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_10__1"
    // InternalMyDsl.g:6474:1: rule__ServidorBaseDeDatos__Group_10__1 : rule__ServidorBaseDeDatos__Group_10__1__Impl rule__ServidorBaseDeDatos__Group_10__2 ;
    public final void rule__ServidorBaseDeDatos__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6478:1: ( rule__ServidorBaseDeDatos__Group_10__1__Impl rule__ServidorBaseDeDatos__Group_10__2 )
            // InternalMyDsl.g:6479:2: rule__ServidorBaseDeDatos__Group_10__1__Impl rule__ServidorBaseDeDatos__Group_10__2
            {
            pushFollow(FOLLOW_39);
            rule__ServidorBaseDeDatos__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_10__1"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_10__1__Impl"
    // InternalMyDsl.g:6486:1: rule__ServidorBaseDeDatos__Group_10__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorBaseDeDatos__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6490:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:6491:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:6491:1: ( RULE_EQUALS )
            // InternalMyDsl.g:6492:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_10_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_10__1__Impl"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_10__2"
    // InternalMyDsl.g:6501:1: rule__ServidorBaseDeDatos__Group_10__2 : rule__ServidorBaseDeDatos__Group_10__2__Impl ;
    public final void rule__ServidorBaseDeDatos__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6505:1: ( rule__ServidorBaseDeDatos__Group_10__2__Impl )
            // InternalMyDsl.g:6506:2: rule__ServidorBaseDeDatos__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_10__2"


    // $ANTLR start "rule__ServidorBaseDeDatos__Group_10__2__Impl"
    // InternalMyDsl.g:6512:1: rule__ServidorBaseDeDatos__Group_10__2__Impl : ( ( rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2 ) ) ;
    public final void rule__ServidorBaseDeDatos__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6516:1: ( ( ( rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2 ) ) )
            // InternalMyDsl.g:6517:1: ( ( rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2 ) )
            {
            // InternalMyDsl.g:6517:1: ( ( rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2 ) )
            // InternalMyDsl.g:6518:2: ( rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2 )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSistemaManejadorAssignment_10_2()); 
            // InternalMyDsl.g:6519:2: ( rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2 )
            // InternalMyDsl.g:6519:3: rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getSistemaManejadorAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__Group_10__2__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__0"
    // InternalMyDsl.g:6528:1: rule__ServidorAlmacenamiento__Group__0 : rule__ServidorAlmacenamiento__Group__0__Impl rule__ServidorAlmacenamiento__Group__1 ;
    public final void rule__ServidorAlmacenamiento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6532:1: ( rule__ServidorAlmacenamiento__Group__0__Impl rule__ServidorAlmacenamiento__Group__1 )
            // InternalMyDsl.g:6533:2: rule__ServidorAlmacenamiento__Group__0__Impl rule__ServidorAlmacenamiento__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ServidorAlmacenamiento__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__0"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__0__Impl"
    // InternalMyDsl.g:6540:1: rule__ServidorAlmacenamiento__Group__0__Impl : ( () ) ;
    public final void rule__ServidorAlmacenamiento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6544:1: ( ( () ) )
            // InternalMyDsl.g:6545:1: ( () )
            {
            // InternalMyDsl.g:6545:1: ( () )
            // InternalMyDsl.g:6546:2: ()
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getServidorAlmacenamientoAction_0()); 
            // InternalMyDsl.g:6547:2: ()
            // InternalMyDsl.g:6547:3: 
            {
            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getServidorAlmacenamientoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__0__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__1"
    // InternalMyDsl.g:6555:1: rule__ServidorAlmacenamiento__Group__1 : rule__ServidorAlmacenamiento__Group__1__Impl rule__ServidorAlmacenamiento__Group__2 ;
    public final void rule__ServidorAlmacenamiento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6559:1: ( rule__ServidorAlmacenamiento__Group__1__Impl rule__ServidorAlmacenamiento__Group__2 )
            // InternalMyDsl.g:6560:2: rule__ServidorAlmacenamiento__Group__1__Impl rule__ServidorAlmacenamiento__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ServidorAlmacenamiento__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__1"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__1__Impl"
    // InternalMyDsl.g:6567:1: rule__ServidorAlmacenamiento__Group__1__Impl : ( RULE_OPEN_BRACE ) ;
    public final void rule__ServidorAlmacenamiento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6571:1: ( ( RULE_OPEN_BRACE ) )
            // InternalMyDsl.g:6572:1: ( RULE_OPEN_BRACE )
            {
            // InternalMyDsl.g:6572:1: ( RULE_OPEN_BRACE )
            // InternalMyDsl.g:6573:2: RULE_OPEN_BRACE
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getOPEN_BRACETerminalRuleCall_1()); 
            match(input,RULE_OPEN_BRACE,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getOPEN_BRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__1__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__2"
    // InternalMyDsl.g:6582:1: rule__ServidorAlmacenamiento__Group__2 : rule__ServidorAlmacenamiento__Group__2__Impl rule__ServidorAlmacenamiento__Group__3 ;
    public final void rule__ServidorAlmacenamiento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6586:1: ( rule__ServidorAlmacenamiento__Group__2__Impl rule__ServidorAlmacenamiento__Group__3 )
            // InternalMyDsl.g:6587:2: rule__ServidorAlmacenamiento__Group__2__Impl rule__ServidorAlmacenamiento__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAlmacenamiento__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__2"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__2__Impl"
    // InternalMyDsl.g:6594:1: rule__ServidorAlmacenamiento__Group__2__Impl : ( 'tipo' ) ;
    public final void rule__ServidorAlmacenamiento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6598:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:6599:1: ( 'tipo' )
            {
            // InternalMyDsl.g:6599:1: ( 'tipo' )
            // InternalMyDsl.g:6600:2: 'tipo'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTipoKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getTipoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__2__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__3"
    // InternalMyDsl.g:6609:1: rule__ServidorAlmacenamiento__Group__3 : rule__ServidorAlmacenamiento__Group__3__Impl rule__ServidorAlmacenamiento__Group__4 ;
    public final void rule__ServidorAlmacenamiento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6613:1: ( rule__ServidorAlmacenamiento__Group__3__Impl rule__ServidorAlmacenamiento__Group__4 )
            // InternalMyDsl.g:6614:2: rule__ServidorAlmacenamiento__Group__3__Impl rule__ServidorAlmacenamiento__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__ServidorAlmacenamiento__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__3"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__3__Impl"
    // InternalMyDsl.g:6621:1: rule__ServidorAlmacenamiento__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAlmacenamiento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6625:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:6626:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:6626:1: ( RULE_EQUALS )
            // InternalMyDsl.g:6627:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__3__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__4"
    // InternalMyDsl.g:6636:1: rule__ServidorAlmacenamiento__Group__4 : rule__ServidorAlmacenamiento__Group__4__Impl rule__ServidorAlmacenamiento__Group__5 ;
    public final void rule__ServidorAlmacenamiento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6640:1: ( rule__ServidorAlmacenamiento__Group__4__Impl rule__ServidorAlmacenamiento__Group__5 )
            // InternalMyDsl.g:6641:2: rule__ServidorAlmacenamiento__Group__4__Impl rule__ServidorAlmacenamiento__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ServidorAlmacenamiento__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__4"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__4__Impl"
    // InternalMyDsl.g:6648:1: rule__ServidorAlmacenamiento__Group__4__Impl : ( 'STORAGE' ) ;
    public final void rule__ServidorAlmacenamiento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6652:1: ( ( 'STORAGE' ) )
            // InternalMyDsl.g:6653:1: ( 'STORAGE' )
            {
            // InternalMyDsl.g:6653:1: ( 'STORAGE' )
            // InternalMyDsl.g:6654:2: 'STORAGE'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSTORAGEKeyword_4()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getSTORAGEKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__4__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__5"
    // InternalMyDsl.g:6663:1: rule__ServidorAlmacenamiento__Group__5 : rule__ServidorAlmacenamiento__Group__5__Impl rule__ServidorAlmacenamiento__Group__6 ;
    public final void rule__ServidorAlmacenamiento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6667:1: ( rule__ServidorAlmacenamiento__Group__5__Impl rule__ServidorAlmacenamiento__Group__6 )
            // InternalMyDsl.g:6668:2: rule__ServidorAlmacenamiento__Group__5__Impl rule__ServidorAlmacenamiento__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAlmacenamiento__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__5"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__5__Impl"
    // InternalMyDsl.g:6675:1: rule__ServidorAlmacenamiento__Group__5__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAlmacenamiento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6679:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:6680:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:6680:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:6681:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_5()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__5__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__6"
    // InternalMyDsl.g:6690:1: rule__ServidorAlmacenamiento__Group__6 : rule__ServidorAlmacenamiento__Group__6__Impl rule__ServidorAlmacenamiento__Group__7 ;
    public final void rule__ServidorAlmacenamiento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6694:1: ( rule__ServidorAlmacenamiento__Group__6__Impl rule__ServidorAlmacenamiento__Group__7 )
            // InternalMyDsl.g:6695:2: rule__ServidorAlmacenamiento__Group__6__Impl rule__ServidorAlmacenamiento__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__ServidorAlmacenamiento__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__6"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__6__Impl"
    // InternalMyDsl.g:6702:1: rule__ServidorAlmacenamiento__Group__6__Impl : ( ( rule__ServidorAlmacenamiento__Group_6__0 )? ) ;
    public final void rule__ServidorAlmacenamiento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6706:1: ( ( ( rule__ServidorAlmacenamiento__Group_6__0 )? ) )
            // InternalMyDsl.g:6707:1: ( ( rule__ServidorAlmacenamiento__Group_6__0 )? )
            {
            // InternalMyDsl.g:6707:1: ( ( rule__ServidorAlmacenamiento__Group_6__0 )? )
            // InternalMyDsl.g:6708:2: ( rule__ServidorAlmacenamiento__Group_6__0 )?
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_6()); 
            // InternalMyDsl.g:6709:2: ( rule__ServidorAlmacenamiento__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==54) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:6709:3: rule__ServidorAlmacenamiento__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAlmacenamiento__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__6__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__7"
    // InternalMyDsl.g:6717:1: rule__ServidorAlmacenamiento__Group__7 : rule__ServidorAlmacenamiento__Group__7__Impl rule__ServidorAlmacenamiento__Group__8 ;
    public final void rule__ServidorAlmacenamiento__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6721:1: ( rule__ServidorAlmacenamiento__Group__7__Impl rule__ServidorAlmacenamiento__Group__8 )
            // InternalMyDsl.g:6722:2: rule__ServidorAlmacenamiento__Group__7__Impl rule__ServidorAlmacenamiento__Group__8
            {
            pushFollow(FOLLOW_41);
            rule__ServidorAlmacenamiento__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__7"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__7__Impl"
    // InternalMyDsl.g:6729:1: rule__ServidorAlmacenamiento__Group__7__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAlmacenamiento__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6733:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:6734:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:6734:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:6735:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_7()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__7__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__8"
    // InternalMyDsl.g:6744:1: rule__ServidorAlmacenamiento__Group__8 : rule__ServidorAlmacenamiento__Group__8__Impl rule__ServidorAlmacenamiento__Group__9 ;
    public final void rule__ServidorAlmacenamiento__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6748:1: ( rule__ServidorAlmacenamiento__Group__8__Impl rule__ServidorAlmacenamiento__Group__9 )
            // InternalMyDsl.g:6749:2: rule__ServidorAlmacenamiento__Group__8__Impl rule__ServidorAlmacenamiento__Group__9
            {
            pushFollow(FOLLOW_41);
            rule__ServidorAlmacenamiento__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__8"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__8__Impl"
    // InternalMyDsl.g:6756:1: rule__ServidorAlmacenamiento__Group__8__Impl : ( ( rule__ServidorAlmacenamiento__Group_8__0 )? ) ;
    public final void rule__ServidorAlmacenamiento__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6760:1: ( ( ( rule__ServidorAlmacenamiento__Group_8__0 )? ) )
            // InternalMyDsl.g:6761:1: ( ( rule__ServidorAlmacenamiento__Group_8__0 )? )
            {
            // InternalMyDsl.g:6761:1: ( ( rule__ServidorAlmacenamiento__Group_8__0 )? )
            // InternalMyDsl.g:6762:2: ( rule__ServidorAlmacenamiento__Group_8__0 )?
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_8()); 
            // InternalMyDsl.g:6763:2: ( rule__ServidorAlmacenamiento__Group_8__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==63) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:6763:3: rule__ServidorAlmacenamiento__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAlmacenamiento__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__8__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__9"
    // InternalMyDsl.g:6771:1: rule__ServidorAlmacenamiento__Group__9 : rule__ServidorAlmacenamiento__Group__9__Impl rule__ServidorAlmacenamiento__Group__10 ;
    public final void rule__ServidorAlmacenamiento__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6775:1: ( rule__ServidorAlmacenamiento__Group__9__Impl rule__ServidorAlmacenamiento__Group__10 )
            // InternalMyDsl.g:6776:2: rule__ServidorAlmacenamiento__Group__9__Impl rule__ServidorAlmacenamiento__Group__10
            {
            pushFollow(FOLLOW_42);
            rule__ServidorAlmacenamiento__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__9"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__9__Impl"
    // InternalMyDsl.g:6783:1: rule__ServidorAlmacenamiento__Group__9__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAlmacenamiento__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6787:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:6788:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:6788:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:6789:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_9()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__9__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__10"
    // InternalMyDsl.g:6798:1: rule__ServidorAlmacenamiento__Group__10 : rule__ServidorAlmacenamiento__Group__10__Impl rule__ServidorAlmacenamiento__Group__11 ;
    public final void rule__ServidorAlmacenamiento__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6802:1: ( rule__ServidorAlmacenamiento__Group__10__Impl rule__ServidorAlmacenamiento__Group__11 )
            // InternalMyDsl.g:6803:2: rule__ServidorAlmacenamiento__Group__10__Impl rule__ServidorAlmacenamiento__Group__11
            {
            pushFollow(FOLLOW_42);
            rule__ServidorAlmacenamiento__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__10"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__10__Impl"
    // InternalMyDsl.g:6810:1: rule__ServidorAlmacenamiento__Group__10__Impl : ( ( rule__ServidorAlmacenamiento__Group_10__0 )? ) ;
    public final void rule__ServidorAlmacenamiento__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6814:1: ( ( ( rule__ServidorAlmacenamiento__Group_10__0 )? ) )
            // InternalMyDsl.g:6815:1: ( ( rule__ServidorAlmacenamiento__Group_10__0 )? )
            {
            // InternalMyDsl.g:6815:1: ( ( rule__ServidorAlmacenamiento__Group_10__0 )? )
            // InternalMyDsl.g:6816:2: ( rule__ServidorAlmacenamiento__Group_10__0 )?
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGroup_10()); 
            // InternalMyDsl.g:6817:2: ( rule__ServidorAlmacenamiento__Group_10__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==67) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:6817:3: rule__ServidorAlmacenamiento__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAlmacenamiento__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__10__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__11"
    // InternalMyDsl.g:6825:1: rule__ServidorAlmacenamiento__Group__11 : rule__ServidorAlmacenamiento__Group__11__Impl rule__ServidorAlmacenamiento__Group__12 ;
    public final void rule__ServidorAlmacenamiento__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6829:1: ( rule__ServidorAlmacenamiento__Group__11__Impl rule__ServidorAlmacenamiento__Group__12 )
            // InternalMyDsl.g:6830:2: rule__ServidorAlmacenamiento__Group__11__Impl rule__ServidorAlmacenamiento__Group__12
            {
            pushFollow(FOLLOW_21);
            rule__ServidorAlmacenamiento__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__11"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__11__Impl"
    // InternalMyDsl.g:6837:1: rule__ServidorAlmacenamiento__Group__11__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAlmacenamiento__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6841:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:6842:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:6842:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:6843:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_11()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__11__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__12"
    // InternalMyDsl.g:6852:1: rule__ServidorAlmacenamiento__Group__12 : rule__ServidorAlmacenamiento__Group__12__Impl rule__ServidorAlmacenamiento__Group__13 ;
    public final void rule__ServidorAlmacenamiento__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6856:1: ( rule__ServidorAlmacenamiento__Group__12__Impl rule__ServidorAlmacenamiento__Group__13 )
            // InternalMyDsl.g:6857:2: rule__ServidorAlmacenamiento__Group__12__Impl rule__ServidorAlmacenamiento__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAlmacenamiento__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__12"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__12__Impl"
    // InternalMyDsl.g:6864:1: rule__ServidorAlmacenamiento__Group__12__Impl : ( 'vpc' ) ;
    public final void rule__ServidorAlmacenamiento__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6868:1: ( ( 'vpc' ) )
            // InternalMyDsl.g:6869:1: ( 'vpc' )
            {
            // InternalMyDsl.g:6869:1: ( 'vpc' )
            // InternalMyDsl.g:6870:2: 'vpc'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getVpcKeyword_12()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getVpcKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__12__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__13"
    // InternalMyDsl.g:6879:1: rule__ServidorAlmacenamiento__Group__13 : rule__ServidorAlmacenamiento__Group__13__Impl rule__ServidorAlmacenamiento__Group__14 ;
    public final void rule__ServidorAlmacenamiento__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6883:1: ( rule__ServidorAlmacenamiento__Group__13__Impl rule__ServidorAlmacenamiento__Group__14 )
            // InternalMyDsl.g:6884:2: rule__ServidorAlmacenamiento__Group__13__Impl rule__ServidorAlmacenamiento__Group__14
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAlmacenamiento__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__13"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__13__Impl"
    // InternalMyDsl.g:6891:1: rule__ServidorAlmacenamiento__Group__13__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAlmacenamiento__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6895:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:6896:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:6896:1: ( RULE_EQUALS )
            // InternalMyDsl.g:6897:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_13()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__13__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__14"
    // InternalMyDsl.g:6906:1: rule__ServidorAlmacenamiento__Group__14 : rule__ServidorAlmacenamiento__Group__14__Impl rule__ServidorAlmacenamiento__Group__15 ;
    public final void rule__ServidorAlmacenamiento__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6910:1: ( rule__ServidorAlmacenamiento__Group__14__Impl rule__ServidorAlmacenamiento__Group__15 )
            // InternalMyDsl.g:6911:2: rule__ServidorAlmacenamiento__Group__14__Impl rule__ServidorAlmacenamiento__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__ServidorAlmacenamiento__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__14"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__14__Impl"
    // InternalMyDsl.g:6918:1: rule__ServidorAlmacenamiento__Group__14__Impl : ( ( rule__ServidorAlmacenamiento__VpcAssignment_14 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6922:1: ( ( ( rule__ServidorAlmacenamiento__VpcAssignment_14 ) ) )
            // InternalMyDsl.g:6923:1: ( ( rule__ServidorAlmacenamiento__VpcAssignment_14 ) )
            {
            // InternalMyDsl.g:6923:1: ( ( rule__ServidorAlmacenamiento__VpcAssignment_14 ) )
            // InternalMyDsl.g:6924:2: ( rule__ServidorAlmacenamiento__VpcAssignment_14 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getVpcAssignment_14()); 
            // InternalMyDsl.g:6925:2: ( rule__ServidorAlmacenamiento__VpcAssignment_14 )
            // InternalMyDsl.g:6925:3: rule__ServidorAlmacenamiento__VpcAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__VpcAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getVpcAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__14__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__15"
    // InternalMyDsl.g:6933:1: rule__ServidorAlmacenamiento__Group__15 : rule__ServidorAlmacenamiento__Group__15__Impl rule__ServidorAlmacenamiento__Group__16 ;
    public final void rule__ServidorAlmacenamiento__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6937:1: ( rule__ServidorAlmacenamiento__Group__15__Impl rule__ServidorAlmacenamiento__Group__16 )
            // InternalMyDsl.g:6938:2: rule__ServidorAlmacenamiento__Group__15__Impl rule__ServidorAlmacenamiento__Group__16
            {
            pushFollow(FOLLOW_31);
            rule__ServidorAlmacenamiento__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__15"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__15__Impl"
    // InternalMyDsl.g:6945:1: rule__ServidorAlmacenamiento__Group__15__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAlmacenamiento__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6949:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:6950:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:6950:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:6951:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_15()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__15__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__16"
    // InternalMyDsl.g:6960:1: rule__ServidorAlmacenamiento__Group__16 : rule__ServidorAlmacenamiento__Group__16__Impl rule__ServidorAlmacenamiento__Group__17 ;
    public final void rule__ServidorAlmacenamiento__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6964:1: ( rule__ServidorAlmacenamiento__Group__16__Impl rule__ServidorAlmacenamiento__Group__17 )
            // InternalMyDsl.g:6965:2: rule__ServidorAlmacenamiento__Group__16__Impl rule__ServidorAlmacenamiento__Group__17
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAlmacenamiento__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__16"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__16__Impl"
    // InternalMyDsl.g:6972:1: rule__ServidorAlmacenamiento__Group__16__Impl : ( 'subred' ) ;
    public final void rule__ServidorAlmacenamiento__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6976:1: ( ( 'subred' ) )
            // InternalMyDsl.g:6977:1: ( 'subred' )
            {
            // InternalMyDsl.g:6977:1: ( 'subred' )
            // InternalMyDsl.g:6978:2: 'subred'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSubredKeyword_16()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getSubredKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__16__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__17"
    // InternalMyDsl.g:6987:1: rule__ServidorAlmacenamiento__Group__17 : rule__ServidorAlmacenamiento__Group__17__Impl rule__ServidorAlmacenamiento__Group__18 ;
    public final void rule__ServidorAlmacenamiento__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6991:1: ( rule__ServidorAlmacenamiento__Group__17__Impl rule__ServidorAlmacenamiento__Group__18 )
            // InternalMyDsl.g:6992:2: rule__ServidorAlmacenamiento__Group__17__Impl rule__ServidorAlmacenamiento__Group__18
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAlmacenamiento__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__17"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__17__Impl"
    // InternalMyDsl.g:6999:1: rule__ServidorAlmacenamiento__Group__17__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAlmacenamiento__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7003:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:7004:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:7004:1: ( RULE_EQUALS )
            // InternalMyDsl.g:7005:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_17()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__17__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__18"
    // InternalMyDsl.g:7014:1: rule__ServidorAlmacenamiento__Group__18 : rule__ServidorAlmacenamiento__Group__18__Impl rule__ServidorAlmacenamiento__Group__19 ;
    public final void rule__ServidorAlmacenamiento__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7018:1: ( rule__ServidorAlmacenamiento__Group__18__Impl rule__ServidorAlmacenamiento__Group__19 )
            // InternalMyDsl.g:7019:2: rule__ServidorAlmacenamiento__Group__18__Impl rule__ServidorAlmacenamiento__Group__19
            {
            pushFollow(FOLLOW_7);
            rule__ServidorAlmacenamiento__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__18"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__18__Impl"
    // InternalMyDsl.g:7026:1: rule__ServidorAlmacenamiento__Group__18__Impl : ( ( rule__ServidorAlmacenamiento__SubredAssignment_18 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7030:1: ( ( ( rule__ServidorAlmacenamiento__SubredAssignment_18 ) ) )
            // InternalMyDsl.g:7031:1: ( ( rule__ServidorAlmacenamiento__SubredAssignment_18 ) )
            {
            // InternalMyDsl.g:7031:1: ( ( rule__ServidorAlmacenamiento__SubredAssignment_18 ) )
            // InternalMyDsl.g:7032:2: ( rule__ServidorAlmacenamiento__SubredAssignment_18 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSubredAssignment_18()); 
            // InternalMyDsl.g:7033:2: ( rule__ServidorAlmacenamiento__SubredAssignment_18 )
            // InternalMyDsl.g:7033:3: rule__ServidorAlmacenamiento__SubredAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__SubredAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getSubredAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__18__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__19"
    // InternalMyDsl.g:7041:1: rule__ServidorAlmacenamiento__Group__19 : rule__ServidorAlmacenamiento__Group__19__Impl rule__ServidorAlmacenamiento__Group__20 ;
    public final void rule__ServidorAlmacenamiento__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7045:1: ( rule__ServidorAlmacenamiento__Group__19__Impl rule__ServidorAlmacenamiento__Group__20 )
            // InternalMyDsl.g:7046:2: rule__ServidorAlmacenamiento__Group__19__Impl rule__ServidorAlmacenamiento__Group__20
            {
            pushFollow(FOLLOW_35);
            rule__ServidorAlmacenamiento__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__19"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__19__Impl"
    // InternalMyDsl.g:7053:1: rule__ServidorAlmacenamiento__Group__19__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAlmacenamiento__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7057:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:7058:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:7058:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:7059:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_19()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__19__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__20"
    // InternalMyDsl.g:7068:1: rule__ServidorAlmacenamiento__Group__20 : rule__ServidorAlmacenamiento__Group__20__Impl rule__ServidorAlmacenamiento__Group__21 ;
    public final void rule__ServidorAlmacenamiento__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7072:1: ( rule__ServidorAlmacenamiento__Group__20__Impl rule__ServidorAlmacenamiento__Group__21 )
            // InternalMyDsl.g:7073:2: rule__ServidorAlmacenamiento__Group__20__Impl rule__ServidorAlmacenamiento__Group__21
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAlmacenamiento__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__20"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__20__Impl"
    // InternalMyDsl.g:7080:1: rule__ServidorAlmacenamiento__Group__20__Impl : ( 'securityGroup' ) ;
    public final void rule__ServidorAlmacenamiento__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7084:1: ( ( 'securityGroup' ) )
            // InternalMyDsl.g:7085:1: ( 'securityGroup' )
            {
            // InternalMyDsl.g:7085:1: ( 'securityGroup' )
            // InternalMyDsl.g:7086:2: 'securityGroup'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSecurityGroupKeyword_20()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getSecurityGroupKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__20__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__21"
    // InternalMyDsl.g:7095:1: rule__ServidorAlmacenamiento__Group__21 : rule__ServidorAlmacenamiento__Group__21__Impl rule__ServidorAlmacenamiento__Group__22 ;
    public final void rule__ServidorAlmacenamiento__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7099:1: ( rule__ServidorAlmacenamiento__Group__21__Impl rule__ServidorAlmacenamiento__Group__22 )
            // InternalMyDsl.g:7100:2: rule__ServidorAlmacenamiento__Group__21__Impl rule__ServidorAlmacenamiento__Group__22
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAlmacenamiento__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__21"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__21__Impl"
    // InternalMyDsl.g:7107:1: rule__ServidorAlmacenamiento__Group__21__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAlmacenamiento__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7111:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:7112:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:7112:1: ( RULE_EQUALS )
            // InternalMyDsl.g:7113:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_21()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__21__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__22"
    // InternalMyDsl.g:7122:1: rule__ServidorAlmacenamiento__Group__22 : rule__ServidorAlmacenamiento__Group__22__Impl rule__ServidorAlmacenamiento__Group__23 ;
    public final void rule__ServidorAlmacenamiento__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7126:1: ( rule__ServidorAlmacenamiento__Group__22__Impl rule__ServidorAlmacenamiento__Group__23 )
            // InternalMyDsl.g:7127:2: rule__ServidorAlmacenamiento__Group__22__Impl rule__ServidorAlmacenamiento__Group__23
            {
            pushFollow(FOLLOW_7);
            rule__ServidorAlmacenamiento__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__22"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__22__Impl"
    // InternalMyDsl.g:7134:1: rule__ServidorAlmacenamiento__Group__22__Impl : ( ( rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7138:1: ( ( ( rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22 ) ) )
            // InternalMyDsl.g:7139:1: ( ( rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22 ) )
            {
            // InternalMyDsl.g:7139:1: ( ( rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22 ) )
            // InternalMyDsl.g:7140:2: ( rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getServersecuritygroupAssignment_22()); 
            // InternalMyDsl.g:7141:2: ( rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22 )
            // InternalMyDsl.g:7141:3: rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getServersecuritygroupAssignment_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__22__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__23"
    // InternalMyDsl.g:7149:1: rule__ServidorAlmacenamiento__Group__23 : rule__ServidorAlmacenamiento__Group__23__Impl rule__ServidorAlmacenamiento__Group__24 ;
    public final void rule__ServidorAlmacenamiento__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7153:1: ( rule__ServidorAlmacenamiento__Group__23__Impl rule__ServidorAlmacenamiento__Group__24 )
            // InternalMyDsl.g:7154:2: rule__ServidorAlmacenamiento__Group__23__Impl rule__ServidorAlmacenamiento__Group__24
            {
            pushFollow(FOLLOW_27);
            rule__ServidorAlmacenamiento__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__23"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__23__Impl"
    // InternalMyDsl.g:7161:1: rule__ServidorAlmacenamiento__Group__23__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__ServidorAlmacenamiento__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7165:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:7166:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:7166:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:7167:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_23()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__23__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__24"
    // InternalMyDsl.g:7176:1: rule__ServidorAlmacenamiento__Group__24 : rule__ServidorAlmacenamiento__Group__24__Impl ;
    public final void rule__ServidorAlmacenamiento__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7180:1: ( rule__ServidorAlmacenamiento__Group__24__Impl )
            // InternalMyDsl.g:7181:2: rule__ServidorAlmacenamiento__Group__24__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group__24__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__24"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group__24__Impl"
    // InternalMyDsl.g:7187:1: rule__ServidorAlmacenamiento__Group__24__Impl : ( RULE_CLOSE_BRACE ) ;
    public final void rule__ServidorAlmacenamiento__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7191:1: ( ( RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:7192:1: ( RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:7192:1: ( RULE_CLOSE_BRACE )
            // InternalMyDsl.g:7193:2: RULE_CLOSE_BRACE
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getCLOSE_BRACETerminalRuleCall_24()); 
            match(input,RULE_CLOSE_BRACE,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getCLOSE_BRACETerminalRuleCall_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group__24__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_6__0"
    // InternalMyDsl.g:7203:1: rule__ServidorAlmacenamiento__Group_6__0 : rule__ServidorAlmacenamiento__Group_6__0__Impl rule__ServidorAlmacenamiento__Group_6__1 ;
    public final void rule__ServidorAlmacenamiento__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7207:1: ( rule__ServidorAlmacenamiento__Group_6__0__Impl rule__ServidorAlmacenamiento__Group_6__1 )
            // InternalMyDsl.g:7208:2: rule__ServidorAlmacenamiento__Group_6__0__Impl rule__ServidorAlmacenamiento__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAlmacenamiento__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_6__0"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_6__0__Impl"
    // InternalMyDsl.g:7215:1: rule__ServidorAlmacenamiento__Group_6__0__Impl : ( 'nombre' ) ;
    public final void rule__ServidorAlmacenamiento__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7219:1: ( ( 'nombre' ) )
            // InternalMyDsl.g:7220:1: ( 'nombre' )
            {
            // InternalMyDsl.g:7220:1: ( 'nombre' )
            // InternalMyDsl.g:7221:2: 'nombre'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getNombreKeyword_6_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getNombreKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_6__0__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_6__1"
    // InternalMyDsl.g:7230:1: rule__ServidorAlmacenamiento__Group_6__1 : rule__ServidorAlmacenamiento__Group_6__1__Impl rule__ServidorAlmacenamiento__Group_6__2 ;
    public final void rule__ServidorAlmacenamiento__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7234:1: ( rule__ServidorAlmacenamiento__Group_6__1__Impl rule__ServidorAlmacenamiento__Group_6__2 )
            // InternalMyDsl.g:7235:2: rule__ServidorAlmacenamiento__Group_6__1__Impl rule__ServidorAlmacenamiento__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAlmacenamiento__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_6__1"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_6__1__Impl"
    // InternalMyDsl.g:7242:1: rule__ServidorAlmacenamiento__Group_6__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAlmacenamiento__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7246:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:7247:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:7247:1: ( RULE_EQUALS )
            // InternalMyDsl.g:7248:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_6_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_6__1__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_6__2"
    // InternalMyDsl.g:7257:1: rule__ServidorAlmacenamiento__Group_6__2 : rule__ServidorAlmacenamiento__Group_6__2__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7261:1: ( rule__ServidorAlmacenamiento__Group_6__2__Impl )
            // InternalMyDsl.g:7262:2: rule__ServidorAlmacenamiento__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_6__2"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_6__2__Impl"
    // InternalMyDsl.g:7268:1: rule__ServidorAlmacenamiento__Group_6__2__Impl : ( ( rule__ServidorAlmacenamiento__NombreAssignment_6_2 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7272:1: ( ( ( rule__ServidorAlmacenamiento__NombreAssignment_6_2 ) ) )
            // InternalMyDsl.g:7273:1: ( ( rule__ServidorAlmacenamiento__NombreAssignment_6_2 ) )
            {
            // InternalMyDsl.g:7273:1: ( ( rule__ServidorAlmacenamiento__NombreAssignment_6_2 ) )
            // InternalMyDsl.g:7274:2: ( rule__ServidorAlmacenamiento__NombreAssignment_6_2 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getNombreAssignment_6_2()); 
            // InternalMyDsl.g:7275:2: ( rule__ServidorAlmacenamiento__NombreAssignment_6_2 )
            // InternalMyDsl.g:7275:3: rule__ServidorAlmacenamiento__NombreAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__NombreAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getNombreAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_6__2__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_8__0"
    // InternalMyDsl.g:7284:1: rule__ServidorAlmacenamiento__Group_8__0 : rule__ServidorAlmacenamiento__Group_8__0__Impl rule__ServidorAlmacenamiento__Group_8__1 ;
    public final void rule__ServidorAlmacenamiento__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7288:1: ( rule__ServidorAlmacenamiento__Group_8__0__Impl rule__ServidorAlmacenamiento__Group_8__1 )
            // InternalMyDsl.g:7289:2: rule__ServidorAlmacenamiento__Group_8__0__Impl rule__ServidorAlmacenamiento__Group_8__1
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAlmacenamiento__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_8__0"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_8__0__Impl"
    // InternalMyDsl.g:7296:1: rule__ServidorAlmacenamiento__Group_8__0__Impl : ( 'dimension' ) ;
    public final void rule__ServidorAlmacenamiento__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7300:1: ( ( 'dimension' ) )
            // InternalMyDsl.g:7301:1: ( 'dimension' )
            {
            // InternalMyDsl.g:7301:1: ( 'dimension' )
            // InternalMyDsl.g:7302:2: 'dimension'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getDimensionKeyword_8_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getDimensionKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_8__0__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_8__1"
    // InternalMyDsl.g:7311:1: rule__ServidorAlmacenamiento__Group_8__1 : rule__ServidorAlmacenamiento__Group_8__1__Impl rule__ServidorAlmacenamiento__Group_8__2 ;
    public final void rule__ServidorAlmacenamiento__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7315:1: ( rule__ServidorAlmacenamiento__Group_8__1__Impl rule__ServidorAlmacenamiento__Group_8__2 )
            // InternalMyDsl.g:7316:2: rule__ServidorAlmacenamiento__Group_8__1__Impl rule__ServidorAlmacenamiento__Group_8__2
            {
            pushFollow(FOLLOW_36);
            rule__ServidorAlmacenamiento__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_8__1"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_8__1__Impl"
    // InternalMyDsl.g:7323:1: rule__ServidorAlmacenamiento__Group_8__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAlmacenamiento__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7327:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:7328:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:7328:1: ( RULE_EQUALS )
            // InternalMyDsl.g:7329:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_8_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_8__1__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_8__2"
    // InternalMyDsl.g:7338:1: rule__ServidorAlmacenamiento__Group_8__2 : rule__ServidorAlmacenamiento__Group_8__2__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7342:1: ( rule__ServidorAlmacenamiento__Group_8__2__Impl )
            // InternalMyDsl.g:7343:2: rule__ServidorAlmacenamiento__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_8__2"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_8__2__Impl"
    // InternalMyDsl.g:7349:1: rule__ServidorAlmacenamiento__Group_8__2__Impl : ( ( rule__ServidorAlmacenamiento__TamanoMAssignment_8_2 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7353:1: ( ( ( rule__ServidorAlmacenamiento__TamanoMAssignment_8_2 ) ) )
            // InternalMyDsl.g:7354:1: ( ( rule__ServidorAlmacenamiento__TamanoMAssignment_8_2 ) )
            {
            // InternalMyDsl.g:7354:1: ( ( rule__ServidorAlmacenamiento__TamanoMAssignment_8_2 ) )
            // InternalMyDsl.g:7355:2: ( rule__ServidorAlmacenamiento__TamanoMAssignment_8_2 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanoMAssignment_8_2()); 
            // InternalMyDsl.g:7356:2: ( rule__ServidorAlmacenamiento__TamanoMAssignment_8_2 )
            // InternalMyDsl.g:7356:3: rule__ServidorAlmacenamiento__TamanoMAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__TamanoMAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getTamanoMAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_8__2__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_10__0"
    // InternalMyDsl.g:7365:1: rule__ServidorAlmacenamiento__Group_10__0 : rule__ServidorAlmacenamiento__Group_10__0__Impl rule__ServidorAlmacenamiento__Group_10__1 ;
    public final void rule__ServidorAlmacenamiento__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7369:1: ( rule__ServidorAlmacenamiento__Group_10__0__Impl rule__ServidorAlmacenamiento__Group_10__1 )
            // InternalMyDsl.g:7370:2: rule__ServidorAlmacenamiento__Group_10__0__Impl rule__ServidorAlmacenamiento__Group_10__1
            {
            pushFollow(FOLLOW_11);
            rule__ServidorAlmacenamiento__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_10__0"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_10__0__Impl"
    // InternalMyDsl.g:7377:1: rule__ServidorAlmacenamiento__Group_10__0__Impl : ( 'gigas' ) ;
    public final void rule__ServidorAlmacenamiento__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7381:1: ( ( 'gigas' ) )
            // InternalMyDsl.g:7382:1: ( 'gigas' )
            {
            // InternalMyDsl.g:7382:1: ( 'gigas' )
            // InternalMyDsl.g:7383:2: 'gigas'
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getGigasKeyword_10_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getGigasKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_10__0__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_10__1"
    // InternalMyDsl.g:7392:1: rule__ServidorAlmacenamiento__Group_10__1 : rule__ServidorAlmacenamiento__Group_10__1__Impl rule__ServidorAlmacenamiento__Group_10__2 ;
    public final void rule__ServidorAlmacenamiento__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7396:1: ( rule__ServidorAlmacenamiento__Group_10__1__Impl rule__ServidorAlmacenamiento__Group_10__2 )
            // InternalMyDsl.g:7397:2: rule__ServidorAlmacenamiento__Group_10__1__Impl rule__ServidorAlmacenamiento__Group_10__2
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAlmacenamiento__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_10__1"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_10__1__Impl"
    // InternalMyDsl.g:7404:1: rule__ServidorAlmacenamiento__Group_10__1__Impl : ( RULE_EQUALS ) ;
    public final void rule__ServidorAlmacenamiento__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7408:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:7409:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:7409:1: ( RULE_EQUALS )
            // InternalMyDsl.g:7410:2: RULE_EQUALS
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_10_1()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_10__1__Impl"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_10__2"
    // InternalMyDsl.g:7419:1: rule__ServidorAlmacenamiento__Group_10__2 : rule__ServidorAlmacenamiento__Group_10__2__Impl ;
    public final void rule__ServidorAlmacenamiento__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7423:1: ( rule__ServidorAlmacenamiento__Group_10__2__Impl )
            // InternalMyDsl.g:7424:2: rule__ServidorAlmacenamiento__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_10__2"


    // $ANTLR start "rule__ServidorAlmacenamiento__Group_10__2__Impl"
    // InternalMyDsl.g:7430:1: rule__ServidorAlmacenamiento__Group_10__2__Impl : ( ( rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2 ) ) ;
    public final void rule__ServidorAlmacenamiento__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7434:1: ( ( ( rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2 ) ) )
            // InternalMyDsl.g:7435:1: ( ( rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2 ) )
            {
            // InternalMyDsl.g:7435:1: ( ( rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2 ) )
            // InternalMyDsl.g:7436:2: ( rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2 )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanoInicialAssignment_10_2()); 
            // InternalMyDsl.g:7437:2: ( rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2 )
            // InternalMyDsl.g:7437:3: rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getTamanoInicialAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__Group_10__2__Impl"


    // $ANTLR start "rule__Conexion__Group__0"
    // InternalMyDsl.g:7446:1: rule__Conexion__Group__0 : rule__Conexion__Group__0__Impl rule__Conexion__Group__1 ;
    public final void rule__Conexion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7450:1: ( rule__Conexion__Group__0__Impl rule__Conexion__Group__1 )
            // InternalMyDsl.g:7451:2: rule__Conexion__Group__0__Impl rule__Conexion__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Conexion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__0"


    // $ANTLR start "rule__Conexion__Group__0__Impl"
    // InternalMyDsl.g:7458:1: rule__Conexion__Group__0__Impl : ( () ) ;
    public final void rule__Conexion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7462:1: ( ( () ) )
            // InternalMyDsl.g:7463:1: ( () )
            {
            // InternalMyDsl.g:7463:1: ( () )
            // InternalMyDsl.g:7464:2: ()
            {
             before(grammarAccess.getConexionAccess().getConexionAction_0()); 
            // InternalMyDsl.g:7465:2: ()
            // InternalMyDsl.g:7465:3: 
            {
            }

             after(grammarAccess.getConexionAccess().getConexionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__0__Impl"


    // $ANTLR start "rule__Conexion__Group__1"
    // InternalMyDsl.g:7473:1: rule__Conexion__Group__1 : rule__Conexion__Group__1__Impl rule__Conexion__Group__2 ;
    public final void rule__Conexion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7477:1: ( rule__Conexion__Group__1__Impl rule__Conexion__Group__2 )
            // InternalMyDsl.g:7478:2: rule__Conexion__Group__1__Impl rule__Conexion__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Conexion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__1"


    // $ANTLR start "rule__Conexion__Group__1__Impl"
    // InternalMyDsl.g:7485:1: rule__Conexion__Group__1__Impl : ( RULE_OPEN_BRACE ) ;
    public final void rule__Conexion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7489:1: ( ( RULE_OPEN_BRACE ) )
            // InternalMyDsl.g:7490:1: ( RULE_OPEN_BRACE )
            {
            // InternalMyDsl.g:7490:1: ( RULE_OPEN_BRACE )
            // InternalMyDsl.g:7491:2: RULE_OPEN_BRACE
            {
             before(grammarAccess.getConexionAccess().getOPEN_BRACETerminalRuleCall_1()); 
            match(input,RULE_OPEN_BRACE,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getOPEN_BRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__1__Impl"


    // $ANTLR start "rule__Conexion__Group__2"
    // InternalMyDsl.g:7500:1: rule__Conexion__Group__2 : rule__Conexion__Group__2__Impl rule__Conexion__Group__3 ;
    public final void rule__Conexion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7504:1: ( rule__Conexion__Group__2__Impl rule__Conexion__Group__3 )
            // InternalMyDsl.g:7505:2: rule__Conexion__Group__2__Impl rule__Conexion__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Conexion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__2"


    // $ANTLR start "rule__Conexion__Group__2__Impl"
    // InternalMyDsl.g:7512:1: rule__Conexion__Group__2__Impl : ( 'servidorUno' ) ;
    public final void rule__Conexion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7516:1: ( ( 'servidorUno' ) )
            // InternalMyDsl.g:7517:1: ( 'servidorUno' )
            {
            // InternalMyDsl.g:7517:1: ( 'servidorUno' )
            // InternalMyDsl.g:7518:2: 'servidorUno'
            {
             before(grammarAccess.getConexionAccess().getServidorUnoKeyword_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getServidorUnoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__2__Impl"


    // $ANTLR start "rule__Conexion__Group__3"
    // InternalMyDsl.g:7527:1: rule__Conexion__Group__3 : rule__Conexion__Group__3__Impl rule__Conexion__Group__4 ;
    public final void rule__Conexion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7531:1: ( rule__Conexion__Group__3__Impl rule__Conexion__Group__4 )
            // InternalMyDsl.g:7532:2: rule__Conexion__Group__3__Impl rule__Conexion__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Conexion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__3"


    // $ANTLR start "rule__Conexion__Group__3__Impl"
    // InternalMyDsl.g:7539:1: rule__Conexion__Group__3__Impl : ( RULE_EQUALS ) ;
    public final void rule__Conexion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7543:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:7544:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:7544:1: ( RULE_EQUALS )
            // InternalMyDsl.g:7545:2: RULE_EQUALS
            {
             before(grammarAccess.getConexionAccess().getEQUALSTerminalRuleCall_3()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getEQUALSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__3__Impl"


    // $ANTLR start "rule__Conexion__Group__4"
    // InternalMyDsl.g:7554:1: rule__Conexion__Group__4 : rule__Conexion__Group__4__Impl rule__Conexion__Group__5 ;
    public final void rule__Conexion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7558:1: ( rule__Conexion__Group__4__Impl rule__Conexion__Group__5 )
            // InternalMyDsl.g:7559:2: rule__Conexion__Group__4__Impl rule__Conexion__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Conexion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__4"


    // $ANTLR start "rule__Conexion__Group__4__Impl"
    // InternalMyDsl.g:7566:1: rule__Conexion__Group__4__Impl : ( ( rule__Conexion__Servidor1Assignment_4 ) ) ;
    public final void rule__Conexion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7570:1: ( ( ( rule__Conexion__Servidor1Assignment_4 ) ) )
            // InternalMyDsl.g:7571:1: ( ( rule__Conexion__Servidor1Assignment_4 ) )
            {
            // InternalMyDsl.g:7571:1: ( ( rule__Conexion__Servidor1Assignment_4 ) )
            // InternalMyDsl.g:7572:2: ( rule__Conexion__Servidor1Assignment_4 )
            {
             before(grammarAccess.getConexionAccess().getServidor1Assignment_4()); 
            // InternalMyDsl.g:7573:2: ( rule__Conexion__Servidor1Assignment_4 )
            // InternalMyDsl.g:7573:3: rule__Conexion__Servidor1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Conexion__Servidor1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConexionAccess().getServidor1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__4__Impl"


    // $ANTLR start "rule__Conexion__Group__5"
    // InternalMyDsl.g:7581:1: rule__Conexion__Group__5 : rule__Conexion__Group__5__Impl rule__Conexion__Group__6 ;
    public final void rule__Conexion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7585:1: ( rule__Conexion__Group__5__Impl rule__Conexion__Group__6 )
            // InternalMyDsl.g:7586:2: rule__Conexion__Group__5__Impl rule__Conexion__Group__6
            {
            pushFollow(FOLLOW_44);
            rule__Conexion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__5"


    // $ANTLR start "rule__Conexion__Group__5__Impl"
    // InternalMyDsl.g:7593:1: rule__Conexion__Group__5__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Conexion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7597:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:7598:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:7598:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:7599:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getConexionAccess().getSEMI_COLONTerminalRuleCall_5()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getSEMI_COLONTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__5__Impl"


    // $ANTLR start "rule__Conexion__Group__6"
    // InternalMyDsl.g:7608:1: rule__Conexion__Group__6 : rule__Conexion__Group__6__Impl rule__Conexion__Group__7 ;
    public final void rule__Conexion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7612:1: ( rule__Conexion__Group__6__Impl rule__Conexion__Group__7 )
            // InternalMyDsl.g:7613:2: rule__Conexion__Group__6__Impl rule__Conexion__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Conexion__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__6"


    // $ANTLR start "rule__Conexion__Group__6__Impl"
    // InternalMyDsl.g:7620:1: rule__Conexion__Group__6__Impl : ( 'servidorDos' ) ;
    public final void rule__Conexion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7624:1: ( ( 'servidorDos' ) )
            // InternalMyDsl.g:7625:1: ( 'servidorDos' )
            {
            // InternalMyDsl.g:7625:1: ( 'servidorDos' )
            // InternalMyDsl.g:7626:2: 'servidorDos'
            {
             before(grammarAccess.getConexionAccess().getServidorDosKeyword_6()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getServidorDosKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__6__Impl"


    // $ANTLR start "rule__Conexion__Group__7"
    // InternalMyDsl.g:7635:1: rule__Conexion__Group__7 : rule__Conexion__Group__7__Impl rule__Conexion__Group__8 ;
    public final void rule__Conexion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7639:1: ( rule__Conexion__Group__7__Impl rule__Conexion__Group__8 )
            // InternalMyDsl.g:7640:2: rule__Conexion__Group__7__Impl rule__Conexion__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Conexion__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__7"


    // $ANTLR start "rule__Conexion__Group__7__Impl"
    // InternalMyDsl.g:7647:1: rule__Conexion__Group__7__Impl : ( RULE_EQUALS ) ;
    public final void rule__Conexion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7651:1: ( ( RULE_EQUALS ) )
            // InternalMyDsl.g:7652:1: ( RULE_EQUALS )
            {
            // InternalMyDsl.g:7652:1: ( RULE_EQUALS )
            // InternalMyDsl.g:7653:2: RULE_EQUALS
            {
             before(grammarAccess.getConexionAccess().getEQUALSTerminalRuleCall_7()); 
            match(input,RULE_EQUALS,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getEQUALSTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__7__Impl"


    // $ANTLR start "rule__Conexion__Group__8"
    // InternalMyDsl.g:7662:1: rule__Conexion__Group__8 : rule__Conexion__Group__8__Impl rule__Conexion__Group__9 ;
    public final void rule__Conexion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7666:1: ( rule__Conexion__Group__8__Impl rule__Conexion__Group__9 )
            // InternalMyDsl.g:7667:2: rule__Conexion__Group__8__Impl rule__Conexion__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Conexion__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__8"


    // $ANTLR start "rule__Conexion__Group__8__Impl"
    // InternalMyDsl.g:7674:1: rule__Conexion__Group__8__Impl : ( ( rule__Conexion__Servidor2Assignment_8 ) ) ;
    public final void rule__Conexion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7678:1: ( ( ( rule__Conexion__Servidor2Assignment_8 ) ) )
            // InternalMyDsl.g:7679:1: ( ( rule__Conexion__Servidor2Assignment_8 ) )
            {
            // InternalMyDsl.g:7679:1: ( ( rule__Conexion__Servidor2Assignment_8 ) )
            // InternalMyDsl.g:7680:2: ( rule__Conexion__Servidor2Assignment_8 )
            {
             before(grammarAccess.getConexionAccess().getServidor2Assignment_8()); 
            // InternalMyDsl.g:7681:2: ( rule__Conexion__Servidor2Assignment_8 )
            // InternalMyDsl.g:7681:3: rule__Conexion__Servidor2Assignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Conexion__Servidor2Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getConexionAccess().getServidor2Assignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__8__Impl"


    // $ANTLR start "rule__Conexion__Group__9"
    // InternalMyDsl.g:7689:1: rule__Conexion__Group__9 : rule__Conexion__Group__9__Impl rule__Conexion__Group__10 ;
    public final void rule__Conexion__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7693:1: ( rule__Conexion__Group__9__Impl rule__Conexion__Group__10 )
            // InternalMyDsl.g:7694:2: rule__Conexion__Group__9__Impl rule__Conexion__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Conexion__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conexion__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__9"


    // $ANTLR start "rule__Conexion__Group__9__Impl"
    // InternalMyDsl.g:7701:1: rule__Conexion__Group__9__Impl : ( RULE_SEMI_COLON ) ;
    public final void rule__Conexion__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7705:1: ( ( RULE_SEMI_COLON ) )
            // InternalMyDsl.g:7706:1: ( RULE_SEMI_COLON )
            {
            // InternalMyDsl.g:7706:1: ( RULE_SEMI_COLON )
            // InternalMyDsl.g:7707:2: RULE_SEMI_COLON
            {
             before(grammarAccess.getConexionAccess().getSEMI_COLONTerminalRuleCall_9()); 
            match(input,RULE_SEMI_COLON,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getSEMI_COLONTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__9__Impl"


    // $ANTLR start "rule__Conexion__Group__10"
    // InternalMyDsl.g:7716:1: rule__Conexion__Group__10 : rule__Conexion__Group__10__Impl ;
    public final void rule__Conexion__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7720:1: ( rule__Conexion__Group__10__Impl )
            // InternalMyDsl.g:7721:2: rule__Conexion__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conexion__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__10"


    // $ANTLR start "rule__Conexion__Group__10__Impl"
    // InternalMyDsl.g:7727:1: rule__Conexion__Group__10__Impl : ( RULE_CLOSE_BRACE ) ;
    public final void rule__Conexion__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7731:1: ( ( RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:7732:1: ( RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:7732:1: ( RULE_CLOSE_BRACE )
            // InternalMyDsl.g:7733:2: RULE_CLOSE_BRACE
            {
             before(grammarAccess.getConexionAccess().getCLOSE_BRACETerminalRuleCall_10()); 
            match(input,RULE_CLOSE_BRACE,FOLLOW_2); 
             after(grammarAccess.getConexionAccess().getCLOSE_BRACETerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Group__10__Impl"


    // $ANTLR start "rule__Infraestructura__NombreProyectoAssignment_2"
    // InternalMyDsl.g:7743:1: rule__Infraestructura__NombreProyectoAssignment_2 : ( ruleEString ) ;
    public final void rule__Infraestructura__NombreProyectoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7747:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7748:2: ( ruleEString )
            {
            // InternalMyDsl.g:7748:2: ( ruleEString )
            // InternalMyDsl.g:7749:3: ruleEString
            {
             before(grammarAccess.getInfraestructuraAccess().getNombreProyectoEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInfraestructuraAccess().getNombreProyectoEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__NombreProyectoAssignment_2"


    // $ANTLR start "rule__Infraestructura__TipoAssignment_4_2"
    // InternalMyDsl.g:7758:1: rule__Infraestructura__TipoAssignment_4_2 : ( ruleProveedorServicio ) ;
    public final void rule__Infraestructura__TipoAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7762:1: ( ( ruleProveedorServicio ) )
            // InternalMyDsl.g:7763:2: ( ruleProveedorServicio )
            {
            // InternalMyDsl.g:7763:2: ( ruleProveedorServicio )
            // InternalMyDsl.g:7764:3: ruleProveedorServicio
            {
             before(grammarAccess.getInfraestructuraAccess().getTipoProveedorServicioEnumRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProveedorServicio();

            state._fsp--;

             after(grammarAccess.getInfraestructuraAccess().getTipoProveedorServicioEnumRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__TipoAssignment_4_2"


    // $ANTLR start "rule__Infraestructura__LoginsAssignment_6_2"
    // InternalMyDsl.g:7773:1: rule__Infraestructura__LoginsAssignment_6_2 : ( ruleLogin ) ;
    public final void rule__Infraestructura__LoginsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7777:1: ( ( ruleLogin ) )
            // InternalMyDsl.g:7778:2: ( ruleLogin )
            {
            // InternalMyDsl.g:7778:2: ( ruleLogin )
            // InternalMyDsl.g:7779:3: ruleLogin
            {
             before(grammarAccess.getInfraestructuraAccess().getLoginsLoginParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogin();

            state._fsp--;

             after(grammarAccess.getInfraestructuraAccess().getLoginsLoginParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__LoginsAssignment_6_2"


    // $ANTLR start "rule__Infraestructura__SecuritygroupsAssignment_8_3"
    // InternalMyDsl.g:7788:1: rule__Infraestructura__SecuritygroupsAssignment_8_3 : ( ruleSecurityGroup ) ;
    public final void rule__Infraestructura__SecuritygroupsAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7792:1: ( ( ruleSecurityGroup ) )
            // InternalMyDsl.g:7793:2: ( ruleSecurityGroup )
            {
            // InternalMyDsl.g:7793:2: ( ruleSecurityGroup )
            // InternalMyDsl.g:7794:3: ruleSecurityGroup
            {
             before(grammarAccess.getInfraestructuraAccess().getSecuritygroupsSecurityGroupParserRuleCall_8_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityGroup();

            state._fsp--;

             after(grammarAccess.getInfraestructuraAccess().getSecuritygroupsSecurityGroupParserRuleCall_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__SecuritygroupsAssignment_8_3"


    // $ANTLR start "rule__Infraestructura__SecuritygroupsAssignment_8_4_1"
    // InternalMyDsl.g:7803:1: rule__Infraestructura__SecuritygroupsAssignment_8_4_1 : ( ruleSecurityGroup ) ;
    public final void rule__Infraestructura__SecuritygroupsAssignment_8_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7807:1: ( ( ruleSecurityGroup ) )
            // InternalMyDsl.g:7808:2: ( ruleSecurityGroup )
            {
            // InternalMyDsl.g:7808:2: ( ruleSecurityGroup )
            // InternalMyDsl.g:7809:3: ruleSecurityGroup
            {
             before(grammarAccess.getInfraestructuraAccess().getSecuritygroupsSecurityGroupParserRuleCall_8_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSecurityGroup();

            state._fsp--;

             after(grammarAccess.getInfraestructuraAccess().getSecuritygroupsSecurityGroupParserRuleCall_8_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__SecuritygroupsAssignment_8_4_1"


    // $ANTLR start "rule__Infraestructura__AmbientesdesplegueAssignment_10_3"
    // InternalMyDsl.g:7818:1: rule__Infraestructura__AmbientesdesplegueAssignment_10_3 : ( ruleAmbienteDesplegue ) ;
    public final void rule__Infraestructura__AmbientesdesplegueAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7822:1: ( ( ruleAmbienteDesplegue ) )
            // InternalMyDsl.g:7823:2: ( ruleAmbienteDesplegue )
            {
            // InternalMyDsl.g:7823:2: ( ruleAmbienteDesplegue )
            // InternalMyDsl.g:7824:3: ruleAmbienteDesplegue
            {
             before(grammarAccess.getInfraestructuraAccess().getAmbientesdesplegueAmbienteDesplegueParserRuleCall_10_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAmbienteDesplegue();

            state._fsp--;

             after(grammarAccess.getInfraestructuraAccess().getAmbientesdesplegueAmbienteDesplegueParserRuleCall_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__AmbientesdesplegueAssignment_10_3"


    // $ANTLR start "rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1"
    // InternalMyDsl.g:7833:1: rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1 : ( ruleAmbienteDesplegue ) ;
    public final void rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7837:1: ( ( ruleAmbienteDesplegue ) )
            // InternalMyDsl.g:7838:2: ( ruleAmbienteDesplegue )
            {
            // InternalMyDsl.g:7838:2: ( ruleAmbienteDesplegue )
            // InternalMyDsl.g:7839:3: ruleAmbienteDesplegue
            {
             before(grammarAccess.getInfraestructuraAccess().getAmbientesdesplegueAmbienteDesplegueParserRuleCall_10_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAmbienteDesplegue();

            state._fsp--;

             after(grammarAccess.getInfraestructuraAccess().getAmbientesdesplegueAmbienteDesplegueParserRuleCall_10_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Infraestructura__AmbientesdesplegueAssignment_10_4_1"


    // $ANTLR start "rule__Login__NombreConexionAssignment_2_2"
    // InternalMyDsl.g:7848:1: rule__Login__NombreConexionAssignment_2_2 : ( ruleEString ) ;
    public final void rule__Login__NombreConexionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7852:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7853:2: ( ruleEString )
            {
            // InternalMyDsl.g:7853:2: ( ruleEString )
            // InternalMyDsl.g:7854:3: ruleEString
            {
             before(grammarAccess.getLoginAccess().getNombreConexionEStringParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoginAccess().getNombreConexionEStringParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__NombreConexionAssignment_2_2"


    // $ANTLR start "rule__Login__UsuarioAssignment_3_2"
    // InternalMyDsl.g:7863:1: rule__Login__UsuarioAssignment_3_2 : ( ruleEString ) ;
    public final void rule__Login__UsuarioAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7867:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7868:2: ( ruleEString )
            {
            // InternalMyDsl.g:7868:2: ( ruleEString )
            // InternalMyDsl.g:7869:3: ruleEString
            {
             before(grammarAccess.getLoginAccess().getUsuarioEStringParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoginAccess().getUsuarioEStringParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__UsuarioAssignment_3_2"


    // $ANTLR start "rule__Login__ContrasenaAssignment_4_2"
    // InternalMyDsl.g:7878:1: rule__Login__ContrasenaAssignment_4_2 : ( ruleEString ) ;
    public final void rule__Login__ContrasenaAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7882:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7883:2: ( ruleEString )
            {
            // InternalMyDsl.g:7883:2: ( ruleEString )
            // InternalMyDsl.g:7884:3: ruleEString
            {
             before(grammarAccess.getLoginAccess().getContrasenaEStringParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoginAccess().getContrasenaEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__ContrasenaAssignment_4_2"


    // $ANTLR start "rule__Login__AccessIdAssignment_5_2"
    // InternalMyDsl.g:7893:1: rule__Login__AccessIdAssignment_5_2 : ( ruleEString ) ;
    public final void rule__Login__AccessIdAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7897:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7898:2: ( ruleEString )
            {
            // InternalMyDsl.g:7898:2: ( ruleEString )
            // InternalMyDsl.g:7899:3: ruleEString
            {
             before(grammarAccess.getLoginAccess().getAccessIdEStringParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoginAccess().getAccessIdEStringParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__AccessIdAssignment_5_2"


    // $ANTLR start "rule__Login__SecretAssignment_6_2"
    // InternalMyDsl.g:7908:1: rule__Login__SecretAssignment_6_2 : ( ruleEString ) ;
    public final void rule__Login__SecretAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7912:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7913:2: ( ruleEString )
            {
            // InternalMyDsl.g:7913:2: ( ruleEString )
            // InternalMyDsl.g:7914:3: ruleEString
            {
             before(grammarAccess.getLoginAccess().getSecretEStringParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoginAccess().getSecretEStringParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__SecretAssignment_6_2"


    // $ANTLR start "rule__AmbienteDesplegue__AliasAssignment_2_2"
    // InternalMyDsl.g:7923:1: rule__AmbienteDesplegue__AliasAssignment_2_2 : ( ruleEString ) ;
    public final void rule__AmbienteDesplegue__AliasAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7927:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7928:2: ( ruleEString )
            {
            // InternalMyDsl.g:7928:2: ( ruleEString )
            // InternalMyDsl.g:7929:3: ruleEString
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getAliasEStringParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAmbienteDesplegueAccess().getAliasEStringParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__AliasAssignment_2_2"


    // $ANTLR start "rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2"
    // InternalMyDsl.g:7938:1: rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2 : ( ruleAmbiente ) ;
    public final void rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7942:1: ( ( ruleAmbiente ) )
            // InternalMyDsl.g:7943:2: ( ruleAmbiente )
            {
            // InternalMyDsl.g:7943:2: ( ruleAmbiente )
            // InternalMyDsl.g:7944:3: ruleAmbiente
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getTipoAmbienteAmbienteEnumRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAmbiente();

            state._fsp--;

             after(grammarAccess.getAmbienteDesplegueAccess().getTipoAmbienteAmbienteEnumRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__TipoAmbienteAssignment_4_2"


    // $ANTLR start "rule__AmbienteDesplegue__VpcAssignment_6_3"
    // InternalMyDsl.g:7953:1: rule__AmbienteDesplegue__VpcAssignment_6_3 : ( ruleVPC ) ;
    public final void rule__AmbienteDesplegue__VpcAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7957:1: ( ( ruleVPC ) )
            // InternalMyDsl.g:7958:2: ( ruleVPC )
            {
            // InternalMyDsl.g:7958:2: ( ruleVPC )
            // InternalMyDsl.g:7959:3: ruleVPC
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getVpcVPCParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVPC();

            state._fsp--;

             after(grammarAccess.getAmbienteDesplegueAccess().getVpcVPCParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__VpcAssignment_6_3"


    // $ANTLR start "rule__AmbienteDesplegue__VpcAssignment_6_4_1"
    // InternalMyDsl.g:7968:1: rule__AmbienteDesplegue__VpcAssignment_6_4_1 : ( ruleVPC ) ;
    public final void rule__AmbienteDesplegue__VpcAssignment_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7972:1: ( ( ruleVPC ) )
            // InternalMyDsl.g:7973:2: ( ruleVPC )
            {
            // InternalMyDsl.g:7973:2: ( ruleVPC )
            // InternalMyDsl.g:7974:3: ruleVPC
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getVpcVPCParserRuleCall_6_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVPC();

            state._fsp--;

             after(grammarAccess.getAmbienteDesplegueAccess().getVpcVPCParserRuleCall_6_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__VpcAssignment_6_4_1"


    // $ANTLR start "rule__AmbienteDesplegue__ServidoresAssignment_11"
    // InternalMyDsl.g:7983:1: rule__AmbienteDesplegue__ServidoresAssignment_11 : ( ruleServidor ) ;
    public final void rule__AmbienteDesplegue__ServidoresAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7987:1: ( ( ruleServidor ) )
            // InternalMyDsl.g:7988:2: ( ruleServidor )
            {
            // InternalMyDsl.g:7988:2: ( ruleServidor )
            // InternalMyDsl.g:7989:3: ruleServidor
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getServidoresServidorParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleServidor();

            state._fsp--;

             after(grammarAccess.getAmbienteDesplegueAccess().getServidoresServidorParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__ServidoresAssignment_11"


    // $ANTLR start "rule__AmbienteDesplegue__ServidoresAssignment_12_1"
    // InternalMyDsl.g:7998:1: rule__AmbienteDesplegue__ServidoresAssignment_12_1 : ( ruleServidor ) ;
    public final void rule__AmbienteDesplegue__ServidoresAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8002:1: ( ( ruleServidor ) )
            // InternalMyDsl.g:8003:2: ( ruleServidor )
            {
            // InternalMyDsl.g:8003:2: ( ruleServidor )
            // InternalMyDsl.g:8004:3: ruleServidor
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getServidoresServidorParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServidor();

            state._fsp--;

             after(grammarAccess.getAmbienteDesplegueAccess().getServidoresServidorParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__ServidoresAssignment_12_1"


    // $ANTLR start "rule__AmbienteDesplegue__ConexionAssignment_15_3"
    // InternalMyDsl.g:8013:1: rule__AmbienteDesplegue__ConexionAssignment_15_3 : ( ruleConexion ) ;
    public final void rule__AmbienteDesplegue__ConexionAssignment_15_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8017:1: ( ( ruleConexion ) )
            // InternalMyDsl.g:8018:2: ( ruleConexion )
            {
            // InternalMyDsl.g:8018:2: ( ruleConexion )
            // InternalMyDsl.g:8019:3: ruleConexion
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getConexionConexionParserRuleCall_15_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConexion();

            state._fsp--;

             after(grammarAccess.getAmbienteDesplegueAccess().getConexionConexionParserRuleCall_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__ConexionAssignment_15_3"


    // $ANTLR start "rule__AmbienteDesplegue__ConexionAssignment_15_4_1"
    // InternalMyDsl.g:8028:1: rule__AmbienteDesplegue__ConexionAssignment_15_4_1 : ( ruleConexion ) ;
    public final void rule__AmbienteDesplegue__ConexionAssignment_15_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8032:1: ( ( ruleConexion ) )
            // InternalMyDsl.g:8033:2: ( ruleConexion )
            {
            // InternalMyDsl.g:8033:2: ( ruleConexion )
            // InternalMyDsl.g:8034:3: ruleConexion
            {
             before(grammarAccess.getAmbienteDesplegueAccess().getConexionConexionParserRuleCall_15_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConexion();

            state._fsp--;

             after(grammarAccess.getAmbienteDesplegueAccess().getConexionConexionParserRuleCall_15_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmbienteDesplegue__ConexionAssignment_15_4_1"


    // $ANTLR start "rule__SecurityGroup__NameAssignment_2_2"
    // InternalMyDsl.g:8043:1: rule__SecurityGroup__NameAssignment_2_2 : ( ruleEString ) ;
    public final void rule__SecurityGroup__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8047:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8048:2: ( ruleEString )
            {
            // InternalMyDsl.g:8048:2: ( ruleEString )
            // InternalMyDsl.g:8049:3: ruleEString
            {
             before(grammarAccess.getSecurityGroupAccess().getNameEStringParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSecurityGroupAccess().getNameEStringParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__NameAssignment_2_2"


    // $ANTLR start "rule__SecurityGroup__DescriptionAssignment_4_2"
    // InternalMyDsl.g:8058:1: rule__SecurityGroup__DescriptionAssignment_4_2 : ( ruleEString ) ;
    public final void rule__SecurityGroup__DescriptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8062:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8063:2: ( ruleEString )
            {
            // InternalMyDsl.g:8063:2: ( ruleEString )
            // InternalMyDsl.g:8064:3: ruleEString
            {
             before(grammarAccess.getSecurityGroupAccess().getDescriptionEStringParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSecurityGroupAccess().getDescriptionEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecurityGroup__DescriptionAssignment_4_2"


    // $ANTLR start "rule__Subred__NameAssignment_2_2"
    // InternalMyDsl.g:8073:1: rule__Subred__NameAssignment_2_2 : ( ruleEString ) ;
    public final void rule__Subred__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8077:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8078:2: ( ruleEString )
            {
            // InternalMyDsl.g:8078:2: ( ruleEString )
            // InternalMyDsl.g:8079:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getNameEStringParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getNameEStringParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__NameAssignment_2_2"


    // $ANTLR start "rule__Subred__CidrAssignment_4_2"
    // InternalMyDsl.g:8088:1: rule__Subred__CidrAssignment_4_2 : ( ruleEString ) ;
    public final void rule__Subred__CidrAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8092:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8093:2: ( ruleEString )
            {
            // InternalMyDsl.g:8093:2: ( ruleEString )
            // InternalMyDsl.g:8094:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getCidrEStringParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getCidrEStringParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__CidrAssignment_4_2"


    // $ANTLR start "rule__Subred__AzAssignment_6_2"
    // InternalMyDsl.g:8103:1: rule__Subred__AzAssignment_6_2 : ( ruleEString ) ;
    public final void rule__Subred__AzAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8107:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8108:2: ( ruleEString )
            {
            // InternalMyDsl.g:8108:2: ( ruleEString )
            // InternalMyDsl.g:8109:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getAzEStringParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getAzEStringParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__AzAssignment_6_2"


    // $ANTLR start "rule__VPC__NameAssignment_2_2"
    // InternalMyDsl.g:8118:1: rule__VPC__NameAssignment_2_2 : ( ruleEString ) ;
    public final void rule__VPC__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8122:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8123:2: ( ruleEString )
            {
            // InternalMyDsl.g:8123:2: ( ruleEString )
            // InternalMyDsl.g:8124:3: ruleEString
            {
             before(grammarAccess.getVPCAccess().getNameEStringParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVPCAccess().getNameEStringParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__NameAssignment_2_2"


    // $ANTLR start "rule__VPC__SubredAssignment_4_2"
    // InternalMyDsl.g:8133:1: rule__VPC__SubredAssignment_4_2 : ( ruleSubred ) ;
    public final void rule__VPC__SubredAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8137:1: ( ( ruleSubred ) )
            // InternalMyDsl.g:8138:2: ( ruleSubred )
            {
            // InternalMyDsl.g:8138:2: ( ruleSubred )
            // InternalMyDsl.g:8139:3: ruleSubred
            {
             before(grammarAccess.getVPCAccess().getSubredSubredParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubred();

            state._fsp--;

             after(grammarAccess.getVPCAccess().getSubredSubredParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VPC__SubredAssignment_4_2"


    // $ANTLR start "rule__ServidorAplicacion__NombreAssignment_6_2"
    // InternalMyDsl.g:8148:1: rule__ServidorAplicacion__NombreAssignment_6_2 : ( ruleEString ) ;
    public final void rule__ServidorAplicacion__NombreAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8152:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8153:2: ( ruleEString )
            {
            // InternalMyDsl.g:8153:2: ( ruleEString )
            // InternalMyDsl.g:8154:3: ruleEString
            {
             before(grammarAccess.getServidorAplicacionAccess().getNombreEStringParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionAccess().getNombreEStringParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__NombreAssignment_6_2"


    // $ANTLR start "rule__ServidorAplicacion__TamanoMAssignment_8_2"
    // InternalMyDsl.g:8163:1: rule__ServidorAplicacion__TamanoMAssignment_8_2 : ( ruleTamanoMaquina ) ;
    public final void rule__ServidorAplicacion__TamanoMAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8167:1: ( ( ruleTamanoMaquina ) )
            // InternalMyDsl.g:8168:2: ( ruleTamanoMaquina )
            {
            // InternalMyDsl.g:8168:2: ( ruleTamanoMaquina )
            // InternalMyDsl.g:8169:3: ruleTamanoMaquina
            {
             before(grammarAccess.getServidorAplicacionAccess().getTamanoMTamanoMaquinaEnumRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanoMaquina();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionAccess().getTamanoMTamanoMaquinaEnumRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__TamanoMAssignment_8_2"


    // $ANTLR start "rule__ServidorAplicacion__SistemaOAssignment_10_2"
    // InternalMyDsl.g:8178:1: rule__ServidorAplicacion__SistemaOAssignment_10_2 : ( ruleSistemaOperativo ) ;
    public final void rule__ServidorAplicacion__SistemaOAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8182:1: ( ( ruleSistemaOperativo ) )
            // InternalMyDsl.g:8183:2: ( ruleSistemaOperativo )
            {
            // InternalMyDsl.g:8183:2: ( ruleSistemaOperativo )
            // InternalMyDsl.g:8184:3: ruleSistemaOperativo
            {
             before(grammarAccess.getServidorAplicacionAccess().getSistemaOSistemaOperativoEnumRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSistemaOperativo();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionAccess().getSistemaOSistemaOperativoEnumRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__SistemaOAssignment_10_2"


    // $ANTLR start "rule__ServidorAplicacion__VpcAssignment_14"
    // InternalMyDsl.g:8193:1: rule__ServidorAplicacion__VpcAssignment_14 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicacion__VpcAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8197:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8198:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8198:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8199:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionAccess().getVpcVPCCrossReference_14_0()); 
            // InternalMyDsl.g:8200:3: ( ruleEString )
            // InternalMyDsl.g:8201:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionAccess().getVpcVPCEStringParserRuleCall_14_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionAccess().getVpcVPCEStringParserRuleCall_14_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionAccess().getVpcVPCCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__VpcAssignment_14"


    // $ANTLR start "rule__ServidorAplicacion__SubredAssignment_18"
    // InternalMyDsl.g:8212:1: rule__ServidorAplicacion__SubredAssignment_18 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicacion__SubredAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8216:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8217:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8217:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8218:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionAccess().getSubredSubredCrossReference_18_0()); 
            // InternalMyDsl.g:8219:3: ( ruleEString )
            // InternalMyDsl.g:8220:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionAccess().getSubredSubredEStringParserRuleCall_18_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionAccess().getSubredSubredEStringParserRuleCall_18_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionAccess().getSubredSubredCrossReference_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__SubredAssignment_18"


    // $ANTLR start "rule__ServidorAplicacion__ServersecuritygroupAssignment_22"
    // InternalMyDsl.g:8231:1: rule__ServidorAplicacion__ServersecuritygroupAssignment_22 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicacion__ServersecuritygroupAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8235:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8236:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8236:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8237:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionAccess().getServersecuritygroupSecurityGroupCrossReference_22_0()); 
            // InternalMyDsl.g:8238:3: ( ruleEString )
            // InternalMyDsl.g:8239:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionAccess().getServersecuritygroupSecurityGroupEStringParserRuleCall_22_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionAccess().getServersecuritygroupSecurityGroupEStringParserRuleCall_22_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionAccess().getServersecuritygroupSecurityGroupCrossReference_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicacion__ServersecuritygroupAssignment_22"


    // $ANTLR start "rule__ServidorBaseDeDatos__NombreAssignment_6_2"
    // InternalMyDsl.g:8250:1: rule__ServidorBaseDeDatos__NombreAssignment_6_2 : ( ruleEString ) ;
    public final void rule__ServidorBaseDeDatos__NombreAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8254:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8255:2: ( ruleEString )
            {
            // InternalMyDsl.g:8255:2: ( ruleEString )
            // InternalMyDsl.g:8256:3: ruleEString
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getNombreEStringParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBaseDeDatosAccess().getNombreEStringParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__NombreAssignment_6_2"


    // $ANTLR start "rule__ServidorBaseDeDatos__TamanoMAssignment_8_2"
    // InternalMyDsl.g:8265:1: rule__ServidorBaseDeDatos__TamanoMAssignment_8_2 : ( ruleTamanoMaquina ) ;
    public final void rule__ServidorBaseDeDatos__TamanoMAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8269:1: ( ( ruleTamanoMaquina ) )
            // InternalMyDsl.g:8270:2: ( ruleTamanoMaquina )
            {
            // InternalMyDsl.g:8270:2: ( ruleTamanoMaquina )
            // InternalMyDsl.g:8271:3: ruleTamanoMaquina
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getTamanoMTamanoMaquinaEnumRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanoMaquina();

            state._fsp--;

             after(grammarAccess.getServidorBaseDeDatosAccess().getTamanoMTamanoMaquinaEnumRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__TamanoMAssignment_8_2"


    // $ANTLR start "rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2"
    // InternalMyDsl.g:8280:1: rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2 : ( ruleSistemaManejador ) ;
    public final void rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8284:1: ( ( ruleSistemaManejador ) )
            // InternalMyDsl.g:8285:2: ( ruleSistemaManejador )
            {
            // InternalMyDsl.g:8285:2: ( ruleSistemaManejador )
            // InternalMyDsl.g:8286:3: ruleSistemaManejador
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSistemaManejadorSistemaManejadorEnumRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSistemaManejador();

            state._fsp--;

             after(grammarAccess.getServidorBaseDeDatosAccess().getSistemaManejadorSistemaManejadorEnumRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__SistemaManejadorAssignment_10_2"


    // $ANTLR start "rule__ServidorBaseDeDatos__VpcAssignment_14"
    // InternalMyDsl.g:8295:1: rule__ServidorBaseDeDatos__VpcAssignment_14 : ( ( ruleEString ) ) ;
    public final void rule__ServidorBaseDeDatos__VpcAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8299:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8300:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8300:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8301:3: ( ruleEString )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getVpcVPCCrossReference_14_0()); 
            // InternalMyDsl.g:8302:3: ( ruleEString )
            // InternalMyDsl.g:8303:4: ruleEString
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getVpcVPCEStringParserRuleCall_14_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBaseDeDatosAccess().getVpcVPCEStringParserRuleCall_14_0_1()); 

            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getVpcVPCCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__VpcAssignment_14"


    // $ANTLR start "rule__ServidorBaseDeDatos__SubredAssignment_18"
    // InternalMyDsl.g:8314:1: rule__ServidorBaseDeDatos__SubredAssignment_18 : ( ( ruleEString ) ) ;
    public final void rule__ServidorBaseDeDatos__SubredAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8318:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8319:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8319:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8320:3: ( ruleEString )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSubredSubredCrossReference_18_0()); 
            // InternalMyDsl.g:8321:3: ( ruleEString )
            // InternalMyDsl.g:8322:4: ruleEString
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getSubredSubredEStringParserRuleCall_18_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBaseDeDatosAccess().getSubredSubredEStringParserRuleCall_18_0_1()); 

            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getSubredSubredCrossReference_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__SubredAssignment_18"


    // $ANTLR start "rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22"
    // InternalMyDsl.g:8333:1: rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22 : ( ( ruleEString ) ) ;
    public final void rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8337:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8338:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8338:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8339:3: ( ruleEString )
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getServersecuritygroupSecurityGroupCrossReference_22_0()); 
            // InternalMyDsl.g:8340:3: ( ruleEString )
            // InternalMyDsl.g:8341:4: ruleEString
            {
             before(grammarAccess.getServidorBaseDeDatosAccess().getServersecuritygroupSecurityGroupEStringParserRuleCall_22_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBaseDeDatosAccess().getServersecuritygroupSecurityGroupEStringParserRuleCall_22_0_1()); 

            }

             after(grammarAccess.getServidorBaseDeDatosAccess().getServersecuritygroupSecurityGroupCrossReference_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBaseDeDatos__ServersecuritygroupAssignment_22"


    // $ANTLR start "rule__ServidorAlmacenamiento__NombreAssignment_6_2"
    // InternalMyDsl.g:8352:1: rule__ServidorAlmacenamiento__NombreAssignment_6_2 : ( ruleEString ) ;
    public final void rule__ServidorAlmacenamiento__NombreAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8356:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8357:2: ( ruleEString )
            {
            // InternalMyDsl.g:8357:2: ( ruleEString )
            // InternalMyDsl.g:8358:3: ruleEString
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getNombreEStringParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getNombreEStringParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__NombreAssignment_6_2"


    // $ANTLR start "rule__ServidorAlmacenamiento__TamanoMAssignment_8_2"
    // InternalMyDsl.g:8367:1: rule__ServidorAlmacenamiento__TamanoMAssignment_8_2 : ( ruleTamanoMaquina ) ;
    public final void rule__ServidorAlmacenamiento__TamanoMAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8371:1: ( ( ruleTamanoMaquina ) )
            // InternalMyDsl.g:8372:2: ( ruleTamanoMaquina )
            {
            // InternalMyDsl.g:8372:2: ( ruleTamanoMaquina )
            // InternalMyDsl.g:8373:3: ruleTamanoMaquina
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanoMTamanoMaquinaEnumRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanoMaquina();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getTamanoMTamanoMaquinaEnumRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__TamanoMAssignment_8_2"


    // $ANTLR start "rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2"
    // InternalMyDsl.g:8382:1: rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2 : ( ruleEString ) ;
    public final void rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8386:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8387:2: ( ruleEString )
            {
            // InternalMyDsl.g:8387:2: ( ruleEString )
            // InternalMyDsl.g:8388:3: ruleEString
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getTamanoInicialEStringParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getTamanoInicialEStringParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__TamanoInicialAssignment_10_2"


    // $ANTLR start "rule__ServidorAlmacenamiento__VpcAssignment_14"
    // InternalMyDsl.g:8397:1: rule__ServidorAlmacenamiento__VpcAssignment_14 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAlmacenamiento__VpcAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8401:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8402:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8402:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8403:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getVpcVPCCrossReference_14_0()); 
            // InternalMyDsl.g:8404:3: ( ruleEString )
            // InternalMyDsl.g:8405:4: ruleEString
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getVpcVPCEStringParserRuleCall_14_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getVpcVPCEStringParserRuleCall_14_0_1()); 

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getVpcVPCCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__VpcAssignment_14"


    // $ANTLR start "rule__ServidorAlmacenamiento__SubredAssignment_18"
    // InternalMyDsl.g:8416:1: rule__ServidorAlmacenamiento__SubredAssignment_18 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAlmacenamiento__SubredAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8420:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8421:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8421:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8422:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSubredSubredCrossReference_18_0()); 
            // InternalMyDsl.g:8423:3: ( ruleEString )
            // InternalMyDsl.g:8424:4: ruleEString
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getSubredSubredEStringParserRuleCall_18_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getSubredSubredEStringParserRuleCall_18_0_1()); 

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getSubredSubredCrossReference_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__SubredAssignment_18"


    // $ANTLR start "rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22"
    // InternalMyDsl.g:8435:1: rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8439:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8440:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8440:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8441:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getServersecuritygroupSecurityGroupCrossReference_22_0()); 
            // InternalMyDsl.g:8442:3: ( ruleEString )
            // InternalMyDsl.g:8443:4: ruleEString
            {
             before(grammarAccess.getServidorAlmacenamientoAccess().getServersecuritygroupSecurityGroupEStringParserRuleCall_22_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAlmacenamientoAccess().getServersecuritygroupSecurityGroupEStringParserRuleCall_22_0_1()); 

            }

             after(grammarAccess.getServidorAlmacenamientoAccess().getServersecuritygroupSecurityGroupCrossReference_22_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAlmacenamiento__ServersecuritygroupAssignment_22"


    // $ANTLR start "rule__Conexion__Servidor1Assignment_4"
    // InternalMyDsl.g:8454:1: rule__Conexion__Servidor1Assignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Conexion__Servidor1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8458:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8459:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8459:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8460:3: ( ruleEString )
            {
             before(grammarAccess.getConexionAccess().getServidor1ServidorCrossReference_4_0()); 
            // InternalMyDsl.g:8461:3: ( ruleEString )
            // InternalMyDsl.g:8462:4: ruleEString
            {
             before(grammarAccess.getConexionAccess().getServidor1ServidorEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConexionAccess().getServidor1ServidorEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConexionAccess().getServidor1ServidorCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Servidor1Assignment_4"


    // $ANTLR start "rule__Conexion__Servidor2Assignment_8"
    // InternalMyDsl.g:8473:1: rule__Conexion__Servidor2Assignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Conexion__Servidor2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8477:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8478:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8478:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8479:3: ( ruleEString )
            {
             before(grammarAccess.getConexionAccess().getServidor2ServidorCrossReference_8_0()); 
            // InternalMyDsl.g:8480:3: ( ruleEString )
            // InternalMyDsl.g:8481:4: ruleEString
            {
             before(grammarAccess.getConexionAccess().getServidor2ServidorEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConexionAccess().getServidor2ServidorEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getConexionAccess().getServidor2ServidorCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conexion__Servidor2Assignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000200000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000400000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000F800000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0020000000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100000000000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0040000000000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0400000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0800000000000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1000000000000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000003FF80000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000080L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});

}