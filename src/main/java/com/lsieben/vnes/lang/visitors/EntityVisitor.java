package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.Entity;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class EntityVisitor extends vNESBaseVisitor<Entity> {
    @Override
    public Entity visitEntity(vNESParser.EntityContext ctx) {
        return new Entity(ctx);
    }
}
