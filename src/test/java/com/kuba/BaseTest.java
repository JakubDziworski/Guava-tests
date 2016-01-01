package com.kuba;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

/**
 * Created by kuba on 01.01.2016.
 */
public abstract class BaseTest {
    @Rule
    public TestName testName = new TestName();

    @Before
    public void before() {
        System.out.printf("*** [%s / %s] ***\n",this.getClass().getSimpleName(),testName.getMethodName());
    }

    @After
    public  void after() {
        System.out.println();
    }
}
