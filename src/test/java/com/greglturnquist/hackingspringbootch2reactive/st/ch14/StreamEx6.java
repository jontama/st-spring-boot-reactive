package com.greglturnquist.hackingspringbootch2reactive.st.ch14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



/**
 * collect
 */
public class StreamEx6 {
    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("일자바",3,300),
                new Student("이자바",2,200),
                new Student("삼자바",1,250),
                new Student("사자바",1,100),
                new Student("오자바",2,230),
                new Student("육자바",3,150)
        };

        //학생 이름만 뽑아서 List<String>에 저장
        List<String> names = Stream.of(stuArr).map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(names);

        //스트림을 배열로 변환
        Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);

        for (Student s : stuArr2)
            System.out.println(s);

        //스트림을 Map<String, Student>로 변환. 학생 이름이 Key
        Map<String, Student> stuMap = Stream.of(stuArr)
                .collect(Collectors.toMap(s->s.getName(), p->p));
        for (String name : stuMap.keySet())
            System.out.println(name + "-" + stuMap.get(name));

        long count = Stream.of(stuArr).collect(Collectors.counting());
        long totalScore = Stream.of(stuArr)
                .collect(Collectors.summingInt(Student::getTotalScore));
        System.out.println("count="+count);
        System.out.println("totalScore="+totalScore);

        totalScore = Stream.of(stuArr)
                .collect(Collectors.reducing(0, Student::getTotalScore, Integer::sum));
        System.out.println("totalScore="+totalScore);

        Optional<Student> topStudent = Stream.of(stuArr)
                .collect(Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore)));
        System.out.println("topStudent="+topStudent.get());

        IntSummaryStatistics stat = Stream.of(stuArr)
                .collect(Collectors.summarizingInt(Student::getTotalScore));
        System.out.println(stat);

        String stNames = Stream.of(stuArr)
                .map(Student::getName)
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println(stNames);




    }
}

