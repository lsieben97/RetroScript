package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.CodeBase;
import com.lsieben.retroscript.lang.constructs.FunctionSignature;
import com.lsieben.retroscript.lang.exceptions.errors.InvalidNameException;
import com.lsieben.retroscript.lang.exceptions.errors.ReferenceNotFoundException;
import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionSignatureValidatorTest {

    @Test
    void validFunctionSignature() throws vNESCompilerException {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/functionSignature/validFunctionSignature.rsf");


        FunctionSignature signature = codebase.getSourceFiles().get(0).getModules().get(0).getFunctions().get(0).getSignature();


        FunctionSignatureValidator validator = new FunctionSignatureValidator(signature);
        validator.validate();
    }

    @Test
    void validReturnType() throws vNESCompilerException {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/functionSignature/validReturnType.rsf");


        FunctionSignature signature = codebase.getSourceFiles().get(0).getModules().get(0).getFunctions().get(0).getSignature();

        FunctionSignatureValidator validator = new FunctionSignatureValidator(signature);
        validator.validate();
    }

    @Test
    void validArguments() throws vNESCompilerException {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/functionSignature/validArguments.rsf");


        FunctionSignature signature = codebase.getSourceFiles().get(0).getModules().get(0).getFunctions().get(0).getSignature();

        FunctionSignatureValidator validator = new FunctionSignatureValidator(signature);
        validator.validate();
    }

    @Test
    void validFunctionSignatureWithBuildInType() throws vNESCompilerException {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/functionSignature/validFunctionSignatureWithBuildInType.rsf");


        FunctionSignature signature = codebase.getSourceFiles().get(0).getModules().get(0).getFunctions().get(0).getSignature();

        FunctionSignatureValidator validator = new FunctionSignatureValidator(signature);
        validator.validate();
    }

    @Test()
    void invalidReturnType() {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/functionSignature/invalidReturnType.rsf");
        FunctionSignature signature = codebase.getSourceFiles().get(0).getModules().get(0).getFunctions().get(0).getSignature();

        FunctionSignatureValidator validator = new FunctionSignatureValidator(signature);
        assertThrows(ReferenceNotFoundException.class, validator::validate);
    }

    @Test()
    void invalidArgumentType() {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/functionSignature/invalidArgumentType.rsf");
        FunctionSignature signature = codebase.getSourceFiles().get(0).getModules().get(0).getFunctions().get(0).getSignature();

        FunctionSignatureValidator validator = new FunctionSignatureValidator(signature);
        assertThrows(ReferenceNotFoundException.class, validator::validate);
    }

    @Test()
    void doubleArgumentName() {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/functionSignature/doubleArgumentName.rsf");
        FunctionSignature signature = codebase.getSourceFiles().get(0).getModules().get(0).getFunctions().get(0).getSignature();

        FunctionSignatureValidator validator = new FunctionSignatureValidator(signature);
        assertThrows(InvalidNameException.class, validator::validate);
    }
}