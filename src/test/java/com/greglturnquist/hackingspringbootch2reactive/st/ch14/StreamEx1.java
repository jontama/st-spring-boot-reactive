package com.greglturnquist.hackingspringbootch2reactive.st.ch14;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamEx1 {
    @Test
    public static void main(String[] args) {

        Stream<Student> studentStream = Stream.of(
                new Student("일자바",3,300),
                new Student("이자바",2,200),
                new Student("삼자바",1,250),
                new Student("사자바",1,100),
                new Student("오자바",2,230),
                new Student("육자바",3,150));

        studentStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
