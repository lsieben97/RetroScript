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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NativeModifier=8, 
		EntityDataType=9, Colon=10, Function=11, NumberDataType=12, Comma=13, 
		ReturnKeyword=14, End=15, Define=16, OpenBracket=17, CloseBracket=18, 
		WS=19, INT=20, Quotes=21, Equals=22, NL=23, StringLiteral=24, True=25, 
		False=26, Use=27, ID=28, Addition=29, Minus=30, Times=31, Devision=32;
	public static final int
		RULE_comment = 0, RULE_docComment = 1, RULE_rest_of_line = 2, RULE_dataType = 3, 
		RULE_sourceFile = 4, RULE_module = 5, RULE_moduleDefinition = 6, RULE_useStatement = 7, 
		RULE_entity = 8, RULE_entityDefinition = 9, RULE_functionDefinition = 10, 
		RULE_definitionArgumentSpec = 11, RULE_endClause = 12, RULE_statement = 13, 
		RULE_returnStatement = 14, RULE_functionBody = 15, RULE_function = 16, 
		RULE_entityComponent = 17, RULE_propertyDefinition = 18, RULE_propertyAssignment = 19, 
		RULE_mandatoryModifier = 20, RULE_assignment = 21, RULE_functionCall = 22, 
		RULE_argumentSpec = 23, RULE_arithmeticOperator = 24, RULE_expression = 25, 
		RULE_arithmeticExpressionComponent = 26, RULE_atom = 27;
	public static final String[] ruleNames = {
		"comment", "docComment", "rest_of_line", "dataType", "sourceFile", "module", 
		"moduleDefinition", "useStatement", "entity", "entityDefinition", "functionDefinition", 
		"definitionArgumentSpec", "endClause", "statement", "returnStatement", 
		"functionBody", "function", "entityComponent", "propertyDefinition", "propertyAssignment", 
		"mandatoryModifier", "assignment", "functionCall", "argumentSpec", "arithmeticOperator", 
		"expression", "arithmeticExpressionComponent", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'###'", "'STRING'", "'BOOLEAN'", "'MODULE'", "'PROPERTY'", 
		"'MANDATORY'", "'NATIVE'", "'ENTITY'", "':'", "'FUNCTION'", "'NUMBER'", 
		"','", "'RETURN'", "'END'", "'DEF'", "'('", "')'", null, null, "'\"'", 
		"'='", null, null, "'TRUE'", "'FALSE'", "'USE'", null, "'+'", "'-'", "'*'", 
		"'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "NativeModifier", "EntityDataType", 
		"Colon", "Function", "NumberDataType", "Comma", "ReturnKeyword", "End", 
		"Define", "OpenBracket", "CloseBracket", "WS", "INT", "Quotes", "Equals", 
		"NL", "StringLiteral", "True", "False", "Use", "ID", "Addition", "Minus", 
		"Times", "Devision"
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
			setState(56);
			match(T__0);
			setState(57);
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
			setState(59);
			match(T__1);
			setState(60);
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
		enterRule(_localctx, 4, RULE_rest_of_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
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
				setState(67);
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
		enterRule(_localctx, 6, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << EntityDataType) | (1L << NumberDataType) | (1L << ID))) != 0)) ) {
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
		enterRule(_localctx, 8, RULE_sourceFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Define || _la==Use) {
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Define:
					{
					setState(71); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(70);
							module();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(73); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case Use:
					{
					setState(76); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(75);
							useStatement();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(78); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84);
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
		enterRule(_localctx, 10, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			moduleDefinition();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==Define) {
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(86);
					entity();
					}
					break;
				case 2:
					{
					setState(87);
					function();
					}
					break;
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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
		enterRule(_localctx, 12, RULE_moduleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(Define);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NativeModifier) {
				{
				setState(96);
				match(NativeModifier);
				}
			}

			setState(99);
			match(T__4);
			setState(100);
			match(Colon);
			setState(101);
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
		enterRule(_localctx, 14, RULE_useStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(Use);
			setState(104);
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
		public EndClauseContext endClause() {
			return getRuleContext(EndClauseContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<PropertyDefinitionContext> propertyDefinition() {
			return getRuleContexts(PropertyDefinitionContext.class);
		}
		public PropertyDefinitionContext propertyDefinition(int i) {
			return getRuleContext(PropertyDefinitionContext.class,i);
		}
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
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
		enterRule(_localctx, 16, RULE_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(106);
				comment();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			entityDefinition();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << Define) | (1L << ID))) != 0)) {
				{
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(113);
					function();
					}
					break;
				case 2:
					{
					setState(114);
					propertyDefinition();
					}
					break;
				case 3:
					{
					setState(115);
					propertyAssignment();
					}
					break;
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode Colon() { return getToken(vNESParser.Colon, 0); }
		public TerminalNode ID() { return getToken(vNESParser.ID, 0); }
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
		enterRule(_localctx, 18, RULE_entityDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(Define);
			setState(124);
			dataType();
			setState(125);
			match(Colon);
			setState(126);
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
		enterRule(_localctx, 20, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(128);
				comment();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(Define);
			setState(135);
			match(Function);
			setState(136);
			match(Colon);
			setState(137);
			match(ID);
			setState(138);
			match(OpenBracket);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(139);
				definitionArgumentSpec();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(CloseBracket);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(146);
				match(Colon);
				setState(147);
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
		enterRule(_localctx, 22, RULE_definitionArgumentSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ID);
			setState(151);
			match(Colon);
			setState(152);
			dataType();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(153);
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
		enterRule(_localctx, 24, RULE_endClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ReturnKeyword:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				returnStatement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				functionCall();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ReturnKeyword);
			setState(163);
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
		enterRule(_localctx, 30, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ReturnKeyword || _la==ID) {
				{
				{
				setState(165);
				statement();
				}
				}
				setState(170);
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
		enterRule(_localctx, 32, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			functionDefinition();
			setState(172);
			functionBody();
			setState(173);
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
		enterRule(_localctx, 34, RULE_entityComponent);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				propertyDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
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
		enterRule(_localctx, 36, RULE_propertyDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Define);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(181);
				mandatoryModifier();
				}
			}

			setState(184);
			match(T__5);
			setState(185);
			match(ID);
			setState(186);
			match(Colon);
			setState(187);
			dataType();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equals) {
				{
				setState(188);
				match(Equals);
				setState(189);
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
		enterRule(_localctx, 38, RULE_propertyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ID);
			setState(193);
			match(Equals);
			setState(194);
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
		enterRule(_localctx, 40, RULE_mandatoryModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__6);
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
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(Equals);
			setState(199);
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
		enterRule(_localctx, 44, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(202);
			match(OpenBracket);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << StringLiteral) | (1L << True) | (1L << False) | (1L << ID))) != 0)) {
				{
				{
				setState(203);
				argumentSpec();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
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
		enterRule(_localctx, 46, RULE_argumentSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			expression();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(212);
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
		enterRule(_localctx, 48, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
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
		enterRule(_localctx, 50, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			atom();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Addition) | (1L << Minus) | (1L << Times) | (1L << Devision))) != 0)) {
				{
				{
				setState(218);
				arithmeticExpressionComponent();
				}
				}
				setState(223);
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
		enterRule(_localctx, 52, RULE_arithmeticExpressionComponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			arithmeticOperator();
			setState(225);
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
		public TerminalNode True() { return getToken(vNESParser.True, 0); }
		public TerminalNode False() { return getToken(vNESParser.False, 0); }
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
		enterRule(_localctx, 54, RULE_atom);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(True);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				match(False);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\3\3\3\3\3\3\4\7"+
		"\4B\n\4\f\4\16\4E\13\4\3\5\3\5\3\6\6\6J\n\6\r\6\16\6K\3\6\6\6O\n\6\r\6"+
		"\16\6P\7\6S\n\6\f\6\16\6V\13\6\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\7"+
		"\3\7\3\b\3\b\5\bd\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\7\nn\n\n\f\n\16"+
		"\nq\13\n\3\n\3\n\3\n\3\n\7\nw\n\n\f\n\16\nz\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\7\f\u0084\n\f\f\f\16\f\u0087\13\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u008f\n\f\f\f\16\f\u0092\13\f\3\f\3\f\3\f\5\f\u0097\n\f\3\r\3\r"+
		"\3\r\3\r\5\r\u009d\n\r\3\16\3\16\3\17\3\17\5\17\u00a3\n\17\3\20\3\20\3"+
		"\20\3\21\7\21\u00a9\n\21\f\21\16\21\u00ac\13\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\5\23\u00b5\n\23\3\24\3\24\5\24\u00b9\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00c1\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\7\30\u00cf\n\30\f\30\16\30\u00d2\13\30\3\30\3\30"+
		"\3\31\3\31\5\31\u00d8\n\31\3\32\3\32\3\33\3\33\7\33\u00de\n\33\f\33\16"+
		"\33\u00e1\13\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00ec"+
		"\n\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668\2\5\3\2\31\31\6\2\5\6\13\13\16\16\36\36\3\2\37\"\2\u00ef\2:\3"+
		"\2\2\2\4=\3\2\2\2\6C\3\2\2\2\bF\3\2\2\2\nT\3\2\2\2\fW\3\2\2\2\16a\3\2"+
		"\2\2\20i\3\2\2\2\22o\3\2\2\2\24}\3\2\2\2\26\u0085\3\2\2\2\30\u0098\3\2"+
		"\2\2\32\u009e\3\2\2\2\34\u00a2\3\2\2\2\36\u00a4\3\2\2\2 \u00aa\3\2\2\2"+
		"\"\u00ad\3\2\2\2$\u00b4\3\2\2\2&\u00b6\3\2\2\2(\u00c2\3\2\2\2*\u00c6\3"+
		"\2\2\2,\u00c8\3\2\2\2.\u00cb\3\2\2\2\60\u00d5\3\2\2\2\62\u00d9\3\2\2\2"+
		"\64\u00db\3\2\2\2\66\u00e2\3\2\2\28\u00eb\3\2\2\2:;\7\3\2\2;<\5\6\4\2"+
		"<\3\3\2\2\2=>\7\4\2\2>?\5\6\4\2?\5\3\2\2\2@B\n\2\2\2A@\3\2\2\2BE\3\2\2"+
		"\2CA\3\2\2\2CD\3\2\2\2D\7\3\2\2\2EC\3\2\2\2FG\t\3\2\2G\t\3\2\2\2HJ\5\f"+
		"\7\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LS\3\2\2\2MO\5\20\t\2NM\3"+
		"\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RI\3\2\2\2RN\3\2\2\2SV\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2U\13\3\2\2\2VT\3\2\2\2W\\\5\16\b\2X[\5\22\n"+
		"\2Y[\5\"\22\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3"+
		"\2\2\2^\\\3\2\2\2_`\5\32\16\2`\r\3\2\2\2ac\7\22\2\2bd\7\n\2\2cb\3\2\2"+
		"\2cd\3\2\2\2de\3\2\2\2ef\7\7\2\2fg\7\f\2\2gh\7\36\2\2h\17\3\2\2\2ij\7"+
		"\35\2\2jk\7\36\2\2k\21\3\2\2\2ln\5\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rx\5\24\13\2sw\5\"\22\2tw\5&\24\2uw\5(\25"+
		"\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2"+
		"\2zx\3\2\2\2{|\5\32\16\2|\23\3\2\2\2}~\7\22\2\2~\177\5\b\5\2\177\u0080"+
		"\7\f\2\2\u0080\u0081\7\36\2\2\u0081\25\3\2\2\2\u0082\u0084\5\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\22\2\2\u0089"+
		"\u008a\7\r\2\2\u008a\u008b\7\f\2\2\u008b\u008c\7\36\2\2\u008c\u0090\7"+
		"\23\2\2\u008d\u008f\5\30\r\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0096\7\24\2\2\u0094\u0095\7\f\2\2\u0095\u0097\5\b\5\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\27\3\2\2\2\u0098\u0099\7\36\2"+
		"\2\u0099\u009a\7\f\2\2\u009a\u009c\5\b\5\2\u009b\u009d\7\17\2\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\31\3\2\2\2\u009e\u009f\7\21\2"+
		"\2\u009f\33\3\2\2\2\u00a0\u00a3\5\36\20\2\u00a1\u00a3\5.\30\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a5\7\20\2\2\u00a5"+
		"\u00a6\5\64\33\2\u00a6\37\3\2\2\2\u00a7\u00a9\5\34\17\2\u00a8\u00a7\3"+
		"\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"!\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5\26\f\2\u00ae\u00af\5 \21\2"+
		"\u00af\u00b0\5\32\16\2\u00b0#\3\2\2\2\u00b1\u00b5\5\"\22\2\u00b2\u00b5"+
		"\5&\24\2\u00b3\u00b5\5(\25\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5%\3\2\2\2\u00b6\u00b8\7\22\2\2\u00b7\u00b9\5*\26\2"+
		"\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb"+
		"\7\b\2\2\u00bb\u00bc\7\36\2\2\u00bc\u00bd\7\f\2\2\u00bd\u00c0\5\b\5\2"+
		"\u00be\u00bf\7\30\2\2\u00bf\u00c1\5\64\33\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\'\3\2\2\2\u00c2\u00c3\7\36\2\2\u00c3\u00c4\7\30\2"+
		"\2\u00c4\u00c5\5\64\33\2\u00c5)\3\2\2\2\u00c6\u00c7\7\t\2\2\u00c7+\3\2"+
		"\2\2\u00c8\u00c9\7\30\2\2\u00c9\u00ca\5\64\33\2\u00ca-\3\2\2\2\u00cb\u00cc"+
		"\7\36\2\2\u00cc\u00d0\7\23\2\2\u00cd\u00cf\5\60\31\2\u00ce\u00cd\3\2\2"+
		"\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\24\2\2\u00d4/\3\2\2\2\u00d5"+
		"\u00d7\5\64\33\2\u00d6\u00d8\7\17\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\61\3\2\2\2\u00d9\u00da\t\4\2\2\u00da\63\3\2\2\2\u00db\u00df"+
		"\58\35\2\u00dc\u00de\5\66\34\2\u00dd\u00dc\3\2\2\2\u00de\u00e1\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\65\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e3\5\62\32\2\u00e3\u00e4\58\35\2\u00e4\67\3\2\2\2\u00e5"+
		"\u00ec\7\26\2\2\u00e6\u00ec\5.\30\2\u00e7\u00ec\7\32\2\2\u00e8\u00ec\7"+
		"\36\2\2\u00e9\u00ec\7\33\2\2\u00ea\u00ec\7\34\2\2\u00eb\u00e5\3\2\2\2"+
		"\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec9\3\2\2\2\32CKPRTZ\\covx\u0085\u0090"+
		"\u0096\u009c\u00a2\u00aa\u00b4\u00b8\u00c0\u00d0\u00d7\u00df\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}