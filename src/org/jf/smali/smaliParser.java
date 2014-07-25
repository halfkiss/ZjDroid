// $ANTLR 3.5 D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g 2014-05-19 11:14:25

package org.jf.smali;

import org.jf.dexlib2.Format;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.Opcodes;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class smaliParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESS_SPEC", "ANNOTATION_DIRECTIVE", 
		"ANNOTATION_VISIBILITY", "ARRAY_DATA_DIRECTIVE", "ARRAY_DESCRIPTOR", "ARROW", 
		"BASE_ARRAY_DESCRIPTOR", "BASE_CHAR_LITERAL", "BASE_CLASS_DESCRIPTOR", 
		"BASE_FLOAT", "BASE_FLOAT_OR_ID", "BASE_INTEGER", "BASE_PRIMITIVE_TYPE", 
		"BASE_SIMPLE_NAME", "BASE_STRING_LITERAL", "BASE_TYPE", "BINARY_EXPONENT", 
		"BOOL_LITERAL", "BYTE_LITERAL", "CATCHALL_DIRECTIVE", "CATCH_DIRECTIVE", 
		"CHAR_LITERAL", "CLASS_DESCRIPTOR", "CLASS_DIRECTIVE", "CLOSE_BRACE", 
		"CLOSE_PAREN", "COLON", "COMMA", "DECIMAL_EXPONENT", "DOTDOT", "DOUBLE_LITERAL", 
		"DOUBLE_LITERAL_OR_ID", "END_ANNOTATION_DIRECTIVE", "END_ARRAY_DATA_DIRECTIVE", 
		"END_FIELD_DIRECTIVE", "END_LOCAL_DIRECTIVE", "END_METHOD_DIRECTIVE", 
		"END_PACKED_SWITCH_DIRECTIVE", "END_PARAMETER_DIRECTIVE", "END_SPARSE_SWITCH_DIRECTIVE", 
		"END_SUBANNOTATION_DIRECTIVE", "ENUM_DIRECTIVE", "EPILOGUE_DIRECTIVE", 
		"EQUAL", "ESCAPE_SEQUENCE", "FIELD_DIRECTIVE", "FIELD_OFFSET", "FLOAT_LITERAL", 
		"FLOAT_LITERAL_OR_ID", "HEX_DIGIT", "HEX_DIGITS", "HEX_PREFIX", "IMPLEMENTS_DIRECTIVE", 
		"INLINE_INDEX", "INSTRUCTION_FORMAT10t", "INSTRUCTION_FORMAT10x", "INSTRUCTION_FORMAT10x_ODEX", 
		"INSTRUCTION_FORMAT11n", "INSTRUCTION_FORMAT11x", "INSTRUCTION_FORMAT12x", 
		"INSTRUCTION_FORMAT12x_OR_ID", "INSTRUCTION_FORMAT20bc", "INSTRUCTION_FORMAT20t", 
		"INSTRUCTION_FORMAT21c_FIELD", "INSTRUCTION_FORMAT21c_FIELD_ODEX", "INSTRUCTION_FORMAT21c_STRING", 
		"INSTRUCTION_FORMAT21c_TYPE", "INSTRUCTION_FORMAT21ih", "INSTRUCTION_FORMAT21lh", 
		"INSTRUCTION_FORMAT21s", "INSTRUCTION_FORMAT21t", "INSTRUCTION_FORMAT22b", 
		"INSTRUCTION_FORMAT22c_FIELD", "INSTRUCTION_FORMAT22c_FIELD_ODEX", "INSTRUCTION_FORMAT22c_TYPE", 
		"INSTRUCTION_FORMAT22cs_FIELD", "INSTRUCTION_FORMAT22s", "INSTRUCTION_FORMAT22s_OR_ID", 
		"INSTRUCTION_FORMAT22t", "INSTRUCTION_FORMAT22x", "INSTRUCTION_FORMAT23x", 
		"INSTRUCTION_FORMAT30t", "INSTRUCTION_FORMAT31c", "INSTRUCTION_FORMAT31i", 
		"INSTRUCTION_FORMAT31i_OR_ID", "INSTRUCTION_FORMAT31t", "INSTRUCTION_FORMAT32x", 
		"INSTRUCTION_FORMAT35c_METHOD", "INSTRUCTION_FORMAT35c_METHOD_ODEX", "INSTRUCTION_FORMAT35c_TYPE", 
		"INSTRUCTION_FORMAT35mi_METHOD", "INSTRUCTION_FORMAT35ms_METHOD", "INSTRUCTION_FORMAT3rc_METHOD", 
		"INSTRUCTION_FORMAT3rc_METHOD_ODEX", "INSTRUCTION_FORMAT3rc_TYPE", "INSTRUCTION_FORMAT3rmi_METHOD", 
		"INSTRUCTION_FORMAT3rms_METHOD", "INSTRUCTION_FORMAT51l", "INTEGER_LITERAL", 
		"INVALID_TOKEN", "I_ACCESS_LIST", "I_ANNOTATION", "I_ANNOTATIONS", "I_ANNOTATION_ELEMENT", 
		"I_ARRAY_ELEMENTS", "I_ARRAY_ELEMENT_SIZE", "I_CATCH", "I_CATCHALL", "I_CATCHES", 
		"I_CLASS_DEF", "I_ENCODED_ARRAY", "I_ENCODED_ENUM", "I_ENCODED_FIELD", 
		"I_ENCODED_METHOD", "I_END_LOCAL", "I_EPILOGUE", "I_FIELD", "I_FIELDS", 
		"I_FIELD_INITIAL_VALUE", "I_FIELD_TYPE", "I_IMPLEMENTS", "I_LABEL", "I_LINE", 
		"I_LOCAL", "I_LOCALS", "I_METHOD", "I_METHODS", "I_METHOD_PROTOTYPE", 
		"I_METHOD_RETURN_TYPE", "I_ORDERED_METHOD_ITEMS", "I_PACKED_SWITCH_ELEMENTS", 
		"I_PACKED_SWITCH_START_KEY", "I_PARAMETER", "I_PARAMETERS", "I_PARAMETER_NOT_SPECIFIED", 
		"I_PROLOGUE", "I_REGISTERS", "I_REGISTER_LIST", "I_REGISTER_RANGE", "I_RESTART_LOCAL", 
		"I_SOURCE", "I_SPARSE_SWITCH_ELEMENTS", "I_STATEMENT_ARRAY_DATA", "I_STATEMENT_FORMAT10t", 
		"I_STATEMENT_FORMAT10x", "I_STATEMENT_FORMAT11n", "I_STATEMENT_FORMAT11x", 
		"I_STATEMENT_FORMAT12x", "I_STATEMENT_FORMAT20bc", "I_STATEMENT_FORMAT20t", 
		"I_STATEMENT_FORMAT21c_FIELD", "I_STATEMENT_FORMAT21c_STRING", "I_STATEMENT_FORMAT21c_TYPE", 
		"I_STATEMENT_FORMAT21ih", "I_STATEMENT_FORMAT21lh", "I_STATEMENT_FORMAT21s", 
		"I_STATEMENT_FORMAT21t", "I_STATEMENT_FORMAT22b", "I_STATEMENT_FORMAT22c_FIELD", 
		"I_STATEMENT_FORMAT22c_TYPE", "I_STATEMENT_FORMAT22s", "I_STATEMENT_FORMAT22t", 
		"I_STATEMENT_FORMAT22x", "I_STATEMENT_FORMAT23x", "I_STATEMENT_FORMAT30t", 
		"I_STATEMENT_FORMAT31c", "I_STATEMENT_FORMAT31i", "I_STATEMENT_FORMAT31t", 
		"I_STATEMENT_FORMAT32x", "I_STATEMENT_FORMAT35c_METHOD", "I_STATEMENT_FORMAT35c_TYPE", 
		"I_STATEMENT_FORMAT3rc_METHOD", "I_STATEMENT_FORMAT3rc_TYPE", "I_STATEMENT_FORMAT51l", 
		"I_STATEMENT_PACKED_SWITCH", "I_STATEMENT_SPARSE_SWITCH", "I_SUBANNOTATION", 
		"I_SUPER", "LABEL", "LINE_COMMENT", "LINE_DIRECTIVE", "LOCALS_DIRECTIVE", 
		"LOCAL_DIRECTIVE", "LONG_LITERAL", "MEMBER_NAME", "METHOD_DIRECTIVE", 
		"NEGATIVE_INTEGER_LITERAL", "NULL_LITERAL", "OPEN_BRACE", "OPEN_PAREN", 
		"PACKED_SWITCH_DIRECTIVE", "PARAMETER_DIRECTIVE", "PARAM_LIST", "PARAM_LIST_OR_ID", 
		"POSITIVE_INTEGER_LITERAL", "PRIMITIVE_TYPE", "PROLOGUE_DIRECTIVE", "REGISTER", 
		"REGISTERS_DIRECTIVE", "RESTART_LOCAL_DIRECTIVE", "SHORT_LITERAL", "SIMPLE_NAME", 
		"SOURCE_DIRECTIVE", "SPARSE_SWITCH_DIRECTIVE", "STRING_LITERAL", "SUBANNOTATION_DIRECTIVE", 
		"SUPER_DIRECTIVE", "VERIFICATION_ERROR_TYPE", "VOID_TYPE", "VTABLE_INDEX", 
		"WHITE_SPACE"
	};
	public static final int EOF=-1;
	public static final int ACCESS_SPEC=4;
	public static final int ANNOTATION_DIRECTIVE=5;
	public static final int ANNOTATION_VISIBILITY=6;
	public static final int ARRAY_DATA_DIRECTIVE=7;
	public static final int ARRAY_DESCRIPTOR=8;
	public static final int ARROW=9;
	public static final int BASE_ARRAY_DESCRIPTOR=10;
	public static final int BASE_CHAR_LITERAL=11;
	public static final int BASE_CLASS_DESCRIPTOR=12;
	public static final int BASE_FLOAT=13;
	public static final int BASE_FLOAT_OR_ID=14;
	public static final int BASE_INTEGER=15;
	public static final int BASE_PRIMITIVE_TYPE=16;
	public static final int BASE_SIMPLE_NAME=17;
	public static final int BASE_STRING_LITERAL=18;
	public static final int BASE_TYPE=19;
	public static final int BINARY_EXPONENT=20;
	public static final int BOOL_LITERAL=21;
	public static final int BYTE_LITERAL=22;
	public static final int CATCHALL_DIRECTIVE=23;
	public static final int CATCH_DIRECTIVE=24;
	public static final int CHAR_LITERAL=25;
	public static final int CLASS_DESCRIPTOR=26;
	public static final int CLASS_DIRECTIVE=27;
	public static final int CLOSE_BRACE=28;
	public static final int CLOSE_PAREN=29;
	public static final int COLON=30;
	public static final int COMMA=31;
	public static final int DECIMAL_EXPONENT=32;
	public static final int DOTDOT=33;
	public static final int DOUBLE_LITERAL=34;
	public static final int DOUBLE_LITERAL_OR_ID=35;
	public static final int END_ANNOTATION_DIRECTIVE=36;
	public static final int END_ARRAY_DATA_DIRECTIVE=37;
	public static final int END_FIELD_DIRECTIVE=38;
	public static final int END_LOCAL_DIRECTIVE=39;
	public static final int END_METHOD_DIRECTIVE=40;
	public static final int END_PACKED_SWITCH_DIRECTIVE=41;
	public static final int END_PARAMETER_DIRECTIVE=42;
	public static final int END_SPARSE_SWITCH_DIRECTIVE=43;
	public static final int END_SUBANNOTATION_DIRECTIVE=44;
	public static final int ENUM_DIRECTIVE=45;
	public static final int EPILOGUE_DIRECTIVE=46;
	public static final int EQUAL=47;
	public static final int ESCAPE_SEQUENCE=48;
	public static final int FIELD_DIRECTIVE=49;
	public static final int FIELD_OFFSET=50;
	public static final int FLOAT_LITERAL=51;
	public static final int FLOAT_LITERAL_OR_ID=52;
	public static final int HEX_DIGIT=53;
	public static final int HEX_DIGITS=54;
	public static final int HEX_PREFIX=55;
	public static final int IMPLEMENTS_DIRECTIVE=56;
	public static final int INLINE_INDEX=57;
	public static final int INSTRUCTION_FORMAT10t=58;
	public static final int INSTRUCTION_FORMAT10x=59;
	public static final int INSTRUCTION_FORMAT10x_ODEX=60;
	public static final int INSTRUCTION_FORMAT11n=61;
	public static final int INSTRUCTION_FORMAT11x=62;
	public static final int INSTRUCTION_FORMAT12x=63;
	public static final int INSTRUCTION_FORMAT12x_OR_ID=64;
	public static final int INSTRUCTION_FORMAT20bc=65;
	public static final int INSTRUCTION_FORMAT20t=66;
	public static final int INSTRUCTION_FORMAT21c_FIELD=67;
	public static final int INSTRUCTION_FORMAT21c_FIELD_ODEX=68;
	public static final int INSTRUCTION_FORMAT21c_STRING=69;
	public static final int INSTRUCTION_FORMAT21c_TYPE=70;
	public static final int INSTRUCTION_FORMAT21ih=71;
	public static final int INSTRUCTION_FORMAT21lh=72;
	public static final int INSTRUCTION_FORMAT21s=73;
	public static final int INSTRUCTION_FORMAT21t=74;
	public static final int INSTRUCTION_FORMAT22b=75;
	public static final int INSTRUCTION_FORMAT22c_FIELD=76;
	public static final int INSTRUCTION_FORMAT22c_FIELD_ODEX=77;
	public static final int INSTRUCTION_FORMAT22c_TYPE=78;
	public static final int INSTRUCTION_FORMAT22cs_FIELD=79;
	public static final int INSTRUCTION_FORMAT22s=80;
	public static final int INSTRUCTION_FORMAT22s_OR_ID=81;
	public static final int INSTRUCTION_FORMAT22t=82;
	public static final int INSTRUCTION_FORMAT22x=83;
	public static final int INSTRUCTION_FORMAT23x=84;
	public static final int INSTRUCTION_FORMAT30t=85;
	public static final int INSTRUCTION_FORMAT31c=86;
	public static final int INSTRUCTION_FORMAT31i=87;
	public static final int INSTRUCTION_FORMAT31i_OR_ID=88;
	public static final int INSTRUCTION_FORMAT31t=89;
	public static final int INSTRUCTION_FORMAT32x=90;
	public static final int INSTRUCTION_FORMAT35c_METHOD=91;
	public static final int INSTRUCTION_FORMAT35c_METHOD_ODEX=92;
	public static final int INSTRUCTION_FORMAT35c_TYPE=93;
	public static final int INSTRUCTION_FORMAT35mi_METHOD=94;
	public static final int INSTRUCTION_FORMAT35ms_METHOD=95;
	public static final int INSTRUCTION_FORMAT3rc_METHOD=96;
	public static final int INSTRUCTION_FORMAT3rc_METHOD_ODEX=97;
	public static final int INSTRUCTION_FORMAT3rc_TYPE=98;
	public static final int INSTRUCTION_FORMAT3rmi_METHOD=99;
	public static final int INSTRUCTION_FORMAT3rms_METHOD=100;
	public static final int INSTRUCTION_FORMAT51l=101;
	public static final int INTEGER_LITERAL=102;
	public static final int INVALID_TOKEN=103;
	public static final int I_ACCESS_LIST=104;
	public static final int I_ANNOTATION=105;
	public static final int I_ANNOTATIONS=106;
	public static final int I_ANNOTATION_ELEMENT=107;
	public static final int I_ARRAY_ELEMENTS=108;
	public static final int I_ARRAY_ELEMENT_SIZE=109;
	public static final int I_CATCH=110;
	public static final int I_CATCHALL=111;
	public static final int I_CATCHES=112;
	public static final int I_CLASS_DEF=113;
	public static final int I_ENCODED_ARRAY=114;
	public static final int I_ENCODED_ENUM=115;
	public static final int I_ENCODED_FIELD=116;
	public static final int I_ENCODED_METHOD=117;
	public static final int I_END_LOCAL=118;
	public static final int I_EPILOGUE=119;
	public static final int I_FIELD=120;
	public static final int I_FIELDS=121;
	public static final int I_FIELD_INITIAL_VALUE=122;
	public static final int I_FIELD_TYPE=123;
	public static final int I_IMPLEMENTS=124;
	public static final int I_LABEL=125;
	public static final int I_LINE=126;
	public static final int I_LOCAL=127;
	public static final int I_LOCALS=128;
	public static final int I_METHOD=129;
	public static final int I_METHODS=130;
	public static final int I_METHOD_PROTOTYPE=131;
	public static final int I_METHOD_RETURN_TYPE=132;
	public static final int I_ORDERED_METHOD_ITEMS=133;
	public static final int I_PACKED_SWITCH_ELEMENTS=134;
	public static final int I_PACKED_SWITCH_START_KEY=135;
	public static final int I_PARAMETER=136;
	public static final int I_PARAMETERS=137;
	public static final int I_PARAMETER_NOT_SPECIFIED=138;
	public static final int I_PROLOGUE=139;
	public static final int I_REGISTERS=140;
	public static final int I_REGISTER_LIST=141;
	public static final int I_REGISTER_RANGE=142;
	public static final int I_RESTART_LOCAL=143;
	public static final int I_SOURCE=144;
	public static final int I_SPARSE_SWITCH_ELEMENTS=145;
	public static final int I_STATEMENT_ARRAY_DATA=146;
	public static final int I_STATEMENT_FORMAT10t=147;
	public static final int I_STATEMENT_FORMAT10x=148;
	public static final int I_STATEMENT_FORMAT11n=149;
	public static final int I_STATEMENT_FORMAT11x=150;
	public static final int I_STATEMENT_FORMAT12x=151;
	public static final int I_STATEMENT_FORMAT20bc=152;
	public static final int I_STATEMENT_FORMAT20t=153;
	public static final int I_STATEMENT_FORMAT21c_FIELD=154;
	public static final int I_STATEMENT_FORMAT21c_STRING=155;
	public static final int I_STATEMENT_FORMAT21c_TYPE=156;
	public static final int I_STATEMENT_FORMAT21ih=157;
	public static final int I_STATEMENT_FORMAT21lh=158;
	public static final int I_STATEMENT_FORMAT21s=159;
	public static final int I_STATEMENT_FORMAT21t=160;
	public static final int I_STATEMENT_FORMAT22b=161;
	public static final int I_STATEMENT_FORMAT22c_FIELD=162;
	public static final int I_STATEMENT_FORMAT22c_TYPE=163;
	public static final int I_STATEMENT_FORMAT22s=164;
	public static final int I_STATEMENT_FORMAT22t=165;
	public static final int I_STATEMENT_FORMAT22x=166;
	public static final int I_STATEMENT_FORMAT23x=167;
	public static final int I_STATEMENT_FORMAT30t=168;
	public static final int I_STATEMENT_FORMAT31c=169;
	public static final int I_STATEMENT_FORMAT31i=170;
	public static final int I_STATEMENT_FORMAT31t=171;
	public static final int I_STATEMENT_FORMAT32x=172;
	public static final int I_STATEMENT_FORMAT35c_METHOD=173;
	public static final int I_STATEMENT_FORMAT35c_TYPE=174;
	public static final int I_STATEMENT_FORMAT3rc_METHOD=175;
	public static final int I_STATEMENT_FORMAT3rc_TYPE=176;
	public static final int I_STATEMENT_FORMAT51l=177;
	public static final int I_STATEMENT_PACKED_SWITCH=178;
	public static final int I_STATEMENT_SPARSE_SWITCH=179;
	public static final int I_SUBANNOTATION=180;
	public static final int I_SUPER=181;
	public static final int LABEL=182;
	public static final int LINE_COMMENT=183;
	public static final int LINE_DIRECTIVE=184;
	public static final int LOCALS_DIRECTIVE=185;
	public static final int LOCAL_DIRECTIVE=186;
	public static final int LONG_LITERAL=187;
	public static final int MEMBER_NAME=188;
	public static final int METHOD_DIRECTIVE=189;
	public static final int NEGATIVE_INTEGER_LITERAL=190;
	public static final int NULL_LITERAL=191;
	public static final int OPEN_BRACE=192;
	public static final int OPEN_PAREN=193;
	public static final int PACKED_SWITCH_DIRECTIVE=194;
	public static final int PARAMETER_DIRECTIVE=195;
	public static final int PARAM_LIST=196;
	public static final int PARAM_LIST_OR_ID=197;
	public static final int POSITIVE_INTEGER_LITERAL=198;
	public static final int PRIMITIVE_TYPE=199;
	public static final int PROLOGUE_DIRECTIVE=200;
	public static final int REGISTER=201;
	public static final int REGISTERS_DIRECTIVE=202;
	public static final int RESTART_LOCAL_DIRECTIVE=203;
	public static final int SHORT_LITERAL=204;
	public static final int SIMPLE_NAME=205;
	public static final int SOURCE_DIRECTIVE=206;
	public static final int SPARSE_SWITCH_DIRECTIVE=207;
	public static final int STRING_LITERAL=208;
	public static final int SUBANNOTATION_DIRECTIVE=209;
	public static final int SUPER_DIRECTIVE=210;
	public static final int VERIFICATION_ERROR_TYPE=211;
	public static final int VOID_TYPE=212;
	public static final int VTABLE_INDEX=213;
	public static final int WHITE_SPACE=214;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public smaliParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public smaliParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return smaliParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g"; }


	  public static final int ERROR_CHANNEL = 100;

	  private boolean verboseErrors = false;
	  private boolean allowOdex = false;
	  private int apiLevel = 15;
	  private Opcodes opcodes = new Opcodes(apiLevel);

	  public void setVerboseErrors(boolean verboseErrors) {
	    this.verboseErrors = verboseErrors;
	  }

	  public void setAllowOdex(boolean allowOdex) {
	      this.allowOdex = allowOdex;
	  }

	  public void setApiLevel(int apiLevel) {
	      this.opcodes = new Opcodes(apiLevel);
	      this.apiLevel = apiLevel;
	  }

	  public String getErrorMessage(RecognitionException e,
	    String[] tokenNames) {

	    if (verboseErrors) {
	      List stack = getRuleInvocationStack(e, this.getClass().getName());
	      String msg = null;

	      if (e instanceof NoViableAltException) {
	        NoViableAltException nvae = (NoViableAltException)e;
	        msg = " no viable alt; token="+getTokenErrorDisplay(e.token)+
	        " (decision="+nvae.decisionNumber+
	        " state "+nvae.stateNumber+")"+
	        " decision=<<"+nvae.grammarDecisionDescription+">>";
	      } else {
	        msg = super.getErrorMessage(e, tokenNames);
	      }

	      return stack + " " + msg;
	    } else {
	      return super.getErrorMessage(e, tokenNames);
	    }
	  }

	  public String getTokenErrorDisplay(Token t) {
	    if (!verboseErrors) {
	      String s = t.getText();
	      if ( s==null ) {
	        if ( t.getType()==Token.EOF ) {
	          s = "<EOF>";
	        }
	        else {
	          s = "<"+tokenNames[t.getType()]+">";
	        }
	      }
	      s = s.replaceAll("\n","\\\\n");
	      s = s.replaceAll("\r","\\\\r");
	      s = s.replaceAll("\t","\\\\t");
	      return "'"+s+"'";
	    }

	    CommonToken ct = (CommonToken)t;

	    String channelStr = "";
	    if (t.getChannel()>0) {
	      channelStr=",channel="+t.getChannel();
	    }
	    String txt = t.getText();
	    if ( txt!=null ) {
	      txt = txt.replaceAll("\n","\\\\n");
	      txt = txt.replaceAll("\r","\\\\r");
	      txt = txt.replaceAll("\t","\\\\t");
	    }
	    else {
	      txt = "<no text>";
	    }
	    return "[@"+t.getTokenIndex()+","+ct.getStartIndex()+":"+ct.getStopIndex()+"='"+txt+"',<"+tokenNames[t.getType()]+">"+channelStr+","+t.getLine()+":"+t.getCharPositionInLine()+"]";
	  }

	  public String getErrorHeader(RecognitionException e) {
	    return getSourceName()+"["+ e.line+","+e.charPositionInLine+"]";
	  }

	  private CommonTree buildTree(int type, String text, List<CommonTree> children) {
	    CommonTree root = new CommonTree(new CommonToken(type, text));
	    for (CommonTree child: children) {
	      root.addChild(child);
	    }
	    return root;
	  }

	  private CommonToken getParamListSubToken(CommonToken baseToken, String str, int typeStartIndex) {
	    CommonToken token = new CommonToken(baseToken);
	    token.setStartIndex(baseToken.getStartIndex() + typeStartIndex);

	    switch (str.charAt(typeStartIndex)) {
	      case 'Z':
	      case 'B':
	      case 'S':
	      case 'C':
	      case 'I':
	      case 'J':
	      case 'F':
	      case 'D':
	      {
	        token.setType(PRIMITIVE_TYPE);
	        token.setText(str.substring(typeStartIndex, typeStartIndex+1));
	        token.setStopIndex(baseToken.getStartIndex() + typeStartIndex);
	        break;
	      }
	      case 'L':
	      {
	        int i = typeStartIndex;
	        while (str.charAt(++i) != ';');

	        token.setType(CLASS_DESCRIPTOR);
	        token.setText(str.substring(typeStartIndex, i + 1));
	        token.setStopIndex(baseToken.getStartIndex() + i);
	        break;
	      }
	      case '[':
	      {
	        int i = typeStartIndex;
	            while (str.charAt(++i) == '[');

	            if (str.charAt(i++) == 'L') {
	                while (str.charAt(i++) != ';');
	        }

	            token.setType(ARRAY_DESCRIPTOR);
	            token.setText(str.substring(typeStartIndex, i));
	            token.setStopIndex(baseToken.getStartIndex() + i - 1);
	            break;
	      }
	      default:
	        throw new RuntimeException(String.format("Invalid character '%c' in param list \"%s\" at position %d", str.charAt(typeStartIndex), str, typeStartIndex));
	    }

	    return token;
	  }

	  private CommonTree parseParamList(CommonToken paramListToken) {
	    String paramList = paramListToken.getText();
	    CommonTree root = new CommonTree();

	    int startIndex = paramListToken.getStartIndex();

	    int i=0;
	    while (i<paramList.length()) {
	      CommonToken token = getParamListSubToken(paramListToken, paramList, i);
	      root.addChild(new CommonTree(token));
	      i += token.getText().length();
	    }

	    if (root.getChildCount() == 0) {
	      return null;
	    }
	    return root;
	  }

	  private void throwOdexedInstructionException(IntStream input, String odexedInstruction)
	      throws OdexedInstructionException {
	    /*this has to be done in a separate method, otherwise java will complain about the
	    auto-generated code in the rule after the throw not being reachable*/
	    throw new OdexedInstructionException(input, odexedInstruction);
	  }


	protected static class smali_file_scope {
		boolean hasClassSpec;
		boolean hasSuperSpec;
		boolean hasSourceSpec;
		List<CommonTree> classAnnotations;
	}
	protected Stack<smali_file_scope> smali_file_stack = new Stack<smali_file_scope>();

	public static class smali_file_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "smali_file"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:433:1: smali_file : ({...}? => class_spec |{...}? => super_spec | implements_spec |{...}? => source_spec | method | field | annotation )+ EOF -> ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) ) ;
	public final smaliParser.smali_file_return smali_file() throws RecognitionException {
		smali_file_stack.push(new smali_file_scope());
		smaliParser.smali_file_return retval = new smaliParser.smali_file_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF8=null;
		ParserRuleReturnScope class_spec1 =null;
		ParserRuleReturnScope super_spec2 =null;
		ParserRuleReturnScope implements_spec3 =null;
		ParserRuleReturnScope source_spec4 =null;
		ParserRuleReturnScope method5 =null;
		ParserRuleReturnScope field6 =null;
		ParserRuleReturnScope annotation7 =null;

		CommonTree EOF8_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_class_spec=new RewriteRuleSubtreeStream(adaptor,"rule class_spec");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_method=new RewriteRuleSubtreeStream(adaptor,"rule method");
		RewriteRuleSubtreeStream stream_field=new RewriteRuleSubtreeStream(adaptor,"rule field");
		RewriteRuleSubtreeStream stream_super_spec=new RewriteRuleSubtreeStream(adaptor,"rule super_spec");
		RewriteRuleSubtreeStream stream_implements_spec=new RewriteRuleSubtreeStream(adaptor,"rule implements_spec");
		RewriteRuleSubtreeStream stream_source_spec=new RewriteRuleSubtreeStream(adaptor,"rule source_spec");

		 smali_file_stack.peek().hasClassSpec = smali_file_stack.peek().hasSuperSpec = smali_file_stack.peek().hasSourceSpec = false;
		    smali_file_stack.peek().classAnnotations = new ArrayList<CommonTree>();
		  
		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:445:3: ( ({...}? => class_spec |{...}? => super_spec | implements_spec |{...}? => source_spec | method | field | annotation )+ EOF -> ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:446:3: ({...}? => class_spec |{...}? => super_spec | implements_spec |{...}? => source_spec | method | field | annotation )+ EOF
			{
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:446:3: ({...}? => class_spec |{...}? => super_spec | implements_spec |{...}? => source_spec | method | field | annotation )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=8;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CLASS_DIRECTIVE) && ((!smali_file_stack.peek().hasClassSpec))) {
					alt1=1;
				}
				else if ( (LA1_0==SUPER_DIRECTIVE) && ((!smali_file_stack.peek().hasSuperSpec))) {
					alt1=2;
				}
				else if ( (LA1_0==IMPLEMENTS_DIRECTIVE) ) {
					alt1=3;
				}
				else if ( (LA1_0==SOURCE_DIRECTIVE) && ((!smali_file_stack.peek().hasSourceSpec))) {
					alt1=4;
				}
				else if ( (LA1_0==METHOD_DIRECTIVE) ) {
					alt1=5;
				}
				else if ( (LA1_0==FIELD_DIRECTIVE) ) {
					alt1=6;
				}
				else if ( (LA1_0==ANNOTATION_DIRECTIVE) ) {
					alt1=7;
				}

				switch (alt1) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:446:5: {...}? => class_spec
					{
					if ( !((!smali_file_stack.peek().hasClassSpec)) ) {
						throw new FailedPredicateException(input, "smali_file", "!$smali_file::hasClassSpec");
					}
					pushFollow(FOLLOW_class_spec_in_smali_file1145);
					class_spec1=class_spec();
					state._fsp--;

					stream_class_spec.add(class_spec1.getTree());
					smali_file_stack.peek().hasClassSpec = true;
					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:447:5: {...}? => super_spec
					{
					if ( !((!smali_file_stack.peek().hasSuperSpec)) ) {
						throw new FailedPredicateException(input, "smali_file", "!$smali_file::hasSuperSpec");
					}
					pushFollow(FOLLOW_super_spec_in_smali_file1156);
					super_spec2=super_spec();
					state._fsp--;

					stream_super_spec.add(super_spec2.getTree());
					smali_file_stack.peek().hasSuperSpec = true;
					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:448:5: implements_spec
					{
					pushFollow(FOLLOW_implements_spec_in_smali_file1164);
					implements_spec3=implements_spec();
					state._fsp--;

					stream_implements_spec.add(implements_spec3.getTree());
					}
					break;
				case 4 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:449:5: {...}? => source_spec
					{
					if ( !((!smali_file_stack.peek().hasSourceSpec)) ) {
						throw new FailedPredicateException(input, "smali_file", "!$smali_file::hasSourceSpec");
					}
					pushFollow(FOLLOW_source_spec_in_smali_file1173);
					source_spec4=source_spec();
					state._fsp--;

					stream_source_spec.add(source_spec4.getTree());
					smali_file_stack.peek().hasSourceSpec = true;
					}
					break;
				case 5 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:450:5: method
					{
					pushFollow(FOLLOW_method_in_smali_file1181);
					method5=method();
					state._fsp--;

					stream_method.add(method5.getTree());
					}
					break;
				case 6 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:451:5: field
					{
					pushFollow(FOLLOW_field_in_smali_file1187);
					field6=field();
					state._fsp--;

					stream_field.add(field6.getTree());
					}
					break;
				case 7 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:452:5: annotation
					{
					pushFollow(FOLLOW_annotation_in_smali_file1193);
					annotation7=annotation();
					state._fsp--;

					stream_annotation.add(annotation7.getTree());
					smali_file_stack.peek().classAnnotations.add((annotation7!=null?((CommonTree)annotation7.getTree()):null));
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_smali_file1204);  
			stream_EOF.add(EOF8);


			    if (!smali_file_stack.peek().hasClassSpec) {
			      throw new SemanticException(input, "The file must contain a .class directive");
			    }

			    if (!smali_file_stack.peek().hasSuperSpec) {
			      if (!(class_spec1!=null?((smaliParser.class_spec_return)class_spec1).className:null).equals("Ljava/lang/Object;")) {
			        throw new SemanticException(input, "The file must contain a .super directive");
			      }
			    }
			  
			// AST REWRITE
			// elements: super_spec, implements_spec, field, class_spec, method, source_spec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 466:3: -> ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:466:6: ^( I_CLASS_DEF class_spec ( super_spec )? ( implements_spec )* ( source_spec )? ^( I_METHODS ( method )* ) ^( I_FIELDS ( field )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CLASS_DEF, "I_CLASS_DEF"), root_1);
				adaptor.addChild(root_1, stream_class_spec.nextTree());
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:468:8: ( super_spec )?
				if ( stream_super_spec.hasNext() ) {
					adaptor.addChild(root_1, stream_super_spec.nextTree());
				}
				stream_super_spec.reset();

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:469:8: ( implements_spec )*
				while ( stream_implements_spec.hasNext() ) {
					adaptor.addChild(root_1, stream_implements_spec.nextTree());
				}
				stream_implements_spec.reset();

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:470:8: ( source_spec )?
				if ( stream_source_spec.hasNext() ) {
					adaptor.addChild(root_1, stream_source_spec.nextTree());
				}
				stream_source_spec.reset();

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:471:8: ^( I_METHODS ( method )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHODS, "I_METHODS"), root_2);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:471:20: ( method )*
				while ( stream_method.hasNext() ) {
					adaptor.addChild(root_2, stream_method.nextTree());
				}
				stream_method.reset();

				adaptor.addChild(root_1, root_2);
				}

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:471:29: ^( I_FIELDS ( field )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELDS, "I_FIELDS"), root_2);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:471:40: ( field )*
				while ( stream_field.hasNext() ) {
					adaptor.addChild(root_2, stream_field.nextTree());
				}
				stream_field.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, buildTree(I_ANNOTATIONS, "I_ANNOTATIONS", smali_file_stack.peek().classAnnotations));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			smali_file_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "smali_file"


	public static class class_spec_return extends ParserRuleReturnScope {
		public String className;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "class_spec"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:473:1: class_spec returns [String className] : CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR -> CLASS_DESCRIPTOR access_list ;
	public final smaliParser.class_spec_return class_spec() throws RecognitionException {
		smaliParser.class_spec_return retval = new smaliParser.class_spec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CLASS_DIRECTIVE9=null;
		Token CLASS_DESCRIPTOR11=null;
		ParserRuleReturnScope access_list10 =null;

		CommonTree CLASS_DIRECTIVE9_tree=null;
		CommonTree CLASS_DESCRIPTOR11_tree=null;
		RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");
		RewriteRuleTokenStream stream_CLASS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token CLASS_DIRECTIVE");
		RewriteRuleSubtreeStream stream_access_list=new RewriteRuleSubtreeStream(adaptor,"rule access_list");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:474:3: ( CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR -> CLASS_DESCRIPTOR access_list )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:474:5: CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR
			{
			CLASS_DIRECTIVE9=(Token)match(input,CLASS_DIRECTIVE,FOLLOW_CLASS_DIRECTIVE_in_class_spec1291);  
			stream_CLASS_DIRECTIVE.add(CLASS_DIRECTIVE9);

			pushFollow(FOLLOW_access_list_in_class_spec1293);
			access_list10=access_list();
			state._fsp--;

			stream_access_list.add(access_list10.getTree());
			CLASS_DESCRIPTOR11=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_class_spec1295);  
			stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR11);

			retval.className = (CLASS_DESCRIPTOR11!=null?CLASS_DESCRIPTOR11.getText():null);
			// AST REWRITE
			// elements: CLASS_DESCRIPTOR, access_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 474:89: -> CLASS_DESCRIPTOR access_list
			{
				adaptor.addChild(root_0, stream_CLASS_DESCRIPTOR.nextNode());
				adaptor.addChild(root_0, stream_access_list.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "class_spec"


	public static class super_spec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "super_spec"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:476:1: super_spec : SUPER_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR ) ;
	public final smaliParser.super_spec_return super_spec() throws RecognitionException {
		smaliParser.super_spec_return retval = new smaliParser.super_spec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUPER_DIRECTIVE12=null;
		Token CLASS_DESCRIPTOR13=null;

		CommonTree SUPER_DIRECTIVE12_tree=null;
		CommonTree CLASS_DESCRIPTOR13_tree=null;
		RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");
		RewriteRuleTokenStream stream_SUPER_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SUPER_DIRECTIVE");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:477:3: ( SUPER_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:477:5: SUPER_DIRECTIVE CLASS_DESCRIPTOR
			{
			SUPER_DIRECTIVE12=(Token)match(input,SUPER_DIRECTIVE,FOLLOW_SUPER_DIRECTIVE_in_super_spec1313);  
			stream_SUPER_DIRECTIVE.add(SUPER_DIRECTIVE12);

			CLASS_DESCRIPTOR13=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_super_spec1315);  
			stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR13);

			// AST REWRITE
			// elements: CLASS_DESCRIPTOR
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 477:38: -> ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:477:41: ^( I_SUPER[$start, \"I_SUPER\"] CLASS_DESCRIPTOR )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SUPER, (retval.start), "I_SUPER"), root_1);
				adaptor.addChild(root_1, stream_CLASS_DESCRIPTOR.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "super_spec"


	public static class implements_spec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "implements_spec"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:479:1: implements_spec : IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR ) ;
	public final smaliParser.implements_spec_return implements_spec() throws RecognitionException {
		smaliParser.implements_spec_return retval = new smaliParser.implements_spec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IMPLEMENTS_DIRECTIVE14=null;
		Token CLASS_DESCRIPTOR15=null;

		CommonTree IMPLEMENTS_DIRECTIVE14_tree=null;
		CommonTree CLASS_DESCRIPTOR15_tree=null;
		RewriteRuleTokenStream stream_IMPLEMENTS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS_DIRECTIVE");
		RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:480:3: ( IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR -> ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:480:5: IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR
			{
			IMPLEMENTS_DIRECTIVE14=(Token)match(input,IMPLEMENTS_DIRECTIVE,FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec1334);  
			stream_IMPLEMENTS_DIRECTIVE.add(IMPLEMENTS_DIRECTIVE14);

			CLASS_DESCRIPTOR15=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_implements_spec1336);  
			stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR15);

			// AST REWRITE
			// elements: CLASS_DESCRIPTOR
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 480:43: -> ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:480:46: ^( I_IMPLEMENTS[$start, \"I_IMPLEMENTS\"] CLASS_DESCRIPTOR )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_IMPLEMENTS, (retval.start), "I_IMPLEMENTS"), root_1);
				adaptor.addChild(root_1, stream_CLASS_DESCRIPTOR.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "implements_spec"


	public static class source_spec_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "source_spec"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:482:1: source_spec : SOURCE_DIRECTIVE STRING_LITERAL -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL ) ;
	public final smaliParser.source_spec_return source_spec() throws RecognitionException {
		smaliParser.source_spec_return retval = new smaliParser.source_spec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SOURCE_DIRECTIVE16=null;
		Token STRING_LITERAL17=null;

		CommonTree SOURCE_DIRECTIVE16_tree=null;
		CommonTree STRING_LITERAL17_tree=null;
		RewriteRuleTokenStream stream_SOURCE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SOURCE_DIRECTIVE");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:483:3: ( SOURCE_DIRECTIVE STRING_LITERAL -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:483:5: SOURCE_DIRECTIVE STRING_LITERAL
			{
			SOURCE_DIRECTIVE16=(Token)match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_spec1355);  
			stream_SOURCE_DIRECTIVE.add(SOURCE_DIRECTIVE16);

			STRING_LITERAL17=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_spec1357);  
			stream_STRING_LITERAL.add(STRING_LITERAL17);

			// AST REWRITE
			// elements: STRING_LITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 483:37: -> ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:483:40: ^( I_SOURCE[$start, \"I_SOURCE\"] STRING_LITERAL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SOURCE, (retval.start), "I_SOURCE"), root_1);
				adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "source_spec"


	public static class access_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "access_list"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:485:1: access_list : ( ACCESS_SPEC )* -> ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* ) ;
	public final smaliParser.access_list_return access_list() throws RecognitionException {
		smaliParser.access_list_return retval = new smaliParser.access_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ACCESS_SPEC18=null;

		CommonTree ACCESS_SPEC18_tree=null;
		RewriteRuleTokenStream stream_ACCESS_SPEC=new RewriteRuleTokenStream(adaptor,"token ACCESS_SPEC");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:486:3: ( ( ACCESS_SPEC )* -> ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:486:5: ( ACCESS_SPEC )*
			{
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:486:5: ( ACCESS_SPEC )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ACCESS_SPEC) ) {
					int LA2_2 = input.LA(2);
					if ( (LA2_2==ACCESS_SPEC||LA2_2==ANNOTATION_VISIBILITY||LA2_2==BOOL_LITERAL||LA2_2==CLASS_DESCRIPTOR||LA2_2==DOUBLE_LITERAL_OR_ID||LA2_2==FLOAT_LITERAL_OR_ID||(LA2_2 >= INSTRUCTION_FORMAT10t && LA2_2 <= INSTRUCTION_FORMAT10x_ODEX)||LA2_2==INSTRUCTION_FORMAT11x||LA2_2==INSTRUCTION_FORMAT12x_OR_ID||(LA2_2 >= INSTRUCTION_FORMAT21c_FIELD && LA2_2 <= INSTRUCTION_FORMAT21c_TYPE)||LA2_2==INSTRUCTION_FORMAT21t||(LA2_2 >= INSTRUCTION_FORMAT22c_FIELD && LA2_2 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA2_2 >= INSTRUCTION_FORMAT22s_OR_ID && LA2_2 <= INSTRUCTION_FORMAT22t)||LA2_2==INSTRUCTION_FORMAT23x||(LA2_2 >= INSTRUCTION_FORMAT31i_OR_ID && LA2_2 <= INSTRUCTION_FORMAT31t)||(LA2_2 >= INSTRUCTION_FORMAT35c_METHOD && LA2_2 <= INSTRUCTION_FORMAT35ms_METHOD)||LA2_2==INSTRUCTION_FORMAT51l||LA2_2==MEMBER_NAME||(LA2_2 >= NEGATIVE_INTEGER_LITERAL && LA2_2 <= NULL_LITERAL)||(LA2_2 >= PARAM_LIST_OR_ID && LA2_2 <= PRIMITIVE_TYPE)||LA2_2==REGISTER||LA2_2==SIMPLE_NAME||(LA2_2 >= VERIFICATION_ERROR_TYPE && LA2_2 <= VOID_TYPE)) ) {
						alt2=1;
					}

				}

				switch (alt2) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:486:5: ACCESS_SPEC
					{
					ACCESS_SPEC18=(Token)match(input,ACCESS_SPEC,FOLLOW_ACCESS_SPEC_in_access_list1376);  
					stream_ACCESS_SPEC.add(ACCESS_SPEC18);

					}
					break;

				default :
					break loop2;
				}
			}

			// AST REWRITE
			// elements: ACCESS_SPEC
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 486:18: -> ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:486:21: ^( I_ACCESS_LIST[$start,\"I_ACCESS_LIST\"] ( ACCESS_SPEC )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ACCESS_LIST, (retval.start), "I_ACCESS_LIST"), root_1);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:486:61: ( ACCESS_SPEC )*
				while ( stream_ACCESS_SPEC.hasNext() ) {
					adaptor.addChild(root_1, stream_ACCESS_SPEC.nextNode());
				}
				stream_ACCESS_SPEC.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "access_list"


	public static class field_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:493:1: field : FIELD_DIRECTIVE access_list member_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) ) ;
	public final smaliParser.field_return field() throws RecognitionException {
		smaliParser.field_return retval = new smaliParser.field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FIELD_DIRECTIVE19=null;
		Token COLON22=null;
		Token EQUAL24=null;
		Token END_FIELD_DIRECTIVE27=null;
		ParserRuleReturnScope access_list20 =null;
		ParserRuleReturnScope member_name21 =null;
		ParserRuleReturnScope nonvoid_type_descriptor23 =null;
		ParserRuleReturnScope literal25 =null;
		ParserRuleReturnScope annotation26 =null;

		CommonTree FIELD_DIRECTIVE19_tree=null;
		CommonTree COLON22_tree=null;
		CommonTree EQUAL24_tree=null;
		CommonTree END_FIELD_DIRECTIVE27_tree=null;
		RewriteRuleTokenStream stream_END_FIELD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_FIELD_DIRECTIVE");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_FIELD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token FIELD_DIRECTIVE");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_access_list=new RewriteRuleSubtreeStream(adaptor,"rule access_list");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
		RewriteRuleSubtreeStream stream_member_name=new RewriteRuleSubtreeStream(adaptor,"rule member_name");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		List<CommonTree> annotations = new ArrayList<CommonTree>();
		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:495:3: ( FIELD_DIRECTIVE access_list member_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:495:5: FIELD_DIRECTIVE access_list member_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) )
			{
			FIELD_DIRECTIVE19=(Token)match(input,FIELD_DIRECTIVE,FOLLOW_FIELD_DIRECTIVE_in_field1407);  
			stream_FIELD_DIRECTIVE.add(FIELD_DIRECTIVE19);

			pushFollow(FOLLOW_access_list_in_field1409);
			access_list20=access_list();
			state._fsp--;

			stream_access_list.add(access_list20.getTree());
			pushFollow(FOLLOW_member_name_in_field1411);
			member_name21=member_name();
			state._fsp--;

			stream_member_name.add(member_name21.getTree());
			COLON22=(Token)match(input,COLON,FOLLOW_COLON_in_field1413);  
			stream_COLON.add(COLON22);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_field1415);
			nonvoid_type_descriptor23=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor23.getTree());
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:495:75: ( EQUAL literal )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==EQUAL) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:495:76: EQUAL literal
					{
					EQUAL24=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_field1418);  
					stream_EQUAL.add(EQUAL24);

					pushFollow(FOLLOW_literal_in_field1420);
					literal25=literal();
					state._fsp--;

					stream_literal.add(literal25.getTree());
					}
					break;

			}

			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:496:5: ( ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:496:7: ({...}? annotation )* ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) )
			{
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:496:7: ({...}? annotation )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==ANNOTATION_DIRECTIVE) ) {
					int LA4_9 = input.LA(2);
					if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
						alt4=1;
					}

				}

				switch (alt4) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:496:8: {...}? annotation
					{
					if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
						throw new FailedPredicateException(input, "field", "input.LA(1) == ANNOTATION_DIRECTIVE");
					}
					pushFollow(FOLLOW_annotation_in_field1433);
					annotation26=annotation();
					state._fsp--;

					stream_annotation.add(annotation26.getTree());
					annotations.add((annotation26!=null?((CommonTree)annotation26.getTree()):null));
					}
					break;

				default :
					break loop4;
				}
			}

			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:497:7: ( END_FIELD_DIRECTIVE -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==END_FIELD_DIRECTIVE) ) {
				alt5=1;
			}
			else if ( (LA5_0==EOF||LA5_0==ANNOTATION_DIRECTIVE||LA5_0==CLASS_DIRECTIVE||LA5_0==FIELD_DIRECTIVE||LA5_0==IMPLEMENTS_DIRECTIVE||LA5_0==METHOD_DIRECTIVE||LA5_0==SOURCE_DIRECTIVE||LA5_0==SUPER_DIRECTIVE) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:497:9: END_FIELD_DIRECTIVE
					{
					END_FIELD_DIRECTIVE27=(Token)match(input,END_FIELD_DIRECTIVE,FOLLOW_END_FIELD_DIRECTIVE_in_field1447);  
					stream_END_FIELD_DIRECTIVE.add(END_FIELD_DIRECTIVE27);

					// AST REWRITE
					// elements: literal, access_list, annotation, member_name, nonvoid_type_descriptor
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 498:9: -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) )
					{
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:498:12: ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ( annotation )* ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD, (retval.start), "I_FIELD"), root_1);
						adaptor.addChild(root_1, stream_member_name.nextTree());
						adaptor.addChild(root_1, stream_access_list.nextTree());
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:498:65: ^( I_FIELD_TYPE nonvoid_type_descriptor )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_TYPE, "I_FIELD_TYPE"), root_2);
						adaptor.addChild(root_2, stream_nonvoid_type_descriptor.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:498:105: ( ^( I_FIELD_INITIAL_VALUE literal ) )?
						if ( stream_literal.hasNext() ) {
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:498:105: ^( I_FIELD_INITIAL_VALUE literal )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_INITIAL_VALUE, "I_FIELD_INITIAL_VALUE"), root_2);
							adaptor.addChild(root_2, stream_literal.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_literal.reset();

						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:498:139: ^( I_ANNOTATIONS ( annotation )* )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:498:155: ( annotation )*
						while ( stream_annotation.hasNext() ) {
							adaptor.addChild(root_2, stream_annotation.nextTree());
						}
						stream_annotation.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:499:21: 
					{
					smali_file_stack.peek().classAnnotations.addAll(annotations);
					// AST REWRITE
					// elements: member_name, literal, access_list, nonvoid_type_descriptor
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 500:9: -> ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) )
					{
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:500:12: ^( I_FIELD[$start, \"I_FIELD\"] member_name access_list ^( I_FIELD_TYPE nonvoid_type_descriptor ) ( ^( I_FIELD_INITIAL_VALUE literal ) )? ^( I_ANNOTATIONS ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD, (retval.start), "I_FIELD"), root_1);
						adaptor.addChild(root_1, stream_member_name.nextTree());
						adaptor.addChild(root_1, stream_access_list.nextTree());
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:500:65: ^( I_FIELD_TYPE nonvoid_type_descriptor )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_TYPE, "I_FIELD_TYPE"), root_2);
						adaptor.addChild(root_2, stream_nonvoid_type_descriptor.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:500:105: ( ^( I_FIELD_INITIAL_VALUE literal ) )?
						if ( stream_literal.hasNext() ) {
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:500:105: ^( I_FIELD_INITIAL_VALUE literal )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_FIELD_INITIAL_VALUE, "I_FIELD_INITIAL_VALUE"), root_2);
							adaptor.addChild(root_2, stream_literal.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_literal.reset();

						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:500:139: ^( I_ANNOTATIONS )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field"


	public static class method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "method"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:504:1: method : METHOD_DIRECTIVE access_list member_name method_prototype statements_and_directives END_METHOD_DIRECTIVE -> ^( I_METHOD[$start, \"I_METHOD\"] member_name method_prototype access_list statements_and_directives ) ;
	public final smaliParser.method_return method() throws RecognitionException {
		smaliParser.method_return retval = new smaliParser.method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token METHOD_DIRECTIVE28=null;
		Token END_METHOD_DIRECTIVE33=null;
		ParserRuleReturnScope access_list29 =null;
		ParserRuleReturnScope member_name30 =null;
		ParserRuleReturnScope method_prototype31 =null;
		ParserRuleReturnScope statements_and_directives32 =null;

		CommonTree METHOD_DIRECTIVE28_tree=null;
		CommonTree END_METHOD_DIRECTIVE33_tree=null;
		RewriteRuleTokenStream stream_END_METHOD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_METHOD_DIRECTIVE");
		RewriteRuleTokenStream stream_METHOD_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token METHOD_DIRECTIVE");
		RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
		RewriteRuleSubtreeStream stream_access_list=new RewriteRuleSubtreeStream(adaptor,"rule access_list");
		RewriteRuleSubtreeStream stream_member_name=new RewriteRuleSubtreeStream(adaptor,"rule member_name");
		RewriteRuleSubtreeStream stream_statements_and_directives=new RewriteRuleSubtreeStream(adaptor,"rule statements_and_directives");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:505:3: ( METHOD_DIRECTIVE access_list member_name method_prototype statements_and_directives END_METHOD_DIRECTIVE -> ^( I_METHOD[$start, \"I_METHOD\"] member_name method_prototype access_list statements_and_directives ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:505:5: METHOD_DIRECTIVE access_list member_name method_prototype statements_and_directives END_METHOD_DIRECTIVE
			{
			METHOD_DIRECTIVE28=(Token)match(input,METHOD_DIRECTIVE,FOLLOW_METHOD_DIRECTIVE_in_method1558);  
			stream_METHOD_DIRECTIVE.add(METHOD_DIRECTIVE28);

			pushFollow(FOLLOW_access_list_in_method1560);
			access_list29=access_list();
			state._fsp--;

			stream_access_list.add(access_list29.getTree());
			pushFollow(FOLLOW_member_name_in_method1562);
			member_name30=member_name();
			state._fsp--;

			stream_member_name.add(member_name30.getTree());
			pushFollow(FOLLOW_method_prototype_in_method1564);
			method_prototype31=method_prototype();
			state._fsp--;

			stream_method_prototype.add(method_prototype31.getTree());
			pushFollow(FOLLOW_statements_and_directives_in_method1566);
			statements_and_directives32=statements_and_directives();
			state._fsp--;

			stream_statements_and_directives.add(statements_and_directives32.getTree());
			END_METHOD_DIRECTIVE33=(Token)match(input,END_METHOD_DIRECTIVE,FOLLOW_END_METHOD_DIRECTIVE_in_method1572);  
			stream_END_METHOD_DIRECTIVE.add(END_METHOD_DIRECTIVE33);

			// AST REWRITE
			// elements: statements_and_directives, member_name, access_list, method_prototype
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 507:5: -> ^( I_METHOD[$start, \"I_METHOD\"] member_name method_prototype access_list statements_and_directives )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:507:8: ^( I_METHOD[$start, \"I_METHOD\"] member_name method_prototype access_list statements_and_directives )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHOD, (retval.start), "I_METHOD"), root_1);
				adaptor.addChild(root_1, stream_member_name.nextTree());
				adaptor.addChild(root_1, stream_method_prototype.nextTree());
				adaptor.addChild(root_1, stream_access_list.nextTree());
				adaptor.addChild(root_1, stream_statements_and_directives.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "method"


	protected static class statements_and_directives_scope {
		boolean hasRegistersDirective;
		List<CommonTree> methodAnnotations;
	}
	protected Stack<statements_and_directives_scope> statements_and_directives_stack = new Stack<statements_and_directives_scope>();

	public static class statements_and_directives_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statements_and_directives"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:509:1: statements_and_directives : ( ordered_method_item | registers_directive | catch_directive | catchall_directive | parameter_directive | annotation )* -> ( registers_directive )? ^( I_ORDERED_METHOD_ITEMS ( ordered_method_item )* ) ^( I_CATCHES ( catch_directive )* ( catchall_directive )* ) ^( I_PARAMETERS ( parameter_directive )* ) ;
	public final smaliParser.statements_and_directives_return statements_and_directives() throws RecognitionException {
		statements_and_directives_stack.push(new statements_and_directives_scope());
		smaliParser.statements_and_directives_return retval = new smaliParser.statements_and_directives_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope ordered_method_item34 =null;
		ParserRuleReturnScope registers_directive35 =null;
		ParserRuleReturnScope catch_directive36 =null;
		ParserRuleReturnScope catchall_directive37 =null;
		ParserRuleReturnScope parameter_directive38 =null;
		ParserRuleReturnScope annotation39 =null;

		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");
		RewriteRuleSubtreeStream stream_catchall_directive=new RewriteRuleSubtreeStream(adaptor,"rule catchall_directive");
		RewriteRuleSubtreeStream stream_registers_directive=new RewriteRuleSubtreeStream(adaptor,"rule registers_directive");
		RewriteRuleSubtreeStream stream_catch_directive=new RewriteRuleSubtreeStream(adaptor,"rule catch_directive");
		RewriteRuleSubtreeStream stream_ordered_method_item=new RewriteRuleSubtreeStream(adaptor,"rule ordered_method_item");
		RewriteRuleSubtreeStream stream_parameter_directive=new RewriteRuleSubtreeStream(adaptor,"rule parameter_directive");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:515:3: ( ( ordered_method_item | registers_directive | catch_directive | catchall_directive | parameter_directive | annotation )* -> ( registers_directive )? ^( I_ORDERED_METHOD_ITEMS ( ordered_method_item )* ) ^( I_CATCHES ( catch_directive )* ( catchall_directive )* ) ^( I_PARAMETERS ( parameter_directive )* ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:515:5: ( ordered_method_item | registers_directive | catch_directive | catchall_directive | parameter_directive | annotation )*
			{

			      statements_and_directives_stack.peek().hasRegistersDirective = false;
			      statements_and_directives_stack.peek().methodAnnotations = new ArrayList<CommonTree>();
			    
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:519:5: ( ordered_method_item | registers_directive | catch_directive | catchall_directive | parameter_directive | annotation )*
			loop6:
			while (true) {
				int alt6=7;
				switch ( input.LA(1) ) {
				case ARRAY_DATA_DIRECTIVE:
				case COLON:
				case END_LOCAL_DIRECTIVE:
				case EPILOGUE_DIRECTIVE:
				case INSTRUCTION_FORMAT10t:
				case INSTRUCTION_FORMAT10x:
				case INSTRUCTION_FORMAT10x_ODEX:
				case INSTRUCTION_FORMAT11n:
				case INSTRUCTION_FORMAT11x:
				case INSTRUCTION_FORMAT12x:
				case INSTRUCTION_FORMAT12x_OR_ID:
				case INSTRUCTION_FORMAT20bc:
				case INSTRUCTION_FORMAT20t:
				case INSTRUCTION_FORMAT21c_FIELD:
				case INSTRUCTION_FORMAT21c_FIELD_ODEX:
				case INSTRUCTION_FORMAT21c_STRING:
				case INSTRUCTION_FORMAT21c_TYPE:
				case INSTRUCTION_FORMAT21ih:
				case INSTRUCTION_FORMAT21lh:
				case INSTRUCTION_FORMAT21s:
				case INSTRUCTION_FORMAT21t:
				case INSTRUCTION_FORMAT22b:
				case INSTRUCTION_FORMAT22c_FIELD:
				case INSTRUCTION_FORMAT22c_FIELD_ODEX:
				case INSTRUCTION_FORMAT22c_TYPE:
				case INSTRUCTION_FORMAT22cs_FIELD:
				case INSTRUCTION_FORMAT22s:
				case INSTRUCTION_FORMAT22s_OR_ID:
				case INSTRUCTION_FORMAT22t:
				case INSTRUCTION_FORMAT22x:
				case INSTRUCTION_FORMAT23x:
				case INSTRUCTION_FORMAT30t:
				case INSTRUCTION_FORMAT31c:
				case INSTRUCTION_FORMAT31i:
				case INSTRUCTION_FORMAT31i_OR_ID:
				case INSTRUCTION_FORMAT31t:
				case INSTRUCTION_FORMAT32x:
				case INSTRUCTION_FORMAT35c_METHOD:
				case INSTRUCTION_FORMAT35c_METHOD_ODEX:
				case INSTRUCTION_FORMAT35c_TYPE:
				case INSTRUCTION_FORMAT35mi_METHOD:
				case INSTRUCTION_FORMAT35ms_METHOD:
				case INSTRUCTION_FORMAT3rc_METHOD:
				case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
				case INSTRUCTION_FORMAT3rc_TYPE:
				case INSTRUCTION_FORMAT3rmi_METHOD:
				case INSTRUCTION_FORMAT3rms_METHOD:
				case INSTRUCTION_FORMAT51l:
				case LINE_DIRECTIVE:
				case LOCAL_DIRECTIVE:
				case PACKED_SWITCH_DIRECTIVE:
				case PROLOGUE_DIRECTIVE:
				case RESTART_LOCAL_DIRECTIVE:
				case SOURCE_DIRECTIVE:
				case SPARSE_SWITCH_DIRECTIVE:
					{
					alt6=1;
					}
					break;
				case LOCALS_DIRECTIVE:
				case REGISTERS_DIRECTIVE:
					{
					alt6=2;
					}
					break;
				case CATCH_DIRECTIVE:
					{
					alt6=3;
					}
					break;
				case CATCHALL_DIRECTIVE:
					{
					alt6=4;
					}
					break;
				case PARAMETER_DIRECTIVE:
					{
					alt6=5;
					}
					break;
				case ANNOTATION_DIRECTIVE:
					{
					alt6=6;
					}
					break;
				}
				switch (alt6) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:519:7: ordered_method_item
					{
					pushFollow(FOLLOW_ordered_method_item_in_statements_and_directives1617);
					ordered_method_item34=ordered_method_item();
					state._fsp--;

					stream_ordered_method_item.add(ordered_method_item34.getTree());
					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:520:7: registers_directive
					{
					pushFollow(FOLLOW_registers_directive_in_statements_and_directives1625);
					registers_directive35=registers_directive();
					state._fsp--;

					stream_registers_directive.add(registers_directive35.getTree());
					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:521:7: catch_directive
					{
					pushFollow(FOLLOW_catch_directive_in_statements_and_directives1633);
					catch_directive36=catch_directive();
					state._fsp--;

					stream_catch_directive.add(catch_directive36.getTree());
					}
					break;
				case 4 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:522:7: catchall_directive
					{
					pushFollow(FOLLOW_catchall_directive_in_statements_and_directives1641);
					catchall_directive37=catchall_directive();
					state._fsp--;

					stream_catchall_directive.add(catchall_directive37.getTree());
					}
					break;
				case 5 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:523:7: parameter_directive
					{
					pushFollow(FOLLOW_parameter_directive_in_statements_and_directives1649);
					parameter_directive38=parameter_directive();
					state._fsp--;

					stream_parameter_directive.add(parameter_directive38.getTree());
					}
					break;
				case 6 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:524:7: annotation
					{
					pushFollow(FOLLOW_annotation_in_statements_and_directives1657);
					annotation39=annotation();
					state._fsp--;

					stream_annotation.add(annotation39.getTree());
					statements_and_directives_stack.peek().methodAnnotations.add((annotation39!=null?((CommonTree)annotation39.getTree()):null));
					}
					break;

				default :
					break loop6;
				}
			}

			// AST REWRITE
			// elements: catch_directive, catchall_directive, registers_directive, parameter_directive, ordered_method_item
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 526:5: -> ( registers_directive )? ^( I_ORDERED_METHOD_ITEMS ( ordered_method_item )* ) ^( I_CATCHES ( catch_directive )* ( catchall_directive )* ) ^( I_PARAMETERS ( parameter_directive )* )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:526:8: ( registers_directive )?
				if ( stream_registers_directive.hasNext() ) {
					adaptor.addChild(root_0, stream_registers_directive.nextTree());
				}
				stream_registers_directive.reset();

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:527:8: ^( I_ORDERED_METHOD_ITEMS ( ordered_method_item )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ORDERED_METHOD_ITEMS, "I_ORDERED_METHOD_ITEMS"), root_1);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:527:33: ( ordered_method_item )*
				while ( stream_ordered_method_item.hasNext() ) {
					adaptor.addChild(root_1, stream_ordered_method_item.nextTree());
				}
				stream_ordered_method_item.reset();

				adaptor.addChild(root_0, root_1);
				}

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:528:8: ^( I_CATCHES ( catch_directive )* ( catchall_directive )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CATCHES, "I_CATCHES"), root_1);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:528:20: ( catch_directive )*
				while ( stream_catch_directive.hasNext() ) {
					adaptor.addChild(root_1, stream_catch_directive.nextTree());
				}
				stream_catch_directive.reset();

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:528:37: ( catchall_directive )*
				while ( stream_catchall_directive.hasNext() ) {
					adaptor.addChild(root_1, stream_catchall_directive.nextTree());
				}
				stream_catchall_directive.reset();

				adaptor.addChild(root_0, root_1);
				}

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:529:8: ^( I_PARAMETERS ( parameter_directive )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PARAMETERS, "I_PARAMETERS"), root_1);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:529:23: ( parameter_directive )*
				while ( stream_parameter_directive.hasNext() ) {
					adaptor.addChild(root_1, stream_parameter_directive.nextTree());
				}
				stream_parameter_directive.reset();

				adaptor.addChild(root_0, root_1);
				}

				adaptor.addChild(root_0, buildTree(I_ANNOTATIONS, "I_ANNOTATIONS", statements_and_directives_stack.peek().methodAnnotations));
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			statements_and_directives_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "statements_and_directives"


	public static class ordered_method_item_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ordered_method_item"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:533:1: ordered_method_item : ( label | instruction | debug_directive );
	public final smaliParser.ordered_method_item_return ordered_method_item() throws RecognitionException {
		smaliParser.ordered_method_item_return retval = new smaliParser.ordered_method_item_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope label40 =null;
		ParserRuleReturnScope instruction41 =null;
		ParserRuleReturnScope debug_directive42 =null;


		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:534:3: ( label | instruction | debug_directive )
			int alt7=3;
			switch ( input.LA(1) ) {
			case COLON:
				{
				alt7=1;
				}
				break;
			case ARRAY_DATA_DIRECTIVE:
			case INSTRUCTION_FORMAT10t:
			case INSTRUCTION_FORMAT10x:
			case INSTRUCTION_FORMAT10x_ODEX:
			case INSTRUCTION_FORMAT11n:
			case INSTRUCTION_FORMAT11x:
			case INSTRUCTION_FORMAT12x:
			case INSTRUCTION_FORMAT12x_OR_ID:
			case INSTRUCTION_FORMAT20bc:
			case INSTRUCTION_FORMAT20t:
			case INSTRUCTION_FORMAT21c_FIELD:
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
			case INSTRUCTION_FORMAT21c_STRING:
			case INSTRUCTION_FORMAT21c_TYPE:
			case INSTRUCTION_FORMAT21ih:
			case INSTRUCTION_FORMAT21lh:
			case INSTRUCTION_FORMAT21s:
			case INSTRUCTION_FORMAT21t:
			case INSTRUCTION_FORMAT22b:
			case INSTRUCTION_FORMAT22c_FIELD:
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
			case INSTRUCTION_FORMAT22c_TYPE:
			case INSTRUCTION_FORMAT22cs_FIELD:
			case INSTRUCTION_FORMAT22s:
			case INSTRUCTION_FORMAT22s_OR_ID:
			case INSTRUCTION_FORMAT22t:
			case INSTRUCTION_FORMAT22x:
			case INSTRUCTION_FORMAT23x:
			case INSTRUCTION_FORMAT30t:
			case INSTRUCTION_FORMAT31c:
			case INSTRUCTION_FORMAT31i:
			case INSTRUCTION_FORMAT31i_OR_ID:
			case INSTRUCTION_FORMAT31t:
			case INSTRUCTION_FORMAT32x:
			case INSTRUCTION_FORMAT35c_METHOD:
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
			case INSTRUCTION_FORMAT35c_TYPE:
			case INSTRUCTION_FORMAT35mi_METHOD:
			case INSTRUCTION_FORMAT35ms_METHOD:
			case INSTRUCTION_FORMAT3rc_METHOD:
			case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
			case INSTRUCTION_FORMAT3rc_TYPE:
			case INSTRUCTION_FORMAT3rmi_METHOD:
			case INSTRUCTION_FORMAT3rms_METHOD:
			case INSTRUCTION_FORMAT51l:
			case PACKED_SWITCH_DIRECTIVE:
			case SPARSE_SWITCH_DIRECTIVE:
				{
				alt7=2;
				}
				break;
			case END_LOCAL_DIRECTIVE:
			case EPILOGUE_DIRECTIVE:
			case LINE_DIRECTIVE:
			case LOCAL_DIRECTIVE:
			case PROLOGUE_DIRECTIVE:
			case RESTART_LOCAL_DIRECTIVE:
			case SOURCE_DIRECTIVE:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:534:5: label
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_label_in_ordered_method_item1742);
					label40=label();
					state._fsp--;

					adaptor.addChild(root_0, label40.getTree());

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:535:5: instruction
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_instruction_in_ordered_method_item1748);
					instruction41=instruction();
					state._fsp--;

					adaptor.addChild(root_0, instruction41.getTree());

					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:536:5: debug_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_debug_directive_in_ordered_method_item1754);
					debug_directive42=debug_directive();
					state._fsp--;

					adaptor.addChild(root_0, debug_directive42.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ordered_method_item"


	public static class registers_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "registers_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:538:1: registers_directive : (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) |directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) ) ;
	public final smaliParser.registers_directive_return registers_directive() throws RecognitionException {
		smaliParser.registers_directive_return retval = new smaliParser.registers_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token directive=null;
		ParserRuleReturnScope regCount =null;
		ParserRuleReturnScope regCount2 =null;

		CommonTree directive_tree=null;
		RewriteRuleTokenStream stream_LOCALS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token LOCALS_DIRECTIVE");
		RewriteRuleTokenStream stream_REGISTERS_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token REGISTERS_DIRECTIVE");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:539:3: ( (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) |directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:539:5: (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) |directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) )
			{
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:539:5: (directive= REGISTERS_DIRECTIVE regCount= integral_literal -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount) |directive= LOCALS_DIRECTIVE regCount2= integral_literal -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==REGISTERS_DIRECTIVE) ) {
				alt8=1;
			}
			else if ( (LA8_0==LOCALS_DIRECTIVE) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:540:7: directive= REGISTERS_DIRECTIVE regCount= integral_literal
					{
					directive=(Token)match(input,REGISTERS_DIRECTIVE,FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive1774);  
					stream_REGISTERS_DIRECTIVE.add(directive);

					pushFollow(FOLLOW_integral_literal_in_registers_directive1778);
					regCount=integral_literal();
					state._fsp--;

					stream_integral_literal.add(regCount.getTree());
					// AST REWRITE
					// elements: regCount
					// token labels: 
					// rule labels: regCount, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_regCount=new RewriteRuleSubtreeStream(adaptor,"rule regCount",regCount!=null?regCount.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 540:63: -> ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount)
					{
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:540:66: ^( I_REGISTERS[$REGISTERS_DIRECTIVE, \"I_REGISTERS\"] $regCount)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTERS, directive, "I_REGISTERS"), root_1);
						adaptor.addChild(root_1, stream_regCount.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:541:7: directive= LOCALS_DIRECTIVE regCount2= integral_literal
					{
					directive=(Token)match(input,LOCALS_DIRECTIVE,FOLLOW_LOCALS_DIRECTIVE_in_registers_directive1798);  
					stream_LOCALS_DIRECTIVE.add(directive);

					pushFollow(FOLLOW_integral_literal_in_registers_directive1802);
					regCount2=integral_literal();
					state._fsp--;

					stream_integral_literal.add(regCount2.getTree());
					// AST REWRITE
					// elements: regCount2
					// token labels: 
					// rule labels: regCount2, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_regCount2=new RewriteRuleSubtreeStream(adaptor,"rule regCount2",regCount2!=null?regCount2.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 541:61: -> ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2)
					{
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:541:64: ^( I_LOCALS[$LOCALS_DIRECTIVE, \"I_LOCALS\"] $regCount2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LOCALS, directive, "I_LOCALS"), root_1);
						adaptor.addChild(root_1, stream_regCount2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}


			      if (statements_and_directives_stack.peek().hasRegistersDirective) {
			        throw new SemanticException(input, directive, "There can only be a single .registers or .locals directive in a method");
			      }
			      statements_and_directives_stack.peek().hasRegistersDirective =true;
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "registers_directive"


	public static class simple_name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "simple_name"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:552:1: simple_name : ( SIMPLE_NAME | ACCESS_SPEC -> SIMPLE_NAME[$ACCESS_SPEC] | VERIFICATION_ERROR_TYPE -> SIMPLE_NAME[$VERIFICATION_ERROR_TYPE] | POSITIVE_INTEGER_LITERAL -> SIMPLE_NAME[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> SIMPLE_NAME[$NEGATIVE_INTEGER_LITERAL] | FLOAT_LITERAL_OR_ID -> SIMPLE_NAME[$FLOAT_LITERAL_OR_ID] | DOUBLE_LITERAL_OR_ID -> SIMPLE_NAME[$DOUBLE_LITERAL_OR_ID] | BOOL_LITERAL -> SIMPLE_NAME[$BOOL_LITERAL] | NULL_LITERAL -> SIMPLE_NAME[$NULL_LITERAL] | REGISTER -> SIMPLE_NAME[$REGISTER] | PARAM_LIST_OR_ID -> SIMPLE_NAME[$PARAM_LIST_OR_ID] | PRIMITIVE_TYPE -> SIMPLE_NAME[$PRIMITIVE_TYPE] | VOID_TYPE -> SIMPLE_NAME[$VOID_TYPE] | ANNOTATION_VISIBILITY -> SIMPLE_NAME[$ANNOTATION_VISIBILITY] | INSTRUCTION_FORMAT10t -> SIMPLE_NAME[$INSTRUCTION_FORMAT10t] | INSTRUCTION_FORMAT10x -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x] | INSTRUCTION_FORMAT10x_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x_ODEX] | INSTRUCTION_FORMAT11x -> SIMPLE_NAME[$INSTRUCTION_FORMAT11x] | INSTRUCTION_FORMAT12x_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT12x_OR_ID] | INSTRUCTION_FORMAT21c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD] | INSTRUCTION_FORMAT21c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD_ODEX] | INSTRUCTION_FORMAT21c_STRING -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_STRING] | INSTRUCTION_FORMAT21c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_TYPE] | INSTRUCTION_FORMAT21t -> SIMPLE_NAME[$INSTRUCTION_FORMAT21t] | INSTRUCTION_FORMAT22c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD] | INSTRUCTION_FORMAT22c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD_ODEX] | INSTRUCTION_FORMAT22c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_TYPE] | INSTRUCTION_FORMAT22cs_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22cs_FIELD] | INSTRUCTION_FORMAT22s_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT22s_OR_ID] | INSTRUCTION_FORMAT22t -> SIMPLE_NAME[$INSTRUCTION_FORMAT22t] | INSTRUCTION_FORMAT23x -> SIMPLE_NAME[$INSTRUCTION_FORMAT23x] | INSTRUCTION_FORMAT31i_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT31i_OR_ID] | INSTRUCTION_FORMAT31t -> SIMPLE_NAME[$INSTRUCTION_FORMAT31t] | INSTRUCTION_FORMAT35c_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD] | INSTRUCTION_FORMAT35c_METHOD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD_ODEX] | INSTRUCTION_FORMAT35c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_TYPE] | INSTRUCTION_FORMAT35mi_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35mi_METHOD] | INSTRUCTION_FORMAT35ms_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35ms_METHOD] | INSTRUCTION_FORMAT51l -> SIMPLE_NAME[$INSTRUCTION_FORMAT51l] );
	public final smaliParser.simple_name_return simple_name() throws RecognitionException {
		smaliParser.simple_name_return retval = new smaliParser.simple_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SIMPLE_NAME43=null;
		Token ACCESS_SPEC44=null;
		Token VERIFICATION_ERROR_TYPE45=null;
		Token POSITIVE_INTEGER_LITERAL46=null;
		Token NEGATIVE_INTEGER_LITERAL47=null;
		Token FLOAT_LITERAL_OR_ID48=null;
		Token DOUBLE_LITERAL_OR_ID49=null;
		Token BOOL_LITERAL50=null;
		Token NULL_LITERAL51=null;
		Token REGISTER52=null;
		Token PARAM_LIST_OR_ID53=null;
		Token PRIMITIVE_TYPE54=null;
		Token VOID_TYPE55=null;
		Token ANNOTATION_VISIBILITY56=null;
		Token INSTRUCTION_FORMAT10t57=null;
		Token INSTRUCTION_FORMAT10x58=null;
		Token INSTRUCTION_FORMAT10x_ODEX59=null;
		Token INSTRUCTION_FORMAT11x60=null;
		Token INSTRUCTION_FORMAT12x_OR_ID61=null;
		Token INSTRUCTION_FORMAT21c_FIELD62=null;
		Token INSTRUCTION_FORMAT21c_FIELD_ODEX63=null;
		Token INSTRUCTION_FORMAT21c_STRING64=null;
		Token INSTRUCTION_FORMAT21c_TYPE65=null;
		Token INSTRUCTION_FORMAT21t66=null;
		Token INSTRUCTION_FORMAT22c_FIELD67=null;
		Token INSTRUCTION_FORMAT22c_FIELD_ODEX68=null;
		Token INSTRUCTION_FORMAT22c_TYPE69=null;
		Token INSTRUCTION_FORMAT22cs_FIELD70=null;
		Token INSTRUCTION_FORMAT22s_OR_ID71=null;
		Token INSTRUCTION_FORMAT22t72=null;
		Token INSTRUCTION_FORMAT23x73=null;
		Token INSTRUCTION_FORMAT31i_OR_ID74=null;
		Token INSTRUCTION_FORMAT31t75=null;
		Token INSTRUCTION_FORMAT35c_METHOD76=null;
		Token INSTRUCTION_FORMAT35c_METHOD_ODEX77=null;
		Token INSTRUCTION_FORMAT35c_TYPE78=null;
		Token INSTRUCTION_FORMAT35mi_METHOD79=null;
		Token INSTRUCTION_FORMAT35ms_METHOD80=null;
		Token INSTRUCTION_FORMAT51l81=null;

		CommonTree SIMPLE_NAME43_tree=null;
		CommonTree ACCESS_SPEC44_tree=null;
		CommonTree VERIFICATION_ERROR_TYPE45_tree=null;
		CommonTree POSITIVE_INTEGER_LITERAL46_tree=null;
		CommonTree NEGATIVE_INTEGER_LITERAL47_tree=null;
		CommonTree FLOAT_LITERAL_OR_ID48_tree=null;
		CommonTree DOUBLE_LITERAL_OR_ID49_tree=null;
		CommonTree BOOL_LITERAL50_tree=null;
		CommonTree NULL_LITERAL51_tree=null;
		CommonTree REGISTER52_tree=null;
		CommonTree PARAM_LIST_OR_ID53_tree=null;
		CommonTree PRIMITIVE_TYPE54_tree=null;
		CommonTree VOID_TYPE55_tree=null;
		CommonTree ANNOTATION_VISIBILITY56_tree=null;
		CommonTree INSTRUCTION_FORMAT10t57_tree=null;
		CommonTree INSTRUCTION_FORMAT10x58_tree=null;
		CommonTree INSTRUCTION_FORMAT10x_ODEX59_tree=null;
		CommonTree INSTRUCTION_FORMAT11x60_tree=null;
		CommonTree INSTRUCTION_FORMAT12x_OR_ID61_tree=null;
		CommonTree INSTRUCTION_FORMAT21c_FIELD62_tree=null;
		CommonTree INSTRUCTION_FORMAT21c_FIELD_ODEX63_tree=null;
		CommonTree INSTRUCTION_FORMAT21c_STRING64_tree=null;
		CommonTree INSTRUCTION_FORMAT21c_TYPE65_tree=null;
		CommonTree INSTRUCTION_FORMAT21t66_tree=null;
		CommonTree INSTRUCTION_FORMAT22c_FIELD67_tree=null;
		CommonTree INSTRUCTION_FORMAT22c_FIELD_ODEX68_tree=null;
		CommonTree INSTRUCTION_FORMAT22c_TYPE69_tree=null;
		CommonTree INSTRUCTION_FORMAT22cs_FIELD70_tree=null;
		CommonTree INSTRUCTION_FORMAT22s_OR_ID71_tree=null;
		CommonTree INSTRUCTION_FORMAT22t72_tree=null;
		CommonTree INSTRUCTION_FORMAT23x73_tree=null;
		CommonTree INSTRUCTION_FORMAT31i_OR_ID74_tree=null;
		CommonTree INSTRUCTION_FORMAT31t75_tree=null;
		CommonTree INSTRUCTION_FORMAT35c_METHOD76_tree=null;
		CommonTree INSTRUCTION_FORMAT35c_METHOD_ODEX77_tree=null;
		CommonTree INSTRUCTION_FORMAT35c_TYPE78_tree=null;
		CommonTree INSTRUCTION_FORMAT35mi_METHOD79_tree=null;
		CommonTree INSTRUCTION_FORMAT35ms_METHOD80_tree=null;
		CommonTree INSTRUCTION_FORMAT51l81_tree=null;
		RewriteRuleTokenStream stream_ANNOTATION_VISIBILITY=new RewriteRuleTokenStream(adaptor,"token ANNOTATION_VISIBILITY");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22t");
		RewriteRuleTokenStream stream_VOID_TYPE=new RewriteRuleTokenStream(adaptor,"token VOID_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10t");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35mi_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35mi_METHOD");
		RewriteRuleTokenStream stream_PARAM_LIST_OR_ID=new RewriteRuleTokenStream(adaptor,"token PARAM_LIST_OR_ID");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22s_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22s_OR_ID");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22cs_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22cs_FIELD");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT12x_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT12x_OR_ID");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35ms_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35ms_METHOD");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_METHOD");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10x");
		RewriteRuleTokenStream stream_FLOAT_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token FLOAT_LITERAL_OR_ID");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_STRING=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_STRING");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_METHOD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_METHOD_ODEX");
		RewriteRuleTokenStream stream_NEGATIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token NEGATIVE_INTEGER_LITERAL");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_FIELD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_FIELD_ODEX");
		RewriteRuleTokenStream stream_DOUBLE_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token DOUBLE_LITERAL_OR_ID");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31i_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31i_OR_ID");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21t");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31t");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT23x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT23x");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT51l=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT51l");
		RewriteRuleTokenStream stream_POSITIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_INTEGER_LITERAL");
		RewriteRuleTokenStream stream_BOOL_LITERAL=new RewriteRuleTokenStream(adaptor,"token BOOL_LITERAL");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10x_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10x_ODEX");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_FIELD");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_FIELD");
		RewriteRuleTokenStream stream_VERIFICATION_ERROR_TYPE=new RewriteRuleTokenStream(adaptor,"token VERIFICATION_ERROR_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT11x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT11x");
		RewriteRuleTokenStream stream_ACCESS_SPEC=new RewriteRuleTokenStream(adaptor,"token ACCESS_SPEC");
		RewriteRuleTokenStream stream_NULL_LITERAL=new RewriteRuleTokenStream(adaptor,"token NULL_LITERAL");
		RewriteRuleTokenStream stream_PRIMITIVE_TYPE=new RewriteRuleTokenStream(adaptor,"token PRIMITIVE_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_FIELD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_FIELD_ODEX");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:553:3: ( SIMPLE_NAME | ACCESS_SPEC -> SIMPLE_NAME[$ACCESS_SPEC] | VERIFICATION_ERROR_TYPE -> SIMPLE_NAME[$VERIFICATION_ERROR_TYPE] | POSITIVE_INTEGER_LITERAL -> SIMPLE_NAME[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> SIMPLE_NAME[$NEGATIVE_INTEGER_LITERAL] | FLOAT_LITERAL_OR_ID -> SIMPLE_NAME[$FLOAT_LITERAL_OR_ID] | DOUBLE_LITERAL_OR_ID -> SIMPLE_NAME[$DOUBLE_LITERAL_OR_ID] | BOOL_LITERAL -> SIMPLE_NAME[$BOOL_LITERAL] | NULL_LITERAL -> SIMPLE_NAME[$NULL_LITERAL] | REGISTER -> SIMPLE_NAME[$REGISTER] | PARAM_LIST_OR_ID -> SIMPLE_NAME[$PARAM_LIST_OR_ID] | PRIMITIVE_TYPE -> SIMPLE_NAME[$PRIMITIVE_TYPE] | VOID_TYPE -> SIMPLE_NAME[$VOID_TYPE] | ANNOTATION_VISIBILITY -> SIMPLE_NAME[$ANNOTATION_VISIBILITY] | INSTRUCTION_FORMAT10t -> SIMPLE_NAME[$INSTRUCTION_FORMAT10t] | INSTRUCTION_FORMAT10x -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x] | INSTRUCTION_FORMAT10x_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x_ODEX] | INSTRUCTION_FORMAT11x -> SIMPLE_NAME[$INSTRUCTION_FORMAT11x] | INSTRUCTION_FORMAT12x_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT12x_OR_ID] | INSTRUCTION_FORMAT21c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD] | INSTRUCTION_FORMAT21c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD_ODEX] | INSTRUCTION_FORMAT21c_STRING -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_STRING] | INSTRUCTION_FORMAT21c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_TYPE] | INSTRUCTION_FORMAT21t -> SIMPLE_NAME[$INSTRUCTION_FORMAT21t] | INSTRUCTION_FORMAT22c_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD] | INSTRUCTION_FORMAT22c_FIELD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD_ODEX] | INSTRUCTION_FORMAT22c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_TYPE] | INSTRUCTION_FORMAT22cs_FIELD -> SIMPLE_NAME[$INSTRUCTION_FORMAT22cs_FIELD] | INSTRUCTION_FORMAT22s_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT22s_OR_ID] | INSTRUCTION_FORMAT22t -> SIMPLE_NAME[$INSTRUCTION_FORMAT22t] | INSTRUCTION_FORMAT23x -> SIMPLE_NAME[$INSTRUCTION_FORMAT23x] | INSTRUCTION_FORMAT31i_OR_ID -> SIMPLE_NAME[$INSTRUCTION_FORMAT31i_OR_ID] | INSTRUCTION_FORMAT31t -> SIMPLE_NAME[$INSTRUCTION_FORMAT31t] | INSTRUCTION_FORMAT35c_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD] | INSTRUCTION_FORMAT35c_METHOD_ODEX -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD_ODEX] | INSTRUCTION_FORMAT35c_TYPE -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_TYPE] | INSTRUCTION_FORMAT35mi_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35mi_METHOD] | INSTRUCTION_FORMAT35ms_METHOD -> SIMPLE_NAME[$INSTRUCTION_FORMAT35ms_METHOD] | INSTRUCTION_FORMAT51l -> SIMPLE_NAME[$INSTRUCTION_FORMAT51l] )
			int alt9=39;
			switch ( input.LA(1) ) {
			case SIMPLE_NAME:
				{
				alt9=1;
				}
				break;
			case ACCESS_SPEC:
				{
				alt9=2;
				}
				break;
			case VERIFICATION_ERROR_TYPE:
				{
				alt9=3;
				}
				break;
			case POSITIVE_INTEGER_LITERAL:
				{
				alt9=4;
				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
				{
				alt9=5;
				}
				break;
			case FLOAT_LITERAL_OR_ID:
				{
				alt9=6;
				}
				break;
			case DOUBLE_LITERAL_OR_ID:
				{
				alt9=7;
				}
				break;
			case BOOL_LITERAL:
				{
				alt9=8;
				}
				break;
			case NULL_LITERAL:
				{
				alt9=9;
				}
				break;
			case REGISTER:
				{
				alt9=10;
				}
				break;
			case PARAM_LIST_OR_ID:
				{
				alt9=11;
				}
				break;
			case PRIMITIVE_TYPE:
				{
				alt9=12;
				}
				break;
			case VOID_TYPE:
				{
				alt9=13;
				}
				break;
			case ANNOTATION_VISIBILITY:
				{
				alt9=14;
				}
				break;
			case INSTRUCTION_FORMAT10t:
				{
				alt9=15;
				}
				break;
			case INSTRUCTION_FORMAT10x:
				{
				alt9=16;
				}
				break;
			case INSTRUCTION_FORMAT10x_ODEX:
				{
				alt9=17;
				}
				break;
			case INSTRUCTION_FORMAT11x:
				{
				alt9=18;
				}
				break;
			case INSTRUCTION_FORMAT12x_OR_ID:
				{
				alt9=19;
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD:
				{
				alt9=20;
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
				{
				alt9=21;
				}
				break;
			case INSTRUCTION_FORMAT21c_STRING:
				{
				alt9=22;
				}
				break;
			case INSTRUCTION_FORMAT21c_TYPE:
				{
				alt9=23;
				}
				break;
			case INSTRUCTION_FORMAT21t:
				{
				alt9=24;
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD:
				{
				alt9=25;
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
				{
				alt9=26;
				}
				break;
			case INSTRUCTION_FORMAT22c_TYPE:
				{
				alt9=27;
				}
				break;
			case INSTRUCTION_FORMAT22cs_FIELD:
				{
				alt9=28;
				}
				break;
			case INSTRUCTION_FORMAT22s_OR_ID:
				{
				alt9=29;
				}
				break;
			case INSTRUCTION_FORMAT22t:
				{
				alt9=30;
				}
				break;
			case INSTRUCTION_FORMAT23x:
				{
				alt9=31;
				}
				break;
			case INSTRUCTION_FORMAT31i_OR_ID:
				{
				alt9=32;
				}
				break;
			case INSTRUCTION_FORMAT31t:
				{
				alt9=33;
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD:
				{
				alt9=34;
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
				{
				alt9=35;
				}
				break;
			case INSTRUCTION_FORMAT35c_TYPE:
				{
				alt9=36;
				}
				break;
			case INSTRUCTION_FORMAT35mi_METHOD:
				{
				alt9=37;
				}
				break;
			case INSTRUCTION_FORMAT35ms_METHOD:
				{
				alt9=38;
				}
				break;
			case INSTRUCTION_FORMAT51l:
				{
				alt9=39;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:553:5: SIMPLE_NAME
					{
					root_0 = (CommonTree)adaptor.nil();


					SIMPLE_NAME43=(Token)match(input,SIMPLE_NAME,FOLLOW_SIMPLE_NAME_in_simple_name1836); 
					SIMPLE_NAME43_tree = (CommonTree)adaptor.create(SIMPLE_NAME43);
					adaptor.addChild(root_0, SIMPLE_NAME43_tree);

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:554:5: ACCESS_SPEC
					{
					ACCESS_SPEC44=(Token)match(input,ACCESS_SPEC,FOLLOW_ACCESS_SPEC_in_simple_name1842);  
					stream_ACCESS_SPEC.add(ACCESS_SPEC44);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 554:17: -> SIMPLE_NAME[$ACCESS_SPEC]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, ACCESS_SPEC44));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:555:5: VERIFICATION_ERROR_TYPE
					{
					VERIFICATION_ERROR_TYPE45=(Token)match(input,VERIFICATION_ERROR_TYPE,FOLLOW_VERIFICATION_ERROR_TYPE_in_simple_name1853);  
					stream_VERIFICATION_ERROR_TYPE.add(VERIFICATION_ERROR_TYPE45);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 555:29: -> SIMPLE_NAME[$VERIFICATION_ERROR_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, VERIFICATION_ERROR_TYPE45));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:556:5: POSITIVE_INTEGER_LITERAL
					{
					POSITIVE_INTEGER_LITERAL46=(Token)match(input,POSITIVE_INTEGER_LITERAL,FOLLOW_POSITIVE_INTEGER_LITERAL_in_simple_name1864);  
					stream_POSITIVE_INTEGER_LITERAL.add(POSITIVE_INTEGER_LITERAL46);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 556:30: -> SIMPLE_NAME[$POSITIVE_INTEGER_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, POSITIVE_INTEGER_LITERAL46));
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:557:5: NEGATIVE_INTEGER_LITERAL
					{
					NEGATIVE_INTEGER_LITERAL47=(Token)match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_simple_name1875);  
					stream_NEGATIVE_INTEGER_LITERAL.add(NEGATIVE_INTEGER_LITERAL47);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 557:30: -> SIMPLE_NAME[$NEGATIVE_INTEGER_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, NEGATIVE_INTEGER_LITERAL47));
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:558:5: FLOAT_LITERAL_OR_ID
					{
					FLOAT_LITERAL_OR_ID48=(Token)match(input,FLOAT_LITERAL_OR_ID,FOLLOW_FLOAT_LITERAL_OR_ID_in_simple_name1886);  
					stream_FLOAT_LITERAL_OR_ID.add(FLOAT_LITERAL_OR_ID48);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 558:25: -> SIMPLE_NAME[$FLOAT_LITERAL_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, FLOAT_LITERAL_OR_ID48));
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:559:5: DOUBLE_LITERAL_OR_ID
					{
					DOUBLE_LITERAL_OR_ID49=(Token)match(input,DOUBLE_LITERAL_OR_ID,FOLLOW_DOUBLE_LITERAL_OR_ID_in_simple_name1897);  
					stream_DOUBLE_LITERAL_OR_ID.add(DOUBLE_LITERAL_OR_ID49);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 559:26: -> SIMPLE_NAME[$DOUBLE_LITERAL_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, DOUBLE_LITERAL_OR_ID49));
					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:560:5: BOOL_LITERAL
					{
					BOOL_LITERAL50=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_simple_name1908);  
					stream_BOOL_LITERAL.add(BOOL_LITERAL50);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 560:18: -> SIMPLE_NAME[$BOOL_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, BOOL_LITERAL50));
					}


					retval.tree = root_0;

					}
					break;
				case 9 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:561:5: NULL_LITERAL
					{
					NULL_LITERAL51=(Token)match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_simple_name1919);  
					stream_NULL_LITERAL.add(NULL_LITERAL51);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 561:18: -> SIMPLE_NAME[$NULL_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, NULL_LITERAL51));
					}


					retval.tree = root_0;

					}
					break;
				case 10 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:562:5: REGISTER
					{
					REGISTER52=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_simple_name1930);  
					stream_REGISTER.add(REGISTER52);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 562:14: -> SIMPLE_NAME[$REGISTER]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, REGISTER52));
					}


					retval.tree = root_0;

					}
					break;
				case 11 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:563:5: PARAM_LIST_OR_ID
					{
					PARAM_LIST_OR_ID53=(Token)match(input,PARAM_LIST_OR_ID,FOLLOW_PARAM_LIST_OR_ID_in_simple_name1941);  
					stream_PARAM_LIST_OR_ID.add(PARAM_LIST_OR_ID53);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 563:22: -> SIMPLE_NAME[$PARAM_LIST_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, PARAM_LIST_OR_ID53));
					}


					retval.tree = root_0;

					}
					break;
				case 12 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:564:5: PRIMITIVE_TYPE
					{
					PRIMITIVE_TYPE54=(Token)match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_simple_name1952);  
					stream_PRIMITIVE_TYPE.add(PRIMITIVE_TYPE54);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 564:20: -> SIMPLE_NAME[$PRIMITIVE_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, PRIMITIVE_TYPE54));
					}


					retval.tree = root_0;

					}
					break;
				case 13 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:565:5: VOID_TYPE
					{
					VOID_TYPE55=(Token)match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_simple_name1963);  
					stream_VOID_TYPE.add(VOID_TYPE55);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 565:15: -> SIMPLE_NAME[$VOID_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, VOID_TYPE55));
					}


					retval.tree = root_0;

					}
					break;
				case 14 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:566:5: ANNOTATION_VISIBILITY
					{
					ANNOTATION_VISIBILITY56=(Token)match(input,ANNOTATION_VISIBILITY,FOLLOW_ANNOTATION_VISIBILITY_in_simple_name1974);  
					stream_ANNOTATION_VISIBILITY.add(ANNOTATION_VISIBILITY56);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 566:27: -> SIMPLE_NAME[$ANNOTATION_VISIBILITY]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, ANNOTATION_VISIBILITY56));
					}


					retval.tree = root_0;

					}
					break;
				case 15 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:567:5: INSTRUCTION_FORMAT10t
					{
					INSTRUCTION_FORMAT10t57=(Token)match(input,INSTRUCTION_FORMAT10t,FOLLOW_INSTRUCTION_FORMAT10t_in_simple_name1985);  
					stream_INSTRUCTION_FORMAT10t.add(INSTRUCTION_FORMAT10t57);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 567:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT10t]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT10t57));
					}


					retval.tree = root_0;

					}
					break;
				case 16 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:568:5: INSTRUCTION_FORMAT10x
					{
					INSTRUCTION_FORMAT10x58=(Token)match(input,INSTRUCTION_FORMAT10x,FOLLOW_INSTRUCTION_FORMAT10x_in_simple_name1996);  
					stream_INSTRUCTION_FORMAT10x.add(INSTRUCTION_FORMAT10x58);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 568:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT10x58));
					}


					retval.tree = root_0;

					}
					break;
				case 17 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:569:5: INSTRUCTION_FORMAT10x_ODEX
					{
					INSTRUCTION_FORMAT10x_ODEX59=(Token)match(input,INSTRUCTION_FORMAT10x_ODEX,FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_simple_name2007);  
					stream_INSTRUCTION_FORMAT10x_ODEX.add(INSTRUCTION_FORMAT10x_ODEX59);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 569:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT10x_ODEX]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT10x_ODEX59));
					}


					retval.tree = root_0;

					}
					break;
				case 18 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:570:5: INSTRUCTION_FORMAT11x
					{
					INSTRUCTION_FORMAT11x60=(Token)match(input,INSTRUCTION_FORMAT11x,FOLLOW_INSTRUCTION_FORMAT11x_in_simple_name2018);  
					stream_INSTRUCTION_FORMAT11x.add(INSTRUCTION_FORMAT11x60);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 570:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT11x]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT11x60));
					}


					retval.tree = root_0;

					}
					break;
				case 19 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:571:5: INSTRUCTION_FORMAT12x_OR_ID
					{
					INSTRUCTION_FORMAT12x_OR_ID61=(Token)match(input,INSTRUCTION_FORMAT12x_OR_ID,FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_simple_name2029);  
					stream_INSTRUCTION_FORMAT12x_OR_ID.add(INSTRUCTION_FORMAT12x_OR_ID61);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 571:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT12x_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT12x_OR_ID61));
					}


					retval.tree = root_0;

					}
					break;
				case 20 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:572:5: INSTRUCTION_FORMAT21c_FIELD
					{
					INSTRUCTION_FORMAT21c_FIELD62=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_simple_name2040);  
					stream_INSTRUCTION_FORMAT21c_FIELD.add(INSTRUCTION_FORMAT21c_FIELD62);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 572:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_FIELD62));
					}


					retval.tree = root_0;

					}
					break;
				case 21 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:573:5: INSTRUCTION_FORMAT21c_FIELD_ODEX
					{
					INSTRUCTION_FORMAT21c_FIELD_ODEX63=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_simple_name2051);  
					stream_INSTRUCTION_FORMAT21c_FIELD_ODEX.add(INSTRUCTION_FORMAT21c_FIELD_ODEX63);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 573:38: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_FIELD_ODEX]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_FIELD_ODEX63));
					}


					retval.tree = root_0;

					}
					break;
				case 22 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:574:5: INSTRUCTION_FORMAT21c_STRING
					{
					INSTRUCTION_FORMAT21c_STRING64=(Token)match(input,INSTRUCTION_FORMAT21c_STRING,FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_simple_name2062);  
					stream_INSTRUCTION_FORMAT21c_STRING.add(INSTRUCTION_FORMAT21c_STRING64);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 574:34: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_STRING]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_STRING64));
					}


					retval.tree = root_0;

					}
					break;
				case 23 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:575:5: INSTRUCTION_FORMAT21c_TYPE
					{
					INSTRUCTION_FORMAT21c_TYPE65=(Token)match(input,INSTRUCTION_FORMAT21c_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_simple_name2073);  
					stream_INSTRUCTION_FORMAT21c_TYPE.add(INSTRUCTION_FORMAT21c_TYPE65);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 575:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21c_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21c_TYPE65));
					}


					retval.tree = root_0;

					}
					break;
				case 24 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:576:5: INSTRUCTION_FORMAT21t
					{
					INSTRUCTION_FORMAT21t66=(Token)match(input,INSTRUCTION_FORMAT21t,FOLLOW_INSTRUCTION_FORMAT21t_in_simple_name2084);  
					stream_INSTRUCTION_FORMAT21t.add(INSTRUCTION_FORMAT21t66);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 576:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT21t]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT21t66));
					}


					retval.tree = root_0;

					}
					break;
				case 25 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:577:5: INSTRUCTION_FORMAT22c_FIELD
					{
					INSTRUCTION_FORMAT22c_FIELD67=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_simple_name2095);  
					stream_INSTRUCTION_FORMAT22c_FIELD.add(INSTRUCTION_FORMAT22c_FIELD67);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 577:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22c_FIELD67));
					}


					retval.tree = root_0;

					}
					break;
				case 26 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:578:5: INSTRUCTION_FORMAT22c_FIELD_ODEX
					{
					INSTRUCTION_FORMAT22c_FIELD_ODEX68=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_simple_name2106);  
					stream_INSTRUCTION_FORMAT22c_FIELD_ODEX.add(INSTRUCTION_FORMAT22c_FIELD_ODEX68);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 578:38: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_FIELD_ODEX]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22c_FIELD_ODEX68));
					}


					retval.tree = root_0;

					}
					break;
				case 27 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:579:5: INSTRUCTION_FORMAT22c_TYPE
					{
					INSTRUCTION_FORMAT22c_TYPE69=(Token)match(input,INSTRUCTION_FORMAT22c_TYPE,FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_simple_name2117);  
					stream_INSTRUCTION_FORMAT22c_TYPE.add(INSTRUCTION_FORMAT22c_TYPE69);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 579:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22c_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22c_TYPE69));
					}


					retval.tree = root_0;

					}
					break;
				case 28 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:580:5: INSTRUCTION_FORMAT22cs_FIELD
					{
					INSTRUCTION_FORMAT22cs_FIELD70=(Token)match(input,INSTRUCTION_FORMAT22cs_FIELD,FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_simple_name2128);  
					stream_INSTRUCTION_FORMAT22cs_FIELD.add(INSTRUCTION_FORMAT22cs_FIELD70);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 580:34: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22cs_FIELD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22cs_FIELD70));
					}


					retval.tree = root_0;

					}
					break;
				case 29 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:581:5: INSTRUCTION_FORMAT22s_OR_ID
					{
					INSTRUCTION_FORMAT22s_OR_ID71=(Token)match(input,INSTRUCTION_FORMAT22s_OR_ID,FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_simple_name2139);  
					stream_INSTRUCTION_FORMAT22s_OR_ID.add(INSTRUCTION_FORMAT22s_OR_ID71);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 581:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22s_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22s_OR_ID71));
					}


					retval.tree = root_0;

					}
					break;
				case 30 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:582:5: INSTRUCTION_FORMAT22t
					{
					INSTRUCTION_FORMAT22t72=(Token)match(input,INSTRUCTION_FORMAT22t,FOLLOW_INSTRUCTION_FORMAT22t_in_simple_name2150);  
					stream_INSTRUCTION_FORMAT22t.add(INSTRUCTION_FORMAT22t72);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 582:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT22t]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT22t72));
					}


					retval.tree = root_0;

					}
					break;
				case 31 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:583:5: INSTRUCTION_FORMAT23x
					{
					INSTRUCTION_FORMAT23x73=(Token)match(input,INSTRUCTION_FORMAT23x,FOLLOW_INSTRUCTION_FORMAT23x_in_simple_name2161);  
					stream_INSTRUCTION_FORMAT23x.add(INSTRUCTION_FORMAT23x73);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 583:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT23x]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT23x73));
					}


					retval.tree = root_0;

					}
					break;
				case 32 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:584:5: INSTRUCTION_FORMAT31i_OR_ID
					{
					INSTRUCTION_FORMAT31i_OR_ID74=(Token)match(input,INSTRUCTION_FORMAT31i_OR_ID,FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_simple_name2172);  
					stream_INSTRUCTION_FORMAT31i_OR_ID.add(INSTRUCTION_FORMAT31i_OR_ID74);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 584:33: -> SIMPLE_NAME[$INSTRUCTION_FORMAT31i_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT31i_OR_ID74));
					}


					retval.tree = root_0;

					}
					break;
				case 33 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:585:5: INSTRUCTION_FORMAT31t
					{
					INSTRUCTION_FORMAT31t75=(Token)match(input,INSTRUCTION_FORMAT31t,FOLLOW_INSTRUCTION_FORMAT31t_in_simple_name2183);  
					stream_INSTRUCTION_FORMAT31t.add(INSTRUCTION_FORMAT31t75);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 585:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT31t]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT31t75));
					}


					retval.tree = root_0;

					}
					break;
				case 34 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:586:5: INSTRUCTION_FORMAT35c_METHOD
					{
					INSTRUCTION_FORMAT35c_METHOD76=(Token)match(input,INSTRUCTION_FORMAT35c_METHOD,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_simple_name2194);  
					stream_INSTRUCTION_FORMAT35c_METHOD.add(INSTRUCTION_FORMAT35c_METHOD76);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 586:34: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35c_METHOD76));
					}


					retval.tree = root_0;

					}
					break;
				case 35 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:587:5: INSTRUCTION_FORMAT35c_METHOD_ODEX
					{
					INSTRUCTION_FORMAT35c_METHOD_ODEX77=(Token)match(input,INSTRUCTION_FORMAT35c_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_simple_name2205);  
					stream_INSTRUCTION_FORMAT35c_METHOD_ODEX.add(INSTRUCTION_FORMAT35c_METHOD_ODEX77);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 587:39: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_METHOD_ODEX]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35c_METHOD_ODEX77));
					}


					retval.tree = root_0;

					}
					break;
				case 36 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:588:5: INSTRUCTION_FORMAT35c_TYPE
					{
					INSTRUCTION_FORMAT35c_TYPE78=(Token)match(input,INSTRUCTION_FORMAT35c_TYPE,FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_simple_name2216);  
					stream_INSTRUCTION_FORMAT35c_TYPE.add(INSTRUCTION_FORMAT35c_TYPE78);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 588:32: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35c_TYPE]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35c_TYPE78));
					}


					retval.tree = root_0;

					}
					break;
				case 37 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:589:5: INSTRUCTION_FORMAT35mi_METHOD
					{
					INSTRUCTION_FORMAT35mi_METHOD79=(Token)match(input,INSTRUCTION_FORMAT35mi_METHOD,FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_simple_name2227);  
					stream_INSTRUCTION_FORMAT35mi_METHOD.add(INSTRUCTION_FORMAT35mi_METHOD79);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 589:35: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35mi_METHOD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35mi_METHOD79));
					}


					retval.tree = root_0;

					}
					break;
				case 38 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:590:5: INSTRUCTION_FORMAT35ms_METHOD
					{
					INSTRUCTION_FORMAT35ms_METHOD80=(Token)match(input,INSTRUCTION_FORMAT35ms_METHOD,FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_simple_name2238);  
					stream_INSTRUCTION_FORMAT35ms_METHOD.add(INSTRUCTION_FORMAT35ms_METHOD80);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 590:35: -> SIMPLE_NAME[$INSTRUCTION_FORMAT35ms_METHOD]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT35ms_METHOD80));
					}


					retval.tree = root_0;

					}
					break;
				case 39 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:591:5: INSTRUCTION_FORMAT51l
					{
					INSTRUCTION_FORMAT51l81=(Token)match(input,INSTRUCTION_FORMAT51l,FOLLOW_INSTRUCTION_FORMAT51l_in_simple_name2249);  
					stream_INSTRUCTION_FORMAT51l.add(INSTRUCTION_FORMAT51l81);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 591:27: -> SIMPLE_NAME[$INSTRUCTION_FORMAT51l]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, INSTRUCTION_FORMAT51l81));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simple_name"


	public static class member_name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "member_name"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:593:1: member_name : ( simple_name | MEMBER_NAME -> SIMPLE_NAME[$MEMBER_NAME] );
	public final smaliParser.member_name_return member_name() throws RecognitionException {
		smaliParser.member_name_return retval = new smaliParser.member_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token MEMBER_NAME83=null;
		ParserRuleReturnScope simple_name82 =null;

		CommonTree MEMBER_NAME83_tree=null;
		RewriteRuleTokenStream stream_MEMBER_NAME=new RewriteRuleTokenStream(adaptor,"token MEMBER_NAME");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:594:3: ( simple_name | MEMBER_NAME -> SIMPLE_NAME[$MEMBER_NAME] )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ACCESS_SPEC||LA10_0==ANNOTATION_VISIBILITY||LA10_0==BOOL_LITERAL||LA10_0==DOUBLE_LITERAL_OR_ID||LA10_0==FLOAT_LITERAL_OR_ID||(LA10_0 >= INSTRUCTION_FORMAT10t && LA10_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA10_0==INSTRUCTION_FORMAT11x||LA10_0==INSTRUCTION_FORMAT12x_OR_ID||(LA10_0 >= INSTRUCTION_FORMAT21c_FIELD && LA10_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA10_0==INSTRUCTION_FORMAT21t||(LA10_0 >= INSTRUCTION_FORMAT22c_FIELD && LA10_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA10_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA10_0 <= INSTRUCTION_FORMAT22t)||LA10_0==INSTRUCTION_FORMAT23x||(LA10_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA10_0 <= INSTRUCTION_FORMAT31t)||(LA10_0 >= INSTRUCTION_FORMAT35c_METHOD && LA10_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA10_0==INSTRUCTION_FORMAT51l||(LA10_0 >= NEGATIVE_INTEGER_LITERAL && LA10_0 <= NULL_LITERAL)||(LA10_0 >= PARAM_LIST_OR_ID && LA10_0 <= PRIMITIVE_TYPE)||LA10_0==REGISTER||LA10_0==SIMPLE_NAME||(LA10_0 >= VERIFICATION_ERROR_TYPE && LA10_0 <= VOID_TYPE)) ) {
				alt10=1;
			}
			else if ( (LA10_0==MEMBER_NAME) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:594:5: simple_name
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_simple_name_in_member_name2264);
					simple_name82=simple_name();
					state._fsp--;

					adaptor.addChild(root_0, simple_name82.getTree());

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:595:5: MEMBER_NAME
					{
					MEMBER_NAME83=(Token)match(input,MEMBER_NAME,FOLLOW_MEMBER_NAME_in_member_name2270);  
					stream_MEMBER_NAME.add(MEMBER_NAME83);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 595:17: -> SIMPLE_NAME[$MEMBER_NAME]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(SIMPLE_NAME, MEMBER_NAME83));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "member_name"


	public static class method_prototype_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "method_prototype"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:597:1: method_prototype : OPEN_PAREN param_list CLOSE_PAREN type_descriptor -> ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? ) ;
	public final smaliParser.method_prototype_return method_prototype() throws RecognitionException {
		smaliParser.method_prototype_return retval = new smaliParser.method_prototype_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPEN_PAREN84=null;
		Token CLOSE_PAREN86=null;
		ParserRuleReturnScope param_list85 =null;
		ParserRuleReturnScope type_descriptor87 =null;

		CommonTree OPEN_PAREN84_tree=null;
		CommonTree CLOSE_PAREN86_tree=null;
		RewriteRuleTokenStream stream_OPEN_PAREN=new RewriteRuleTokenStream(adaptor,"token OPEN_PAREN");
		RewriteRuleTokenStream stream_CLOSE_PAREN=new RewriteRuleTokenStream(adaptor,"token CLOSE_PAREN");
		RewriteRuleSubtreeStream stream_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule type_descriptor");
		RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:598:3: ( OPEN_PAREN param_list CLOSE_PAREN type_descriptor -> ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:598:5: OPEN_PAREN param_list CLOSE_PAREN type_descriptor
			{
			OPEN_PAREN84=(Token)match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_method_prototype2285);  
			stream_OPEN_PAREN.add(OPEN_PAREN84);

			pushFollow(FOLLOW_param_list_in_method_prototype2287);
			param_list85=param_list();
			state._fsp--;

			stream_param_list.add(param_list85.getTree());
			CLOSE_PAREN86=(Token)match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_method_prototype2289);  
			stream_CLOSE_PAREN.add(CLOSE_PAREN86);

			pushFollow(FOLLOW_type_descriptor_in_method_prototype2291);
			type_descriptor87=type_descriptor();
			state._fsp--;

			stream_type_descriptor.add(type_descriptor87.getTree());
			// AST REWRITE
			// elements: type_descriptor, param_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 599:5: -> ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:599:8: ^( I_METHOD_PROTOTYPE[$start, \"I_METHOD_PROTOTYPE\"] ^( I_METHOD_RETURN_TYPE type_descriptor ) ( param_list )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHOD_PROTOTYPE, (retval.start), "I_METHOD_PROTOTYPE"), root_1);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:599:59: ^( I_METHOD_RETURN_TYPE type_descriptor )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_METHOD_RETURN_TYPE, "I_METHOD_RETURN_TYPE"), root_2);
				adaptor.addChild(root_2, stream_type_descriptor.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:599:99: ( param_list )?
				if ( stream_param_list.hasNext() ) {
					adaptor.addChild(root_1, stream_param_list.nextTree());
				}
				stream_param_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "method_prototype"


	public static class param_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "param_list"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:601:1: param_list : ( PARAM_LIST ->| PARAM_LIST_OR_ID ->| ( nonvoid_type_descriptor )* );
	public final smaliParser.param_list_return param_list() throws RecognitionException {
		smaliParser.param_list_return retval = new smaliParser.param_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PARAM_LIST88=null;
		Token PARAM_LIST_OR_ID89=null;
		ParserRuleReturnScope nonvoid_type_descriptor90 =null;

		CommonTree PARAM_LIST88_tree=null;
		CommonTree PARAM_LIST_OR_ID89_tree=null;
		RewriteRuleTokenStream stream_PARAM_LIST_OR_ID=new RewriteRuleTokenStream(adaptor,"token PARAM_LIST_OR_ID");
		RewriteRuleTokenStream stream_PARAM_LIST=new RewriteRuleTokenStream(adaptor,"token PARAM_LIST");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:602:3: ( PARAM_LIST ->| PARAM_LIST_OR_ID ->| ( nonvoid_type_descriptor )* )
			int alt12=3;
			switch ( input.LA(1) ) {
			case PARAM_LIST:
				{
				alt12=1;
				}
				break;
			case PARAM_LIST_OR_ID:
				{
				alt12=2;
				}
				break;
			case ARRAY_DESCRIPTOR:
			case CLASS_DESCRIPTOR:
			case CLOSE_PAREN:
			case PRIMITIVE_TYPE:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:602:5: PARAM_LIST
					{
					PARAM_LIST88=(Token)match(input,PARAM_LIST,FOLLOW_PARAM_LIST_in_param_list2321);  
					stream_PARAM_LIST.add(PARAM_LIST88);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 602:16: ->
					{
						adaptor.addChild(root_0,  parseParamList((CommonToken)PARAM_LIST88) );
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:603:5: PARAM_LIST_OR_ID
					{
					PARAM_LIST_OR_ID89=(Token)match(input,PARAM_LIST_OR_ID,FOLLOW_PARAM_LIST_OR_ID_in_param_list2331);  
					stream_PARAM_LIST_OR_ID.add(PARAM_LIST_OR_ID89);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 603:22: ->
					{
						adaptor.addChild(root_0,  parseParamList((CommonToken)PARAM_LIST_OR_ID89) );
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:604:5: ( nonvoid_type_descriptor )*
					{
					root_0 = (CommonTree)adaptor.nil();


					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:604:5: ( nonvoid_type_descriptor )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==ARRAY_DESCRIPTOR||LA11_0==CLASS_DESCRIPTOR||LA11_0==PRIMITIVE_TYPE) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:604:5: nonvoid_type_descriptor
							{
							pushFollow(FOLLOW_nonvoid_type_descriptor_in_param_list2341);
							nonvoid_type_descriptor90=nonvoid_type_descriptor();
							state._fsp--;

							adaptor.addChild(root_0, nonvoid_type_descriptor90.getTree());

							}
							break;

						default :
							break loop11;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param_list"


	public static class type_descriptor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_descriptor"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:606:1: type_descriptor : ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
	public final smaliParser.type_descriptor_return type_descriptor() throws RecognitionException {
		smaliParser.type_descriptor_return retval = new smaliParser.type_descriptor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set91=null;

		CommonTree set91_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:607:3: ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set91=input.LT(1);
			if ( input.LA(1)==ARRAY_DESCRIPTOR||input.LA(1)==CLASS_DESCRIPTOR||input.LA(1)==PRIMITIVE_TYPE||input.LA(1)==VOID_TYPE ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set91));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_descriptor"


	public static class nonvoid_type_descriptor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "nonvoid_type_descriptor"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:612:1: nonvoid_type_descriptor : ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
	public final smaliParser.nonvoid_type_descriptor_return nonvoid_type_descriptor() throws RecognitionException {
		smaliParser.nonvoid_type_descriptor_return retval = new smaliParser.nonvoid_type_descriptor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set92=null;

		CommonTree set92_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:613:3: ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set92=input.LT(1);
			if ( input.LA(1)==ARRAY_DESCRIPTOR||input.LA(1)==CLASS_DESCRIPTOR||input.LA(1)==PRIMITIVE_TYPE ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set92));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nonvoid_type_descriptor"


	public static class reference_type_descriptor_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "reference_type_descriptor"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:617:1: reference_type_descriptor : ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
	public final smaliParser.reference_type_descriptor_return reference_type_descriptor() throws RecognitionException {
		smaliParser.reference_type_descriptor_return retval = new smaliParser.reference_type_descriptor_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set93=null;

		CommonTree set93_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:618:3: ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set93=input.LT(1);
			if ( input.LA(1)==ARRAY_DESCRIPTOR||input.LA(1)==CLASS_DESCRIPTOR ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set93));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reference_type_descriptor"


	public static class integer_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "integer_literal"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:621:1: integer_literal : ( POSITIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$NEGATIVE_INTEGER_LITERAL] );
	public final smaliParser.integer_literal_return integer_literal() throws RecognitionException {
		smaliParser.integer_literal_return retval = new smaliParser.integer_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token POSITIVE_INTEGER_LITERAL94=null;
		Token NEGATIVE_INTEGER_LITERAL95=null;

		CommonTree POSITIVE_INTEGER_LITERAL94_tree=null;
		CommonTree NEGATIVE_INTEGER_LITERAL95_tree=null;
		RewriteRuleTokenStream stream_NEGATIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token NEGATIVE_INTEGER_LITERAL");
		RewriteRuleTokenStream stream_POSITIVE_INTEGER_LITERAL=new RewriteRuleTokenStream(adaptor,"token POSITIVE_INTEGER_LITERAL");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:622:3: ( POSITIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$POSITIVE_INTEGER_LITERAL] | NEGATIVE_INTEGER_LITERAL -> INTEGER_LITERAL[$NEGATIVE_INTEGER_LITERAL] )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==POSITIVE_INTEGER_LITERAL) ) {
				alt13=1;
			}
			else if ( (LA13_0==NEGATIVE_INTEGER_LITERAL) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:622:5: POSITIVE_INTEGER_LITERAL
					{
					POSITIVE_INTEGER_LITERAL94=(Token)match(input,POSITIVE_INTEGER_LITERAL,FOLLOW_POSITIVE_INTEGER_LITERAL_in_integer_literal2418);  
					stream_POSITIVE_INTEGER_LITERAL.add(POSITIVE_INTEGER_LITERAL94);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 622:30: -> INTEGER_LITERAL[$POSITIVE_INTEGER_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INTEGER_LITERAL, POSITIVE_INTEGER_LITERAL94));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:623:5: NEGATIVE_INTEGER_LITERAL
					{
					NEGATIVE_INTEGER_LITERAL95=(Token)match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_integer_literal2429);  
					stream_NEGATIVE_INTEGER_LITERAL.add(NEGATIVE_INTEGER_LITERAL95);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 623:30: -> INTEGER_LITERAL[$NEGATIVE_INTEGER_LITERAL]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INTEGER_LITERAL, NEGATIVE_INTEGER_LITERAL95));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integer_literal"


	public static class float_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "float_literal"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:625:1: float_literal : ( FLOAT_LITERAL_OR_ID -> FLOAT_LITERAL[$FLOAT_LITERAL_OR_ID] | FLOAT_LITERAL );
	public final smaliParser.float_literal_return float_literal() throws RecognitionException {
		smaliParser.float_literal_return retval = new smaliParser.float_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FLOAT_LITERAL_OR_ID96=null;
		Token FLOAT_LITERAL97=null;

		CommonTree FLOAT_LITERAL_OR_ID96_tree=null;
		CommonTree FLOAT_LITERAL97_tree=null;
		RewriteRuleTokenStream stream_FLOAT_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token FLOAT_LITERAL_OR_ID");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:626:3: ( FLOAT_LITERAL_OR_ID -> FLOAT_LITERAL[$FLOAT_LITERAL_OR_ID] | FLOAT_LITERAL )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==FLOAT_LITERAL_OR_ID) ) {
				alt14=1;
			}
			else if ( (LA14_0==FLOAT_LITERAL) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:626:5: FLOAT_LITERAL_OR_ID
					{
					FLOAT_LITERAL_OR_ID96=(Token)match(input,FLOAT_LITERAL_OR_ID,FOLLOW_FLOAT_LITERAL_OR_ID_in_float_literal2444);  
					stream_FLOAT_LITERAL_OR_ID.add(FLOAT_LITERAL_OR_ID96);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 626:25: -> FLOAT_LITERAL[$FLOAT_LITERAL_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(FLOAT_LITERAL, FLOAT_LITERAL_OR_ID96));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:627:5: FLOAT_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					FLOAT_LITERAL97=(Token)match(input,FLOAT_LITERAL,FOLLOW_FLOAT_LITERAL_in_float_literal2455); 
					FLOAT_LITERAL97_tree = (CommonTree)adaptor.create(FLOAT_LITERAL97);
					adaptor.addChild(root_0, FLOAT_LITERAL97_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "float_literal"


	public static class double_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "double_literal"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:629:1: double_literal : ( DOUBLE_LITERAL_OR_ID -> DOUBLE_LITERAL[$DOUBLE_LITERAL_OR_ID] | DOUBLE_LITERAL );
	public final smaliParser.double_literal_return double_literal() throws RecognitionException {
		smaliParser.double_literal_return retval = new smaliParser.double_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token DOUBLE_LITERAL_OR_ID98=null;
		Token DOUBLE_LITERAL99=null;

		CommonTree DOUBLE_LITERAL_OR_ID98_tree=null;
		CommonTree DOUBLE_LITERAL99_tree=null;
		RewriteRuleTokenStream stream_DOUBLE_LITERAL_OR_ID=new RewriteRuleTokenStream(adaptor,"token DOUBLE_LITERAL_OR_ID");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:630:3: ( DOUBLE_LITERAL_OR_ID -> DOUBLE_LITERAL[$DOUBLE_LITERAL_OR_ID] | DOUBLE_LITERAL )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==DOUBLE_LITERAL_OR_ID) ) {
				alt15=1;
			}
			else if ( (LA15_0==DOUBLE_LITERAL) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:630:5: DOUBLE_LITERAL_OR_ID
					{
					DOUBLE_LITERAL_OR_ID98=(Token)match(input,DOUBLE_LITERAL_OR_ID,FOLLOW_DOUBLE_LITERAL_OR_ID_in_double_literal2465);  
					stream_DOUBLE_LITERAL_OR_ID.add(DOUBLE_LITERAL_OR_ID98);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 630:26: -> DOUBLE_LITERAL[$DOUBLE_LITERAL_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(DOUBLE_LITERAL, DOUBLE_LITERAL_OR_ID98));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:631:5: DOUBLE_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					DOUBLE_LITERAL99=(Token)match(input,DOUBLE_LITERAL,FOLLOW_DOUBLE_LITERAL_in_double_literal2476); 
					DOUBLE_LITERAL99_tree = (CommonTree)adaptor.create(DOUBLE_LITERAL99);
					adaptor.addChild(root_0, DOUBLE_LITERAL99_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "double_literal"


	public static class literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:633:1: literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal );
	public final smaliParser.literal_return literal() throws RecognitionException {
		smaliParser.literal_return retval = new smaliParser.literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LONG_LITERAL100=null;
		Token SHORT_LITERAL102=null;
		Token BYTE_LITERAL103=null;
		Token CHAR_LITERAL106=null;
		Token STRING_LITERAL107=null;
		Token BOOL_LITERAL108=null;
		Token NULL_LITERAL109=null;
		ParserRuleReturnScope integer_literal101 =null;
		ParserRuleReturnScope float_literal104 =null;
		ParserRuleReturnScope double_literal105 =null;
		ParserRuleReturnScope array_literal110 =null;
		ParserRuleReturnScope subannotation111 =null;
		ParserRuleReturnScope type_field_method_literal112 =null;
		ParserRuleReturnScope enum_literal113 =null;

		CommonTree LONG_LITERAL100_tree=null;
		CommonTree SHORT_LITERAL102_tree=null;
		CommonTree BYTE_LITERAL103_tree=null;
		CommonTree CHAR_LITERAL106_tree=null;
		CommonTree STRING_LITERAL107_tree=null;
		CommonTree BOOL_LITERAL108_tree=null;
		CommonTree NULL_LITERAL109_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:634:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal )
			int alt16=14;
			switch ( input.LA(1) ) {
			case LONG_LITERAL:
				{
				alt16=1;
				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
			case POSITIVE_INTEGER_LITERAL:
				{
				alt16=2;
				}
				break;
			case SHORT_LITERAL:
				{
				alt16=3;
				}
				break;
			case BYTE_LITERAL:
				{
				alt16=4;
				}
				break;
			case FLOAT_LITERAL:
			case FLOAT_LITERAL_OR_ID:
				{
				alt16=5;
				}
				break;
			case DOUBLE_LITERAL:
			case DOUBLE_LITERAL_OR_ID:
				{
				alt16=6;
				}
				break;
			case CHAR_LITERAL:
				{
				alt16=7;
				}
				break;
			case STRING_LITERAL:
				{
				alt16=8;
				}
				break;
			case BOOL_LITERAL:
				{
				alt16=9;
				}
				break;
			case NULL_LITERAL:
				{
				alt16=10;
				}
				break;
			case OPEN_BRACE:
				{
				alt16=11;
				}
				break;
			case SUBANNOTATION_DIRECTIVE:
				{
				alt16=12;
				}
				break;
			case ARRAY_DESCRIPTOR:
			case CLASS_DESCRIPTOR:
			case PRIMITIVE_TYPE:
			case VOID_TYPE:
				{
				alt16=13;
				}
				break;
			case ENUM_DIRECTIVE:
				{
				alt16=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:634:5: LONG_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LONG_LITERAL100=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_literal2486); 
					LONG_LITERAL100_tree = (CommonTree)adaptor.create(LONG_LITERAL100);
					adaptor.addChild(root_0, LONG_LITERAL100_tree);

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:635:5: integer_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_literal_in_literal2492);
					integer_literal101=integer_literal();
					state._fsp--;

					adaptor.addChild(root_0, integer_literal101.getTree());

					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:636:5: SHORT_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SHORT_LITERAL102=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_literal2498); 
					SHORT_LITERAL102_tree = (CommonTree)adaptor.create(SHORT_LITERAL102);
					adaptor.addChild(root_0, SHORT_LITERAL102_tree);

					}
					break;
				case 4 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:637:5: BYTE_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BYTE_LITERAL103=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_literal2504); 
					BYTE_LITERAL103_tree = (CommonTree)adaptor.create(BYTE_LITERAL103);
					adaptor.addChild(root_0, BYTE_LITERAL103_tree);

					}
					break;
				case 5 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:638:5: float_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float_literal_in_literal2510);
					float_literal104=float_literal();
					state._fsp--;

					adaptor.addChild(root_0, float_literal104.getTree());

					}
					break;
				case 6 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:639:5: double_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_double_literal_in_literal2516);
					double_literal105=double_literal();
					state._fsp--;

					adaptor.addChild(root_0, double_literal105.getTree());

					}
					break;
				case 7 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:640:5: CHAR_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR_LITERAL106=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_literal2522); 
					CHAR_LITERAL106_tree = (CommonTree)adaptor.create(CHAR_LITERAL106);
					adaptor.addChild(root_0, CHAR_LITERAL106_tree);

					}
					break;
				case 8 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:641:5: STRING_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					STRING_LITERAL107=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal2528); 
					STRING_LITERAL107_tree = (CommonTree)adaptor.create(STRING_LITERAL107);
					adaptor.addChild(root_0, STRING_LITERAL107_tree);

					}
					break;
				case 9 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:642:5: BOOL_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL_LITERAL108=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_literal2534); 
					BOOL_LITERAL108_tree = (CommonTree)adaptor.create(BOOL_LITERAL108);
					adaptor.addChild(root_0, BOOL_LITERAL108_tree);

					}
					break;
				case 10 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:643:5: NULL_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					NULL_LITERAL109=(Token)match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_literal2540); 
					NULL_LITERAL109_tree = (CommonTree)adaptor.create(NULL_LITERAL109);
					adaptor.addChild(root_0, NULL_LITERAL109_tree);

					}
					break;
				case 11 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:644:5: array_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_array_literal_in_literal2546);
					array_literal110=array_literal();
					state._fsp--;

					adaptor.addChild(root_0, array_literal110.getTree());

					}
					break;
				case 12 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:645:5: subannotation
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_subannotation_in_literal2552);
					subannotation111=subannotation();
					state._fsp--;

					adaptor.addChild(root_0, subannotation111.getTree());

					}
					break;
				case 13 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:646:5: type_field_method_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_type_field_method_literal_in_literal2558);
					type_field_method_literal112=type_field_method_literal();
					state._fsp--;

					adaptor.addChild(root_0, type_field_method_literal112.getTree());

					}
					break;
				case 14 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:647:5: enum_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_enum_literal_in_literal2564);
					enum_literal113=enum_literal();
					state._fsp--;

					adaptor.addChild(root_0, enum_literal113.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class parsed_integer_literal_return extends ParserRuleReturnScope {
		public int value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parsed_integer_literal"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:649:1: parsed_integer_literal returns [int value] : integer_literal ;
	public final smaliParser.parsed_integer_literal_return parsed_integer_literal() throws RecognitionException {
		smaliParser.parsed_integer_literal_return retval = new smaliParser.parsed_integer_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope integer_literal114 =null;


		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:650:3: ( integer_literal )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:650:5: integer_literal
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_integer_literal_in_parsed_integer_literal2577);
			integer_literal114=integer_literal();
			state._fsp--;

			adaptor.addChild(root_0, integer_literal114.getTree());

			 retval.value = LiteralTools.parseInt((integer_literal114!=null?input.toString(integer_literal114.start,integer_literal114.stop):null)); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parsed_integer_literal"


	public static class integral_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "integral_literal"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:652:1: integral_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL );
	public final smaliParser.integral_literal_return integral_literal() throws RecognitionException {
		smaliParser.integral_literal_return retval = new smaliParser.integral_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LONG_LITERAL115=null;
		Token SHORT_LITERAL117=null;
		Token CHAR_LITERAL118=null;
		Token BYTE_LITERAL119=null;
		ParserRuleReturnScope integer_literal116 =null;

		CommonTree LONG_LITERAL115_tree=null;
		CommonTree SHORT_LITERAL117_tree=null;
		CommonTree CHAR_LITERAL118_tree=null;
		CommonTree BYTE_LITERAL119_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:653:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL )
			int alt17=5;
			switch ( input.LA(1) ) {
			case LONG_LITERAL:
				{
				alt17=1;
				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
			case POSITIVE_INTEGER_LITERAL:
				{
				alt17=2;
				}
				break;
			case SHORT_LITERAL:
				{
				alt17=3;
				}
				break;
			case CHAR_LITERAL:
				{
				alt17=4;
				}
				break;
			case BYTE_LITERAL:
				{
				alt17=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:653:5: LONG_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LONG_LITERAL115=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_integral_literal2589); 
					LONG_LITERAL115_tree = (CommonTree)adaptor.create(LONG_LITERAL115);
					adaptor.addChild(root_0, LONG_LITERAL115_tree);

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:654:5: integer_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_literal_in_integral_literal2595);
					integer_literal116=integer_literal();
					state._fsp--;

					adaptor.addChild(root_0, integer_literal116.getTree());

					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:655:5: SHORT_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SHORT_LITERAL117=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_integral_literal2601); 
					SHORT_LITERAL117_tree = (CommonTree)adaptor.create(SHORT_LITERAL117);
					adaptor.addChild(root_0, SHORT_LITERAL117_tree);

					}
					break;
				case 4 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:656:5: CHAR_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR_LITERAL118=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_integral_literal2607); 
					CHAR_LITERAL118_tree = (CommonTree)adaptor.create(CHAR_LITERAL118);
					adaptor.addChild(root_0, CHAR_LITERAL118_tree);

					}
					break;
				case 5 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:657:5: BYTE_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BYTE_LITERAL119=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_integral_literal2613); 
					BYTE_LITERAL119_tree = (CommonTree)adaptor.create(BYTE_LITERAL119);
					adaptor.addChild(root_0, BYTE_LITERAL119_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integral_literal"


	public static class fixed_32bit_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fixed_32bit_literal"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:659:1: fixed_32bit_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL );
	public final smaliParser.fixed_32bit_literal_return fixed_32bit_literal() throws RecognitionException {
		smaliParser.fixed_32bit_literal_return retval = new smaliParser.fixed_32bit_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LONG_LITERAL120=null;
		Token SHORT_LITERAL122=null;
		Token BYTE_LITERAL123=null;
		Token CHAR_LITERAL125=null;
		Token BOOL_LITERAL126=null;
		ParserRuleReturnScope integer_literal121 =null;
		ParserRuleReturnScope float_literal124 =null;

		CommonTree LONG_LITERAL120_tree=null;
		CommonTree SHORT_LITERAL122_tree=null;
		CommonTree BYTE_LITERAL123_tree=null;
		CommonTree CHAR_LITERAL125_tree=null;
		CommonTree BOOL_LITERAL126_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:660:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL )
			int alt18=7;
			switch ( input.LA(1) ) {
			case LONG_LITERAL:
				{
				alt18=1;
				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
			case POSITIVE_INTEGER_LITERAL:
				{
				alt18=2;
				}
				break;
			case SHORT_LITERAL:
				{
				alt18=3;
				}
				break;
			case BYTE_LITERAL:
				{
				alt18=4;
				}
				break;
			case FLOAT_LITERAL:
			case FLOAT_LITERAL_OR_ID:
				{
				alt18=5;
				}
				break;
			case CHAR_LITERAL:
				{
				alt18=6;
				}
				break;
			case BOOL_LITERAL:
				{
				alt18=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:660:5: LONG_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LONG_LITERAL120=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_32bit_literal2623); 
					LONG_LITERAL120_tree = (CommonTree)adaptor.create(LONG_LITERAL120);
					adaptor.addChild(root_0, LONG_LITERAL120_tree);

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:661:5: integer_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_literal_in_fixed_32bit_literal2629);
					integer_literal121=integer_literal();
					state._fsp--;

					adaptor.addChild(root_0, integer_literal121.getTree());

					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:662:5: SHORT_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SHORT_LITERAL122=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal2635); 
					SHORT_LITERAL122_tree = (CommonTree)adaptor.create(SHORT_LITERAL122);
					adaptor.addChild(root_0, SHORT_LITERAL122_tree);

					}
					break;
				case 4 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:663:5: BYTE_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BYTE_LITERAL123=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal2641); 
					BYTE_LITERAL123_tree = (CommonTree)adaptor.create(BYTE_LITERAL123);
					adaptor.addChild(root_0, BYTE_LITERAL123_tree);

					}
					break;
				case 5 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:664:5: float_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float_literal_in_fixed_32bit_literal2647);
					float_literal124=float_literal();
					state._fsp--;

					adaptor.addChild(root_0, float_literal124.getTree());

					}
					break;
				case 6 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:665:5: CHAR_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR_LITERAL125=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal2653); 
					CHAR_LITERAL125_tree = (CommonTree)adaptor.create(CHAR_LITERAL125);
					adaptor.addChild(root_0, CHAR_LITERAL125_tree);

					}
					break;
				case 7 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:666:5: BOOL_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL_LITERAL126=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal2659); 
					BOOL_LITERAL126_tree = (CommonTree)adaptor.create(BOOL_LITERAL126);
					adaptor.addChild(root_0, BOOL_LITERAL126_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fixed_32bit_literal"


	public static class fixed_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fixed_literal"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:668:1: fixed_literal : ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL );
	public final smaliParser.fixed_literal_return fixed_literal() throws RecognitionException {
		smaliParser.fixed_literal_return retval = new smaliParser.fixed_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LONG_LITERAL128=null;
		Token SHORT_LITERAL129=null;
		Token BYTE_LITERAL130=null;
		Token CHAR_LITERAL133=null;
		Token BOOL_LITERAL134=null;
		ParserRuleReturnScope integer_literal127 =null;
		ParserRuleReturnScope float_literal131 =null;
		ParserRuleReturnScope double_literal132 =null;

		CommonTree LONG_LITERAL128_tree=null;
		CommonTree SHORT_LITERAL129_tree=null;
		CommonTree BYTE_LITERAL130_tree=null;
		CommonTree CHAR_LITERAL133_tree=null;
		CommonTree BOOL_LITERAL134_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:669:3: ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL )
			int alt19=8;
			switch ( input.LA(1) ) {
			case NEGATIVE_INTEGER_LITERAL:
			case POSITIVE_INTEGER_LITERAL:
				{
				alt19=1;
				}
				break;
			case LONG_LITERAL:
				{
				alt19=2;
				}
				break;
			case SHORT_LITERAL:
				{
				alt19=3;
				}
				break;
			case BYTE_LITERAL:
				{
				alt19=4;
				}
				break;
			case FLOAT_LITERAL:
			case FLOAT_LITERAL_OR_ID:
				{
				alt19=5;
				}
				break;
			case DOUBLE_LITERAL:
			case DOUBLE_LITERAL_OR_ID:
				{
				alt19=6;
				}
				break;
			case CHAR_LITERAL:
				{
				alt19=7;
				}
				break;
			case BOOL_LITERAL:
				{
				alt19=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:669:5: integer_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_literal_in_fixed_literal2669);
					integer_literal127=integer_literal();
					state._fsp--;

					adaptor.addChild(root_0, integer_literal127.getTree());

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:670:5: LONG_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					LONG_LITERAL128=(Token)match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_literal2675); 
					LONG_LITERAL128_tree = (CommonTree)adaptor.create(LONG_LITERAL128);
					adaptor.addChild(root_0, LONG_LITERAL128_tree);

					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:671:5: SHORT_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					SHORT_LITERAL129=(Token)match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_literal2681); 
					SHORT_LITERAL129_tree = (CommonTree)adaptor.create(SHORT_LITERAL129);
					adaptor.addChild(root_0, SHORT_LITERAL129_tree);

					}
					break;
				case 4 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:672:5: BYTE_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BYTE_LITERAL130=(Token)match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_literal2687); 
					BYTE_LITERAL130_tree = (CommonTree)adaptor.create(BYTE_LITERAL130);
					adaptor.addChild(root_0, BYTE_LITERAL130_tree);

					}
					break;
				case 5 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:673:5: float_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_float_literal_in_fixed_literal2693);
					float_literal131=float_literal();
					state._fsp--;

					adaptor.addChild(root_0, float_literal131.getTree());

					}
					break;
				case 6 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:674:5: double_literal
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_double_literal_in_fixed_literal2699);
					double_literal132=double_literal();
					state._fsp--;

					adaptor.addChild(root_0, double_literal132.getTree());

					}
					break;
				case 7 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:675:5: CHAR_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					CHAR_LITERAL133=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_literal2705); 
					CHAR_LITERAL133_tree = (CommonTree)adaptor.create(CHAR_LITERAL133);
					adaptor.addChild(root_0, CHAR_LITERAL133_tree);

					}
					break;
				case 8 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:676:5: BOOL_LITERAL
					{
					root_0 = (CommonTree)adaptor.nil();


					BOOL_LITERAL134=(Token)match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_literal2711); 
					BOOL_LITERAL134_tree = (CommonTree)adaptor.create(BOOL_LITERAL134);
					adaptor.addChild(root_0, BOOL_LITERAL134_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fixed_literal"


	public static class array_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "array_literal"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:678:1: array_literal : OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE -> ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* ) ;
	public final smaliParser.array_literal_return array_literal() throws RecognitionException {
		smaliParser.array_literal_return retval = new smaliParser.array_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPEN_BRACE135=null;
		Token COMMA137=null;
		Token CLOSE_BRACE139=null;
		ParserRuleReturnScope literal136 =null;
		ParserRuleReturnScope literal138 =null;

		CommonTree OPEN_BRACE135_tree=null;
		CommonTree COMMA137_tree=null;
		CommonTree CLOSE_BRACE139_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:679:3: ( OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE -> ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:679:5: OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE
			{
			OPEN_BRACE135=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_array_literal2721);  
			stream_OPEN_BRACE.add(OPEN_BRACE135);

			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:679:16: ( literal ( COMMA literal )* |)
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==ARRAY_DESCRIPTOR||(LA21_0 >= BOOL_LITERAL && LA21_0 <= BYTE_LITERAL)||(LA21_0 >= CHAR_LITERAL && LA21_0 <= CLASS_DESCRIPTOR)||(LA21_0 >= DOUBLE_LITERAL && LA21_0 <= DOUBLE_LITERAL_OR_ID)||LA21_0==ENUM_DIRECTIVE||(LA21_0 >= FLOAT_LITERAL && LA21_0 <= FLOAT_LITERAL_OR_ID)||LA21_0==LONG_LITERAL||(LA21_0 >= NEGATIVE_INTEGER_LITERAL && LA21_0 <= OPEN_BRACE)||(LA21_0 >= POSITIVE_INTEGER_LITERAL && LA21_0 <= PRIMITIVE_TYPE)||LA21_0==SHORT_LITERAL||(LA21_0 >= STRING_LITERAL && LA21_0 <= SUBANNOTATION_DIRECTIVE)||LA21_0==VOID_TYPE) ) {
				alt21=1;
			}
			else if ( (LA21_0==CLOSE_BRACE) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:679:17: literal ( COMMA literal )*
					{
					pushFollow(FOLLOW_literal_in_array_literal2724);
					literal136=literal();
					state._fsp--;

					stream_literal.add(literal136.getTree());
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:679:25: ( COMMA literal )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==COMMA) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:679:26: COMMA literal
							{
							COMMA137=(Token)match(input,COMMA,FOLLOW_COMMA_in_array_literal2727);  
							stream_COMMA.add(COMMA137);

							pushFollow(FOLLOW_literal_in_array_literal2729);
							literal138=literal();
							state._fsp--;

							stream_literal.add(literal138.getTree());
							}
							break;

						default :
							break loop20;
						}
					}

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:679:44: 
					{
					}
					break;

			}

			CLOSE_BRACE139=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_array_literal2737);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE139);

			// AST REWRITE
			// elements: literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 680:5: -> ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:680:8: ^( I_ENCODED_ARRAY[$start, \"I_ENCODED_ARRAY\"] ( literal )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_ARRAY, (retval.start), "I_ENCODED_ARRAY"), root_1);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:680:53: ( literal )*
				while ( stream_literal.hasNext() ) {
					adaptor.addChild(root_1, stream_literal.nextTree());
				}
				stream_literal.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_literal"


	public static class annotation_element_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotation_element"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:682:1: annotation_element : simple_name EQUAL literal -> ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal ) ;
	public final smaliParser.annotation_element_return annotation_element() throws RecognitionException {
		smaliParser.annotation_element_return retval = new smaliParser.annotation_element_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EQUAL141=null;
		ParserRuleReturnScope simple_name140 =null;
		ParserRuleReturnScope literal142 =null;

		CommonTree EQUAL141_tree=null;
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
		RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:683:3: ( simple_name EQUAL literal -> ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:683:5: simple_name EQUAL literal
			{
			pushFollow(FOLLOW_simple_name_in_annotation_element2761);
			simple_name140=simple_name();
			state._fsp--;

			stream_simple_name.add(simple_name140.getTree());
			EQUAL141=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_annotation_element2763);  
			stream_EQUAL.add(EQUAL141);

			pushFollow(FOLLOW_literal_in_annotation_element2765);
			literal142=literal();
			state._fsp--;

			stream_literal.add(literal142.getTree());
			// AST REWRITE
			// elements: literal, simple_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 684:5: -> ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:684:8: ^( I_ANNOTATION_ELEMENT[$start, \"I_ANNOTATION_ELEMENT\"] simple_name literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATION_ELEMENT, (retval.start), "I_ANNOTATION_ELEMENT"), root_1);
				adaptor.addChild(root_1, stream_simple_name.nextTree());
				adaptor.addChild(root_1, stream_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotation_element"


	public static class annotation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "annotation"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:686:1: annotation : ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE -> ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) ) ;
	public final smaliParser.annotation_return annotation() throws RecognitionException {
		smaliParser.annotation_return retval = new smaliParser.annotation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANNOTATION_DIRECTIVE143=null;
		Token ANNOTATION_VISIBILITY144=null;
		Token CLASS_DESCRIPTOR145=null;
		Token END_ANNOTATION_DIRECTIVE147=null;
		ParserRuleReturnScope annotation_element146 =null;

		CommonTree ANNOTATION_DIRECTIVE143_tree=null;
		CommonTree ANNOTATION_VISIBILITY144_tree=null;
		CommonTree CLASS_DESCRIPTOR145_tree=null;
		CommonTree END_ANNOTATION_DIRECTIVE147_tree=null;
		RewriteRuleTokenStream stream_ANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token ANNOTATION_DIRECTIVE");
		RewriteRuleTokenStream stream_ANNOTATION_VISIBILITY=new RewriteRuleTokenStream(adaptor,"token ANNOTATION_VISIBILITY");
		RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");
		RewriteRuleTokenStream stream_END_ANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_ANNOTATION_DIRECTIVE");
		RewriteRuleSubtreeStream stream_annotation_element=new RewriteRuleSubtreeStream(adaptor,"rule annotation_element");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:687:3: ( ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE -> ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:687:5: ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE
			{
			ANNOTATION_DIRECTIVE143=(Token)match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_annotation2790);  
			stream_ANNOTATION_DIRECTIVE.add(ANNOTATION_DIRECTIVE143);

			ANNOTATION_VISIBILITY144=(Token)match(input,ANNOTATION_VISIBILITY,FOLLOW_ANNOTATION_VISIBILITY_in_annotation2792);  
			stream_ANNOTATION_VISIBILITY.add(ANNOTATION_VISIBILITY144);

			CLASS_DESCRIPTOR145=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_annotation2794);  
			stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR145);

			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:688:5: ( annotation_element )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==ACCESS_SPEC||LA22_0==ANNOTATION_VISIBILITY||LA22_0==BOOL_LITERAL||LA22_0==DOUBLE_LITERAL_OR_ID||LA22_0==FLOAT_LITERAL_OR_ID||(LA22_0 >= INSTRUCTION_FORMAT10t && LA22_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA22_0==INSTRUCTION_FORMAT11x||LA22_0==INSTRUCTION_FORMAT12x_OR_ID||(LA22_0 >= INSTRUCTION_FORMAT21c_FIELD && LA22_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA22_0==INSTRUCTION_FORMAT21t||(LA22_0 >= INSTRUCTION_FORMAT22c_FIELD && LA22_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA22_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA22_0 <= INSTRUCTION_FORMAT22t)||LA22_0==INSTRUCTION_FORMAT23x||(LA22_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA22_0 <= INSTRUCTION_FORMAT31t)||(LA22_0 >= INSTRUCTION_FORMAT35c_METHOD && LA22_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA22_0==INSTRUCTION_FORMAT51l||(LA22_0 >= NEGATIVE_INTEGER_LITERAL && LA22_0 <= NULL_LITERAL)||(LA22_0 >= PARAM_LIST_OR_ID && LA22_0 <= PRIMITIVE_TYPE)||LA22_0==REGISTER||LA22_0==SIMPLE_NAME||(LA22_0 >= VERIFICATION_ERROR_TYPE && LA22_0 <= VOID_TYPE)) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:688:5: annotation_element
					{
					pushFollow(FOLLOW_annotation_element_in_annotation2800);
					annotation_element146=annotation_element();
					state._fsp--;

					stream_annotation_element.add(annotation_element146.getTree());
					}
					break;

				default :
					break loop22;
				}
			}

			END_ANNOTATION_DIRECTIVE147=(Token)match(input,END_ANNOTATION_DIRECTIVE,FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation2803);  
			stream_END_ANNOTATION_DIRECTIVE.add(END_ANNOTATION_DIRECTIVE147);

			// AST REWRITE
			// elements: CLASS_DESCRIPTOR, ANNOTATION_VISIBILITY, annotation_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 689:5: -> ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:689:8: ^( I_ANNOTATION[$start, \"I_ANNOTATION\"] ANNOTATION_VISIBILITY ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATION, (retval.start), "I_ANNOTATION"), root_1);
				adaptor.addChild(root_1, stream_ANNOTATION_VISIBILITY.nextNode());
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:689:69: ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SUBANNOTATION, (retval.start), "I_SUBANNOTATION"), root_2);
				adaptor.addChild(root_2, stream_CLASS_DESCRIPTOR.nextNode());
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:689:131: ( annotation_element )*
				while ( stream_annotation_element.hasNext() ) {
					adaptor.addChild(root_2, stream_annotation_element.nextTree());
				}
				stream_annotation_element.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "annotation"


	public static class subannotation_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "subannotation"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:691:1: subannotation : SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE -> ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) ;
	public final smaliParser.subannotation_return subannotation() throws RecognitionException {
		smaliParser.subannotation_return retval = new smaliParser.subannotation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SUBANNOTATION_DIRECTIVE148=null;
		Token CLASS_DESCRIPTOR149=null;
		Token END_SUBANNOTATION_DIRECTIVE151=null;
		ParserRuleReturnScope annotation_element150 =null;

		CommonTree SUBANNOTATION_DIRECTIVE148_tree=null;
		CommonTree CLASS_DESCRIPTOR149_tree=null;
		CommonTree END_SUBANNOTATION_DIRECTIVE151_tree=null;
		RewriteRuleTokenStream stream_SUBANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SUBANNOTATION_DIRECTIVE");
		RewriteRuleTokenStream stream_CLASS_DESCRIPTOR=new RewriteRuleTokenStream(adaptor,"token CLASS_DESCRIPTOR");
		RewriteRuleTokenStream stream_END_SUBANNOTATION_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_SUBANNOTATION_DIRECTIVE");
		RewriteRuleSubtreeStream stream_annotation_element=new RewriteRuleSubtreeStream(adaptor,"rule annotation_element");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:692:3: ( SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE -> ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:692:5: SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE
			{
			SUBANNOTATION_DIRECTIVE148=(Token)match(input,SUBANNOTATION_DIRECTIVE,FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation2836);  
			stream_SUBANNOTATION_DIRECTIVE.add(SUBANNOTATION_DIRECTIVE148);

			CLASS_DESCRIPTOR149=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_subannotation2838);  
			stream_CLASS_DESCRIPTOR.add(CLASS_DESCRIPTOR149);

			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:692:46: ( annotation_element )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==ACCESS_SPEC||LA23_0==ANNOTATION_VISIBILITY||LA23_0==BOOL_LITERAL||LA23_0==DOUBLE_LITERAL_OR_ID||LA23_0==FLOAT_LITERAL_OR_ID||(LA23_0 >= INSTRUCTION_FORMAT10t && LA23_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA23_0==INSTRUCTION_FORMAT11x||LA23_0==INSTRUCTION_FORMAT12x_OR_ID||(LA23_0 >= INSTRUCTION_FORMAT21c_FIELD && LA23_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA23_0==INSTRUCTION_FORMAT21t||(LA23_0 >= INSTRUCTION_FORMAT22c_FIELD && LA23_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA23_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA23_0 <= INSTRUCTION_FORMAT22t)||LA23_0==INSTRUCTION_FORMAT23x||(LA23_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA23_0 <= INSTRUCTION_FORMAT31t)||(LA23_0 >= INSTRUCTION_FORMAT35c_METHOD && LA23_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA23_0==INSTRUCTION_FORMAT51l||(LA23_0 >= NEGATIVE_INTEGER_LITERAL && LA23_0 <= NULL_LITERAL)||(LA23_0 >= PARAM_LIST_OR_ID && LA23_0 <= PRIMITIVE_TYPE)||LA23_0==REGISTER||LA23_0==SIMPLE_NAME||(LA23_0 >= VERIFICATION_ERROR_TYPE && LA23_0 <= VOID_TYPE)) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:692:46: annotation_element
					{
					pushFollow(FOLLOW_annotation_element_in_subannotation2840);
					annotation_element150=annotation_element();
					state._fsp--;

					stream_annotation_element.add(annotation_element150.getTree());
					}
					break;

				default :
					break loop23;
				}
			}

			END_SUBANNOTATION_DIRECTIVE151=(Token)match(input,END_SUBANNOTATION_DIRECTIVE,FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation2843);  
			stream_END_SUBANNOTATION_DIRECTIVE.add(END_SUBANNOTATION_DIRECTIVE151);

			// AST REWRITE
			// elements: CLASS_DESCRIPTOR, annotation_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 693:5: -> ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:693:8: ^( I_SUBANNOTATION[$start, \"I_SUBANNOTATION\"] CLASS_DESCRIPTOR ( annotation_element )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SUBANNOTATION, (retval.start), "I_SUBANNOTATION"), root_1);
				adaptor.addChild(root_1, stream_CLASS_DESCRIPTOR.nextNode());
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:693:70: ( annotation_element )*
				while ( stream_annotation_element.hasNext() ) {
					adaptor.addChild(root_1, stream_annotation_element.nextTree());
				}
				stream_annotation_element.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subannotation"


	public static class enum_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "enum_literal"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:695:1: enum_literal : ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor -> ^( I_ENCODED_ENUM reference_type_descriptor simple_name reference_type_descriptor ) ;
	public final smaliParser.enum_literal_return enum_literal() throws RecognitionException {
		smaliParser.enum_literal_return retval = new smaliParser.enum_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ENUM_DIRECTIVE152=null;
		Token ARROW154=null;
		Token COLON156=null;
		ParserRuleReturnScope reference_type_descriptor153 =null;
		ParserRuleReturnScope simple_name155 =null;
		ParserRuleReturnScope reference_type_descriptor157 =null;

		CommonTree ENUM_DIRECTIVE152_tree=null;
		CommonTree ARROW154_tree=null;
		CommonTree COLON156_tree=null;
		RewriteRuleTokenStream stream_ENUM_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token ENUM_DIRECTIVE");
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");
		RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:696:3: ( ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor -> ^( I_ENCODED_ENUM reference_type_descriptor simple_name reference_type_descriptor ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:696:5: ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor
			{
			ENUM_DIRECTIVE152=(Token)match(input,ENUM_DIRECTIVE,FOLLOW_ENUM_DIRECTIVE_in_enum_literal2869);  
			stream_ENUM_DIRECTIVE.add(ENUM_DIRECTIVE152);

			pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal2871);
			reference_type_descriptor153=reference_type_descriptor();
			state._fsp--;

			stream_reference_type_descriptor.add(reference_type_descriptor153.getTree());
			ARROW154=(Token)match(input,ARROW,FOLLOW_ARROW_in_enum_literal2873);  
			stream_ARROW.add(ARROW154);

			pushFollow(FOLLOW_simple_name_in_enum_literal2875);
			simple_name155=simple_name();
			state._fsp--;

			stream_simple_name.add(simple_name155.getTree());
			COLON156=(Token)match(input,COLON,FOLLOW_COLON_in_enum_literal2877);  
			stream_COLON.add(COLON156);

			pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal2879);
			reference_type_descriptor157=reference_type_descriptor();
			state._fsp--;

			stream_reference_type_descriptor.add(reference_type_descriptor157.getTree());
			// AST REWRITE
			// elements: reference_type_descriptor, reference_type_descriptor, simple_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 697:3: -> ^( I_ENCODED_ENUM reference_type_descriptor simple_name reference_type_descriptor )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:697:6: ^( I_ENCODED_ENUM reference_type_descriptor simple_name reference_type_descriptor )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_ENUM, "I_ENCODED_ENUM"), root_1);
				adaptor.addChild(root_1, stream_reference_type_descriptor.nextTree());
				adaptor.addChild(root_1, stream_simple_name.nextTree());
				adaptor.addChild(root_1, stream_reference_type_descriptor.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enum_literal"


	public static class type_field_method_literal_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_field_method_literal"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:699:1: type_field_method_literal : ( reference_type_descriptor ( ARROW ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor member_name method_prototype ) ) | -> reference_type_descriptor ) | PRIMITIVE_TYPE | VOID_TYPE );
	public final smaliParser.type_field_method_literal_return type_field_method_literal() throws RecognitionException {
		smaliParser.type_field_method_literal_return retval = new smaliParser.type_field_method_literal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ARROW159=null;
		Token COLON161=null;
		Token PRIMITIVE_TYPE165=null;
		Token VOID_TYPE166=null;
		ParserRuleReturnScope reference_type_descriptor158 =null;
		ParserRuleReturnScope member_name160 =null;
		ParserRuleReturnScope nonvoid_type_descriptor162 =null;
		ParserRuleReturnScope member_name163 =null;
		ParserRuleReturnScope method_prototype164 =null;

		CommonTree ARROW159_tree=null;
		CommonTree COLON161_tree=null;
		CommonTree PRIMITIVE_TYPE165_tree=null;
		CommonTree VOID_TYPE166_tree=null;
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
		RewriteRuleSubtreeStream stream_member_name=new RewriteRuleSubtreeStream(adaptor,"rule member_name");
		RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:700:3: ( reference_type_descriptor ( ARROW ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor member_name method_prototype ) ) | -> reference_type_descriptor ) | PRIMITIVE_TYPE | VOID_TYPE )
			int alt26=3;
			switch ( input.LA(1) ) {
			case ARRAY_DESCRIPTOR:
			case CLASS_DESCRIPTOR:
				{
				alt26=1;
				}
				break;
			case PRIMITIVE_TYPE:
				{
				alt26=2;
				}
				break;
			case VOID_TYPE:
				{
				alt26=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:700:5: reference_type_descriptor ( ARROW ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor member_name method_prototype ) ) | -> reference_type_descriptor )
					{
					pushFollow(FOLLOW_reference_type_descriptor_in_type_field_method_literal2903);
					reference_type_descriptor158=reference_type_descriptor();
					state._fsp--;

					stream_reference_type_descriptor.add(reference_type_descriptor158.getTree());
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:701:5: ( ARROW ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor member_name method_prototype ) ) | -> reference_type_descriptor )
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ARROW) ) {
						alt25=1;
					}
					else if ( (LA25_0==EOF||(LA25_0 >= ACCESS_SPEC && LA25_0 <= ANNOTATION_VISIBILITY)||LA25_0==BOOL_LITERAL||(LA25_0 >= CLASS_DIRECTIVE && LA25_0 <= CLOSE_BRACE)||LA25_0==COMMA||(LA25_0 >= DOUBLE_LITERAL_OR_ID && LA25_0 <= END_ANNOTATION_DIRECTIVE)||LA25_0==END_FIELD_DIRECTIVE||LA25_0==END_SUBANNOTATION_DIRECTIVE||LA25_0==FIELD_DIRECTIVE||LA25_0==FLOAT_LITERAL_OR_ID||LA25_0==IMPLEMENTS_DIRECTIVE||(LA25_0 >= INSTRUCTION_FORMAT10t && LA25_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA25_0==INSTRUCTION_FORMAT11x||LA25_0==INSTRUCTION_FORMAT12x_OR_ID||(LA25_0 >= INSTRUCTION_FORMAT21c_FIELD && LA25_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA25_0==INSTRUCTION_FORMAT21t||(LA25_0 >= INSTRUCTION_FORMAT22c_FIELD && LA25_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA25_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA25_0 <= INSTRUCTION_FORMAT22t)||LA25_0==INSTRUCTION_FORMAT23x||(LA25_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA25_0 <= INSTRUCTION_FORMAT31t)||(LA25_0 >= INSTRUCTION_FORMAT35c_METHOD && LA25_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA25_0==INSTRUCTION_FORMAT51l||(LA25_0 >= METHOD_DIRECTIVE && LA25_0 <= NULL_LITERAL)||(LA25_0 >= PARAM_LIST_OR_ID && LA25_0 <= PRIMITIVE_TYPE)||LA25_0==REGISTER||(LA25_0 >= SIMPLE_NAME && LA25_0 <= SOURCE_DIRECTIVE)||(LA25_0 >= SUPER_DIRECTIVE && LA25_0 <= VOID_TYPE)) ) {
						alt25=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}

					switch (alt25) {
						case 1 :
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:701:7: ARROW ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor member_name method_prototype ) )
							{
							ARROW159=(Token)match(input,ARROW,FOLLOW_ARROW_in_type_field_method_literal2911);  
							stream_ARROW.add(ARROW159);

							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:702:7: ( member_name COLON nonvoid_type_descriptor -> ^( I_ENCODED_FIELD reference_type_descriptor member_name nonvoid_type_descriptor ) | member_name method_prototype -> ^( I_ENCODED_METHOD reference_type_descriptor member_name method_prototype ) )
							int alt24=2;
							switch ( input.LA(1) ) {
							case SIMPLE_NAME:
								{
								int LA24_1 = input.LA(2);
								if ( (LA24_1==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_1==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case ACCESS_SPEC:
								{
								int LA24_2 = input.LA(2);
								if ( (LA24_2==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_2==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 2, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case VERIFICATION_ERROR_TYPE:
								{
								int LA24_3 = input.LA(2);
								if ( (LA24_3==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_3==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 3, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case POSITIVE_INTEGER_LITERAL:
								{
								int LA24_4 = input.LA(2);
								if ( (LA24_4==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_4==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 4, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case NEGATIVE_INTEGER_LITERAL:
								{
								int LA24_5 = input.LA(2);
								if ( (LA24_5==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_5==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case FLOAT_LITERAL_OR_ID:
								{
								int LA24_6 = input.LA(2);
								if ( (LA24_6==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_6==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case DOUBLE_LITERAL_OR_ID:
								{
								int LA24_7 = input.LA(2);
								if ( (LA24_7==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_7==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 7, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case BOOL_LITERAL:
								{
								int LA24_8 = input.LA(2);
								if ( (LA24_8==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_8==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 8, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case NULL_LITERAL:
								{
								int LA24_9 = input.LA(2);
								if ( (LA24_9==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_9==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 9, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case REGISTER:
								{
								int LA24_10 = input.LA(2);
								if ( (LA24_10==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_10==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case PARAM_LIST_OR_ID:
								{
								int LA24_11 = input.LA(2);
								if ( (LA24_11==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_11==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case PRIMITIVE_TYPE:
								{
								int LA24_12 = input.LA(2);
								if ( (LA24_12==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_12==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 12, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case VOID_TYPE:
								{
								int LA24_13 = input.LA(2);
								if ( (LA24_13==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_13==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 13, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case ANNOTATION_VISIBILITY:
								{
								int LA24_14 = input.LA(2);
								if ( (LA24_14==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_14==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 14, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT10t:
								{
								int LA24_15 = input.LA(2);
								if ( (LA24_15==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_15==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 15, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT10x:
								{
								int LA24_16 = input.LA(2);
								if ( (LA24_16==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_16==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 16, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT10x_ODEX:
								{
								int LA24_17 = input.LA(2);
								if ( (LA24_17==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_17==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 17, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT11x:
								{
								int LA24_18 = input.LA(2);
								if ( (LA24_18==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_18==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT12x_OR_ID:
								{
								int LA24_19 = input.LA(2);
								if ( (LA24_19==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_19==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 19, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT21c_FIELD:
								{
								int LA24_20 = input.LA(2);
								if ( (LA24_20==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_20==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 20, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT21c_FIELD_ODEX:
								{
								int LA24_21 = input.LA(2);
								if ( (LA24_21==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_21==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 21, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT21c_STRING:
								{
								int LA24_22 = input.LA(2);
								if ( (LA24_22==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_22==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 22, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT21c_TYPE:
								{
								int LA24_23 = input.LA(2);
								if ( (LA24_23==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_23==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 23, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT21t:
								{
								int LA24_24 = input.LA(2);
								if ( (LA24_24==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_24==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 24, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT22c_FIELD:
								{
								int LA24_25 = input.LA(2);
								if ( (LA24_25==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_25==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 25, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT22c_FIELD_ODEX:
								{
								int LA24_26 = input.LA(2);
								if ( (LA24_26==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_26==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 26, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT22c_TYPE:
								{
								int LA24_27 = input.LA(2);
								if ( (LA24_27==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_27==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 27, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT22cs_FIELD:
								{
								int LA24_28 = input.LA(2);
								if ( (LA24_28==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_28==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 28, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT22s_OR_ID:
								{
								int LA24_29 = input.LA(2);
								if ( (LA24_29==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_29==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 29, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT22t:
								{
								int LA24_30 = input.LA(2);
								if ( (LA24_30==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_30==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 30, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT23x:
								{
								int LA24_31 = input.LA(2);
								if ( (LA24_31==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_31==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 31, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT31i_OR_ID:
								{
								int LA24_32 = input.LA(2);
								if ( (LA24_32==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_32==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 32, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT31t:
								{
								int LA24_33 = input.LA(2);
								if ( (LA24_33==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_33==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 33, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT35c_METHOD:
								{
								int LA24_34 = input.LA(2);
								if ( (LA24_34==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_34==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 34, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT35c_METHOD_ODEX:
								{
								int LA24_35 = input.LA(2);
								if ( (LA24_35==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_35==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 35, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT35c_TYPE:
								{
								int LA24_36 = input.LA(2);
								if ( (LA24_36==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_36==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 36, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT35mi_METHOD:
								{
								int LA24_37 = input.LA(2);
								if ( (LA24_37==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_37==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 37, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT35ms_METHOD:
								{
								int LA24_38 = input.LA(2);
								if ( (LA24_38==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_38==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 38, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case INSTRUCTION_FORMAT51l:
								{
								int LA24_39 = input.LA(2);
								if ( (LA24_39==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_39==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 39, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case MEMBER_NAME:
								{
								int LA24_40 = input.LA(2);
								if ( (LA24_40==COLON) ) {
									alt24=1;
								}
								else if ( (LA24_40==OPEN_PAREN) ) {
									alt24=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 24, 40, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 24, 0, input);
								throw nvae;
							}
							switch (alt24) {
								case 1 :
									// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:702:9: member_name COLON nonvoid_type_descriptor
									{
									pushFollow(FOLLOW_member_name_in_type_field_method_literal2921);
									member_name160=member_name();
									state._fsp--;

									stream_member_name.add(member_name160.getTree());
									COLON161=(Token)match(input,COLON,FOLLOW_COLON_in_type_field_method_literal2923);  
									stream_COLON.add(COLON161);

									pushFollow(FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal2925);
									nonvoid_type_descriptor162=nonvoid_type_descriptor();
									state._fsp--;

									stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor162.getTree());
									// AST REWRITE
									// elements: member_name, reference_type_descriptor, nonvoid_type_descriptor
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 702:51: -> ^( I_ENCODED_FIELD reference_type_descriptor member_name nonvoid_type_descriptor )
									{
										// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:702:54: ^( I_ENCODED_FIELD reference_type_descriptor member_name nonvoid_type_descriptor )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_FIELD, "I_ENCODED_FIELD"), root_1);
										adaptor.addChild(root_1, stream_reference_type_descriptor.nextTree());
										adaptor.addChild(root_1, stream_member_name.nextTree());
										adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;
								case 2 :
									// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:703:9: member_name method_prototype
									{
									pushFollow(FOLLOW_member_name_in_type_field_method_literal2947);
									member_name163=member_name();
									state._fsp--;

									stream_member_name.add(member_name163.getTree());
									pushFollow(FOLLOW_method_prototype_in_type_field_method_literal2949);
									method_prototype164=method_prototype();
									state._fsp--;

									stream_method_prototype.add(method_prototype164.getTree());
									// AST REWRITE
									// elements: method_prototype, member_name, reference_type_descriptor
									// token labels: 
									// rule labels: retval
									// token list labels: 
									// rule list labels: 
									// wildcard labels: 
									retval.tree = root_0;
									RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

									root_0 = (CommonTree)adaptor.nil();
									// 703:38: -> ^( I_ENCODED_METHOD reference_type_descriptor member_name method_prototype )
									{
										// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:703:41: ^( I_ENCODED_METHOD reference_type_descriptor member_name method_prototype )
										{
										CommonTree root_1 = (CommonTree)adaptor.nil();
										root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ENCODED_METHOD, "I_ENCODED_METHOD"), root_1);
										adaptor.addChild(root_1, stream_reference_type_descriptor.nextTree());
										adaptor.addChild(root_1, stream_member_name.nextTree());
										adaptor.addChild(root_1, stream_method_prototype.nextTree());
										adaptor.addChild(root_0, root_1);
										}

									}


									retval.tree = root_0;

									}
									break;

							}

							}
							break;
						case 2 :
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:705:7: 
							{
							// AST REWRITE
							// elements: reference_type_descriptor
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 705:7: -> reference_type_descriptor
							{
								adaptor.addChild(root_0, stream_reference_type_descriptor.nextTree());
							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:707:5: PRIMITIVE_TYPE
					{
					root_0 = (CommonTree)adaptor.nil();


					PRIMITIVE_TYPE165=(Token)match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal2991); 
					PRIMITIVE_TYPE165_tree = (CommonTree)adaptor.create(PRIMITIVE_TYPE165);
					adaptor.addChild(root_0, PRIMITIVE_TYPE165_tree);

					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:708:5: VOID_TYPE
					{
					root_0 = (CommonTree)adaptor.nil();


					VOID_TYPE166=(Token)match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_type_field_method_literal2997); 
					VOID_TYPE166_tree = (CommonTree)adaptor.create(VOID_TYPE166);
					adaptor.addChild(root_0, VOID_TYPE166_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_field_method_literal"


	public static class fully_qualified_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fully_qualified_method"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:710:1: fully_qualified_method : reference_type_descriptor ARROW member_name method_prototype -> reference_type_descriptor member_name method_prototype ;
	public final smaliParser.fully_qualified_method_return fully_qualified_method() throws RecognitionException {
		smaliParser.fully_qualified_method_return retval = new smaliParser.fully_qualified_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ARROW168=null;
		ParserRuleReturnScope reference_type_descriptor167 =null;
		ParserRuleReturnScope member_name169 =null;
		ParserRuleReturnScope method_prototype170 =null;

		CommonTree ARROW168_tree=null;
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleSubtreeStream stream_method_prototype=new RewriteRuleSubtreeStream(adaptor,"rule method_prototype");
		RewriteRuleSubtreeStream stream_member_name=new RewriteRuleSubtreeStream(adaptor,"rule member_name");
		RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:711:3: ( reference_type_descriptor ARROW member_name method_prototype -> reference_type_descriptor member_name method_prototype )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:711:5: reference_type_descriptor ARROW member_name method_prototype
			{
			pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_method3007);
			reference_type_descriptor167=reference_type_descriptor();
			state._fsp--;

			stream_reference_type_descriptor.add(reference_type_descriptor167.getTree());
			ARROW168=(Token)match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_method3009);  
			stream_ARROW.add(ARROW168);

			pushFollow(FOLLOW_member_name_in_fully_qualified_method3011);
			member_name169=member_name();
			state._fsp--;

			stream_member_name.add(member_name169.getTree());
			pushFollow(FOLLOW_method_prototype_in_fully_qualified_method3013);
			method_prototype170=method_prototype();
			state._fsp--;

			stream_method_prototype.add(method_prototype170.getTree());
			// AST REWRITE
			// elements: member_name, reference_type_descriptor, method_prototype
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 712:3: -> reference_type_descriptor member_name method_prototype
			{
				adaptor.addChild(root_0, stream_reference_type_descriptor.nextTree());
				adaptor.addChild(root_0, stream_member_name.nextTree());
				adaptor.addChild(root_0, stream_method_prototype.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fully_qualified_method"


	public static class fully_qualified_field_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fully_qualified_field"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:714:1: fully_qualified_field : reference_type_descriptor ARROW member_name COLON nonvoid_type_descriptor -> reference_type_descriptor member_name nonvoid_type_descriptor ;
	public final smaliParser.fully_qualified_field_return fully_qualified_field() throws RecognitionException {
		smaliParser.fully_qualified_field_return retval = new smaliParser.fully_qualified_field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ARROW172=null;
		Token COLON174=null;
		ParserRuleReturnScope reference_type_descriptor171 =null;
		ParserRuleReturnScope member_name173 =null;
		ParserRuleReturnScope nonvoid_type_descriptor175 =null;

		CommonTree ARROW172_tree=null;
		CommonTree COLON174_tree=null;
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
		RewriteRuleSubtreeStream stream_member_name=new RewriteRuleSubtreeStream(adaptor,"rule member_name");
		RewriteRuleSubtreeStream stream_reference_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule reference_type_descriptor");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:715:3: ( reference_type_descriptor ARROW member_name COLON nonvoid_type_descriptor -> reference_type_descriptor member_name nonvoid_type_descriptor )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:715:5: reference_type_descriptor ARROW member_name COLON nonvoid_type_descriptor
			{
			pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_field3033);
			reference_type_descriptor171=reference_type_descriptor();
			state._fsp--;

			stream_reference_type_descriptor.add(reference_type_descriptor171.getTree());
			ARROW172=(Token)match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_field3035);  
			stream_ARROW.add(ARROW172);

			pushFollow(FOLLOW_member_name_in_fully_qualified_field3037);
			member_name173=member_name();
			state._fsp--;

			stream_member_name.add(member_name173.getTree());
			COLON174=(Token)match(input,COLON,FOLLOW_COLON_in_fully_qualified_field3039);  
			stream_COLON.add(COLON174);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field3041);
			nonvoid_type_descriptor175=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor175.getTree());
			// AST REWRITE
			// elements: reference_type_descriptor, nonvoid_type_descriptor, member_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 716:3: -> reference_type_descriptor member_name nonvoid_type_descriptor
			{
				adaptor.addChild(root_0, stream_reference_type_descriptor.nextTree());
				adaptor.addChild(root_0, stream_member_name.nextTree());
				adaptor.addChild(root_0, stream_nonvoid_type_descriptor.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fully_qualified_field"


	public static class label_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:718:1: label : COLON simple_name -> ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name ) ;
	public final smaliParser.label_return label() throws RecognitionException {
		smaliParser.label_return retval = new smaliParser.label_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COLON176=null;
		ParserRuleReturnScope simple_name177 =null;

		CommonTree COLON176_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:719:3: ( COLON simple_name -> ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:719:5: COLON simple_name
			{
			COLON176=(Token)match(input,COLON,FOLLOW_COLON_in_label3061);  
			stream_COLON.add(COLON176);

			pushFollow(FOLLOW_simple_name_in_label3063);
			simple_name177=simple_name();
			state._fsp--;

			stream_simple_name.add(simple_name177.getTree());
			// AST REWRITE
			// elements: simple_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 719:23: -> ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:719:26: ^( I_LABEL[$COLON, \"I_LABEL\"] simple_name )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LABEL, COLON176, "I_LABEL"), root_1);
				adaptor.addChild(root_1, stream_simple_name.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "label"


	public static class label_ref_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "label_ref"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:721:1: label_ref : COLON simple_name -> simple_name ;
	public final smaliParser.label_ref_return label_ref() throws RecognitionException {
		smaliParser.label_ref_return retval = new smaliParser.label_ref_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COLON178=null;
		ParserRuleReturnScope simple_name179 =null;

		CommonTree COLON178_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleSubtreeStream stream_simple_name=new RewriteRuleSubtreeStream(adaptor,"rule simple_name");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:722:3: ( COLON simple_name -> simple_name )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:722:5: COLON simple_name
			{
			COLON178=(Token)match(input,COLON,FOLLOW_COLON_in_label_ref3082);  
			stream_COLON.add(COLON178);

			pushFollow(FOLLOW_simple_name_in_label_ref3084);
			simple_name179=simple_name();
			state._fsp--;

			stream_simple_name.add(simple_name179.getTree());
			// AST REWRITE
			// elements: simple_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 722:23: -> simple_name
			{
				adaptor.addChild(root_0, stream_simple_name.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "label_ref"


	public static class register_list_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "register_list"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:724:1: register_list : ( REGISTER ( COMMA REGISTER )* -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* ) | -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ) );
	public final smaliParser.register_list_return register_list() throws RecognitionException {
		smaliParser.register_list_return retval = new smaliParser.register_list_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token REGISTER180=null;
		Token COMMA181=null;
		Token REGISTER182=null;

		CommonTree REGISTER180_tree=null;
		CommonTree COMMA181_tree=null;
		CommonTree REGISTER182_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:725:3: ( REGISTER ( COMMA REGISTER )* -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* ) | -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ) )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==REGISTER) ) {
				alt28=1;
			}
			else if ( (LA28_0==CLOSE_BRACE) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:725:5: REGISTER ( COMMA REGISTER )*
					{
					REGISTER180=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_list3098);  
					stream_REGISTER.add(REGISTER180);

					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:725:14: ( COMMA REGISTER )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==COMMA) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:725:15: COMMA REGISTER
							{
							COMMA181=(Token)match(input,COMMA,FOLLOW_COMMA_in_register_list3101);  
							stream_COMMA.add(COMMA181);

							REGISTER182=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_list3103);  
							stream_REGISTER.add(REGISTER182);

							}
							break;

						default :
							break loop27;
						}
					}

					// AST REWRITE
					// elements: REGISTER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 725:32: -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* )
					{
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:725:35: ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] ( REGISTER )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTER_LIST, (retval.start), "I_REGISTER_LIST"), root_1);
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:725:80: ( REGISTER )*
						while ( stream_REGISTER.hasNext() ) {
							adaptor.addChild(root_1, stream_REGISTER.nextNode());
						}
						stream_REGISTER.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:726:5: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 726:5: -> ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] )
					{
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:726:7: ^( I_REGISTER_LIST[$start, \"I_REGISTER_LIST\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTER_LIST, (retval.start), "I_REGISTER_LIST"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "register_list"


	public static class register_range_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "register_range"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:728:1: register_range : (startreg= REGISTER ( DOTDOT endreg= REGISTER )? )? -> ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] ( $startreg)? ( $endreg)? ) ;
	public final smaliParser.register_range_return register_range() throws RecognitionException {
		smaliParser.register_range_return retval = new smaliParser.register_range_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token startreg=null;
		Token endreg=null;
		Token DOTDOT183=null;

		CommonTree startreg_tree=null;
		CommonTree endreg_tree=null;
		CommonTree DOTDOT183_tree=null;
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:729:3: ( (startreg= REGISTER ( DOTDOT endreg= REGISTER )? )? -> ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] ( $startreg)? ( $endreg)? ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:729:5: (startreg= REGISTER ( DOTDOT endreg= REGISTER )? )?
			{
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:729:5: (startreg= REGISTER ( DOTDOT endreg= REGISTER )? )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==REGISTER) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:729:6: startreg= REGISTER ( DOTDOT endreg= REGISTER )?
					{
					startreg=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_range3138);  
					stream_REGISTER.add(startreg);

					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:729:24: ( DOTDOT endreg= REGISTER )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==DOTDOT) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:729:25: DOTDOT endreg= REGISTER
							{
							DOTDOT183=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_register_range3141);  
							stream_DOTDOT.add(DOTDOT183);

							endreg=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_register_range3145);  
							stream_REGISTER.add(endreg);

							}
							break;

					}

					}
					break;

			}

			// AST REWRITE
			// elements: endreg, startreg
			// token labels: endreg, startreg
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_endreg=new RewriteRuleTokenStream(adaptor,"token endreg",endreg);
			RewriteRuleTokenStream stream_startreg=new RewriteRuleTokenStream(adaptor,"token startreg",startreg);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 729:52: -> ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] ( $startreg)? ( $endreg)? )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:729:55: ^( I_REGISTER_RANGE[$start, \"I_REGISTER_RANGE\"] ( $startreg)? ( $endreg)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_REGISTER_RANGE, (retval.start), "I_REGISTER_RANGE"), root_1);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:729:103: ( $startreg)?
				if ( stream_startreg.hasNext() ) {
					adaptor.addChild(root_1, stream_startreg.nextNode());
				}
				stream_startreg.reset();

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:729:114: ( $endreg)?
				if ( stream_endreg.hasNext() ) {
					adaptor.addChild(root_1, stream_endreg.nextNode());
				}
				stream_endreg.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "register_range"


	public static class verification_error_reference_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "verification_error_reference"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:731:1: verification_error_reference : ( CLASS_DESCRIPTOR | fully_qualified_field | fully_qualified_method );
	public final smaliParser.verification_error_reference_return verification_error_reference() throws RecognitionException {
		smaliParser.verification_error_reference_return retval = new smaliParser.verification_error_reference_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CLASS_DESCRIPTOR184=null;
		ParserRuleReturnScope fully_qualified_field185 =null;
		ParserRuleReturnScope fully_qualified_method186 =null;

		CommonTree CLASS_DESCRIPTOR184_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:732:3: ( CLASS_DESCRIPTOR | fully_qualified_field | fully_qualified_method )
			int alt31=3;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==CLASS_DESCRIPTOR) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==ANNOTATION_DIRECTIVE||LA31_1==ARRAY_DATA_DIRECTIVE||(LA31_1 >= CATCHALL_DIRECTIVE && LA31_1 <= CATCH_DIRECTIVE)||LA31_1==COLON||(LA31_1 >= END_LOCAL_DIRECTIVE && LA31_1 <= END_METHOD_DIRECTIVE)||LA31_1==EPILOGUE_DIRECTIVE||(LA31_1 >= INSTRUCTION_FORMAT10t && LA31_1 <= INSTRUCTION_FORMAT51l)||(LA31_1 >= LINE_DIRECTIVE && LA31_1 <= LOCAL_DIRECTIVE)||(LA31_1 >= PACKED_SWITCH_DIRECTIVE && LA31_1 <= PARAMETER_DIRECTIVE)||LA31_1==PROLOGUE_DIRECTIVE||(LA31_1 >= REGISTERS_DIRECTIVE && LA31_1 <= RESTART_LOCAL_DIRECTIVE)||(LA31_1 >= SOURCE_DIRECTIVE && LA31_1 <= SPARSE_SWITCH_DIRECTIVE)) ) {
					alt31=1;
				}
				else if ( (LA31_1==ARROW) ) {
					switch ( input.LA(3) ) {
					case SIMPLE_NAME:
						{
						int LA31_5 = input.LA(4);
						if ( (LA31_5==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_5==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ACCESS_SPEC:
						{
						int LA31_6 = input.LA(4);
						if ( (LA31_6==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_6==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case VERIFICATION_ERROR_TYPE:
						{
						int LA31_7 = input.LA(4);
						if ( (LA31_7==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_7==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case POSITIVE_INTEGER_LITERAL:
						{
						int LA31_8 = input.LA(4);
						if ( (LA31_8==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_8==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case NEGATIVE_INTEGER_LITERAL:
						{
						int LA31_9 = input.LA(4);
						if ( (LA31_9==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_9==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case FLOAT_LITERAL_OR_ID:
						{
						int LA31_10 = input.LA(4);
						if ( (LA31_10==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_10==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case DOUBLE_LITERAL_OR_ID:
						{
						int LA31_11 = input.LA(4);
						if ( (LA31_11==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_11==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case BOOL_LITERAL:
						{
						int LA31_12 = input.LA(4);
						if ( (LA31_12==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_12==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case NULL_LITERAL:
						{
						int LA31_13 = input.LA(4);
						if ( (LA31_13==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_13==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 13, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case REGISTER:
						{
						int LA31_14 = input.LA(4);
						if ( (LA31_14==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_14==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case PARAM_LIST_OR_ID:
						{
						int LA31_15 = input.LA(4);
						if ( (LA31_15==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_15==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 15, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case PRIMITIVE_TYPE:
						{
						int LA31_16 = input.LA(4);
						if ( (LA31_16==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_16==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 16, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case VOID_TYPE:
						{
						int LA31_17 = input.LA(4);
						if ( (LA31_17==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_17==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 17, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ANNOTATION_VISIBILITY:
						{
						int LA31_18 = input.LA(4);
						if ( (LA31_18==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_18==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 18, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT10t:
						{
						int LA31_19 = input.LA(4);
						if ( (LA31_19==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_19==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 19, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT10x:
						{
						int LA31_20 = input.LA(4);
						if ( (LA31_20==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_20==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 20, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT10x_ODEX:
						{
						int LA31_21 = input.LA(4);
						if ( (LA31_21==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_21==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 21, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT11x:
						{
						int LA31_22 = input.LA(4);
						if ( (LA31_22==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_22==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 22, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT12x_OR_ID:
						{
						int LA31_23 = input.LA(4);
						if ( (LA31_23==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_23==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 23, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT21c_FIELD:
						{
						int LA31_24 = input.LA(4);
						if ( (LA31_24==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_24==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 24, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT21c_FIELD_ODEX:
						{
						int LA31_25 = input.LA(4);
						if ( (LA31_25==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_25==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 25, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT21c_STRING:
						{
						int LA31_26 = input.LA(4);
						if ( (LA31_26==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_26==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 26, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT21c_TYPE:
						{
						int LA31_27 = input.LA(4);
						if ( (LA31_27==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_27==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 27, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT21t:
						{
						int LA31_28 = input.LA(4);
						if ( (LA31_28==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_28==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 28, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22c_FIELD:
						{
						int LA31_29 = input.LA(4);
						if ( (LA31_29==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_29==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 29, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22c_FIELD_ODEX:
						{
						int LA31_30 = input.LA(4);
						if ( (LA31_30==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_30==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 30, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22c_TYPE:
						{
						int LA31_31 = input.LA(4);
						if ( (LA31_31==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_31==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 31, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22cs_FIELD:
						{
						int LA31_32 = input.LA(4);
						if ( (LA31_32==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_32==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 32, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22s_OR_ID:
						{
						int LA31_33 = input.LA(4);
						if ( (LA31_33==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_33==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 33, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22t:
						{
						int LA31_34 = input.LA(4);
						if ( (LA31_34==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_34==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 34, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT23x:
						{
						int LA31_35 = input.LA(4);
						if ( (LA31_35==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_35==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 35, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT31i_OR_ID:
						{
						int LA31_36 = input.LA(4);
						if ( (LA31_36==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_36==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 36, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT31t:
						{
						int LA31_37 = input.LA(4);
						if ( (LA31_37==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_37==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 37, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT35c_METHOD:
						{
						int LA31_38 = input.LA(4);
						if ( (LA31_38==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_38==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 38, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT35c_METHOD_ODEX:
						{
						int LA31_39 = input.LA(4);
						if ( (LA31_39==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_39==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 39, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT35c_TYPE:
						{
						int LA31_40 = input.LA(4);
						if ( (LA31_40==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_40==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 40, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT35mi_METHOD:
						{
						int LA31_41 = input.LA(4);
						if ( (LA31_41==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_41==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 41, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT35ms_METHOD:
						{
						int LA31_42 = input.LA(4);
						if ( (LA31_42==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_42==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 42, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT51l:
						{
						int LA31_43 = input.LA(4);
						if ( (LA31_43==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_43==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 43, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case MEMBER_NAME:
						{
						int LA31_44 = input.LA(4);
						if ( (LA31_44==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_44==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 44, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA31_0==ARRAY_DESCRIPTOR) ) {
				int LA31_2 = input.LA(2);
				if ( (LA31_2==ARROW) ) {
					switch ( input.LA(3) ) {
					case SIMPLE_NAME:
						{
						int LA31_5 = input.LA(4);
						if ( (LA31_5==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_5==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ACCESS_SPEC:
						{
						int LA31_6 = input.LA(4);
						if ( (LA31_6==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_6==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case VERIFICATION_ERROR_TYPE:
						{
						int LA31_7 = input.LA(4);
						if ( (LA31_7==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_7==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case POSITIVE_INTEGER_LITERAL:
						{
						int LA31_8 = input.LA(4);
						if ( (LA31_8==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_8==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case NEGATIVE_INTEGER_LITERAL:
						{
						int LA31_9 = input.LA(4);
						if ( (LA31_9==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_9==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case FLOAT_LITERAL_OR_ID:
						{
						int LA31_10 = input.LA(4);
						if ( (LA31_10==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_10==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case DOUBLE_LITERAL_OR_ID:
						{
						int LA31_11 = input.LA(4);
						if ( (LA31_11==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_11==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case BOOL_LITERAL:
						{
						int LA31_12 = input.LA(4);
						if ( (LA31_12==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_12==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case NULL_LITERAL:
						{
						int LA31_13 = input.LA(4);
						if ( (LA31_13==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_13==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 13, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case REGISTER:
						{
						int LA31_14 = input.LA(4);
						if ( (LA31_14==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_14==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 14, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case PARAM_LIST_OR_ID:
						{
						int LA31_15 = input.LA(4);
						if ( (LA31_15==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_15==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 15, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case PRIMITIVE_TYPE:
						{
						int LA31_16 = input.LA(4);
						if ( (LA31_16==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_16==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 16, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case VOID_TYPE:
						{
						int LA31_17 = input.LA(4);
						if ( (LA31_17==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_17==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 17, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ANNOTATION_VISIBILITY:
						{
						int LA31_18 = input.LA(4);
						if ( (LA31_18==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_18==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 18, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT10t:
						{
						int LA31_19 = input.LA(4);
						if ( (LA31_19==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_19==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 19, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT10x:
						{
						int LA31_20 = input.LA(4);
						if ( (LA31_20==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_20==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 20, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT10x_ODEX:
						{
						int LA31_21 = input.LA(4);
						if ( (LA31_21==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_21==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 21, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT11x:
						{
						int LA31_22 = input.LA(4);
						if ( (LA31_22==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_22==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 22, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT12x_OR_ID:
						{
						int LA31_23 = input.LA(4);
						if ( (LA31_23==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_23==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 23, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT21c_FIELD:
						{
						int LA31_24 = input.LA(4);
						if ( (LA31_24==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_24==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 24, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT21c_FIELD_ODEX:
						{
						int LA31_25 = input.LA(4);
						if ( (LA31_25==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_25==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 25, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT21c_STRING:
						{
						int LA31_26 = input.LA(4);
						if ( (LA31_26==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_26==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 26, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT21c_TYPE:
						{
						int LA31_27 = input.LA(4);
						if ( (LA31_27==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_27==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 27, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT21t:
						{
						int LA31_28 = input.LA(4);
						if ( (LA31_28==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_28==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 28, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22c_FIELD:
						{
						int LA31_29 = input.LA(4);
						if ( (LA31_29==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_29==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 29, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22c_FIELD_ODEX:
						{
						int LA31_30 = input.LA(4);
						if ( (LA31_30==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_30==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 30, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22c_TYPE:
						{
						int LA31_31 = input.LA(4);
						if ( (LA31_31==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_31==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 31, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22cs_FIELD:
						{
						int LA31_32 = input.LA(4);
						if ( (LA31_32==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_32==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 32, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22s_OR_ID:
						{
						int LA31_33 = input.LA(4);
						if ( (LA31_33==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_33==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 33, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT22t:
						{
						int LA31_34 = input.LA(4);
						if ( (LA31_34==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_34==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 34, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT23x:
						{
						int LA31_35 = input.LA(4);
						if ( (LA31_35==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_35==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 35, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT31i_OR_ID:
						{
						int LA31_36 = input.LA(4);
						if ( (LA31_36==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_36==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 36, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT31t:
						{
						int LA31_37 = input.LA(4);
						if ( (LA31_37==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_37==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 37, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT35c_METHOD:
						{
						int LA31_38 = input.LA(4);
						if ( (LA31_38==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_38==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 38, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT35c_METHOD_ODEX:
						{
						int LA31_39 = input.LA(4);
						if ( (LA31_39==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_39==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 39, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT35c_TYPE:
						{
						int LA31_40 = input.LA(4);
						if ( (LA31_40==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_40==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 40, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT35mi_METHOD:
						{
						int LA31_41 = input.LA(4);
						if ( (LA31_41==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_41==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 41, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT35ms_METHOD:
						{
						int LA31_42 = input.LA(4);
						if ( (LA31_42==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_42==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 42, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case INSTRUCTION_FORMAT51l:
						{
						int LA31_43 = input.LA(4);
						if ( (LA31_43==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_43==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 43, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case MEMBER_NAME:
						{
						int LA31_44 = input.LA(4);
						if ( (LA31_44==COLON) ) {
							alt31=2;
						}
						else if ( (LA31_44==OPEN_PAREN) ) {
							alt31=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 44, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:732:5: CLASS_DESCRIPTOR
					{
					root_0 = (CommonTree)adaptor.nil();


					CLASS_DESCRIPTOR184=(Token)match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference3174); 
					CLASS_DESCRIPTOR184_tree = (CommonTree)adaptor.create(CLASS_DESCRIPTOR184);
					adaptor.addChild(root_0, CLASS_DESCRIPTOR184_tree);

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:732:24: fully_qualified_field
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_fully_qualified_field_in_verification_error_reference3178);
					fully_qualified_field185=fully_qualified_field();
					state._fsp--;

					adaptor.addChild(root_0, fully_qualified_field185.getTree());

					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:732:48: fully_qualified_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_fully_qualified_method_in_verification_error_reference3182);
					fully_qualified_method186=fully_qualified_method();
					state._fsp--;

					adaptor.addChild(root_0, fully_qualified_method186.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "verification_error_reference"


	public static class catch_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "catch_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:734:1: catch_directive : CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref -> ^( I_CATCH[$start, \"I_CATCH\"] nonvoid_type_descriptor $from $to $using) ;
	public final smaliParser.catch_directive_return catch_directive() throws RecognitionException {
		smaliParser.catch_directive_return retval = new smaliParser.catch_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CATCH_DIRECTIVE187=null;
		Token OPEN_BRACE189=null;
		Token DOTDOT190=null;
		Token CLOSE_BRACE191=null;
		ParserRuleReturnScope from =null;
		ParserRuleReturnScope to =null;
		ParserRuleReturnScope using =null;
		ParserRuleReturnScope nonvoid_type_descriptor188 =null;

		CommonTree CATCH_DIRECTIVE187_tree=null;
		CommonTree OPEN_BRACE189_tree=null;
		CommonTree DOTDOT190_tree=null;
		CommonTree CLOSE_BRACE191_tree=null;
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
		RewriteRuleTokenStream stream_CATCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token CATCH_DIRECTIVE");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:735:3: ( CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref -> ^( I_CATCH[$start, \"I_CATCH\"] nonvoid_type_descriptor $from $to $using) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:735:5: CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref
			{
			CATCH_DIRECTIVE187=(Token)match(input,CATCH_DIRECTIVE,FOLLOW_CATCH_DIRECTIVE_in_catch_directive3192);  
			stream_CATCH_DIRECTIVE.add(CATCH_DIRECTIVE187);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_catch_directive3194);
			nonvoid_type_descriptor188=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor188.getTree());
			OPEN_BRACE189=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catch_directive3196);  
			stream_OPEN_BRACE.add(OPEN_BRACE189);

			pushFollow(FOLLOW_label_ref_in_catch_directive3200);
			from=label_ref();
			state._fsp--;

			stream_label_ref.add(from.getTree());
			DOTDOT190=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_catch_directive3202);  
			stream_DOTDOT.add(DOTDOT190);

			pushFollow(FOLLOW_label_ref_in_catch_directive3206);
			to=label_ref();
			state._fsp--;

			stream_label_ref.add(to.getTree());
			CLOSE_BRACE191=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catch_directive3208);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE191);

			pushFollow(FOLLOW_label_ref_in_catch_directive3212);
			using=label_ref();
			state._fsp--;

			stream_label_ref.add(using.getTree());
			// AST REWRITE
			// elements: from, to, nonvoid_type_descriptor, using
			// token labels: 
			// rule labels: using, from, to, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_using=new RewriteRuleSubtreeStream(adaptor,"rule using",using!=null?using.getTree():null);
			RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.getTree():null);
			RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 736:5: -> ^( I_CATCH[$start, \"I_CATCH\"] nonvoid_type_descriptor $from $to $using)
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:736:8: ^( I_CATCH[$start, \"I_CATCH\"] nonvoid_type_descriptor $from $to $using)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CATCH, (retval.start), "I_CATCH"), root_1);
				adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				adaptor.addChild(root_1, stream_from.nextTree());
				adaptor.addChild(root_1, stream_to.nextTree());
				adaptor.addChild(root_1, stream_using.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catch_directive"


	public static class catchall_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "catchall_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:738:1: catchall_directive : CATCHALL_DIRECTIVE OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref -> ^( I_CATCHALL[$start, \"I_CATCHALL\"] $from $to $using) ;
	public final smaliParser.catchall_directive_return catchall_directive() throws RecognitionException {
		smaliParser.catchall_directive_return retval = new smaliParser.catchall_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token CATCHALL_DIRECTIVE192=null;
		Token OPEN_BRACE193=null;
		Token DOTDOT194=null;
		Token CLOSE_BRACE195=null;
		ParserRuleReturnScope from =null;
		ParserRuleReturnScope to =null;
		ParserRuleReturnScope using =null;

		CommonTree CATCHALL_DIRECTIVE192_tree=null;
		CommonTree OPEN_BRACE193_tree=null;
		CommonTree DOTDOT194_tree=null;
		CommonTree CLOSE_BRACE195_tree=null;
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
		RewriteRuleTokenStream stream_CATCHALL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token CATCHALL_DIRECTIVE");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:739:3: ( CATCHALL_DIRECTIVE OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref -> ^( I_CATCHALL[$start, \"I_CATCHALL\"] $from $to $using) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:739:5: CATCHALL_DIRECTIVE OPEN_BRACE from= label_ref DOTDOT to= label_ref CLOSE_BRACE using= label_ref
			{
			CATCHALL_DIRECTIVE192=(Token)match(input,CATCHALL_DIRECTIVE,FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive3244);  
			stream_CATCHALL_DIRECTIVE.add(CATCHALL_DIRECTIVE192);

			OPEN_BRACE193=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catchall_directive3246);  
			stream_OPEN_BRACE.add(OPEN_BRACE193);

			pushFollow(FOLLOW_label_ref_in_catchall_directive3250);
			from=label_ref();
			state._fsp--;

			stream_label_ref.add(from.getTree());
			DOTDOT194=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_catchall_directive3252);  
			stream_DOTDOT.add(DOTDOT194);

			pushFollow(FOLLOW_label_ref_in_catchall_directive3256);
			to=label_ref();
			state._fsp--;

			stream_label_ref.add(to.getTree());
			CLOSE_BRACE195=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catchall_directive3258);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE195);

			pushFollow(FOLLOW_label_ref_in_catchall_directive3262);
			using=label_ref();
			state._fsp--;

			stream_label_ref.add(using.getTree());
			// AST REWRITE
			// elements: to, from, using
			// token labels: 
			// rule labels: using, from, to, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_using=new RewriteRuleSubtreeStream(adaptor,"rule using",using!=null?using.getTree():null);
			RewriteRuleSubtreeStream stream_from=new RewriteRuleSubtreeStream(adaptor,"rule from",from!=null?from.getTree():null);
			RewriteRuleSubtreeStream stream_to=new RewriteRuleSubtreeStream(adaptor,"rule to",to!=null?to.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 740:5: -> ^( I_CATCHALL[$start, \"I_CATCHALL\"] $from $to $using)
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:740:8: ^( I_CATCHALL[$start, \"I_CATCHALL\"] $from $to $using)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_CATCHALL, (retval.start), "I_CATCHALL"), root_1);
				adaptor.addChild(root_1, stream_from.nextTree());
				adaptor.addChild(root_1, stream_to.nextTree());
				adaptor.addChild(root_1, stream_using.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catchall_directive"


	public static class parameter_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameter_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:746:1: parameter_directive : PARAMETER_DIRECTIVE REGISTER ( COMMA STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) ) ;
	public final smaliParser.parameter_directive_return parameter_directive() throws RecognitionException {
		smaliParser.parameter_directive_return retval = new smaliParser.parameter_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PARAMETER_DIRECTIVE196=null;
		Token REGISTER197=null;
		Token COMMA198=null;
		Token STRING_LITERAL199=null;
		Token END_PARAMETER_DIRECTIVE201=null;
		ParserRuleReturnScope annotation200 =null;

		CommonTree PARAMETER_DIRECTIVE196_tree=null;
		CommonTree REGISTER197_tree=null;
		CommonTree COMMA198_tree=null;
		CommonTree STRING_LITERAL199_tree=null;
		CommonTree END_PARAMETER_DIRECTIVE201_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_PARAMETER_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token PARAMETER_DIRECTIVE");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_END_PARAMETER_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_PARAMETER_DIRECTIVE");
		RewriteRuleSubtreeStream stream_annotation=new RewriteRuleSubtreeStream(adaptor,"rule annotation");

		List<CommonTree> annotations = new ArrayList<CommonTree>();
		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:748:3: ( PARAMETER_DIRECTIVE REGISTER ( COMMA STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:748:5: PARAMETER_DIRECTIVE REGISTER ( COMMA STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) )
			{
			PARAMETER_DIRECTIVE196=(Token)match(input,PARAMETER_DIRECTIVE,FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive3301);  
			stream_PARAMETER_DIRECTIVE.add(PARAMETER_DIRECTIVE196);

			REGISTER197=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_parameter_directive3303);  
			stream_REGISTER.add(REGISTER197);

			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:748:34: ( COMMA STRING_LITERAL )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==COMMA) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:748:35: COMMA STRING_LITERAL
					{
					COMMA198=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameter_directive3306);  
					stream_COMMA.add(COMMA198);

					STRING_LITERAL199=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parameter_directive3308);  
					stream_STRING_LITERAL.add(STRING_LITERAL199);

					}
					break;

			}

			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:749:5: ({...}? annotation )*
			loop33:
			while (true) {
				int alt33=2;
				alt33 = dfa33.predict(input);
				switch (alt33) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:749:6: {...}? annotation
					{
					if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
						throw new FailedPredicateException(input, "parameter_directive", "input.LA(1) == ANNOTATION_DIRECTIVE");
					}
					pushFollow(FOLLOW_annotation_in_parameter_directive3319);
					annotation200=annotation();
					state._fsp--;

					stream_annotation.add(annotation200.getTree());
					annotations.add((annotation200!=null?((CommonTree)annotation200.getTree()):null));
					}
					break;

				default :
					break loop33;
				}
			}

			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:751:5: ( END_PARAMETER_DIRECTIVE -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) ) | -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) ) )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==END_PARAMETER_DIRECTIVE) ) {
				alt34=1;
			}
			else if ( (LA34_0==ANNOTATION_DIRECTIVE||LA34_0==ARRAY_DATA_DIRECTIVE||(LA34_0 >= CATCHALL_DIRECTIVE && LA34_0 <= CATCH_DIRECTIVE)||LA34_0==COLON||(LA34_0 >= END_LOCAL_DIRECTIVE && LA34_0 <= END_METHOD_DIRECTIVE)||LA34_0==EPILOGUE_DIRECTIVE||(LA34_0 >= INSTRUCTION_FORMAT10t && LA34_0 <= INSTRUCTION_FORMAT51l)||(LA34_0 >= LINE_DIRECTIVE && LA34_0 <= LOCAL_DIRECTIVE)||(LA34_0 >= PACKED_SWITCH_DIRECTIVE && LA34_0 <= PARAMETER_DIRECTIVE)||LA34_0==PROLOGUE_DIRECTIVE||(LA34_0 >= REGISTERS_DIRECTIVE && LA34_0 <= RESTART_LOCAL_DIRECTIVE)||(LA34_0 >= SOURCE_DIRECTIVE && LA34_0 <= SPARSE_SWITCH_DIRECTIVE)) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:751:7: END_PARAMETER_DIRECTIVE
					{
					END_PARAMETER_DIRECTIVE201=(Token)match(input,END_PARAMETER_DIRECTIVE,FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive3332);  
					stream_END_PARAMETER_DIRECTIVE.add(END_PARAMETER_DIRECTIVE201);

					// AST REWRITE
					// elements: STRING_LITERAL, annotation, REGISTER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 752:7: -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) )
					{
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:752:10: ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ( annotation )* ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PARAMETER, (retval.start), "I_PARAMETER"), root_1);
						adaptor.addChild(root_1, stream_REGISTER.nextNode());
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:752:56: ( STRING_LITERAL )?
						if ( stream_STRING_LITERAL.hasNext() ) {
							adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
						}
						stream_STRING_LITERAL.reset();

						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:752:72: ^( I_ANNOTATIONS ( annotation )* )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:752:88: ( annotation )*
						while ( stream_annotation.hasNext() ) {
							adaptor.addChild(root_2, stream_annotation.nextTree());
						}
						stream_annotation.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:753:19: 
					{
					statements_and_directives_stack.peek().methodAnnotations.addAll(annotations);
					// AST REWRITE
					// elements: STRING_LITERAL, REGISTER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 754:7: -> ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) )
					{
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:754:10: ^( I_PARAMETER[$start, \"I_PARAMETER\"] REGISTER ( STRING_LITERAL )? ^( I_ANNOTATIONS ) )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PARAMETER, (retval.start), "I_PARAMETER"), root_1);
						adaptor.addChild(root_1, stream_REGISTER.nextNode());
						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:754:56: ( STRING_LITERAL )?
						if ( stream_STRING_LITERAL.hasNext() ) {
							adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
						}
						stream_STRING_LITERAL.reset();

						// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:754:72: ^( I_ANNOTATIONS )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ANNOTATIONS, "I_ANNOTATIONS"), root_2);
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_directive"


	public static class debug_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "debug_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:757:1: debug_directive : ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive );
	public final smaliParser.debug_directive_return debug_directive() throws RecognitionException {
		smaliParser.debug_directive_return retval = new smaliParser.debug_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope line_directive202 =null;
		ParserRuleReturnScope local_directive203 =null;
		ParserRuleReturnScope end_local_directive204 =null;
		ParserRuleReturnScope restart_local_directive205 =null;
		ParserRuleReturnScope prologue_directive206 =null;
		ParserRuleReturnScope epilogue_directive207 =null;
		ParserRuleReturnScope source_directive208 =null;


		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:758:3: ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive )
			int alt35=7;
			switch ( input.LA(1) ) {
			case LINE_DIRECTIVE:
				{
				alt35=1;
				}
				break;
			case LOCAL_DIRECTIVE:
				{
				alt35=2;
				}
				break;
			case END_LOCAL_DIRECTIVE:
				{
				alt35=3;
				}
				break;
			case RESTART_LOCAL_DIRECTIVE:
				{
				alt35=4;
				}
				break;
			case PROLOGUE_DIRECTIVE:
				{
				alt35=5;
				}
				break;
			case EPILOGUE_DIRECTIVE:
				{
				alt35=6;
				}
				break;
			case SOURCE_DIRECTIVE:
				{
				alt35=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:758:5: line_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_line_directive_in_debug_directive3405);
					line_directive202=line_directive();
					state._fsp--;

					adaptor.addChild(root_0, line_directive202.getTree());

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:759:5: local_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_local_directive_in_debug_directive3411);
					local_directive203=local_directive();
					state._fsp--;

					adaptor.addChild(root_0, local_directive203.getTree());

					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:760:5: end_local_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_end_local_directive_in_debug_directive3417);
					end_local_directive204=end_local_directive();
					state._fsp--;

					adaptor.addChild(root_0, end_local_directive204.getTree());

					}
					break;
				case 4 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:761:5: restart_local_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_restart_local_directive_in_debug_directive3423);
					restart_local_directive205=restart_local_directive();
					state._fsp--;

					adaptor.addChild(root_0, restart_local_directive205.getTree());

					}
					break;
				case 5 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:762:5: prologue_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_prologue_directive_in_debug_directive3429);
					prologue_directive206=prologue_directive();
					state._fsp--;

					adaptor.addChild(root_0, prologue_directive206.getTree());

					}
					break;
				case 6 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:763:5: epilogue_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_epilogue_directive_in_debug_directive3435);
					epilogue_directive207=epilogue_directive();
					state._fsp--;

					adaptor.addChild(root_0, epilogue_directive207.getTree());

					}
					break;
				case 7 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:764:5: source_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_source_directive_in_debug_directive3441);
					source_directive208=source_directive();
					state._fsp--;

					adaptor.addChild(root_0, source_directive208.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "debug_directive"


	public static class line_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "line_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:766:1: line_directive : LINE_DIRECTIVE integral_literal -> ^( I_LINE[$start, \"I_LINE\"] integral_literal ) ;
	public final smaliParser.line_directive_return line_directive() throws RecognitionException {
		smaliParser.line_directive_return retval = new smaliParser.line_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LINE_DIRECTIVE209=null;
		ParserRuleReturnScope integral_literal210 =null;

		CommonTree LINE_DIRECTIVE209_tree=null;
		RewriteRuleTokenStream stream_LINE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token LINE_DIRECTIVE");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:767:3: ( LINE_DIRECTIVE integral_literal -> ^( I_LINE[$start, \"I_LINE\"] integral_literal ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:767:5: LINE_DIRECTIVE integral_literal
			{
			LINE_DIRECTIVE209=(Token)match(input,LINE_DIRECTIVE,FOLLOW_LINE_DIRECTIVE_in_line_directive3451);  
			stream_LINE_DIRECTIVE.add(LINE_DIRECTIVE209);

			pushFollow(FOLLOW_integral_literal_in_line_directive3453);
			integral_literal210=integral_literal();
			state._fsp--;

			stream_integral_literal.add(integral_literal210.getTree());
			// AST REWRITE
			// elements: integral_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 768:5: -> ^( I_LINE[$start, \"I_LINE\"] integral_literal )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:768:8: ^( I_LINE[$start, \"I_LINE\"] integral_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LINE, (retval.start), "I_LINE"), root_1);
				adaptor.addChild(root_1, stream_integral_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "line_directive"


	public static class local_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "local_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:770:1: local_directive : LOCAL_DIRECTIVE REGISTER ( COMMA ( NULL_LITERAL |name= STRING_LITERAL ) COLON ( VOID_TYPE | nonvoid_type_descriptor ) ( COMMA signature= STRING_LITERAL )? )? -> ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER ( NULL_LITERAL )? ( $name)? ( nonvoid_type_descriptor )? ( $signature)? ) ;
	public final smaliParser.local_directive_return local_directive() throws RecognitionException {
		smaliParser.local_directive_return retval = new smaliParser.local_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token name=null;
		Token signature=null;
		Token LOCAL_DIRECTIVE211=null;
		Token REGISTER212=null;
		Token COMMA213=null;
		Token NULL_LITERAL214=null;
		Token COLON215=null;
		Token VOID_TYPE216=null;
		Token COMMA218=null;
		ParserRuleReturnScope nonvoid_type_descriptor217 =null;

		CommonTree name_tree=null;
		CommonTree signature_tree=null;
		CommonTree LOCAL_DIRECTIVE211_tree=null;
		CommonTree REGISTER212_tree=null;
		CommonTree COMMA213_tree=null;
		CommonTree NULL_LITERAL214_tree=null;
		CommonTree COLON215_tree=null;
		CommonTree VOID_TYPE216_tree=null;
		CommonTree COMMA218_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_LOCAL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token LOCAL_DIRECTIVE");
		RewriteRuleTokenStream stream_VOID_TYPE=new RewriteRuleTokenStream(adaptor,"token VOID_TYPE");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_NULL_LITERAL=new RewriteRuleTokenStream(adaptor,"token NULL_LITERAL");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:771:3: ( LOCAL_DIRECTIVE REGISTER ( COMMA ( NULL_LITERAL |name= STRING_LITERAL ) COLON ( VOID_TYPE | nonvoid_type_descriptor ) ( COMMA signature= STRING_LITERAL )? )? -> ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER ( NULL_LITERAL )? ( $name)? ( nonvoid_type_descriptor )? ( $signature)? ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:771:5: LOCAL_DIRECTIVE REGISTER ( COMMA ( NULL_LITERAL |name= STRING_LITERAL ) COLON ( VOID_TYPE | nonvoid_type_descriptor ) ( COMMA signature= STRING_LITERAL )? )?
			{
			LOCAL_DIRECTIVE211=(Token)match(input,LOCAL_DIRECTIVE,FOLLOW_LOCAL_DIRECTIVE_in_local_directive3476);  
			stream_LOCAL_DIRECTIVE.add(LOCAL_DIRECTIVE211);

			REGISTER212=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_local_directive3478);  
			stream_REGISTER.add(REGISTER212);

			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:771:30: ( COMMA ( NULL_LITERAL |name= STRING_LITERAL ) COLON ( VOID_TYPE | nonvoid_type_descriptor ) ( COMMA signature= STRING_LITERAL )? )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==COMMA) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:771:31: COMMA ( NULL_LITERAL |name= STRING_LITERAL ) COLON ( VOID_TYPE | nonvoid_type_descriptor ) ( COMMA signature= STRING_LITERAL )?
					{
					COMMA213=(Token)match(input,COMMA,FOLLOW_COMMA_in_local_directive3481);  
					stream_COMMA.add(COMMA213);

					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:771:37: ( NULL_LITERAL |name= STRING_LITERAL )
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==NULL_LITERAL) ) {
						alt36=1;
					}
					else if ( (LA36_0==STRING_LITERAL) ) {
						alt36=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						throw nvae;
					}

					switch (alt36) {
						case 1 :
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:771:38: NULL_LITERAL
							{
							NULL_LITERAL214=(Token)match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_local_directive3484);  
							stream_NULL_LITERAL.add(NULL_LITERAL214);

							}
							break;
						case 2 :
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:771:53: name= STRING_LITERAL
							{
							name=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_local_directive3490);  
							stream_STRING_LITERAL.add(name);

							}
							break;

					}

					COLON215=(Token)match(input,COLON,FOLLOW_COLON_in_local_directive3493);  
					stream_COLON.add(COLON215);

					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:771:80: ( VOID_TYPE | nonvoid_type_descriptor )
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==VOID_TYPE) ) {
						alt37=1;
					}
					else if ( (LA37_0==ARRAY_DESCRIPTOR||LA37_0==CLASS_DESCRIPTOR||LA37_0==PRIMITIVE_TYPE) ) {
						alt37=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 37, 0, input);
						throw nvae;
					}

					switch (alt37) {
						case 1 :
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:771:81: VOID_TYPE
							{
							VOID_TYPE216=(Token)match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_local_directive3496);  
							stream_VOID_TYPE.add(VOID_TYPE216);

							}
							break;
						case 2 :
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:771:93: nonvoid_type_descriptor
							{
							pushFollow(FOLLOW_nonvoid_type_descriptor_in_local_directive3500);
							nonvoid_type_descriptor217=nonvoid_type_descriptor();
							state._fsp--;

							stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor217.getTree());
							}
							break;

					}

					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:772:31: ( COMMA signature= STRING_LITERAL )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==COMMA) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:772:32: COMMA signature= STRING_LITERAL
							{
							COMMA218=(Token)match(input,COMMA,FOLLOW_COMMA_in_local_directive3534);  
							stream_COMMA.add(COMMA218);

							signature=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_local_directive3538);  
							stream_STRING_LITERAL.add(signature);

							}
							break;

					}

					}
					break;

			}

			// AST REWRITE
			// elements: REGISTER, NULL_LITERAL, nonvoid_type_descriptor, signature, name
			// token labels: signature, name
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_signature=new RewriteRuleTokenStream(adaptor,"token signature",signature);
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 773:5: -> ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER ( NULL_LITERAL )? ( $name)? ( nonvoid_type_descriptor )? ( $signature)? )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:773:8: ^( I_LOCAL[$start, \"I_LOCAL\"] REGISTER ( NULL_LITERAL )? ( $name)? ( nonvoid_type_descriptor )? ( $signature)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_LOCAL, (retval.start), "I_LOCAL"), root_1);
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:773:46: ( NULL_LITERAL )?
				if ( stream_NULL_LITERAL.hasNext() ) {
					adaptor.addChild(root_1, stream_NULL_LITERAL.nextNode());
				}
				stream_NULL_LITERAL.reset();

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:773:61: ( $name)?
				if ( stream_name.hasNext() ) {
					adaptor.addChild(root_1, stream_name.nextNode());
				}
				stream_name.reset();

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:773:67: ( nonvoid_type_descriptor )?
				if ( stream_nonvoid_type_descriptor.hasNext() ) {
					adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				}
				stream_nonvoid_type_descriptor.reset();

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:773:93: ( $signature)?
				if ( stream_signature.hasNext() ) {
					adaptor.addChild(root_1, stream_signature.nextNode());
				}
				stream_signature.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "local_directive"


	public static class end_local_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "end_local_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:775:1: end_local_directive : END_LOCAL_DIRECTIVE REGISTER -> ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER ) ;
	public final smaliParser.end_local_directive_return end_local_directive() throws RecognitionException {
		smaliParser.end_local_directive_return retval = new smaliParser.end_local_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token END_LOCAL_DIRECTIVE219=null;
		Token REGISTER220=null;

		CommonTree END_LOCAL_DIRECTIVE219_tree=null;
		CommonTree REGISTER220_tree=null;
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_END_LOCAL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_LOCAL_DIRECTIVE");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:776:3: ( END_LOCAL_DIRECTIVE REGISTER -> ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:776:5: END_LOCAL_DIRECTIVE REGISTER
			{
			END_LOCAL_DIRECTIVE219=(Token)match(input,END_LOCAL_DIRECTIVE,FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive3580);  
			stream_END_LOCAL_DIRECTIVE.add(END_LOCAL_DIRECTIVE219);

			REGISTER220=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_end_local_directive3582);  
			stream_REGISTER.add(REGISTER220);

			// AST REWRITE
			// elements: REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 777:5: -> ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:777:8: ^( I_END_LOCAL[$start, \"I_END_LOCAL\"] REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_END_LOCAL, (retval.start), "I_END_LOCAL"), root_1);
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "end_local_directive"


	public static class restart_local_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "restart_local_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:779:1: restart_local_directive : RESTART_LOCAL_DIRECTIVE REGISTER -> ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER ) ;
	public final smaliParser.restart_local_directive_return restart_local_directive() throws RecognitionException {
		smaliParser.restart_local_directive_return retval = new smaliParser.restart_local_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token RESTART_LOCAL_DIRECTIVE221=null;
		Token REGISTER222=null;

		CommonTree RESTART_LOCAL_DIRECTIVE221_tree=null;
		CommonTree REGISTER222_tree=null;
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_RESTART_LOCAL_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token RESTART_LOCAL_DIRECTIVE");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:780:3: ( RESTART_LOCAL_DIRECTIVE REGISTER -> ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:780:5: RESTART_LOCAL_DIRECTIVE REGISTER
			{
			RESTART_LOCAL_DIRECTIVE221=(Token)match(input,RESTART_LOCAL_DIRECTIVE,FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive3605);  
			stream_RESTART_LOCAL_DIRECTIVE.add(RESTART_LOCAL_DIRECTIVE221);

			REGISTER222=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_restart_local_directive3607);  
			stream_REGISTER.add(REGISTER222);

			// AST REWRITE
			// elements: REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 781:5: -> ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:781:8: ^( I_RESTART_LOCAL[$start, \"I_RESTART_LOCAL\"] REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_RESTART_LOCAL, (retval.start), "I_RESTART_LOCAL"), root_1);
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "restart_local_directive"


	public static class prologue_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prologue_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:783:1: prologue_directive : PROLOGUE_DIRECTIVE -> ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] ) ;
	public final smaliParser.prologue_directive_return prologue_directive() throws RecognitionException {
		smaliParser.prologue_directive_return retval = new smaliParser.prologue_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PROLOGUE_DIRECTIVE223=null;

		CommonTree PROLOGUE_DIRECTIVE223_tree=null;
		RewriteRuleTokenStream stream_PROLOGUE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token PROLOGUE_DIRECTIVE");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:784:3: ( PROLOGUE_DIRECTIVE -> ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:784:5: PROLOGUE_DIRECTIVE
			{
			PROLOGUE_DIRECTIVE223=(Token)match(input,PROLOGUE_DIRECTIVE,FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive3630);  
			stream_PROLOGUE_DIRECTIVE.add(PROLOGUE_DIRECTIVE223);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 785:5: -> ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:785:8: ^( I_PROLOGUE[$start, \"I_PROLOGUE\"] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PROLOGUE, (retval.start), "I_PROLOGUE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prologue_directive"


	public static class epilogue_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "epilogue_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:787:1: epilogue_directive : EPILOGUE_DIRECTIVE -> ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] ) ;
	public final smaliParser.epilogue_directive_return epilogue_directive() throws RecognitionException {
		smaliParser.epilogue_directive_return retval = new smaliParser.epilogue_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EPILOGUE_DIRECTIVE224=null;

		CommonTree EPILOGUE_DIRECTIVE224_tree=null;
		RewriteRuleTokenStream stream_EPILOGUE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token EPILOGUE_DIRECTIVE");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:788:3: ( EPILOGUE_DIRECTIVE -> ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:788:5: EPILOGUE_DIRECTIVE
			{
			EPILOGUE_DIRECTIVE224=(Token)match(input,EPILOGUE_DIRECTIVE,FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive3651);  
			stream_EPILOGUE_DIRECTIVE.add(EPILOGUE_DIRECTIVE224);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 789:5: -> ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:789:8: ^( I_EPILOGUE[$start, \"I_EPILOGUE\"] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_EPILOGUE, (retval.start), "I_EPILOGUE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "epilogue_directive"


	public static class source_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "source_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:791:1: source_directive : SOURCE_DIRECTIVE ( STRING_LITERAL )? -> ^( I_SOURCE[$start, \"I_SOURCE\"] ( STRING_LITERAL )? ) ;
	public final smaliParser.source_directive_return source_directive() throws RecognitionException {
		smaliParser.source_directive_return retval = new smaliParser.source_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SOURCE_DIRECTIVE225=null;
		Token STRING_LITERAL226=null;

		CommonTree SOURCE_DIRECTIVE225_tree=null;
		CommonTree STRING_LITERAL226_tree=null;
		RewriteRuleTokenStream stream_SOURCE_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SOURCE_DIRECTIVE");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:792:3: ( SOURCE_DIRECTIVE ( STRING_LITERAL )? -> ^( I_SOURCE[$start, \"I_SOURCE\"] ( STRING_LITERAL )? ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:792:5: SOURCE_DIRECTIVE ( STRING_LITERAL )?
			{
			SOURCE_DIRECTIVE225=(Token)match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_directive3672);  
			stream_SOURCE_DIRECTIVE.add(SOURCE_DIRECTIVE225);

			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:792:22: ( STRING_LITERAL )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==STRING_LITERAL) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:792:22: STRING_LITERAL
					{
					STRING_LITERAL226=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_directive3674);  
					stream_STRING_LITERAL.add(STRING_LITERAL226);

					}
					break;

			}

			// AST REWRITE
			// elements: STRING_LITERAL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 793:5: -> ^( I_SOURCE[$start, \"I_SOURCE\"] ( STRING_LITERAL )? )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:793:8: ^( I_SOURCE[$start, \"I_SOURCE\"] ( STRING_LITERAL )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SOURCE, (retval.start), "I_SOURCE"), root_1);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:793:39: ( STRING_LITERAL )?
				if ( stream_STRING_LITERAL.hasNext() ) {
					adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
				}
				stream_STRING_LITERAL.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "source_directive"


	public static class instruction_format12x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruction_format12x"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:795:1: instruction_format12x : ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID -> INSTRUCTION_FORMAT12x[$INSTRUCTION_FORMAT12x_OR_ID] );
	public final smaliParser.instruction_format12x_return instruction_format12x() throws RecognitionException {
		smaliParser.instruction_format12x_return retval = new smaliParser.instruction_format12x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT12x227=null;
		Token INSTRUCTION_FORMAT12x_OR_ID228=null;

		CommonTree INSTRUCTION_FORMAT12x227_tree=null;
		CommonTree INSTRUCTION_FORMAT12x_OR_ID228_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT12x_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT12x_OR_ID");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:796:3: ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID -> INSTRUCTION_FORMAT12x[$INSTRUCTION_FORMAT12x_OR_ID] )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==INSTRUCTION_FORMAT12x) ) {
				alt41=1;
			}
			else if ( (LA41_0==INSTRUCTION_FORMAT12x_OR_ID) ) {
				alt41=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:796:5: INSTRUCTION_FORMAT12x
					{
					root_0 = (CommonTree)adaptor.nil();


					INSTRUCTION_FORMAT12x227=(Token)match(input,INSTRUCTION_FORMAT12x,FOLLOW_INSTRUCTION_FORMAT12x_in_instruction_format12x3699); 
					INSTRUCTION_FORMAT12x227_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT12x227);
					adaptor.addChild(root_0, INSTRUCTION_FORMAT12x227_tree);

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:797:5: INSTRUCTION_FORMAT12x_OR_ID
					{
					INSTRUCTION_FORMAT12x_OR_ID228=(Token)match(input,INSTRUCTION_FORMAT12x_OR_ID,FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_instruction_format12x3705);  
					stream_INSTRUCTION_FORMAT12x_OR_ID.add(INSTRUCTION_FORMAT12x_OR_ID228);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 797:33: -> INSTRUCTION_FORMAT12x[$INSTRUCTION_FORMAT12x_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INSTRUCTION_FORMAT12x, INSTRUCTION_FORMAT12x_OR_ID228));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction_format12x"


	public static class instruction_format22s_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruction_format22s"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:799:1: instruction_format22s : ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID -> INSTRUCTION_FORMAT22s[$INSTRUCTION_FORMAT22s_OR_ID] );
	public final smaliParser.instruction_format22s_return instruction_format22s() throws RecognitionException {
		smaliParser.instruction_format22s_return retval = new smaliParser.instruction_format22s_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22s229=null;
		Token INSTRUCTION_FORMAT22s_OR_ID230=null;

		CommonTree INSTRUCTION_FORMAT22s229_tree=null;
		CommonTree INSTRUCTION_FORMAT22s_OR_ID230_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22s_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22s_OR_ID");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:800:3: ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID -> INSTRUCTION_FORMAT22s[$INSTRUCTION_FORMAT22s_OR_ID] )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==INSTRUCTION_FORMAT22s) ) {
				alt42=1;
			}
			else if ( (LA42_0==INSTRUCTION_FORMAT22s_OR_ID) ) {
				alt42=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:800:5: INSTRUCTION_FORMAT22s
					{
					root_0 = (CommonTree)adaptor.nil();


					INSTRUCTION_FORMAT22s229=(Token)match(input,INSTRUCTION_FORMAT22s,FOLLOW_INSTRUCTION_FORMAT22s_in_instruction_format22s3720); 
					INSTRUCTION_FORMAT22s229_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT22s229);
					adaptor.addChild(root_0, INSTRUCTION_FORMAT22s229_tree);

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:801:5: INSTRUCTION_FORMAT22s_OR_ID
					{
					INSTRUCTION_FORMAT22s_OR_ID230=(Token)match(input,INSTRUCTION_FORMAT22s_OR_ID,FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_instruction_format22s3726);  
					stream_INSTRUCTION_FORMAT22s_OR_ID.add(INSTRUCTION_FORMAT22s_OR_ID230);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 801:33: -> INSTRUCTION_FORMAT22s[$INSTRUCTION_FORMAT22s_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INSTRUCTION_FORMAT22s, INSTRUCTION_FORMAT22s_OR_ID230));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction_format22s"


	public static class instruction_format31i_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruction_format31i"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:803:1: instruction_format31i : ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID -> INSTRUCTION_FORMAT31i[$INSTRUCTION_FORMAT31i_OR_ID] );
	public final smaliParser.instruction_format31i_return instruction_format31i() throws RecognitionException {
		smaliParser.instruction_format31i_return retval = new smaliParser.instruction_format31i_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT31i231=null;
		Token INSTRUCTION_FORMAT31i_OR_ID232=null;

		CommonTree INSTRUCTION_FORMAT31i231_tree=null;
		CommonTree INSTRUCTION_FORMAT31i_OR_ID232_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31i_OR_ID=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31i_OR_ID");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:804:3: ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID -> INSTRUCTION_FORMAT31i[$INSTRUCTION_FORMAT31i_OR_ID] )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==INSTRUCTION_FORMAT31i) ) {
				alt43=1;
			}
			else if ( (LA43_0==INSTRUCTION_FORMAT31i_OR_ID) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:804:5: INSTRUCTION_FORMAT31i
					{
					root_0 = (CommonTree)adaptor.nil();


					INSTRUCTION_FORMAT31i231=(Token)match(input,INSTRUCTION_FORMAT31i,FOLLOW_INSTRUCTION_FORMAT31i_in_instruction_format31i3741); 
					INSTRUCTION_FORMAT31i231_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT31i231);
					adaptor.addChild(root_0, INSTRUCTION_FORMAT31i231_tree);

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:805:5: INSTRUCTION_FORMAT31i_OR_ID
					{
					INSTRUCTION_FORMAT31i_OR_ID232=(Token)match(input,INSTRUCTION_FORMAT31i_OR_ID,FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_instruction_format31i3747);  
					stream_INSTRUCTION_FORMAT31i_OR_ID.add(INSTRUCTION_FORMAT31i_OR_ID232);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 805:33: -> INSTRUCTION_FORMAT31i[$INSTRUCTION_FORMAT31i_OR_ID]
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(INSTRUCTION_FORMAT31i, INSTRUCTION_FORMAT31i_OR_ID232));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction_format31i"


	public static class instruction_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "instruction"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:809:1: instruction : ( insn_format10t | insn_format10x | insn_format10x_odex | insn_format11n | insn_format11x | insn_format12x | insn_format20bc | insn_format20t | insn_format21c_field | insn_format21c_field_odex | insn_format21c_string | insn_format21c_type | insn_format21ih | insn_format21lh | insn_format21s | insn_format21t | insn_format22b | insn_format22c_field | insn_format22c_field_odex | insn_format22c_type | insn_format22cs_field | insn_format22s | insn_format22t | insn_format22x | insn_format23x | insn_format30t | insn_format31c | insn_format31i | insn_format31t | insn_format32x | insn_format35c_method | insn_format35c_type | insn_format35c_method_odex | insn_format35mi_method | insn_format35ms_method | insn_format3rc_method | insn_format3rc_method_odex | insn_format3rc_type | insn_format3rmi_method | insn_format3rms_method | insn_format51l | insn_array_data_directive | insn_packed_switch_directive | insn_sparse_switch_directive );
	public final smaliParser.instruction_return instruction() throws RecognitionException {
		smaliParser.instruction_return retval = new smaliParser.instruction_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope insn_format10t233 =null;
		ParserRuleReturnScope insn_format10x234 =null;
		ParserRuleReturnScope insn_format10x_odex235 =null;
		ParserRuleReturnScope insn_format11n236 =null;
		ParserRuleReturnScope insn_format11x237 =null;
		ParserRuleReturnScope insn_format12x238 =null;
		ParserRuleReturnScope insn_format20bc239 =null;
		ParserRuleReturnScope insn_format20t240 =null;
		ParserRuleReturnScope insn_format21c_field241 =null;
		ParserRuleReturnScope insn_format21c_field_odex242 =null;
		ParserRuleReturnScope insn_format21c_string243 =null;
		ParserRuleReturnScope insn_format21c_type244 =null;
		ParserRuleReturnScope insn_format21ih245 =null;
		ParserRuleReturnScope insn_format21lh246 =null;
		ParserRuleReturnScope insn_format21s247 =null;
		ParserRuleReturnScope insn_format21t248 =null;
		ParserRuleReturnScope insn_format22b249 =null;
		ParserRuleReturnScope insn_format22c_field250 =null;
		ParserRuleReturnScope insn_format22c_field_odex251 =null;
		ParserRuleReturnScope insn_format22c_type252 =null;
		ParserRuleReturnScope insn_format22cs_field253 =null;
		ParserRuleReturnScope insn_format22s254 =null;
		ParserRuleReturnScope insn_format22t255 =null;
		ParserRuleReturnScope insn_format22x256 =null;
		ParserRuleReturnScope insn_format23x257 =null;
		ParserRuleReturnScope insn_format30t258 =null;
		ParserRuleReturnScope insn_format31c259 =null;
		ParserRuleReturnScope insn_format31i260 =null;
		ParserRuleReturnScope insn_format31t261 =null;
		ParserRuleReturnScope insn_format32x262 =null;
		ParserRuleReturnScope insn_format35c_method263 =null;
		ParserRuleReturnScope insn_format35c_type264 =null;
		ParserRuleReturnScope insn_format35c_method_odex265 =null;
		ParserRuleReturnScope insn_format35mi_method266 =null;
		ParserRuleReturnScope insn_format35ms_method267 =null;
		ParserRuleReturnScope insn_format3rc_method268 =null;
		ParserRuleReturnScope insn_format3rc_method_odex269 =null;
		ParserRuleReturnScope insn_format3rc_type270 =null;
		ParserRuleReturnScope insn_format3rmi_method271 =null;
		ParserRuleReturnScope insn_format3rms_method272 =null;
		ParserRuleReturnScope insn_format51l273 =null;
		ParserRuleReturnScope insn_array_data_directive274 =null;
		ParserRuleReturnScope insn_packed_switch_directive275 =null;
		ParserRuleReturnScope insn_sparse_switch_directive276 =null;


		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:810:3: ( insn_format10t | insn_format10x | insn_format10x_odex | insn_format11n | insn_format11x | insn_format12x | insn_format20bc | insn_format20t | insn_format21c_field | insn_format21c_field_odex | insn_format21c_string | insn_format21c_type | insn_format21ih | insn_format21lh | insn_format21s | insn_format21t | insn_format22b | insn_format22c_field | insn_format22c_field_odex | insn_format22c_type | insn_format22cs_field | insn_format22s | insn_format22t | insn_format22x | insn_format23x | insn_format30t | insn_format31c | insn_format31i | insn_format31t | insn_format32x | insn_format35c_method | insn_format35c_type | insn_format35c_method_odex | insn_format35mi_method | insn_format35ms_method | insn_format3rc_method | insn_format3rc_method_odex | insn_format3rc_type | insn_format3rmi_method | insn_format3rms_method | insn_format51l | insn_array_data_directive | insn_packed_switch_directive | insn_sparse_switch_directive )
			int alt44=44;
			switch ( input.LA(1) ) {
			case INSTRUCTION_FORMAT10t:
				{
				alt44=1;
				}
				break;
			case INSTRUCTION_FORMAT10x:
				{
				alt44=2;
				}
				break;
			case INSTRUCTION_FORMAT10x_ODEX:
				{
				alt44=3;
				}
				break;
			case INSTRUCTION_FORMAT11n:
				{
				alt44=4;
				}
				break;
			case INSTRUCTION_FORMAT11x:
				{
				alt44=5;
				}
				break;
			case INSTRUCTION_FORMAT12x:
			case INSTRUCTION_FORMAT12x_OR_ID:
				{
				alt44=6;
				}
				break;
			case INSTRUCTION_FORMAT20bc:
				{
				alt44=7;
				}
				break;
			case INSTRUCTION_FORMAT20t:
				{
				alt44=8;
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD:
				{
				alt44=9;
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
				{
				alt44=10;
				}
				break;
			case INSTRUCTION_FORMAT21c_STRING:
				{
				alt44=11;
				}
				break;
			case INSTRUCTION_FORMAT21c_TYPE:
				{
				alt44=12;
				}
				break;
			case INSTRUCTION_FORMAT21ih:
				{
				alt44=13;
				}
				break;
			case INSTRUCTION_FORMAT21lh:
				{
				alt44=14;
				}
				break;
			case INSTRUCTION_FORMAT21s:
				{
				alt44=15;
				}
				break;
			case INSTRUCTION_FORMAT21t:
				{
				alt44=16;
				}
				break;
			case INSTRUCTION_FORMAT22b:
				{
				alt44=17;
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD:
				{
				alt44=18;
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
				{
				alt44=19;
				}
				break;
			case INSTRUCTION_FORMAT22c_TYPE:
				{
				alt44=20;
				}
				break;
			case INSTRUCTION_FORMAT22cs_FIELD:
				{
				alt44=21;
				}
				break;
			case INSTRUCTION_FORMAT22s:
			case INSTRUCTION_FORMAT22s_OR_ID:
				{
				alt44=22;
				}
				break;
			case INSTRUCTION_FORMAT22t:
				{
				alt44=23;
				}
				break;
			case INSTRUCTION_FORMAT22x:
				{
				alt44=24;
				}
				break;
			case INSTRUCTION_FORMAT23x:
				{
				alt44=25;
				}
				break;
			case INSTRUCTION_FORMAT30t:
				{
				alt44=26;
				}
				break;
			case INSTRUCTION_FORMAT31c:
				{
				alt44=27;
				}
				break;
			case INSTRUCTION_FORMAT31i:
			case INSTRUCTION_FORMAT31i_OR_ID:
				{
				alt44=28;
				}
				break;
			case INSTRUCTION_FORMAT31t:
				{
				alt44=29;
				}
				break;
			case INSTRUCTION_FORMAT32x:
				{
				alt44=30;
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD:
				{
				alt44=31;
				}
				break;
			case INSTRUCTION_FORMAT35c_TYPE:
				{
				alt44=32;
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
				{
				alt44=33;
				}
				break;
			case INSTRUCTION_FORMAT35mi_METHOD:
				{
				alt44=34;
				}
				break;
			case INSTRUCTION_FORMAT35ms_METHOD:
				{
				alt44=35;
				}
				break;
			case INSTRUCTION_FORMAT3rc_METHOD:
				{
				alt44=36;
				}
				break;
			case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
				{
				alt44=37;
				}
				break;
			case INSTRUCTION_FORMAT3rc_TYPE:
				{
				alt44=38;
				}
				break;
			case INSTRUCTION_FORMAT3rmi_METHOD:
				{
				alt44=39;
				}
				break;
			case INSTRUCTION_FORMAT3rms_METHOD:
				{
				alt44=40;
				}
				break;
			case INSTRUCTION_FORMAT51l:
				{
				alt44=41;
				}
				break;
			case ARRAY_DATA_DIRECTIVE:
				{
				alt44=42;
				}
				break;
			case PACKED_SWITCH_DIRECTIVE:
				{
				alt44=43;
				}
				break;
			case SPARSE_SWITCH_DIRECTIVE:
				{
				alt44=44;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:810:5: insn_format10t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format10t_in_instruction3764);
					insn_format10t233=insn_format10t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format10t233.getTree());

					}
					break;
				case 2 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:811:5: insn_format10x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format10x_in_instruction3770);
					insn_format10x234=insn_format10x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format10x234.getTree());

					}
					break;
				case 3 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:812:5: insn_format10x_odex
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format10x_odex_in_instruction3776);
					insn_format10x_odex235=insn_format10x_odex();
					state._fsp--;

					adaptor.addChild(root_0, insn_format10x_odex235.getTree());

					}
					break;
				case 4 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:813:5: insn_format11n
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format11n_in_instruction3782);
					insn_format11n236=insn_format11n();
					state._fsp--;

					adaptor.addChild(root_0, insn_format11n236.getTree());

					}
					break;
				case 5 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:814:5: insn_format11x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format11x_in_instruction3788);
					insn_format11x237=insn_format11x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format11x237.getTree());

					}
					break;
				case 6 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:815:5: insn_format12x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format12x_in_instruction3794);
					insn_format12x238=insn_format12x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format12x238.getTree());

					}
					break;
				case 7 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:816:5: insn_format20bc
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format20bc_in_instruction3800);
					insn_format20bc239=insn_format20bc();
					state._fsp--;

					adaptor.addChild(root_0, insn_format20bc239.getTree());

					}
					break;
				case 8 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:817:5: insn_format20t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format20t_in_instruction3806);
					insn_format20t240=insn_format20t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format20t240.getTree());

					}
					break;
				case 9 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:818:5: insn_format21c_field
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21c_field_in_instruction3812);
					insn_format21c_field241=insn_format21c_field();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21c_field241.getTree());

					}
					break;
				case 10 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:819:5: insn_format21c_field_odex
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21c_field_odex_in_instruction3818);
					insn_format21c_field_odex242=insn_format21c_field_odex();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21c_field_odex242.getTree());

					}
					break;
				case 11 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:820:5: insn_format21c_string
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21c_string_in_instruction3824);
					insn_format21c_string243=insn_format21c_string();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21c_string243.getTree());

					}
					break;
				case 12 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:821:5: insn_format21c_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21c_type_in_instruction3830);
					insn_format21c_type244=insn_format21c_type();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21c_type244.getTree());

					}
					break;
				case 13 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:822:5: insn_format21ih
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21ih_in_instruction3836);
					insn_format21ih245=insn_format21ih();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21ih245.getTree());

					}
					break;
				case 14 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:823:5: insn_format21lh
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21lh_in_instruction3842);
					insn_format21lh246=insn_format21lh();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21lh246.getTree());

					}
					break;
				case 15 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:824:5: insn_format21s
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21s_in_instruction3848);
					insn_format21s247=insn_format21s();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21s247.getTree());

					}
					break;
				case 16 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:825:5: insn_format21t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format21t_in_instruction3854);
					insn_format21t248=insn_format21t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format21t248.getTree());

					}
					break;
				case 17 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:826:5: insn_format22b
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22b_in_instruction3860);
					insn_format22b249=insn_format22b();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22b249.getTree());

					}
					break;
				case 18 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:827:5: insn_format22c_field
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22c_field_in_instruction3866);
					insn_format22c_field250=insn_format22c_field();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22c_field250.getTree());

					}
					break;
				case 19 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:828:5: insn_format22c_field_odex
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22c_field_odex_in_instruction3872);
					insn_format22c_field_odex251=insn_format22c_field_odex();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22c_field_odex251.getTree());

					}
					break;
				case 20 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:829:5: insn_format22c_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22c_type_in_instruction3878);
					insn_format22c_type252=insn_format22c_type();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22c_type252.getTree());

					}
					break;
				case 21 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:830:5: insn_format22cs_field
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22cs_field_in_instruction3884);
					insn_format22cs_field253=insn_format22cs_field();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22cs_field253.getTree());

					}
					break;
				case 22 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:831:5: insn_format22s
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22s_in_instruction3890);
					insn_format22s254=insn_format22s();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22s254.getTree());

					}
					break;
				case 23 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:832:5: insn_format22t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22t_in_instruction3896);
					insn_format22t255=insn_format22t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22t255.getTree());

					}
					break;
				case 24 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:833:5: insn_format22x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format22x_in_instruction3902);
					insn_format22x256=insn_format22x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format22x256.getTree());

					}
					break;
				case 25 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:834:5: insn_format23x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format23x_in_instruction3908);
					insn_format23x257=insn_format23x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format23x257.getTree());

					}
					break;
				case 26 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:835:5: insn_format30t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format30t_in_instruction3914);
					insn_format30t258=insn_format30t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format30t258.getTree());

					}
					break;
				case 27 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:836:5: insn_format31c
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format31c_in_instruction3920);
					insn_format31c259=insn_format31c();
					state._fsp--;

					adaptor.addChild(root_0, insn_format31c259.getTree());

					}
					break;
				case 28 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:837:5: insn_format31i
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format31i_in_instruction3926);
					insn_format31i260=insn_format31i();
					state._fsp--;

					adaptor.addChild(root_0, insn_format31i260.getTree());

					}
					break;
				case 29 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:838:5: insn_format31t
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format31t_in_instruction3932);
					insn_format31t261=insn_format31t();
					state._fsp--;

					adaptor.addChild(root_0, insn_format31t261.getTree());

					}
					break;
				case 30 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:839:5: insn_format32x
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format32x_in_instruction3938);
					insn_format32x262=insn_format32x();
					state._fsp--;

					adaptor.addChild(root_0, insn_format32x262.getTree());

					}
					break;
				case 31 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:840:5: insn_format35c_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format35c_method_in_instruction3944);
					insn_format35c_method263=insn_format35c_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format35c_method263.getTree());

					}
					break;
				case 32 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:841:5: insn_format35c_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format35c_type_in_instruction3950);
					insn_format35c_type264=insn_format35c_type();
					state._fsp--;

					adaptor.addChild(root_0, insn_format35c_type264.getTree());

					}
					break;
				case 33 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:842:5: insn_format35c_method_odex
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format35c_method_odex_in_instruction3956);
					insn_format35c_method_odex265=insn_format35c_method_odex();
					state._fsp--;

					adaptor.addChild(root_0, insn_format35c_method_odex265.getTree());

					}
					break;
				case 34 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:843:5: insn_format35mi_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format35mi_method_in_instruction3962);
					insn_format35mi_method266=insn_format35mi_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format35mi_method266.getTree());

					}
					break;
				case 35 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:844:5: insn_format35ms_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format35ms_method_in_instruction3968);
					insn_format35ms_method267=insn_format35ms_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format35ms_method267.getTree());

					}
					break;
				case 36 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:845:5: insn_format3rc_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format3rc_method_in_instruction3974);
					insn_format3rc_method268=insn_format3rc_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format3rc_method268.getTree());

					}
					break;
				case 37 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:846:5: insn_format3rc_method_odex
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format3rc_method_odex_in_instruction3980);
					insn_format3rc_method_odex269=insn_format3rc_method_odex();
					state._fsp--;

					adaptor.addChild(root_0, insn_format3rc_method_odex269.getTree());

					}
					break;
				case 38 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:847:5: insn_format3rc_type
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format3rc_type_in_instruction3986);
					insn_format3rc_type270=insn_format3rc_type();
					state._fsp--;

					adaptor.addChild(root_0, insn_format3rc_type270.getTree());

					}
					break;
				case 39 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:848:5: insn_format3rmi_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format3rmi_method_in_instruction3992);
					insn_format3rmi_method271=insn_format3rmi_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format3rmi_method271.getTree());

					}
					break;
				case 40 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:849:5: insn_format3rms_method
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format3rms_method_in_instruction3998);
					insn_format3rms_method272=insn_format3rms_method();
					state._fsp--;

					adaptor.addChild(root_0, insn_format3rms_method272.getTree());

					}
					break;
				case 41 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:850:5: insn_format51l
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_format51l_in_instruction4004);
					insn_format51l273=insn_format51l();
					state._fsp--;

					adaptor.addChild(root_0, insn_format51l273.getTree());

					}
					break;
				case 42 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:851:5: insn_array_data_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_array_data_directive_in_instruction4010);
					insn_array_data_directive274=insn_array_data_directive();
					state._fsp--;

					adaptor.addChild(root_0, insn_array_data_directive274.getTree());

					}
					break;
				case 43 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:852:5: insn_packed_switch_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_packed_switch_directive_in_instruction4016);
					insn_packed_switch_directive275=insn_packed_switch_directive();
					state._fsp--;

					adaptor.addChild(root_0, insn_packed_switch_directive275.getTree());

					}
					break;
				case 44 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:853:5: insn_sparse_switch_directive
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_insn_sparse_switch_directive_in_instruction4022);
					insn_sparse_switch_directive276=insn_sparse_switch_directive();
					state._fsp--;

					adaptor.addChild(root_0, insn_sparse_switch_directive276.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction"


	public static class insn_format10t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format10t"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:855:1: insn_format10t : INSTRUCTION_FORMAT10t label_ref -> ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref ) ;
	public final smaliParser.insn_format10t_return insn_format10t() throws RecognitionException {
		smaliParser.insn_format10t_return retval = new smaliParser.insn_format10t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT10t277=null;
		ParserRuleReturnScope label_ref278 =null;

		CommonTree INSTRUCTION_FORMAT10t277_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:856:3: ( INSTRUCTION_FORMAT10t label_ref -> ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:858:5: INSTRUCTION_FORMAT10t label_ref
			{
			INSTRUCTION_FORMAT10t277=(Token)match(input,INSTRUCTION_FORMAT10t,FOLLOW_INSTRUCTION_FORMAT10t_in_insn_format10t4042);  
			stream_INSTRUCTION_FORMAT10t.add(INSTRUCTION_FORMAT10t277);

			pushFollow(FOLLOW_label_ref_in_insn_format10t4044);
			label_ref278=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref278.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT10t, label_ref
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 859:5: -> ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:859:8: ^( I_STATEMENT_FORMAT10t[$start, \"I_STATEMENT_FORMAT10t\"] INSTRUCTION_FORMAT10t label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT10t, (retval.start), "I_STATEMENT_FORMAT10t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT10t.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format10t"


	public static class insn_format10x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format10x"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:861:1: insn_format10x : INSTRUCTION_FORMAT10x -> ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x ) ;
	public final smaliParser.insn_format10x_return insn_format10x() throws RecognitionException {
		smaliParser.insn_format10x_return retval = new smaliParser.insn_format10x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT10x279=null;

		CommonTree INSTRUCTION_FORMAT10x279_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT10x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT10x");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:862:3: ( INSTRUCTION_FORMAT10x -> ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:863:5: INSTRUCTION_FORMAT10x
			{
			INSTRUCTION_FORMAT10x279=(Token)match(input,INSTRUCTION_FORMAT10x,FOLLOW_INSTRUCTION_FORMAT10x_in_insn_format10x4074);  
			stream_INSTRUCTION_FORMAT10x.add(INSTRUCTION_FORMAT10x279);

			// AST REWRITE
			// elements: INSTRUCTION_FORMAT10x
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 864:5: -> ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:864:8: ^( I_STATEMENT_FORMAT10x[$start, \"I_STATEMENT_FORMAT10x\"] INSTRUCTION_FORMAT10x )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT10x, (retval.start), "I_STATEMENT_FORMAT10x"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT10x.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format10x"


	public static class insn_format10x_odex_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format10x_odex"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:866:1: insn_format10x_odex : INSTRUCTION_FORMAT10x_ODEX ;
	public final smaliParser.insn_format10x_odex_return insn_format10x_odex() throws RecognitionException {
		smaliParser.insn_format10x_odex_return retval = new smaliParser.insn_format10x_odex_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT10x_ODEX280=null;

		CommonTree INSTRUCTION_FORMAT10x_ODEX280_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:867:3: ( INSTRUCTION_FORMAT10x_ODEX )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:868:5: INSTRUCTION_FORMAT10x_ODEX
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT10x_ODEX280=(Token)match(input,INSTRUCTION_FORMAT10x_ODEX,FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_insn_format10x_odex4102); 
			INSTRUCTION_FORMAT10x_ODEX280_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT10x_ODEX280);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT10x_ODEX280_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT10x_ODEX280!=null?INSTRUCTION_FORMAT10x_ODEX280.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format10x_odex"


	public static class insn_format11n_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format11n"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:873:1: insn_format11n : INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal ) ;
	public final smaliParser.insn_format11n_return insn_format11n() throws RecognitionException {
		smaliParser.insn_format11n_return retval = new smaliParser.insn_format11n_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT11n281=null;
		Token REGISTER282=null;
		Token COMMA283=null;
		ParserRuleReturnScope integral_literal284 =null;

		CommonTree INSTRUCTION_FORMAT11n281_tree=null;
		CommonTree REGISTER282_tree=null;
		CommonTree COMMA283_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT11n=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT11n");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:874:3: ( INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:875:5: INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal
			{
			INSTRUCTION_FORMAT11n281=(Token)match(input,INSTRUCTION_FORMAT11n,FOLLOW_INSTRUCTION_FORMAT11n_in_insn_format11n4123);  
			stream_INSTRUCTION_FORMAT11n.add(INSTRUCTION_FORMAT11n281);

			REGISTER282=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format11n4125);  
			stream_REGISTER.add(REGISTER282);

			COMMA283=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format11n4127);  
			stream_COMMA.add(COMMA283);

			pushFollow(FOLLOW_integral_literal_in_insn_format11n4129);
			integral_literal284=integral_literal();
			state._fsp--;

			stream_integral_literal.add(integral_literal284.getTree());
			// AST REWRITE
			// elements: integral_literal, REGISTER, INSTRUCTION_FORMAT11n
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 876:5: -> ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:876:8: ^( I_STATEMENT_FORMAT11n[$start, \"I_STATEMENT_FORMAT11n\"] INSTRUCTION_FORMAT11n REGISTER integral_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT11n, (retval.start), "I_STATEMENT_FORMAT11n"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT11n.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_integral_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format11n"


	public static class insn_format11x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format11x"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:878:1: insn_format11x : INSTRUCTION_FORMAT11x REGISTER -> ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER ) ;
	public final smaliParser.insn_format11x_return insn_format11x() throws RecognitionException {
		smaliParser.insn_format11x_return retval = new smaliParser.insn_format11x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT11x285=null;
		Token REGISTER286=null;

		CommonTree INSTRUCTION_FORMAT11x285_tree=null;
		CommonTree REGISTER286_tree=null;
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT11x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT11x");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:879:3: ( INSTRUCTION_FORMAT11x REGISTER -> ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:880:5: INSTRUCTION_FORMAT11x REGISTER
			{
			INSTRUCTION_FORMAT11x285=(Token)match(input,INSTRUCTION_FORMAT11x,FOLLOW_INSTRUCTION_FORMAT11x_in_insn_format11x4161);  
			stream_INSTRUCTION_FORMAT11x.add(INSTRUCTION_FORMAT11x285);

			REGISTER286=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format11x4163);  
			stream_REGISTER.add(REGISTER286);

			// AST REWRITE
			// elements: INSTRUCTION_FORMAT11x, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 881:5: -> ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:881:8: ^( I_STATEMENT_FORMAT11x[$start, \"I_STATEMENT_FORMAT11x\"] INSTRUCTION_FORMAT11x REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT11x, (retval.start), "I_STATEMENT_FORMAT11x"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT11x.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format11x"


	public static class insn_format12x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format12x"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:883:1: insn_format12x : instruction_format12x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER ) ;
	public final smaliParser.insn_format12x_return insn_format12x() throws RecognitionException {
		smaliParser.insn_format12x_return retval = new smaliParser.insn_format12x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token REGISTER288=null;
		Token COMMA289=null;
		Token REGISTER290=null;
		ParserRuleReturnScope instruction_format12x287 =null;

		CommonTree REGISTER288_tree=null;
		CommonTree COMMA289_tree=null;
		CommonTree REGISTER290_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleSubtreeStream stream_instruction_format12x=new RewriteRuleSubtreeStream(adaptor,"rule instruction_format12x");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:884:3: ( instruction_format12x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:885:5: instruction_format12x REGISTER COMMA REGISTER
			{
			pushFollow(FOLLOW_instruction_format12x_in_insn_format12x4193);
			instruction_format12x287=instruction_format12x();
			state._fsp--;

			stream_instruction_format12x.add(instruction_format12x287.getTree());
			REGISTER288=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format12x4195);  
			stream_REGISTER.add(REGISTER288);

			COMMA289=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format12x4197);  
			stream_COMMA.add(COMMA289);

			REGISTER290=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format12x4199);  
			stream_REGISTER.add(REGISTER290);

			// AST REWRITE
			// elements: REGISTER, instruction_format12x, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 886:5: -> ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:886:8: ^( I_STATEMENT_FORMAT12x[$start, \"I_STATEMENT_FORMAT12x\"] instruction_format12x REGISTER REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT12x, (retval.start), "I_STATEMENT_FORMAT12x"), root_1);
				adaptor.addChild(root_1, stream_instruction_format12x.nextTree());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format12x"


	public static class insn_format20bc_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format20bc"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:888:1: insn_format20bc : INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference -> ^( I_STATEMENT_FORMAT20bc INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE verification_error_reference ) ;
	public final smaliParser.insn_format20bc_return insn_format20bc() throws RecognitionException {
		smaliParser.insn_format20bc_return retval = new smaliParser.insn_format20bc_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT20bc291=null;
		Token VERIFICATION_ERROR_TYPE292=null;
		Token COMMA293=null;
		ParserRuleReturnScope verification_error_reference294 =null;

		CommonTree INSTRUCTION_FORMAT20bc291_tree=null;
		CommonTree VERIFICATION_ERROR_TYPE292_tree=null;
		CommonTree COMMA293_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VERIFICATION_ERROR_TYPE=new RewriteRuleTokenStream(adaptor,"token VERIFICATION_ERROR_TYPE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT20bc=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT20bc");
		RewriteRuleSubtreeStream stream_verification_error_reference=new RewriteRuleSubtreeStream(adaptor,"rule verification_error_reference");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:889:3: ( INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference -> ^( I_STATEMENT_FORMAT20bc INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE verification_error_reference ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:890:5: INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference
			{
			INSTRUCTION_FORMAT20bc291=(Token)match(input,INSTRUCTION_FORMAT20bc,FOLLOW_INSTRUCTION_FORMAT20bc_in_insn_format20bc4231);  
			stream_INSTRUCTION_FORMAT20bc.add(INSTRUCTION_FORMAT20bc291);

			VERIFICATION_ERROR_TYPE292=(Token)match(input,VERIFICATION_ERROR_TYPE,FOLLOW_VERIFICATION_ERROR_TYPE_in_insn_format20bc4233);  
			stream_VERIFICATION_ERROR_TYPE.add(VERIFICATION_ERROR_TYPE292);

			COMMA293=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format20bc4235);  
			stream_COMMA.add(COMMA293);

			pushFollow(FOLLOW_verification_error_reference_in_insn_format20bc4237);
			verification_error_reference294=verification_error_reference();
			state._fsp--;

			stream_verification_error_reference.add(verification_error_reference294.getTree());

			      if (!allowOdex || opcodes.getOpcodeByName((INSTRUCTION_FORMAT20bc291!=null?INSTRUCTION_FORMAT20bc291.getText():null)) == null || apiLevel >= 14) {
			        throwOdexedInstructionException(input, (INSTRUCTION_FORMAT20bc291!=null?INSTRUCTION_FORMAT20bc291.getText():null));
			      }
			    
			// AST REWRITE
			// elements: VERIFICATION_ERROR_TYPE, verification_error_reference, INSTRUCTION_FORMAT20bc
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 896:5: -> ^( I_STATEMENT_FORMAT20bc INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE verification_error_reference )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:896:8: ^( I_STATEMENT_FORMAT20bc INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE verification_error_reference )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT20bc, "I_STATEMENT_FORMAT20bc"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT20bc.nextNode());
				adaptor.addChild(root_1, stream_VERIFICATION_ERROR_TYPE.nextNode());
				adaptor.addChild(root_1, stream_verification_error_reference.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format20bc"


	public static class insn_format20t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format20t"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:898:1: insn_format20t : INSTRUCTION_FORMAT20t label_ref -> ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref ) ;
	public final smaliParser.insn_format20t_return insn_format20t() throws RecognitionException {
		smaliParser.insn_format20t_return retval = new smaliParser.insn_format20t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT20t295=null;
		ParserRuleReturnScope label_ref296 =null;

		CommonTree INSTRUCTION_FORMAT20t295_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT20t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT20t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:899:3: ( INSTRUCTION_FORMAT20t label_ref -> ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:900:5: INSTRUCTION_FORMAT20t label_ref
			{
			INSTRUCTION_FORMAT20t295=(Token)match(input,INSTRUCTION_FORMAT20t,FOLLOW_INSTRUCTION_FORMAT20t_in_insn_format20t4274);  
			stream_INSTRUCTION_FORMAT20t.add(INSTRUCTION_FORMAT20t295);

			pushFollow(FOLLOW_label_ref_in_insn_format20t4276);
			label_ref296=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref296.getTree());
			// AST REWRITE
			// elements: label_ref, INSTRUCTION_FORMAT20t
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 901:5: -> ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:901:8: ^( I_STATEMENT_FORMAT20t[$start, \"I_STATEMENT_FORMAT20t\"] INSTRUCTION_FORMAT20t label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT20t, (retval.start), "I_STATEMENT_FORMAT20t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT20t.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format20t"


	public static class insn_format21c_field_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21c_field"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:903:1: insn_format21c_field : INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER fully_qualified_field ) ;
	public final smaliParser.insn_format21c_field_return insn_format21c_field() throws RecognitionException {
		smaliParser.insn_format21c_field_return retval = new smaliParser.insn_format21c_field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21c_FIELD297=null;
		Token REGISTER298=null;
		Token COMMA299=null;
		ParserRuleReturnScope fully_qualified_field300 =null;

		CommonTree INSTRUCTION_FORMAT21c_FIELD297_tree=null;
		CommonTree REGISTER298_tree=null;
		CommonTree COMMA299_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_FIELD");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleSubtreeStream stream_fully_qualified_field=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_field");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:904:3: ( INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER fully_qualified_field ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:905:5: INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field
			{
			INSTRUCTION_FORMAT21c_FIELD297=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_insn_format21c_field4306);  
			stream_INSTRUCTION_FORMAT21c_FIELD.add(INSTRUCTION_FORMAT21c_FIELD297);

			REGISTER298=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_field4308);  
			stream_REGISTER.add(REGISTER298);

			COMMA299=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_field4310);  
			stream_COMMA.add(COMMA299);

			pushFollow(FOLLOW_fully_qualified_field_in_insn_format21c_field4312);
			fully_qualified_field300=fully_qualified_field();
			state._fsp--;

			stream_fully_qualified_field.add(fully_qualified_field300.getTree());
			// AST REWRITE
			// elements: REGISTER, INSTRUCTION_FORMAT21c_FIELD, fully_qualified_field
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 906:5: -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER fully_qualified_field )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:906:8: ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD REGISTER fully_qualified_field )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_FIELD, (retval.start), "I_STATEMENT_FORMAT21c_FIELD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_FIELD.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fully_qualified_field.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21c_field"


	public static class insn_format21c_field_odex_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21c_field_odex"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:908:1: insn_format21c_field_odex : INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER fully_qualified_field ) ;
	public final smaliParser.insn_format21c_field_odex_return insn_format21c_field_odex() throws RecognitionException {
		smaliParser.insn_format21c_field_odex_return retval = new smaliParser.insn_format21c_field_odex_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21c_FIELD_ODEX301=null;
		Token REGISTER302=null;
		Token COMMA303=null;
		ParserRuleReturnScope fully_qualified_field304 =null;

		CommonTree INSTRUCTION_FORMAT21c_FIELD_ODEX301_tree=null;
		CommonTree REGISTER302_tree=null;
		CommonTree COMMA303_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_FIELD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_FIELD_ODEX");
		RewriteRuleSubtreeStream stream_fully_qualified_field=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_field");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:909:3: ( INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER fully_qualified_field ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:910:5: INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field
			{
			INSTRUCTION_FORMAT21c_FIELD_ODEX301=(Token)match(input,INSTRUCTION_FORMAT21c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_insn_format21c_field_odex4344);  
			stream_INSTRUCTION_FORMAT21c_FIELD_ODEX.add(INSTRUCTION_FORMAT21c_FIELD_ODEX301);

			REGISTER302=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_field_odex4346);  
			stream_REGISTER.add(REGISTER302);

			COMMA303=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_field_odex4348);  
			stream_COMMA.add(COMMA303);

			pushFollow(FOLLOW_fully_qualified_field_in_insn_format21c_field_odex4350);
			fully_qualified_field304=fully_qualified_field();
			state._fsp--;

			stream_fully_qualified_field.add(fully_qualified_field304.getTree());

			      if (!allowOdex || opcodes.getOpcodeByName((INSTRUCTION_FORMAT21c_FIELD_ODEX301!=null?INSTRUCTION_FORMAT21c_FIELD_ODEX301.getText():null)) == null || apiLevel >= 14) {
			        throwOdexedInstructionException(input, (INSTRUCTION_FORMAT21c_FIELD_ODEX301!=null?INSTRUCTION_FORMAT21c_FIELD_ODEX301.getText():null));
			      }
			    
			// AST REWRITE
			// elements: fully_qualified_field, INSTRUCTION_FORMAT21c_FIELD_ODEX, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 916:5: -> ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER fully_qualified_field )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:916:8: ^( I_STATEMENT_FORMAT21c_FIELD[$start, \"I_STATEMENT_FORMAT21c_FIELD\"] INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER fully_qualified_field )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_FIELD, (retval.start), "I_STATEMENT_FORMAT21c_FIELD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_FIELD_ODEX.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fully_qualified_field.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21c_field_odex"


	public static class insn_format21c_string_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21c_string"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:918:1: insn_format21c_string : INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL ) ;
	public final smaliParser.insn_format21c_string_return insn_format21c_string() throws RecognitionException {
		smaliParser.insn_format21c_string_return retval = new smaliParser.insn_format21c_string_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21c_STRING305=null;
		Token REGISTER306=null;
		Token COMMA307=null;
		Token STRING_LITERAL308=null;

		CommonTree INSTRUCTION_FORMAT21c_STRING305_tree=null;
		CommonTree REGISTER306_tree=null;
		CommonTree COMMA307_tree=null;
		CommonTree STRING_LITERAL308_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_STRING=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_STRING");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:919:3: ( INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:920:5: INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL
			{
			INSTRUCTION_FORMAT21c_STRING305=(Token)match(input,INSTRUCTION_FORMAT21c_STRING,FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_insn_format21c_string4388);  
			stream_INSTRUCTION_FORMAT21c_STRING.add(INSTRUCTION_FORMAT21c_STRING305);

			REGISTER306=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_string4390);  
			stream_REGISTER.add(REGISTER306);

			COMMA307=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_string4392);  
			stream_COMMA.add(COMMA307);

			STRING_LITERAL308=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_insn_format21c_string4394);  
			stream_STRING_LITERAL.add(STRING_LITERAL308);

			// AST REWRITE
			// elements: INSTRUCTION_FORMAT21c_STRING, STRING_LITERAL, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 921:5: -> ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:921:8: ^( I_STATEMENT_FORMAT21c_STRING[$start, \"I_STATEMENT_FORMAT21c_STRING\"] INSTRUCTION_FORMAT21c_STRING REGISTER STRING_LITERAL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_STRING, (retval.start), "I_STATEMENT_FORMAT21c_STRING"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_STRING.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21c_string"


	public static class insn_format21c_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21c_type"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:923:1: insn_format21c_type : INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER nonvoid_type_descriptor ) ;
	public final smaliParser.insn_format21c_type_return insn_format21c_type() throws RecognitionException {
		smaliParser.insn_format21c_type_return retval = new smaliParser.insn_format21c_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21c_TYPE309=null;
		Token REGISTER310=null;
		Token COMMA311=null;
		ParserRuleReturnScope nonvoid_type_descriptor312 =null;

		CommonTree INSTRUCTION_FORMAT21c_TYPE309_tree=null;
		CommonTree REGISTER310_tree=null;
		CommonTree COMMA311_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21c_TYPE");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:924:3: ( INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER nonvoid_type_descriptor ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:925:5: INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA nonvoid_type_descriptor
			{
			INSTRUCTION_FORMAT21c_TYPE309=(Token)match(input,INSTRUCTION_FORMAT21c_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_insn_format21c_type4426);  
			stream_INSTRUCTION_FORMAT21c_TYPE.add(INSTRUCTION_FORMAT21c_TYPE309);

			REGISTER310=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_type4428);  
			stream_REGISTER.add(REGISTER310);

			COMMA311=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_type4430);  
			stream_COMMA.add(COMMA311);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format21c_type4432);
			nonvoid_type_descriptor312=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor312.getTree());
			// AST REWRITE
			// elements: REGISTER, nonvoid_type_descriptor, INSTRUCTION_FORMAT21c_TYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 926:5: -> ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER nonvoid_type_descriptor )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:926:8: ^( I_STATEMENT_FORMAT21c_TYPE[$start, \"I_STATEMENT_FORMAT21c\"] INSTRUCTION_FORMAT21c_TYPE REGISTER nonvoid_type_descriptor )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21c_TYPE, (retval.start), "I_STATEMENT_FORMAT21c"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21c_TYPE.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21c_type"


	public static class insn_format21ih_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21ih"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:928:1: insn_format21ih : INSTRUCTION_FORMAT21ih REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT21ih[$start, \"I_STATEMENT_FORMAT21ih\"] INSTRUCTION_FORMAT21ih REGISTER fixed_32bit_literal ) ;
	public final smaliParser.insn_format21ih_return insn_format21ih() throws RecognitionException {
		smaliParser.insn_format21ih_return retval = new smaliParser.insn_format21ih_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21ih313=null;
		Token REGISTER314=null;
		Token COMMA315=null;
		ParserRuleReturnScope fixed_32bit_literal316 =null;

		CommonTree INSTRUCTION_FORMAT21ih313_tree=null;
		CommonTree REGISTER314_tree=null;
		CommonTree COMMA315_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21ih=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21ih");
		RewriteRuleSubtreeStream stream_fixed_32bit_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_32bit_literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:929:3: ( INSTRUCTION_FORMAT21ih REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT21ih[$start, \"I_STATEMENT_FORMAT21ih\"] INSTRUCTION_FORMAT21ih REGISTER fixed_32bit_literal ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:930:5: INSTRUCTION_FORMAT21ih REGISTER COMMA fixed_32bit_literal
			{
			INSTRUCTION_FORMAT21ih313=(Token)match(input,INSTRUCTION_FORMAT21ih,FOLLOW_INSTRUCTION_FORMAT21ih_in_insn_format21ih4464);  
			stream_INSTRUCTION_FORMAT21ih.add(INSTRUCTION_FORMAT21ih313);

			REGISTER314=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21ih4466);  
			stream_REGISTER.add(REGISTER314);

			COMMA315=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21ih4468);  
			stream_COMMA.add(COMMA315);

			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_format21ih4470);
			fixed_32bit_literal316=fixed_32bit_literal();
			state._fsp--;

			stream_fixed_32bit_literal.add(fixed_32bit_literal316.getTree());
			// AST REWRITE
			// elements: fixed_32bit_literal, REGISTER, INSTRUCTION_FORMAT21ih
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 931:5: -> ^( I_STATEMENT_FORMAT21ih[$start, \"I_STATEMENT_FORMAT21ih\"] INSTRUCTION_FORMAT21ih REGISTER fixed_32bit_literal )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:931:8: ^( I_STATEMENT_FORMAT21ih[$start, \"I_STATEMENT_FORMAT21ih\"] INSTRUCTION_FORMAT21ih REGISTER fixed_32bit_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21ih, (retval.start), "I_STATEMENT_FORMAT21ih"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21ih.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fixed_32bit_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21ih"


	public static class insn_format21lh_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21lh"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:933:1: insn_format21lh : INSTRUCTION_FORMAT21lh REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT21lh[$start, \"I_STATEMENT_FORMAT21lh\"] INSTRUCTION_FORMAT21lh REGISTER fixed_32bit_literal ) ;
	public final smaliParser.insn_format21lh_return insn_format21lh() throws RecognitionException {
		smaliParser.insn_format21lh_return retval = new smaliParser.insn_format21lh_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21lh317=null;
		Token REGISTER318=null;
		Token COMMA319=null;
		ParserRuleReturnScope fixed_32bit_literal320 =null;

		CommonTree INSTRUCTION_FORMAT21lh317_tree=null;
		CommonTree REGISTER318_tree=null;
		CommonTree COMMA319_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21lh=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21lh");
		RewriteRuleSubtreeStream stream_fixed_32bit_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_32bit_literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:934:3: ( INSTRUCTION_FORMAT21lh REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT21lh[$start, \"I_STATEMENT_FORMAT21lh\"] INSTRUCTION_FORMAT21lh REGISTER fixed_32bit_literal ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:935:5: INSTRUCTION_FORMAT21lh REGISTER COMMA fixed_32bit_literal
			{
			INSTRUCTION_FORMAT21lh317=(Token)match(input,INSTRUCTION_FORMAT21lh,FOLLOW_INSTRUCTION_FORMAT21lh_in_insn_format21lh4502);  
			stream_INSTRUCTION_FORMAT21lh.add(INSTRUCTION_FORMAT21lh317);

			REGISTER318=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21lh4504);  
			stream_REGISTER.add(REGISTER318);

			COMMA319=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21lh4506);  
			stream_COMMA.add(COMMA319);

			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_format21lh4508);
			fixed_32bit_literal320=fixed_32bit_literal();
			state._fsp--;

			stream_fixed_32bit_literal.add(fixed_32bit_literal320.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT21lh, REGISTER, fixed_32bit_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 936:5: -> ^( I_STATEMENT_FORMAT21lh[$start, \"I_STATEMENT_FORMAT21lh\"] INSTRUCTION_FORMAT21lh REGISTER fixed_32bit_literal )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:936:8: ^( I_STATEMENT_FORMAT21lh[$start, \"I_STATEMENT_FORMAT21lh\"] INSTRUCTION_FORMAT21lh REGISTER fixed_32bit_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21lh, (retval.start), "I_STATEMENT_FORMAT21lh"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21lh.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fixed_32bit_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21lh"


	public static class insn_format21s_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21s"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:938:1: insn_format21s : INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal ) ;
	public final smaliParser.insn_format21s_return insn_format21s() throws RecognitionException {
		smaliParser.insn_format21s_return retval = new smaliParser.insn_format21s_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21s321=null;
		Token REGISTER322=null;
		Token COMMA323=null;
		ParserRuleReturnScope integral_literal324 =null;

		CommonTree INSTRUCTION_FORMAT21s321_tree=null;
		CommonTree REGISTER322_tree=null;
		CommonTree COMMA323_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21s=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21s");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:939:3: ( INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:940:5: INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal
			{
			INSTRUCTION_FORMAT21s321=(Token)match(input,INSTRUCTION_FORMAT21s,FOLLOW_INSTRUCTION_FORMAT21s_in_insn_format21s4540);  
			stream_INSTRUCTION_FORMAT21s.add(INSTRUCTION_FORMAT21s321);

			REGISTER322=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21s4542);  
			stream_REGISTER.add(REGISTER322);

			COMMA323=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21s4544);  
			stream_COMMA.add(COMMA323);

			pushFollow(FOLLOW_integral_literal_in_insn_format21s4546);
			integral_literal324=integral_literal();
			state._fsp--;

			stream_integral_literal.add(integral_literal324.getTree());
			// AST REWRITE
			// elements: REGISTER, INSTRUCTION_FORMAT21s, integral_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 941:5: -> ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:941:8: ^( I_STATEMENT_FORMAT21s[$start, \"I_STATEMENT_FORMAT21s\"] INSTRUCTION_FORMAT21s REGISTER integral_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21s, (retval.start), "I_STATEMENT_FORMAT21s"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21s.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_integral_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21s"


	public static class insn_format21t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format21t"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:943:1: insn_format21t : INSTRUCTION_FORMAT21t REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref ) ;
	public final smaliParser.insn_format21t_return insn_format21t() throws RecognitionException {
		smaliParser.insn_format21t_return retval = new smaliParser.insn_format21t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT21t325=null;
		Token REGISTER326=null;
		Token COMMA327=null;
		ParserRuleReturnScope label_ref328 =null;

		CommonTree INSTRUCTION_FORMAT21t325_tree=null;
		CommonTree REGISTER326_tree=null;
		CommonTree COMMA327_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT21t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT21t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:944:3: ( INSTRUCTION_FORMAT21t REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:945:5: INSTRUCTION_FORMAT21t REGISTER COMMA label_ref
			{
			INSTRUCTION_FORMAT21t325=(Token)match(input,INSTRUCTION_FORMAT21t,FOLLOW_INSTRUCTION_FORMAT21t_in_insn_format21t4578);  
			stream_INSTRUCTION_FORMAT21t.add(INSTRUCTION_FORMAT21t325);

			REGISTER326=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21t4580);  
			stream_REGISTER.add(REGISTER326);

			COMMA327=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format21t4582);  
			stream_COMMA.add(COMMA327);

			pushFollow(FOLLOW_label_ref_in_insn_format21t4584);
			label_ref328=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref328.getTree());
			// AST REWRITE
			// elements: REGISTER, INSTRUCTION_FORMAT21t, label_ref
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 946:5: -> ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:946:8: ^( I_STATEMENT_FORMAT21t[$start, \"I_STATEMENT_FORMAT21t\"] INSTRUCTION_FORMAT21t REGISTER label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT21t, (retval.start), "I_STATEMENT_FORMAT21t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT21t.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format21t"


	public static class insn_format22b_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22b"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:948:1: insn_format22b : INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal ) ;
	public final smaliParser.insn_format22b_return insn_format22b() throws RecognitionException {
		smaliParser.insn_format22b_return retval = new smaliParser.insn_format22b_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22b329=null;
		Token REGISTER330=null;
		Token COMMA331=null;
		Token REGISTER332=null;
		Token COMMA333=null;
		ParserRuleReturnScope integral_literal334 =null;

		CommonTree INSTRUCTION_FORMAT22b329_tree=null;
		CommonTree REGISTER330_tree=null;
		CommonTree COMMA331_tree=null;
		CommonTree REGISTER332_tree=null;
		CommonTree COMMA333_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22b=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22b");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:949:3: ( INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:950:5: INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal
			{
			INSTRUCTION_FORMAT22b329=(Token)match(input,INSTRUCTION_FORMAT22b,FOLLOW_INSTRUCTION_FORMAT22b_in_insn_format22b4616);  
			stream_INSTRUCTION_FORMAT22b.add(INSTRUCTION_FORMAT22b329);

			REGISTER330=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22b4618);  
			stream_REGISTER.add(REGISTER330);

			COMMA331=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22b4620);  
			stream_COMMA.add(COMMA331);

			REGISTER332=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22b4622);  
			stream_REGISTER.add(REGISTER332);

			COMMA333=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22b4624);  
			stream_COMMA.add(COMMA333);

			pushFollow(FOLLOW_integral_literal_in_insn_format22b4626);
			integral_literal334=integral_literal();
			state._fsp--;

			stream_integral_literal.add(integral_literal334.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT22b, REGISTER, REGISTER, integral_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 951:5: -> ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:951:8: ^( I_STATEMENT_FORMAT22b[$start, \"I_STATEMENT_FORMAT22b\"] INSTRUCTION_FORMAT22b REGISTER REGISTER integral_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22b, (retval.start), "I_STATEMENT_FORMAT22b"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22b.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_integral_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22b"


	public static class insn_format22c_field_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22c_field"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:953:1: insn_format22c_field : INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER fully_qualified_field ) ;
	public final smaliParser.insn_format22c_field_return insn_format22c_field() throws RecognitionException {
		smaliParser.insn_format22c_field_return retval = new smaliParser.insn_format22c_field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22c_FIELD335=null;
		Token REGISTER336=null;
		Token COMMA337=null;
		Token REGISTER338=null;
		Token COMMA339=null;
		ParserRuleReturnScope fully_qualified_field340 =null;

		CommonTree INSTRUCTION_FORMAT22c_FIELD335_tree=null;
		CommonTree REGISTER336_tree=null;
		CommonTree COMMA337_tree=null;
		CommonTree REGISTER338_tree=null;
		CommonTree COMMA339_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_FIELD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_FIELD");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleSubtreeStream stream_fully_qualified_field=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_field");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:954:3: ( INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER fully_qualified_field ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:955:5: INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
			{
			INSTRUCTION_FORMAT22c_FIELD335=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_insn_format22c_field4660);  
			stream_INSTRUCTION_FORMAT22c_FIELD.add(INSTRUCTION_FORMAT22c_FIELD335);

			REGISTER336=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field4662);  
			stream_REGISTER.add(REGISTER336);

			COMMA337=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field4664);  
			stream_COMMA.add(COMMA337);

			REGISTER338=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field4666);  
			stream_REGISTER.add(REGISTER338);

			COMMA339=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field4668);  
			stream_COMMA.add(COMMA339);

			pushFollow(FOLLOW_fully_qualified_field_in_insn_format22c_field4670);
			fully_qualified_field340=fully_qualified_field();
			state._fsp--;

			stream_fully_qualified_field.add(fully_qualified_field340.getTree());
			// AST REWRITE
			// elements: REGISTER, INSTRUCTION_FORMAT22c_FIELD, fully_qualified_field, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 956:5: -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER fully_qualified_field )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:956:8: ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD REGISTER REGISTER fully_qualified_field )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22c_FIELD, (retval.start), "I_STATEMENT_FORMAT22c_FIELD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22c_FIELD.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fully_qualified_field.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22c_field"


	public static class insn_format22c_field_odex_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22c_field_odex"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:958:1: insn_format22c_field_odex : INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER REGISTER fully_qualified_field ) ;
	public final smaliParser.insn_format22c_field_odex_return insn_format22c_field_odex() throws RecognitionException {
		smaliParser.insn_format22c_field_odex_return retval = new smaliParser.insn_format22c_field_odex_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22c_FIELD_ODEX341=null;
		Token REGISTER342=null;
		Token COMMA343=null;
		Token REGISTER344=null;
		Token COMMA345=null;
		ParserRuleReturnScope fully_qualified_field346 =null;

		CommonTree INSTRUCTION_FORMAT22c_FIELD_ODEX341_tree=null;
		CommonTree REGISTER342_tree=null;
		CommonTree COMMA343_tree=null;
		CommonTree REGISTER344_tree=null;
		CommonTree COMMA345_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_FIELD_ODEX=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_FIELD_ODEX");
		RewriteRuleSubtreeStream stream_fully_qualified_field=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_field");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:959:3: ( INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER REGISTER fully_qualified_field ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:960:5: INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
			{
			INSTRUCTION_FORMAT22c_FIELD_ODEX341=(Token)match(input,INSTRUCTION_FORMAT22c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_insn_format22c_field_odex4704);  
			stream_INSTRUCTION_FORMAT22c_FIELD_ODEX.add(INSTRUCTION_FORMAT22c_FIELD_ODEX341);

			REGISTER342=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field_odex4706);  
			stream_REGISTER.add(REGISTER342);

			COMMA343=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field_odex4708);  
			stream_COMMA.add(COMMA343);

			REGISTER344=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field_odex4710);  
			stream_REGISTER.add(REGISTER344);

			COMMA345=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field_odex4712);  
			stream_COMMA.add(COMMA345);

			pushFollow(FOLLOW_fully_qualified_field_in_insn_format22c_field_odex4714);
			fully_qualified_field346=fully_qualified_field();
			state._fsp--;

			stream_fully_qualified_field.add(fully_qualified_field346.getTree());

			      if (!allowOdex || opcodes.getOpcodeByName((INSTRUCTION_FORMAT22c_FIELD_ODEX341!=null?INSTRUCTION_FORMAT22c_FIELD_ODEX341.getText():null)) == null || apiLevel >= 14) {
			        throwOdexedInstructionException(input, (INSTRUCTION_FORMAT22c_FIELD_ODEX341!=null?INSTRUCTION_FORMAT22c_FIELD_ODEX341.getText():null));
			      }
			    
			// AST REWRITE
			// elements: fully_qualified_field, REGISTER, REGISTER, INSTRUCTION_FORMAT22c_FIELD_ODEX
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 966:5: -> ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER REGISTER fully_qualified_field )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:966:8: ^( I_STATEMENT_FORMAT22c_FIELD[$start, \"I_STATEMENT_FORMAT22c_FIELD\"] INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER REGISTER fully_qualified_field )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22c_FIELD, (retval.start), "I_STATEMENT_FORMAT22c_FIELD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22c_FIELD_ODEX.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fully_qualified_field.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22c_field_odex"


	public static class insn_format22c_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22c_type"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:968:1: insn_format22c_type : INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor ) ;
	public final smaliParser.insn_format22c_type_return insn_format22c_type() throws RecognitionException {
		smaliParser.insn_format22c_type_return retval = new smaliParser.insn_format22c_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22c_TYPE347=null;
		Token REGISTER348=null;
		Token COMMA349=null;
		Token REGISTER350=null;
		Token COMMA351=null;
		ParserRuleReturnScope nonvoid_type_descriptor352 =null;

		CommonTree INSTRUCTION_FORMAT22c_TYPE347_tree=null;
		CommonTree REGISTER348_tree=null;
		CommonTree COMMA349_tree=null;
		CommonTree REGISTER350_tree=null;
		CommonTree COMMA351_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22c_TYPE");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:969:3: ( INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:970:5: INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
			{
			INSTRUCTION_FORMAT22c_TYPE347=(Token)match(input,INSTRUCTION_FORMAT22c_TYPE,FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_insn_format22c_type4754);  
			stream_INSTRUCTION_FORMAT22c_TYPE.add(INSTRUCTION_FORMAT22c_TYPE347);

			REGISTER348=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_type4756);  
			stream_REGISTER.add(REGISTER348);

			COMMA349=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_type4758);  
			stream_COMMA.add(COMMA349);

			REGISTER350=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_type4760);  
			stream_REGISTER.add(REGISTER350);

			COMMA351=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_type4762);  
			stream_COMMA.add(COMMA351);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format22c_type4764);
			nonvoid_type_descriptor352=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor352.getTree());
			// AST REWRITE
			// elements: REGISTER, REGISTER, INSTRUCTION_FORMAT22c_TYPE, nonvoid_type_descriptor
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 971:5: -> ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:971:8: ^( I_STATEMENT_FORMAT22c_TYPE[$start, \"I_STATEMENT_FORMAT22c_TYPE\"] INSTRUCTION_FORMAT22c_TYPE REGISTER REGISTER nonvoid_type_descriptor )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22c_TYPE, (retval.start), "I_STATEMENT_FORMAT22c_TYPE"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22c_TYPE.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22c_type"


	public static class insn_format22cs_field_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22cs_field"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:973:1: insn_format22cs_field : INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET ;
	public final smaliParser.insn_format22cs_field_return insn_format22cs_field() throws RecognitionException {
		smaliParser.insn_format22cs_field_return retval = new smaliParser.insn_format22cs_field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22cs_FIELD353=null;
		Token REGISTER354=null;
		Token COMMA355=null;
		Token REGISTER356=null;
		Token COMMA357=null;
		Token FIELD_OFFSET358=null;

		CommonTree INSTRUCTION_FORMAT22cs_FIELD353_tree=null;
		CommonTree REGISTER354_tree=null;
		CommonTree COMMA355_tree=null;
		CommonTree REGISTER356_tree=null;
		CommonTree COMMA357_tree=null;
		CommonTree FIELD_OFFSET358_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:974:3: ( INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:975:5: INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT22cs_FIELD353=(Token)match(input,INSTRUCTION_FORMAT22cs_FIELD,FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_insn_format22cs_field4798); 
			INSTRUCTION_FORMAT22cs_FIELD353_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT22cs_FIELD353);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT22cs_FIELD353_tree);

			REGISTER354=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22cs_field4800); 
			REGISTER354_tree = (CommonTree)adaptor.create(REGISTER354);
			adaptor.addChild(root_0, REGISTER354_tree);

			COMMA355=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22cs_field4802); 
			COMMA355_tree = (CommonTree)adaptor.create(COMMA355);
			adaptor.addChild(root_0, COMMA355_tree);

			REGISTER356=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22cs_field4804); 
			REGISTER356_tree = (CommonTree)adaptor.create(REGISTER356);
			adaptor.addChild(root_0, REGISTER356_tree);

			COMMA357=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22cs_field4806); 
			COMMA357_tree = (CommonTree)adaptor.create(COMMA357);
			adaptor.addChild(root_0, COMMA357_tree);

			FIELD_OFFSET358=(Token)match(input,FIELD_OFFSET,FOLLOW_FIELD_OFFSET_in_insn_format22cs_field4808); 
			FIELD_OFFSET358_tree = (CommonTree)adaptor.create(FIELD_OFFSET358);
			adaptor.addChild(root_0, FIELD_OFFSET358_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT22cs_FIELD353!=null?INSTRUCTION_FORMAT22cs_FIELD353.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22cs_field"


	public static class insn_format22s_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22s"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:980:1: insn_format22s : instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal ) ;
	public final smaliParser.insn_format22s_return insn_format22s() throws RecognitionException {
		smaliParser.insn_format22s_return retval = new smaliParser.insn_format22s_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token REGISTER360=null;
		Token COMMA361=null;
		Token REGISTER362=null;
		Token COMMA363=null;
		ParserRuleReturnScope instruction_format22s359 =null;
		ParserRuleReturnScope integral_literal364 =null;

		CommonTree REGISTER360_tree=null;
		CommonTree COMMA361_tree=null;
		CommonTree REGISTER362_tree=null;
		CommonTree COMMA363_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleSubtreeStream stream_instruction_format22s=new RewriteRuleSubtreeStream(adaptor,"rule instruction_format22s");
		RewriteRuleSubtreeStream stream_integral_literal=new RewriteRuleSubtreeStream(adaptor,"rule integral_literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:981:3: ( instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal -> ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:982:5: instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal
			{
			pushFollow(FOLLOW_instruction_format22s_in_insn_format22s4829);
			instruction_format22s359=instruction_format22s();
			state._fsp--;

			stream_instruction_format22s.add(instruction_format22s359.getTree());
			REGISTER360=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22s4831);  
			stream_REGISTER.add(REGISTER360);

			COMMA361=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22s4833);  
			stream_COMMA.add(COMMA361);

			REGISTER362=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22s4835);  
			stream_REGISTER.add(REGISTER362);

			COMMA363=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22s4837);  
			stream_COMMA.add(COMMA363);

			pushFollow(FOLLOW_integral_literal_in_insn_format22s4839);
			integral_literal364=integral_literal();
			state._fsp--;

			stream_integral_literal.add(integral_literal364.getTree());
			// AST REWRITE
			// elements: REGISTER, integral_literal, instruction_format22s, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 983:5: -> ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:983:8: ^( I_STATEMENT_FORMAT22s[$start, \"I_STATEMENT_FORMAT22s\"] instruction_format22s REGISTER REGISTER integral_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22s, (retval.start), "I_STATEMENT_FORMAT22s"), root_1);
				adaptor.addChild(root_1, stream_instruction_format22s.nextTree());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_integral_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22s"


	public static class insn_format22t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22t"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:985:1: insn_format22t : INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref ) ;
	public final smaliParser.insn_format22t_return insn_format22t() throws RecognitionException {
		smaliParser.insn_format22t_return retval = new smaliParser.insn_format22t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22t365=null;
		Token REGISTER366=null;
		Token COMMA367=null;
		Token REGISTER368=null;
		Token COMMA369=null;
		ParserRuleReturnScope label_ref370 =null;

		CommonTree INSTRUCTION_FORMAT22t365_tree=null;
		CommonTree REGISTER366_tree=null;
		CommonTree COMMA367_tree=null;
		CommonTree REGISTER368_tree=null;
		CommonTree COMMA369_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:986:3: ( INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:987:5: INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref
			{
			INSTRUCTION_FORMAT22t365=(Token)match(input,INSTRUCTION_FORMAT22t,FOLLOW_INSTRUCTION_FORMAT22t_in_insn_format22t4873);  
			stream_INSTRUCTION_FORMAT22t.add(INSTRUCTION_FORMAT22t365);

			REGISTER366=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22t4875);  
			stream_REGISTER.add(REGISTER366);

			COMMA367=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22t4877);  
			stream_COMMA.add(COMMA367);

			REGISTER368=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22t4879);  
			stream_REGISTER.add(REGISTER368);

			COMMA369=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22t4881);  
			stream_COMMA.add(COMMA369);

			pushFollow(FOLLOW_label_ref_in_insn_format22t4883);
			label_ref370=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref370.getTree());
			// AST REWRITE
			// elements: label_ref, REGISTER, REGISTER, INSTRUCTION_FORMAT22t
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 988:5: -> ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:988:8: ^( I_STATEMENT_FORMAT22t[$start, \"I_STATEMENT_FFORMAT22t\"] INSTRUCTION_FORMAT22t REGISTER REGISTER label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22t, (retval.start), "I_STATEMENT_FFORMAT22t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22t.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22t"


	public static class insn_format22x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format22x"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:990:1: insn_format22x : INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER ) ;
	public final smaliParser.insn_format22x_return insn_format22x() throws RecognitionException {
		smaliParser.insn_format22x_return retval = new smaliParser.insn_format22x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT22x371=null;
		Token REGISTER372=null;
		Token COMMA373=null;
		Token REGISTER374=null;

		CommonTree INSTRUCTION_FORMAT22x371_tree=null;
		CommonTree REGISTER372_tree=null;
		CommonTree COMMA373_tree=null;
		CommonTree REGISTER374_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT22x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT22x");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:991:3: ( INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:992:5: INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER
			{
			INSTRUCTION_FORMAT22x371=(Token)match(input,INSTRUCTION_FORMAT22x,FOLLOW_INSTRUCTION_FORMAT22x_in_insn_format22x4917);  
			stream_INSTRUCTION_FORMAT22x.add(INSTRUCTION_FORMAT22x371);

			REGISTER372=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22x4919);  
			stream_REGISTER.add(REGISTER372);

			COMMA373=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format22x4921);  
			stream_COMMA.add(COMMA373);

			REGISTER374=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22x4923);  
			stream_REGISTER.add(REGISTER374);

			// AST REWRITE
			// elements: REGISTER, REGISTER, INSTRUCTION_FORMAT22x
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 993:5: -> ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:993:8: ^( I_STATEMENT_FORMAT22x[$start, \"I_STATEMENT_FORMAT22x\"] INSTRUCTION_FORMAT22x REGISTER REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT22x, (retval.start), "I_STATEMENT_FORMAT22x"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT22x.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format22x"


	public static class insn_format23x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format23x"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:995:1: insn_format23x : INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER ) ;
	public final smaliParser.insn_format23x_return insn_format23x() throws RecognitionException {
		smaliParser.insn_format23x_return retval = new smaliParser.insn_format23x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT23x375=null;
		Token REGISTER376=null;
		Token COMMA377=null;
		Token REGISTER378=null;
		Token COMMA379=null;
		Token REGISTER380=null;

		CommonTree INSTRUCTION_FORMAT23x375_tree=null;
		CommonTree REGISTER376_tree=null;
		CommonTree COMMA377_tree=null;
		CommonTree REGISTER378_tree=null;
		CommonTree COMMA379_tree=null;
		CommonTree REGISTER380_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT23x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT23x");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:996:3: ( INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:997:5: INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER
			{
			INSTRUCTION_FORMAT23x375=(Token)match(input,INSTRUCTION_FORMAT23x,FOLLOW_INSTRUCTION_FORMAT23x_in_insn_format23x4955);  
			stream_INSTRUCTION_FORMAT23x.add(INSTRUCTION_FORMAT23x375);

			REGISTER376=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x4957);  
			stream_REGISTER.add(REGISTER376);

			COMMA377=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format23x4959);  
			stream_COMMA.add(COMMA377);

			REGISTER378=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x4961);  
			stream_REGISTER.add(REGISTER378);

			COMMA379=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format23x4963);  
			stream_COMMA.add(COMMA379);

			REGISTER380=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x4965);  
			stream_REGISTER.add(REGISTER380);

			// AST REWRITE
			// elements: INSTRUCTION_FORMAT23x, REGISTER, REGISTER, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 998:5: -> ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:998:8: ^( I_STATEMENT_FORMAT23x[$start, \"I_STATEMENT_FORMAT23x\"] INSTRUCTION_FORMAT23x REGISTER REGISTER REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT23x, (retval.start), "I_STATEMENT_FORMAT23x"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT23x.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format23x"


	public static class insn_format30t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format30t"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1000:1: insn_format30t : INSTRUCTION_FORMAT30t label_ref -> ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref ) ;
	public final smaliParser.insn_format30t_return insn_format30t() throws RecognitionException {
		smaliParser.insn_format30t_return retval = new smaliParser.insn_format30t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT30t381=null;
		ParserRuleReturnScope label_ref382 =null;

		CommonTree INSTRUCTION_FORMAT30t381_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT30t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT30t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1001:3: ( INSTRUCTION_FORMAT30t label_ref -> ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1002:5: INSTRUCTION_FORMAT30t label_ref
			{
			INSTRUCTION_FORMAT30t381=(Token)match(input,INSTRUCTION_FORMAT30t,FOLLOW_INSTRUCTION_FORMAT30t_in_insn_format30t4999);  
			stream_INSTRUCTION_FORMAT30t.add(INSTRUCTION_FORMAT30t381);

			pushFollow(FOLLOW_label_ref_in_insn_format30t5001);
			label_ref382=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref382.getTree());
			// AST REWRITE
			// elements: label_ref, INSTRUCTION_FORMAT30t
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1003:5: -> ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1003:8: ^( I_STATEMENT_FORMAT30t[$start, \"I_STATEMENT_FORMAT30t\"] INSTRUCTION_FORMAT30t label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT30t, (retval.start), "I_STATEMENT_FORMAT30t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT30t.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format30t"


	public static class insn_format31c_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format31c"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1005:1: insn_format31c : INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL ) ;
	public final smaliParser.insn_format31c_return insn_format31c() throws RecognitionException {
		smaliParser.insn_format31c_return retval = new smaliParser.insn_format31c_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT31c383=null;
		Token REGISTER384=null;
		Token COMMA385=null;
		Token STRING_LITERAL386=null;

		CommonTree INSTRUCTION_FORMAT31c383_tree=null;
		CommonTree REGISTER384_tree=null;
		CommonTree COMMA385_tree=null;
		CommonTree STRING_LITERAL386_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31c=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31c");
		RewriteRuleTokenStream stream_STRING_LITERAL=new RewriteRuleTokenStream(adaptor,"token STRING_LITERAL");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1006:3: ( INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL -> ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1007:5: INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL
			{
			INSTRUCTION_FORMAT31c383=(Token)match(input,INSTRUCTION_FORMAT31c,FOLLOW_INSTRUCTION_FORMAT31c_in_insn_format31c5031);  
			stream_INSTRUCTION_FORMAT31c.add(INSTRUCTION_FORMAT31c383);

			REGISTER384=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31c5033);  
			stream_REGISTER.add(REGISTER384);

			COMMA385=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format31c5035);  
			stream_COMMA.add(COMMA385);

			STRING_LITERAL386=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_insn_format31c5037);  
			stream_STRING_LITERAL.add(STRING_LITERAL386);

			// AST REWRITE
			// elements: INSTRUCTION_FORMAT31c, STRING_LITERAL, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1008:5: -> ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1008:7: ^( I_STATEMENT_FORMAT31c[$start, \"I_STATEMENT_FORMAT31c\"] INSTRUCTION_FORMAT31c REGISTER STRING_LITERAL )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT31c, (retval.start), "I_STATEMENT_FORMAT31c"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT31c.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_STRING_LITERAL.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format31c"


	public static class insn_format31i_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format31i"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1010:1: insn_format31i : instruction_format31i REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal ) ;
	public final smaliParser.insn_format31i_return insn_format31i() throws RecognitionException {
		smaliParser.insn_format31i_return retval = new smaliParser.insn_format31i_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token REGISTER388=null;
		Token COMMA389=null;
		ParserRuleReturnScope instruction_format31i387 =null;
		ParserRuleReturnScope fixed_32bit_literal390 =null;

		CommonTree REGISTER388_tree=null;
		CommonTree COMMA389_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleSubtreeStream stream_fixed_32bit_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_32bit_literal");
		RewriteRuleSubtreeStream stream_instruction_format31i=new RewriteRuleSubtreeStream(adaptor,"rule instruction_format31i");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1011:3: ( instruction_format31i REGISTER COMMA fixed_32bit_literal -> ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1012:5: instruction_format31i REGISTER COMMA fixed_32bit_literal
			{
			pushFollow(FOLLOW_instruction_format31i_in_insn_format31i5068);
			instruction_format31i387=instruction_format31i();
			state._fsp--;

			stream_instruction_format31i.add(instruction_format31i387.getTree());
			REGISTER388=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31i5070);  
			stream_REGISTER.add(REGISTER388);

			COMMA389=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format31i5072);  
			stream_COMMA.add(COMMA389);

			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_format31i5074);
			fixed_32bit_literal390=fixed_32bit_literal();
			state._fsp--;

			stream_fixed_32bit_literal.add(fixed_32bit_literal390.getTree());
			// AST REWRITE
			// elements: fixed_32bit_literal, instruction_format31i, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1013:5: -> ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1013:8: ^( I_STATEMENT_FORMAT31i[$start, \"I_STATEMENT_FORMAT31i\"] instruction_format31i REGISTER fixed_32bit_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT31i, (retval.start), "I_STATEMENT_FORMAT31i"), root_1);
				adaptor.addChild(root_1, stream_instruction_format31i.nextTree());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fixed_32bit_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format31i"


	public static class insn_format31t_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format31t"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1015:1: insn_format31t : INSTRUCTION_FORMAT31t REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref ) ;
	public final smaliParser.insn_format31t_return insn_format31t() throws RecognitionException {
		smaliParser.insn_format31t_return retval = new smaliParser.insn_format31t_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT31t391=null;
		Token REGISTER392=null;
		Token COMMA393=null;
		ParserRuleReturnScope label_ref394 =null;

		CommonTree INSTRUCTION_FORMAT31t391_tree=null;
		CommonTree REGISTER392_tree=null;
		CommonTree COMMA393_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT31t=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT31t");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1016:3: ( INSTRUCTION_FORMAT31t REGISTER COMMA label_ref -> ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1017:5: INSTRUCTION_FORMAT31t REGISTER COMMA label_ref
			{
			INSTRUCTION_FORMAT31t391=(Token)match(input,INSTRUCTION_FORMAT31t,FOLLOW_INSTRUCTION_FORMAT31t_in_insn_format31t5106);  
			stream_INSTRUCTION_FORMAT31t.add(INSTRUCTION_FORMAT31t391);

			REGISTER392=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31t5108);  
			stream_REGISTER.add(REGISTER392);

			COMMA393=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format31t5110);  
			stream_COMMA.add(COMMA393);

			pushFollow(FOLLOW_label_ref_in_insn_format31t5112);
			label_ref394=label_ref();
			state._fsp--;

			stream_label_ref.add(label_ref394.getTree());
			// AST REWRITE
			// elements: INSTRUCTION_FORMAT31t, label_ref, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1018:5: -> ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1018:8: ^( I_STATEMENT_FORMAT31t[$start, \"I_STATEMENT_FORMAT31t\"] INSTRUCTION_FORMAT31t REGISTER label_ref )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT31t, (retval.start), "I_STATEMENT_FORMAT31t"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT31t.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_label_ref.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format31t"


	public static class insn_format32x_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format32x"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1020:1: insn_format32x : INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER ) ;
	public final smaliParser.insn_format32x_return insn_format32x() throws RecognitionException {
		smaliParser.insn_format32x_return retval = new smaliParser.insn_format32x_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT32x395=null;
		Token REGISTER396=null;
		Token COMMA397=null;
		Token REGISTER398=null;

		CommonTree INSTRUCTION_FORMAT32x395_tree=null;
		CommonTree REGISTER396_tree=null;
		CommonTree COMMA397_tree=null;
		CommonTree REGISTER398_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT32x=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT32x");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1021:3: ( INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER -> ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1022:5: INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER
			{
			INSTRUCTION_FORMAT32x395=(Token)match(input,INSTRUCTION_FORMAT32x,FOLLOW_INSTRUCTION_FORMAT32x_in_insn_format32x5144);  
			stream_INSTRUCTION_FORMAT32x.add(INSTRUCTION_FORMAT32x395);

			REGISTER396=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format32x5146);  
			stream_REGISTER.add(REGISTER396);

			COMMA397=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format32x5148);  
			stream_COMMA.add(COMMA397);

			REGISTER398=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format32x5150);  
			stream_REGISTER.add(REGISTER398);

			// AST REWRITE
			// elements: REGISTER, INSTRUCTION_FORMAT32x, REGISTER
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1023:5: -> ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1023:8: ^( I_STATEMENT_FORMAT32x[$start, \"I_STATEMENT_FORMAT32x\"] INSTRUCTION_FORMAT32x REGISTER REGISTER )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT32x, (retval.start), "I_STATEMENT_FORMAT32x"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT32x.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format32x"


	public static class insn_format35c_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format35c_method"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1025:1: insn_format35c_method : INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method -> ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list fully_qualified_method ) ;
	public final smaliParser.insn_format35c_method_return insn_format35c_method() throws RecognitionException {
		smaliParser.insn_format35c_method_return retval = new smaliParser.insn_format35c_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT35c_METHOD399=null;
		Token OPEN_BRACE400=null;
		Token CLOSE_BRACE402=null;
		Token COMMA403=null;
		ParserRuleReturnScope register_list401 =null;
		ParserRuleReturnScope fully_qualified_method404 =null;

		CommonTree INSTRUCTION_FORMAT35c_METHOD399_tree=null;
		CommonTree OPEN_BRACE400_tree=null;
		CommonTree CLOSE_BRACE402_tree=null;
		CommonTree COMMA403_tree=null;
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_METHOD");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleSubtreeStream stream_register_list=new RewriteRuleSubtreeStream(adaptor,"rule register_list");
		RewriteRuleSubtreeStream stream_fully_qualified_method=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_method");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1026:3: ( INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method -> ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list fully_qualified_method ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1027:5: INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
			{
			INSTRUCTION_FORMAT35c_METHOD399=(Token)match(input,INSTRUCTION_FORMAT35c_METHOD,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_insn_format35c_method5182);  
			stream_INSTRUCTION_FORMAT35c_METHOD.add(INSTRUCTION_FORMAT35c_METHOD399);

			OPEN_BRACE400=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_method5184);  
			stream_OPEN_BRACE.add(OPEN_BRACE400);

			pushFollow(FOLLOW_register_list_in_insn_format35c_method5186);
			register_list401=register_list();
			state._fsp--;

			stream_register_list.add(register_list401.getTree());
			CLOSE_BRACE402=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_method5188);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE402);

			COMMA403=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_method5190);  
			stream_COMMA.add(COMMA403);

			pushFollow(FOLLOW_fully_qualified_method_in_insn_format35c_method5192);
			fully_qualified_method404=fully_qualified_method();
			state._fsp--;

			stream_fully_qualified_method.add(fully_qualified_method404.getTree());
			// AST REWRITE
			// elements: fully_qualified_method, INSTRUCTION_FORMAT35c_METHOD, register_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1028:5: -> ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list fully_qualified_method )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1028:8: ^( I_STATEMENT_FORMAT35c_METHOD[$start, \"I_STATEMENT_FORMAT35c_METHOD\"] INSTRUCTION_FORMAT35c_METHOD register_list fully_qualified_method )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT35c_METHOD, (retval.start), "I_STATEMENT_FORMAT35c_METHOD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT35c_METHOD.nextNode());
				adaptor.addChild(root_1, stream_register_list.nextTree());
				adaptor.addChild(root_1, stream_fully_qualified_method.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format35c_method"


	public static class insn_format35c_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format35c_type"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1030:1: insn_format35c_type : INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor ) ;
	public final smaliParser.insn_format35c_type_return insn_format35c_type() throws RecognitionException {
		smaliParser.insn_format35c_type_return retval = new smaliParser.insn_format35c_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT35c_TYPE405=null;
		Token OPEN_BRACE406=null;
		Token CLOSE_BRACE408=null;
		Token COMMA409=null;
		ParserRuleReturnScope register_list407 =null;
		ParserRuleReturnScope nonvoid_type_descriptor410 =null;

		CommonTree INSTRUCTION_FORMAT35c_TYPE405_tree=null;
		CommonTree OPEN_BRACE406_tree=null;
		CommonTree CLOSE_BRACE408_tree=null;
		CommonTree COMMA409_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT35c_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT35c_TYPE");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleSubtreeStream stream_register_list=new RewriteRuleSubtreeStream(adaptor,"rule register_list");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1031:3: ( INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1032:5: INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor
			{
			INSTRUCTION_FORMAT35c_TYPE405=(Token)match(input,INSTRUCTION_FORMAT35c_TYPE,FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_insn_format35c_type5224);  
			stream_INSTRUCTION_FORMAT35c_TYPE.add(INSTRUCTION_FORMAT35c_TYPE405);

			OPEN_BRACE406=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_type5226);  
			stream_OPEN_BRACE.add(OPEN_BRACE406);

			pushFollow(FOLLOW_register_list_in_insn_format35c_type5228);
			register_list407=register_list();
			state._fsp--;

			stream_register_list.add(register_list407.getTree());
			CLOSE_BRACE408=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_type5230);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE408);

			COMMA409=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_type5232);  
			stream_COMMA.add(COMMA409);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format35c_type5234);
			nonvoid_type_descriptor410=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor410.getTree());
			// AST REWRITE
			// elements: nonvoid_type_descriptor, INSTRUCTION_FORMAT35c_TYPE, register_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1033:5: -> ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1033:8: ^( I_STATEMENT_FORMAT35c_TYPE[$start, \"I_STATEMENT_FORMAT35c_TYPE\"] INSTRUCTION_FORMAT35c_TYPE register_list nonvoid_type_descriptor )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT35c_TYPE, (retval.start), "I_STATEMENT_FORMAT35c_TYPE"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT35c_TYPE.nextNode());
				adaptor.addChild(root_1, stream_register_list.nextTree());
				adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format35c_type"


	public static class insn_format35c_method_odex_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format35c_method_odex"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1035:1: insn_format35c_method_odex : INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method ;
	public final smaliParser.insn_format35c_method_odex_return insn_format35c_method_odex() throws RecognitionException {
		smaliParser.insn_format35c_method_odex_return retval = new smaliParser.insn_format35c_method_odex_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT35c_METHOD_ODEX411=null;
		Token OPEN_BRACE412=null;
		Token CLOSE_BRACE414=null;
		Token COMMA415=null;
		ParserRuleReturnScope register_list413 =null;
		ParserRuleReturnScope fully_qualified_method416 =null;

		CommonTree INSTRUCTION_FORMAT35c_METHOD_ODEX411_tree=null;
		CommonTree OPEN_BRACE412_tree=null;
		CommonTree CLOSE_BRACE414_tree=null;
		CommonTree COMMA415_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1036:3: ( INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1037:5: INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT35c_METHOD_ODEX411=(Token)match(input,INSTRUCTION_FORMAT35c_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_insn_format35c_method_odex5266); 
			INSTRUCTION_FORMAT35c_METHOD_ODEX411_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT35c_METHOD_ODEX411);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT35c_METHOD_ODEX411_tree);

			OPEN_BRACE412=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_method_odex5268); 
			OPEN_BRACE412_tree = (CommonTree)adaptor.create(OPEN_BRACE412);
			adaptor.addChild(root_0, OPEN_BRACE412_tree);

			pushFollow(FOLLOW_register_list_in_insn_format35c_method_odex5270);
			register_list413=register_list();
			state._fsp--;

			adaptor.addChild(root_0, register_list413.getTree());

			CLOSE_BRACE414=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_method_odex5272); 
			CLOSE_BRACE414_tree = (CommonTree)adaptor.create(CLOSE_BRACE414);
			adaptor.addChild(root_0, CLOSE_BRACE414_tree);

			COMMA415=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_method_odex5274); 
			COMMA415_tree = (CommonTree)adaptor.create(COMMA415);
			adaptor.addChild(root_0, COMMA415_tree);

			pushFollow(FOLLOW_fully_qualified_method_in_insn_format35c_method_odex5276);
			fully_qualified_method416=fully_qualified_method();
			state._fsp--;

			adaptor.addChild(root_0, fully_qualified_method416.getTree());


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT35c_METHOD_ODEX411!=null?INSTRUCTION_FORMAT35c_METHOD_ODEX411.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format35c_method_odex"


	public static class insn_format35mi_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format35mi_method"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1042:1: insn_format35mi_method : INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX ;
	public final smaliParser.insn_format35mi_method_return insn_format35mi_method() throws RecognitionException {
		smaliParser.insn_format35mi_method_return retval = new smaliParser.insn_format35mi_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT35mi_METHOD417=null;
		Token OPEN_BRACE418=null;
		Token CLOSE_BRACE420=null;
		Token COMMA421=null;
		Token INLINE_INDEX422=null;
		ParserRuleReturnScope register_list419 =null;

		CommonTree INSTRUCTION_FORMAT35mi_METHOD417_tree=null;
		CommonTree OPEN_BRACE418_tree=null;
		CommonTree CLOSE_BRACE420_tree=null;
		CommonTree COMMA421_tree=null;
		CommonTree INLINE_INDEX422_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1043:3: ( INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1044:5: INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT35mi_METHOD417=(Token)match(input,INSTRUCTION_FORMAT35mi_METHOD,FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_insn_format35mi_method5297); 
			INSTRUCTION_FORMAT35mi_METHOD417_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT35mi_METHOD417);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT35mi_METHOD417_tree);

			OPEN_BRACE418=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35mi_method5299); 
			OPEN_BRACE418_tree = (CommonTree)adaptor.create(OPEN_BRACE418);
			adaptor.addChild(root_0, OPEN_BRACE418_tree);

			pushFollow(FOLLOW_register_list_in_insn_format35mi_method5301);
			register_list419=register_list();
			state._fsp--;

			adaptor.addChild(root_0, register_list419.getTree());

			CLOSE_BRACE420=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35mi_method5303); 
			CLOSE_BRACE420_tree = (CommonTree)adaptor.create(CLOSE_BRACE420);
			adaptor.addChild(root_0, CLOSE_BRACE420_tree);

			COMMA421=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format35mi_method5305); 
			COMMA421_tree = (CommonTree)adaptor.create(COMMA421);
			adaptor.addChild(root_0, COMMA421_tree);

			INLINE_INDEX422=(Token)match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_insn_format35mi_method5307); 
			INLINE_INDEX422_tree = (CommonTree)adaptor.create(INLINE_INDEX422);
			adaptor.addChild(root_0, INLINE_INDEX422_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT35mi_METHOD417!=null?INSTRUCTION_FORMAT35mi_METHOD417.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format35mi_method"


	public static class insn_format35ms_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format35ms_method"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1049:1: insn_format35ms_method : INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX ;
	public final smaliParser.insn_format35ms_method_return insn_format35ms_method() throws RecognitionException {
		smaliParser.insn_format35ms_method_return retval = new smaliParser.insn_format35ms_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT35ms_METHOD423=null;
		Token OPEN_BRACE424=null;
		Token CLOSE_BRACE426=null;
		Token COMMA427=null;
		Token VTABLE_INDEX428=null;
		ParserRuleReturnScope register_list425 =null;

		CommonTree INSTRUCTION_FORMAT35ms_METHOD423_tree=null;
		CommonTree OPEN_BRACE424_tree=null;
		CommonTree CLOSE_BRACE426_tree=null;
		CommonTree COMMA427_tree=null;
		CommonTree VTABLE_INDEX428_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1050:3: ( INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1051:5: INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT35ms_METHOD423=(Token)match(input,INSTRUCTION_FORMAT35ms_METHOD,FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_insn_format35ms_method5328); 
			INSTRUCTION_FORMAT35ms_METHOD423_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT35ms_METHOD423);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT35ms_METHOD423_tree);

			OPEN_BRACE424=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35ms_method5330); 
			OPEN_BRACE424_tree = (CommonTree)adaptor.create(OPEN_BRACE424);
			adaptor.addChild(root_0, OPEN_BRACE424_tree);

			pushFollow(FOLLOW_register_list_in_insn_format35ms_method5332);
			register_list425=register_list();
			state._fsp--;

			adaptor.addChild(root_0, register_list425.getTree());

			CLOSE_BRACE426=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35ms_method5334); 
			CLOSE_BRACE426_tree = (CommonTree)adaptor.create(CLOSE_BRACE426);
			adaptor.addChild(root_0, CLOSE_BRACE426_tree);

			COMMA427=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format35ms_method5336); 
			COMMA427_tree = (CommonTree)adaptor.create(COMMA427);
			adaptor.addChild(root_0, COMMA427_tree);

			VTABLE_INDEX428=(Token)match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_insn_format35ms_method5338); 
			VTABLE_INDEX428_tree = (CommonTree)adaptor.create(VTABLE_INDEX428);
			adaptor.addChild(root_0, VTABLE_INDEX428_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT35ms_METHOD423!=null?INSTRUCTION_FORMAT35ms_METHOD423.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format35ms_method"


	public static class insn_format3rc_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format3rc_method"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1056:1: insn_format3rc_method : INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method -> ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range fully_qualified_method ) ;
	public final smaliParser.insn_format3rc_method_return insn_format3rc_method() throws RecognitionException {
		smaliParser.insn_format3rc_method_return retval = new smaliParser.insn_format3rc_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT3rc_METHOD429=null;
		Token OPEN_BRACE430=null;
		Token CLOSE_BRACE432=null;
		Token COMMA433=null;
		ParserRuleReturnScope register_range431 =null;
		ParserRuleReturnScope fully_qualified_method434 =null;

		CommonTree INSTRUCTION_FORMAT3rc_METHOD429_tree=null;
		CommonTree OPEN_BRACE430_tree=null;
		CommonTree CLOSE_BRACE432_tree=null;
		CommonTree COMMA433_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT3rc_METHOD=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT3rc_METHOD");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleSubtreeStream stream_register_range=new RewriteRuleSubtreeStream(adaptor,"rule register_range");
		RewriteRuleSubtreeStream stream_fully_qualified_method=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_method");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1057:3: ( INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method -> ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range fully_qualified_method ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1058:5: INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
			{
			INSTRUCTION_FORMAT3rc_METHOD429=(Token)match(input,INSTRUCTION_FORMAT3rc_METHOD,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_insn_format3rc_method5359);  
			stream_INSTRUCTION_FORMAT3rc_METHOD.add(INSTRUCTION_FORMAT3rc_METHOD429);

			OPEN_BRACE430=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_method5361);  
			stream_OPEN_BRACE.add(OPEN_BRACE430);

			pushFollow(FOLLOW_register_range_in_insn_format3rc_method5363);
			register_range431=register_range();
			state._fsp--;

			stream_register_range.add(register_range431.getTree());
			CLOSE_BRACE432=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_method5365);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE432);

			COMMA433=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_method5367);  
			stream_COMMA.add(COMMA433);

			pushFollow(FOLLOW_fully_qualified_method_in_insn_format3rc_method5369);
			fully_qualified_method434=fully_qualified_method();
			state._fsp--;

			stream_fully_qualified_method.add(fully_qualified_method434.getTree());
			// AST REWRITE
			// elements: register_range, INSTRUCTION_FORMAT3rc_METHOD, fully_qualified_method
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1059:5: -> ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range fully_qualified_method )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1059:8: ^( I_STATEMENT_FORMAT3rc_METHOD[$start, \"I_STATEMENT_FORMAT3rc_METHOD\"] INSTRUCTION_FORMAT3rc_METHOD register_range fully_qualified_method )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT3rc_METHOD, (retval.start), "I_STATEMENT_FORMAT3rc_METHOD"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT3rc_METHOD.nextNode());
				adaptor.addChild(root_1, stream_register_range.nextTree());
				adaptor.addChild(root_1, stream_fully_qualified_method.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format3rc_method"


	public static class insn_format3rc_method_odex_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format3rc_method_odex"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1061:1: insn_format3rc_method_odex : INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method ;
	public final smaliParser.insn_format3rc_method_odex_return insn_format3rc_method_odex() throws RecognitionException {
		smaliParser.insn_format3rc_method_odex_return retval = new smaliParser.insn_format3rc_method_odex_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT3rc_METHOD_ODEX435=null;
		Token OPEN_BRACE436=null;
		Token CLOSE_BRACE438=null;
		Token COMMA439=null;
		ParserRuleReturnScope register_list437 =null;
		ParserRuleReturnScope fully_qualified_method440 =null;

		CommonTree INSTRUCTION_FORMAT3rc_METHOD_ODEX435_tree=null;
		CommonTree OPEN_BRACE436_tree=null;
		CommonTree CLOSE_BRACE438_tree=null;
		CommonTree COMMA439_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1062:3: ( INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1063:5: INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT3rc_METHOD_ODEX435=(Token)match(input,INSTRUCTION_FORMAT3rc_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_insn_format3rc_method_odex5401); 
			INSTRUCTION_FORMAT3rc_METHOD_ODEX435_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT3rc_METHOD_ODEX435);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT3rc_METHOD_ODEX435_tree);

			OPEN_BRACE436=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_method_odex5403); 
			OPEN_BRACE436_tree = (CommonTree)adaptor.create(OPEN_BRACE436);
			adaptor.addChild(root_0, OPEN_BRACE436_tree);

			pushFollow(FOLLOW_register_list_in_insn_format3rc_method_odex5405);
			register_list437=register_list();
			state._fsp--;

			adaptor.addChild(root_0, register_list437.getTree());

			CLOSE_BRACE438=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_method_odex5407); 
			CLOSE_BRACE438_tree = (CommonTree)adaptor.create(CLOSE_BRACE438);
			adaptor.addChild(root_0, CLOSE_BRACE438_tree);

			COMMA439=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_method_odex5409); 
			COMMA439_tree = (CommonTree)adaptor.create(COMMA439);
			adaptor.addChild(root_0, COMMA439_tree);

			pushFollow(FOLLOW_fully_qualified_method_in_insn_format3rc_method_odex5411);
			fully_qualified_method440=fully_qualified_method();
			state._fsp--;

			adaptor.addChild(root_0, fully_qualified_method440.getTree());


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT3rc_METHOD_ODEX435!=null?INSTRUCTION_FORMAT3rc_METHOD_ODEX435.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format3rc_method_odex"


	public static class insn_format3rc_type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format3rc_type"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1068:1: insn_format3rc_type : INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor ) ;
	public final smaliParser.insn_format3rc_type_return insn_format3rc_type() throws RecognitionException {
		smaliParser.insn_format3rc_type_return retval = new smaliParser.insn_format3rc_type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT3rc_TYPE441=null;
		Token OPEN_BRACE442=null;
		Token CLOSE_BRACE444=null;
		Token COMMA445=null;
		ParserRuleReturnScope register_range443 =null;
		ParserRuleReturnScope nonvoid_type_descriptor446 =null;

		CommonTree INSTRUCTION_FORMAT3rc_TYPE441_tree=null;
		CommonTree OPEN_BRACE442_tree=null;
		CommonTree CLOSE_BRACE444_tree=null;
		CommonTree COMMA445_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_OPEN_BRACE=new RewriteRuleTokenStream(adaptor,"token OPEN_BRACE");
		RewriteRuleTokenStream stream_CLOSE_BRACE=new RewriteRuleTokenStream(adaptor,"token CLOSE_BRACE");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT3rc_TYPE=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT3rc_TYPE");
		RewriteRuleSubtreeStream stream_nonvoid_type_descriptor=new RewriteRuleSubtreeStream(adaptor,"rule nonvoid_type_descriptor");
		RewriteRuleSubtreeStream stream_register_range=new RewriteRuleSubtreeStream(adaptor,"rule register_range");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1069:3: ( INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor -> ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1070:5: INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
			{
			INSTRUCTION_FORMAT3rc_TYPE441=(Token)match(input,INSTRUCTION_FORMAT3rc_TYPE,FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_insn_format3rc_type5432);  
			stream_INSTRUCTION_FORMAT3rc_TYPE.add(INSTRUCTION_FORMAT3rc_TYPE441);

			OPEN_BRACE442=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_type5434);  
			stream_OPEN_BRACE.add(OPEN_BRACE442);

			pushFollow(FOLLOW_register_range_in_insn_format3rc_type5436);
			register_range443=register_range();
			state._fsp--;

			stream_register_range.add(register_range443.getTree());
			CLOSE_BRACE444=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_type5438);  
			stream_CLOSE_BRACE.add(CLOSE_BRACE444);

			COMMA445=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_type5440);  
			stream_COMMA.add(COMMA445);

			pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format3rc_type5442);
			nonvoid_type_descriptor446=nonvoid_type_descriptor();
			state._fsp--;

			stream_nonvoid_type_descriptor.add(nonvoid_type_descriptor446.getTree());
			// AST REWRITE
			// elements: register_range, nonvoid_type_descriptor, INSTRUCTION_FORMAT3rc_TYPE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1071:5: -> ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1071:8: ^( I_STATEMENT_FORMAT3rc_TYPE[$start, \"I_STATEMENT_FORMAT3rc_TYPE\"] INSTRUCTION_FORMAT3rc_TYPE register_range nonvoid_type_descriptor )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT3rc_TYPE, (retval.start), "I_STATEMENT_FORMAT3rc_TYPE"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT3rc_TYPE.nextNode());
				adaptor.addChild(root_1, stream_register_range.nextTree());
				adaptor.addChild(root_1, stream_nonvoid_type_descriptor.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format3rc_type"


	public static class insn_format3rmi_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format3rmi_method"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1073:1: insn_format3rmi_method : INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX ;
	public final smaliParser.insn_format3rmi_method_return insn_format3rmi_method() throws RecognitionException {
		smaliParser.insn_format3rmi_method_return retval = new smaliParser.insn_format3rmi_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT3rmi_METHOD447=null;
		Token OPEN_BRACE448=null;
		Token CLOSE_BRACE450=null;
		Token COMMA451=null;
		Token INLINE_INDEX452=null;
		ParserRuleReturnScope register_range449 =null;

		CommonTree INSTRUCTION_FORMAT3rmi_METHOD447_tree=null;
		CommonTree OPEN_BRACE448_tree=null;
		CommonTree CLOSE_BRACE450_tree=null;
		CommonTree COMMA451_tree=null;
		CommonTree INLINE_INDEX452_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1074:3: ( INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1075:5: INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT3rmi_METHOD447=(Token)match(input,INSTRUCTION_FORMAT3rmi_METHOD,FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_insn_format3rmi_method5474); 
			INSTRUCTION_FORMAT3rmi_METHOD447_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT3rmi_METHOD447);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT3rmi_METHOD447_tree);

			OPEN_BRACE448=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rmi_method5476); 
			OPEN_BRACE448_tree = (CommonTree)adaptor.create(OPEN_BRACE448);
			adaptor.addChild(root_0, OPEN_BRACE448_tree);

			pushFollow(FOLLOW_register_range_in_insn_format3rmi_method5478);
			register_range449=register_range();
			state._fsp--;

			adaptor.addChild(root_0, register_range449.getTree());

			CLOSE_BRACE450=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rmi_method5480); 
			CLOSE_BRACE450_tree = (CommonTree)adaptor.create(CLOSE_BRACE450);
			adaptor.addChild(root_0, CLOSE_BRACE450_tree);

			COMMA451=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format3rmi_method5482); 
			COMMA451_tree = (CommonTree)adaptor.create(COMMA451);
			adaptor.addChild(root_0, COMMA451_tree);

			INLINE_INDEX452=(Token)match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_insn_format3rmi_method5484); 
			INLINE_INDEX452_tree = (CommonTree)adaptor.create(INLINE_INDEX452);
			adaptor.addChild(root_0, INLINE_INDEX452_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT3rmi_METHOD447!=null?INSTRUCTION_FORMAT3rmi_METHOD447.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format3rmi_method"


	public static class insn_format3rms_method_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format3rms_method"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1080:1: insn_format3rms_method : INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX ;
	public final smaliParser.insn_format3rms_method_return insn_format3rms_method() throws RecognitionException {
		smaliParser.insn_format3rms_method_return retval = new smaliParser.insn_format3rms_method_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT3rms_METHOD453=null;
		Token OPEN_BRACE454=null;
		Token CLOSE_BRACE456=null;
		Token COMMA457=null;
		Token VTABLE_INDEX458=null;
		ParserRuleReturnScope register_range455 =null;

		CommonTree INSTRUCTION_FORMAT3rms_METHOD453_tree=null;
		CommonTree OPEN_BRACE454_tree=null;
		CommonTree CLOSE_BRACE456_tree=null;
		CommonTree COMMA457_tree=null;
		CommonTree VTABLE_INDEX458_tree=null;

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1081:3: ( INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1082:5: INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX
			{
			root_0 = (CommonTree)adaptor.nil();


			INSTRUCTION_FORMAT3rms_METHOD453=(Token)match(input,INSTRUCTION_FORMAT3rms_METHOD,FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_insn_format3rms_method5505); 
			INSTRUCTION_FORMAT3rms_METHOD453_tree = (CommonTree)adaptor.create(INSTRUCTION_FORMAT3rms_METHOD453);
			adaptor.addChild(root_0, INSTRUCTION_FORMAT3rms_METHOD453_tree);

			OPEN_BRACE454=(Token)match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rms_method5507); 
			OPEN_BRACE454_tree = (CommonTree)adaptor.create(OPEN_BRACE454);
			adaptor.addChild(root_0, OPEN_BRACE454_tree);

			pushFollow(FOLLOW_register_range_in_insn_format3rms_method5509);
			register_range455=register_range();
			state._fsp--;

			adaptor.addChild(root_0, register_range455.getTree());

			CLOSE_BRACE456=(Token)match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rms_method5511); 
			CLOSE_BRACE456_tree = (CommonTree)adaptor.create(CLOSE_BRACE456);
			adaptor.addChild(root_0, CLOSE_BRACE456_tree);

			COMMA457=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format3rms_method5513); 
			COMMA457_tree = (CommonTree)adaptor.create(COMMA457);
			adaptor.addChild(root_0, COMMA457_tree);

			VTABLE_INDEX458=(Token)match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_insn_format3rms_method5515); 
			VTABLE_INDEX458_tree = (CommonTree)adaptor.create(VTABLE_INDEX458);
			adaptor.addChild(root_0, VTABLE_INDEX458_tree);


			      throwOdexedInstructionException(input, (INSTRUCTION_FORMAT3rms_METHOD453!=null?INSTRUCTION_FORMAT3rms_METHOD453.getText():null));
			    
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format3rms_method"


	public static class insn_format51l_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_format51l"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1087:1: insn_format51l : INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal -> ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal ) ;
	public final smaliParser.insn_format51l_return insn_format51l() throws RecognitionException {
		smaliParser.insn_format51l_return retval = new smaliParser.insn_format51l_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INSTRUCTION_FORMAT51l459=null;
		Token REGISTER460=null;
		Token COMMA461=null;
		ParserRuleReturnScope fixed_literal462 =null;

		CommonTree INSTRUCTION_FORMAT51l459_tree=null;
		CommonTree REGISTER460_tree=null;
		CommonTree COMMA461_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_REGISTER=new RewriteRuleTokenStream(adaptor,"token REGISTER");
		RewriteRuleTokenStream stream_INSTRUCTION_FORMAT51l=new RewriteRuleTokenStream(adaptor,"token INSTRUCTION_FORMAT51l");
		RewriteRuleSubtreeStream stream_fixed_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1088:3: ( INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal -> ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1089:5: INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal
			{
			INSTRUCTION_FORMAT51l459=(Token)match(input,INSTRUCTION_FORMAT51l,FOLLOW_INSTRUCTION_FORMAT51l_in_insn_format51l5536);  
			stream_INSTRUCTION_FORMAT51l.add(INSTRUCTION_FORMAT51l459);

			REGISTER460=(Token)match(input,REGISTER,FOLLOW_REGISTER_in_insn_format51l5538);  
			stream_REGISTER.add(REGISTER460);

			COMMA461=(Token)match(input,COMMA,FOLLOW_COMMA_in_insn_format51l5540);  
			stream_COMMA.add(COMMA461);

			pushFollow(FOLLOW_fixed_literal_in_insn_format51l5542);
			fixed_literal462=fixed_literal();
			state._fsp--;

			stream_fixed_literal.add(fixed_literal462.getTree());
			// AST REWRITE
			// elements: REGISTER, fixed_literal, INSTRUCTION_FORMAT51l
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1090:5: -> ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1090:8: ^( I_STATEMENT_FORMAT51l[$start, \"I_STATEMENT_FORMAT51l\"] INSTRUCTION_FORMAT51l REGISTER fixed_literal )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_FORMAT51l, (retval.start), "I_STATEMENT_FORMAT51l"), root_1);
				adaptor.addChild(root_1, stream_INSTRUCTION_FORMAT51l.nextNode());
				adaptor.addChild(root_1, stream_REGISTER.nextNode());
				adaptor.addChild(root_1, stream_fixed_literal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_format51l"


	public static class insn_array_data_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_array_data_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1092:1: insn_array_data_directive : ARRAY_DATA_DIRECTIVE parsed_integer_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE -> ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE parsed_integer_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) ) ;
	public final smaliParser.insn_array_data_directive_return insn_array_data_directive() throws RecognitionException {
		smaliParser.insn_array_data_directive_return retval = new smaliParser.insn_array_data_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ARRAY_DATA_DIRECTIVE463=null;
		Token END_ARRAY_DATA_DIRECTIVE466=null;
		ParserRuleReturnScope parsed_integer_literal464 =null;
		ParserRuleReturnScope fixed_literal465 =null;

		CommonTree ARRAY_DATA_DIRECTIVE463_tree=null;
		CommonTree END_ARRAY_DATA_DIRECTIVE466_tree=null;
		RewriteRuleTokenStream stream_END_ARRAY_DATA_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_ARRAY_DATA_DIRECTIVE");
		RewriteRuleTokenStream stream_ARRAY_DATA_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token ARRAY_DATA_DIRECTIVE");
		RewriteRuleSubtreeStream stream_parsed_integer_literal=new RewriteRuleSubtreeStream(adaptor,"rule parsed_integer_literal");
		RewriteRuleSubtreeStream stream_fixed_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_literal");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1093:3: ( ARRAY_DATA_DIRECTIVE parsed_integer_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE -> ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE parsed_integer_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1093:5: ARRAY_DATA_DIRECTIVE parsed_integer_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE
			{
			ARRAY_DATA_DIRECTIVE463=(Token)match(input,ARRAY_DATA_DIRECTIVE,FOLLOW_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive5569);  
			stream_ARRAY_DATA_DIRECTIVE.add(ARRAY_DATA_DIRECTIVE463);

			pushFollow(FOLLOW_parsed_integer_literal_in_insn_array_data_directive5575);
			parsed_integer_literal464=parsed_integer_literal();
			state._fsp--;

			stream_parsed_integer_literal.add(parsed_integer_literal464.getTree());

			        int elementWidth = (parsed_integer_literal464!=null?((smaliParser.parsed_integer_literal_return)parsed_integer_literal464).value:0);
			        if (elementWidth != 4 && elementWidth != 8 && elementWidth != 1 && elementWidth != 2) {
			            throw new SemanticException(input, (retval.start), "Invalid element width: %d. Must be 1, 2, 4 or 8", elementWidth);
			        }
			    
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1101:5: ( fixed_literal )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( ((LA45_0 >= BOOL_LITERAL && LA45_0 <= BYTE_LITERAL)||LA45_0==CHAR_LITERAL||(LA45_0 >= DOUBLE_LITERAL && LA45_0 <= DOUBLE_LITERAL_OR_ID)||(LA45_0 >= FLOAT_LITERAL && LA45_0 <= FLOAT_LITERAL_OR_ID)||LA45_0==LONG_LITERAL||LA45_0==NEGATIVE_INTEGER_LITERAL||LA45_0==POSITIVE_INTEGER_LITERAL||LA45_0==SHORT_LITERAL) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1101:5: fixed_literal
					{
					pushFollow(FOLLOW_fixed_literal_in_insn_array_data_directive5587);
					fixed_literal465=fixed_literal();
					state._fsp--;

					stream_fixed_literal.add(fixed_literal465.getTree());
					}
					break;

				default :
					break loop45;
				}
			}

			END_ARRAY_DATA_DIRECTIVE466=(Token)match(input,END_ARRAY_DATA_DIRECTIVE,FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive5590);  
			stream_END_ARRAY_DATA_DIRECTIVE.add(END_ARRAY_DATA_DIRECTIVE466);

			// AST REWRITE
			// elements: parsed_integer_literal, fixed_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1103:5: -> ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE parsed_integer_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1103:8: ^( I_STATEMENT_ARRAY_DATA[$start, \"I_STATEMENT_ARRAY_DATA\"] ^( I_ARRAY_ELEMENT_SIZE parsed_integer_literal ) ^( I_ARRAY_ELEMENTS ( fixed_literal )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_ARRAY_DATA, (retval.start), "I_STATEMENT_ARRAY_DATA"), root_1);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1103:67: ^( I_ARRAY_ELEMENT_SIZE parsed_integer_literal )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ARRAY_ELEMENT_SIZE, "I_ARRAY_ELEMENT_SIZE"), root_2);
				adaptor.addChild(root_2, stream_parsed_integer_literal.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1104:8: ^( I_ARRAY_ELEMENTS ( fixed_literal )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_ARRAY_ELEMENTS, "I_ARRAY_ELEMENTS"), root_2);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1104:27: ( fixed_literal )*
				while ( stream_fixed_literal.hasNext() ) {
					adaptor.addChild(root_2, stream_fixed_literal.nextTree());
				}
				stream_fixed_literal.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_array_data_directive"


	public static class insn_packed_switch_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_packed_switch_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1106:1: insn_packed_switch_directive : PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref )* END_PACKED_SWITCH_DIRECTIVE -> ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_ELEMENTS[$start, \"I_PACKED_SWITCH_ELEMENTS\"] ( label_ref )* ) ) ;
	public final smaliParser.insn_packed_switch_directive_return insn_packed_switch_directive() throws RecognitionException {
		smaliParser.insn_packed_switch_directive_return retval = new smaliParser.insn_packed_switch_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token PACKED_SWITCH_DIRECTIVE467=null;
		Token END_PACKED_SWITCH_DIRECTIVE470=null;
		ParserRuleReturnScope fixed_32bit_literal468 =null;
		ParserRuleReturnScope label_ref469 =null;

		CommonTree PACKED_SWITCH_DIRECTIVE467_tree=null;
		CommonTree END_PACKED_SWITCH_DIRECTIVE470_tree=null;
		RewriteRuleTokenStream stream_END_PACKED_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_PACKED_SWITCH_DIRECTIVE");
		RewriteRuleTokenStream stream_PACKED_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token PACKED_SWITCH_DIRECTIVE");
		RewriteRuleSubtreeStream stream_fixed_32bit_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_32bit_literal");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1107:5: ( PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref )* END_PACKED_SWITCH_DIRECTIVE -> ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_ELEMENTS[$start, \"I_PACKED_SWITCH_ELEMENTS\"] ( label_ref )* ) ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1107:9: PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref )* END_PACKED_SWITCH_DIRECTIVE
			{
			PACKED_SWITCH_DIRECTIVE467=(Token)match(input,PACKED_SWITCH_DIRECTIVE,FOLLOW_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive5636);  
			stream_PACKED_SWITCH_DIRECTIVE.add(PACKED_SWITCH_DIRECTIVE467);

			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_packed_switch_directive5642);
			fixed_32bit_literal468=fixed_32bit_literal();
			state._fsp--;

			stream_fixed_32bit_literal.add(fixed_32bit_literal468.getTree());
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1109:5: ( label_ref )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==COLON) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1109:5: label_ref
					{
					pushFollow(FOLLOW_label_ref_in_insn_packed_switch_directive5648);
					label_ref469=label_ref();
					state._fsp--;

					stream_label_ref.add(label_ref469.getTree());
					}
					break;

				default :
					break loop46;
				}
			}

			END_PACKED_SWITCH_DIRECTIVE470=(Token)match(input,END_PACKED_SWITCH_DIRECTIVE,FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive5655);  
			stream_END_PACKED_SWITCH_DIRECTIVE.add(END_PACKED_SWITCH_DIRECTIVE470);

			// AST REWRITE
			// elements: label_ref, fixed_32bit_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1111:5: -> ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_ELEMENTS[$start, \"I_PACKED_SWITCH_ELEMENTS\"] ( label_ref )* ) )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1111:8: ^( I_STATEMENT_PACKED_SWITCH[$start, \"I_STATEMENT_PACKED_SWITCH\"] ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal ) ^( I_PACKED_SWITCH_ELEMENTS[$start, \"I_PACKED_SWITCH_ELEMENTS\"] ( label_ref )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_PACKED_SWITCH, (retval.start), "I_STATEMENT_PACKED_SWITCH"), root_1);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1112:10: ^( I_PACKED_SWITCH_START_KEY[$start, \"I_PACKED_SWITCH_START_KEY\"] fixed_32bit_literal )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PACKED_SWITCH_START_KEY, (retval.start), "I_PACKED_SWITCH_START_KEY"), root_2);
				adaptor.addChild(root_2, stream_fixed_32bit_literal.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1113:10: ^( I_PACKED_SWITCH_ELEMENTS[$start, \"I_PACKED_SWITCH_ELEMENTS\"] ( label_ref )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_PACKED_SWITCH_ELEMENTS, (retval.start), "I_PACKED_SWITCH_ELEMENTS"), root_2);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1114:11: ( label_ref )*
				while ( stream_label_ref.hasNext() ) {
					adaptor.addChild(root_2, stream_label_ref.nextTree());
				}
				stream_label_ref.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_packed_switch_directive"


	public static class insn_sparse_switch_directive_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "insn_sparse_switch_directive"
	// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1117:1: insn_sparse_switch_directive : SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref )* END_SPARSE_SWITCH_DIRECTIVE -> ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] ^( I_SPARSE_SWITCH_ELEMENTS[$start, \"I_SPARSE_SWITCH_ELEMENTS\"] ( fixed_32bit_literal label_ref )* ) ) ;
	public final smaliParser.insn_sparse_switch_directive_return insn_sparse_switch_directive() throws RecognitionException {
		smaliParser.insn_sparse_switch_directive_return retval = new smaliParser.insn_sparse_switch_directive_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SPARSE_SWITCH_DIRECTIVE471=null;
		Token ARROW473=null;
		Token END_SPARSE_SWITCH_DIRECTIVE475=null;
		ParserRuleReturnScope fixed_32bit_literal472 =null;
		ParserRuleReturnScope label_ref474 =null;

		CommonTree SPARSE_SWITCH_DIRECTIVE471_tree=null;
		CommonTree ARROW473_tree=null;
		CommonTree END_SPARSE_SWITCH_DIRECTIVE475_tree=null;
		RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
		RewriteRuleTokenStream stream_SPARSE_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token SPARSE_SWITCH_DIRECTIVE");
		RewriteRuleTokenStream stream_END_SPARSE_SWITCH_DIRECTIVE=new RewriteRuleTokenStream(adaptor,"token END_SPARSE_SWITCH_DIRECTIVE");
		RewriteRuleSubtreeStream stream_fixed_32bit_literal=new RewriteRuleSubtreeStream(adaptor,"rule fixed_32bit_literal");
		RewriteRuleSubtreeStream stream_label_ref=new RewriteRuleSubtreeStream(adaptor,"rule label_ref");

		try {
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1118:3: ( SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref )* END_SPARSE_SWITCH_DIRECTIVE -> ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] ^( I_SPARSE_SWITCH_ELEMENTS[$start, \"I_SPARSE_SWITCH_ELEMENTS\"] ( fixed_32bit_literal label_ref )* ) ) )
			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1118:7: SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref )* END_SPARSE_SWITCH_DIRECTIVE
			{
			SPARSE_SWITCH_DIRECTIVE471=(Token)match(input,SPARSE_SWITCH_DIRECTIVE,FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive5729);  
			stream_SPARSE_SWITCH_DIRECTIVE.add(SPARSE_SWITCH_DIRECTIVE471);

			// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1119:5: ( fixed_32bit_literal ARROW label_ref )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( ((LA47_0 >= BOOL_LITERAL && LA47_0 <= BYTE_LITERAL)||LA47_0==CHAR_LITERAL||(LA47_0 >= FLOAT_LITERAL && LA47_0 <= FLOAT_LITERAL_OR_ID)||LA47_0==LONG_LITERAL||LA47_0==NEGATIVE_INTEGER_LITERAL||LA47_0==POSITIVE_INTEGER_LITERAL||LA47_0==SHORT_LITERAL) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1119:6: fixed_32bit_literal ARROW label_ref
					{
					pushFollow(FOLLOW_fixed_32bit_literal_in_insn_sparse_switch_directive5736);
					fixed_32bit_literal472=fixed_32bit_literal();
					state._fsp--;

					stream_fixed_32bit_literal.add(fixed_32bit_literal472.getTree());
					ARROW473=(Token)match(input,ARROW,FOLLOW_ARROW_in_insn_sparse_switch_directive5738);  
					stream_ARROW.add(ARROW473);

					pushFollow(FOLLOW_label_ref_in_insn_sparse_switch_directive5740);
					label_ref474=label_ref();
					state._fsp--;

					stream_label_ref.add(label_ref474.getTree());
					}
					break;

				default :
					break loop47;
				}
			}

			END_SPARSE_SWITCH_DIRECTIVE475=(Token)match(input,END_SPARSE_SWITCH_DIRECTIVE,FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive5748);  
			stream_END_SPARSE_SWITCH_DIRECTIVE.add(END_SPARSE_SWITCH_DIRECTIVE475);

			// AST REWRITE
			// elements: label_ref, fixed_32bit_literal
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 1121:5: -> ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] ^( I_SPARSE_SWITCH_ELEMENTS[$start, \"I_SPARSE_SWITCH_ELEMENTS\"] ( fixed_32bit_literal label_ref )* ) )
			{
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1121:8: ^( I_STATEMENT_SPARSE_SWITCH[$start, \"I_STATEMENT_SPARSE_SWITCH\"] ^( I_SPARSE_SWITCH_ELEMENTS[$start, \"I_SPARSE_SWITCH_ELEMENTS\"] ( fixed_32bit_literal label_ref )* ) )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_STATEMENT_SPARSE_SWITCH, (retval.start), "I_STATEMENT_SPARSE_SWITCH"), root_1);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1122:8: ^( I_SPARSE_SWITCH_ELEMENTS[$start, \"I_SPARSE_SWITCH_ELEMENTS\"] ( fixed_32bit_literal label_ref )* )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(I_SPARSE_SWITCH_ELEMENTS, (retval.start), "I_SPARSE_SWITCH_ELEMENTS"), root_2);
				// D:\\decomplier_tools\\smali\\smali\\smali\\src\\main\\antlr3\\smaliParser.g:1122:71: ( fixed_32bit_literal label_ref )*
				while ( stream_label_ref.hasNext()||stream_fixed_32bit_literal.hasNext() ) {
					adaptor.addChild(root_2, stream_fixed_32bit_literal.nextTree());
					adaptor.addChild(root_2, stream_label_ref.nextTree());
				}
				stream_label_ref.reset();
				stream_fixed_32bit_literal.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insn_sparse_switch_directive"

	// Delegated rules


	protected DFA33 dfa33 = new DFA33(this);
	static final String DFA33_eotS =
		"\101\uffff";
	static final String DFA33_eofS =
		"\101\uffff";
	static final String DFA33_minS =
		"\1\5\76\uffff\1\0\1\uffff";
	static final String DFA33_maxS =
		"\1\u00cf\76\uffff\1\0\1\uffff";
	static final String DFA33_acceptS =
		"\1\uffff\1\2\76\uffff\1\1";
	static final String DFA33_specialS =
		"\77\uffff\1\0\1\uffff}>";
	static final String[] DFA33_transitionS = {
			"\1\77\1\uffff\1\1\17\uffff\2\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\3"+
			"\uffff\1\1\13\uffff\54\1\122\uffff\3\1\7\uffff\2\1\4\uffff\1\1\1\uffff"+
			"\2\1\2\uffff\2\1",
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
			"",
			"",
			"\1\uffff",
			""
	};

	static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
	static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
	static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
	static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
	static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
	static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
	static final short[][] DFA33_transition;

	static {
		int numStates = DFA33_transitionS.length;
		DFA33_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
		}
	}

	protected class DFA33 extends DFA {

		public DFA33(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 33;
			this.eot = DFA33_eot;
			this.eof = DFA33_eof;
			this.min = DFA33_min;
			this.max = DFA33_max;
			this.accept = DFA33_accept;
			this.special = DFA33_special;
			this.transition = DFA33_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 749:5: ({...}? annotation )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA33_63 = input.LA(1);
						 
						int index33_63 = input.index();
						input.rewind();
						s = -1;
						if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {s = 64;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index33_63);
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 33, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_class_spec_in_smali_file1145 = new BitSet(new long[]{0x0102000008000020L,0x0000000000000000L,0x2000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_super_spec_in_smali_file1156 = new BitSet(new long[]{0x0102000008000020L,0x0000000000000000L,0x2000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_implements_spec_in_smali_file1164 = new BitSet(new long[]{0x0102000008000020L,0x0000000000000000L,0x2000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_source_spec_in_smali_file1173 = new BitSet(new long[]{0x0102000008000020L,0x0000000000000000L,0x2000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_method_in_smali_file1181 = new BitSet(new long[]{0x0102000008000020L,0x0000000000000000L,0x2000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_field_in_smali_file1187 = new BitSet(new long[]{0x0102000008000020L,0x0000000000000000L,0x2000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_annotation_in_smali_file1193 = new BitSet(new long[]{0x0102000008000020L,0x0000000000000000L,0x2000000000000000L,0x0000000000044000L});
	public static final BitSet FOLLOW_EOF_in_smali_file1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_DIRECTIVE_in_class_spec1291 = new BitSet(new long[]{0x0000000004000010L});
	public static final BitSet FOLLOW_access_list_in_class_spec1293 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_class_spec1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_DIRECTIVE_in_super_spec1313 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_super_spec1315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec1334 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_implements_spec1336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_spec1355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_source_spec1357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCESS_SPEC_in_access_list1376 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_FIELD_DIRECTIVE_in_field1407 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0xD000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_access_list_in_field1409 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0xD000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_member_name_in_field1411 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_field1413 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_field1415 = new BitSet(new long[]{0x0000804000000022L});
	public static final BitSet FOLLOW_EQUAL_in_field1418 = new BitSet(new long[]{0x0018200C06600100L,0x0000000000000000L,0xC800000000000000L,0x00000000001310C1L});
	public static final BitSet FOLLOW_literal_in_field1420 = new BitSet(new long[]{0x0000004000000022L});
	public static final BitSet FOLLOW_annotation_in_field1433 = new BitSet(new long[]{0x0000004000000022L});
	public static final BitSet FOLLOW_END_FIELD_DIRECTIVE_in_field1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DIRECTIVE_in_method1558 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0xD000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_access_list_in_method1560 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0xD000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_member_name_in_method1562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_method_prototype_in_method1564 = new BitSet(new long[]{0xFC004180418000A0L,0x0000003FFFFFFFFFL,0x0700000000000000L,0x000000000000CD0CL});
	public static final BitSet FOLLOW_statements_and_directives_in_method1566 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_END_METHOD_DIRECTIVE_in_method1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ordered_method_item_in_statements_and_directives1617 = new BitSet(new long[]{0xFC004080418000A2L,0x0000003FFFFFFFFFL,0x0700000000000000L,0x000000000000CD0CL});
	public static final BitSet FOLLOW_registers_directive_in_statements_and_directives1625 = new BitSet(new long[]{0xFC004080418000A2L,0x0000003FFFFFFFFFL,0x0700000000000000L,0x000000000000CD0CL});
	public static final BitSet FOLLOW_catch_directive_in_statements_and_directives1633 = new BitSet(new long[]{0xFC004080418000A2L,0x0000003FFFFFFFFFL,0x0700000000000000L,0x000000000000CD0CL});
	public static final BitSet FOLLOW_catchall_directive_in_statements_and_directives1641 = new BitSet(new long[]{0xFC004080418000A2L,0x0000003FFFFFFFFFL,0x0700000000000000L,0x000000000000CD0CL});
	public static final BitSet FOLLOW_parameter_directive_in_statements_and_directives1649 = new BitSet(new long[]{0xFC004080418000A2L,0x0000003FFFFFFFFFL,0x0700000000000000L,0x000000000000CD0CL});
	public static final BitSet FOLLOW_annotation_in_statements_and_directives1657 = new BitSet(new long[]{0xFC004080418000A2L,0x0000003FFFFFFFFFL,0x0700000000000000L,0x000000000000CD0CL});
	public static final BitSet FOLLOW_label_in_ordered_method_item1742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_ordered_method_item1748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_debug_directive_in_ordered_method_item1754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive1774 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_registers_directive1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCALS_DIRECTIVE_in_registers_directive1798 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_registers_directive1802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIMPLE_NAME_in_simple_name1836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCESS_SPEC_in_simple_name1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERIFICATION_ERROR_TYPE_in_simple_name1853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POSITIVE_INTEGER_LITERAL_in_simple_name1864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_simple_name1875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_LITERAL_OR_ID_in_simple_name1886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_LITERAL_OR_ID_in_simple_name1897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LITERAL_in_simple_name1908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_LITERAL_in_simple_name1919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_simple_name1930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_LIST_OR_ID_in_simple_name1941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_simple_name1952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_TYPE_in_simple_name1963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNOTATION_VISIBILITY_in_simple_name1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10t_in_simple_name1985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_in_simple_name1996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_simple_name2007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT11x_in_simple_name2018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_simple_name2029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_simple_name2040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_simple_name2051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_simple_name2062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_simple_name2073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21t_in_simple_name2084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_simple_name2095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_simple_name2106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_simple_name2117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_simple_name2128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_simple_name2139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22t_in_simple_name2150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT23x_in_simple_name2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_simple_name2172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31t_in_simple_name2183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_simple_name2194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_simple_name2205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_simple_name2216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_simple_name2227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_simple_name2238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT51l_in_simple_name2249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_member_name2264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MEMBER_NAME_in_member_name2270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_PAREN_in_method_prototype2285 = new BitSet(new long[]{0x0000000024000100L,0x0000000000000000L,0x0000000000000000L,0x00000000000000B0L});
	public static final BitSet FOLLOW_param_list_in_method_prototype2287 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_CLOSE_PAREN_in_method_prototype2289 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000100080L});
	public static final BitSet FOLLOW_type_descriptor_in_method_prototype2291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_LIST_in_param_list2321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_LIST_OR_ID_in_param_list2331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_param_list2341 = new BitSet(new long[]{0x0000000004000102L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_POSITIVE_INTEGER_LITERAL_in_integer_literal2418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_integer_literal2429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_LITERAL_OR_ID_in_float_literal2444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_LITERAL_in_float_literal2455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_LITERAL_OR_ID_in_double_literal2465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_LITERAL_in_double_literal2476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_literal2486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_literal2492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_literal2498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_literal2504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_literal_in_literal2510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_double_literal_in_literal2516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_literal2522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_literal2528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LITERAL_in_literal2534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_LITERAL_in_literal2540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_literal_in_literal2546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subannotation_in_literal2552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_field_method_literal_in_literal2558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_literal_in_literal2564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_parsed_integer_literal2577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_integral_literal2589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_integral_literal2595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_integral_literal2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_integral_literal2607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_integral_literal2613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_32bit_literal2623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_fixed_32bit_literal2629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal2635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal2641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_literal_in_fixed_32bit_literal2647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal2653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal2659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_fixed_literal2669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_literal2675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_literal2681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_literal2687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_literal_in_fixed_literal2693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_double_literal_in_fixed_literal2699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_literal2705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_literal2711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_array_literal2721 = new BitSet(new long[]{0x0018200C16600100L,0x0000000000000000L,0xC800000000000000L,0x00000000001310C1L});
	public static final BitSet FOLLOW_literal_in_array_literal2724 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_COMMA_in_array_literal2727 = new BitSet(new long[]{0x0018200C06600100L,0x0000000000000000L,0xC800000000000000L,0x00000000001310C1L});
	public static final BitSet FOLLOW_literal_in_array_literal2729 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_array_literal2737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_annotation_element2761 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_EQUAL_in_annotation_element2763 = new BitSet(new long[]{0x0018200C06600100L,0x0000000000000000L,0xC800000000000000L,0x00000000001310C1L});
	public static final BitSet FOLLOW_literal_in_annotation_element2765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_annotation2790 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ANNOTATION_VISIBILITY_in_annotation2792 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_annotation2794 = new BitSet(new long[]{0x5C10001800200050L,0x00000020FB16F479L,0xC000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_annotation_element_in_annotation2800 = new BitSet(new long[]{0x5C10001800200050L,0x00000020FB16F479L,0xC000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation2803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation2836 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_subannotation2838 = new BitSet(new long[]{0x5C10100800200050L,0x00000020FB16F479L,0xC000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_annotation_element_in_subannotation2840 = new BitSet(new long[]{0x5C10100800200050L,0x00000020FB16F479L,0xC000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation2843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENUM_DIRECTIVE_in_enum_literal2869 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal2871 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_enum_literal2873 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0xC000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_simple_name_in_enum_literal2875 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_enum_literal2877 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal2879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_type_field_method_literal2903 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ARROW_in_type_field_method_literal2911 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0xD000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_member_name_in_type_field_method_literal2921 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_type_field_method_literal2923 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal2925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_member_name_in_type_field_method_literal2947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_method_prototype_in_type_field_method_literal2949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal2991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_TYPE_in_type_field_method_literal2997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_method3007 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_fully_qualified_method3009 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0xD000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_member_name_in_fully_qualified_method3011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_method_prototype_in_fully_qualified_method3013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_field3033 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_fully_qualified_field3035 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0xD000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_member_name_in_fully_qualified_field3037 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_fully_qualified_field3039 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field3041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_label3061 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0xC000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_simple_name_in_label3063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_label_ref3082 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0xC000000000000000L,0x00000000001822E0L});
	public static final BitSet FOLLOW_simple_name_in_label_ref3084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_register_list3098 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_register_list3101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_register_list3103 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_REGISTER_in_register_range3138 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_DOTDOT_in_register_range3141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_register_range3145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference3174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_field_in_verification_error_reference3178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_method_in_verification_error_reference3182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CATCH_DIRECTIVE_in_catch_directive3192 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_catch_directive3194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_catch_directive3196 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_catch_directive3200 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_DOTDOT_in_catch_directive3202 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_catch_directive3206 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_catch_directive3208 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_catch_directive3212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive3244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_catchall_directive3246 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_catchall_directive3250 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_DOTDOT_in_catchall_directive3252 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_catchall_directive3256 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_catchall_directive3258 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_catchall_directive3262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive3301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_parameter_directive3303 = new BitSet(new long[]{0x0000040080000022L});
	public static final BitSet FOLLOW_COMMA_in_parameter_directive3306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_parameter_directive3308 = new BitSet(new long[]{0x0000040000000022L});
	public static final BitSet FOLLOW_annotation_in_parameter_directive3319 = new BitSet(new long[]{0x0000040000000022L});
	public static final BitSet FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive3332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_directive_in_debug_directive3405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_local_directive_in_debug_directive3411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_end_local_directive_in_debug_directive3417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restart_local_directive_in_debug_directive3423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prologue_directive_in_debug_directive3429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_epilogue_directive_in_debug_directive3435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_source_directive_in_debug_directive3441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINE_DIRECTIVE_in_line_directive3451 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_line_directive3453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCAL_DIRECTIVE_in_local_directive3476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_local_directive3478 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_local_directive3481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_NULL_LITERAL_in_local_directive3484 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_local_directive3490 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_local_directive3493 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000100080L});
	public static final BitSet FOLLOW_VOID_TYPE_in_local_directive3496 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_local_directive3500 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_local_directive3534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_local_directive3538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive3580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_end_local_directive3582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive3605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_restart_local_directive3607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive3630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive3651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_directive3672 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_source_directive3674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT12x_in_instruction_format12x3699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT12x_OR_ID_in_instruction_format12x3705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22s_in_instruction_format22s3720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22s_OR_ID_in_instruction_format22s3726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31i_in_instruction_format31i3741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31i_OR_ID_in_instruction_format31i3747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format10t_in_instruction3764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format10x_in_instruction3770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format10x_odex_in_instruction3776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format11n_in_instruction3782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format11x_in_instruction3788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format12x_in_instruction3794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format20bc_in_instruction3800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format20t_in_instruction3806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_field_in_instruction3812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_field_odex_in_instruction3818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_string_in_instruction3824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_type_in_instruction3830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21ih_in_instruction3836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21lh_in_instruction3842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21s_in_instruction3848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21t_in_instruction3854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22b_in_instruction3860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22c_field_in_instruction3866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22c_field_odex_in_instruction3872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22c_type_in_instruction3878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22cs_field_in_instruction3884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22s_in_instruction3890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22t_in_instruction3896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22x_in_instruction3902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format23x_in_instruction3908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format30t_in_instruction3914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format31c_in_instruction3920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format31i_in_instruction3926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format31t_in_instruction3932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format32x_in_instruction3938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35c_method_in_instruction3944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35c_type_in_instruction3950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35c_method_odex_in_instruction3956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35mi_method_in_instruction3962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35ms_method_in_instruction3968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rc_method_in_instruction3974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rc_method_odex_in_instruction3980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rc_type_in_instruction3986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rmi_method_in_instruction3992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rms_method_in_instruction3998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format51l_in_instruction4004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_array_data_directive_in_instruction4010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_packed_switch_directive_in_instruction4016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_sparse_switch_directive_in_instruction4022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10t_in_insn_format10t4042 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format10t4044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_in_insn_format10x4074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_insn_format10x_odex4102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT11n_in_insn_format11n4123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format11n4125 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format11n4127 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format11n4129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT11x_in_insn_format11x4161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format11x4163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_format12x_in_insn_format12x4193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format12x4195 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format12x4197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format12x4199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT20bc_in_insn_format20bc4231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_VERIFICATION_ERROR_TYPE_in_insn_format20bc4233 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format20bc4235 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_verification_error_reference_in_insn_format20bc4237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT20t_in_insn_format20t4274 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format20t4276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_insn_format21c_field4306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_field4308 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_field4310 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_field_in_insn_format21c_field4312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_insn_format21c_field_odex4344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_field_odex4346 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_field_odex4348 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_field_in_insn_format21c_field_odex4350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_insn_format21c_string4388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_string4390 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_string4392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_insn_format21c_string4394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_insn_format21c_type4426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_type4428 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_type4430 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format21c_type4432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21ih_in_insn_format21ih4464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21ih4466 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21ih4468 = new BitSet(new long[]{0x0018000002600000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_format21ih4470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21lh_in_insn_format21lh4502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21lh4504 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21lh4506 = new BitSet(new long[]{0x0018000002600000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_format21lh4508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21s_in_insn_format21s4540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21s4542 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21s4544 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format21s4546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21t_in_insn_format21t4578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21t4580 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21t4582 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format21t4584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22b_in_insn_format22b4616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22b4618 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22b4620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22b4622 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22b4624 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format22b4626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_insn_format22c_field4660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field4662 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field4664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field4666 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field4668 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_field_in_insn_format22c_field4670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_insn_format22c_field_odex4704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field_odex4706 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field_odex4708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field_odex4710 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field_odex4712 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_field_in_insn_format22c_field_odex4714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_insn_format22c_type4754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_type4756 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_type4758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_type4760 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_type4762 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format22c_type4764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_insn_format22cs_field4798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22cs_field4800 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22cs_field4802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22cs_field4804 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22cs_field4806 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_FIELD_OFFSET_in_insn_format22cs_field4808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_format22s_in_insn_format22s4829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22s4831 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22s4833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22s4835 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22s4837 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format22s4839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22t_in_insn_format22t4873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22t4875 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22t4877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22t4879 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22t4881 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format22t4883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22x_in_insn_format22x4917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22x4919 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22x4921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22x4923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT23x_in_insn_format23x4955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format23x4957 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format23x4959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format23x4961 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format23x4963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format23x4965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT30t_in_insn_format30t4999 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format30t5001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31c_in_insn_format31c5031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format31c5033 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format31c5035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_insn_format31c5037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_format31i_in_insn_format31i5068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format31i5070 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format31i5072 = new BitSet(new long[]{0x0018000002600000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_format31i5074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31t_in_insn_format31t5106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format31t5108 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format31t5110 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_insn_format31t5112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT32x_in_insn_format32x5144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format32x5146 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format32x5148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format32x5150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_insn_format35c_method5182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_method5184 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format35c_method5186 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_method5188 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35c_method5190 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_method_in_insn_format35c_method5192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_insn_format35c_type5224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_type5226 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format35c_type5228 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_type5230 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35c_type5232 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format35c_type5234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_insn_format35c_method_odex5266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_method_odex5268 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format35c_method_odex5270 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_method_odex5272 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35c_method_odex5274 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_method_in_insn_format35c_method_odex5276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_insn_format35mi_method5297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35mi_method5299 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format35mi_method5301 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35mi_method5303 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35mi_method5305 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_INLINE_INDEX_in_insn_format35mi_method5307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_insn_format35ms_method5328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35ms_method5330 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format35ms_method5332 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35ms_method5334 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35ms_method5336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_VTABLE_INDEX_in_insn_format35ms_method5338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_insn_format3rc_method5359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_method5361 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rc_method5363 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_method5365 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rc_method5367 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_method_in_insn_format3rc_method5369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_insn_format3rc_method_odex5401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_method_odex5403 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_list_in_insn_format3rc_method_odex5405 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_method_odex5407 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rc_method_odex5409 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_method_in_insn_format3rc_method_odex5411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_insn_format3rc_type5432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_type5434 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rc_type5436 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_type5438 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rc_type5440 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format3rc_type5442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_insn_format3rmi_method5474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rmi_method5476 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rmi_method5478 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rmi_method5480 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rmi_method5482 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_INLINE_INDEX_in_insn_format3rmi_method5484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_insn_format3rms_method5505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rms_method5507 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rms_method5509 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rms_method5511 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rms_method5513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_VTABLE_INDEX_in_insn_format3rms_method5515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT51l_in_insn_format51l5536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format51l5538 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format51l5540 = new BitSet(new long[]{0x0018000C02600000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_literal_in_insn_format51l5542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive5569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_parsed_integer_literal_in_insn_array_data_directive5575 = new BitSet(new long[]{0x0018002C02600000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_literal_in_insn_array_data_directive5587 = new BitSet(new long[]{0x0018002C02600000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive5590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive5636 = new BitSet(new long[]{0x0018000002600000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_packed_switch_directive5642 = new BitSet(new long[]{0x0000020040000000L});
	public static final BitSet FOLLOW_label_ref_in_insn_packed_switch_directive5648 = new BitSet(new long[]{0x0000020040000000L});
	public static final BitSet FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive5655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive5729 = new BitSet(new long[]{0x0018080002600000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_sparse_switch_directive5736 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_insn_sparse_switch_directive5738 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_label_ref_in_insn_sparse_switch_directive5740 = new BitSet(new long[]{0x0018080002600000L,0x0000000000000000L,0x4800000000000000L,0x0000000000001040L});
	public static final BitSet FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive5748 = new BitSet(new long[]{0x0000000000000002L});
}
