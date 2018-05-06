// Generated from C:/Users/Luc/workspace/vNES/src/com/lsieben/vnes/parser\vNES.g4 by ANTLR 4.7
package com.lsieben.vnes.parser.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link vNESParser}.
 */
public interface vNESListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link vNESParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(vNESParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(vNESParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#docComment}.
	 * @param ctx the parse tree
	 */
	void enterDocComment(vNESParser.DocCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#docComment}.
	 * @param ctx the parse tree
	 */
	void exitDocComment(vNESParser.DocCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#entityModifier}.
	 * @param ctx the parse tree
	 */
	void enterEntityModifier(vNESParser.EntityModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#entityModifier}.
	 * @param ctx the parse tree
	 */
	void exitEntityModifier(vNESParser.EntityModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#rest_of_line}.
	 * @param ctx the parse tree
	 */
	void enterRest_of_line(vNESParser.Rest_of_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#rest_of_line}.
	 * @param ctx the parse tree
	 */
	void exitRest_of_line(vNESParser.Rest_of_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(vNESParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(vNESParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(vNESParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(vNESParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(vNESParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(vNESParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModuleDefinition(vNESParser.ModuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModuleDefinition(vNESParser.ModuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(vNESParser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(vNESParser.UseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(vNESParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(vNESParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#entityDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEntityDefinition(vNESParser.EntityDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#entityDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEntityDefinition(vNESParser.EntityDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(vNESParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(vNESParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#functionDefinitionArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitionArgumentList(vNESParser.FunctionDefinitionArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#functionDefinitionArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitionArgumentList(vNESParser.FunctionDefinitionArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#definitionArgumentSpec}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionArgumentSpec(vNESParser.DefinitionArgumentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#definitionArgumentSpec}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionArgumentSpec(vNESParser.DefinitionArgumentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#endClause}.
	 * @param ctx the parse tree
	 */
	void enterEndClause(vNESParser.EndClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#endClause}.
	 * @param ctx the parse tree
	 */
	void exitEndClause(vNESParser.EndClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(vNESParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(vNESParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(vNESParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(vNESParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(vNESParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(vNESParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(vNESParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(vNESParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#entityBody}.
	 * @param ctx the parse tree
	 */
	void enterEntityBody(vNESParser.EntityBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#entityBody}.
	 * @param ctx the parse tree
	 */
	void exitEntityBody(vNESParser.EntityBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#entityComponent}.
	 * @param ctx the parse tree
	 */
	void enterEntityComponent(vNESParser.EntityComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#entityComponent}.
	 * @param ctx the parse tree
	 */
	void exitEntityComponent(vNESParser.EntityComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(vNESParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(vNESParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void enterPropertyModifier(vNESParser.PropertyModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#propertyModifier}.
	 * @param ctx the parse tree
	 */
	void exitPropertyModifier(vNESParser.PropertyModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(vNESParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(vNESParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(vNESParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(vNESParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#argumentSpec}.
	 * @param ctx the parse tree
	 */
	void enterArgumentSpec(vNESParser.ArgumentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#argumentSpec}.
	 * @param ctx the parse tree
	 */
	void exitArgumentSpec(vNESParser.ArgumentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(vNESParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(vNESParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(vNESParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(vNESParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#expressionComponent}.
	 * @param ctx the parse tree
	 */
	void enterExpressionComponent(vNESParser.ExpressionComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#expressionComponent}.
	 * @param ctx the parse tree
	 */
	void exitExpressionComponent(vNESParser.ExpressionComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(vNESParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(vNESParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link vNESParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(vNESParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link vNESParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(vNESParser.AddContext ctx);
}