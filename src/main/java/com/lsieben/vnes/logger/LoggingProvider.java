package com.lsieben.vnes.logger;

import com.lsieben.vnes.lang.exceptions.vNESCompilerException;
import com.lsieben.vnes.lang.exceptions.vNESWarning;

public interface LoggingProvider {
    String getInfo(String info);
    String getDebug(String debug);
    String getWarning(String warning);
    String getWarning(vNESWarning warning);

    String getError(String error);
    String getError(vNESCompilerException error);


}
