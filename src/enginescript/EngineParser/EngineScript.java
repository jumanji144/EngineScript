// Generated from D:/Projects/IntelJProjects/Antlr/src/enginescript\EngineScript.g4 by ANTLR 4.9.1
package enginescript.EngineParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EngineScript extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INCLUDE=1, ENTRY=2, FUNCTION=3, RETURN=4, HEADER=5, STRUCTURE=6, CLASS=7, 
		LPAREN=8, RPAREN=9, LCURLY=10, RCURLY=11, LBRACKET=12, RBRACKET=13, RELATION=14, 
		COMMA=15, SEMI=16, COLON=17, DOT=18, INCREMENT=19, DECREMENT=20, ASSIGN=21, 
		PLUS=22, MINUS=23, POW=24, MUL=25, DIV=26, SMALLER=27, BIGGER=28, ADDASSIGN=29, 
		SUBASSIGN=30, MULASSIGN=31, DIVASSIGN=32, IF=33, ELSE=34, AND=35, OR=36, 
		NOT=37, IDENTIFIER=38, STRINGLITERAL=39, DECIMALLITERAL=40, BOOLLITERAL=41, 
		WS=42;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_expressionStatement = 4, RULE_returnStatement = 5, RULE_comparisonOperator = 6, 
		RULE_ifStatement = 7, RULE_parameterList = 8, RULE_entryParameterStatement = 9, 
		RULE_entryStatement = 10, RULE_functionDeclartion = 11, RULE_requireStatement = 12, 
		RULE_callParameters = 13, RULE_structureStatement = 14, RULE_classStatement = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "expression", "expressionStatement", 
			"returnStatement", "comparisonOperator", "ifStatement", "parameterList", 
			"entryParameterStatement", "entryStatement", "functionDeclartion", "requireStatement", 
			"callParameters", "structureStatement", "classStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'entry'", "'function'", "'return'", "'script'", null, null, 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "','", "';'", "':'", 
			"'.'", "'++'", "'--'", "':='", "'+'", "'-'", "'^'", "'*'", "'/'", "'<'", 
			"'>'", "'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INCLUDE", "ENTRY", "FUNCTION", "RETURN", "HEADER", "STRUCTURE", 
			"CLASS", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", 
			"RELATION", "COMMA", "SEMI", "COLON", "DOT", "INCREMENT", "DECREMENT", 
			"ASSIGN", "PLUS", "MINUS", "POW", "MUL", "DIV", "SMALLER", "BIGGER", 
			"ADDASSIGN", "SUBASSIGN", "MULASSIGN", "DIVASSIGN", "IF", "ELSE", "AND", 
			"OR", "NOT", "IDENTIFIER", "STRINGLITERAL", "DECIMALLITERAL", "BOOLLITERAL", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "EngineScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EngineScript(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(EngineScript.HEADER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EngineScript.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(HEADER);
			setState(33);
			match(IDENTIFIER);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCLUDE) | (1L << ENTRY) | (1L << FUNCTION) | (1L << RETURN) | (1L << STRUCTURE) | (1L << CLASS) | (1L << LPAREN) | (1L << IF) | (1L << IDENTIFIER) | (1L << STRINGLITERAL) | (1L << DECIMALLITERAL) | (1L << WS))) != 0)) {
				{
				setState(34);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			statement();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCLUDE) | (1L << ENTRY) | (1L << FUNCTION) | (1L << RETURN) | (1L << STRUCTURE) | (1L << CLASS) | (1L << LPAREN) | (1L << IF) | (1L << IDENTIFIER) | (1L << STRINGLITERAL) | (1L << DECIMALLITERAL) | (1L << WS))) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FunctionDeclartionContext functionDeclartion() {
			return getRuleContext(FunctionDeclartionContext.class,0);
		}
		public EntryStatementContext entryStatement() {
			return getRuleContext(EntryStatementContext.class,0);
		}
		public EntryParameterStatementContext entryParameterStatement() {
			return getRuleContext(EntryParameterStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode WS() { return getToken(EngineScript.WS, 0); }
		public RequireStatementContext requireStatement() {
			return getRuleContext(RequireStatementContext.class,0);
		}
		public StructureStatementContext structureStatement() {
			return getRuleContext(StructureStatementContext.class,0);
		}
		public ClassStatementContext classStatement() {
			return getRuleContext(ClassStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(44);
				ifStatement();
				}
				break;
			case 2:
				{
				setState(45);
				functionDeclartion();
				}
				break;
			case 3:
				{
				setState(46);
				entryStatement();
				}
				break;
			case 4:
				{
				setState(47);
				entryParameterStatement();
				}
				break;
			case 5:
				{
				setState(48);
				expressionStatement();
				}
				break;
			case 6:
				{
				setState(49);
				match(WS);
				}
				break;
			case 7:
				{
				setState(50);
				requireStatement();
				}
				break;
			case 8:
				{
				setState(51);
				structureStatement();
				}
				break;
			case 9:
				{
				setState(52);
				classStatement();
				}
				break;
			case 10:
				{
				setState(53);
				returnStatement();
				}
				break;
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExpressionContext extends ExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EngineScript.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EngineScript.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(EngineScript.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBracketExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(EngineScript.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EngineScript.RPAREN, 0); }
		public ArithmeticBracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterArithmeticBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitArithmeticBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitArithmeticBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(EngineScript.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EngineScript.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(EngineScript.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EngineScript.RPAREN, 0); }
		public CallParametersContext callParameters() {
			return getRuleContext(CallParametersContext.class,0);
		}
		public MethodCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalExpressionContext extends ExpressionContext {
		public TerminalNode DECIMALLITERAL() { return getToken(EngineScript.DECIMALLITERAL, 0); }
		public DecimalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterDecimalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitDecimalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitDecimalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode STRINGLITERAL() { return getToken(EngineScript.STRINGLITERAL, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(EngineScript.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(EngineScript.RBRACKET, 0); }
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(EngineScript.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(EngineScript.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EngineScript.RPAREN, 0); }
		public CallParametersContext callParameters() {
			return getRuleContext(CallParametersContext.class,0);
		}
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticOrLogicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(EngineScript.MUL, 0); }
		public TerminalNode DIV() { return getToken(EngineScript.DIV, 0); }
		public TerminalNode PLUS() { return getToken(EngineScript.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EngineScript.MINUS, 0); }
		public ArithmeticOrLogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterArithmeticOrLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitArithmeticOrLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitArithmeticOrLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(EngineScript.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(EngineScript.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EngineScript.IDENTIFIER, 0); }
		public FieldExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterFieldExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitFieldExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitFieldExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(57);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				match(STRINGLITERAL);
				}
				break;
			case 3:
				{
				_localctx = new DecimalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(DECIMALLITERAL);
				}
				break;
			case 4:
				{
				_localctx = new ArithmeticBracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(LPAREN);
				setState(61);
				expression(0);
				setState(62);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new CallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(IDENTIFIER);
				setState(65);
				match(LPAREN);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRINGLITERAL) | (1L << DECIMALLITERAL))) != 0)) {
					{
					setState(66);
					callParameters();
					}
				}

				setState(69);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new AssignExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(70);
					match(IDENTIFIER);
					}
					break;
				}
				setState(73);
				match(IDENTIFIER);
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(74);
					match(ASSIGN);
					setState(75);
					expression(0);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(80);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(81);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticOrLogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(83);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(84);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(86);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(87);
						comparisonOperator();
						setState(88);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new FieldExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(91);
						match(DOT);
						setState(92);
						match(IDENTIFIER);
						}
						break;
					case 5:
						{
						_localctx = new MethodCallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94);
						match(DOT);
						setState(95);
						match(IDENTIFIER);
						setState(96);
						match(LPAREN);
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << IDENTIFIER) | (1L << STRINGLITERAL) | (1L << DECIMALLITERAL))) != 0)) {
							{
							setState(97);
							callParameters();
							}
						}

						setState(100);
						match(RPAREN);
						}
						break;
					case 6:
						{
						_localctx = new IndexExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(102);
						match(LBRACKET);
						setState(103);
						expression(0);
						setState(104);
						match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EngineScript.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			expression(0);
			setState(112);
			match(SEMI);
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
		public TerminalNode RETURN() { return getToken(EngineScript.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(RETURN);
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(115);
				expression(0);
				}
				break;
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode RELATION() { return getToken(EngineScript.RELATION, 0); }
		public TerminalNode BIGGER() { return getToken(EngineScript.BIGGER, 0); }
		public TerminalNode SMALLER() { return getToken(EngineScript.SMALLER, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RELATION) | (1L << SMALLER) | (1L << BIGGER))) != 0)) ) {
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EngineScript.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LCURLY() { return getTokens(EngineScript.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(EngineScript.LCURLY, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(EngineScript.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(EngineScript.RCURLY, i);
		}
		public TerminalNode ELSE() { return getToken(EngineScript.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IF);
			setState(121);
			expression(0);
			setState(122);
			match(LCURLY);
			setState(123);
			block();
			setState(124);
			match(RCURLY);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(125);
				match(ELSE);
				setState(126);
				match(LCURLY);
				setState(127);
				block();
				setState(128);
				match(RCURLY);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(EngineScript.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EngineScript.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EngineScript.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EngineScript.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IDENTIFIER);
			setState(133);
			match(IDENTIFIER);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				match(IDENTIFIER);
				setState(136);
				match(IDENTIFIER);
				}
				}
				setState(141);
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

	public static class EntryParameterStatementContext extends ParserRuleContext {
		public TerminalNode ENTRY() { return getToken(EngineScript.ENTRY, 0); }
		public TerminalNode LPAREN() { return getToken(EngineScript.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EngineScript.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(EngineScript.LCURLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(EngineScript.RCURLY, 0); }
		public EntryParameterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryParameterStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterEntryParameterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitEntryParameterStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitEntryParameterStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryParameterStatementContext entryParameterStatement() throws RecognitionException {
		EntryParameterStatementContext _localctx = new EntryParameterStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_entryParameterStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ENTRY);
			setState(143);
			match(LPAREN);
			setState(144);
			parameterList();
			setState(145);
			match(RPAREN);
			setState(146);
			match(LCURLY);
			setState(147);
			block();
			setState(148);
			match(RCURLY);
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

	public static class EntryStatementContext extends ParserRuleContext {
		public TerminalNode ENTRY() { return getToken(EngineScript.ENTRY, 0); }
		public TerminalNode LCURLY() { return getToken(EngineScript.LCURLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(EngineScript.RCURLY, 0); }
		public EntryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterEntryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitEntryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitEntryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntryStatementContext entryStatement() throws RecognitionException {
		EntryStatementContext _localctx = new EntryStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_entryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ENTRY);
			setState(151);
			match(LCURLY);
			setState(152);
			block();
			setState(153);
			match(RCURLY);
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

	public static class FunctionDeclartionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(EngineScript.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EngineScript.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(EngineScript.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EngineScript.RPAREN, 0); }
		public TerminalNode LCURLY() { return getToken(EngineScript.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(EngineScript.RCURLY, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclartionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclartion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterFunctionDeclartion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitFunctionDeclartion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitFunctionDeclartion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclartionContext functionDeclartion() throws RecognitionException {
		FunctionDeclartionContext _localctx = new FunctionDeclartionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionDeclartion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(FUNCTION);
			setState(156);
			match(IDENTIFIER);
			setState(157);
			match(LPAREN);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(158);
				parameterList();
				}
			}

			setState(161);
			match(RPAREN);
			setState(162);
			match(LCURLY);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCLUDE) | (1L << ENTRY) | (1L << FUNCTION) | (1L << RETURN) | (1L << STRUCTURE) | (1L << CLASS) | (1L << LPAREN) | (1L << IF) | (1L << IDENTIFIER) | (1L << STRINGLITERAL) | (1L << DECIMALLITERAL) | (1L << WS))) != 0)) {
				{
				setState(163);
				block();
				}
			}

			setState(166);
			match(RCURLY);
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

	public static class RequireStatementContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(EngineScript.INCLUDE, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(EngineScript.STRINGLITERAL, 0); }
		public TerminalNode SEMI() { return getToken(EngineScript.SEMI, 0); }
		public RequireStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requireStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterRequireStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitRequireStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitRequireStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequireStatementContext requireStatement() throws RecognitionException {
		RequireStatementContext _localctx = new RequireStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_requireStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(INCLUDE);
			setState(169);
			match(STRINGLITERAL);
			setState(170);
			match(SEMI);
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

	public static class CallParametersContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EngineScript.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EngineScript.COMMA, i);
		}
		public CallParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterCallParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitCallParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitCallParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallParametersContext callParameters() throws RecognitionException {
		CallParametersContext _localctx = new CallParametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			expression(0);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				expression(0);
				}
				}
				setState(179);
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

	public static class StructureStatementContext extends ParserRuleContext {
		public TerminalNode STRUCTURE() { return getToken(EngineScript.STRUCTURE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EngineScript.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EngineScript.IDENTIFIER, i);
		}
		public TerminalNode LCURLY() { return getToken(EngineScript.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(EngineScript.RCURLY, 0); }
		public List<TerminalNode> SEMI() { return getTokens(EngineScript.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(EngineScript.SEMI, i);
		}
		public StructureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterStructureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitStructureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitStructureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureStatementContext structureStatement() throws RecognitionException {
		StructureStatementContext _localctx = new StructureStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_structureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(STRUCTURE);
			setState(181);
			match(IDENTIFIER);
			setState(182);
			match(LCURLY);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(183);
				match(IDENTIFIER);
				setState(184);
				match(IDENTIFIER);
				setState(185);
				match(SEMI);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(RCURLY);
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

	public static class ClassStatementContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(EngineScript.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(EngineScript.IDENTIFIER, 0); }
		public TerminalNode LCURLY() { return getToken(EngineScript.LCURLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(EngineScript.RCURLY, 0); }
		public ClassStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).enterClassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EngineScriptListener ) ((EngineScriptListener)listener).exitClassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EngineScriptVisitor ) return ((EngineScriptVisitor<? extends T>)visitor).visitClassStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassStatementContext classStatement() throws RecognitionException {
		ClassStatementContext _localctx = new ClassStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_classStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(CLASS);
			setState(194);
			match(IDENTIFIER);
			setState(195);
			match(LCURLY);
			setState(196);
			block();
			setState(197);
			match(RCURLY);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\5\2&\n\2\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5F\n\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\5\5O\n\5\5\5Q\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5e\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13\5\3\6\3\6\3\6\3\7\3\7\5\7w"+
		"\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0085\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00a2\n\r"+
		"\3\r\3\r\3\r\5\r\u00a7\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\7\17\u00b2\n\17\f\17\16\17\u00b5\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00bd\n\20\f\20\16\20\u00c0\13\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\2\3\b\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3"+
		"\2\33\34\3\2\30\31\4\2\20\20\35\36\2\u00da\2\"\3\2\2\2\4\'\3\2\2\2\68"+
		"\3\2\2\2\bP\3\2\2\2\nq\3\2\2\2\ft\3\2\2\2\16x\3\2\2\2\20z\3\2\2\2\22\u0086"+
		"\3\2\2\2\24\u0090\3\2\2\2\26\u0098\3\2\2\2\30\u009d\3\2\2\2\32\u00aa\3"+
		"\2\2\2\34\u00ae\3\2\2\2\36\u00b6\3\2\2\2 \u00c3\3\2\2\2\"#\7\7\2\2#%\7"+
		"(\2\2$&\5\4\3\2%$\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'+\5\6\4\2(*\5\6\4\2)("+
		"\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-+\3\2\2\2.9\5\20\t\2"+
		"/9\5\30\r\2\609\5\26\f\2\619\5\24\13\2\629\5\n\6\2\639\7,\2\2\649\5\32"+
		"\16\2\659\5\36\20\2\669\5 \21\2\679\5\f\7\28.\3\2\2\28/\3\2\2\28\60\3"+
		"\2\2\28\61\3\2\2\28\62\3\2\2\28\63\3\2\2\28\64\3\2\2\28\65\3\2\2\28\66"+
		"\3\2\2\28\67\3\2\2\29\7\3\2\2\2:;\b\5\1\2;Q\7(\2\2<Q\7)\2\2=Q\7*\2\2>"+
		"?\7\n\2\2?@\5\b\5\2@A\7\13\2\2AQ\3\2\2\2BC\7(\2\2CE\7\n\2\2DF\5\34\17"+
		"\2ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GQ\7\13\2\2HJ\7(\2\2IH\3\2\2\2IJ\3\2\2"+
		"\2JK\3\2\2\2KN\7(\2\2LM\7\27\2\2MO\5\b\5\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2"+
		"\2P:\3\2\2\2P<\3\2\2\2P=\3\2\2\2P>\3\2\2\2PB\3\2\2\2PI\3\2\2\2Qn\3\2\2"+
		"\2RS\f\13\2\2ST\t\2\2\2Tm\5\b\5\fUV\f\n\2\2VW\t\3\2\2Wm\5\b\5\13XY\f\b"+
		"\2\2YZ\5\16\b\2Z[\5\b\5\t[m\3\2\2\2\\]\f\6\2\2]^\7\24\2\2^m\7(\2\2_`\f"+
		"\5\2\2`a\7\24\2\2ab\7(\2\2bd\7\n\2\2ce\5\34\17\2dc\3\2\2\2de\3\2\2\2e"+
		"f\3\2\2\2fm\7\13\2\2gh\f\4\2\2hi\7\16\2\2ij\5\b\5\2jk\7\17\2\2km\3\2\2"+
		"\2lR\3\2\2\2lU\3\2\2\2lX\3\2\2\2l\\\3\2\2\2l_\3\2\2\2lg\3\2\2\2mp\3\2"+
		"\2\2nl\3\2\2\2no\3\2\2\2o\t\3\2\2\2pn\3\2\2\2qr\5\b\5\2rs\7\22\2\2s\13"+
		"\3\2\2\2tv\7\6\2\2uw\5\b\5\2vu\3\2\2\2vw\3\2\2\2w\r\3\2\2\2xy\t\4\2\2"+
		"y\17\3\2\2\2z{\7#\2\2{|\5\b\5\2|}\7\f\2\2}~\5\4\3\2~\u0084\7\r\2\2\177"+
		"\u0080\7$\2\2\u0080\u0081\7\f\2\2\u0081\u0082\5\4\3\2\u0082\u0083\7\r"+
		"\2\2\u0083\u0085\3\2\2\2\u0084\177\3\2\2\2\u0084\u0085\3\2\2\2\u0085\21"+
		"\3\2\2\2\u0086\u0087\7(\2\2\u0087\u008d\7(\2\2\u0088\u0089\7\21\2\2\u0089"+
		"\u008a\7(\2\2\u008a\u008c\7(\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\23\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0091\7\4\2\2\u0091\u0092\7\n\2\2\u0092\u0093\5\22\n\2"+
		"\u0093\u0094\7\13\2\2\u0094\u0095\7\f\2\2\u0095\u0096\5\4\3\2\u0096\u0097"+
		"\7\r\2\2\u0097\25\3\2\2\2\u0098\u0099\7\4\2\2\u0099\u009a\7\f\2\2\u009a"+
		"\u009b\5\4\3\2\u009b\u009c\7\r\2\2\u009c\27\3\2\2\2\u009d\u009e\7\5\2"+
		"\2\u009e\u009f\7(\2\2\u009f\u00a1\7\n\2\2\u00a0\u00a2\5\22\n\2\u00a1\u00a0"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\13\2\2"+
		"\u00a4\u00a6\7\f\2\2\u00a5\u00a7\5\4\3\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\r\2\2\u00a9\31\3\2\2\2\u00aa"+
		"\u00ab\7\3\2\2\u00ab\u00ac\7)\2\2\u00ac\u00ad\7\22\2\2\u00ad\33\3\2\2"+
		"\2\u00ae\u00b3\5\b\5\2\u00af\u00b0\7\21\2\2\u00b0\u00b2\5\b\5\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\35\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8"+
		"\7(\2\2\u00b8\u00be\7\f\2\2\u00b9\u00ba\7(\2\2\u00ba\u00bb\7(\2\2\u00bb"+
		"\u00bd\7\22\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\7\r\2\2\u00c2\37\3\2\2\2\u00c3\u00c4\7\t\2\2\u00c4\u00c5\7(\2\2"+
		"\u00c5\u00c6\7\f\2\2\u00c6\u00c7\5\4\3\2\u00c7\u00c8\7\r\2\2\u00c8!\3"+
		"\2\2\2\23%+8EINPdlnv\u0084\u008d\u00a1\u00a6\u00b3\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}