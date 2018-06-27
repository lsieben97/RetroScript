package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.visitors.FunctionSignatureVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionSignatureTest {
    @Test
    void noReturnTypeNoArguments() {
        String code = TestUtils.getFileFromResource("/functionSignature/noReturnTypeNoArguments.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        FunctionSignature signature = new FunctionSignatureVisitor().visitFunctionDefinition(parser.functionDefinition());
        assertNotNull(signature, "Function signature was not recognized by parser");
        assertEquals(signature.getName(), "Test", "Function signature does not have Test as name.");
        assertEquals(signature.hasReturnType(), false, "Function signature does have a return type.");
    }

    @Test
    void ReturnTypeNoArguments() {
        String code = TestUtils.getFileFromResource("/functionSignature/returnTypeNoArguments.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        FunctionSignature signature = new FunctionSignatureVisitor().visitFunctionDefinition(parser.functionDefinition());
        assertNotNull(signature, "Function signature was not recognized by parser");
        assertEquals(signature.getName(), "Test", "Function signature does not have Test as name.");
        assertEquals(signature.hasReturnType(), true, "Function signature does not have a return type.");
    }

    @Test
    void ReturnType1Argument() {
        String code = TestUtils.getFileFromResource("/functionSignature/returnType1Argument.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        FunctionSignature signature = new FunctionSignatureVisitor().visitFunctionDefinition(parser.functionDefinition());
        assertNotNull(signature, "Function signature was not recognized by parser");
        assertEquals(signature.getName(), "Test", "Function signature does not have Test as name.");
        assertEquals(signature.hasReturnType(), true, "Function signature does not have a return type.");
        assertNotNull(signature.getArguments(), "Function signature does not have arguments.");
        assertEquals(signature.getArguments().size(), 1, "Function signature does not have exactly 1 argument.");
    }

    @Test
    void ReturnTypeMultipleArguments() {
        String code = TestUtils.getFileFromResource("/functionSignature/returnTypeMultipleArguments.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        FunctionSignature signature = new FunctionSignatureVisitor().visitFunctionDefinition(parser.functionDefinition());
        assertNotNull(signature, "Function signature was not recognized by parser");
        assertEquals(signature.getName(), "Test", "Function signature does not have Test as name.");
        assertEquals(signature.hasReturnType(), true, "Function signature does not have a return type.");
        assertNotNull(signature.getArguments(), "Function signature does not have arguments.");
        assertEquals(signature.getArguments().size(), 2, "Function signature does not have exactly 2 arguments.");
    }

    @Test
    void ReturnTypeMultipleArgumentsWithoutComma() {
        String code = TestUtils.getFileFromResource("/functionSignature/returnTypeMultipleArgumentsWithoutComma.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        FunctionSignature signature = new FunctionSignatureVisitor().visitFunctionDefinition(parser.functionDefinition());
        assertNotNull(signature, "Function signature was not recognized by parser");
        assertEquals(signature.getName(), "Test", "Function signature does not have Test as name.");
        assertEquals(signature.hasReturnType(), true, "Function signature does not have a return type.");
        assertNotNull(signature.getArguments(), "Function signature does not have arguments.");
        assertEquals(signature.getArguments().size(), 2, "Function signature does not have exactly 2 arguments.");
    }
}