package com.greglturnquist.hackingspringbootch2reactive.st.ch14;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"),
                new File("Ex1.txt"),
                new File("bak"),
                new File("Ex2.java"),
                new File("Ex2.txt"),
                new File("Ex2.bak")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        //map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1)
                .map(s -> s.substring(s.indexOf('.')+1))
                .distinct()
                .forEach(System.out::print);
        System.out.println();


    }
}
