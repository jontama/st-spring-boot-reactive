package com.greglturnquist.hackingspringbootch2reactive;



import com.greglturnquist.hackingspringbootch2reactive.reactive.tt.MyFunction;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;


public class JavaRamdaTest {
    int intme() {
        return 0;
    }

    @Test
    void codeTest() {

        int[] arr = new int[5];
        Arrays.setAll(arr,(a) -> {
            System.out.printf("a %s",a);
            return (int)(Math.random()*5)+1;
        });

        Arrays.stream(arr).forEach(System.out::println);

        //

        String[] strArr = {"1","2","3"};
        Stream<String> strStream = Arrays.stream(strArr); // 질문 : 정수배열로 문자열 배열스트림을 생성할수 없는가?
        List<String> sortList = strStream.sorted().collect(Collectors.toList());

        //

        Stream.generate(()->1);

        // char
        IntStream charStream = "12345".chars();
        int charSum = charStream.map(ch ->{
            System.out.println("ch "+ch);
            System.out.println(ch-'0');
            return ch-'0';
        }).sum();
        System.out.println("charSum" + charSum);

        "12345".chars().forEach(System.out::println);

        //flatMap
        Stream<String[]> strArrStream1 = Stream.of(new String[]{"AAA,","aaa"}
                ,new String[]{"BBB","bbb"},new String[]{"CCC","ccc"});

        //Stream<Stream<String>> strStrStream1 =  strArrStream1.map(Arrays::stream);
        Stream<String> strStream1 = strArrStream1.flatMap(Arrays::stream);

        String[] lineArr = {"Belive or not It is true","Do or do not There is not"};
        Stream<String> lineStream = Arrays.stream(lineArr);
        Stream<String> strArrStream2 = lineStream.flatMap(line -> Stream.of(line.split(" +")));
        strArrStream2.forEach(System.out::println);

    }

    @Test
    void streamOptionalTest() {
        //Optional
        Optional<String> optVal = Optional.of("abc");
        String str1 = optVal.get();
        String str2 = optVal.orElse("");
        System.out.println(str1+" : "+str2);

        //
        Optional.ofNullable("").isPresent();
    }

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

    /**
     * 함수형 인터페이스 S
     * Supplier, Consumer, Function, Predicate, Runnable
     *
     */
    void functionalInterfaceTest() {

        MyFunction mf = new MyFunction() {
            @Override
            public int max(int a, int b) {
                return (a>b)? a:b;
            }
        };


        MyFunction mf2 = (a,b)-> (a>b)? a:b;

        int big = mf.max(1,2);

        System.out.println(mf.max(1,2));




    }





    // 함수형 인터페이스 E




}
