package org.mfalcier.service;

/**
 * AppleScriptExecutorService interface.
 *
 * Created by mfalcier on 29/03/17.
 */
public interface AppleScriptExecutorService {

    /**
     * It execute the passed bashCommand in an Apple script.
     * @param bashCommand
     */
    void execute(String bashCommand);
}
