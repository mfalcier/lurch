package org.mfalcier.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

/**
 * Unit Test suite for AppleScriptExecutorServiceBusiness class.
 *
 * Created by mfalcier on 29/03/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppleScriptExecutorServiceTest {

    @Autowired
    private AppleScriptExecutorService appleScriptExecutorService;

    @Test
    public void shouldExecuteExitAfterTwoSecondsWithoutProblems() {
        String bashCommand = "sleep 1; exit";

        this.appleScriptExecutorService.execute(bashCommand);

        assertTrue(true);
    }
}
