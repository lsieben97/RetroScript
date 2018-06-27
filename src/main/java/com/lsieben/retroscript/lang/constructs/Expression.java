package com.lsieben.retroscript.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class Expression extends LanguageConstruct {
    private ExpressionAtom atom;
    private List<ArithmeticExpressionComponent> components = new ArrayList<>();

    public Expression(ParserRuleContext context) {
        super(context);
    }

    public ExpressionAtom getAtom() {
        return atom;
    }

    public void setAtom(ExpressionAtom atom) {
        this.atom = atom;
    }

    public List<ArithmeticExpressionComponent> getComponents() {
        return components;
    }

    public void setComponents(List<ArithmeticExpressionComponent> components) {
        this.components = components;
    }
}
