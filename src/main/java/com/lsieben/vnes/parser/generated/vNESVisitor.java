// Generated from C:/Users/Luc/workspace/vNES/src/com/lsieben/vnes/parser\vNES.g4 by ANTLR 4.7
package com.lsieben.vnes.parser.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link vNESParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface vNESVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link vNESParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(vNESParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#docComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocComment(vNESParser.DocCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#entityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityModifier(vNESParser.EntityModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#rest_of_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest_of_line(vNESParser.Rest_of_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(vNESParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(vNESParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(vNESParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#moduleDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDefinition(vNESParser.ModuleDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#useStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStatement(vNESParser.UseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(vNESParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#entityDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityDefinition(vNESParser.EntityDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(vNESParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#functionDefinitionArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitionArgumentList(vNESParser.FunctionDefinitionArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#definitionArgumentSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionArgumentSpec(vNESParser.DefinitionArgumentSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#endClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndClause(vNESParser.EndClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(vNESParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(vNESParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(vNESParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(vNESParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#entityBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityBody(vNESParser.EntityBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#entityComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityComponent(vNESParser.EntityComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(vNESParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#propertyModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyModifier(vNESParser.PropertyModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(vNESParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(vNESParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#argumentSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentSpec(vNESParser.ArgumentSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(vNESParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(vNESParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#expressionComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionComponent(vNESParser.ExpressionComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(vNESParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link vNESParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(vNESParser.AddContext ctx);
}