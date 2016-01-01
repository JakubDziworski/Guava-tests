package com.kuba.guavatests;

import com.google.common.base.Optional;
import org.junit.Test;

/**
 * Created by Kuba on 2016-01-01.
 */
public class NotNull extends MethodLogger {
    @Test
    public void nullOptional() throws Exception {
        String input = null;
        printString(input);
    }

    @Test
    public void notNullOptional() throws Exception {
        String input = "someValue";
        printString(input);
    }

    private void printString(String input) {
        final Optional<String> optional = Optional.fromNullable(input);
        String output = optional.or("default");
        System.out.printf("%s -> %s",input,output);
    }
}
