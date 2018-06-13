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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, FunctionalEntityModifier=7, 
		NativeModifier=8, EntityDataType=9, Colon=10, Function=11, NumberDataType=12, 
		Comma=13, ReturnKeyword=14, End=15, Define=16, OpenBracket=17, CloseBracket=18, 
		WS=19, INT=20, Quotes=21, Equals=22, NL=23, StringLiteral=24, Use=25, 
		ID=26, Addition=27, Minus=28, Times=29, Devision=30;
	public static final int
		RULE_comment = 0, RULE_docComment = 1, RULE_entityModifier = 2, RULE_rest_of_line = 3, 
		RULE_dataType = 4, RULE_sourceFile = 5, RULE_module = 6, RULE_moduleDefinition = 7, 
		RULE_useStatement = 8, RULE_entity = 9, RULE_entityDefinition = 10, RULE_functionDefinition = 11, 
		RULE_definitionArgumentSpec = 12, RULE_endClause = 13, RULE_statement = 14, 
		RULE_returnStatement = 15, RULE_functionBody = 16, RULE_function = 17, 
		RULE_entityBody = 18, RULE_entityComponent = 19, RULE_propertyDefinition = 20, 
		RULE_propertyAssignment = 21, RULE_mandatoryModifier = 22, RULE_assignment = 23, 
		RULE_functionCall = 24, RULE_argumentSpec = 25, RULE_arithmeticOperator = 26, 
		RULE_expression = 27, RULE_arithmeticExpressionComponent = 28, RULE_atom = 29;
	public static final String[] ruleNames = {
		"comment", "docComment", "entityModifier", "rest_of_line", "dataType", 
		"sourceFile", "module", "moduleDefinition", "useStatement", "entity", 
		"entityDefinition", "functionDefinition", "definitionArgumentSpec", "endClause", 
		"statement", "returnStatement", "functionBody", "function", "entityBody", 
		"entityComponent", "propertyDefinition", "propertyAssignment", "mandatoryModifier", 
		"assignment", "functionCall", "argumentSpec", "arithmeticOperator", "expression", 
		"arithmeticExpressionComponent", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'###'", "'STRING'", "'MODULE'", "'PROPERTY'", "'MANDATORY'", 
		"'FUNCTIONAL'", "'NATIVE'", "'ENTITY'", "':'", "'FUNCTION'", "'NUMBER'", 
		"','", "'RETURN'", "'END'", "'DEF'", "'('", "')'", null, null, "'\"'", 
		"'='", null, null, "'USE'", null, "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "FunctionalEntityModifier", 
		"NativeModifier", "EntityDataType", "Colon", "Function", "NumberDataType", 
		"Comma", "ReturnKeyword", "End", "Define", "OpenBracket", "CloseBracket", 
		"WS", "INT", "Quotes", "Equals", "NL", "StringLiteral", "Use", "ID", "Addition", 
		"Minus", "Times", "Devision"
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
			setState(60);
			match(T__0);
			setState(61);
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
			setState(63);
			match(T__1);
			setState(64);
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
		public TerminalNode NativeModifier() { return getToken(vNESParser.NativeModifier, 0); }
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
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==FunctionalEntityModifier || _la==NativeModifier) ) {
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
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
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
				setState(73);
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Define || _la==Use) {
				{
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Define:
					{
					setState(77); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(76);
							module();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(79); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case Use:
					{
					setState(82); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(81);
							useStatement();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(84); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(90);
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
			setState(91);
			moduleDefinition();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==Define) {
				{
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(92);
					entity();
					}
					break;
				case 2:
					{
					setState(93);
					function();
					}
					break;
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
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
		public TerminalNode Colon() { return getToken(vNESParser.Colon, 0); }
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public TerminalNode NativeModifier() { return getToken(vNESParser.NativeModifier, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(Define);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NativeModifier) {
				{
				setState(102);
				match(NativeModifier);
				}
			}

			setState(105);
			match(T__3);
			setState(106);
			match(Colon);
			setState(107);
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
			setState(109);
			match(Use);
			setState(110);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(112);
				comment();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			entityDefinition();
			setState(119);
			entityBody();
			setState(120);
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
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
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
			setState(122);
			match(Define);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FunctionalEntityModifier || _la==NativeModifier) {
				{
				{
				setState(123);
				entityModifier();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			dataType();
			setState(130);
			match(Colon);
			setState(131);
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
		public TerminalNode OpenBracket() { return getToken(vNESParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(vNESParser.CloseBracket, 0); }
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<DefinitionArgumentSpecContext> definitionArgumentSpec() {
			return getRuleContexts(DefinitionArgumentSpecContext.class);
		}
		public DefinitionArgumentSpecContext definitionArgumentSpec(int i) {
			return getRuleContext(DefinitionArgumentSpecContext.class,i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
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
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(133);
				comment();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(Define);
			setState(140);
			match(Function);
			setState(141);
			match(Colon);
			setState(142);
			match(ID);
			setState(143);
			match(OpenBracket);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(144);
				definitionArgumentSpec();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(CloseBracket);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(151);
				match(Colon);
				setState(152);
				dataType();
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

	public static class DefinitionArgumentSpecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public TerminalNode Colon() { return getToken(vNESParser.Colon, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_definitionArgumentSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(ID);
			setState(156);
			match(Colon);
			setState(157);
			dataType();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(158);
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
		enterRule(_localctx, 26, RULE_endClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		enterRule(_localctx, 28, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		enterRule(_localctx, 30, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ReturnKeyword);
			setState(166);
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
		enterRule(_localctx, 32, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ReturnKeyword) {
				{
				{
				setState(168);
				statement();
				}
				}
				setState(173);
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
		enterRule(_localctx, 34, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			functionDefinition();
			setState(175);
			functionBody();
			setState(176);
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
		enterRule(_localctx, 36, RULE_entityBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Define) | (1L << ID))) != 0)) {
				{
				{
				setState(178);
				entityComponent();
				}
				}
				setState(183);
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
		public PropertyDefinitionContext propertyDefinition() {
			return getRuleContext(PropertyDefinitionContext.class,0);
		}
		public PropertyAssignmentContext propertyAssignment() {
			return getRuleContext(PropertyAssignmentContext.class,0);
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
		enterRule(_localctx, 38, RULE_entityComponent);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				propertyDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				propertyAssignment();
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

	public static class PropertyDefinitionContext extends ParserRuleContext {
		public TerminalNode Define() { return getToken(vNESParser.Define, 0); }
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public TerminalNode Colon() { return getToken(vNESParser.Colon, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MandatoryModifierContext mandatoryModifier() {
			return getRuleContext(MandatoryModifierContext.class,0);
		}
		public TerminalNode Equals() { return getToken(vNESParser.Equals, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitPropertyDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDefinitionContext propertyDefinition() throws RecognitionException {
		PropertyDefinitionContext _localctx = new PropertyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_propertyDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(Define);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(190);
				mandatoryModifier();
				}
			}

			setState(193);
			match(T__4);
			setState(194);
			match(ID);
			setState(195);
			match(Colon);
			setState(196);
			dataType();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(197);
				match(Equals);
				setState(198);
				expression();
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

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
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

	public static class MandatoryModifierContext extends ParserRuleContext {
		public MandatoryModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mandatoryModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitMandatoryModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MandatoryModifierContext mandatoryModifier() throws RecognitionException {
		MandatoryModifierContext _localctx = new MandatoryModifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mandatoryModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__5);
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
			setState(207);
			match(Equals);
			setState(208);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
		public TerminalNode OpenBracket() { return getToken(vNESParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(vNESParser.CloseBracket, 0); }
		public List<ArgumentSpecContext> argumentSpec() {
			return getRuleContexts(ArgumentSpecContext.class);
		}
		public ArgumentSpecContext argumentSpec(int i) {
			return getRuleContext(ArgumentSpecContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			setState(211);
			match(OpenBracket);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << StringLiteral) | (1L << ID))) != 0)) {
				{
				{
				setState(212);
				argumentSpec();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
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
			setState(220);
			expression();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(221);
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
			setState(224);
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
		public List<ArithmeticExpressionComponentContext> arithmeticExpressionComponent() {
			return getRuleContexts(ArithmeticExpressionComponentContext.class);
		}
		public ArithmeticExpressionComponentContext arithmeticExpressionComponent(int i) {
			return getRuleContext(ArithmeticExpressionComponentContext.class,i);
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
			setState(226);
			atom();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Addition) | (1L << Minus) | (1L << Times) | (1L << Devision))) != 0)) {
				{
				{
				setState(227);
				arithmeticExpressionComponent();
				}
				}
				setState(232);
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

	public static class ArithmeticExpressionComponentContext extends ParserRuleContext {
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ArithmeticExpressionComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpressionComponent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof vNESVisitor ) return ((vNESVisitor<? extends T>)visitor).visitArithmeticExpressionComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionComponentContext arithmeticExpressionComponent() throws RecognitionException {
		ArithmeticExpressionComponentContext _localctx = new ArithmeticExpressionComponentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arithmeticExpressionComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			arithmeticOperator();
			setState(234);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\5\7\5H\n\5\f\5\16\5K\13\5\3\6\3\6\3\7\6\7P\n"+
		"\7\r\7\16\7Q\3\7\6\7U\n\7\r\7\16\7V\7\7Y\n\7\f\7\16\7\\\13\7\3\b\3\b\3"+
		"\b\7\ba\n\b\f\b\16\bd\13\b\3\b\3\b\3\t\3\t\5\tj\n\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\7\13t\n\13\f\13\16\13w\13\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\7\f\177\n\f\f\f\16\f\u0082\13\f\3\f\3\f\3\f\3\f\3\r\7\r\u0089\n\r\f"+
		"\r\16\r\u008c\13\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0094\n\r\f\r\16\r\u0097"+
		"\13\r\3\r\3\r\3\r\5\r\u009c\n\r\3\16\3\16\3\16\3\16\5\16\u00a2\n\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\7\22\u00ac\n\22\f\22\16\22\u00af"+
		"\13\22\3\23\3\23\3\23\3\23\3\24\7\24\u00b6\n\24\f\24\16\24\u00b9\13\24"+
		"\3\25\3\25\3\25\5\25\u00be\n\25\3\26\3\26\5\26\u00c2\n\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u00ca\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\7\32\u00d8\n\32\f\32\16\32\u00db\13\32\3\32"+
		"\3\32\3\33\3\33\5\33\u00e1\n\33\3\34\3\34\3\35\3\35\7\35\u00e7\n\35\f"+
		"\35\16\35\u00ea\13\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u00f3\n"+
		"\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<\2\6\3\2\t\n\3\2\31\31\6\2\5\5\13\13\16\16\34\34\3\2\35 \2\u00f0"+
		"\2>\3\2\2\2\4A\3\2\2\2\6D\3\2\2\2\bI\3\2\2\2\nL\3\2\2\2\fZ\3\2\2\2\16"+
		"]\3\2\2\2\20g\3\2\2\2\22o\3\2\2\2\24u\3\2\2\2\26|\3\2\2\2\30\u008a\3\2"+
		"\2\2\32\u009d\3\2\2\2\34\u00a3\3\2\2\2\36\u00a5\3\2\2\2 \u00a7\3\2\2\2"+
		"\"\u00ad\3\2\2\2$\u00b0\3\2\2\2&\u00b7\3\2\2\2(\u00bd\3\2\2\2*\u00bf\3"+
		"\2\2\2,\u00cb\3\2\2\2.\u00cf\3\2\2\2\60\u00d1\3\2\2\2\62\u00d4\3\2\2\2"+
		"\64\u00de\3\2\2\2\66\u00e2\3\2\2\28\u00e4\3\2\2\2:\u00eb\3\2\2\2<\u00f2"+
		"\3\2\2\2>?\7\3\2\2?@\5\b\5\2@\3\3\2\2\2AB\7\4\2\2BC\5\b\5\2C\5\3\2\2\2"+
		"DE\t\2\2\2E\7\3\2\2\2FH\n\3\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2"+
		"\2J\t\3\2\2\2KI\3\2\2\2LM\t\4\2\2M\13\3\2\2\2NP\5\16\b\2ON\3\2\2\2PQ\3"+
		"\2\2\2QO\3\2\2\2QR\3\2\2\2RY\3\2\2\2SU\5\22\n\2TS\3\2\2\2UV\3\2\2\2VT"+
		"\3\2\2\2VW\3\2\2\2WY\3\2\2\2XO\3\2\2\2XT\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2"+
		"Z[\3\2\2\2[\r\3\2\2\2\\Z\3\2\2\2]b\5\20\t\2^a\5\24\13\2_a\5$\23\2`^\3"+
		"\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\5"+
		"\34\17\2f\17\3\2\2\2gi\7\22\2\2hj\7\n\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2"+
		"\2kl\7\6\2\2lm\7\f\2\2mn\7\34\2\2n\21\3\2\2\2op\7\33\2\2pq\7\34\2\2q\23"+
		"\3\2\2\2rt\5\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2w"+
		"u\3\2\2\2xy\5\26\f\2yz\5&\24\2z{\5\34\17\2{\25\3\2\2\2|\u0080\7\22\2\2"+
		"}\177\5\6\4\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\5\n\6\2\u0084"+
		"\u0085\7\f\2\2\u0085\u0086\7\34\2\2\u0086\27\3\2\2\2\u0087\u0089\5\2\2"+
		"\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\22\2\2"+
		"\u008e\u008f\7\r\2\2\u008f\u0090\7\f\2\2\u0090\u0091\7\34\2\2\u0091\u0095"+
		"\7\23\2\2\u0092\u0094\5\32\16\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u009b\7\24\2\2\u0099\u009a\7\f\2\2\u009a\u009c\5\n\6\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\31\3\2\2\2\u009d\u009e"+
		"\7\34\2\2\u009e\u009f\7\f\2\2\u009f\u00a1\5\n\6\2\u00a0\u00a2\7\17\2\2"+
		"\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\33\3\2\2\2\u00a3\u00a4"+
		"\7\21\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\5 \21\2\u00a6\37\3\2\2\2\u00a7"+
		"\u00a8\7\20\2\2\u00a8\u00a9\58\35\2\u00a9!\3\2\2\2\u00aa\u00ac\5\36\20"+
		"\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae#\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\5\30\r\2\u00b1"+
		"\u00b2\5\"\22\2\u00b2\u00b3\5\34\17\2\u00b3%\3\2\2\2\u00b4\u00b6\5(\25"+
		"\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\'\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00be\5$\23\2\u00bb"+
		"\u00be\5*\26\2\u00bc\u00be\5,\27\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00bc\3\2\2\2\u00be)\3\2\2\2\u00bf\u00c1\7\22\2\2\u00c0\u00c2"+
		"\5.\30\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\7\7\2\2\u00c4\u00c5\7\34\2\2\u00c5\u00c6\7\f\2\2\u00c6\u00c9\5"+
		"\n\6\2\u00c7\u00c8\7\30\2\2\u00c8\u00ca\58\35\2\u00c9\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca+\3\2\2\2\u00cb\u00cc\7\34\2\2\u00cc\u00cd\7\30\2"+
		"\2\u00cd\u00ce\58\35\2\u00ce-\3\2\2\2\u00cf\u00d0\7\b\2\2\u00d0/\3\2\2"+
		"\2\u00d1\u00d2\7\30\2\2\u00d2\u00d3\58\35\2\u00d3\61\3\2\2\2\u00d4\u00d5"+
		"\7\34\2\2\u00d5\u00d9\7\23\2\2\u00d6\u00d8\5\64\33\2\u00d7\u00d6\3\2\2"+
		"\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\24\2\2\u00dd\63\3\2\2\2\u00de"+
		"\u00e0\58\35\2\u00df\u00e1\7\17\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3"+
		"\2\2\2\u00e1\65\3\2\2\2\u00e2\u00e3\t\5\2\2\u00e3\67\3\2\2\2\u00e4\u00e8"+
		"\5<\37\2\u00e5\u00e7\5:\36\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e99\3\2\2\2\u00ea\u00e8\3\2\2\2"+
		"\u00eb\u00ec\5\66\34\2\u00ec\u00ed\5<\37\2\u00ed;\3\2\2\2\u00ee\u00f3"+
		"\7\26\2\2\u00ef\u00f3\5\62\32\2\u00f0\u00f3\7\32\2\2\u00f1\u00f3\7\34"+
		"\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3=\3\2\2\2\31IQVXZ`biu\u0080\u008a\u0095\u009b\u00a1"+
		"\u00ad\u00b7\u00bd\u00c1\u00c9\u00d9\u00e0\u00e8\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}