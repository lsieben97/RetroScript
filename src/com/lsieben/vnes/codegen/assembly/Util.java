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
}
