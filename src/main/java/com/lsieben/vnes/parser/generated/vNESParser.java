// Generated from C:/Users/Luc/workspace/vNES/src/main/java/com/lsieben/vnes/parser\vNES.g4 by ANTLR 4.7
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
		RULE_datatype = 4, RULE_sourceFile = 5, RULE_module = 6, RULE_moduleDefinition = 7, 
		RULE_useStatement = 8, RULE_entity = 9, RULE_entityDefinition = 10, RULE_functionDefinition = 11, 
		RULE_functionDefinitionArgumentList = 12, RULE_definitionArgumentSpec = 13, 
		RULE_endClause = 14, RULE_statement = 15, RULE_returnStatement = 16, RULE_functionBody = 17, 
		RULE_function = 18, RULE_entityBody = 19, RULE_entityComponent = 20, RULE_property = 21, 
		RULE_propertyModifier = 22, RULE_assignment = 23, RULE_methodCall = 24, 
		RULE_argumentSpec = 25, RULE_arithmeticOperator = 26, RULE_expression = 27, 
		RULE_expressionComponent = 28, RULE_atom = 29, RULE_add = 30;
	public static final String[] ruleNames = {
		"comment", "docComment", "entityModifier", "rest_of_line", "datatype", 
		"sourceFile", "module", "moduleDefinition", "useStatement", "entity", 
		"entityDefinition", "functionDefinition", "functionDefinitionArgumentList", 
		"definitionArgumentSpec", "endClause", "statement", "returnStatement", 
		"functionBody", "function", "entityBody", "entityComponent", "property", 
		"propertyModifier", "assignment", "methodCall", "argumentSpec", "arithmeticOperator", 
		"expression", "expressionComponent", "atom", "add"
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

	public static class SourceFileContext extends ParserRuleContext {
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
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitSourceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sourceFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Define) | (1L << Use))) != 0)) {
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
				setState(97);
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
			setState(98);
			moduleDefinition();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==Define) {
				{
				{
				setState(99);
				entity();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
			setState(107);
			match(Define);
			setState(108);
			match(T__3);
			setState(109);
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
			setState(111);
			match(Use);
			setState(112);
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
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(114);
				comment();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			entityDefinition();
			setState(121);
			entityBody();
			setState(122);
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
			setState(124);
			match(Define);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FunctionalEntityModifier || _la==NativeEntityModifier) {
				{
				{
				setState(125);
				entityModifier();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			datatype();
			setState(132);
			match(Colon);
			setState(133);
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
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(135);
				comment();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(Define);
			setState(142);
			match(Function);
			setState(143);
			match(Colon);
			setState(144);
			match(ID);
			setState(145);
			functionDefinitionArgumentList();
			setState(146);
			match(Colon);
			setState(147);
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
			setState(149);
			match(OpenBracket);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << EntityDataType) | (1L << NumberDataType) | (1L << ID))) != 0)) {
				{
				{
				setState(150);
				definitionArgumentSpec();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
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
			setState(158);
			datatype();
			setState(159);
			match(Colon);
			setState(160);
			match(ID);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(161);
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
			setState(164);
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
			setState(166);
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
			setState(168);
			match(ReturnKeyword);
			setState(169);
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
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ReturnKeyword) {
				{
				{
				setState(171);
				statement();
				}
				}
				setState(176);
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
			setState(177);
			functionDefinition();
			setState(178);
			functionBody();
			setState(179);
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
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==Define) {
				{
				{
				setState(181);
				entityComponent();
				}
				}
				setState(186);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitEntityComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityComponentContext entityComponent() throws RecognitionException {
		EntityComponentContext _localctx = new EntityComponentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_entityComponent);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
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
			setState(191);
			match(Define);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(192);
				propertyModifier();
				}
			}

			setState(195);
			match(ID);
			setState(196);
			match(Colon);
			setState(197);
			datatype();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(198);
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
			setState(201);
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
			setState(203);
			match(Equals);
			setState(204);
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
			setState(206);
			match(ID);
			setState(207);
			match(OpenBracket);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << StringLiteral) | (1L << ID))) != 0)) {
				{
				{
				setState(208);
				argumentSpec();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
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
			setState(216);
			expression();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(217);
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
			setState(220);
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
			setState(222);
			atom();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Addition) | (1L << Minus) | (1L << Times) | (1L << Devision))) != 0)) {
				{
				{
				setState(223);
				expressionComponent();
				}
				}
				setState(228);
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
			setState(229);
			arithmeticOperator();
			setState(230);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atom);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
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
			setState(238);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00f3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\7\6"+
		"\7R\n\7\r\7\16\7S\3\7\6\7W\n\7\r\7\16\7X\3\7\6\7\\\n\7\r\7\16\7]\7\7`"+
		"\n\7\f\7\16\7c\13\7\3\b\3\b\7\bg\n\b\f\b\16\bj\13\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\7\13v\n\13\f\13\16\13y\13\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\7\f\u0081\n\f\f\f\16\f\u0084\13\f\3\f\3\f\3\f\3\f\3\r\7\r"+
		"\u008b\n\r\f\r\16\r\u008e\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\7\16\u009a\n\16\f\16\16\16\u009d\13\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\5\17\u00a5\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\7\23\u00af"+
		"\n\23\f\23\16\23\u00b2\13\23\3\24\3\24\3\24\3\24\3\25\7\25\u00b9\n\25"+
		"\f\25\16\25\u00bc\13\25\3\26\3\26\5\26\u00c0\n\26\3\27\3\27\5\27\u00c4"+
		"\n\27\3\27\3\27\3\27\3\27\5\27\u00ca\n\27\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\7\32\u00d4\n\32\f\32\16\32\u00d7\13\32\3\32\3\32\3\33\3\33"+
		"\5\33\u00dd\n\33\3\34\3\34\3\35\3\35\7\35\u00e3\n\35\f\35\16\35\u00e6"+
		"\13\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u00ef\n\37\3 \3 \3 \2\2"+
		"!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\6"+
		"\3\2\b\t\3\2\30\30\6\2\5\5\n\n\r\r\33\33\3\2\34\37\2\u00eb\2@\3\2\2\2"+
		"\4C\3\2\2\2\6F\3\2\2\2\bK\3\2\2\2\nN\3\2\2\2\fa\3\2\2\2\16d\3\2\2\2\20"+
		"m\3\2\2\2\22q\3\2\2\2\24w\3\2\2\2\26~\3\2\2\2\30\u008c\3\2\2\2\32\u0097"+
		"\3\2\2\2\34\u00a0\3\2\2\2\36\u00a6\3\2\2\2 \u00a8\3\2\2\2\"\u00aa\3\2"+
		"\2\2$\u00b0\3\2\2\2&\u00b3\3\2\2\2(\u00ba\3\2\2\2*\u00bf\3\2\2\2,\u00c1"+
		"\3\2\2\2.\u00cb\3\2\2\2\60\u00cd\3\2\2\2\62\u00d0\3\2\2\2\64\u00da\3\2"+
		"\2\2\66\u00de\3\2\2\28\u00e0\3\2\2\2:\u00e7\3\2\2\2<\u00ee\3\2\2\2>\u00f0"+
		"\3\2\2\2@A\7\3\2\2AB\5\b\5\2B\3\3\2\2\2CD\7\4\2\2DE\5\b\5\2E\5\3\2\2\2"+
		"FG\t\2\2\2G\7\3\2\2\2HJ\n\3\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2"+
		"\2L\t\3\2\2\2MK\3\2\2\2NO\t\4\2\2O\13\3\2\2\2PR\5\16\b\2QP\3\2\2\2RS\3"+
		"\2\2\2SQ\3\2\2\2ST\3\2\2\2T`\3\2\2\2UW\5\24\13\2VU\3\2\2\2WX\3\2\2\2X"+
		"V\3\2\2\2XY\3\2\2\2Y`\3\2\2\2Z\\\5\22\n\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2"+
		"\2]^\3\2\2\2^`\3\2\2\2_Q\3\2\2\2_V\3\2\2\2_[\3\2\2\2`c\3\2\2\2a_\3\2\2"+
		"\2ab\3\2\2\2b\r\3\2\2\2ca\3\2\2\2dh\5\20\t\2eg\5\24\13\2fe\3\2\2\2gj\3"+
		"\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\5\36\20\2l\17\3\2\2\2"+
		"mn\7\21\2\2no\7\6\2\2op\7\33\2\2p\21\3\2\2\2qr\7\32\2\2rs\7\33\2\2s\23"+
		"\3\2\2\2tv\5\2\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2y"+
		"w\3\2\2\2z{\5\26\f\2{|\5(\25\2|}\5\36\20\2}\25\3\2\2\2~\u0082\7\21\2\2"+
		"\177\u0081\5\6\4\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\5\n\6\2\u0086\u0087\7\13\2\2\u0087\u0088\7\33\2\2\u0088\27\3\2"+
		"\2\2\u0089\u008b\5\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0090\7\21\2\2\u0090\u0091\7\f\2\2\u0091\u0092\7\13\2\2\u0092"+
		"\u0093\7\33\2\2\u0093\u0094\5\32\16\2\u0094\u0095\7\13\2\2\u0095\u0096"+
		"\5\n\6\2\u0096\31\3\2\2\2\u0097\u009b\7\22\2\2\u0098\u009a\5\34\17\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\23\2\2\u009f"+
		"\33\3\2\2\2\u00a0\u00a1\5\n\6\2\u00a1\u00a2\7\13\2\2\u00a2\u00a4\7\33"+
		"\2\2\u00a3\u00a5\7\16\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\35\3\2\2\2\u00a6\u00a7\7\20\2\2\u00a7\37\3\2\2\2\u00a8\u00a9\5\"\22\2"+
		"\u00a9!\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab\u00ac\58\35\2\u00ac#\3\2\2"+
		"\2\u00ad\u00af\5 \21\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1%\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\5\30\r\2\u00b4\u00b5\5$\23\2\u00b5\u00b6\5\36\20\2\u00b6\'\3\2"+
		"\2\2\u00b7\u00b9\5*\26\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb)\3\2\2\2\u00bc\u00ba\3\2\2\2"+
		"\u00bd\u00c0\5&\24\2\u00be\u00c0\5,\27\2\u00bf\u00bd\3\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0+\3\2\2\2\u00c1\u00c3\7\21\2\2\u00c2\u00c4\5.\30\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\33"+
		"\2\2\u00c6\u00c7\7\13\2\2\u00c7\u00c9\5\n\6\2\u00c8\u00ca\5\60\31\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca-\3\2\2\2\u00cb\u00cc\7\7\2\2"+
		"\u00cc/\3\2\2\2\u00cd\u00ce\7\27\2\2\u00ce\u00cf\58\35\2\u00cf\61\3\2"+
		"\2\2\u00d0\u00d1\7\33\2\2\u00d1\u00d5\7\22\2\2\u00d2\u00d4\5\64\33\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\23\2\2\u00d9"+
		"\63\3\2\2\2\u00da\u00dc\58\35\2\u00db\u00dd\7\16\2\2\u00dc\u00db\3\2\2"+
		"\2\u00dc\u00dd\3\2\2\2\u00dd\65\3\2\2\2\u00de\u00df\t\5\2\2\u00df\67\3"+
		"\2\2\2\u00e0\u00e4\5<\37\2\u00e1\u00e3\5:\36\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e59\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e7\u00e8\5\66\34\2\u00e8\u00e9\5<\37\2\u00e9;"+
		"\3\2\2\2\u00ea\u00ef\7\25\2\2\u00eb\u00ef\5\62\32\2\u00ec\u00ef\7\31\2"+
		"\2\u00ed\u00ef\7\33\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef=\3\2\2\2\u00f0\u00f1\7\34\2\2"+
		"\u00f1?\3\2\2\2\27KSX]_ahw\u0082\u008c\u009b\u00a4\u00b0\u00ba\u00bf\u00c3"+
		"\u00c9\u00d5\u00dc\u00e4\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}