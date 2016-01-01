package com.kuba.guavatests;

import com.google.common.base.Predicate;
import com.google.common.collect.*;
import org.junit.Test;

import java.util.Collection;
import java.util.Set;

/**
 * Created by Kuba on 2016-01-01.
 */
public class Functional extends MethodLogger {

    @Test
    public void predicate() throws Exception {
        Predicate<String> lenghtPredicate = new Predicate<String>() {
            public boolean apply(String s) {
                return s != null && s.length() > 2;
            }
        };
        final Collection<String> input = ImmutableList.of("1","12","123","1234","12345","123456");
        final Collection<String> output = Collections2.filter(input, lenghtPredicate);
        System.out.printf("%s -> %s",input,output);
    }

    @Test
    public void intersection() throws Exception {
        Set<String> dogs = ImmutableSet.of("kuba","azor","buszek");
        Set<String> cats = ImmutableSet.of("ula","azor","puszek");
        Sets.SetView<String> intersection = Sets.intersection(dogs, cats);
        System.out.printf("intersection of %s and %s = %s",dogs,cats,intersection);
    }
}
