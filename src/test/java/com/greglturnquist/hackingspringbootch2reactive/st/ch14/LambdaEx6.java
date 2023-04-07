package com.greglturnquist.hackingspringbootch2reactive.st.ch14;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class LambdaEx6 {
    public static void main(String[] args) {
        IntSupplier s = () -> (int)(Math.random()*100)+1;
        IntConsumer c = i -> System.out.print(i + ", ");
        IntPredicate p = i -> i%2 == 0;
        IntUnaryOperator f = i -> i/10*10;

        int[] arr = new int[100];
        List<String> l1 = new ArrayList<>();
        l1.add("111");
        String t1="111";

        List<Integer> list = new ArrayList<>();
        makeRandomList(s,arr,t1,l1);
        System.out.println(Arrays.toString(arr));
        System.out.println(t1);
        System.out.println(l1);

        LambdaEx6 ex6= new LambdaEx6();
        ex6.makeRandomList(s,arr,t1,l1);

        System.out.println(Arrays.toString(arr));
        System.out.println(t1);
        System.out.println(l1);



        /*System.out.println(list);
        printEvenNum(p,c,list);
        List<Integer> newList = doSomething(f,list);
        System.out.println(newList);*/
    }

    public static void makeRandomList(IntSupplier s, int[] arr, String t1, List<String> l1) {

        t1= "123";
        l1.add("222");



        for (int i=0; i<10; i++) {
            arr[i] = s.getAsInt();
        }
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.print("[");
        for (T i : list) {
            if(p.test(i))
                c.accept(i);
        }
        System.out.println("]");
    }

    static <T> List<T> doSomething(Function<T,T> f, List<T> list) {
        List<T> newList = new ArrayList<T>(list.size());

        for (T i : list) {
            newList.add(f.apply(i));
        }

        return newList;
    }


}
