package com.lsieben.retroscript.logger;

import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptWarning;

public interface LoggingProvider {
    String getInfo(String info);
    String getDebug(String debug);
    String getWarning(String warning);
    String getWarning(RetroScriptWarning warning);

    String getError(String error);
    String getError(RetroScriptCompilerException error);


}
