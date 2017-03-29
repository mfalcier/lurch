package org.mfalcier.lurch.service.impl;

import org.mfalcier.lurch.service.AppleScriptExecutorService;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Main AppleScriptExecutorService implementation with iTerm2.
 *
 * Created by mfalcier on 29/03/17.
 */
@Service
public class AppleScriptExecutorServiceITerm2Service implements AppleScriptExecutorService {

    private String head =
            "tell application \"iTerm2\"\n" +
            "set newWindow to (create window with default profile)\n" +
            "tell current session of newWindow\n" +
            "write text ";
    private String tail =
            " end tell\n" +
            "end tell\n";

    @Override
    public void execute(String bashCommand){
        Runtime runtime = Runtime.getRuntime();

        String appleScript = this.getFullAppleScript(bashCommand);

        String[] args = { "osascript", "-e", appleScript };

        try {
            Process process = runtime.exec(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getFullAppleScript(String bashCommand) {
        String result = "";

        result = this.head + "\"" + bashCommand + "\"\n" + this.tail;

        return result;
    }
}
