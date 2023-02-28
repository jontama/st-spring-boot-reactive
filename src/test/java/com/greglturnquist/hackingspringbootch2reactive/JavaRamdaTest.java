package com.greglturnquist.hackingspringbootch2reactive;



import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaRamdaTest {

    @Test
    void streamTest() {
        // stream 이해
        String[] nameArr = {"string2", "string1", "string3"};
        List<String> nameList = Arrays.asList(nameArr);

        java.util.stream.Stream<String> listStram = nameList.stream();
        Stream<String> nameStram = Arrays.stream(nameArr);

        //listStram.sorted().forEach(System.out::println);

        //List<String> list2 = listStram.sorted().collect(Collectors.toList());
        //listStram.sorted().collect(Collectors.toList()).stream().forEach(System.out::println);



        nameStram.sorted().forEach(System.out::println);

    }

    @Test
    void mapTest(){


        System.out.println("123");
        assertThat("1").isEqualTo("1");
    }

    @Test
    void flatMapTest() {
        List<List<String>> dList = Arrays.asList(Arrays.asList("1"),Arrays.asList("2"));


        List<String> list1 = dList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());


    }

}
