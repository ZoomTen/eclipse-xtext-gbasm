package org.zumi.xtext.gbasm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.zumi.xtext.gbasm.services.GbasmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGbasmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_STRING", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ANY_OTHER", "'a'", "'b'", "'c'", "'d'", "'e'", "'h'", "'l'", "'af'", "'bc'", "'de'", "'hl'", "':'", "'equ'", "'EQU'", "'.'", "'rept'", "'endr'", "'rla'", "'rlca'", "'rra'", "'rrca'", "'bit'", "'res'", "'set'", "','", "'['", "']'", "'add'", "'swap'", "'inc'", "'dec'", "'ld'", "'i'", "'+'", "'-'", "'BANK'", "'('", "')'", "'push'", "'pop'", "'and'", "'cp'", "'ret'", "'nc'", "'nz'", "'z'", "'call'", "'jr'", "'jp'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
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


        public InternalGbasmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGbasmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGbasmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGbasm.g"; }



     	private GbasmGrammarAccess grammarAccess;

        public InternalGbasmParser(TokenStream input, GbasmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Asm";
       	}

       	@Override
       	protected GbasmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAsm"
    // InternalGbasm.g:64:1: entryRuleAsm returns [EObject current=null] : iv_ruleAsm= ruleAsm EOF ;
    public final EObject entryRuleAsm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsm = null;


        try {
            // InternalGbasm.g:64:44: (iv_ruleAsm= ruleAsm EOF )
            // InternalGbasm.g:65:2: iv_ruleAsm= ruleAsm EOF
            {
             newCompositeNode(grammarAccess.getAsmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsm=ruleAsm();

            state._fsp--;

             current =iv_ruleAsm; 
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
    // $ANTLR end "entryRuleAsm"


    // $ANTLR start "ruleAsm"
    // InternalGbasm.g:71:1: ruleAsm returns [EObject current=null] : ( (lv_labels_0_0= ruleLabelOrConstant ) )* ;
    public final EObject ruleAsm() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_0_0 = null;



        	enterRule();

        try {
            // InternalGbasm.g:77:2: ( ( (lv_labels_0_0= ruleLabelOrConstant ) )* )
            // InternalGbasm.g:78:2: ( (lv_labels_0_0= ruleLabelOrConstant ) )*
            {
            // InternalGbasm.g:78:2: ( (lv_labels_0_0= ruleLabelOrConstant ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGbasm.g:79:3: (lv_labels_0_0= ruleLabelOrConstant )
            	    {
            	    // InternalGbasm.g:79:3: (lv_labels_0_0= ruleLabelOrConstant )
            	    // InternalGbasm.g:80:4: lv_labels_0_0= ruleLabelOrConstant
            	    {

            	    				newCompositeNode(grammarAccess.getAsmAccess().getLabelsLabelOrConstantParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_labels_0_0=ruleLabelOrConstant();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getAsmRule());
            	    				}
            	    				add(
            	    					current,
            	    					"labels",
            	    					lv_labels_0_0,
            	    					"org.zumi.xtext.gbasm.Gbasm.LabelOrConstant");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleAsm"


    // $ANTLR start "entryRuleRegister8"
    // InternalGbasm.g:100:1: entryRuleRegister8 returns [String current=null] : iv_ruleRegister8= ruleRegister8 EOF ;
    public final String entryRuleRegister8() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegister8 = null;


        try {
            // InternalGbasm.g:100:49: (iv_ruleRegister8= ruleRegister8 EOF )
            // InternalGbasm.g:101:2: iv_ruleRegister8= ruleRegister8 EOF
            {
             newCompositeNode(grammarAccess.getRegister8Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegister8=ruleRegister8();

            state._fsp--;

             current =iv_ruleRegister8.getText(); 
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
    // $ANTLR end "entryRuleRegister8"


    // $ANTLR start "ruleRegister8"
    // InternalGbasm.g:107:1: ruleRegister8 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'h' | kw= 'l' ) ;
    public final AntlrDatatypeRuleToken ruleRegister8() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGbasm.g:113:2: ( (kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'h' | kw= 'l' ) )
            // InternalGbasm.g:114:2: (kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'h' | kw= 'l' )
            {
            // InternalGbasm.g:114:2: (kw= 'a' | kw= 'b' | kw= 'c' | kw= 'd' | kw= 'e' | kw= 'h' | kw= 'l' )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGbasm.g:115:3: kw= 'a'
                    {
                    kw=(Token)match(input,11,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRegister8Access().getAKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:121:3: kw= 'b'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRegister8Access().getBKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGbasm.g:127:3: kw= 'c'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRegister8Access().getCKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGbasm.g:133:3: kw= 'd'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRegister8Access().getDKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalGbasm.g:139:3: kw= 'e'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRegister8Access().getEKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalGbasm.g:145:3: kw= 'h'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRegister8Access().getHKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalGbasm.g:151:3: kw= 'l'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRegister8Access().getLKeyword_6());
                    		

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
    // $ANTLR end "ruleRegister8"


    // $ANTLR start "entryRuleRegister16"
    // InternalGbasm.g:160:1: entryRuleRegister16 returns [String current=null] : iv_ruleRegister16= ruleRegister16 EOF ;
    public final String entryRuleRegister16() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegister16 = null;


        try {
            // InternalGbasm.g:160:50: (iv_ruleRegister16= ruleRegister16 EOF )
            // InternalGbasm.g:161:2: iv_ruleRegister16= ruleRegister16 EOF
            {
             newCompositeNode(grammarAccess.getRegister16Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegister16=ruleRegister16();

            state._fsp--;

             current =iv_ruleRegister16.getText(); 
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
    // $ANTLR end "entryRuleRegister16"


    // $ANTLR start "ruleRegister16"
    // InternalGbasm.g:167:1: ruleRegister16 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'af' | kw= 'bc' | kw= 'de' | kw= 'hl' ) ;
    public final AntlrDatatypeRuleToken ruleRegister16() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGbasm.g:173:2: ( (kw= 'af' | kw= 'bc' | kw= 'de' | kw= 'hl' ) )
            // InternalGbasm.g:174:2: (kw= 'af' | kw= 'bc' | kw= 'de' | kw= 'hl' )
            {
            // InternalGbasm.g:174:2: (kw= 'af' | kw= 'bc' | kw= 'de' | kw= 'hl' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGbasm.g:175:3: kw= 'af'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRegister16Access().getAfKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:181:3: kw= 'bc'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRegister16Access().getBcKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGbasm.g:187:3: kw= 'de'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRegister16Access().getDeKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGbasm.g:193:3: kw= 'hl'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRegister16Access().getHlKeyword_3());
                    		

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
    // $ANTLR end "ruleRegister16"


    // $ANTLR start "entryRuleLabelOrConstant"
    // InternalGbasm.g:202:1: entryRuleLabelOrConstant returns [EObject current=null] : iv_ruleLabelOrConstant= ruleLabelOrConstant EOF ;
    public final EObject entryRuleLabelOrConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelOrConstant = null;


        try {
            // InternalGbasm.g:202:56: (iv_ruleLabelOrConstant= ruleLabelOrConstant EOF )
            // InternalGbasm.g:203:2: iv_ruleLabelOrConstant= ruleLabelOrConstant EOF
            {
             newCompositeNode(grammarAccess.getLabelOrConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelOrConstant=ruleLabelOrConstant();

            state._fsp--;

             current =iv_ruleLabelOrConstant; 
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
    // $ANTLR end "entryRuleLabelOrConstant"


    // $ANTLR start "ruleLabelOrConstant"
    // InternalGbasm.g:209:1: ruleLabelOrConstant returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' (otherlv_2= ':' )? ( (lv_statements_3_0= ruleStatement ) )* ) | ( (otherlv_4= 'equ' | otherlv_5= 'EQU' ) ruleExpr ) ) ) ;
    public final EObject ruleLabelOrConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalGbasm.g:215:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' (otherlv_2= ':' )? ( (lv_statements_3_0= ruleStatement ) )* ) | ( (otherlv_4= 'equ' | otherlv_5= 'EQU' ) ruleExpr ) ) ) )
            // InternalGbasm.g:216:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' (otherlv_2= ':' )? ( (lv_statements_3_0= ruleStatement ) )* ) | ( (otherlv_4= 'equ' | otherlv_5= 'EQU' ) ruleExpr ) ) )
            {
            // InternalGbasm.g:216:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' (otherlv_2= ':' )? ( (lv_statements_3_0= ruleStatement ) )* ) | ( (otherlv_4= 'equ' | otherlv_5= 'EQU' ) ruleExpr ) ) )
            // InternalGbasm.g:217:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= ':' (otherlv_2= ':' )? ( (lv_statements_3_0= ruleStatement ) )* ) | ( (otherlv_4= 'equ' | otherlv_5= 'EQU' ) ruleExpr ) )
            {
            // InternalGbasm.g:217:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalGbasm.g:218:4: (lv_name_0_0= RULE_ID )
            {
            // InternalGbasm.g:218:4: (lv_name_0_0= RULE_ID )
            // InternalGbasm.g:219:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLabelOrConstantAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelOrConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGbasm.g:235:3: ( (otherlv_1= ':' (otherlv_2= ':' )? ( (lv_statements_3_0= ruleStatement ) )* ) | ( (otherlv_4= 'equ' | otherlv_5= 'EQU' ) ruleExpr ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=23 && LA7_0<=24)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGbasm.g:236:4: (otherlv_1= ':' (otherlv_2= ':' )? ( (lv_statements_3_0= ruleStatement ) )* )
                    {
                    // InternalGbasm.g:236:4: (otherlv_1= ':' (otherlv_2= ':' )? ( (lv_statements_3_0= ruleStatement ) )* )
                    // InternalGbasm.g:237:5: otherlv_1= ':' (otherlv_2= ':' )? ( (lv_statements_3_0= ruleStatement ) )*
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getLabelOrConstantAccess().getColonKeyword_1_0_0());
                    				
                    // InternalGbasm.g:241:5: (otherlv_2= ':' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==22) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalGbasm.g:242:6: otherlv_2= ':'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_6); 

                            						newLeafNode(otherlv_2, grammarAccess.getLabelOrConstantAccess().getColonKeyword_1_0_1());
                            					

                            }
                            break;

                    }

                    // InternalGbasm.g:247:5: ( (lv_statements_3_0= ruleStatement ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_WS||(LA5_0>=25 && LA5_0<=34)||(LA5_0>=38 && LA5_0<=42)||(LA5_0>=49 && LA5_0<=53)||(LA5_0>=57 && LA5_0<=59)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalGbasm.g:248:6: (lv_statements_3_0= ruleStatement )
                    	    {
                    	    // InternalGbasm.g:248:6: (lv_statements_3_0= ruleStatement )
                    	    // InternalGbasm.g:249:7: lv_statements_3_0= ruleStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getLabelOrConstantAccess().getStatementsStatementParserRuleCall_1_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_statements_3_0=ruleStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLabelOrConstantRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statements",
                    	    								lv_statements_3_0,
                    	    								"org.zumi.xtext.gbasm.Gbasm.Statement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalGbasm.g:268:4: ( (otherlv_4= 'equ' | otherlv_5= 'EQU' ) ruleExpr )
                    {
                    // InternalGbasm.g:268:4: ( (otherlv_4= 'equ' | otherlv_5= 'EQU' ) ruleExpr )
                    // InternalGbasm.g:269:5: (otherlv_4= 'equ' | otherlv_5= 'EQU' ) ruleExpr
                    {
                    // InternalGbasm.g:269:5: (otherlv_4= 'equ' | otherlv_5= 'EQU' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==23) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==24) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalGbasm.g:270:6: otherlv_4= 'equ'
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_7); 

                            						newLeafNode(otherlv_4, grammarAccess.getLabelOrConstantAccess().getEquKeyword_1_1_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalGbasm.g:275:6: otherlv_5= 'EQU'
                            {
                            otherlv_5=(Token)match(input,24,FOLLOW_7); 

                            						newLeafNode(otherlv_5, grammarAccess.getLabelOrConstantAccess().getEQUKeyword_1_1_0_1());
                            					

                            }
                            break;

                    }


                    					newCompositeNode(grammarAccess.getLabelOrConstantAccess().getExprParserRuleCall_1_1_1());
                    				
                    pushFollow(FOLLOW_2);
                    ruleExpr();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleLabelOrConstant"


    // $ANTLR start "entryRuleStatement"
    // InternalGbasm.g:293:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalGbasm.g:293:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalGbasm.g:294:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalGbasm.g:300:1: ruleStatement returns [EObject current=null] : (this_LocalLabel_0= ruleLocalLabel | this_Instruction_1= ruleInstruction ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_LocalLabel_0 = null;

        EObject this_Instruction_1 = null;



        	enterRule();

        try {
            // InternalGbasm.g:306:2: ( (this_LocalLabel_0= ruleLocalLabel | this_Instruction_1= ruleInstruction ) )
            // InternalGbasm.g:307:2: (this_LocalLabel_0= ruleLocalLabel | this_Instruction_1= ruleInstruction )
            {
            // InternalGbasm.g:307:2: (this_LocalLabel_0= ruleLocalLabel | this_Instruction_1= ruleInstruction )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_WS||(LA8_0>=26 && LA8_0<=34)||(LA8_0>=38 && LA8_0<=42)||(LA8_0>=49 && LA8_0<=53)||(LA8_0>=57 && LA8_0<=59)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGbasm.g:308:3: this_LocalLabel_0= ruleLocalLabel
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLocalLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalLabel_0=ruleLocalLabel();

                    state._fsp--;


                    			current = this_LocalLabel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:317:3: this_Instruction_1= ruleInstruction
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getInstructionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Instruction_1=ruleInstruction();

                    state._fsp--;


                    			current = this_Instruction_1;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleLocalLabel"
    // InternalGbasm.g:329:1: entryRuleLocalLabel returns [EObject current=null] : iv_ruleLocalLabel= ruleLocalLabel EOF ;
    public final EObject entryRuleLocalLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalLabel = null;


        try {
            // InternalGbasm.g:329:51: (iv_ruleLocalLabel= ruleLocalLabel EOF )
            // InternalGbasm.g:330:2: iv_ruleLocalLabel= ruleLocalLabel EOF
            {
             newCompositeNode(grammarAccess.getLocalLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalLabel=ruleLocalLabel();

            state._fsp--;

             current =iv_ruleLocalLabel; 
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
    // $ANTLR end "entryRuleLocalLabel"


    // $ANTLR start "ruleLocalLabel"
    // InternalGbasm.g:336:1: ruleLocalLabel returns [EObject current=null] : (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' )? ) ;
    public final EObject ruleLocalLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalGbasm.g:342:2: ( (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' )? ) )
            // InternalGbasm.g:343:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' )? )
            {
            // InternalGbasm.g:343:2: (otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' )? )
            // InternalGbasm.g:344:3: otherlv_0= '.' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalLabelAccess().getFullStopKeyword_0());
            		
            // InternalGbasm.g:348:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGbasm.g:349:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGbasm.g:349:4: (lv_name_1_0= RULE_ID )
            // InternalGbasm.g:350:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLocalLabelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGbasm.g:366:3: (otherlv_2= ':' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGbasm.g:367:4: otherlv_2= ':'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getLocalLabelAccess().getColonKeyword_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleLocalLabel"


    // $ANTLR start "entryRuleInstruction"
    // InternalGbasm.g:376:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalGbasm.g:376:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalGbasm.g:377:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalGbasm.g:383:1: ruleInstruction returns [EObject current=null] : ( (this_WS_0= RULE_WS )? (this_Ld_1= ruleLd | ruleLdHl1 | this_CallOrJump_3= ruleCallOrJump | rulePushPop | ruleRet | this_AndCp_6= ruleAndCp | ruleIncDec | ruleRept | ruleRotateA | ruleBitOps | ruleSwap | ruleAddHl ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token this_WS_0=null;
        EObject this_Ld_1 = null;

        EObject this_CallOrJump_3 = null;

        EObject this_AndCp_6 = null;



        	enterRule();

        try {
            // InternalGbasm.g:389:2: ( ( (this_WS_0= RULE_WS )? (this_Ld_1= ruleLd | ruleLdHl1 | this_CallOrJump_3= ruleCallOrJump | rulePushPop | ruleRet | this_AndCp_6= ruleAndCp | ruleIncDec | ruleRept | ruleRotateA | ruleBitOps | ruleSwap | ruleAddHl ) ) )
            // InternalGbasm.g:390:2: ( (this_WS_0= RULE_WS )? (this_Ld_1= ruleLd | ruleLdHl1 | this_CallOrJump_3= ruleCallOrJump | rulePushPop | ruleRet | this_AndCp_6= ruleAndCp | ruleIncDec | ruleRept | ruleRotateA | ruleBitOps | ruleSwap | ruleAddHl ) )
            {
            // InternalGbasm.g:390:2: ( (this_WS_0= RULE_WS )? (this_Ld_1= ruleLd | ruleLdHl1 | this_CallOrJump_3= ruleCallOrJump | rulePushPop | ruleRet | this_AndCp_6= ruleAndCp | ruleIncDec | ruleRept | ruleRotateA | ruleBitOps | ruleSwap | ruleAddHl ) )
            // InternalGbasm.g:391:3: (this_WS_0= RULE_WS )? (this_Ld_1= ruleLd | ruleLdHl1 | this_CallOrJump_3= ruleCallOrJump | rulePushPop | ruleRet | this_AndCp_6= ruleAndCp | ruleIncDec | ruleRept | ruleRotateA | ruleBitOps | ruleSwap | ruleAddHl )
            {
            // InternalGbasm.g:391:3: (this_WS_0= RULE_WS )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_WS) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGbasm.g:392:4: this_WS_0= RULE_WS
                    {
                    this_WS_0=(Token)match(input,RULE_WS,FOLLOW_10); 

                    				newLeafNode(this_WS_0, grammarAccess.getInstructionAccess().getWSTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            // InternalGbasm.g:397:3: (this_Ld_1= ruleLd | ruleLdHl1 | this_CallOrJump_3= ruleCallOrJump | rulePushPop | ruleRet | this_AndCp_6= ruleAndCp | ruleIncDec | ruleRept | ruleRotateA | ruleBitOps | ruleSwap | ruleAddHl )
            int alt11=12;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalGbasm.g:398:4: this_Ld_1= ruleLd
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getLdParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Ld_1=ruleLd();

                    state._fsp--;


                    				current = this_Ld_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:407:4: ruleLdHl1
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getLdHl1ParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleLdHl1();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalGbasm.g:415:4: this_CallOrJump_3= ruleCallOrJump
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getCallOrJumpParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_CallOrJump_3=ruleCallOrJump();

                    state._fsp--;


                    				current = this_CallOrJump_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalGbasm.g:424:4: rulePushPop
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getPushPopParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_2);
                    rulePushPop();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalGbasm.g:432:4: ruleRet
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getRetParserRuleCall_1_4());
                    			
                    pushFollow(FOLLOW_2);
                    ruleRet();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalGbasm.g:440:4: this_AndCp_6= ruleAndCp
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getAndCpParserRuleCall_1_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_AndCp_6=ruleAndCp();

                    state._fsp--;


                    				current = this_AndCp_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalGbasm.g:449:4: ruleIncDec
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getIncDecParserRuleCall_1_6());
                    			
                    pushFollow(FOLLOW_2);
                    ruleIncDec();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalGbasm.g:457:4: ruleRept
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getReptParserRuleCall_1_7());
                    			
                    pushFollow(FOLLOW_2);
                    ruleRept();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 9 :
                    // InternalGbasm.g:465:4: ruleRotateA
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getRotateAParserRuleCall_1_8());
                    			
                    pushFollow(FOLLOW_2);
                    ruleRotateA();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 10 :
                    // InternalGbasm.g:473:4: ruleBitOps
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getBitOpsParserRuleCall_1_9());
                    			
                    pushFollow(FOLLOW_2);
                    ruleBitOps();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 11 :
                    // InternalGbasm.g:481:4: ruleSwap
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getSwapParserRuleCall_1_10());
                    			
                    pushFollow(FOLLOW_2);
                    ruleSwap();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 12 :
                    // InternalGbasm.g:489:4: ruleAddHl
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getAddHlParserRuleCall_1_11());
                    			
                    pushFollow(FOLLOW_2);
                    ruleAddHl();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleRept"
    // InternalGbasm.g:501:1: entryRuleRept returns [String current=null] : iv_ruleRept= ruleRept EOF ;
    public final String entryRuleRept() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRept = null;


        try {
            // InternalGbasm.g:501:44: (iv_ruleRept= ruleRept EOF )
            // InternalGbasm.g:502:2: iv_ruleRept= ruleRept EOF
            {
             newCompositeNode(grammarAccess.getReptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRept=ruleRept();

            state._fsp--;

             current =iv_ruleRept.getText(); 
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
    // $ANTLR end "entryRuleRept"


    // $ANTLR start "ruleRept"
    // InternalGbasm.g:508:1: ruleRept returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'rept' this_INT_1= RULE_INT ) | kw= 'endr' ) ;
    public final AntlrDatatypeRuleToken ruleRept() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGbasm.g:514:2: ( ( (kw= 'rept' this_INT_1= RULE_INT ) | kw= 'endr' ) )
            // InternalGbasm.g:515:2: ( (kw= 'rept' this_INT_1= RULE_INT ) | kw= 'endr' )
            {
            // InternalGbasm.g:515:2: ( (kw= 'rept' this_INT_1= RULE_INT ) | kw= 'endr' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalGbasm.g:516:3: (kw= 'rept' this_INT_1= RULE_INT )
                    {
                    // InternalGbasm.g:516:3: (kw= 'rept' this_INT_1= RULE_INT )
                    // InternalGbasm.g:517:4: kw= 'rept' this_INT_1= RULE_INT
                    {
                    kw=(Token)match(input,26,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReptAccess().getReptKeyword_0_0());
                    			
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getReptAccess().getINTTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGbasm.g:531:3: kw= 'endr'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReptAccess().getEndrKeyword_1());
                    		

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
    // $ANTLR end "ruleRept"


    // $ANTLR start "entryRuleRotateA"
    // InternalGbasm.g:540:1: entryRuleRotateA returns [String current=null] : iv_ruleRotateA= ruleRotateA EOF ;
    public final String entryRuleRotateA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRotateA = null;


        try {
            // InternalGbasm.g:540:47: (iv_ruleRotateA= ruleRotateA EOF )
            // InternalGbasm.g:541:2: iv_ruleRotateA= ruleRotateA EOF
            {
             newCompositeNode(grammarAccess.getRotateARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateA=ruleRotateA();

            state._fsp--;

             current =iv_ruleRotateA.getText(); 
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
    // $ANTLR end "entryRuleRotateA"


    // $ANTLR start "ruleRotateA"
    // InternalGbasm.g:547:1: ruleRotateA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'rla' | kw= 'rlca' | kw= 'rra' | kw= 'rrca' ) ;
    public final AntlrDatatypeRuleToken ruleRotateA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGbasm.g:553:2: ( (kw= 'rla' | kw= 'rlca' | kw= 'rra' | kw= 'rrca' ) )
            // InternalGbasm.g:554:2: (kw= 'rla' | kw= 'rlca' | kw= 'rra' | kw= 'rrca' )
            {
            // InternalGbasm.g:554:2: (kw= 'rla' | kw= 'rlca' | kw= 'rra' | kw= 'rrca' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt13=1;
                }
                break;
            case 29:
                {
                alt13=2;
                }
                break;
            case 30:
                {
                alt13=3;
                }
                break;
            case 31:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalGbasm.g:555:3: kw= 'rla'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRotateAAccess().getRlaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:561:3: kw= 'rlca'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRotateAAccess().getRlcaKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalGbasm.g:567:3: kw= 'rra'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRotateAAccess().getRraKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalGbasm.g:573:3: kw= 'rrca'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRotateAAccess().getRrcaKeyword_3());
                    		

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
    // $ANTLR end "ruleRotateA"


    // $ANTLR start "entryRuleBitOps"
    // InternalGbasm.g:582:1: entryRuleBitOps returns [String current=null] : iv_ruleBitOps= ruleBitOps EOF ;
    public final String entryRuleBitOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBitOps = null;


        try {
            // InternalGbasm.g:582:46: (iv_ruleBitOps= ruleBitOps EOF )
            // InternalGbasm.g:583:2: iv_ruleBitOps= ruleBitOps EOF
            {
             newCompositeNode(grammarAccess.getBitOpsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBitOps=ruleBitOps();

            state._fsp--;

             current =iv_ruleBitOps.getText(); 
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
    // $ANTLR end "entryRuleBitOps"


    // $ANTLR start "ruleBitOps"
    // InternalGbasm.g:589:1: ruleBitOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'bit' | kw= 'res' | kw= 'set' ) this_INT_3= RULE_INT kw= ',' (this_Register8_5= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleBitOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_Register8_5 = null;



        	enterRule();

        try {
            // InternalGbasm.g:595:2: ( ( (kw= 'bit' | kw= 'res' | kw= 'set' ) this_INT_3= RULE_INT kw= ',' (this_Register8_5= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) ) ) )
            // InternalGbasm.g:596:2: ( (kw= 'bit' | kw= 'res' | kw= 'set' ) this_INT_3= RULE_INT kw= ',' (this_Register8_5= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) ) )
            {
            // InternalGbasm.g:596:2: ( (kw= 'bit' | kw= 'res' | kw= 'set' ) this_INT_3= RULE_INT kw= ',' (this_Register8_5= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) ) )
            // InternalGbasm.g:597:3: (kw= 'bit' | kw= 'res' | kw= 'set' ) this_INT_3= RULE_INT kw= ',' (this_Register8_5= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) )
            {
            // InternalGbasm.g:597:3: (kw= 'bit' | kw= 'res' | kw= 'set' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 34:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalGbasm.g:598:4: kw= 'bit'
                    {
                    kw=(Token)match(input,32,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBitOpsAccess().getBitKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:604:4: kw= 'res'
                    {
                    kw=(Token)match(input,33,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBitOpsAccess().getResKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalGbasm.g:610:4: kw= 'set'
                    {
                    kw=(Token)match(input,34,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBitOpsAccess().getSetKeyword_0_2());
                    			

                    }
                    break;

            }

            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getBitOpsAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,35,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getBitOpsAccess().getCommaKeyword_2());
            		
            // InternalGbasm.g:628:3: (this_Register8_5= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=11 && LA15_0<=17)) ) {
                alt15=1;
            }
            else if ( (LA15_0==36) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalGbasm.g:629:4: this_Register8_5= ruleRegister8
                    {

                    				newCompositeNode(grammarAccess.getBitOpsAccess().getRegister8ParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Register8_5=ruleRegister8();

                    state._fsp--;


                    				current.merge(this_Register8_5);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:640:4: (kw= '[' kw= 'hl' kw= ']' )
                    {
                    // InternalGbasm.g:640:4: (kw= '[' kw= 'hl' kw= ']' )
                    // InternalGbasm.g:641:5: kw= '[' kw= 'hl' kw= ']'
                    {
                    kw=(Token)match(input,36,FOLLOW_14); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getBitOpsAccess().getLeftSquareBracketKeyword_3_1_0());
                    				
                    kw=(Token)match(input,21,FOLLOW_15); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getBitOpsAccess().getHlKeyword_3_1_1());
                    				
                    kw=(Token)match(input,37,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getBitOpsAccess().getRightSquareBracketKeyword_3_1_2());
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleBitOps"


    // $ANTLR start "entryRuleAddHl"
    // InternalGbasm.g:662:1: entryRuleAddHl returns [String current=null] : iv_ruleAddHl= ruleAddHl EOF ;
    public final String entryRuleAddHl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAddHl = null;


        try {
            // InternalGbasm.g:662:45: (iv_ruleAddHl= ruleAddHl EOF )
            // InternalGbasm.g:663:2: iv_ruleAddHl= ruleAddHl EOF
            {
             newCompositeNode(grammarAccess.getAddHlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddHl=ruleAddHl();

            state._fsp--;

             current =iv_ruleAddHl.getText(); 
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
    // $ANTLR end "entryRuleAddHl"


    // $ANTLR start "ruleAddHl"
    // InternalGbasm.g:669:1: ruleAddHl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'add' kw= 'hl' kw= ',' this_Register16_3= ruleRegister16 ) ;
    public final AntlrDatatypeRuleToken ruleAddHl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Register16_3 = null;



        	enterRule();

        try {
            // InternalGbasm.g:675:2: ( (kw= 'add' kw= 'hl' kw= ',' this_Register16_3= ruleRegister16 ) )
            // InternalGbasm.g:676:2: (kw= 'add' kw= 'hl' kw= ',' this_Register16_3= ruleRegister16 )
            {
            // InternalGbasm.g:676:2: (kw= 'add' kw= 'hl' kw= ',' this_Register16_3= ruleRegister16 )
            // InternalGbasm.g:677:3: kw= 'add' kw= 'hl' kw= ',' this_Register16_3= ruleRegister16
            {
            kw=(Token)match(input,38,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddHlAccess().getAddKeyword_0());
            		
            kw=(Token)match(input,21,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddHlAccess().getHlKeyword_1());
            		
            kw=(Token)match(input,35,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAddHlAccess().getCommaKeyword_2());
            		

            			newCompositeNode(grammarAccess.getAddHlAccess().getRegister16ParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            this_Register16_3=ruleRegister16();

            state._fsp--;


            			current.merge(this_Register16_3);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleAddHl"


    // $ANTLR start "entryRuleSwap"
    // InternalGbasm.g:706:1: entryRuleSwap returns [String current=null] : iv_ruleSwap= ruleSwap EOF ;
    public final String entryRuleSwap() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSwap = null;


        try {
            // InternalGbasm.g:706:44: (iv_ruleSwap= ruleSwap EOF )
            // InternalGbasm.g:707:2: iv_ruleSwap= ruleSwap EOF
            {
             newCompositeNode(grammarAccess.getSwapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSwap=ruleSwap();

            state._fsp--;

             current =iv_ruleSwap.getText(); 
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
    // $ANTLR end "entryRuleSwap"


    // $ANTLR start "ruleSwap"
    // InternalGbasm.g:713:1: ruleSwap returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'swap' (this_Register8_1= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleSwap() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Register8_1 = null;



        	enterRule();

        try {
            // InternalGbasm.g:719:2: ( (kw= 'swap' (this_Register8_1= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) ) ) )
            // InternalGbasm.g:720:2: (kw= 'swap' (this_Register8_1= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) ) )
            {
            // InternalGbasm.g:720:2: (kw= 'swap' (this_Register8_1= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) ) )
            // InternalGbasm.g:721:3: kw= 'swap' (this_Register8_1= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) )
            {
            kw=(Token)match(input,39,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getSwapAccess().getSwapKeyword_0());
            		
            // InternalGbasm.g:726:3: (this_Register8_1= ruleRegister8 | (kw= '[' kw= 'hl' kw= ']' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=11 && LA16_0<=17)) ) {
                alt16=1;
            }
            else if ( (LA16_0==36) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalGbasm.g:727:4: this_Register8_1= ruleRegister8
                    {

                    				newCompositeNode(grammarAccess.getSwapAccess().getRegister8ParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Register8_1=ruleRegister8();

                    state._fsp--;


                    				current.merge(this_Register8_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:738:4: (kw= '[' kw= 'hl' kw= ']' )
                    {
                    // InternalGbasm.g:738:4: (kw= '[' kw= 'hl' kw= ']' )
                    // InternalGbasm.g:739:5: kw= '[' kw= 'hl' kw= ']'
                    {
                    kw=(Token)match(input,36,FOLLOW_14); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getSwapAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    kw=(Token)match(input,21,FOLLOW_15); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getSwapAccess().getHlKeyword_1_1_1());
                    				
                    kw=(Token)match(input,37,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getSwapAccess().getRightSquareBracketKeyword_1_1_2());
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleSwap"


    // $ANTLR start "entryRuleIncDec"
    // InternalGbasm.g:760:1: entryRuleIncDec returns [String current=null] : iv_ruleIncDec= ruleIncDec EOF ;
    public final String entryRuleIncDec() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIncDec = null;


        try {
            // InternalGbasm.g:760:46: (iv_ruleIncDec= ruleIncDec EOF )
            // InternalGbasm.g:761:2: iv_ruleIncDec= ruleIncDec EOF
            {
             newCompositeNode(grammarAccess.getIncDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncDec=ruleIncDec();

            state._fsp--;

             current =iv_ruleIncDec.getText(); 
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
    // $ANTLR end "entryRuleIncDec"


    // $ANTLR start "ruleIncDec"
    // InternalGbasm.g:767:1: ruleIncDec returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'inc' | kw= 'dec' ) (this_Register8_2= ruleRegister8 | this_Register16_3= ruleRegister16 | (kw= '[' kw= 'hl' kw= ']' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleIncDec() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Register8_2 = null;

        AntlrDatatypeRuleToken this_Register16_3 = null;



        	enterRule();

        try {
            // InternalGbasm.g:773:2: ( ( (kw= 'inc' | kw= 'dec' ) (this_Register8_2= ruleRegister8 | this_Register16_3= ruleRegister16 | (kw= '[' kw= 'hl' kw= ']' ) ) ) )
            // InternalGbasm.g:774:2: ( (kw= 'inc' | kw= 'dec' ) (this_Register8_2= ruleRegister8 | this_Register16_3= ruleRegister16 | (kw= '[' kw= 'hl' kw= ']' ) ) )
            {
            // InternalGbasm.g:774:2: ( (kw= 'inc' | kw= 'dec' ) (this_Register8_2= ruleRegister8 | this_Register16_3= ruleRegister16 | (kw= '[' kw= 'hl' kw= ']' ) ) )
            // InternalGbasm.g:775:3: (kw= 'inc' | kw= 'dec' ) (this_Register8_2= ruleRegister8 | this_Register16_3= ruleRegister16 | (kw= '[' kw= 'hl' kw= ']' ) )
            {
            // InternalGbasm.g:775:3: (kw= 'inc' | kw= 'dec' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            else if ( (LA17_0==41) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalGbasm.g:776:4: kw= 'inc'
                    {
                    kw=(Token)match(input,40,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIncDecAccess().getIncKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:782:4: kw= 'dec'
                    {
                    kw=(Token)match(input,41,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getIncDecAccess().getDecKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalGbasm.g:788:3: (this_Register8_2= ruleRegister8 | this_Register16_3= ruleRegister16 | (kw= '[' kw= 'hl' kw= ']' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt18=1;
                }
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                {
                alt18=2;
                }
                break;
            case 36:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalGbasm.g:789:4: this_Register8_2= ruleRegister8
                    {

                    				newCompositeNode(grammarAccess.getIncDecAccess().getRegister8ParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Register8_2=ruleRegister8();

                    state._fsp--;


                    				current.merge(this_Register8_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:800:4: this_Register16_3= ruleRegister16
                    {

                    				newCompositeNode(grammarAccess.getIncDecAccess().getRegister16ParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Register16_3=ruleRegister16();

                    state._fsp--;


                    				current.merge(this_Register16_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalGbasm.g:811:4: (kw= '[' kw= 'hl' kw= ']' )
                    {
                    // InternalGbasm.g:811:4: (kw= '[' kw= 'hl' kw= ']' )
                    // InternalGbasm.g:812:5: kw= '[' kw= 'hl' kw= ']'
                    {
                    kw=(Token)match(input,36,FOLLOW_14); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getIncDecAccess().getLeftSquareBracketKeyword_1_2_0());
                    				
                    kw=(Token)match(input,21,FOLLOW_15); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getIncDecAccess().getHlKeyword_1_2_1());
                    				
                    kw=(Token)match(input,37,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getIncDecAccess().getRightSquareBracketKeyword_1_2_2());
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleIncDec"


    // $ANTLR start "entryRuleLd"
    // InternalGbasm.g:833:1: entryRuleLd returns [EObject current=null] : iv_ruleLd= ruleLd EOF ;
    public final EObject entryRuleLd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLd = null;


        try {
            // InternalGbasm.g:833:43: (iv_ruleLd= ruleLd EOF )
            // InternalGbasm.g:834:2: iv_ruleLd= ruleLd EOF
            {
             newCompositeNode(grammarAccess.getLdRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLd=ruleLd();

            state._fsp--;

             current =iv_ruleLd; 
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
    // $ANTLR end "entryRuleLd"


    // $ANTLR start "ruleLd"
    // InternalGbasm.g:840:1: ruleLd returns [EObject current=null] : (otherlv_0= 'ld' ( ( ruleRegister8 otherlv_2= ',' ruleRegister8 ) | ( ruleRegister8 otherlv_5= ',' this_INT_6= RULE_INT ) | ( ruleRegister8 otherlv_8= ',' this_BankReference_9= ruleBankReference ) | ( ruleRegister16 otherlv_11= ',' this_INT_12= RULE_INT ) | ( ruleRegister16 otherlv_14= ',' (this_LabelReference_15= ruleLabelReference | (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) ) ) ) | (otherlv_18= 'a' otherlv_19= ',' otherlv_20= '[' this_LabelReference_21= ruleLabelReference otherlv_22= ']' ) | (otherlv_23= '[' this_LabelReference_24= ruleLabelReference otherlv_25= ']' otherlv_26= ',' otherlv_27= 'a' ) ) ) ;
    public final EObject ruleLd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token this_INT_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token this_INT_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject this_BankReference_9 = null;

        EObject this_LabelReference_15 = null;

        EObject this_LabelReference_21 = null;

        EObject this_LabelReference_24 = null;



        	enterRule();

        try {
            // InternalGbasm.g:846:2: ( (otherlv_0= 'ld' ( ( ruleRegister8 otherlv_2= ',' ruleRegister8 ) | ( ruleRegister8 otherlv_5= ',' this_INT_6= RULE_INT ) | ( ruleRegister8 otherlv_8= ',' this_BankReference_9= ruleBankReference ) | ( ruleRegister16 otherlv_11= ',' this_INT_12= RULE_INT ) | ( ruleRegister16 otherlv_14= ',' (this_LabelReference_15= ruleLabelReference | (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) ) ) ) | (otherlv_18= 'a' otherlv_19= ',' otherlv_20= '[' this_LabelReference_21= ruleLabelReference otherlv_22= ']' ) | (otherlv_23= '[' this_LabelReference_24= ruleLabelReference otherlv_25= ']' otherlv_26= ',' otherlv_27= 'a' ) ) ) )
            // InternalGbasm.g:847:2: (otherlv_0= 'ld' ( ( ruleRegister8 otherlv_2= ',' ruleRegister8 ) | ( ruleRegister8 otherlv_5= ',' this_INT_6= RULE_INT ) | ( ruleRegister8 otherlv_8= ',' this_BankReference_9= ruleBankReference ) | ( ruleRegister16 otherlv_11= ',' this_INT_12= RULE_INT ) | ( ruleRegister16 otherlv_14= ',' (this_LabelReference_15= ruleLabelReference | (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) ) ) ) | (otherlv_18= 'a' otherlv_19= ',' otherlv_20= '[' this_LabelReference_21= ruleLabelReference otherlv_22= ']' ) | (otherlv_23= '[' this_LabelReference_24= ruleLabelReference otherlv_25= ']' otherlv_26= ',' otherlv_27= 'a' ) ) )
            {
            // InternalGbasm.g:847:2: (otherlv_0= 'ld' ( ( ruleRegister8 otherlv_2= ',' ruleRegister8 ) | ( ruleRegister8 otherlv_5= ',' this_INT_6= RULE_INT ) | ( ruleRegister8 otherlv_8= ',' this_BankReference_9= ruleBankReference ) | ( ruleRegister16 otherlv_11= ',' this_INT_12= RULE_INT ) | ( ruleRegister16 otherlv_14= ',' (this_LabelReference_15= ruleLabelReference | (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) ) ) ) | (otherlv_18= 'a' otherlv_19= ',' otherlv_20= '[' this_LabelReference_21= ruleLabelReference otherlv_22= ']' ) | (otherlv_23= '[' this_LabelReference_24= ruleLabelReference otherlv_25= ']' otherlv_26= ',' otherlv_27= 'a' ) ) )
            // InternalGbasm.g:848:3: otherlv_0= 'ld' ( ( ruleRegister8 otherlv_2= ',' ruleRegister8 ) | ( ruleRegister8 otherlv_5= ',' this_INT_6= RULE_INT ) | ( ruleRegister8 otherlv_8= ',' this_BankReference_9= ruleBankReference ) | ( ruleRegister16 otherlv_11= ',' this_INT_12= RULE_INT ) | ( ruleRegister16 otherlv_14= ',' (this_LabelReference_15= ruleLabelReference | (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) ) ) ) | (otherlv_18= 'a' otherlv_19= ',' otherlv_20= '[' this_LabelReference_21= ruleLabelReference otherlv_22= ']' ) | (otherlv_23= '[' this_LabelReference_24= ruleLabelReference otherlv_25= ']' otherlv_26= ',' otherlv_27= 'a' ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getLdAccess().getLdKeyword_0());
            		
            // InternalGbasm.g:852:3: ( ( ruleRegister8 otherlv_2= ',' ruleRegister8 ) | ( ruleRegister8 otherlv_5= ',' this_INT_6= RULE_INT ) | ( ruleRegister8 otherlv_8= ',' this_BankReference_9= ruleBankReference ) | ( ruleRegister16 otherlv_11= ',' this_INT_12= RULE_INT ) | ( ruleRegister16 otherlv_14= ',' (this_LabelReference_15= ruleLabelReference | (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) ) ) ) | (otherlv_18= 'a' otherlv_19= ',' otherlv_20= '[' this_LabelReference_21= ruleLabelReference otherlv_22= ']' ) | (otherlv_23= '[' this_LabelReference_24= ruleLabelReference otherlv_25= ']' otherlv_26= ',' otherlv_27= 'a' ) )
            int alt20=7;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalGbasm.g:853:4: ( ruleRegister8 otherlv_2= ',' ruleRegister8 )
                    {
                    // InternalGbasm.g:853:4: ( ruleRegister8 otherlv_2= ',' ruleRegister8 )
                    // InternalGbasm.g:854:5: ruleRegister8 otherlv_2= ',' ruleRegister8
                    {

                    					newCompositeNode(grammarAccess.getLdAccess().getRegister8ParserRuleCall_1_0_0());
                    				
                    pushFollow(FOLLOW_12);
                    ruleRegister8();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_2=(Token)match(input,35,FOLLOW_18); 

                    					newLeafNode(otherlv_2, grammarAccess.getLdAccess().getCommaKeyword_1_0_1());
                    				

                    					newCompositeNode(grammarAccess.getLdAccess().getRegister8ParserRuleCall_1_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    ruleRegister8();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalGbasm.g:874:4: ( ruleRegister8 otherlv_5= ',' this_INT_6= RULE_INT )
                    {
                    // InternalGbasm.g:874:4: ( ruleRegister8 otherlv_5= ',' this_INT_6= RULE_INT )
                    // InternalGbasm.g:875:5: ruleRegister8 otherlv_5= ',' this_INT_6= RULE_INT
                    {

                    					newCompositeNode(grammarAccess.getLdAccess().getRegister8ParserRuleCall_1_1_0());
                    				
                    pushFollow(FOLLOW_12);
                    ruleRegister8();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_5=(Token)match(input,35,FOLLOW_11); 

                    					newLeafNode(otherlv_5, grammarAccess.getLdAccess().getCommaKeyword_1_1_1());
                    				
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(this_INT_6, grammarAccess.getLdAccess().getINTTerminalRuleCall_1_1_2());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalGbasm.g:892:4: ( ruleRegister8 otherlv_8= ',' this_BankReference_9= ruleBankReference )
                    {
                    // InternalGbasm.g:892:4: ( ruleRegister8 otherlv_8= ',' this_BankReference_9= ruleBankReference )
                    // InternalGbasm.g:893:5: ruleRegister8 otherlv_8= ',' this_BankReference_9= ruleBankReference
                    {

                    					newCompositeNode(grammarAccess.getLdAccess().getRegister8ParserRuleCall_1_2_0());
                    				
                    pushFollow(FOLLOW_12);
                    ruleRegister8();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_8=(Token)match(input,35,FOLLOW_19); 

                    					newLeafNode(otherlv_8, grammarAccess.getLdAccess().getCommaKeyword_1_2_1());
                    				

                    					newCompositeNode(grammarAccess.getLdAccess().getBankReferenceParserRuleCall_1_2_2());
                    				
                    pushFollow(FOLLOW_2);
                    this_BankReference_9=ruleBankReference();

                    state._fsp--;


                    					current = this_BankReference_9;
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalGbasm.g:914:4: ( ruleRegister16 otherlv_11= ',' this_INT_12= RULE_INT )
                    {
                    // InternalGbasm.g:914:4: ( ruleRegister16 otherlv_11= ',' this_INT_12= RULE_INT )
                    // InternalGbasm.g:915:5: ruleRegister16 otherlv_11= ',' this_INT_12= RULE_INT
                    {

                    					newCompositeNode(grammarAccess.getLdAccess().getRegister16ParserRuleCall_1_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    ruleRegister16();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_11=(Token)match(input,35,FOLLOW_11); 

                    					newLeafNode(otherlv_11, grammarAccess.getLdAccess().getCommaKeyword_1_3_1());
                    				
                    this_INT_12=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(this_INT_12, grammarAccess.getLdAccess().getINTTerminalRuleCall_1_3_2());
                    				

                    }


                    }
                    break;
                case 5 :
                    // InternalGbasm.g:932:4: ( ruleRegister16 otherlv_14= ',' (this_LabelReference_15= ruleLabelReference | (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) ) ) )
                    {
                    // InternalGbasm.g:932:4: ( ruleRegister16 otherlv_14= ',' (this_LabelReference_15= ruleLabelReference | (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) ) ) )
                    // InternalGbasm.g:933:5: ruleRegister16 otherlv_14= ',' (this_LabelReference_15= ruleLabelReference | (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) ) )
                    {

                    					newCompositeNode(grammarAccess.getLdAccess().getRegister16ParserRuleCall_1_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    ruleRegister16();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_14=(Token)match(input,35,FOLLOW_20); 

                    					newLeafNode(otherlv_14, grammarAccess.getLdAccess().getCommaKeyword_1_4_1());
                    				
                    // InternalGbasm.g:944:5: (this_LabelReference_15= ruleLabelReference | (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_ID) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==25) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalGbasm.g:945:6: this_LabelReference_15= ruleLabelReference
                            {

                            						newCompositeNode(grammarAccess.getLdAccess().getLabelReferenceParserRuleCall_1_4_2_0());
                            					
                            pushFollow(FOLLOW_2);
                            this_LabelReference_15=ruleLabelReference();

                            state._fsp--;


                            						current = this_LabelReference_15;
                            						afterParserOrEnumRuleCall();
                            					

                            }
                            break;
                        case 2 :
                            // InternalGbasm.g:954:6: (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) )
                            {
                            // InternalGbasm.g:954:6: (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) )
                            // InternalGbasm.g:955:7: otherlv_16= '.' ( (otherlv_17= RULE_ID ) )
                            {
                            otherlv_16=(Token)match(input,25,FOLLOW_8); 

                            							newLeafNode(otherlv_16, grammarAccess.getLdAccess().getFullStopKeyword_1_4_2_1_0());
                            						
                            // InternalGbasm.g:959:7: ( (otherlv_17= RULE_ID ) )
                            // InternalGbasm.g:960:8: (otherlv_17= RULE_ID )
                            {
                            // InternalGbasm.g:960:8: (otherlv_17= RULE_ID )
                            // InternalGbasm.g:961:9: otherlv_17= RULE_ID
                            {

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getLdRule());
                            									}
                            								
                            otherlv_17=(Token)match(input,RULE_ID,FOLLOW_2); 

                            									newLeafNode(otherlv_17, grammarAccess.getLdAccess().getLocLabelLocalLabelCrossReference_1_4_2_1_1_0());
                            								

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGbasm.g:976:4: (otherlv_18= 'a' otherlv_19= ',' otherlv_20= '[' this_LabelReference_21= ruleLabelReference otherlv_22= ']' )
                    {
                    // InternalGbasm.g:976:4: (otherlv_18= 'a' otherlv_19= ',' otherlv_20= '[' this_LabelReference_21= ruleLabelReference otherlv_22= ']' )
                    // InternalGbasm.g:977:5: otherlv_18= 'a' otherlv_19= ',' otherlv_20= '[' this_LabelReference_21= ruleLabelReference otherlv_22= ']'
                    {
                    otherlv_18=(Token)match(input,11,FOLLOW_12); 

                    					newLeafNode(otherlv_18, grammarAccess.getLdAccess().getAKeyword_1_5_0());
                    				
                    otherlv_19=(Token)match(input,35,FOLLOW_21); 

                    					newLeafNode(otherlv_19, grammarAccess.getLdAccess().getCommaKeyword_1_5_1());
                    				
                    otherlv_20=(Token)match(input,36,FOLLOW_8); 

                    					newLeafNode(otherlv_20, grammarAccess.getLdAccess().getLeftSquareBracketKeyword_1_5_2());
                    				

                    					newCompositeNode(grammarAccess.getLdAccess().getLabelReferenceParserRuleCall_1_5_3());
                    				
                    pushFollow(FOLLOW_15);
                    this_LabelReference_21=ruleLabelReference();

                    state._fsp--;


                    					current = this_LabelReference_21;
                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_22=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(otherlv_22, grammarAccess.getLdAccess().getRightSquareBracketKeyword_1_5_4());
                    				

                    }


                    }
                    break;
                case 7 :
                    // InternalGbasm.g:1003:4: (otherlv_23= '[' this_LabelReference_24= ruleLabelReference otherlv_25= ']' otherlv_26= ',' otherlv_27= 'a' )
                    {
                    // InternalGbasm.g:1003:4: (otherlv_23= '[' this_LabelReference_24= ruleLabelReference otherlv_25= ']' otherlv_26= ',' otherlv_27= 'a' )
                    // InternalGbasm.g:1004:5: otherlv_23= '[' this_LabelReference_24= ruleLabelReference otherlv_25= ']' otherlv_26= ',' otherlv_27= 'a'
                    {
                    otherlv_23=(Token)match(input,36,FOLLOW_8); 

                    					newLeafNode(otherlv_23, grammarAccess.getLdAccess().getLeftSquareBracketKeyword_1_6_0());
                    				

                    					newCompositeNode(grammarAccess.getLdAccess().getLabelReferenceParserRuleCall_1_6_1());
                    				
                    pushFollow(FOLLOW_15);
                    this_LabelReference_24=ruleLabelReference();

                    state._fsp--;


                    					current = this_LabelReference_24;
                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_25=(Token)match(input,37,FOLLOW_12); 

                    					newLeafNode(otherlv_25, grammarAccess.getLdAccess().getRightSquareBracketKeyword_1_6_2());
                    				
                    otherlv_26=(Token)match(input,35,FOLLOW_22); 

                    					newLeafNode(otherlv_26, grammarAccess.getLdAccess().getCommaKeyword_1_6_3());
                    				
                    otherlv_27=(Token)match(input,11,FOLLOW_2); 

                    					newLeafNode(otherlv_27, grammarAccess.getLdAccess().getAKeyword_1_6_4());
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleLd"


    // $ANTLR start "entryRuleLdHl1"
    // InternalGbasm.g:1034:1: entryRuleLdHl1 returns [String current=null] : iv_ruleLdHl1= ruleLdHl1 EOF ;
    public final String entryRuleLdHl1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLdHl1 = null;


        try {
            // InternalGbasm.g:1034:45: (iv_ruleLdHl1= ruleLdHl1 EOF )
            // InternalGbasm.g:1035:2: iv_ruleLdHl1= ruleLdHl1 EOF
            {
             newCompositeNode(grammarAccess.getLdHl1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLdHl1=ruleLdHl1();

            state._fsp--;

             current =iv_ruleLdHl1.getText(); 
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
    // $ANTLR end "entryRuleLdHl1"


    // $ANTLR start "ruleLdHl1"
    // InternalGbasm.g:1041:1: ruleLdHl1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ld' (kw= 'i' | kw= 'd' ) ( (kw= '[' kw= 'hl' kw= ']' kw= ',' kw= 'a' ) | (kw= 'a' kw= ',' kw= '[' kw= 'hl' kw= ']' ) ) ) ;
    public final AntlrDatatypeRuleToken ruleLdHl1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGbasm.g:1047:2: ( (kw= 'ld' (kw= 'i' | kw= 'd' ) ( (kw= '[' kw= 'hl' kw= ']' kw= ',' kw= 'a' ) | (kw= 'a' kw= ',' kw= '[' kw= 'hl' kw= ']' ) ) ) )
            // InternalGbasm.g:1048:2: (kw= 'ld' (kw= 'i' | kw= 'd' ) ( (kw= '[' kw= 'hl' kw= ']' kw= ',' kw= 'a' ) | (kw= 'a' kw= ',' kw= '[' kw= 'hl' kw= ']' ) ) )
            {
            // InternalGbasm.g:1048:2: (kw= 'ld' (kw= 'i' | kw= 'd' ) ( (kw= '[' kw= 'hl' kw= ']' kw= ',' kw= 'a' ) | (kw= 'a' kw= ',' kw= '[' kw= 'hl' kw= ']' ) ) )
            // InternalGbasm.g:1049:3: kw= 'ld' (kw= 'i' | kw= 'd' ) ( (kw= '[' kw= 'hl' kw= ']' kw= ',' kw= 'a' ) | (kw= 'a' kw= ',' kw= '[' kw= 'hl' kw= ']' ) )
            {
            kw=(Token)match(input,42,FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLdHl1Access().getLdKeyword_0());
            		
            // InternalGbasm.g:1054:3: (kw= 'i' | kw= 'd' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            else if ( (LA21_0==14) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalGbasm.g:1055:4: kw= 'i'
                    {
                    kw=(Token)match(input,43,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getLdHl1Access().getIKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:1061:4: kw= 'd'
                    {
                    kw=(Token)match(input,14,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getLdHl1Access().getDKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGbasm.g:1067:3: ( (kw= '[' kw= 'hl' kw= ']' kw= ',' kw= 'a' ) | (kw= 'a' kw= ',' kw= '[' kw= 'hl' kw= ']' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            else if ( (LA22_0==11) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalGbasm.g:1068:4: (kw= '[' kw= 'hl' kw= ']' kw= ',' kw= 'a' )
                    {
                    // InternalGbasm.g:1068:4: (kw= '[' kw= 'hl' kw= ']' kw= ',' kw= 'a' )
                    // InternalGbasm.g:1069:5: kw= '[' kw= 'hl' kw= ']' kw= ',' kw= 'a'
                    {
                    kw=(Token)match(input,36,FOLLOW_14); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getLdHl1Access().getLeftSquareBracketKeyword_2_0_0());
                    				
                    kw=(Token)match(input,21,FOLLOW_15); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getLdHl1Access().getHlKeyword_2_0_1());
                    				
                    kw=(Token)match(input,37,FOLLOW_12); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getLdHl1Access().getRightSquareBracketKeyword_2_0_2());
                    				
                    kw=(Token)match(input,35,FOLLOW_22); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getLdHl1Access().getCommaKeyword_2_0_3());
                    				
                    kw=(Token)match(input,11,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getLdHl1Access().getAKeyword_2_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalGbasm.g:1096:4: (kw= 'a' kw= ',' kw= '[' kw= 'hl' kw= ']' )
                    {
                    // InternalGbasm.g:1096:4: (kw= 'a' kw= ',' kw= '[' kw= 'hl' kw= ']' )
                    // InternalGbasm.g:1097:5: kw= 'a' kw= ',' kw= '[' kw= 'hl' kw= ']'
                    {
                    kw=(Token)match(input,11,FOLLOW_12); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getLdHl1Access().getAKeyword_2_1_0());
                    				
                    kw=(Token)match(input,35,FOLLOW_21); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getLdHl1Access().getCommaKeyword_2_1_1());
                    				
                    kw=(Token)match(input,36,FOLLOW_14); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getLdHl1Access().getLeftSquareBracketKeyword_2_1_2());
                    				
                    kw=(Token)match(input,21,FOLLOW_15); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getLdHl1Access().getHlKeyword_2_1_3());
                    				
                    kw=(Token)match(input,37,FOLLOW_2); 

                    					current.merge(kw);
                    					newLeafNode(kw, grammarAccess.getLdHl1Access().getRightSquareBracketKeyword_2_1_4());
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleLdHl1"


    // $ANTLR start "entryRuleExpr"
    // InternalGbasm.g:1128:1: entryRuleExpr returns [String current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final String entryRuleExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpr = null;


        try {
            // InternalGbasm.g:1128:44: (iv_ruleExpr= ruleExpr EOF )
            // InternalGbasm.g:1129:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr.getText(); 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalGbasm.g:1135:1: ruleExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGbasm.g:1141:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT ) )
            // InternalGbasm.g:1142:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT )
            {
            // InternalGbasm.g:1142:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_INT) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalGbasm.g:1143:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getExprAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:1151:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getExprAccess().getINTTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleLabelReference"
    // InternalGbasm.g:1162:1: entryRuleLabelReference returns [EObject current=null] : iv_ruleLabelReference= ruleLabelReference EOF ;
    public final EObject entryRuleLabelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelReference = null;


        try {
            // InternalGbasm.g:1162:55: (iv_ruleLabelReference= ruleLabelReference EOF )
            // InternalGbasm.g:1163:2: iv_ruleLabelReference= ruleLabelReference EOF
            {
             newCompositeNode(grammarAccess.getLabelReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelReference=ruleLabelReference();

            state._fsp--;

             current =iv_ruleLabelReference; 
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
    // $ANTLR end "entryRuleLabelReference"


    // $ANTLR start "ruleLabelReference"
    // InternalGbasm.g:1169:1: ruleLabelReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) this_INT_3= RULE_INT )? ) ;
    public final EObject ruleLabelReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalGbasm.g:1175:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) this_INT_3= RULE_INT )? ) )
            // InternalGbasm.g:1176:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) this_INT_3= RULE_INT )? )
            {
            // InternalGbasm.g:1176:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) this_INT_3= RULE_INT )? )
            // InternalGbasm.g:1177:3: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) this_INT_3= RULE_INT )?
            {
            // InternalGbasm.g:1177:3: ( (otherlv_0= RULE_ID ) )
            // InternalGbasm.g:1178:4: (otherlv_0= RULE_ID )
            {
            // InternalGbasm.g:1178:4: (otherlv_0= RULE_ID )
            // InternalGbasm.g:1179:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_0, grammarAccess.getLabelReferenceAccess().getRefLabelLabelOrConstantCrossReference_0_0());
            				

            }


            }

            // InternalGbasm.g:1190:3: ( (otherlv_1= '+' | otherlv_2= '-' ) this_INT_3= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=44 && LA25_0<=45)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGbasm.g:1191:4: (otherlv_1= '+' | otherlv_2= '-' ) this_INT_3= RULE_INT
                    {
                    // InternalGbasm.g:1191:4: (otherlv_1= '+' | otherlv_2= '-' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==44) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==45) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalGbasm.g:1192:5: otherlv_1= '+'
                            {
                            otherlv_1=(Token)match(input,44,FOLLOW_11); 

                            					newLeafNode(otherlv_1, grammarAccess.getLabelReferenceAccess().getPlusSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGbasm.g:1197:5: otherlv_2= '-'
                            {
                            otherlv_2=(Token)match(input,45,FOLLOW_11); 

                            					newLeafNode(otherlv_2, grammarAccess.getLabelReferenceAccess().getHyphenMinusKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_3, grammarAccess.getLabelReferenceAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleLabelReference"


    // $ANTLR start "entryRuleBankReference"
    // InternalGbasm.g:1211:1: entryRuleBankReference returns [EObject current=null] : iv_ruleBankReference= ruleBankReference EOF ;
    public final EObject entryRuleBankReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBankReference = null;


        try {
            // InternalGbasm.g:1211:54: (iv_ruleBankReference= ruleBankReference EOF )
            // InternalGbasm.g:1212:2: iv_ruleBankReference= ruleBankReference EOF
            {
             newCompositeNode(grammarAccess.getBankReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBankReference=ruleBankReference();

            state._fsp--;

             current =iv_ruleBankReference; 
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
    // $ANTLR end "entryRuleBankReference"


    // $ANTLR start "ruleBankReference"
    // InternalGbasm.g:1218:1: ruleBankReference returns [EObject current=null] : (otherlv_0= 'BANK' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleBankReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalGbasm.g:1224:2: ( (otherlv_0= 'BANK' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' ) )
            // InternalGbasm.g:1225:2: (otherlv_0= 'BANK' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            {
            // InternalGbasm.g:1225:2: (otherlv_0= 'BANK' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' )
            // InternalGbasm.g:1226:3: otherlv_0= 'BANK' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getBankReferenceAccess().getBANKKeyword_0());
            		
            otherlv_1=(Token)match(input,47,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBankReferenceAccess().getLeftParenthesisKeyword_1());
            		
            // InternalGbasm.g:1234:3: ( (otherlv_2= RULE_ID ) )
            // InternalGbasm.g:1235:4: (otherlv_2= RULE_ID )
            {
            // InternalGbasm.g:1235:4: (otherlv_2= RULE_ID )
            // InternalGbasm.g:1236:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBankReferenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_2, grammarAccess.getBankReferenceAccess().getBankLabelLabelOrConstantCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBankReferenceAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleBankReference"


    // $ANTLR start "entryRulePushPop"
    // InternalGbasm.g:1255:1: entryRulePushPop returns [String current=null] : iv_rulePushPop= rulePushPop EOF ;
    public final String entryRulePushPop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePushPop = null;


        try {
            // InternalGbasm.g:1255:47: (iv_rulePushPop= rulePushPop EOF )
            // InternalGbasm.g:1256:2: iv_rulePushPop= rulePushPop EOF
            {
             newCompositeNode(grammarAccess.getPushPopRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePushPop=rulePushPop();

            state._fsp--;

             current =iv_rulePushPop.getText(); 
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
    // $ANTLR end "entryRulePushPop"


    // $ANTLR start "rulePushPop"
    // InternalGbasm.g:1262:1: rulePushPop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'push' | kw= 'pop' ) this_Register16_2= ruleRegister16 ) ;
    public final AntlrDatatypeRuleToken rulePushPop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Register16_2 = null;



        	enterRule();

        try {
            // InternalGbasm.g:1268:2: ( ( (kw= 'push' | kw= 'pop' ) this_Register16_2= ruleRegister16 ) )
            // InternalGbasm.g:1269:2: ( (kw= 'push' | kw= 'pop' ) this_Register16_2= ruleRegister16 )
            {
            // InternalGbasm.g:1269:2: ( (kw= 'push' | kw= 'pop' ) this_Register16_2= ruleRegister16 )
            // InternalGbasm.g:1270:3: (kw= 'push' | kw= 'pop' ) this_Register16_2= ruleRegister16
            {
            // InternalGbasm.g:1270:3: (kw= 'push' | kw= 'pop' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            else if ( (LA26_0==50) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalGbasm.g:1271:4: kw= 'push'
                    {
                    kw=(Token)match(input,49,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPushPopAccess().getPushKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:1277:4: kw= 'pop'
                    {
                    kw=(Token)match(input,50,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPushPopAccess().getPopKeyword_0_1());
                    			

                    }
                    break;

            }


            			newCompositeNode(grammarAccess.getPushPopAccess().getRegister16ParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Register16_2=ruleRegister16();

            state._fsp--;


            			current.merge(this_Register16_2);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "rulePushPop"


    // $ANTLR start "entryRuleAndCp"
    // InternalGbasm.g:1297:1: entryRuleAndCp returns [EObject current=null] : iv_ruleAndCp= ruleAndCp EOF ;
    public final EObject entryRuleAndCp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndCp = null;


        try {
            // InternalGbasm.g:1297:46: (iv_ruleAndCp= ruleAndCp EOF )
            // InternalGbasm.g:1298:2: iv_ruleAndCp= ruleAndCp EOF
            {
             newCompositeNode(grammarAccess.getAndCpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndCp=ruleAndCp();

            state._fsp--;

             current =iv_ruleAndCp; 
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
    // $ANTLR end "entryRuleAndCp"


    // $ANTLR start "ruleAndCp"
    // InternalGbasm.g:1304:1: ruleAndCp returns [EObject current=null] : ( (otherlv_0= 'and' | otherlv_1= 'cp' ) (otherlv_2= 'a' otherlv_3= ',' )? ( ruleRegister8 | ( (otherlv_5= RULE_ID ) ) | this_INT_6= RULE_INT ) ) ;
    public final EObject ruleAndCp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalGbasm.g:1310:2: ( ( (otherlv_0= 'and' | otherlv_1= 'cp' ) (otherlv_2= 'a' otherlv_3= ',' )? ( ruleRegister8 | ( (otherlv_5= RULE_ID ) ) | this_INT_6= RULE_INT ) ) )
            // InternalGbasm.g:1311:2: ( (otherlv_0= 'and' | otherlv_1= 'cp' ) (otherlv_2= 'a' otherlv_3= ',' )? ( ruleRegister8 | ( (otherlv_5= RULE_ID ) ) | this_INT_6= RULE_INT ) )
            {
            // InternalGbasm.g:1311:2: ( (otherlv_0= 'and' | otherlv_1= 'cp' ) (otherlv_2= 'a' otherlv_3= ',' )? ( ruleRegister8 | ( (otherlv_5= RULE_ID ) ) | this_INT_6= RULE_INT ) )
            // InternalGbasm.g:1312:3: (otherlv_0= 'and' | otherlv_1= 'cp' ) (otherlv_2= 'a' otherlv_3= ',' )? ( ruleRegister8 | ( (otherlv_5= RULE_ID ) ) | this_INT_6= RULE_INT )
            {
            // InternalGbasm.g:1312:3: (otherlv_0= 'and' | otherlv_1= 'cp' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==51) ) {
                alt27=1;
            }
            else if ( (LA27_0==52) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalGbasm.g:1313:4: otherlv_0= 'and'
                    {
                    otherlv_0=(Token)match(input,51,FOLLOW_28); 

                    				newLeafNode(otherlv_0, grammarAccess.getAndCpAccess().getAndKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:1318:4: otherlv_1= 'cp'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getAndCpAccess().getCpKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalGbasm.g:1323:3: (otherlv_2= 'a' otherlv_3= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==11) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==35) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalGbasm.g:1324:4: otherlv_2= 'a' otherlv_3= ','
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getAndCpAccess().getAKeyword_1_0());
                    			
                    otherlv_3=(Token)match(input,35,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getAndCpAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGbasm.g:1333:3: ( ruleRegister8 | ( (otherlv_5= RULE_ID ) ) | this_INT_6= RULE_INT )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt29=1;
                }
                break;
            case RULE_ID:
                {
                alt29=2;
                }
                break;
            case RULE_INT:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalGbasm.g:1334:4: ruleRegister8
                    {

                    				newCompositeNode(grammarAccess.getAndCpAccess().getRegister8ParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    ruleRegister8();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:1342:4: ( (otherlv_5= RULE_ID ) )
                    {
                    // InternalGbasm.g:1342:4: ( (otherlv_5= RULE_ID ) )
                    // InternalGbasm.g:1343:5: (otherlv_5= RULE_ID )
                    {
                    // InternalGbasm.g:1343:5: (otherlv_5= RULE_ID )
                    // InternalGbasm.g:1344:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAndCpRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_5, grammarAccess.getAndCpAccess().getAndCpLabelRefLabelOrConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGbasm.g:1356:4: this_INT_6= RULE_INT
                    {
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_6, grammarAccess.getAndCpAccess().getINTTerminalRuleCall_2_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleAndCp"


    // $ANTLR start "entryRuleRet"
    // InternalGbasm.g:1365:1: entryRuleRet returns [String current=null] : iv_ruleRet= ruleRet EOF ;
    public final String entryRuleRet() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRet = null;


        try {
            // InternalGbasm.g:1365:43: (iv_ruleRet= ruleRet EOF )
            // InternalGbasm.g:1366:2: iv_ruleRet= ruleRet EOF
            {
             newCompositeNode(grammarAccess.getRetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRet=ruleRet();

            state._fsp--;

             current =iv_ruleRet.getText(); 
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
    // $ANTLR end "entryRuleRet"


    // $ANTLR start "ruleRet"
    // InternalGbasm.g:1372:1: ruleRet returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ret' (kw= 'nc' | kw= 'nz' | kw= 'c' | kw= 'z' )? ) ;
    public final AntlrDatatypeRuleToken ruleRet() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGbasm.g:1378:2: ( (kw= 'ret' (kw= 'nc' | kw= 'nz' | kw= 'c' | kw= 'z' )? ) )
            // InternalGbasm.g:1379:2: (kw= 'ret' (kw= 'nc' | kw= 'nz' | kw= 'c' | kw= 'z' )? )
            {
            // InternalGbasm.g:1379:2: (kw= 'ret' (kw= 'nc' | kw= 'nz' | kw= 'c' | kw= 'z' )? )
            // InternalGbasm.g:1380:3: kw= 'ret' (kw= 'nc' | kw= 'nz' | kw= 'c' | kw= 'z' )?
            {
            kw=(Token)match(input,53,FOLLOW_29); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getRetAccess().getRetKeyword_0());
            		
            // InternalGbasm.g:1385:3: (kw= 'nc' | kw= 'nz' | kw= 'c' | kw= 'z' )?
            int alt30=5;
            switch ( input.LA(1) ) {
                case 54:
                    {
                    alt30=1;
                    }
                    break;
                case 55:
                    {
                    alt30=2;
                    }
                    break;
                case 13:
                    {
                    alt30=3;
                    }
                    break;
                case 56:
                    {
                    alt30=4;
                    }
                    break;
            }

            switch (alt30) {
                case 1 :
                    // InternalGbasm.g:1386:4: kw= 'nc'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRetAccess().getNcKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:1392:4: kw= 'nz'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRetAccess().getNzKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalGbasm.g:1398:4: kw= 'c'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRetAccess().getCKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalGbasm.g:1404:4: kw= 'z'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getRetAccess().getZKeyword_1_3());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleRet"


    // $ANTLR start "entryRuleCallOrJump"
    // InternalGbasm.g:1414:1: entryRuleCallOrJump returns [EObject current=null] : iv_ruleCallOrJump= ruleCallOrJump EOF ;
    public final EObject entryRuleCallOrJump() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallOrJump = null;


        try {
            // InternalGbasm.g:1414:51: (iv_ruleCallOrJump= ruleCallOrJump EOF )
            // InternalGbasm.g:1415:2: iv_ruleCallOrJump= ruleCallOrJump EOF
            {
             newCompositeNode(grammarAccess.getCallOrJumpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallOrJump=ruleCallOrJump();

            state._fsp--;

             current =iv_ruleCallOrJump; 
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
    // $ANTLR end "entryRuleCallOrJump"


    // $ANTLR start "ruleCallOrJump"
    // InternalGbasm.g:1421:1: ruleCallOrJump returns [EObject current=null] : ( (otherlv_0= 'call' | otherlv_1= 'jr' | otherlv_2= 'jp' ) ( (otherlv_3= 'nc' | otherlv_4= 'nz' | otherlv_5= 'c' | otherlv_6= 'z' ) otherlv_7= ',' )? ( ( (otherlv_8= RULE_ID ) ) | (otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ) ) ;
    public final EObject ruleCallOrJump() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalGbasm.g:1427:2: ( ( (otherlv_0= 'call' | otherlv_1= 'jr' | otherlv_2= 'jp' ) ( (otherlv_3= 'nc' | otherlv_4= 'nz' | otherlv_5= 'c' | otherlv_6= 'z' ) otherlv_7= ',' )? ( ( (otherlv_8= RULE_ID ) ) | (otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            // InternalGbasm.g:1428:2: ( (otherlv_0= 'call' | otherlv_1= 'jr' | otherlv_2= 'jp' ) ( (otherlv_3= 'nc' | otherlv_4= 'nz' | otherlv_5= 'c' | otherlv_6= 'z' ) otherlv_7= ',' )? ( ( (otherlv_8= RULE_ID ) ) | (otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ) )
            {
            // InternalGbasm.g:1428:2: ( (otherlv_0= 'call' | otherlv_1= 'jr' | otherlv_2= 'jp' ) ( (otherlv_3= 'nc' | otherlv_4= 'nz' | otherlv_5= 'c' | otherlv_6= 'z' ) otherlv_7= ',' )? ( ( (otherlv_8= RULE_ID ) ) | (otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ) )
            // InternalGbasm.g:1429:3: (otherlv_0= 'call' | otherlv_1= 'jr' | otherlv_2= 'jp' ) ( (otherlv_3= 'nc' | otherlv_4= 'nz' | otherlv_5= 'c' | otherlv_6= 'z' ) otherlv_7= ',' )? ( ( (otherlv_8= RULE_ID ) ) | (otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) )
            {
            // InternalGbasm.g:1429:3: (otherlv_0= 'call' | otherlv_1= 'jr' | otherlv_2= 'jp' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt31=1;
                }
                break;
            case 58:
                {
                alt31=2;
                }
                break;
            case 59:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalGbasm.g:1430:4: otherlv_0= 'call'
                    {
                    otherlv_0=(Token)match(input,57,FOLLOW_30); 

                    				newLeafNode(otherlv_0, grammarAccess.getCallOrJumpAccess().getCallKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalGbasm.g:1435:4: otherlv_1= 'jr'
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getCallOrJumpAccess().getJrKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalGbasm.g:1440:4: otherlv_2= 'jp'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getCallOrJumpAccess().getJpKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalGbasm.g:1445:3: ( (otherlv_3= 'nc' | otherlv_4= 'nz' | otherlv_5= 'c' | otherlv_6= 'z' ) otherlv_7= ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==13||(LA33_0>=54 && LA33_0<=56)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGbasm.g:1446:4: (otherlv_3= 'nc' | otherlv_4= 'nz' | otherlv_5= 'c' | otherlv_6= 'z' ) otherlv_7= ','
                    {
                    // InternalGbasm.g:1446:4: (otherlv_3= 'nc' | otherlv_4= 'nz' | otherlv_5= 'c' | otherlv_6= 'z' )
                    int alt32=4;
                    switch ( input.LA(1) ) {
                    case 54:
                        {
                        alt32=1;
                        }
                        break;
                    case 55:
                        {
                        alt32=2;
                        }
                        break;
                    case 13:
                        {
                        alt32=3;
                        }
                        break;
                    case 56:
                        {
                        alt32=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }

                    switch (alt32) {
                        case 1 :
                            // InternalGbasm.g:1447:5: otherlv_3= 'nc'
                            {
                            otherlv_3=(Token)match(input,54,FOLLOW_12); 

                            					newLeafNode(otherlv_3, grammarAccess.getCallOrJumpAccess().getNcKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalGbasm.g:1452:5: otherlv_4= 'nz'
                            {
                            otherlv_4=(Token)match(input,55,FOLLOW_12); 

                            					newLeafNode(otherlv_4, grammarAccess.getCallOrJumpAccess().getNzKeyword_1_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalGbasm.g:1457:5: otherlv_5= 'c'
                            {
                            otherlv_5=(Token)match(input,13,FOLLOW_12); 

                            					newLeafNode(otherlv_5, grammarAccess.getCallOrJumpAccess().getCKeyword_1_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalGbasm.g:1462:5: otherlv_6= 'z'
                            {
                            otherlv_6=(Token)match(input,56,FOLLOW_12); 

                            					newLeafNode(otherlv_6, grammarAccess.getCallOrJumpAccess().getZKeyword_1_0_3());
                            				

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,35,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getCallOrJumpAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalGbasm.g:1472:3: ( ( (otherlv_8= RULE_ID ) ) | (otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            else if ( (LA34_0==25) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalGbasm.g:1473:4: ( (otherlv_8= RULE_ID ) )
                    {
                    // InternalGbasm.g:1473:4: ( (otherlv_8= RULE_ID ) )
                    // InternalGbasm.g:1474:5: (otherlv_8= RULE_ID )
                    {
                    // InternalGbasm.g:1474:5: (otherlv_8= RULE_ID )
                    // InternalGbasm.g:1475:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallOrJumpRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_8, grammarAccess.getCallOrJumpAccess().getAbsLabelLabelOrConstantCrossReference_2_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGbasm.g:1487:4: (otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
                    {
                    // InternalGbasm.g:1487:4: (otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
                    // InternalGbasm.g:1488:5: otherlv_9= '.' ( (otherlv_10= RULE_ID ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_8); 

                    					newLeafNode(otherlv_9, grammarAccess.getCallOrJumpAccess().getFullStopKeyword_2_1_0());
                    				
                    // InternalGbasm.g:1492:5: ( (otherlv_10= RULE_ID ) )
                    // InternalGbasm.g:1493:6: (otherlv_10= RULE_ID )
                    {
                    // InternalGbasm.g:1493:6: (otherlv_10= RULE_ID )
                    // InternalGbasm.g:1494:7: otherlv_10= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCallOrJumpRule());
                    							}
                    						
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_10, grammarAccess.getCallOrJumpAccess().getLocLabelLocalLabelCrossReference_2_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleCallOrJump"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\32\1\13\13\uffff\1\13\1\uffff";
    static final String dfa_3s = "\1\73\1\53\13\uffff\1\44\1\uffff";
    static final String dfa_4s = "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\2\1\uffff\1\1";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\2\7\4\10\3\11\3\uffff\1\13\1\12\2\6\1\1\6\uffff\2\3\2\5\1\4\3\uffff\3\2",
            "\3\16\1\15\7\16\16\uffff\1\16\6\uffff\1\14",
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
            "\1\14\27\uffff\1\16\1\14",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "397:3: (this_Ld_1= ruleLd | ruleLdHl1 | this_CallOrJump_3= ruleCallOrJump | rulePushPop | ruleRet | this_AndCp_6= ruleAndCp | ruleIncDec | ruleRept | ruleRotateA | ruleBitOps | ruleSwap | ruleAddHl )";
        }
    }
    static final String dfa_7s = "\26\uffff";
    static final String dfa_8s = "\1\13\13\43\1\uffff\2\6\1\4\6\uffff";
    static final String dfa_9s = "\1\44\13\43\1\uffff\2\56\1\31\6\uffff";
    static final String dfa_10s = "\14\uffff\1\7\3\uffff\1\1\1\2\1\3\1\6\1\4\1\5";
    static final String dfa_11s = "\26\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\16\uffff\1\14",
            "\1\15",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\16",
            "\1\17",
            "\1\17",
            "\1\17",
            "\1\17",
            "",
            "\1\21\4\uffff\7\20\22\uffff\1\23\11\uffff\1\22",
            "\1\21\4\uffff\7\20\34\uffff\1\22",
            "\1\25\1\uffff\1\24\22\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "852:3: ( ( ruleRegister8 otherlv_2= ',' ruleRegister8 ) | ( ruleRegister8 otherlv_5= ',' this_INT_6= RULE_INT ) | ( ruleRegister8 otherlv_8= ',' this_BankReference_9= ruleBankReference ) | ( ruleRegister16 otherlv_11= ',' this_INT_12= RULE_INT ) | ( ruleRegister16 otherlv_14= ',' (this_LabelReference_15= ruleLabelReference | (otherlv_16= '.' ( (otherlv_17= RULE_ID ) ) ) ) ) | (otherlv_18= 'a' otherlv_19= ',' otherlv_20= '[' this_LabelReference_21= ruleLabelReference otherlv_22= ']' ) | (otherlv_23= '[' this_LabelReference_24= ruleLabelReference otherlv_25= ']' otherlv_26= ',' otherlv_27= 'a' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0E3E07C7FE400022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0E3E07C7FE000022L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0E3E07C7FE000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000100003F800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000010003FF800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000003F850L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x01C0000000002002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x01C0000002002010L});

}