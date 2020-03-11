package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_OPEN_BRACE", "RULE_EQUALS", "RULE_SEMI_COLON", "RULE_OPEN_BRACKET", "RULE_COMMA", "RULE_CLOSE_BRACKET", "RULE_CLOSE_BRACE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Infraestructura'", "'tipo'", "'login'", "'securityGroup'", "'ambientesdespliegue'", "'nombreConexion'", "'usuario'", "'contrasena'", "'accessId'", "'secret'", "'alias'", "'nombre'", "'vpc'", "'ambientes'", "'conexion'", "'description'", "'name'", "'cidr'", "'az'", "'subred'", "'Server'", "'dimension'", "'os'", "'Database'", "'STORAGE'", "'gigas'", "'servidorUno'", "'servidorDos'", "'AWS'", "'GCP'", "'DESARROLLO'", "'PRUEBAS'", "'QA'", "'PRODUCCION'", "'MICRO'", "'SMALL'", "'MEDIUM'", "'LARGE'", "'WINDOWS'", "'lINUX'", "'MAC'", "'PostgreSQL'", "'MySQL'", "'Oracle'", "'SQLServer'", "'NoSql'", "'Aurora'", "'MariaDB'", "'DocumentDB'", "'Dynamo'", "'Cassandra'", "'Redis'"
    };
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Infraestructura";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInfraestructura"
    // InternalMyDsl.g:65:1: entryRuleInfraestructura returns [EObject current=null] : iv_ruleInfraestructura= ruleInfraestructura EOF ;
    public final EObject entryRuleInfraestructura() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfraestructura = null;


        try {
            // InternalMyDsl.g:65:56: (iv_ruleInfraestructura= ruleInfraestructura EOF )
            // InternalMyDsl.g:66:2: iv_ruleInfraestructura= ruleInfraestructura EOF
            {
             newCompositeNode(grammarAccess.getInfraestructuraRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfraestructura=ruleInfraestructura();

            state._fsp--;

             current =iv_ruleInfraestructura; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfraestructura"


    // $ANTLR start "ruleInfraestructura"
    // InternalMyDsl.g:72:1: ruleInfraestructura returns [EObject current=null] : ( () otherlv_1= 'Infraestructura' ( (lv_nombreProyecto_2_0= ruleEString ) ) this_OPEN_BRACE_3= RULE_OPEN_BRACE (otherlv_4= 'tipo' this_EQUALS_5= RULE_EQUALS ( (lv_tipo_6_0= ruleProveedorServicio ) ) ) this_SEMI_COLON_7= RULE_SEMI_COLON (otherlv_8= 'login' this_EQUALS_9= RULE_EQUALS ( (lv_logins_10_0= ruleLogin ) ) ) this_SEMI_COLON_11= RULE_SEMI_COLON (otherlv_12= 'securityGroup' this_EQUALS_13= RULE_EQUALS this_OPEN_BRACKET_14= RULE_OPEN_BRACKET ( (lv_securitygroups_15_0= ruleSecurityGroup ) ) (this_COMMA_16= RULE_COMMA ( (lv_securitygroups_17_0= ruleSecurityGroup ) ) )* this_CLOSE_BRACKET_18= RULE_CLOSE_BRACKET )? this_SEMI_COLON_19= RULE_SEMI_COLON (otherlv_20= 'ambientesdespliegue' this_EQUALS_21= RULE_EQUALS this_OPEN_BRACKET_22= RULE_OPEN_BRACKET ( (lv_ambientesdesplegue_23_0= ruleAmbienteDesplegue ) ) (this_COMMA_24= RULE_COMMA ( (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue ) ) )* this_SEMI_COLON_26= RULE_SEMI_COLON this_CLOSE_BRACKET_27= RULE_CLOSE_BRACKET )? this_CLOSE_BRACE_28= RULE_CLOSE_BRACE ) ;
    public final EObject ruleInfraestructura() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OPEN_BRACE_3=null;
        Token otherlv_4=null;
        Token this_EQUALS_5=null;
        Token this_SEMI_COLON_7=null;
        Token otherlv_8=null;
        Token this_EQUALS_9=null;
        Token this_SEMI_COLON_11=null;
        Token otherlv_12=null;
        Token this_EQUALS_13=null;
        Token this_OPEN_BRACKET_14=null;
        Token this_COMMA_16=null;
        Token this_CLOSE_BRACKET_18=null;
        Token this_SEMI_COLON_19=null;
        Token otherlv_20=null;
        Token this_EQUALS_21=null;
        Token this_OPEN_BRACKET_22=null;
        Token this_COMMA_24=null;
        Token this_SEMI_COLON_26=null;
        Token this_CLOSE_BRACKET_27=null;
        Token this_CLOSE_BRACE_28=null;
        AntlrDatatypeRuleToken lv_nombreProyecto_2_0 = null;

        Enumerator lv_tipo_6_0 = null;

        EObject lv_logins_10_0 = null;

        EObject lv_securitygroups_15_0 = null;

        EObject lv_securitygroups_17_0 = null;

        EObject lv_ambientesdesplegue_23_0 = null;

        EObject lv_ambientesdesplegue_25_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'Infraestructura' ( (lv_nombreProyecto_2_0= ruleEString ) ) this_OPEN_BRACE_3= RULE_OPEN_BRACE (otherlv_4= 'tipo' this_EQUALS_5= RULE_EQUALS ( (lv_tipo_6_0= ruleProveedorServicio ) ) ) this_SEMI_COLON_7= RULE_SEMI_COLON (otherlv_8= 'login' this_EQUALS_9= RULE_EQUALS ( (lv_logins_10_0= ruleLogin ) ) ) this_SEMI_COLON_11= RULE_SEMI_COLON (otherlv_12= 'securityGroup' this_EQUALS_13= RULE_EQUALS this_OPEN_BRACKET_14= RULE_OPEN_BRACKET ( (lv_securitygroups_15_0= ruleSecurityGroup ) ) (this_COMMA_16= RULE_COMMA ( (lv_securitygroups_17_0= ruleSecurityGroup ) ) )* this_CLOSE_BRACKET_18= RULE_CLOSE_BRACKET )? this_SEMI_COLON_19= RULE_SEMI_COLON (otherlv_20= 'ambientesdespliegue' this_EQUALS_21= RULE_EQUALS this_OPEN_BRACKET_22= RULE_OPEN_BRACKET ( (lv_ambientesdesplegue_23_0= ruleAmbienteDesplegue ) ) (this_COMMA_24= RULE_COMMA ( (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue ) ) )* this_SEMI_COLON_26= RULE_SEMI_COLON this_CLOSE_BRACKET_27= RULE_CLOSE_BRACKET )? this_CLOSE_BRACE_28= RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Infraestructura' ( (lv_nombreProyecto_2_0= ruleEString ) ) this_OPEN_BRACE_3= RULE_OPEN_BRACE (otherlv_4= 'tipo' this_EQUALS_5= RULE_EQUALS ( (lv_tipo_6_0= ruleProveedorServicio ) ) ) this_SEMI_COLON_7= RULE_SEMI_COLON (otherlv_8= 'login' this_EQUALS_9= RULE_EQUALS ( (lv_logins_10_0= ruleLogin ) ) ) this_SEMI_COLON_11= RULE_SEMI_COLON (otherlv_12= 'securityGroup' this_EQUALS_13= RULE_EQUALS this_OPEN_BRACKET_14= RULE_OPEN_BRACKET ( (lv_securitygroups_15_0= ruleSecurityGroup ) ) (this_COMMA_16= RULE_COMMA ( (lv_securitygroups_17_0= ruleSecurityGroup ) ) )* this_CLOSE_BRACKET_18= RULE_CLOSE_BRACKET )? this_SEMI_COLON_19= RULE_SEMI_COLON (otherlv_20= 'ambientesdespliegue' this_EQUALS_21= RULE_EQUALS this_OPEN_BRACKET_22= RULE_OPEN_BRACKET ( (lv_ambientesdesplegue_23_0= ruleAmbienteDesplegue ) ) (this_COMMA_24= RULE_COMMA ( (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue ) ) )* this_SEMI_COLON_26= RULE_SEMI_COLON this_CLOSE_BRACKET_27= RULE_CLOSE_BRACKET )? this_CLOSE_BRACE_28= RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Infraestructura' ( (lv_nombreProyecto_2_0= ruleEString ) ) this_OPEN_BRACE_3= RULE_OPEN_BRACE (otherlv_4= 'tipo' this_EQUALS_5= RULE_EQUALS ( (lv_tipo_6_0= ruleProveedorServicio ) ) ) this_SEMI_COLON_7= RULE_SEMI_COLON (otherlv_8= 'login' this_EQUALS_9= RULE_EQUALS ( (lv_logins_10_0= ruleLogin ) ) ) this_SEMI_COLON_11= RULE_SEMI_COLON (otherlv_12= 'securityGroup' this_EQUALS_13= RULE_EQUALS this_OPEN_BRACKET_14= RULE_OPEN_BRACKET ( (lv_securitygroups_15_0= ruleSecurityGroup ) ) (this_COMMA_16= RULE_COMMA ( (lv_securitygroups_17_0= ruleSecurityGroup ) ) )* this_CLOSE_BRACKET_18= RULE_CLOSE_BRACKET )? this_SEMI_COLON_19= RULE_SEMI_COLON (otherlv_20= 'ambientesdespliegue' this_EQUALS_21= RULE_EQUALS this_OPEN_BRACKET_22= RULE_OPEN_BRACKET ( (lv_ambientesdesplegue_23_0= ruleAmbienteDesplegue ) ) (this_COMMA_24= RULE_COMMA ( (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue ) ) )* this_SEMI_COLON_26= RULE_SEMI_COLON this_CLOSE_BRACKET_27= RULE_CLOSE_BRACKET )? this_CLOSE_BRACE_28= RULE_CLOSE_BRACE )
            // InternalMyDsl.g:80:3: () otherlv_1= 'Infraestructura' ( (lv_nombreProyecto_2_0= ruleEString ) ) this_OPEN_BRACE_3= RULE_OPEN_BRACE (otherlv_4= 'tipo' this_EQUALS_5= RULE_EQUALS ( (lv_tipo_6_0= ruleProveedorServicio ) ) ) this_SEMI_COLON_7= RULE_SEMI_COLON (otherlv_8= 'login' this_EQUALS_9= RULE_EQUALS ( (lv_logins_10_0= ruleLogin ) ) ) this_SEMI_COLON_11= RULE_SEMI_COLON (otherlv_12= 'securityGroup' this_EQUALS_13= RULE_EQUALS this_OPEN_BRACKET_14= RULE_OPEN_BRACKET ( (lv_securitygroups_15_0= ruleSecurityGroup ) ) (this_COMMA_16= RULE_COMMA ( (lv_securitygroups_17_0= ruleSecurityGroup ) ) )* this_CLOSE_BRACKET_18= RULE_CLOSE_BRACKET )? this_SEMI_COLON_19= RULE_SEMI_COLON (otherlv_20= 'ambientesdespliegue' this_EQUALS_21= RULE_EQUALS this_OPEN_BRACKET_22= RULE_OPEN_BRACKET ( (lv_ambientesdesplegue_23_0= ruleAmbienteDesplegue ) ) (this_COMMA_24= RULE_COMMA ( (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue ) ) )* this_SEMI_COLON_26= RULE_SEMI_COLON this_CLOSE_BRACKET_27= RULE_CLOSE_BRACKET )? this_CLOSE_BRACE_28= RULE_CLOSE_BRACE
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfraestructuraAccess().getInfraestructuraAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInfraestructuraAccess().getInfraestructuraKeyword_1());
            		
            // InternalMyDsl.g:91:3: ( (lv_nombreProyecto_2_0= ruleEString ) )
            // InternalMyDsl.g:92:4: (lv_nombreProyecto_2_0= ruleEString )
            {
            // InternalMyDsl.g:92:4: (lv_nombreProyecto_2_0= ruleEString )
            // InternalMyDsl.g:93:5: lv_nombreProyecto_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInfraestructuraAccess().getNombreProyectoEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_nombreProyecto_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfraestructuraRule());
            					}
            					set(
            						current,
            						"nombreProyecto",
            						lv_nombreProyecto_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_OPEN_BRACE_3=(Token)match(input,RULE_OPEN_BRACE,FOLLOW_5); 

            			newLeafNode(this_OPEN_BRACE_3, grammarAccess.getInfraestructuraAccess().getOPEN_BRACETerminalRuleCall_3());
            		
            // InternalMyDsl.g:114:3: (otherlv_4= 'tipo' this_EQUALS_5= RULE_EQUALS ( (lv_tipo_6_0= ruleProveedorServicio ) ) )
            // InternalMyDsl.g:115:4: otherlv_4= 'tipo' this_EQUALS_5= RULE_EQUALS ( (lv_tipo_6_0= ruleProveedorServicio ) )
            {
            otherlv_4=(Token)match(input,19,FOLLOW_6); 

            				newLeafNode(otherlv_4, grammarAccess.getInfraestructuraAccess().getTipoKeyword_4_0());
            			
            this_EQUALS_5=(Token)match(input,RULE_EQUALS,FOLLOW_7); 

            				newLeafNode(this_EQUALS_5, grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_4_1());
            			
            // InternalMyDsl.g:123:4: ( (lv_tipo_6_0= ruleProveedorServicio ) )
            // InternalMyDsl.g:124:5: (lv_tipo_6_0= ruleProveedorServicio )
            {
            // InternalMyDsl.g:124:5: (lv_tipo_6_0= ruleProveedorServicio )
            // InternalMyDsl.g:125:6: lv_tipo_6_0= ruleProveedorServicio
            {

            						newCompositeNode(grammarAccess.getInfraestructuraAccess().getTipoProveedorServicioEnumRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_8);
            lv_tipo_6_0=ruleProveedorServicio();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getInfraestructuraRule());
            						}
            						set(
            							current,
            							"tipo",
            							lv_tipo_6_0,
            							"org.xtext.example.mydsl.MyDsl.ProveedorServicio");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_SEMI_COLON_7=(Token)match(input,RULE_SEMI_COLON,FOLLOW_9); 

            			newLeafNode(this_SEMI_COLON_7, grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:147:3: (otherlv_8= 'login' this_EQUALS_9= RULE_EQUALS ( (lv_logins_10_0= ruleLogin ) ) )
            // InternalMyDsl.g:148:4: otherlv_8= 'login' this_EQUALS_9= RULE_EQUALS ( (lv_logins_10_0= ruleLogin ) )
            {
            otherlv_8=(Token)match(input,20,FOLLOW_6); 

            				newLeafNode(otherlv_8, grammarAccess.getInfraestructuraAccess().getLoginKeyword_6_0());
            			
            this_EQUALS_9=(Token)match(input,RULE_EQUALS,FOLLOW_4); 

            				newLeafNode(this_EQUALS_9, grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_6_1());
            			
            // InternalMyDsl.g:156:4: ( (lv_logins_10_0= ruleLogin ) )
            // InternalMyDsl.g:157:5: (lv_logins_10_0= ruleLogin )
            {
            // InternalMyDsl.g:157:5: (lv_logins_10_0= ruleLogin )
            // InternalMyDsl.g:158:6: lv_logins_10_0= ruleLogin
            {

            						newCompositeNode(grammarAccess.getInfraestructuraAccess().getLoginsLoginParserRuleCall_6_2_0());
            					
            pushFollow(FOLLOW_8);
            lv_logins_10_0=ruleLogin();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getInfraestructuraRule());
            						}
            						set(
            							current,
            							"logins",
            							lv_logins_10_0,
            							"org.xtext.example.mydsl.MyDsl.Login");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_SEMI_COLON_11=(Token)match(input,RULE_SEMI_COLON,FOLLOW_10); 

            			newLeafNode(this_SEMI_COLON_11, grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_7());
            		
            // InternalMyDsl.g:180:3: (otherlv_12= 'securityGroup' this_EQUALS_13= RULE_EQUALS this_OPEN_BRACKET_14= RULE_OPEN_BRACKET ( (lv_securitygroups_15_0= ruleSecurityGroup ) ) (this_COMMA_16= RULE_COMMA ( (lv_securitygroups_17_0= ruleSecurityGroup ) ) )* this_CLOSE_BRACKET_18= RULE_CLOSE_BRACKET )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:181:4: otherlv_12= 'securityGroup' this_EQUALS_13= RULE_EQUALS this_OPEN_BRACKET_14= RULE_OPEN_BRACKET ( (lv_securitygroups_15_0= ruleSecurityGroup ) ) (this_COMMA_16= RULE_COMMA ( (lv_securitygroups_17_0= ruleSecurityGroup ) ) )* this_CLOSE_BRACKET_18= RULE_CLOSE_BRACKET
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getInfraestructuraAccess().getSecurityGroupKeyword_8_0());
                    			
                    this_EQUALS_13=(Token)match(input,RULE_EQUALS,FOLLOW_11); 

                    				newLeafNode(this_EQUALS_13, grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_8_1());
                    			
                    this_OPEN_BRACKET_14=(Token)match(input,RULE_OPEN_BRACKET,FOLLOW_4); 

                    				newLeafNode(this_OPEN_BRACKET_14, grammarAccess.getInfraestructuraAccess().getOPEN_BRACKETTerminalRuleCall_8_2());
                    			
                    // InternalMyDsl.g:193:4: ( (lv_securitygroups_15_0= ruleSecurityGroup ) )
                    // InternalMyDsl.g:194:5: (lv_securitygroups_15_0= ruleSecurityGroup )
                    {
                    // InternalMyDsl.g:194:5: (lv_securitygroups_15_0= ruleSecurityGroup )
                    // InternalMyDsl.g:195:6: lv_securitygroups_15_0= ruleSecurityGroup
                    {

                    						newCompositeNode(grammarAccess.getInfraestructuraAccess().getSecuritygroupsSecurityGroupParserRuleCall_8_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_securitygroups_15_0=ruleSecurityGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInfraestructuraRule());
                    						}
                    						add(
                    							current,
                    							"securitygroups",
                    							lv_securitygroups_15_0,
                    							"org.xtext.example.mydsl.MyDsl.SecurityGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:212:4: (this_COMMA_16= RULE_COMMA ( (lv_securitygroups_17_0= ruleSecurityGroup ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_COMMA) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:213:5: this_COMMA_16= RULE_COMMA ( (lv_securitygroups_17_0= ruleSecurityGroup ) )
                    	    {
                    	    this_COMMA_16=(Token)match(input,RULE_COMMA,FOLLOW_4); 

                    	    					newLeafNode(this_COMMA_16, grammarAccess.getInfraestructuraAccess().getCOMMATerminalRuleCall_8_4_0());
                    	    				
                    	    // InternalMyDsl.g:217:5: ( (lv_securitygroups_17_0= ruleSecurityGroup ) )
                    	    // InternalMyDsl.g:218:6: (lv_securitygroups_17_0= ruleSecurityGroup )
                    	    {
                    	    // InternalMyDsl.g:218:6: (lv_securitygroups_17_0= ruleSecurityGroup )
                    	    // InternalMyDsl.g:219:7: lv_securitygroups_17_0= ruleSecurityGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfraestructuraAccess().getSecuritygroupsSecurityGroupParserRuleCall_8_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_securitygroups_17_0=ruleSecurityGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfraestructuraRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"securitygroups",
                    	    								lv_securitygroups_17_0,
                    	    								"org.xtext.example.mydsl.MyDsl.SecurityGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    this_CLOSE_BRACKET_18=(Token)match(input,RULE_CLOSE_BRACKET,FOLLOW_8); 

                    				newLeafNode(this_CLOSE_BRACKET_18, grammarAccess.getInfraestructuraAccess().getCLOSE_BRACKETTerminalRuleCall_8_5());
                    			

                    }
                    break;

            }

            this_SEMI_COLON_19=(Token)match(input,RULE_SEMI_COLON,FOLLOW_13); 

            			newLeafNode(this_SEMI_COLON_19, grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_9());
            		
            // InternalMyDsl.g:246:3: (otherlv_20= 'ambientesdespliegue' this_EQUALS_21= RULE_EQUALS this_OPEN_BRACKET_22= RULE_OPEN_BRACKET ( (lv_ambientesdesplegue_23_0= ruleAmbienteDesplegue ) ) (this_COMMA_24= RULE_COMMA ( (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue ) ) )* this_SEMI_COLON_26= RULE_SEMI_COLON this_CLOSE_BRACKET_27= RULE_CLOSE_BRACKET )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:247:4: otherlv_20= 'ambientesdespliegue' this_EQUALS_21= RULE_EQUALS this_OPEN_BRACKET_22= RULE_OPEN_BRACKET ( (lv_ambientesdesplegue_23_0= ruleAmbienteDesplegue ) ) (this_COMMA_24= RULE_COMMA ( (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue ) ) )* this_SEMI_COLON_26= RULE_SEMI_COLON this_CLOSE_BRACKET_27= RULE_CLOSE_BRACKET
                    {
                    otherlv_20=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_20, grammarAccess.getInfraestructuraAccess().getAmbientesdespliegueKeyword_10_0());
                    			
                    this_EQUALS_21=(Token)match(input,RULE_EQUALS,FOLLOW_11); 

                    				newLeafNode(this_EQUALS_21, grammarAccess.getInfraestructuraAccess().getEQUALSTerminalRuleCall_10_1());
                    			
                    this_OPEN_BRACKET_22=(Token)match(input,RULE_OPEN_BRACKET,FOLLOW_4); 

                    				newLeafNode(this_OPEN_BRACKET_22, grammarAccess.getInfraestructuraAccess().getOPEN_BRACKETTerminalRuleCall_10_2());
                    			
                    // InternalMyDsl.g:259:4: ( (lv_ambientesdesplegue_23_0= ruleAmbienteDesplegue ) )
                    // InternalMyDsl.g:260:5: (lv_ambientesdesplegue_23_0= ruleAmbienteDesplegue )
                    {
                    // InternalMyDsl.g:260:5: (lv_ambientesdesplegue_23_0= ruleAmbienteDesplegue )
                    // InternalMyDsl.g:261:6: lv_ambientesdesplegue_23_0= ruleAmbienteDesplegue
                    {

                    						newCompositeNode(grammarAccess.getInfraestructuraAccess().getAmbientesdesplegueAmbienteDesplegueParserRuleCall_10_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_ambientesdesplegue_23_0=ruleAmbienteDesplegue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInfraestructuraRule());
                    						}
                    						add(
                    							current,
                    							"ambientesdesplegue",
                    							lv_ambientesdesplegue_23_0,
                    							"org.xtext.example.mydsl.MyDsl.AmbienteDesplegue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:278:4: (this_COMMA_24= RULE_COMMA ( (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_COMMA) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:279:5: this_COMMA_24= RULE_COMMA ( (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue ) )
                    	    {
                    	    this_COMMA_24=(Token)match(input,RULE_COMMA,FOLLOW_4); 

                    	    					newLeafNode(this_COMMA_24, grammarAccess.getInfraestructuraAccess().getCOMMATerminalRuleCall_10_4_0());
                    	    				
                    	    // InternalMyDsl.g:283:5: ( (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue ) )
                    	    // InternalMyDsl.g:284:6: (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue )
                    	    {
                    	    // InternalMyDsl.g:284:6: (lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue )
                    	    // InternalMyDsl.g:285:7: lv_ambientesdesplegue_25_0= ruleAmbienteDesplegue
                    	    {

                    	    							newCompositeNode(grammarAccess.getInfraestructuraAccess().getAmbientesdesplegueAmbienteDesplegueParserRuleCall_10_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_ambientesdesplegue_25_0=ruleAmbienteDesplegue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getInfraestructuraRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ambientesdesplegue",
                    	    								lv_ambientesdesplegue_25_0,
                    	    								"org.xtext.example.mydsl.MyDsl.AmbienteDesplegue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    this_SEMI_COLON_26=(Token)match(input,RULE_SEMI_COLON,FOLLOW_15); 

                    				newLeafNode(this_SEMI_COLON_26, grammarAccess.getInfraestructuraAccess().getSEMI_COLONTerminalRuleCall_10_5());
                    			
                    this_CLOSE_BRACKET_27=(Token)match(input,RULE_CLOSE_BRACKET,FOLLOW_16); 

                    				newLeafNode(this_CLOSE_BRACKET_27, grammarAccess.getInfraestructuraAccess().getCLOSE_BRACKETTerminalRuleCall_10_6());
                    			

                    }
                    break;

            }

            this_CLOSE_BRACE_28=(Token)match(input,RULE_CLOSE_BRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_BRACE_28, grammarAccess.getInfraestructuraAccess().getCLOSE_BRACETerminalRuleCall_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfraestructura"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:320:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:320:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:321:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:327:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:333:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:334:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:334:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:335:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:343:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleLogin"
    // InternalMyDsl.g:354:1: entryRuleLogin returns [EObject current=null] : iv_ruleLogin= ruleLogin EOF ;
    public final EObject entryRuleLogin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogin = null;


        try {
            // InternalMyDsl.g:354:46: (iv_ruleLogin= ruleLogin EOF )
            // InternalMyDsl.g:355:2: iv_ruleLogin= ruleLogin EOF
            {
             newCompositeNode(grammarAccess.getLoginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogin=ruleLogin();

            state._fsp--;

             current =iv_ruleLogin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogin"


    // $ANTLR start "ruleLogin"
    // InternalMyDsl.g:361:1: ruleLogin returns [EObject current=null] : ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'nombreConexion' this_EQUALS_3= RULE_EQUALS ( (lv_nombreConexion_4_0= ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON )? (otherlv_6= 'usuario' this_EQUALS_7= RULE_EQUALS ( (lv_usuario_8_0= ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON )? (otherlv_10= 'contrasena' this_EQUALS_11= RULE_EQUALS ( (lv_contrasena_12_0= ruleEString ) ) this_SEMI_COLON_13= RULE_SEMI_COLON )? (otherlv_14= 'accessId' this_EQUALS_15= RULE_EQUALS ( (lv_accessId_16_0= ruleEString ) ) this_SEMI_COLON_17= RULE_SEMI_COLON )? (otherlv_18= 'secret' this_EQUALS_19= RULE_EQUALS ( (lv_secret_20_0= ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON )? this_CLOSE_BRACE_22= RULE_CLOSE_BRACE ) ;
    public final EObject ruleLogin() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_BRACE_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMI_COLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMI_COLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMI_COLON_13=null;
        Token otherlv_14=null;
        Token this_EQUALS_15=null;
        Token this_SEMI_COLON_17=null;
        Token otherlv_18=null;
        Token this_EQUALS_19=null;
        Token this_SEMI_COLON_21=null;
        Token this_CLOSE_BRACE_22=null;
        AntlrDatatypeRuleToken lv_nombreConexion_4_0 = null;

        AntlrDatatypeRuleToken lv_usuario_8_0 = null;

        AntlrDatatypeRuleToken lv_contrasena_12_0 = null;

        AntlrDatatypeRuleToken lv_accessId_16_0 = null;

        AntlrDatatypeRuleToken lv_secret_20_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:367:2: ( ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'nombreConexion' this_EQUALS_3= RULE_EQUALS ( (lv_nombreConexion_4_0= ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON )? (otherlv_6= 'usuario' this_EQUALS_7= RULE_EQUALS ( (lv_usuario_8_0= ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON )? (otherlv_10= 'contrasena' this_EQUALS_11= RULE_EQUALS ( (lv_contrasena_12_0= ruleEString ) ) this_SEMI_COLON_13= RULE_SEMI_COLON )? (otherlv_14= 'accessId' this_EQUALS_15= RULE_EQUALS ( (lv_accessId_16_0= ruleEString ) ) this_SEMI_COLON_17= RULE_SEMI_COLON )? (otherlv_18= 'secret' this_EQUALS_19= RULE_EQUALS ( (lv_secret_20_0= ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON )? this_CLOSE_BRACE_22= RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:368:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'nombreConexion' this_EQUALS_3= RULE_EQUALS ( (lv_nombreConexion_4_0= ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON )? (otherlv_6= 'usuario' this_EQUALS_7= RULE_EQUALS ( (lv_usuario_8_0= ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON )? (otherlv_10= 'contrasena' this_EQUALS_11= RULE_EQUALS ( (lv_contrasena_12_0= ruleEString ) ) this_SEMI_COLON_13= RULE_SEMI_COLON )? (otherlv_14= 'accessId' this_EQUALS_15= RULE_EQUALS ( (lv_accessId_16_0= ruleEString ) ) this_SEMI_COLON_17= RULE_SEMI_COLON )? (otherlv_18= 'secret' this_EQUALS_19= RULE_EQUALS ( (lv_secret_20_0= ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON )? this_CLOSE_BRACE_22= RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:368:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'nombreConexion' this_EQUALS_3= RULE_EQUALS ( (lv_nombreConexion_4_0= ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON )? (otherlv_6= 'usuario' this_EQUALS_7= RULE_EQUALS ( (lv_usuario_8_0= ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON )? (otherlv_10= 'contrasena' this_EQUALS_11= RULE_EQUALS ( (lv_contrasena_12_0= ruleEString ) ) this_SEMI_COLON_13= RULE_SEMI_COLON )? (otherlv_14= 'accessId' this_EQUALS_15= RULE_EQUALS ( (lv_accessId_16_0= ruleEString ) ) this_SEMI_COLON_17= RULE_SEMI_COLON )? (otherlv_18= 'secret' this_EQUALS_19= RULE_EQUALS ( (lv_secret_20_0= ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON )? this_CLOSE_BRACE_22= RULE_CLOSE_BRACE )
            // InternalMyDsl.g:369:3: () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'nombreConexion' this_EQUALS_3= RULE_EQUALS ( (lv_nombreConexion_4_0= ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON )? (otherlv_6= 'usuario' this_EQUALS_7= RULE_EQUALS ( (lv_usuario_8_0= ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON )? (otherlv_10= 'contrasena' this_EQUALS_11= RULE_EQUALS ( (lv_contrasena_12_0= ruleEString ) ) this_SEMI_COLON_13= RULE_SEMI_COLON )? (otherlv_14= 'accessId' this_EQUALS_15= RULE_EQUALS ( (lv_accessId_16_0= ruleEString ) ) this_SEMI_COLON_17= RULE_SEMI_COLON )? (otherlv_18= 'secret' this_EQUALS_19= RULE_EQUALS ( (lv_secret_20_0= ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON )? this_CLOSE_BRACE_22= RULE_CLOSE_BRACE
            {
            // InternalMyDsl.g:369:3: ()
            // InternalMyDsl.g:370:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoginAccess().getLoginAction_0(),
            					current);
            			

            }

            this_OPEN_BRACE_1=(Token)match(input,RULE_OPEN_BRACE,FOLLOW_17); 

            			newLeafNode(this_OPEN_BRACE_1, grammarAccess.getLoginAccess().getOPEN_BRACETerminalRuleCall_1());
            		
            // InternalMyDsl.g:380:3: (otherlv_2= 'nombreConexion' this_EQUALS_3= RULE_EQUALS ( (lv_nombreConexion_4_0= ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:381:4: otherlv_2= 'nombreConexion' this_EQUALS_3= RULE_EQUALS ( (lv_nombreConexion_4_0= ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getLoginAccess().getNombreConexionKeyword_2_0());
                    			
                    this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_3, grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_2_1());
                    			
                    // InternalMyDsl.g:389:4: ( (lv_nombreConexion_4_0= ruleEString ) )
                    // InternalMyDsl.g:390:5: (lv_nombreConexion_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:390:5: (lv_nombreConexion_4_0= ruleEString )
                    // InternalMyDsl.g:391:6: lv_nombreConexion_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoginAccess().getNombreConexionEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_nombreConexion_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoginRule());
                    						}
                    						set(
                    							current,
                    							"nombreConexion",
                    							lv_nombreConexion_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMI_COLON_5=(Token)match(input,RULE_SEMI_COLON,FOLLOW_18); 

                    				newLeafNode(this_SEMI_COLON_5, grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_2_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:413:3: (otherlv_6= 'usuario' this_EQUALS_7= RULE_EQUALS ( (lv_usuario_8_0= ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:414:4: otherlv_6= 'usuario' this_EQUALS_7= RULE_EQUALS ( (lv_usuario_8_0= ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoginAccess().getUsuarioKeyword_3_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_3_1());
                    			
                    // InternalMyDsl.g:422:4: ( (lv_usuario_8_0= ruleEString ) )
                    // InternalMyDsl.g:423:5: (lv_usuario_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:423:5: (lv_usuario_8_0= ruleEString )
                    // InternalMyDsl.g:424:6: lv_usuario_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoginAccess().getUsuarioEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_usuario_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoginRule());
                    						}
                    						set(
                    							current,
                    							"usuario",
                    							lv_usuario_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMI_COLON_9=(Token)match(input,RULE_SEMI_COLON,FOLLOW_19); 

                    				newLeafNode(this_SEMI_COLON_9, grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_3_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:446:3: (otherlv_10= 'contrasena' this_EQUALS_11= RULE_EQUALS ( (lv_contrasena_12_0= ruleEString ) ) this_SEMI_COLON_13= RULE_SEMI_COLON )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:447:4: otherlv_10= 'contrasena' this_EQUALS_11= RULE_EQUALS ( (lv_contrasena_12_0= ruleEString ) ) this_SEMI_COLON_13= RULE_SEMI_COLON
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getLoginAccess().getContrasenaKeyword_4_0());
                    			
                    this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_11, grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_4_1());
                    			
                    // InternalMyDsl.g:455:4: ( (lv_contrasena_12_0= ruleEString ) )
                    // InternalMyDsl.g:456:5: (lv_contrasena_12_0= ruleEString )
                    {
                    // InternalMyDsl.g:456:5: (lv_contrasena_12_0= ruleEString )
                    // InternalMyDsl.g:457:6: lv_contrasena_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoginAccess().getContrasenaEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_contrasena_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoginRule());
                    						}
                    						set(
                    							current,
                    							"contrasena",
                    							lv_contrasena_12_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMI_COLON_13=(Token)match(input,RULE_SEMI_COLON,FOLLOW_20); 

                    				newLeafNode(this_SEMI_COLON_13, grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:479:3: (otherlv_14= 'accessId' this_EQUALS_15= RULE_EQUALS ( (lv_accessId_16_0= ruleEString ) ) this_SEMI_COLON_17= RULE_SEMI_COLON )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:480:4: otherlv_14= 'accessId' this_EQUALS_15= RULE_EQUALS ( (lv_accessId_16_0= ruleEString ) ) this_SEMI_COLON_17= RULE_SEMI_COLON
                    {
                    otherlv_14=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getLoginAccess().getAccessIdKeyword_5_0());
                    			
                    this_EQUALS_15=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_15, grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_5_1());
                    			
                    // InternalMyDsl.g:488:4: ( (lv_accessId_16_0= ruleEString ) )
                    // InternalMyDsl.g:489:5: (lv_accessId_16_0= ruleEString )
                    {
                    // InternalMyDsl.g:489:5: (lv_accessId_16_0= ruleEString )
                    // InternalMyDsl.g:490:6: lv_accessId_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoginAccess().getAccessIdEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_accessId_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoginRule());
                    						}
                    						set(
                    							current,
                    							"accessId",
                    							lv_accessId_16_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMI_COLON_17=(Token)match(input,RULE_SEMI_COLON,FOLLOW_21); 

                    				newLeafNode(this_SEMI_COLON_17, grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:512:3: (otherlv_18= 'secret' this_EQUALS_19= RULE_EQUALS ( (lv_secret_20_0= ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:513:4: otherlv_18= 'secret' this_EQUALS_19= RULE_EQUALS ( (lv_secret_20_0= ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON
                    {
                    otherlv_18=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getLoginAccess().getSecretKeyword_6_0());
                    			
                    this_EQUALS_19=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_19, grammarAccess.getLoginAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:521:4: ( (lv_secret_20_0= ruleEString ) )
                    // InternalMyDsl.g:522:5: (lv_secret_20_0= ruleEString )
                    {
                    // InternalMyDsl.g:522:5: (lv_secret_20_0= ruleEString )
                    // InternalMyDsl.g:523:6: lv_secret_20_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLoginAccess().getSecretEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_secret_20_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoginRule());
                    						}
                    						set(
                    							current,
                    							"secret",
                    							lv_secret_20_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SEMI_COLON_21=(Token)match(input,RULE_SEMI_COLON,FOLLOW_16); 

                    				newLeafNode(this_SEMI_COLON_21, grammarAccess.getLoginAccess().getSEMI_COLONTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            this_CLOSE_BRACE_22=(Token)match(input,RULE_CLOSE_BRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_BRACE_22, grammarAccess.getLoginAccess().getCLOSE_BRACETerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogin"


    // $ANTLR start "entryRuleAmbienteDesplegue"
    // InternalMyDsl.g:553:1: entryRuleAmbienteDesplegue returns [EObject current=null] : iv_ruleAmbienteDesplegue= ruleAmbienteDesplegue EOF ;
    public final EObject entryRuleAmbienteDesplegue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmbienteDesplegue = null;


        try {
            // InternalMyDsl.g:553:58: (iv_ruleAmbienteDesplegue= ruleAmbienteDesplegue EOF )
            // InternalMyDsl.g:554:2: iv_ruleAmbienteDesplegue= ruleAmbienteDesplegue EOF
            {
             newCompositeNode(grammarAccess.getAmbienteDesplegueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmbienteDesplegue=ruleAmbienteDesplegue();

            state._fsp--;

             current =iv_ruleAmbienteDesplegue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAmbienteDesplegue"


    // $ANTLR start "ruleAmbienteDesplegue"
    // InternalMyDsl.g:560:1: ruleAmbienteDesplegue returns [EObject current=null] : ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'alias' this_EQUALS_3= RULE_EQUALS ( (lv_alias_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_tipoAmbiente_8_0= ruleAmbiente ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'vpc' this_EQUALS_11= RULE_EQUALS this_OPEN_BRACKET_12= RULE_OPEN_BRACKET ( (lv_vpc_13_0= ruleVPC ) ) (this_COMMA_14= RULE_COMMA ( (lv_vpc_15_0= ruleVPC ) ) )* this_CLOSE_BRACKET_16= RULE_CLOSE_BRACKET ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'ambientes' this_EQUALS_19= RULE_EQUALS this_OPEN_BRACKET_20= RULE_OPEN_BRACKET ( (lv_servidores_21_0= ruleServidor ) ) (this_COMMA_22= RULE_COMMA ( (lv_servidores_23_0= ruleServidor ) ) )* this_CLOSE_BRACKET_24= RULE_CLOSE_BRACKET this_SEMI_COLON_25= RULE_SEMI_COLON (otherlv_26= 'conexion' this_EQUALS_27= RULE_EQUALS this_OPEN_BRACKET_28= RULE_OPEN_BRACKET ( (lv_conexion_29_0= ruleConexion ) ) (this_COMMA_30= RULE_COMMA ( (lv_conexion_31_0= ruleConexion ) ) )* this_CLOSE_BRACKET_32= RULE_CLOSE_BRACKET this_SEMI_COLON_33= RULE_SEMI_COLON )? this_CLOSE_BRACE_34= RULE_CLOSE_BRACE ) ;
    public final EObject ruleAmbienteDesplegue() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_BRACE_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMI_COLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMI_COLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_OPEN_BRACKET_12=null;
        Token this_COMMA_14=null;
        Token this_CLOSE_BRACKET_16=null;
        Token this_SEMI_COLON_17=null;
        Token otherlv_18=null;
        Token this_EQUALS_19=null;
        Token this_OPEN_BRACKET_20=null;
        Token this_COMMA_22=null;
        Token this_CLOSE_BRACKET_24=null;
        Token this_SEMI_COLON_25=null;
        Token otherlv_26=null;
        Token this_EQUALS_27=null;
        Token this_OPEN_BRACKET_28=null;
        Token this_COMMA_30=null;
        Token this_CLOSE_BRACKET_32=null;
        Token this_SEMI_COLON_33=null;
        Token this_CLOSE_BRACE_34=null;
        AntlrDatatypeRuleToken lv_alias_4_0 = null;

        Enumerator lv_tipoAmbiente_8_0 = null;

        EObject lv_vpc_13_0 = null;

        EObject lv_vpc_15_0 = null;

        EObject lv_servidores_21_0 = null;

        EObject lv_servidores_23_0 = null;

        EObject lv_conexion_29_0 = null;

        EObject lv_conexion_31_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:566:2: ( ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'alias' this_EQUALS_3= RULE_EQUALS ( (lv_alias_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_tipoAmbiente_8_0= ruleAmbiente ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'vpc' this_EQUALS_11= RULE_EQUALS this_OPEN_BRACKET_12= RULE_OPEN_BRACKET ( (lv_vpc_13_0= ruleVPC ) ) (this_COMMA_14= RULE_COMMA ( (lv_vpc_15_0= ruleVPC ) ) )* this_CLOSE_BRACKET_16= RULE_CLOSE_BRACKET ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'ambientes' this_EQUALS_19= RULE_EQUALS this_OPEN_BRACKET_20= RULE_OPEN_BRACKET ( (lv_servidores_21_0= ruleServidor ) ) (this_COMMA_22= RULE_COMMA ( (lv_servidores_23_0= ruleServidor ) ) )* this_CLOSE_BRACKET_24= RULE_CLOSE_BRACKET this_SEMI_COLON_25= RULE_SEMI_COLON (otherlv_26= 'conexion' this_EQUALS_27= RULE_EQUALS this_OPEN_BRACKET_28= RULE_OPEN_BRACKET ( (lv_conexion_29_0= ruleConexion ) ) (this_COMMA_30= RULE_COMMA ( (lv_conexion_31_0= ruleConexion ) ) )* this_CLOSE_BRACKET_32= RULE_CLOSE_BRACKET this_SEMI_COLON_33= RULE_SEMI_COLON )? this_CLOSE_BRACE_34= RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:567:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'alias' this_EQUALS_3= RULE_EQUALS ( (lv_alias_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_tipoAmbiente_8_0= ruleAmbiente ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'vpc' this_EQUALS_11= RULE_EQUALS this_OPEN_BRACKET_12= RULE_OPEN_BRACKET ( (lv_vpc_13_0= ruleVPC ) ) (this_COMMA_14= RULE_COMMA ( (lv_vpc_15_0= ruleVPC ) ) )* this_CLOSE_BRACKET_16= RULE_CLOSE_BRACKET ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'ambientes' this_EQUALS_19= RULE_EQUALS this_OPEN_BRACKET_20= RULE_OPEN_BRACKET ( (lv_servidores_21_0= ruleServidor ) ) (this_COMMA_22= RULE_COMMA ( (lv_servidores_23_0= ruleServidor ) ) )* this_CLOSE_BRACKET_24= RULE_CLOSE_BRACKET this_SEMI_COLON_25= RULE_SEMI_COLON (otherlv_26= 'conexion' this_EQUALS_27= RULE_EQUALS this_OPEN_BRACKET_28= RULE_OPEN_BRACKET ( (lv_conexion_29_0= ruleConexion ) ) (this_COMMA_30= RULE_COMMA ( (lv_conexion_31_0= ruleConexion ) ) )* this_CLOSE_BRACKET_32= RULE_CLOSE_BRACKET this_SEMI_COLON_33= RULE_SEMI_COLON )? this_CLOSE_BRACE_34= RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:567:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'alias' this_EQUALS_3= RULE_EQUALS ( (lv_alias_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_tipoAmbiente_8_0= ruleAmbiente ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'vpc' this_EQUALS_11= RULE_EQUALS this_OPEN_BRACKET_12= RULE_OPEN_BRACKET ( (lv_vpc_13_0= ruleVPC ) ) (this_COMMA_14= RULE_COMMA ( (lv_vpc_15_0= ruleVPC ) ) )* this_CLOSE_BRACKET_16= RULE_CLOSE_BRACKET ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'ambientes' this_EQUALS_19= RULE_EQUALS this_OPEN_BRACKET_20= RULE_OPEN_BRACKET ( (lv_servidores_21_0= ruleServidor ) ) (this_COMMA_22= RULE_COMMA ( (lv_servidores_23_0= ruleServidor ) ) )* this_CLOSE_BRACKET_24= RULE_CLOSE_BRACKET this_SEMI_COLON_25= RULE_SEMI_COLON (otherlv_26= 'conexion' this_EQUALS_27= RULE_EQUALS this_OPEN_BRACKET_28= RULE_OPEN_BRACKET ( (lv_conexion_29_0= ruleConexion ) ) (this_COMMA_30= RULE_COMMA ( (lv_conexion_31_0= ruleConexion ) ) )* this_CLOSE_BRACKET_32= RULE_CLOSE_BRACKET this_SEMI_COLON_33= RULE_SEMI_COLON )? this_CLOSE_BRACE_34= RULE_CLOSE_BRACE )
            // InternalMyDsl.g:568:3: () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'alias' this_EQUALS_3= RULE_EQUALS ( (lv_alias_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_tipoAmbiente_8_0= ruleAmbiente ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'vpc' this_EQUALS_11= RULE_EQUALS this_OPEN_BRACKET_12= RULE_OPEN_BRACKET ( (lv_vpc_13_0= ruleVPC ) ) (this_COMMA_14= RULE_COMMA ( (lv_vpc_15_0= ruleVPC ) ) )* this_CLOSE_BRACKET_16= RULE_CLOSE_BRACKET ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'ambientes' this_EQUALS_19= RULE_EQUALS this_OPEN_BRACKET_20= RULE_OPEN_BRACKET ( (lv_servidores_21_0= ruleServidor ) ) (this_COMMA_22= RULE_COMMA ( (lv_servidores_23_0= ruleServidor ) ) )* this_CLOSE_BRACKET_24= RULE_CLOSE_BRACKET this_SEMI_COLON_25= RULE_SEMI_COLON (otherlv_26= 'conexion' this_EQUALS_27= RULE_EQUALS this_OPEN_BRACKET_28= RULE_OPEN_BRACKET ( (lv_conexion_29_0= ruleConexion ) ) (this_COMMA_30= RULE_COMMA ( (lv_conexion_31_0= ruleConexion ) ) )* this_CLOSE_BRACKET_32= RULE_CLOSE_BRACKET this_SEMI_COLON_33= RULE_SEMI_COLON )? this_CLOSE_BRACE_34= RULE_CLOSE_BRACE
            {
            // InternalMyDsl.g:568:3: ()
            // InternalMyDsl.g:569:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAmbienteDesplegueAccess().getAmbienteDesplegueAction_0(),
            					current);
            			

            }

            this_OPEN_BRACE_1=(Token)match(input,RULE_OPEN_BRACE,FOLLOW_22); 

            			newLeafNode(this_OPEN_BRACE_1, grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACETerminalRuleCall_1());
            		
            // InternalMyDsl.g:579:3: (otherlv_2= 'alias' this_EQUALS_3= RULE_EQUALS ( (lv_alias_4_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:580:4: otherlv_2= 'alias' this_EQUALS_3= RULE_EQUALS ( (lv_alias_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getAmbienteDesplegueAccess().getAliasKeyword_2_0());
                    			
                    this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_3, grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_2_1());
                    			
                    // InternalMyDsl.g:588:4: ( (lv_alias_4_0= ruleEString ) )
                    // InternalMyDsl.g:589:5: (lv_alias_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:589:5: (lv_alias_4_0= ruleEString )
                    // InternalMyDsl.g:590:6: lv_alias_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAmbienteDesplegueAccess().getAliasEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_alias_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmbienteDesplegueRule());
                    						}
                    						set(
                    							current,
                    							"alias",
                    							lv_alias_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMI_COLON_5=(Token)match(input,RULE_SEMI_COLON,FOLLOW_23); 

            			newLeafNode(this_SEMI_COLON_5, grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_3());
            		
            // InternalMyDsl.g:612:3: (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_tipoAmbiente_8_0= ruleAmbiente ) ) )
            // InternalMyDsl.g:613:4: otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_tipoAmbiente_8_0= ruleAmbiente ) )
            {
            otherlv_6=(Token)match(input,29,FOLLOW_6); 

            				newLeafNode(otherlv_6, grammarAccess.getAmbienteDesplegueAccess().getNombreKeyword_4_0());
            			
            this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_24); 

            				newLeafNode(this_EQUALS_7, grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_4_1());
            			
            // InternalMyDsl.g:621:4: ( (lv_tipoAmbiente_8_0= ruleAmbiente ) )
            // InternalMyDsl.g:622:5: (lv_tipoAmbiente_8_0= ruleAmbiente )
            {
            // InternalMyDsl.g:622:5: (lv_tipoAmbiente_8_0= ruleAmbiente )
            // InternalMyDsl.g:623:6: lv_tipoAmbiente_8_0= ruleAmbiente
            {

            						newCompositeNode(grammarAccess.getAmbienteDesplegueAccess().getTipoAmbienteAmbienteEnumRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_8);
            lv_tipoAmbiente_8_0=ruleAmbiente();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAmbienteDesplegueRule());
            						}
            						set(
            							current,
            							"tipoAmbiente",
            							lv_tipoAmbiente_8_0,
            							"org.xtext.example.mydsl.MyDsl.Ambiente");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_SEMI_COLON_9=(Token)match(input,RULE_SEMI_COLON,FOLLOW_25); 

            			newLeafNode(this_SEMI_COLON_9, grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:645:3: (otherlv_10= 'vpc' this_EQUALS_11= RULE_EQUALS this_OPEN_BRACKET_12= RULE_OPEN_BRACKET ( (lv_vpc_13_0= ruleVPC ) ) (this_COMMA_14= RULE_COMMA ( (lv_vpc_15_0= ruleVPC ) ) )* this_CLOSE_BRACKET_16= RULE_CLOSE_BRACKET )
            // InternalMyDsl.g:646:4: otherlv_10= 'vpc' this_EQUALS_11= RULE_EQUALS this_OPEN_BRACKET_12= RULE_OPEN_BRACKET ( (lv_vpc_13_0= ruleVPC ) ) (this_COMMA_14= RULE_COMMA ( (lv_vpc_15_0= ruleVPC ) ) )* this_CLOSE_BRACKET_16= RULE_CLOSE_BRACKET
            {
            otherlv_10=(Token)match(input,30,FOLLOW_6); 

            				newLeafNode(otherlv_10, grammarAccess.getAmbienteDesplegueAccess().getVpcKeyword_6_0());
            			
            this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_11); 

            				newLeafNode(this_EQUALS_11, grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_6_1());
            			
            this_OPEN_BRACKET_12=(Token)match(input,RULE_OPEN_BRACKET,FOLLOW_4); 

            				newLeafNode(this_OPEN_BRACKET_12, grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACKETTerminalRuleCall_6_2());
            			
            // InternalMyDsl.g:658:4: ( (lv_vpc_13_0= ruleVPC ) )
            // InternalMyDsl.g:659:5: (lv_vpc_13_0= ruleVPC )
            {
            // InternalMyDsl.g:659:5: (lv_vpc_13_0= ruleVPC )
            // InternalMyDsl.g:660:6: lv_vpc_13_0= ruleVPC
            {

            						newCompositeNode(grammarAccess.getAmbienteDesplegueAccess().getVpcVPCParserRuleCall_6_3_0());
            					
            pushFollow(FOLLOW_12);
            lv_vpc_13_0=ruleVPC();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAmbienteDesplegueRule());
            						}
            						add(
            							current,
            							"vpc",
            							lv_vpc_13_0,
            							"org.xtext.example.mydsl.MyDsl.VPC");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMyDsl.g:677:4: (this_COMMA_14= RULE_COMMA ( (lv_vpc_15_0= ruleVPC ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:678:5: this_COMMA_14= RULE_COMMA ( (lv_vpc_15_0= ruleVPC ) )
            	    {
            	    this_COMMA_14=(Token)match(input,RULE_COMMA,FOLLOW_4); 

            	    					newLeafNode(this_COMMA_14, grammarAccess.getAmbienteDesplegueAccess().getCOMMATerminalRuleCall_6_4_0());
            	    				
            	    // InternalMyDsl.g:682:5: ( (lv_vpc_15_0= ruleVPC ) )
            	    // InternalMyDsl.g:683:6: (lv_vpc_15_0= ruleVPC )
            	    {
            	    // InternalMyDsl.g:683:6: (lv_vpc_15_0= ruleVPC )
            	    // InternalMyDsl.g:684:7: lv_vpc_15_0= ruleVPC
            	    {

            	    							newCompositeNode(grammarAccess.getAmbienteDesplegueAccess().getVpcVPCParserRuleCall_6_4_1_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_vpc_15_0=ruleVPC();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getAmbienteDesplegueRule());
            	    							}
            	    							add(
            	    								current,
            	    								"vpc",
            	    								lv_vpc_15_0,
            	    								"org.xtext.example.mydsl.MyDsl.VPC");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            this_CLOSE_BRACKET_16=(Token)match(input,RULE_CLOSE_BRACKET,FOLLOW_8); 

            				newLeafNode(this_CLOSE_BRACKET_16, grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACKETTerminalRuleCall_6_5());
            			

            }

            this_SEMI_COLON_17=(Token)match(input,RULE_SEMI_COLON,FOLLOW_26); 

            			newLeafNode(this_SEMI_COLON_17, grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_7());
            		
            otherlv_18=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_18, grammarAccess.getAmbienteDesplegueAccess().getAmbientesKeyword_8());
            		
            this_EQUALS_19=(Token)match(input,RULE_EQUALS,FOLLOW_11); 

            			newLeafNode(this_EQUALS_19, grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_9());
            		
            this_OPEN_BRACKET_20=(Token)match(input,RULE_OPEN_BRACKET,FOLLOW_4); 

            			newLeafNode(this_OPEN_BRACKET_20, grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACKETTerminalRuleCall_10());
            		
            // InternalMyDsl.g:723:3: ( (lv_servidores_21_0= ruleServidor ) )
            // InternalMyDsl.g:724:4: (lv_servidores_21_0= ruleServidor )
            {
            // InternalMyDsl.g:724:4: (lv_servidores_21_0= ruleServidor )
            // InternalMyDsl.g:725:5: lv_servidores_21_0= ruleServidor
            {

            					newCompositeNode(grammarAccess.getAmbienteDesplegueAccess().getServidoresServidorParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_servidores_21_0=ruleServidor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAmbienteDesplegueRule());
            					}
            					add(
            						current,
            						"servidores",
            						lv_servidores_21_0,
            						"org.xtext.example.mydsl.MyDsl.Servidor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:742:3: (this_COMMA_22= RULE_COMMA ( (lv_servidores_23_0= ruleServidor ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:743:4: this_COMMA_22= RULE_COMMA ( (lv_servidores_23_0= ruleServidor ) )
            	    {
            	    this_COMMA_22=(Token)match(input,RULE_COMMA,FOLLOW_4); 

            	    				newLeafNode(this_COMMA_22, grammarAccess.getAmbienteDesplegueAccess().getCOMMATerminalRuleCall_12_0());
            	    			
            	    // InternalMyDsl.g:747:4: ( (lv_servidores_23_0= ruleServidor ) )
            	    // InternalMyDsl.g:748:5: (lv_servidores_23_0= ruleServidor )
            	    {
            	    // InternalMyDsl.g:748:5: (lv_servidores_23_0= ruleServidor )
            	    // InternalMyDsl.g:749:6: lv_servidores_23_0= ruleServidor
            	    {

            	    						newCompositeNode(grammarAccess.getAmbienteDesplegueAccess().getServidoresServidorParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_servidores_23_0=ruleServidor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAmbienteDesplegueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"servidores",
            	    							lv_servidores_23_0,
            	    							"org.xtext.example.mydsl.MyDsl.Servidor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            this_CLOSE_BRACKET_24=(Token)match(input,RULE_CLOSE_BRACKET,FOLLOW_8); 

            			newLeafNode(this_CLOSE_BRACKET_24, grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACKETTerminalRuleCall_13());
            		
            this_SEMI_COLON_25=(Token)match(input,RULE_SEMI_COLON,FOLLOW_27); 

            			newLeafNode(this_SEMI_COLON_25, grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_14());
            		
            // InternalMyDsl.g:775:3: (otherlv_26= 'conexion' this_EQUALS_27= RULE_EQUALS this_OPEN_BRACKET_28= RULE_OPEN_BRACKET ( (lv_conexion_29_0= ruleConexion ) ) (this_COMMA_30= RULE_COMMA ( (lv_conexion_31_0= ruleConexion ) ) )* this_CLOSE_BRACKET_32= RULE_CLOSE_BRACKET this_SEMI_COLON_33= RULE_SEMI_COLON )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:776:4: otherlv_26= 'conexion' this_EQUALS_27= RULE_EQUALS this_OPEN_BRACKET_28= RULE_OPEN_BRACKET ( (lv_conexion_29_0= ruleConexion ) ) (this_COMMA_30= RULE_COMMA ( (lv_conexion_31_0= ruleConexion ) ) )* this_CLOSE_BRACKET_32= RULE_CLOSE_BRACKET this_SEMI_COLON_33= RULE_SEMI_COLON
                    {
                    otherlv_26=(Token)match(input,32,FOLLOW_6); 

                    				newLeafNode(otherlv_26, grammarAccess.getAmbienteDesplegueAccess().getConexionKeyword_15_0());
                    			
                    this_EQUALS_27=(Token)match(input,RULE_EQUALS,FOLLOW_11); 

                    				newLeafNode(this_EQUALS_27, grammarAccess.getAmbienteDesplegueAccess().getEQUALSTerminalRuleCall_15_1());
                    			
                    this_OPEN_BRACKET_28=(Token)match(input,RULE_OPEN_BRACKET,FOLLOW_4); 

                    				newLeafNode(this_OPEN_BRACKET_28, grammarAccess.getAmbienteDesplegueAccess().getOPEN_BRACKETTerminalRuleCall_15_2());
                    			
                    // InternalMyDsl.g:788:4: ( (lv_conexion_29_0= ruleConexion ) )
                    // InternalMyDsl.g:789:5: (lv_conexion_29_0= ruleConexion )
                    {
                    // InternalMyDsl.g:789:5: (lv_conexion_29_0= ruleConexion )
                    // InternalMyDsl.g:790:6: lv_conexion_29_0= ruleConexion
                    {

                    						newCompositeNode(grammarAccess.getAmbienteDesplegueAccess().getConexionConexionParserRuleCall_15_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_conexion_29_0=ruleConexion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmbienteDesplegueRule());
                    						}
                    						add(
                    							current,
                    							"conexion",
                    							lv_conexion_29_0,
                    							"org.xtext.example.mydsl.MyDsl.Conexion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:807:4: (this_COMMA_30= RULE_COMMA ( (lv_conexion_31_0= ruleConexion ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:808:5: this_COMMA_30= RULE_COMMA ( (lv_conexion_31_0= ruleConexion ) )
                    	    {
                    	    this_COMMA_30=(Token)match(input,RULE_COMMA,FOLLOW_4); 

                    	    					newLeafNode(this_COMMA_30, grammarAccess.getAmbienteDesplegueAccess().getCOMMATerminalRuleCall_15_4_0());
                    	    				
                    	    // InternalMyDsl.g:812:5: ( (lv_conexion_31_0= ruleConexion ) )
                    	    // InternalMyDsl.g:813:6: (lv_conexion_31_0= ruleConexion )
                    	    {
                    	    // InternalMyDsl.g:813:6: (lv_conexion_31_0= ruleConexion )
                    	    // InternalMyDsl.g:814:7: lv_conexion_31_0= ruleConexion
                    	    {

                    	    							newCompositeNode(grammarAccess.getAmbienteDesplegueAccess().getConexionConexionParserRuleCall_15_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_conexion_31_0=ruleConexion();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAmbienteDesplegueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"conexion",
                    	    								lv_conexion_31_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Conexion");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    this_CLOSE_BRACKET_32=(Token)match(input,RULE_CLOSE_BRACKET,FOLLOW_8); 

                    				newLeafNode(this_CLOSE_BRACKET_32, grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACKETTerminalRuleCall_15_5());
                    			
                    this_SEMI_COLON_33=(Token)match(input,RULE_SEMI_COLON,FOLLOW_16); 

                    				newLeafNode(this_SEMI_COLON_33, grammarAccess.getAmbienteDesplegueAccess().getSEMI_COLONTerminalRuleCall_15_6());
                    			

                    }
                    break;

            }

            this_CLOSE_BRACE_34=(Token)match(input,RULE_CLOSE_BRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_BRACE_34, grammarAccess.getAmbienteDesplegueAccess().getCLOSE_BRACETerminalRuleCall_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmbienteDesplegue"


    // $ANTLR start "entryRuleSecurityGroup"
    // InternalMyDsl.g:849:1: entryRuleSecurityGroup returns [EObject current=null] : iv_ruleSecurityGroup= ruleSecurityGroup EOF ;
    public final EObject entryRuleSecurityGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecurityGroup = null;


        try {
            // InternalMyDsl.g:849:54: (iv_ruleSecurityGroup= ruleSecurityGroup EOF )
            // InternalMyDsl.g:850:2: iv_ruleSecurityGroup= ruleSecurityGroup EOF
            {
             newCompositeNode(grammarAccess.getSecurityGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecurityGroup=ruleSecurityGroup();

            state._fsp--;

             current =iv_ruleSecurityGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecurityGroup"


    // $ANTLR start "ruleSecurityGroup"
    // InternalMyDsl.g:856:1: ruleSecurityGroup returns [EObject current=null] : ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'nombre' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'description' this_EQUALS_7= RULE_EQUALS ( (lv_description_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE ) ;
    public final EObject ruleSecurityGroup() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_BRACE_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMI_COLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMI_COLON_9=null;
        Token this_CLOSE_BRACE_10=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:862:2: ( ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'nombre' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'description' this_EQUALS_7= RULE_EQUALS ( (lv_description_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:863:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'nombre' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'description' this_EQUALS_7= RULE_EQUALS ( (lv_description_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:863:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'nombre' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'description' this_EQUALS_7= RULE_EQUALS ( (lv_description_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE )
            // InternalMyDsl.g:864:3: () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'nombre' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'description' this_EQUALS_7= RULE_EQUALS ( (lv_description_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE
            {
            // InternalMyDsl.g:864:3: ()
            // InternalMyDsl.g:865:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecurityGroupAccess().getSecurityGroupAction_0(),
            					current);
            			

            }

            this_OPEN_BRACE_1=(Token)match(input,RULE_OPEN_BRACE,FOLLOW_28); 

            			newLeafNode(this_OPEN_BRACE_1, grammarAccess.getSecurityGroupAccess().getOPEN_BRACETerminalRuleCall_1());
            		
            // InternalMyDsl.g:875:3: (otherlv_2= 'nombre' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:876:4: otherlv_2= 'nombre' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getSecurityGroupAccess().getNombreKeyword_2_0());
                    			
                    this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_3, grammarAccess.getSecurityGroupAccess().getEQUALSTerminalRuleCall_2_1());
                    			
                    // InternalMyDsl.g:884:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalMyDsl.g:885:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:885:5: (lv_name_4_0= ruleEString )
                    // InternalMyDsl.g:886:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSecurityGroupAccess().getNameEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSecurityGroupRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMI_COLON_5=(Token)match(input,RULE_SEMI_COLON,FOLLOW_29); 

            			newLeafNode(this_SEMI_COLON_5, grammarAccess.getSecurityGroupAccess().getSEMI_COLONTerminalRuleCall_3());
            		
            // InternalMyDsl.g:908:3: (otherlv_6= 'description' this_EQUALS_7= RULE_EQUALS ( (lv_description_8_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:909:4: otherlv_6= 'description' this_EQUALS_7= RULE_EQUALS ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getSecurityGroupAccess().getDescriptionKeyword_4_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getSecurityGroupAccess().getEQUALSTerminalRuleCall_4_1());
                    			
                    // InternalMyDsl.g:917:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalMyDsl.g:918:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:918:5: (lv_description_8_0= ruleEString )
                    // InternalMyDsl.g:919:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSecurityGroupAccess().getDescriptionEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSecurityGroupRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMI_COLON_9=(Token)match(input,RULE_SEMI_COLON,FOLLOW_16); 

            			newLeafNode(this_SEMI_COLON_9, grammarAccess.getSecurityGroupAccess().getSEMI_COLONTerminalRuleCall_5());
            		
            this_CLOSE_BRACE_10=(Token)match(input,RULE_CLOSE_BRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_BRACE_10, grammarAccess.getSecurityGroupAccess().getCLOSE_BRACETerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecurityGroup"


    // $ANTLR start "entryRuleSubred"
    // InternalMyDsl.g:949:1: entryRuleSubred returns [EObject current=null] : iv_ruleSubred= ruleSubred EOF ;
    public final EObject entryRuleSubred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubred = null;


        try {
            // InternalMyDsl.g:949:47: (iv_ruleSubred= ruleSubred EOF )
            // InternalMyDsl.g:950:2: iv_ruleSubred= ruleSubred EOF
            {
             newCompositeNode(grammarAccess.getSubredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubred=ruleSubred();

            state._fsp--;

             current =iv_ruleSubred; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubred"


    // $ANTLR start "ruleSubred"
    // InternalMyDsl.g:956:1: ruleSubred returns [EObject current=null] : ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'cidr' this_EQUALS_7= RULE_EQUALS ( (lv_cidr_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'az' this_EQUALS_11= RULE_EQUALS ( (lv_az_12_0= ruleEString ) ) )? this_SEMI_COLON_13= RULE_SEMI_COLON this_CLOSE_BRACE_14= RULE_CLOSE_BRACE ) ;
    public final EObject ruleSubred() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_BRACE_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMI_COLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMI_COLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMI_COLON_13=null;
        Token this_CLOSE_BRACE_14=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_cidr_8_0 = null;

        AntlrDatatypeRuleToken lv_az_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:962:2: ( ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'cidr' this_EQUALS_7= RULE_EQUALS ( (lv_cidr_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'az' this_EQUALS_11= RULE_EQUALS ( (lv_az_12_0= ruleEString ) ) )? this_SEMI_COLON_13= RULE_SEMI_COLON this_CLOSE_BRACE_14= RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:963:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'cidr' this_EQUALS_7= RULE_EQUALS ( (lv_cidr_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'az' this_EQUALS_11= RULE_EQUALS ( (lv_az_12_0= ruleEString ) ) )? this_SEMI_COLON_13= RULE_SEMI_COLON this_CLOSE_BRACE_14= RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:963:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'cidr' this_EQUALS_7= RULE_EQUALS ( (lv_cidr_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'az' this_EQUALS_11= RULE_EQUALS ( (lv_az_12_0= ruleEString ) ) )? this_SEMI_COLON_13= RULE_SEMI_COLON this_CLOSE_BRACE_14= RULE_CLOSE_BRACE )
            // InternalMyDsl.g:964:3: () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'cidr' this_EQUALS_7= RULE_EQUALS ( (lv_cidr_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'az' this_EQUALS_11= RULE_EQUALS ( (lv_az_12_0= ruleEString ) ) )? this_SEMI_COLON_13= RULE_SEMI_COLON this_CLOSE_BRACE_14= RULE_CLOSE_BRACE
            {
            // InternalMyDsl.g:964:3: ()
            // InternalMyDsl.g:965:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubredAccess().getSubredAction_0(),
            					current);
            			

            }

            this_OPEN_BRACE_1=(Token)match(input,RULE_OPEN_BRACE,FOLLOW_30); 

            			newLeafNode(this_OPEN_BRACE_1, grammarAccess.getSubredAccess().getOPEN_BRACETerminalRuleCall_1());
            		
            // InternalMyDsl.g:975:3: (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:976:4: otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubredAccess().getNameKeyword_2_0());
                    			
                    this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_3, grammarAccess.getSubredAccess().getEQUALSTerminalRuleCall_2_1());
                    			
                    // InternalMyDsl.g:984:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalMyDsl.g:985:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:985:5: (lv_name_4_0= ruleEString )
                    // InternalMyDsl.g:986:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getNameEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMI_COLON_5=(Token)match(input,RULE_SEMI_COLON,FOLLOW_31); 

            			newLeafNode(this_SEMI_COLON_5, grammarAccess.getSubredAccess().getSEMI_COLONTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1008:3: (otherlv_6= 'cidr' this_EQUALS_7= RULE_EQUALS ( (lv_cidr_8_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1009:4: otherlv_6= 'cidr' this_EQUALS_7= RULE_EQUALS ( (lv_cidr_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubredAccess().getCidrKeyword_4_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getSubredAccess().getEQUALSTerminalRuleCall_4_1());
                    			
                    // InternalMyDsl.g:1017:4: ( (lv_cidr_8_0= ruleEString ) )
                    // InternalMyDsl.g:1018:5: (lv_cidr_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:1018:5: (lv_cidr_8_0= ruleEString )
                    // InternalMyDsl.g:1019:6: lv_cidr_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getCidrEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_cidr_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"cidr",
                    							lv_cidr_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMI_COLON_9=(Token)match(input,RULE_SEMI_COLON,FOLLOW_32); 

            			newLeafNode(this_SEMI_COLON_9, grammarAccess.getSubredAccess().getSEMI_COLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:1041:3: (otherlv_10= 'az' this_EQUALS_11= RULE_EQUALS ( (lv_az_12_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1042:4: otherlv_10= 'az' this_EQUALS_11= RULE_EQUALS ( (lv_az_12_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getSubredAccess().getAzKeyword_6_0());
                    			
                    this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_11, grammarAccess.getSubredAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:1050:4: ( (lv_az_12_0= ruleEString ) )
                    // InternalMyDsl.g:1051:5: (lv_az_12_0= ruleEString )
                    {
                    // InternalMyDsl.g:1051:5: (lv_az_12_0= ruleEString )
                    // InternalMyDsl.g:1052:6: lv_az_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getAzEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_az_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"az",
                    							lv_az_12_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMI_COLON_13=(Token)match(input,RULE_SEMI_COLON,FOLLOW_16); 

            			newLeafNode(this_SEMI_COLON_13, grammarAccess.getSubredAccess().getSEMI_COLONTerminalRuleCall_7());
            		
            this_CLOSE_BRACE_14=(Token)match(input,RULE_CLOSE_BRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_BRACE_14, grammarAccess.getSubredAccess().getCLOSE_BRACETerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubred"


    // $ANTLR start "entryRuleVPC"
    // InternalMyDsl.g:1082:1: entryRuleVPC returns [EObject current=null] : iv_ruleVPC= ruleVPC EOF ;
    public final EObject entryRuleVPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVPC = null;


        try {
            // InternalMyDsl.g:1082:44: (iv_ruleVPC= ruleVPC EOF )
            // InternalMyDsl.g:1083:2: iv_ruleVPC= ruleVPC EOF
            {
             newCompositeNode(grammarAccess.getVPCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVPC=ruleVPC();

            state._fsp--;

             current =iv_ruleVPC; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVPC"


    // $ANTLR start "ruleVPC"
    // InternalMyDsl.g:1089:1: ruleVPC returns [EObject current=null] : ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'subred' this_EQUALS_7= RULE_EQUALS ( (lv_subred_8_0= ruleSubred ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE ) ;
    public final EObject ruleVPC() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_BRACE_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMI_COLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMI_COLON_9=null;
        Token this_CLOSE_BRACE_10=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_subred_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1095:2: ( ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'subred' this_EQUALS_7= RULE_EQUALS ( (lv_subred_8_0= ruleSubred ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:1096:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'subred' this_EQUALS_7= RULE_EQUALS ( (lv_subred_8_0= ruleSubred ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:1096:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'subred' this_EQUALS_7= RULE_EQUALS ( (lv_subred_8_0= ruleSubred ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE )
            // InternalMyDsl.g:1097:3: () this_OPEN_BRACE_1= RULE_OPEN_BRACE (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )? this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'subred' this_EQUALS_7= RULE_EQUALS ( (lv_subred_8_0= ruleSubred ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE
            {
            // InternalMyDsl.g:1097:3: ()
            // InternalMyDsl.g:1098:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVPCAccess().getVPCAction_0(),
            					current);
            			

            }

            this_OPEN_BRACE_1=(Token)match(input,RULE_OPEN_BRACE,FOLLOW_30); 

            			newLeafNode(this_OPEN_BRACE_1, grammarAccess.getVPCAccess().getOPEN_BRACETerminalRuleCall_1());
            		
            // InternalMyDsl.g:1108:3: (otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1109:4: otherlv_2= 'name' this_EQUALS_3= RULE_EQUALS ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getVPCAccess().getNameKeyword_2_0());
                    			
                    this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_3, grammarAccess.getVPCAccess().getEQUALSTerminalRuleCall_2_1());
                    			
                    // InternalMyDsl.g:1117:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalMyDsl.g:1118:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:1118:5: (lv_name_4_0= ruleEString )
                    // InternalMyDsl.g:1119:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVPCAccess().getNameEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVPCRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMI_COLON_5=(Token)match(input,RULE_SEMI_COLON,FOLLOW_33); 

            			newLeafNode(this_SEMI_COLON_5, grammarAccess.getVPCAccess().getSEMI_COLONTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1141:3: (otherlv_6= 'subred' this_EQUALS_7= RULE_EQUALS ( (lv_subred_8_0= ruleSubred ) ) )
            // InternalMyDsl.g:1142:4: otherlv_6= 'subred' this_EQUALS_7= RULE_EQUALS ( (lv_subred_8_0= ruleSubred ) )
            {
            otherlv_6=(Token)match(input,37,FOLLOW_6); 

            				newLeafNode(otherlv_6, grammarAccess.getVPCAccess().getSubredKeyword_4_0());
            			
            this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_4); 

            				newLeafNode(this_EQUALS_7, grammarAccess.getVPCAccess().getEQUALSTerminalRuleCall_4_1());
            			
            // InternalMyDsl.g:1150:4: ( (lv_subred_8_0= ruleSubred ) )
            // InternalMyDsl.g:1151:5: (lv_subred_8_0= ruleSubred )
            {
            // InternalMyDsl.g:1151:5: (lv_subred_8_0= ruleSubred )
            // InternalMyDsl.g:1152:6: lv_subred_8_0= ruleSubred
            {

            						newCompositeNode(grammarAccess.getVPCAccess().getSubredSubredParserRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_8);
            lv_subred_8_0=ruleSubred();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVPCRule());
            						}
            						add(
            							current,
            							"subred",
            							lv_subred_8_0,
            							"org.xtext.example.mydsl.MyDsl.Subred");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_SEMI_COLON_9=(Token)match(input,RULE_SEMI_COLON,FOLLOW_16); 

            			newLeafNode(this_SEMI_COLON_9, grammarAccess.getVPCAccess().getSEMI_COLONTerminalRuleCall_5());
            		
            this_CLOSE_BRACE_10=(Token)match(input,RULE_CLOSE_BRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_BRACE_10, grammarAccess.getVPCAccess().getCLOSE_BRACETerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVPC"


    // $ANTLR start "entryRuleServidor"
    // InternalMyDsl.g:1182:1: entryRuleServidor returns [EObject current=null] : iv_ruleServidor= ruleServidor EOF ;
    public final EObject entryRuleServidor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidor = null;


        try {
            // InternalMyDsl.g:1182:49: (iv_ruleServidor= ruleServidor EOF )
            // InternalMyDsl.g:1183:2: iv_ruleServidor= ruleServidor EOF
            {
             newCompositeNode(grammarAccess.getServidorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidor=ruleServidor();

            state._fsp--;

             current =iv_ruleServidor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidor"


    // $ANTLR start "ruleServidor"
    // InternalMyDsl.g:1189:1: ruleServidor returns [EObject current=null] : (this_ServidorAplicacion_0= ruleServidorAplicacion | this_ServidorBaseDeDatos_1= ruleServidorBaseDeDatos | this_ServidorAlmacenamiento_2= ruleServidorAlmacenamiento ) ;
    public final EObject ruleServidor() throws RecognitionException {
        EObject current = null;

        EObject this_ServidorAplicacion_0 = null;

        EObject this_ServidorBaseDeDatos_1 = null;

        EObject this_ServidorAlmacenamiento_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1195:2: ( (this_ServidorAplicacion_0= ruleServidorAplicacion | this_ServidorBaseDeDatos_1= ruleServidorBaseDeDatos | this_ServidorAlmacenamiento_2= ruleServidorAlmacenamiento ) )
            // InternalMyDsl.g:1196:2: (this_ServidorAplicacion_0= ruleServidorAplicacion | this_ServidorBaseDeDatos_1= ruleServidorBaseDeDatos | this_ServidorAlmacenamiento_2= ruleServidorAlmacenamiento )
            {
            // InternalMyDsl.g:1196:2: (this_ServidorAplicacion_0= ruleServidorAplicacion | this_ServidorBaseDeDatos_1= ruleServidorBaseDeDatos | this_ServidorAlmacenamiento_2= ruleServidorAlmacenamiento )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_OPEN_BRACE) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==19) ) {
                    int LA22_2 = input.LA(3);

                    if ( (LA22_2==RULE_EQUALS) ) {
                        switch ( input.LA(4) ) {
                        case 38:
                            {
                            alt22=1;
                            }
                            break;
                        case 41:
                            {
                            alt22=2;
                            }
                            break;
                        case 42:
                            {
                            alt22=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1197:3: this_ServidorAplicacion_0= ruleServidorAplicacion
                    {

                    			newCompositeNode(grammarAccess.getServidorAccess().getServidorAplicacionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServidorAplicacion_0=ruleServidorAplicacion();

                    state._fsp--;


                    			current = this_ServidorAplicacion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1206:3: this_ServidorBaseDeDatos_1= ruleServidorBaseDeDatos
                    {

                    			newCompositeNode(grammarAccess.getServidorAccess().getServidorBaseDeDatosParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServidorBaseDeDatos_1=ruleServidorBaseDeDatos();

                    state._fsp--;


                    			current = this_ServidorBaseDeDatos_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1215:3: this_ServidorAlmacenamiento_2= ruleServidorAlmacenamiento
                    {

                    			newCompositeNode(grammarAccess.getServidorAccess().getServidorAlmacenamientoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServidorAlmacenamiento_2=ruleServidorAlmacenamiento();

                    state._fsp--;


                    			current = this_ServidorAlmacenamiento_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidor"


    // $ANTLR start "entryRuleServidorAplicacion"
    // InternalMyDsl.g:1227:1: entryRuleServidorAplicacion returns [EObject current=null] : iv_ruleServidorAplicacion= ruleServidorAplicacion EOF ;
    public final EObject entryRuleServidorAplicacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidorAplicacion = null;


        try {
            // InternalMyDsl.g:1227:59: (iv_ruleServidorAplicacion= ruleServidorAplicacion EOF )
            // InternalMyDsl.g:1228:2: iv_ruleServidorAplicacion= ruleServidorAplicacion EOF
            {
             newCompositeNode(grammarAccess.getServidorAplicacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidorAplicacion=ruleServidorAplicacion();

            state._fsp--;

             current =iv_ruleServidorAplicacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidorAplicacion"


    // $ANTLR start "ruleServidorAplicacion"
    // InternalMyDsl.g:1234:1: ruleServidorAplicacion returns [EObject current=null] : ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'Server' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) ) this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'os' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaO_16_0= ruleSistemaOperativo ) ) ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE ) ;
    public final EObject ruleServidorAplicacion() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_BRACE_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token otherlv_4=null;
        Token this_SEMI_COLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMI_COLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMI_COLON_13=null;
        Token otherlv_14=null;
        Token this_EQUALS_15=null;
        Token this_SEMI_COLON_17=null;
        Token otherlv_18=null;
        Token this_EQUALS_19=null;
        Token this_SEMI_COLON_21=null;
        Token otherlv_22=null;
        Token this_EQUALS_23=null;
        Token this_SEMI_COLON_25=null;
        Token otherlv_26=null;
        Token this_EQUALS_27=null;
        Token this_SEMI_COLON_29=null;
        Token this_CLOSE_BRACE_30=null;
        AntlrDatatypeRuleToken lv_nombre_8_0 = null;

        Enumerator lv_TamanoM_12_0 = null;

        Enumerator lv_sistemaO_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1240:2: ( ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'Server' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) ) this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'os' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaO_16_0= ruleSistemaOperativo ) ) ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:1241:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'Server' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) ) this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'os' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaO_16_0= ruleSistemaOperativo ) ) ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:1241:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'Server' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) ) this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'os' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaO_16_0= ruleSistemaOperativo ) ) ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE )
            // InternalMyDsl.g:1242:3: () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'Server' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) ) this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) ) this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'os' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaO_16_0= ruleSistemaOperativo ) ) ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE
            {
            // InternalMyDsl.g:1242:3: ()
            // InternalMyDsl.g:1243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServidorAplicacionAccess().getServidorAplicacionAction_0(),
            					current);
            			

            }

            this_OPEN_BRACE_1=(Token)match(input,RULE_OPEN_BRACE,FOLLOW_5); 

            			newLeafNode(this_OPEN_BRACE_1, grammarAccess.getServidorAplicacionAccess().getOPEN_BRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getServidorAplicacionAccess().getTipoKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_34); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getServidorAplicacionAccess().getServerKeyword_4());
            		
            this_SEMI_COLON_5=(Token)match(input,RULE_SEMI_COLON,FOLLOW_23); 

            			newLeafNode(this_SEMI_COLON_5, grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:1269:3: (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )
            // InternalMyDsl.g:1270:4: otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) )
            {
            otherlv_6=(Token)match(input,29,FOLLOW_6); 

            				newLeafNode(otherlv_6, grammarAccess.getServidorAplicacionAccess().getNombreKeyword_6_0());
            			
            this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            				newLeafNode(this_EQUALS_7, grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_6_1());
            			
            // InternalMyDsl.g:1278:4: ( (lv_nombre_8_0= ruleEString ) )
            // InternalMyDsl.g:1279:5: (lv_nombre_8_0= ruleEString )
            {
            // InternalMyDsl.g:1279:5: (lv_nombre_8_0= ruleEString )
            // InternalMyDsl.g:1280:6: lv_nombre_8_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getServidorAplicacionAccess().getNombreEStringParserRuleCall_6_2_0());
            					
            pushFollow(FOLLOW_8);
            lv_nombre_8_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServidorAplicacionRule());
            						}
            						set(
            							current,
            							"nombre",
            							lv_nombre_8_0,
            							"org.xtext.example.mydsl.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_SEMI_COLON_9=(Token)match(input,RULE_SEMI_COLON,FOLLOW_35); 

            			newLeafNode(this_SEMI_COLON_9, grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_7());
            		
            // InternalMyDsl.g:1302:3: (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) )
            // InternalMyDsl.g:1303:4: otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) )
            {
            otherlv_10=(Token)match(input,39,FOLLOW_6); 

            				newLeafNode(otherlv_10, grammarAccess.getServidorAplicacionAccess().getDimensionKeyword_8_0());
            			
            this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_36); 

            				newLeafNode(this_EQUALS_11, grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_8_1());
            			
            // InternalMyDsl.g:1311:4: ( (lv_TamanoM_12_0= ruleTamanoMaquina ) )
            // InternalMyDsl.g:1312:5: (lv_TamanoM_12_0= ruleTamanoMaquina )
            {
            // InternalMyDsl.g:1312:5: (lv_TamanoM_12_0= ruleTamanoMaquina )
            // InternalMyDsl.g:1313:6: lv_TamanoM_12_0= ruleTamanoMaquina
            {

            						newCompositeNode(grammarAccess.getServidorAplicacionAccess().getTamanoMTamanoMaquinaEnumRuleCall_8_2_0());
            					
            pushFollow(FOLLOW_8);
            lv_TamanoM_12_0=ruleTamanoMaquina();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServidorAplicacionRule());
            						}
            						set(
            							current,
            							"TamanoM",
            							lv_TamanoM_12_0,
            							"org.xtext.example.mydsl.MyDsl.TamanoMaquina");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_SEMI_COLON_13=(Token)match(input,RULE_SEMI_COLON,FOLLOW_37); 

            			newLeafNode(this_SEMI_COLON_13, grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_9());
            		
            // InternalMyDsl.g:1335:3: (otherlv_14= 'os' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaO_16_0= ruleSistemaOperativo ) ) )
            // InternalMyDsl.g:1336:4: otherlv_14= 'os' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaO_16_0= ruleSistemaOperativo ) )
            {
            otherlv_14=(Token)match(input,40,FOLLOW_6); 

            				newLeafNode(otherlv_14, grammarAccess.getServidorAplicacionAccess().getOsKeyword_10_0());
            			
            this_EQUALS_15=(Token)match(input,RULE_EQUALS,FOLLOW_38); 

            				newLeafNode(this_EQUALS_15, grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_10_1());
            			
            // InternalMyDsl.g:1344:4: ( (lv_sistemaO_16_0= ruleSistemaOperativo ) )
            // InternalMyDsl.g:1345:5: (lv_sistemaO_16_0= ruleSistemaOperativo )
            {
            // InternalMyDsl.g:1345:5: (lv_sistemaO_16_0= ruleSistemaOperativo )
            // InternalMyDsl.g:1346:6: lv_sistemaO_16_0= ruleSistemaOperativo
            {

            						newCompositeNode(grammarAccess.getServidorAplicacionAccess().getSistemaOSistemaOperativoEnumRuleCall_10_2_0());
            					
            pushFollow(FOLLOW_8);
            lv_sistemaO_16_0=ruleSistemaOperativo();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServidorAplicacionRule());
            						}
            						set(
            							current,
            							"sistemaO",
            							lv_sistemaO_16_0,
            							"org.xtext.example.mydsl.MyDsl.SistemaOperativo");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_SEMI_COLON_17=(Token)match(input,RULE_SEMI_COLON,FOLLOW_25); 

            			newLeafNode(this_SEMI_COLON_17, grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_11());
            		
            otherlv_18=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_18, grammarAccess.getServidorAplicacionAccess().getVpcKeyword_12());
            		
            this_EQUALS_19=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_19, grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_13());
            		
            // InternalMyDsl.g:1376:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1377:4: ( ruleEString )
            {
            // InternalMyDsl.g:1377:4: ( ruleEString )
            // InternalMyDsl.g:1378:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorAplicacionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServidorAplicacionAccess().getVpcVPCCrossReference_14_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMI_COLON_21=(Token)match(input,RULE_SEMI_COLON,FOLLOW_33); 

            			newLeafNode(this_SEMI_COLON_21, grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_15());
            		
            otherlv_22=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_22, grammarAccess.getServidorAplicacionAccess().getSubredKeyword_16());
            		
            this_EQUALS_23=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_23, grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_17());
            		
            // InternalMyDsl.g:1404:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1405:4: ( ruleEString )
            {
            // InternalMyDsl.g:1405:4: ( ruleEString )
            // InternalMyDsl.g:1406:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorAplicacionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServidorAplicacionAccess().getSubredSubredCrossReference_18_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMI_COLON_25=(Token)match(input,RULE_SEMI_COLON,FOLLOW_39); 

            			newLeafNode(this_SEMI_COLON_25, grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_19());
            		
            otherlv_26=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_26, grammarAccess.getServidorAplicacionAccess().getSecurityGroupKeyword_20());
            		
            this_EQUALS_27=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_27, grammarAccess.getServidorAplicacionAccess().getEQUALSTerminalRuleCall_21());
            		
            // InternalMyDsl.g:1432:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1433:4: ( ruleEString )
            {
            // InternalMyDsl.g:1433:4: ( ruleEString )
            // InternalMyDsl.g:1434:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorAplicacionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServidorAplicacionAccess().getServersecuritygroupSecurityGroupCrossReference_22_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMI_COLON_29=(Token)match(input,RULE_SEMI_COLON,FOLLOW_16); 

            			newLeafNode(this_SEMI_COLON_29, grammarAccess.getServidorAplicacionAccess().getSEMI_COLONTerminalRuleCall_23());
            		
            this_CLOSE_BRACE_30=(Token)match(input,RULE_CLOSE_BRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_BRACE_30, grammarAccess.getServidorAplicacionAccess().getCLOSE_BRACETerminalRuleCall_24());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidorAplicacion"


    // $ANTLR start "entryRuleServidorBaseDeDatos"
    // InternalMyDsl.g:1460:1: entryRuleServidorBaseDeDatos returns [EObject current=null] : iv_ruleServidorBaseDeDatos= ruleServidorBaseDeDatos EOF ;
    public final EObject entryRuleServidorBaseDeDatos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidorBaseDeDatos = null;


        try {
            // InternalMyDsl.g:1460:60: (iv_ruleServidorBaseDeDatos= ruleServidorBaseDeDatos EOF )
            // InternalMyDsl.g:1461:2: iv_ruleServidorBaseDeDatos= ruleServidorBaseDeDatos EOF
            {
             newCompositeNode(grammarAccess.getServidorBaseDeDatosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidorBaseDeDatos=ruleServidorBaseDeDatos();

            state._fsp--;

             current =iv_ruleServidorBaseDeDatos; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidorBaseDeDatos"


    // $ANTLR start "ruleServidorBaseDeDatos"
    // InternalMyDsl.g:1467:1: ruleServidorBaseDeDatos returns [EObject current=null] : ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'Database' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) ) this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'tipo' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaManejador_16_0= ruleSistemaManejador ) ) ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE ) ;
    public final EObject ruleServidorBaseDeDatos() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_BRACE_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token otherlv_4=null;
        Token this_SEMI_COLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMI_COLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMI_COLON_13=null;
        Token otherlv_14=null;
        Token this_EQUALS_15=null;
        Token this_SEMI_COLON_17=null;
        Token otherlv_18=null;
        Token this_EQUALS_19=null;
        Token this_SEMI_COLON_21=null;
        Token otherlv_22=null;
        Token this_EQUALS_23=null;
        Token this_SEMI_COLON_25=null;
        Token otherlv_26=null;
        Token this_EQUALS_27=null;
        Token this_SEMI_COLON_29=null;
        Token this_CLOSE_BRACE_30=null;
        AntlrDatatypeRuleToken lv_nombre_8_0 = null;

        Enumerator lv_TamanoM_12_0 = null;

        Enumerator lv_sistemaManejador_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1473:2: ( ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'Database' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) ) this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'tipo' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaManejador_16_0= ruleSistemaManejador ) ) ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:1474:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'Database' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) ) this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'tipo' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaManejador_16_0= ruleSistemaManejador ) ) ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:1474:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'Database' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) ) this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'tipo' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaManejador_16_0= ruleSistemaManejador ) ) ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE )
            // InternalMyDsl.g:1475:3: () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'Database' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) ) this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'tipo' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaManejador_16_0= ruleSistemaManejador ) ) ) this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE
            {
            // InternalMyDsl.g:1475:3: ()
            // InternalMyDsl.g:1476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServidorBaseDeDatosAccess().getServidorBaseDeDatosAction_0(),
            					current);
            			

            }

            this_OPEN_BRACE_1=(Token)match(input,RULE_OPEN_BRACE,FOLLOW_5); 

            			newLeafNode(this_OPEN_BRACE_1, grammarAccess.getServidorBaseDeDatosAccess().getOPEN_BRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getServidorBaseDeDatosAccess().getTipoKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_40); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,41,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getServidorBaseDeDatosAccess().getDatabaseKeyword_4());
            		
            this_SEMI_COLON_5=(Token)match(input,RULE_SEMI_COLON,FOLLOW_28); 

            			newLeafNode(this_SEMI_COLON_5, grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:1502:3: (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1503:4: otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getServidorBaseDeDatosAccess().getNombreKeyword_6_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:1511:4: ( (lv_nombre_8_0= ruleEString ) )
                    // InternalMyDsl.g:1512:5: (lv_nombre_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:1512:5: (lv_nombre_8_0= ruleEString )
                    // InternalMyDsl.g:1513:6: lv_nombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorBaseDeDatosAccess().getNombreEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_nombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBaseDeDatosRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMI_COLON_9=(Token)match(input,RULE_SEMI_COLON,FOLLOW_35); 

            			newLeafNode(this_SEMI_COLON_9, grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_7());
            		
            // InternalMyDsl.g:1535:3: (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) )
            // InternalMyDsl.g:1536:4: otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) )
            {
            otherlv_10=(Token)match(input,39,FOLLOW_6); 

            				newLeafNode(otherlv_10, grammarAccess.getServidorBaseDeDatosAccess().getDimensionKeyword_8_0());
            			
            this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_36); 

            				newLeafNode(this_EQUALS_11, grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_8_1());
            			
            // InternalMyDsl.g:1544:4: ( (lv_TamanoM_12_0= ruleTamanoMaquina ) )
            // InternalMyDsl.g:1545:5: (lv_TamanoM_12_0= ruleTamanoMaquina )
            {
            // InternalMyDsl.g:1545:5: (lv_TamanoM_12_0= ruleTamanoMaquina )
            // InternalMyDsl.g:1546:6: lv_TamanoM_12_0= ruleTamanoMaquina
            {

            						newCompositeNode(grammarAccess.getServidorBaseDeDatosAccess().getTamanoMTamanoMaquinaEnumRuleCall_8_2_0());
            					
            pushFollow(FOLLOW_8);
            lv_TamanoM_12_0=ruleTamanoMaquina();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServidorBaseDeDatosRule());
            						}
            						set(
            							current,
            							"TamanoM",
            							lv_TamanoM_12_0,
            							"org.xtext.example.mydsl.MyDsl.TamanoMaquina");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_SEMI_COLON_13=(Token)match(input,RULE_SEMI_COLON,FOLLOW_5); 

            			newLeafNode(this_SEMI_COLON_13, grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_9());
            		
            // InternalMyDsl.g:1568:3: (otherlv_14= 'tipo' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaManejador_16_0= ruleSistemaManejador ) ) )
            // InternalMyDsl.g:1569:4: otherlv_14= 'tipo' this_EQUALS_15= RULE_EQUALS ( (lv_sistemaManejador_16_0= ruleSistemaManejador ) )
            {
            otherlv_14=(Token)match(input,19,FOLLOW_6); 

            				newLeafNode(otherlv_14, grammarAccess.getServidorBaseDeDatosAccess().getTipoKeyword_10_0());
            			
            this_EQUALS_15=(Token)match(input,RULE_EQUALS,FOLLOW_41); 

            				newLeafNode(this_EQUALS_15, grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_10_1());
            			
            // InternalMyDsl.g:1577:4: ( (lv_sistemaManejador_16_0= ruleSistemaManejador ) )
            // InternalMyDsl.g:1578:5: (lv_sistemaManejador_16_0= ruleSistemaManejador )
            {
            // InternalMyDsl.g:1578:5: (lv_sistemaManejador_16_0= ruleSistemaManejador )
            // InternalMyDsl.g:1579:6: lv_sistemaManejador_16_0= ruleSistemaManejador
            {

            						newCompositeNode(grammarAccess.getServidorBaseDeDatosAccess().getSistemaManejadorSistemaManejadorEnumRuleCall_10_2_0());
            					
            pushFollow(FOLLOW_8);
            lv_sistemaManejador_16_0=ruleSistemaManejador();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getServidorBaseDeDatosRule());
            						}
            						set(
            							current,
            							"sistemaManejador",
            							lv_sistemaManejador_16_0,
            							"org.xtext.example.mydsl.MyDsl.SistemaManejador");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_SEMI_COLON_17=(Token)match(input,RULE_SEMI_COLON,FOLLOW_25); 

            			newLeafNode(this_SEMI_COLON_17, grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_11());
            		
            otherlv_18=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_18, grammarAccess.getServidorBaseDeDatosAccess().getVpcKeyword_12());
            		
            this_EQUALS_19=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_19, grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_13());
            		
            // InternalMyDsl.g:1609:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1610:4: ( ruleEString )
            {
            // InternalMyDsl.g:1610:4: ( ruleEString )
            // InternalMyDsl.g:1611:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorBaseDeDatosRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServidorBaseDeDatosAccess().getVpcVPCCrossReference_14_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMI_COLON_21=(Token)match(input,RULE_SEMI_COLON,FOLLOW_33); 

            			newLeafNode(this_SEMI_COLON_21, grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_15());
            		
            otherlv_22=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_22, grammarAccess.getServidorBaseDeDatosAccess().getSubredKeyword_16());
            		
            this_EQUALS_23=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_23, grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_17());
            		
            // InternalMyDsl.g:1637:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1638:4: ( ruleEString )
            {
            // InternalMyDsl.g:1638:4: ( ruleEString )
            // InternalMyDsl.g:1639:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorBaseDeDatosRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServidorBaseDeDatosAccess().getSubredSubredCrossReference_18_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMI_COLON_25=(Token)match(input,RULE_SEMI_COLON,FOLLOW_39); 

            			newLeafNode(this_SEMI_COLON_25, grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_19());
            		
            otherlv_26=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_26, grammarAccess.getServidorBaseDeDatosAccess().getSecurityGroupKeyword_20());
            		
            this_EQUALS_27=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_27, grammarAccess.getServidorBaseDeDatosAccess().getEQUALSTerminalRuleCall_21());
            		
            // InternalMyDsl.g:1665:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1666:4: ( ruleEString )
            {
            // InternalMyDsl.g:1666:4: ( ruleEString )
            // InternalMyDsl.g:1667:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorBaseDeDatosRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServidorBaseDeDatosAccess().getServersecuritygroupSecurityGroupCrossReference_22_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMI_COLON_29=(Token)match(input,RULE_SEMI_COLON,FOLLOW_16); 

            			newLeafNode(this_SEMI_COLON_29, grammarAccess.getServidorBaseDeDatosAccess().getSEMI_COLONTerminalRuleCall_23());
            		
            this_CLOSE_BRACE_30=(Token)match(input,RULE_CLOSE_BRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_BRACE_30, grammarAccess.getServidorBaseDeDatosAccess().getCLOSE_BRACETerminalRuleCall_24());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidorBaseDeDatos"


    // $ANTLR start "entryRuleServidorAlmacenamiento"
    // InternalMyDsl.g:1693:1: entryRuleServidorAlmacenamiento returns [EObject current=null] : iv_ruleServidorAlmacenamiento= ruleServidorAlmacenamiento EOF ;
    public final EObject entryRuleServidorAlmacenamiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidorAlmacenamiento = null;


        try {
            // InternalMyDsl.g:1693:63: (iv_ruleServidorAlmacenamiento= ruleServidorAlmacenamiento EOF )
            // InternalMyDsl.g:1694:2: iv_ruleServidorAlmacenamiento= ruleServidorAlmacenamiento EOF
            {
             newCompositeNode(grammarAccess.getServidorAlmacenamientoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidorAlmacenamiento=ruleServidorAlmacenamiento();

            state._fsp--;

             current =iv_ruleServidorAlmacenamiento; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidorAlmacenamiento"


    // $ANTLR start "ruleServidorAlmacenamiento"
    // InternalMyDsl.g:1700:1: ruleServidorAlmacenamiento returns [EObject current=null] : ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'STORAGE' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) )? this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'gigas' this_EQUALS_15= RULE_EQUALS ( (lv_tamanoInicial_16_0= ruleEString ) ) )? this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE ) ;
    public final EObject ruleServidorAlmacenamiento() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_BRACE_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token otherlv_4=null;
        Token this_SEMI_COLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMI_COLON_9=null;
        Token otherlv_10=null;
        Token this_EQUALS_11=null;
        Token this_SEMI_COLON_13=null;
        Token otherlv_14=null;
        Token this_EQUALS_15=null;
        Token this_SEMI_COLON_17=null;
        Token otherlv_18=null;
        Token this_EQUALS_19=null;
        Token this_SEMI_COLON_21=null;
        Token otherlv_22=null;
        Token this_EQUALS_23=null;
        Token this_SEMI_COLON_25=null;
        Token otherlv_26=null;
        Token this_EQUALS_27=null;
        Token this_SEMI_COLON_29=null;
        Token this_CLOSE_BRACE_30=null;
        AntlrDatatypeRuleToken lv_nombre_8_0 = null;

        Enumerator lv_TamanoM_12_0 = null;

        AntlrDatatypeRuleToken lv_tamanoInicial_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1706:2: ( ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'STORAGE' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) )? this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'gigas' this_EQUALS_15= RULE_EQUALS ( (lv_tamanoInicial_16_0= ruleEString ) ) )? this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:1707:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'STORAGE' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) )? this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'gigas' this_EQUALS_15= RULE_EQUALS ( (lv_tamanoInicial_16_0= ruleEString ) ) )? this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:1707:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'STORAGE' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) )? this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'gigas' this_EQUALS_15= RULE_EQUALS ( (lv_tamanoInicial_16_0= ruleEString ) ) )? this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE )
            // InternalMyDsl.g:1708:3: () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'tipo' this_EQUALS_3= RULE_EQUALS otherlv_4= 'STORAGE' this_SEMI_COLON_5= RULE_SEMI_COLON (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )? this_SEMI_COLON_9= RULE_SEMI_COLON (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) )? this_SEMI_COLON_13= RULE_SEMI_COLON (otherlv_14= 'gigas' this_EQUALS_15= RULE_EQUALS ( (lv_tamanoInicial_16_0= ruleEString ) ) )? this_SEMI_COLON_17= RULE_SEMI_COLON otherlv_18= 'vpc' this_EQUALS_19= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_21= RULE_SEMI_COLON otherlv_22= 'subred' this_EQUALS_23= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_25= RULE_SEMI_COLON otherlv_26= 'securityGroup' this_EQUALS_27= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_29= RULE_SEMI_COLON this_CLOSE_BRACE_30= RULE_CLOSE_BRACE
            {
            // InternalMyDsl.g:1708:3: ()
            // InternalMyDsl.g:1709:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServidorAlmacenamientoAccess().getServidorAlmacenamientoAction_0(),
            					current);
            			

            }

            this_OPEN_BRACE_1=(Token)match(input,RULE_OPEN_BRACE,FOLLOW_5); 

            			newLeafNode(this_OPEN_BRACE_1, grammarAccess.getServidorAlmacenamientoAccess().getOPEN_BRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getServidorAlmacenamientoAccess().getTipoKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_42); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getServidorAlmacenamientoAccess().getSTORAGEKeyword_4());
            		
            this_SEMI_COLON_5=(Token)match(input,RULE_SEMI_COLON,FOLLOW_28); 

            			newLeafNode(this_SEMI_COLON_5, grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_5());
            		
            // InternalMyDsl.g:1735:3: (otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1736:4: otherlv_6= 'nombre' this_EQUALS_7= RULE_EQUALS ( (lv_nombre_8_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getServidorAlmacenamientoAccess().getNombreKeyword_6_0());
                    			
                    this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_7, grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_6_1());
                    			
                    // InternalMyDsl.g:1744:4: ( (lv_nombre_8_0= ruleEString ) )
                    // InternalMyDsl.g:1745:5: (lv_nombre_8_0= ruleEString )
                    {
                    // InternalMyDsl.g:1745:5: (lv_nombre_8_0= ruleEString )
                    // InternalMyDsl.g:1746:6: lv_nombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getNombreEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_nombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_8_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMI_COLON_9=(Token)match(input,RULE_SEMI_COLON,FOLLOW_43); 

            			newLeafNode(this_SEMI_COLON_9, grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_7());
            		
            // InternalMyDsl.g:1768:3: (otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1769:4: otherlv_10= 'dimension' this_EQUALS_11= RULE_EQUALS ( (lv_TamanoM_12_0= ruleTamanoMaquina ) )
                    {
                    otherlv_10=(Token)match(input,39,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getServidorAlmacenamientoAccess().getDimensionKeyword_8_0());
                    			
                    this_EQUALS_11=(Token)match(input,RULE_EQUALS,FOLLOW_36); 

                    				newLeafNode(this_EQUALS_11, grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_8_1());
                    			
                    // InternalMyDsl.g:1777:4: ( (lv_TamanoM_12_0= ruleTamanoMaquina ) )
                    // InternalMyDsl.g:1778:5: (lv_TamanoM_12_0= ruleTamanoMaquina )
                    {
                    // InternalMyDsl.g:1778:5: (lv_TamanoM_12_0= ruleTamanoMaquina )
                    // InternalMyDsl.g:1779:6: lv_TamanoM_12_0= ruleTamanoMaquina
                    {

                    						newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getTamanoMTamanoMaquinaEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_TamanoM_12_0=ruleTamanoMaquina();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"TamanoM",
                    							lv_TamanoM_12_0,
                    							"org.xtext.example.mydsl.MyDsl.TamanoMaquina");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMI_COLON_13=(Token)match(input,RULE_SEMI_COLON,FOLLOW_44); 

            			newLeafNode(this_SEMI_COLON_13, grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_9());
            		
            // InternalMyDsl.g:1801:3: (otherlv_14= 'gigas' this_EQUALS_15= RULE_EQUALS ( (lv_tamanoInicial_16_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1802:4: otherlv_14= 'gigas' this_EQUALS_15= RULE_EQUALS ( (lv_tamanoInicial_16_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,43,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getServidorAlmacenamientoAccess().getGigasKeyword_10_0());
                    			
                    this_EQUALS_15=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

                    				newLeafNode(this_EQUALS_15, grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_10_1());
                    			
                    // InternalMyDsl.g:1810:4: ( (lv_tamanoInicial_16_0= ruleEString ) )
                    // InternalMyDsl.g:1811:5: (lv_tamanoInicial_16_0= ruleEString )
                    {
                    // InternalMyDsl.g:1811:5: (lv_tamanoInicial_16_0= ruleEString )
                    // InternalMyDsl.g:1812:6: lv_tamanoInicial_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getTamanoInicialEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_tamanoInicial_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"tamanoInicial",
                    							lv_tamanoInicial_16_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMI_COLON_17=(Token)match(input,RULE_SEMI_COLON,FOLLOW_25); 

            			newLeafNode(this_SEMI_COLON_17, grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_11());
            		
            otherlv_18=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_18, grammarAccess.getServidorAlmacenamientoAccess().getVpcKeyword_12());
            		
            this_EQUALS_19=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_19, grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_13());
            		
            // InternalMyDsl.g:1842:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1843:4: ( ruleEString )
            {
            // InternalMyDsl.g:1843:4: ( ruleEString )
            // InternalMyDsl.g:1844:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorAlmacenamientoRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getVpcVPCCrossReference_14_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMI_COLON_21=(Token)match(input,RULE_SEMI_COLON,FOLLOW_33); 

            			newLeafNode(this_SEMI_COLON_21, grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_15());
            		
            otherlv_22=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_22, grammarAccess.getServidorAlmacenamientoAccess().getSubredKeyword_16());
            		
            this_EQUALS_23=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_23, grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_17());
            		
            // InternalMyDsl.g:1870:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1871:4: ( ruleEString )
            {
            // InternalMyDsl.g:1871:4: ( ruleEString )
            // InternalMyDsl.g:1872:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorAlmacenamientoRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getSubredSubredCrossReference_18_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMI_COLON_25=(Token)match(input,RULE_SEMI_COLON,FOLLOW_39); 

            			newLeafNode(this_SEMI_COLON_25, grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_19());
            		
            otherlv_26=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_26, grammarAccess.getServidorAlmacenamientoAccess().getSecurityGroupKeyword_20());
            		
            this_EQUALS_27=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_27, grammarAccess.getServidorAlmacenamientoAccess().getEQUALSTerminalRuleCall_21());
            		
            // InternalMyDsl.g:1898:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1899:4: ( ruleEString )
            {
            // InternalMyDsl.g:1899:4: ( ruleEString )
            // InternalMyDsl.g:1900:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServidorAlmacenamientoRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServidorAlmacenamientoAccess().getServersecuritygroupSecurityGroupCrossReference_22_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMI_COLON_29=(Token)match(input,RULE_SEMI_COLON,FOLLOW_16); 

            			newLeafNode(this_SEMI_COLON_29, grammarAccess.getServidorAlmacenamientoAccess().getSEMI_COLONTerminalRuleCall_23());
            		
            this_CLOSE_BRACE_30=(Token)match(input,RULE_CLOSE_BRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_BRACE_30, grammarAccess.getServidorAlmacenamientoAccess().getCLOSE_BRACETerminalRuleCall_24());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidorAlmacenamiento"


    // $ANTLR start "entryRuleConexion"
    // InternalMyDsl.g:1926:1: entryRuleConexion returns [EObject current=null] : iv_ruleConexion= ruleConexion EOF ;
    public final EObject entryRuleConexion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConexion = null;


        try {
            // InternalMyDsl.g:1926:49: (iv_ruleConexion= ruleConexion EOF )
            // InternalMyDsl.g:1927:2: iv_ruleConexion= ruleConexion EOF
            {
             newCompositeNode(grammarAccess.getConexionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConexion=ruleConexion();

            state._fsp--;

             current =iv_ruleConexion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConexion"


    // $ANTLR start "ruleConexion"
    // InternalMyDsl.g:1933:1: ruleConexion returns [EObject current=null] : ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'servidorUno' this_EQUALS_3= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON otherlv_6= 'servidorDos' this_EQUALS_7= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE ) ;
    public final EObject ruleConexion() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_BRACE_1=null;
        Token otherlv_2=null;
        Token this_EQUALS_3=null;
        Token this_SEMI_COLON_5=null;
        Token otherlv_6=null;
        Token this_EQUALS_7=null;
        Token this_SEMI_COLON_9=null;
        Token this_CLOSE_BRACE_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1939:2: ( ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'servidorUno' this_EQUALS_3= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON otherlv_6= 'servidorDos' this_EQUALS_7= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE ) )
            // InternalMyDsl.g:1940:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'servidorUno' this_EQUALS_3= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON otherlv_6= 'servidorDos' this_EQUALS_7= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE )
            {
            // InternalMyDsl.g:1940:2: ( () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'servidorUno' this_EQUALS_3= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON otherlv_6= 'servidorDos' this_EQUALS_7= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE )
            // InternalMyDsl.g:1941:3: () this_OPEN_BRACE_1= RULE_OPEN_BRACE otherlv_2= 'servidorUno' this_EQUALS_3= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_5= RULE_SEMI_COLON otherlv_6= 'servidorDos' this_EQUALS_7= RULE_EQUALS ( ( ruleEString ) ) this_SEMI_COLON_9= RULE_SEMI_COLON this_CLOSE_BRACE_10= RULE_CLOSE_BRACE
            {
            // InternalMyDsl.g:1941:3: ()
            // InternalMyDsl.g:1942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConexionAccess().getConexionAction_0(),
            					current);
            			

            }

            this_OPEN_BRACE_1=(Token)match(input,RULE_OPEN_BRACE,FOLLOW_45); 

            			newLeafNode(this_OPEN_BRACE_1, grammarAccess.getConexionAccess().getOPEN_BRACETerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getConexionAccess().getServidorUnoKeyword_2());
            		
            this_EQUALS_3=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_3, grammarAccess.getConexionAccess().getEQUALSTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1960:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1961:4: ( ruleEString )
            {
            // InternalMyDsl.g:1961:4: ( ruleEString )
            // InternalMyDsl.g:1962:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConexionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConexionAccess().getServidor1ServidorCrossReference_4_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMI_COLON_5=(Token)match(input,RULE_SEMI_COLON,FOLLOW_46); 

            			newLeafNode(this_SEMI_COLON_5, grammarAccess.getConexionAccess().getSEMI_COLONTerminalRuleCall_5());
            		
            otherlv_6=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getConexionAccess().getServidorDosKeyword_6());
            		
            this_EQUALS_7=(Token)match(input,RULE_EQUALS,FOLLOW_3); 

            			newLeafNode(this_EQUALS_7, grammarAccess.getConexionAccess().getEQUALSTerminalRuleCall_7());
            		
            // InternalMyDsl.g:1988:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1989:4: ( ruleEString )
            {
            // InternalMyDsl.g:1989:4: ( ruleEString )
            // InternalMyDsl.g:1990:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConexionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getConexionAccess().getServidor2ServidorCrossReference_8_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMI_COLON_9=(Token)match(input,RULE_SEMI_COLON,FOLLOW_16); 

            			newLeafNode(this_SEMI_COLON_9, grammarAccess.getConexionAccess().getSEMI_COLONTerminalRuleCall_9());
            		
            this_CLOSE_BRACE_10=(Token)match(input,RULE_CLOSE_BRACE,FOLLOW_2); 

            			newLeafNode(this_CLOSE_BRACE_10, grammarAccess.getConexionAccess().getCLOSE_BRACETerminalRuleCall_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConexion"


    // $ANTLR start "ruleProveedorServicio"
    // InternalMyDsl.g:2016:1: ruleProveedorServicio returns [Enumerator current=null] : ( (enumLiteral_0= 'AWS' ) | (enumLiteral_1= 'GCP' ) ) ;
    public final Enumerator ruleProveedorServicio() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2022:2: ( ( (enumLiteral_0= 'AWS' ) | (enumLiteral_1= 'GCP' ) ) )
            // InternalMyDsl.g:2023:2: ( (enumLiteral_0= 'AWS' ) | (enumLiteral_1= 'GCP' ) )
            {
            // InternalMyDsl.g:2023:2: ( (enumLiteral_0= 'AWS' ) | (enumLiteral_1= 'GCP' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            else if ( (LA27_0==47) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:2024:3: (enumLiteral_0= 'AWS' )
                    {
                    // InternalMyDsl.g:2024:3: (enumLiteral_0= 'AWS' )
                    // InternalMyDsl.g:2025:4: enumLiteral_0= 'AWS'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getProveedorServicioAccess().getAWSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProveedorServicioAccess().getAWSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2032:3: (enumLiteral_1= 'GCP' )
                    {
                    // InternalMyDsl.g:2032:3: (enumLiteral_1= 'GCP' )
                    // InternalMyDsl.g:2033:4: enumLiteral_1= 'GCP'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getProveedorServicioAccess().getGCPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProveedorServicioAccess().getGCPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProveedorServicio"


    // $ANTLR start "ruleAmbiente"
    // InternalMyDsl.g:2043:1: ruleAmbiente returns [Enumerator current=null] : ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) ) ;
    public final Enumerator ruleAmbiente() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2049:2: ( ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) ) )
            // InternalMyDsl.g:2050:2: ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) )
            {
            // InternalMyDsl.g:2050:2: ( (enumLiteral_0= 'DESARROLLO' ) | (enumLiteral_1= 'PRUEBAS' ) | (enumLiteral_2= 'QA' ) | (enumLiteral_3= 'PRODUCCION' ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt28=1;
                }
                break;
            case 49:
                {
                alt28=2;
                }
                break;
            case 50:
                {
                alt28=3;
                }
                break;
            case 51:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2051:3: (enumLiteral_0= 'DESARROLLO' )
                    {
                    // InternalMyDsl.g:2051:3: (enumLiteral_0= 'DESARROLLO' )
                    // InternalMyDsl.g:2052:4: enumLiteral_0= 'DESARROLLO'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAmbienteAccess().getDESARROLLOEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2059:3: (enumLiteral_1= 'PRUEBAS' )
                    {
                    // InternalMyDsl.g:2059:3: (enumLiteral_1= 'PRUEBAS' )
                    // InternalMyDsl.g:2060:4: enumLiteral_1= 'PRUEBAS'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAmbienteAccess().getPRUEBASEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2067:3: (enumLiteral_2= 'QA' )
                    {
                    // InternalMyDsl.g:2067:3: (enumLiteral_2= 'QA' )
                    // InternalMyDsl.g:2068:4: enumLiteral_2= 'QA'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getAmbienteAccess().getQAEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAmbienteAccess().getQAEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2075:3: (enumLiteral_3= 'PRODUCCION' )
                    {
                    // InternalMyDsl.g:2075:3: (enumLiteral_3= 'PRODUCCION' )
                    // InternalMyDsl.g:2076:4: enumLiteral_3= 'PRODUCCION'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getAmbienteAccess().getPRODUCCIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAmbienteAccess().getPRODUCCIONEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmbiente"


    // $ANTLR start "ruleTamanoMaquina"
    // InternalMyDsl.g:2086:1: ruleTamanoMaquina returns [Enumerator current=null] : ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) ) ;
    public final Enumerator ruleTamanoMaquina() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2092:2: ( ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) ) )
            // InternalMyDsl.g:2093:2: ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) )
            {
            // InternalMyDsl.g:2093:2: ( (enumLiteral_0= 'MICRO' ) | (enumLiteral_1= 'SMALL' ) | (enumLiteral_2= 'MEDIUM' ) | (enumLiteral_3= 'LARGE' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt29=1;
                }
                break;
            case 53:
                {
                alt29=2;
                }
                break;
            case 54:
                {
                alt29=3;
                }
                break;
            case 55:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:2094:3: (enumLiteral_0= 'MICRO' )
                    {
                    // InternalMyDsl.g:2094:3: (enumLiteral_0= 'MICRO' )
                    // InternalMyDsl.g:2095:4: enumLiteral_0= 'MICRO'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTamanoMaquinaAccess().getMICROEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTamanoMaquinaAccess().getMICROEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2102:3: (enumLiteral_1= 'SMALL' )
                    {
                    // InternalMyDsl.g:2102:3: (enumLiteral_1= 'SMALL' )
                    // InternalMyDsl.g:2103:4: enumLiteral_1= 'SMALL'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTamanoMaquinaAccess().getSMALLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTamanoMaquinaAccess().getSMALLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2110:3: (enumLiteral_2= 'MEDIUM' )
                    {
                    // InternalMyDsl.g:2110:3: (enumLiteral_2= 'MEDIUM' )
                    // InternalMyDsl.g:2111:4: enumLiteral_2= 'MEDIUM'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTamanoMaquinaAccess().getMEDIUMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTamanoMaquinaAccess().getMEDIUMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2118:3: (enumLiteral_3= 'LARGE' )
                    {
                    // InternalMyDsl.g:2118:3: (enumLiteral_3= 'LARGE' )
                    // InternalMyDsl.g:2119:4: enumLiteral_3= 'LARGE'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTamanoMaquinaAccess().getLARGEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTamanoMaquinaAccess().getLARGEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTamanoMaquina"


    // $ANTLR start "ruleSistemaOperativo"
    // InternalMyDsl.g:2129:1: ruleSistemaOperativo returns [Enumerator current=null] : ( (enumLiteral_0= 'WINDOWS' ) | (enumLiteral_1= 'lINUX' ) | (enumLiteral_2= 'MAC' ) ) ;
    public final Enumerator ruleSistemaOperativo() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2135:2: ( ( (enumLiteral_0= 'WINDOWS' ) | (enumLiteral_1= 'lINUX' ) | (enumLiteral_2= 'MAC' ) ) )
            // InternalMyDsl.g:2136:2: ( (enumLiteral_0= 'WINDOWS' ) | (enumLiteral_1= 'lINUX' ) | (enumLiteral_2= 'MAC' ) )
            {
            // InternalMyDsl.g:2136:2: ( (enumLiteral_0= 'WINDOWS' ) | (enumLiteral_1= 'lINUX' ) | (enumLiteral_2= 'MAC' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt30=1;
                }
                break;
            case 57:
                {
                alt30=2;
                }
                break;
            case 58:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:2137:3: (enumLiteral_0= 'WINDOWS' )
                    {
                    // InternalMyDsl.g:2137:3: (enumLiteral_0= 'WINDOWS' )
                    // InternalMyDsl.g:2138:4: enumLiteral_0= 'WINDOWS'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getSistemaOperativoAccess().getWINDOWSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSistemaOperativoAccess().getWINDOWSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2145:3: (enumLiteral_1= 'lINUX' )
                    {
                    // InternalMyDsl.g:2145:3: (enumLiteral_1= 'lINUX' )
                    // InternalMyDsl.g:2146:4: enumLiteral_1= 'lINUX'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getSistemaOperativoAccess().getLINUXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSistemaOperativoAccess().getLINUXEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2153:3: (enumLiteral_2= 'MAC' )
                    {
                    // InternalMyDsl.g:2153:3: (enumLiteral_2= 'MAC' )
                    // InternalMyDsl.g:2154:4: enumLiteral_2= 'MAC'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getSistemaOperativoAccess().getMACEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSistemaOperativoAccess().getMACEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSistemaOperativo"


    // $ANTLR start "ruleSistemaManejador"
    // InternalMyDsl.g:2164:1: ruleSistemaManejador returns [Enumerator current=null] : ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'MySQL' ) | (enumLiteral_2= 'Oracle' ) | (enumLiteral_3= 'SQLServer' ) | (enumLiteral_4= 'NoSql' ) | (enumLiteral_5= 'Aurora' ) | (enumLiteral_6= 'MariaDB' ) | (enumLiteral_7= 'DocumentDB' ) | (enumLiteral_8= 'Dynamo' ) | (enumLiteral_9= 'Cassandra' ) | (enumLiteral_10= 'Redis' ) ) ;
    public final Enumerator ruleSistemaManejador() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2170:2: ( ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'MySQL' ) | (enumLiteral_2= 'Oracle' ) | (enumLiteral_3= 'SQLServer' ) | (enumLiteral_4= 'NoSql' ) | (enumLiteral_5= 'Aurora' ) | (enumLiteral_6= 'MariaDB' ) | (enumLiteral_7= 'DocumentDB' ) | (enumLiteral_8= 'Dynamo' ) | (enumLiteral_9= 'Cassandra' ) | (enumLiteral_10= 'Redis' ) ) )
            // InternalMyDsl.g:2171:2: ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'MySQL' ) | (enumLiteral_2= 'Oracle' ) | (enumLiteral_3= 'SQLServer' ) | (enumLiteral_4= 'NoSql' ) | (enumLiteral_5= 'Aurora' ) | (enumLiteral_6= 'MariaDB' ) | (enumLiteral_7= 'DocumentDB' ) | (enumLiteral_8= 'Dynamo' ) | (enumLiteral_9= 'Cassandra' ) | (enumLiteral_10= 'Redis' ) )
            {
            // InternalMyDsl.g:2171:2: ( (enumLiteral_0= 'PostgreSQL' ) | (enumLiteral_1= 'MySQL' ) | (enumLiteral_2= 'Oracle' ) | (enumLiteral_3= 'SQLServer' ) | (enumLiteral_4= 'NoSql' ) | (enumLiteral_5= 'Aurora' ) | (enumLiteral_6= 'MariaDB' ) | (enumLiteral_7= 'DocumentDB' ) | (enumLiteral_8= 'Dynamo' ) | (enumLiteral_9= 'Cassandra' ) | (enumLiteral_10= 'Redis' ) )
            int alt31=11;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt31=1;
                }
                break;
            case 60:
                {
                alt31=2;
                }
                break;
            case 61:
                {
                alt31=3;
                }
                break;
            case 62:
                {
                alt31=4;
                }
                break;
            case 63:
                {
                alt31=5;
                }
                break;
            case 64:
                {
                alt31=6;
                }
                break;
            case 65:
                {
                alt31=7;
                }
                break;
            case 66:
                {
                alt31=8;
                }
                break;
            case 67:
                {
                alt31=9;
                }
                break;
            case 68:
                {
                alt31=10;
                }
                break;
            case 69:
                {
                alt31=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2172:3: (enumLiteral_0= 'PostgreSQL' )
                    {
                    // InternalMyDsl.g:2172:3: (enumLiteral_0= 'PostgreSQL' )
                    // InternalMyDsl.g:2173:4: enumLiteral_0= 'PostgreSQL'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getSistemaManejadorAccess().getPostgreSQLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSistemaManejadorAccess().getPostgreSQLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2180:3: (enumLiteral_1= 'MySQL' )
                    {
                    // InternalMyDsl.g:2180:3: (enumLiteral_1= 'MySQL' )
                    // InternalMyDsl.g:2181:4: enumLiteral_1= 'MySQL'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getSistemaManejadorAccess().getMySQLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSistemaManejadorAccess().getMySQLEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2188:3: (enumLiteral_2= 'Oracle' )
                    {
                    // InternalMyDsl.g:2188:3: (enumLiteral_2= 'Oracle' )
                    // InternalMyDsl.g:2189:4: enumLiteral_2= 'Oracle'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getSistemaManejadorAccess().getOracleEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSistemaManejadorAccess().getOracleEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2196:3: (enumLiteral_3= 'SQLServer' )
                    {
                    // InternalMyDsl.g:2196:3: (enumLiteral_3= 'SQLServer' )
                    // InternalMyDsl.g:2197:4: enumLiteral_3= 'SQLServer'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getSistemaManejadorAccess().getSQLServerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSistemaManejadorAccess().getSQLServerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2204:3: (enumLiteral_4= 'NoSql' )
                    {
                    // InternalMyDsl.g:2204:3: (enumLiteral_4= 'NoSql' )
                    // InternalMyDsl.g:2205:4: enumLiteral_4= 'NoSql'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getSistemaManejadorAccess().getNoSqlEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSistemaManejadorAccess().getNoSqlEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:2212:3: (enumLiteral_5= 'Aurora' )
                    {
                    // InternalMyDsl.g:2212:3: (enumLiteral_5= 'Aurora' )
                    // InternalMyDsl.g:2213:4: enumLiteral_5= 'Aurora'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getSistemaManejadorAccess().getAuroraEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSistemaManejadorAccess().getAuroraEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:2220:3: (enumLiteral_6= 'MariaDB' )
                    {
                    // InternalMyDsl.g:2220:3: (enumLiteral_6= 'MariaDB' )
                    // InternalMyDsl.g:2221:4: enumLiteral_6= 'MariaDB'
                    {
                    enumLiteral_6=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getSistemaManejadorAccess().getMariaDBEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSistemaManejadorAccess().getMariaDBEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:2228:3: (enumLiteral_7= 'DocumentDB' )
                    {
                    // InternalMyDsl.g:2228:3: (enumLiteral_7= 'DocumentDB' )
                    // InternalMyDsl.g:2229:4: enumLiteral_7= 'DocumentDB'
                    {
                    enumLiteral_7=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getSistemaManejadorAccess().getDocumentDBEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getSistemaManejadorAccess().getDocumentDBEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:2236:3: (enumLiteral_8= 'Dynamo' )
                    {
                    // InternalMyDsl.g:2236:3: (enumLiteral_8= 'Dynamo' )
                    // InternalMyDsl.g:2237:4: enumLiteral_8= 'Dynamo'
                    {
                    enumLiteral_8=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getSistemaManejadorAccess().getDynamoEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getSistemaManejadorAccess().getDynamoEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:2244:3: (enumLiteral_9= 'Cassandra' )
                    {
                    // InternalMyDsl.g:2244:3: (enumLiteral_9= 'Cassandra' )
                    // InternalMyDsl.g:2245:4: enumLiteral_9= 'Cassandra'
                    {
                    enumLiteral_9=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getSistemaManejadorAccess().getCassandraEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getSistemaManejadorAccess().getCassandraEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:2252:3: (enumLiteral_10= 'Redis' )
                    {
                    // InternalMyDsl.g:2252:3: (enumLiteral_10= 'Redis' )
                    // InternalMyDsl.g:2253:4: enumLiteral_10= 'Redis'
                    {
                    enumLiteral_10=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getSistemaManejadorAccess().getRedisEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getSistemaManejadorAccess().getRedisEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSistemaManejador"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000F800400L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000F000400L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000E000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C000400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000F000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xF800000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});

}