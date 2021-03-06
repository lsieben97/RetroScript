package com.lsieben.retroscript.lang.constructs.statements;

import com.lsieben.retroscript.lang.constructs.Expression;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall extends Statement {
    private String name;
    private List<Expression> arguments = new ArrayList<>();

    public FunctionCall(ParserRuleContext context) {
        super(context);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Expression> getArguments() {
        return arguments;
    }

    public void setArguments(List<Expression> arguments) {
        this.arguments = arguments;
    }
}
