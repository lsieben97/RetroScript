// Generated from C:/Users/Luc/workspace/vNES/src/com/lsieben/vnes/parser\vNES.g4 by ANTLR 4.7
package com.lsieben.vnes.parser.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class vNESParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FunctionalEntityModifier=6, NativeEntityModifier=7, 
		EntityDataType=8, Colon=9, Function=10, NumberDataType=11, Comma=12, ReturnKeyword=13, 
		End=14, Define=15, OpenBracket=16, CloseBracket=17, WS=18, INT=19, Quotes=20, 
		Equals=21, NL=22, StringLiteral=23, Use=24, ID=25, Addition=26, Minus=27, 
		Times=28, Devision=29;
	public static final int
		RULE_comment = 0, RULE_docComment = 1, RULE_entityModifier = 2, RULE_rest_of_line = 3, 
		RULE_datatype = 4, RULE_program = 5, RULE_module = 6, RULE_moduleDefinition = 7, 
		RULE_useStatement = 8, RULE_entity = 9, RULE_entityDefinition = 10, RULE_functionDefinition = 11, 
		RULE_functionDefinitionArgumentList = 12, RULE_definitionArgumentSpec = 13, 
		RULE_endClause = 14, RULE_statement = 15, RULE_returnStatement = 16, RULE_functionBody = 17, 
		RULE_function = 18, RULE_entityBody = 19, RULE_entityComponent = 20, RULE_property = 21, 
		RULE_propertyModifier = 22, RULE_assignment = 23, RULE_methodCall = 24, 
		RULE_argumentSpec = 25, RULE_arithmeticOperator = 26, RULE_expression = 27, 
		RULE_expressionComponent = 28, RULE_atom = 29, RULE_add = 30;
	public static final String[] ruleNames = {
		"comment", "docComment", "entityModifier", "rest_of_line", "datatype", 
		"program", "module", "moduleDefinition", "useStatement", "entity", "entityDefinition", 
		"functionDefinition", "functionDefinitionArgumentList", "definitionArgumentSpec", 
		"endClause", "statement", "returnStatement", "functionBody", "function", 
		"entityBody", "entityComponent", "property", "propertyModifier", "assignment", 
		"methodCall", "argumentSpec", "arithmeticOperator", "expression", "expressionComponent", 
		"atom", "add"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'###'", "'STRING'", "'MODULE'", "'MANDETORY'", "'FUNCTIONAL'", 
		"'NATIVE'", "'ENTITY'", "':'", "'FUNCTION'", "'NUMBER'", "','", "'RETURN'", 
		"'END'", "'DEF'", "'('", "')'", null, null, "'\"'", "'='", null, null, 
		"'USE'", null, "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "FunctionalEntityModifier", "NativeEntityModifier", 
		"EntityDataType", "Colon", "Function", "NumberDataType", "Comma", "ReturnKeyword", 
		"End", "Define", "OpenBracket", "CloseBracket", "WS", "INT", "Quotes", 
		"Equals", "NL", "StringLiteral", "Use", "ID", "Addition", "Minus", "Times", 
		"Devision"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "vNES.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public vNESParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommentContext extends ParserRuleContext {
		public Rest_of_lineContext rest_of_line() {
			return getRuleContext(Rest_of_lineContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(63);
			rest_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocCommentContext extends ParserRuleContext {
		public Rest_of_lineContext rest_of_line() {
			return getRuleContext(Rest_of_lineContext.class,0);
		}
		public DocCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterDocComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitDocComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitDocComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocCommentContext docComment() throws RecognitionException {
		DocCommentContext _localctx = new DocCommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_docComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__1);
			setState(66);
			rest_of_line();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityModifierContext extends ParserRuleContext {
		public TerminalNode FunctionalEntityModifier() { return getToken(vNESParser.FunctionalEntityModifier, 0); }
		public TerminalNode NativeEntityModifier() { return getToken(vNESParser.NativeEntityModifier, 0); }
		public EntityModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterEntityModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitEntityModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitEntityModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityModifierContext entityModifier() throws RecognitionException {
		EntityModifierContext _localctx = new EntityModifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entityModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==FunctionalEntityModifier || _la==NativeEntityModifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rest_of_lineContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(vNESParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(vNESParser.NL, i);
		}
		public Rest_of_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest_of_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterRest_of_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitRest_of_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitRest_of_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rest_of_lineContext rest_of_line() throws RecognitionException {
		Rest_of_lineContext _localctx = new Rest_of_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rest_of_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==NL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode EntityDataType() { return getToken(vNESParser.EntityDataType, 0); }
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << EntityDataType) | (1L << NumberDataType) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ModuleContext> module() {
			return getRuleContexts(ModuleContext.class);
		}
		public ModuleContext module(int i) {
			return getRuleContext(ModuleContext.class,i);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public List<UseStatementContext> useStatement() {
			return getRuleContexts(UseStatementContext.class);
		}
		public UseStatementContext useStatement(int i) {
			return getRuleContext(UseStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(93);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(79); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(78);
							module();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(81); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case 2:
					{
					setState(84); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(83);
							entity();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(86); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case 3:
					{
					setState(89); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(88);
							useStatement();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(91); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Define) | (1L << Use))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public ModuleDefinitionContext moduleDefinition() {
			return getRuleContext(ModuleDefinitionContext.class,0);
		}
		public EndClauseContext endClause() {
			return getRuleContext(EndClauseContext.class,0);
		}
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			moduleDefinition();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==Define) {
				{
				{
				setState(98);
				entity();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			endClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleDefinitionContext extends ParserRuleContext {
		public TerminalNode Define() { return getToken(vNESParser.Define, 0); }
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public ModuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterModuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitModuleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitModuleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleDefinitionContext moduleDefinition() throws RecognitionException {
		ModuleDefinitionContext _localctx = new ModuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_moduleDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(Define);
			setState(107);
			match(T__3);
			setState(108);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public UseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterUseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitUseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitUseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStatementContext useStatement() throws RecognitionException {
		UseStatementContext _localctx = new UseStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(Use);
			setState(111);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityContext extends ParserRuleContext {
		public EntityDefinitionContext entityDefinition() {
			return getRuleContext(EntityDefinitionContext.class,0);
		}
		public EntityBodyContext entityBody() {
			return getRuleContext(EntityBodyContext.class,0);
		}
		public EndClauseContext endClause() {
			return getRuleContext(EndClauseContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(113);
				comment();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			entityDefinition();
			setState(120);
			entityBody();
			setState(121);
			endClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityDefinitionContext extends ParserRuleContext {
		public TerminalNode Define() { return getToken(vNESParser.Define, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Colon() { return getToken(vNESParser.Colon, 0); }
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public List<EntityModifierContext> entityModifier() {
			return getRuleContexts(EntityModifierContext.class);
		}
		public EntityModifierContext entityModifier(int i) {
			return getRuleContext(EntityModifierContext.class,i);
		}
		public EntityDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterEntityDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitEntityDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitEntityDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityDefinitionContext entityDefinition() throws RecognitionException {
		EntityDefinitionContext _localctx = new EntityDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_entityDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(Define);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FunctionalEntityModifier || _la==NativeEntityModifier) {
				{
				{
				setState(124);
				entityModifier();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			datatype();
			setState(131);
			match(Colon);
			setState(132);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode Define() { return getToken(vNESParser.Define, 0); }
		public TerminalNode Function() { return getToken(vNESParser.Function, 0); }
		public List<TerminalNode> Colon() { return getTokens(vNESParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(vNESParser.Colon, i);
		}
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public FunctionDefinitionArgumentListContext functionDefinitionArgumentList() {
			return getRuleContext(FunctionDefinitionArgumentListContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(134);
				comment();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(Define);
			setState(141);
			match(Function);
			setState(142);
			match(Colon);
			setState(143);
			match(ID);
			setState(144);
			functionDefinitionArgumentList();
			setState(145);
			match(Colon);
			setState(146);
			datatype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionArgumentListContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(vNESParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(vNESParser.CloseBracket, 0); }
		public List<DefinitionArgumentSpecContext> definitionArgumentSpec() {
			return getRuleContexts(DefinitionArgumentSpecContext.class);
		}
		public DefinitionArgumentSpecContext definitionArgumentSpec(int i) {
			return getRuleContext(DefinitionArgumentSpecContext.class,i);
		}
		public FunctionDefinitionArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinitionArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterFunctionDefinitionArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitFunctionDefinitionArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitFunctionDefinitionArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionArgumentListContext functionDefinitionArgumentList() throws RecognitionException {
		FunctionDefinitionArgumentListContext _localctx = new FunctionDefinitionArgumentListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionDefinitionArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(OpenBracket);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << EntityDataType) | (1L << NumberDataType) | (1L << ID))) != 0)) {
				{
				{
				setState(149);
				definitionArgumentSpec();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionArgumentSpecContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode Colon() { return getToken(vNESParser.Colon, 0); }
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public TerminalNode Comma() { return getToken(vNESParser.Comma, 0); }
		public DefinitionArgumentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionArgumentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterDefinitionArgumentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitDefinitionArgumentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitDefinitionArgumentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionArgumentSpecContext definitionArgumentSpec() throws RecognitionException {
		DefinitionArgumentSpecContext _localctx = new DefinitionArgumentSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_definitionArgumentSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			datatype();
			setState(158);
			match(Colon);
			setState(159);
			match(ID);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(160);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndClauseContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(vNESParser.End, 0); }
		public EndClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterEndClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitEndClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitEndClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndClauseContext endClause() throws RecognitionException {
		EndClauseContext _localctx = new EndClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_endClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			returnStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode ReturnKeyword() { return getToken(vNESParser.ReturnKeyword, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ReturnKeyword);
			setState(168);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ReturnKeyword) {
				{
				{
				setState(170);
				statement();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public EndClauseContext endClause() {
			return getRuleContext(EndClauseContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			functionDefinition();
			setState(177);
			functionBody();
			setState(178);
			endClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityBodyContext extends ParserRuleContext {
		public List<EntityComponentContext> entityComponent() {
			return getRuleContexts(EntityComponentContext.class);
		}
		public EntityComponentContext entityComponent(int i) {
			return getRuleContext(EntityComponentContext.class,i);
		}
		public EntityBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterEntityBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitEntityBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitEntityBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityBodyContext entityBody() throws RecognitionException {
		EntityBodyContext _localctx = new EntityBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_entityBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==Define) {
				{
				{
				setState(180);
				entityComponent();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntityComponentContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public EntityComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterEntityComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitEntityComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitEntityComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityComponentContext entityComponent() throws RecognitionException {
		EntityComponentContext _localctx = new EntityComponentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_entityComponent);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				property();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode Define() { return getToken(vNESParser.Define, 0); }
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public TerminalNode Colon() { return getToken(vNESParser.Colon, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public PropertyModifierContext propertyModifier() {
			return getRuleContext(PropertyModifierContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(Define);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(191);
				propertyModifier();
				}
			}

			setState(194);
			match(ID);
			setState(195);
			match(Colon);
			setState(196);
			datatype();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(197);
				assignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyModifierContext extends ParserRuleContext {
		public PropertyModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterPropertyModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitPropertyModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitPropertyModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyModifierContext propertyModifier() throws RecognitionException {
		PropertyModifierContext _localctx = new PropertyModifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_propertyModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Equals() { return getToken(vNESParser.Equals, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(Equals);
			setState(203);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public TerminalNode OpenBracket() { return getToken(vNESParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(vNESParser.CloseBracket, 0); }
		public List<ArgumentSpecContext> argumentSpec() {
			return getRuleContexts(ArgumentSpecContext.class);
		}
		public ArgumentSpecContext argumentSpec(int i) {
			return getRuleContext(ArgumentSpecContext.class,i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
			setState(206);
			match(OpenBracket);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << StringLiteral) | (1L << ID))) != 0)) {
				{
				{
				setState(207);
				argumentSpec();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentSpecContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(vNESParser.Comma, 0); }
		public ArgumentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterArgumentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitArgumentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitArgumentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentSpecContext argumentSpec() throws RecognitionException {
		ArgumentSpecContext _localctx = new ArgumentSpecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argumentSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			expression();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(216);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode Addition() { return getToken(vNESParser.Addition, 0); }
		public TerminalNode Minus() { return getToken(vNESParser.Minus, 0); }
		public TerminalNode Times() { return getToken(vNESParser.Times, 0); }
		public TerminalNode Devision() { return getToken(vNESParser.Devision, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Addition) | (1L << Minus) | (1L << Times) | (1L << Devision))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<ExpressionComponentContext> expressionComponent() {
			return getRuleContexts(ExpressionComponentContext.class);
		}
		public ExpressionComponentContext expressionComponent(int i) {
			return getRuleContext(ExpressionComponentContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			atom();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Addition) | (1L << Minus) | (1L << Times) | (1L << Devision))) != 0)) {
				{
				{
				setState(222);
				expressionComponent();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionComponentContext extends ParserRuleContext {
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExpressionComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterExpressionComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitExpressionComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitExpressionComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionComponentContext expressionComponent() throws RecognitionException {
		ExpressionComponentContext _localctx = new ExpressionComponentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			arithmeticOperator();
			setState(229);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(vNESParser.INT, 0); }
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(vNESParser.StringLiteral, 0); }
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atom);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public TerminalNode Addition() { return getToken(vNESParser.Addition, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof vNESListener ) ((vNESListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(Addition);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00f2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\7\6"+
		"\7R\n\7\r\7\16\7S\3\7\6\7W\n\7\r\7\16\7X\3\7\6\7\\\n\7\r\7\16\7]\6\7`"+
		"\n\7\r\7\16\7a\3\b\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\7\13u\n\13\f\13\16\13x\13\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\7\f\u0080\n\f\f\f\16\f\u0083\13\f\3\f\3\f\3\f\3\f\3\r\7\r\u008a\n"+
		"\r\f\r\16\r\u008d\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\7\16"+
		"\u0099\n\16\f\16\16\16\u009c\13\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17"+
		"\u00a4\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\7\23\u00ae\n\23\f"+
		"\23\16\23\u00b1\13\23\3\24\3\24\3\24\3\24\3\25\7\25\u00b8\n\25\f\25\16"+
		"\25\u00bb\13\25\3\26\3\26\5\26\u00bf\n\26\3\27\3\27\5\27\u00c3\n\27\3"+
		"\27\3\27\3\27\3\27\5\27\u00c9\n\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\7\32\u00d3\n\32\f\32\16\32\u00d6\13\32\3\32\3\32\3\33\3\33\5\33"+
		"\u00dc\n\33\3\34\3\34\3\35\3\35\7\35\u00e2\n\35\f\35\16\35\u00e5\13\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u00ee\n\37\3 \3 \3 \2\2!\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\6\3\2\b"+
		"\t\3\2\30\30\6\2\5\5\n\n\r\r\33\33\3\2\34\37\2\u00ea\2@\3\2\2\2\4C\3\2"+
		"\2\2\6F\3\2\2\2\bK\3\2\2\2\nN\3\2\2\2\f_\3\2\2\2\16c\3\2\2\2\20l\3\2\2"+
		"\2\22p\3\2\2\2\24v\3\2\2\2\26}\3\2\2\2\30\u008b\3\2\2\2\32\u0096\3\2\2"+
		"\2\34\u009f\3\2\2\2\36\u00a5\3\2\2\2 \u00a7\3\2\2\2\"\u00a9\3\2\2\2$\u00af"+
		"\3\2\2\2&\u00b2\3\2\2\2(\u00b9\3\2\2\2*\u00be\3\2\2\2,\u00c0\3\2\2\2."+
		"\u00ca\3\2\2\2\60\u00cc\3\2\2\2\62\u00cf\3\2\2\2\64\u00d9\3\2\2\2\66\u00dd"+
		"\3\2\2\28\u00df\3\2\2\2:\u00e6\3\2\2\2<\u00ed\3\2\2\2>\u00ef\3\2\2\2@"+
		"A\7\3\2\2AB\5\b\5\2B\3\3\2\2\2CD\7\4\2\2DE\5\b\5\2E\5\3\2\2\2FG\t\2\2"+
		"\2G\7\3\2\2\2HJ\n\3\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\t\3\2"+
		"\2\2MK\3\2\2\2NO\t\4\2\2O\13\3\2\2\2PR\5\16\b\2QP\3\2\2\2RS\3\2\2\2SQ"+
		"\3\2\2\2ST\3\2\2\2T`\3\2\2\2UW\5\24\13\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y`\3\2\2\2Z\\\5\22\n\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2"+
		"\2\2^`\3\2\2\2_Q\3\2\2\2_V\3\2\2\2_[\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2"+
		"\2\2b\r\3\2\2\2cg\5\20\t\2df\5\24\13\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2g"+
		"h\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\36\20\2k\17\3\2\2\2lm\7\21\2\2mn\7\6"+
		"\2\2no\7\33\2\2o\21\3\2\2\2pq\7\32\2\2qr\7\33\2\2r\23\3\2\2\2su\5\2\2"+
		"\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\5\26"+
		"\f\2z{\5(\25\2{|\5\36\20\2|\25\3\2\2\2}\u0081\7\21\2\2~\u0080\5\6\4\2"+
		"\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\5\n\6\2\u0085\u0086"+
		"\7\13\2\2\u0086\u0087\7\33\2\2\u0087\27\3\2\2\2\u0088\u008a\5\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\21\2\2\u008f"+
		"\u0090\7\f\2\2\u0090\u0091\7\13\2\2\u0091\u0092\7\33\2\2\u0092\u0093\5"+
		"\32\16\2\u0093\u0094\7\13\2\2\u0094\u0095\5\n\6\2\u0095\31\3\2\2\2\u0096"+
		"\u009a\7\22\2\2\u0097\u0099\5\34\17\2\u0098\u0097\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u009e\7\23\2\2\u009e\33\3\2\2\2\u009f\u00a0\5\n\6"+
		"\2\u00a0\u00a1\7\13\2\2\u00a1\u00a3\7\33\2\2\u00a2\u00a4\7\16\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\7\20\2"+
		"\2\u00a6\37\3\2\2\2\u00a7\u00a8\5\"\22\2\u00a8!\3\2\2\2\u00a9\u00aa\7"+
		"\17\2\2\u00aa\u00ab\58\35\2\u00ab#\3\2\2\2\u00ac\u00ae\5 \21\2\u00ad\u00ac"+
		"\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"%\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\5\30\r\2\u00b3\u00b4\5$\23\2"+
		"\u00b4\u00b5\5\36\20\2\u00b5\'\3\2\2\2\u00b6\u00b8\5*\26\2\u00b7\u00b6"+
		"\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		")\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\5&\24\2\u00bd\u00bf\5,\27\2"+
		"\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf+\3\2\2\2\u00c0\u00c2\7"+
		"\21\2\2\u00c1\u00c3\5.\30\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\7\33\2\2\u00c5\u00c6\7\13\2\2\u00c6\u00c8\5"+
		"\n\6\2\u00c7\u00c9\5\60\31\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"-\3\2\2\2\u00ca\u00cb\7\7\2\2\u00cb/\3\2\2\2\u00cc\u00cd\7\27\2\2\u00cd"+
		"\u00ce\58\35\2\u00ce\61\3\2\2\2\u00cf\u00d0\7\33\2\2\u00d0\u00d4\7\22"+
		"\2\2\u00d1\u00d3\5\64\33\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\7\23\2\2\u00d8\63\3\2\2\2\u00d9\u00db\58\35\2\u00da\u00dc"+
		"\7\16\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\65\3\2\2\2\u00dd"+
		"\u00de\t\5\2\2\u00de\67\3\2\2\2\u00df\u00e3\5<\37\2\u00e0\u00e2\5:\36"+
		"\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e49\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\5\66\34\2\u00e7"+
		"\u00e8\5<\37\2\u00e8;\3\2\2\2\u00e9\u00ee\7\25\2\2\u00ea\u00ee\5\62\32"+
		"\2\u00eb\u00ee\7\31\2\2\u00ec\u00ee\7\33\2\2\u00ed\u00e9\3\2\2\2\u00ed"+
		"\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee=\3\2\2\2"+
		"\u00ef\u00f0\7\34\2\2\u00f0?\3\2\2\2\27KSX]_agv\u0081\u008b\u009a\u00a3"+
		"\u00af\u00b9\u00be\u00c2\u00c8\u00d4\u00db\u00e3\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}