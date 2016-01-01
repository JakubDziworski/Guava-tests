package com.kuba;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class Strings extends BaseTest{

    @Test
    public void joiners() throws Exception {
        List<String> input = Lists.newArrayList("pies","kot","chomik");
        Joiner joiner = Joiner.on(", ");
        final String output = joiner.join(input);
        System.out.printf("%s -> %s",input,output);
    }

    @Test
    public void splitters() throws Exception {
        String input = ",  ,fdsfds,:dog;cat  hamster,   ,";
        Iterable<String> output = Splitter
                .on(CharMatcher.anyOf(",;: "))
                .trimResults()
                .omitEmptyStrings()
                .split(input);
        System.out.printf("%s -> %s",input,output);
    }




}
