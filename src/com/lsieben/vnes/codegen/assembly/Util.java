package com.lsieben.vnes.codegen.assembly;

import javax.xml.bind.DatatypeConverter;

public class Util {
    /**
     * Quick method for converting an hex string to a byte array (because all assembly documentation uses them)
     * @param s The string to convert.
     * @return The byte array representation of the string.
     */
    public static byte[] tba(String s) {
        return DatatypeConverter.parseHexBinary(s);
    }

    /**
     * Quick method for converting an hex string to a byte array (because all assembly documentation uses them)
     * @param s The string to convert.
     * @return The byte array representation of the string.
     */
    public static byte tb(String s) {
        return DatatypeConverter.parseHexBinary(s)[0];
    }

    /**
     * Get the amount of bytes the argument of an opcode uses.
     * @param addressingMode The addressing mode to get the amount for.
     * @return The amount of bytes the argument of an opcode uses.
     */
    public static int getSizeForAddressingMode(AddressingMode addressingMode) {
        switch(addressingMode){

            case Immediate:
                return 0;
            case Absolute:
                return 1;
            case ZeroPage:
                return 0;
            case Implied:
                return 0;
            case IndirectX:
                return 0;
            case AbsoluteIndexedX:
                return 0;
            case AbsoluteIndexedY:
                return 0;
            case ZeroPageIndexedX:
                return 0;
            case ZeroPageIndexedY:
                return 0;
            case IndirectY:
                return 0;
            case Relative:
                return 0;
            case Accumulator:
                return 0;
            default:
                return 0;
        }
    }
}
