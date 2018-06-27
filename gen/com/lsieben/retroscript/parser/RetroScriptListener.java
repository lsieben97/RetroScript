// Generated from C:/Users/Luc/workspace/vNES/src/main/java/com/lsieben/retroscript/parser\RetroScript.g4 by ANTLR 4.7
package com.lsieben.retroscript.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RetroScriptParser}.
 */
public interface RetroScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(RetroScriptParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(RetroScriptParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#docComment}.
	 * @param ctx the parse tree
	 */
	void enterDocComment(RetroScriptParser.DocCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#docComment}.
	 * @param ctx the parse tree
	 */
	void exitDocComment(RetroScriptParser.DocCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#rest_of_line}.
	 * @param ctx the parse tree
	 */
	void enterRest_of_line(RetroScriptParser.Rest_of_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#rest_of_line}.
	 * @param ctx the parse tree
	 */
	void exitRest_of_line(RetroScriptParser.Rest_of_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(RetroScriptParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(RetroScriptParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(RetroScriptParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(RetroScriptParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(RetroScriptParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(RetroScriptParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModuleDefinition(RetroScriptParser.ModuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModuleDefinition(RetroScriptParser.ModuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(RetroScriptParser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(RetroScriptParser.UseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(RetroScriptParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(RetroScriptParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#entityDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEntityDefinition(RetroScriptParser.EntityDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#entityDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEntityDefinition(RetroScriptParser.EntityDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(RetroScriptParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(RetroScriptParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#definitionArgumentSpec}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionArgumentSpec(RetroScriptParser.DefinitionArgumentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#definitionArgumentSpec}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionArgumentSpec(RetroScriptParser.DefinitionArgumentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#endClause}.
	 * @param ctx the parse tree
	 */
	void enterEndClause(RetroScriptParser.EndClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#endClause}.
	 * @param ctx the parse tree
	 */
	void exitEndClause(RetroScriptParser.EndClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RetroScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RetroScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(RetroScriptParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(RetroScriptParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(RetroScriptParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(RetroScriptParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(RetroScriptParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(RetroScriptParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#entityComponent}.
	 * @param ctx the parse tree
	 */
	void enterEntityComponent(RetroScriptParser.EntityComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#entityComponent}.
	 * @param ctx the parse tree
	 */
	void exitEntityComponent(RetroScriptParser.EntityComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefinition(RetroScriptParser.PropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefinition(RetroScriptParser.PropertyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyAssignment(RetroScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyAssignment(RetroScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#mandatoryModifier}.
	 * @param ctx the parse tree
	 */
	void enterMandatoryModifier(RetroScriptParser.MandatoryModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#mandatoryModifier}.
	 * @param ctx the parse tree
	 */
	void exitMandatoryModifier(RetroScriptParser.MandatoryModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RetroScriptParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RetroScriptParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(RetroScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(RetroScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#argumentSpec}.
	 * @param ctx the parse tree
	 */
	void enterArgumentSpec(RetroScriptParser.ArgumentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#argumentSpec}.
	 * @param ctx the parse tree
	 */
	void exitArgumentSpec(RetroScriptParser.ArgumentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(RetroScriptParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(RetroScriptParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RetroScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RetroScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#arithmeticExpressionComponent}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpressionComponent(RetroScriptParser.ArithmeticExpressionComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#arithmeticExpressionComponent}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpressionComponent(RetroScriptParser.ArithmeticExpressionComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RetroScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(RetroScriptParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link RetroScriptParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(RetroScriptParser.AtomContext ctx);
}