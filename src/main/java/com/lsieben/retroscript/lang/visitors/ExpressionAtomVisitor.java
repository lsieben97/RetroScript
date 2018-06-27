package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.DataType;
import com.lsieben.retroscript.lang.constructs.ExpressionAtom;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

public class ExpressionAtomVisitor extends RetroScriptBaseVisitor<ExpressionAtom> {
    @Override
    public ExpressionAtom visitAtom(RetroScriptParser.AtomContext ctx) {
        ExpressionAtom atom = new ExpressionAtom(ctx);

        if (ctx.ID() != null) {
            atom.setType(new DataType("ID"));
            atom.setId(ctx.ID().getText());
        } else if (ctx.INT() != null) {
            atom.setType(new DataType("NUMBER"));
            atom.setInteger(Integer.parseInt(ctx.INT().getText()));
        } else if (ctx.StringLiteral() != null) {
            atom.setType(new DataType("STRING"));
            String literal = ctx.StringLiteral().getText();
            atom.setString(literal.substring(1, literal.length() - 1));
        } else if (ctx.functionCall() != null) {
            atom.setType(new DataType("FUNCTION"));
            atom.setFunctionCall(ctx.functionCall().accept(new FunctionCallVisitor()));
        } else if (ctx.False() != null) {
            atom.setType(new DataType("BOOLEAN"));
            atom.setBooleanValue(false);
        } else if (ctx.True() != null) {
            atom.setType(new DataType("BOOLEAN"));
            atom.setBooleanValue(true);
        }

        return atom;
    }
}
