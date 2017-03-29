package org.mfalcier.controller;

import org.mfalcier.service.AppleScriptExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller that exposes a service which can execute bash commands on iTerm2
 *
 * Created by mfalcier on 29/03/17.
 */
@RestController
public class BashController {

    @Autowired
    private AppleScriptExecutorService appleScriptExecutorService;

    private String closeTabScript = "<script>window.close();</script>";

    @RequestMapping("/bash")
    public String bash(@RequestParam(value="q") String command){
        this.appleScriptExecutorService.execute(command);
        return this.closeTabScript;
    }
}
