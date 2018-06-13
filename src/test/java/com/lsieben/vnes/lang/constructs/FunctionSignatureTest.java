package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.visitors.FunctionSignatureVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;
import com.lsieben.vnes.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionSignatureTest {
    @Test
    void noReturnTypeNoArguments() {
        String code = TestUtils.getFileFromResource("/functionSignature/noReturnTypeNoArguments.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        FunctionSignature signature = new FunctionSignatureVisitor().visitFunctionDefinition(parser.functionDefinition());
        assertNotNull(signature, "Function signature was not recognized by parser");
        assertEquals(signature.getName(), "Test", "Function signature does not have Test as name.");
        assertEquals(signature.hasReturnType(), false, "Function signature does have a return type.");
    }

    @Test
    void ReturnTypeNoArguments() {
        String code = TestUtils.getFileFromResource("/functionSignature/returnTypeNoArguments.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        FunctionSignature signature = new FunctionSignatureVisitor().visitFunctionDefinition(parser.functionDefinition());
        assertNotNull(signature, "Function signature was not recognized by parser");
        assertEquals(signature.getName(), "Test", "Function signature does not have Test as name.");
        assertEquals(signature.hasReturnType(), true, "Function signature does not have a return type.");
    }

    @Test
    void ReturnType1Argument() {
        String code = TestUtils.getFileFromResource("/functionSignature/returnType1Argument.vns");
        vNESParser parser = TestUtils.getParserForString(code);

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
        vNESParser parser = TestUtils.getParserForString(code);

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
        vNESParser parser = TestUtils.getParserForString(code);

        FunctionSignature signature = new FunctionSignatureVisitor().visitFunctionDefinition(parser.functionDefinition());
        assertNotNull(signature, "Function signature was not recognized by parser");
        assertEquals(signature.getName(), "Test", "Function signature does not have Test as name.");
        assertEquals(signature.hasReturnType(), true, "Function signature does not have a return type.");
        assertNotNull(signature.getArguments(), "Function signature does not have arguments.");
        assertEquals(signature.getArguments().size(), 2, "Function signature does not have exactly 2 arguments.");
    }
}