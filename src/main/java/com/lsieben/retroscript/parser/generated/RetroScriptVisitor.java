// Generated from C:/Users/Luc/workspace/vNES/src/main/java/com/lsieben/retroscript/parser\RetroScript.g4 by ANTLR 4.7
package com.lsieben.retroscript.parser.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RetroScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RetroScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(RetroScriptParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#docComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocComment(RetroScriptParser.DocCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#rest_of_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest_of_line(RetroScriptParser.Rest_of_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(RetroScriptParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(RetroScriptParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(RetroScriptParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#moduleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDefinition(RetroScriptParser.ModuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#useStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStatement(RetroScriptParser.UseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(RetroScriptParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#entityDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityDefinition(RetroScriptParser.EntityDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(RetroScriptParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#definitionArgumentSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionArgumentSpec(RetroScriptParser.DefinitionArgumentSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#endClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndClause(RetroScriptParser.EndClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RetroScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(RetroScriptParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(RetroScriptParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(RetroScriptParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#entityComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityComponent(RetroScriptParser.EntityComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#propertyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDefinition(RetroScriptParser.PropertyDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#propertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAssignment(RetroScriptParser.PropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#mandatoryModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMandatoryModifier(RetroScriptParser.MandatoryModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(RetroScriptParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(RetroScriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#argumentSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentSpec(RetroScriptParser.ArgumentSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(RetroScriptParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RetroScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#arithmeticExpressionComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpressionComponent(RetroScriptParser.ArithmeticExpressionComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RetroScriptParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(RetroScriptParser.AtomContext ctx);
}