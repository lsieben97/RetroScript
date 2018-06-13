package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.DataType;
import com.lsieben.vnes.lang.constructs.ExpressionAtom;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class ExpressionAtomVisitor extends vNESBaseVisitor<ExpressionAtom> {
    @Override
    public ExpressionAtom visitAtom(vNESParser.AtomContext ctx) {
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
        }

        return atom;
    }
}
