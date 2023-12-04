package org.fasttrackit.curs11.code.maps;

import org.fasttrackit.curs11.homework.StudentGrade;

import java.util.*;

public class MapsMain {
    public static void main(String[] args) {
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("Grigorescu",32);
        Map<String,Integer> nameToAge = new HashMap<>();
        nameToAge.put("Mihai", 22);
        nameToAge.put("George", 22);
        nameToAge.put("Ionela", 31);
        System.out.println(nameToAge);
        System.out.println(nameToAge.get("Mihai"));

        nameToAge.put("George", 55);
        System.out.println(nameToAge);

        System.out.println(nameToAge.getOrDefault("Marco", 1));

        if(nameToAge.containsKey("Mihai")){
            System.out.println("Mihai is in the map");
        }

        if(nameToAge.containsValue(31)){
            System.out.println("There is a person with 31 years");
        }

        nameToAge.putAll(testMap);
        nameToAge.putIfAbsent("Mihai",11);
        nameToAge.putIfAbsent("Romica",11);
        System.out.println(nameToAge);

        System.out.println(nameToAge.remove("George"));
        System.out.println(nameToAge);

        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set<String> keySet = nameToAge.keySet();
        System.out.println(keySet);
        Collection<Integer> values = nameToAge.values();
        System.out.println(values);

        Map<String, List<Integer>> nameToGrades = new HashMap<>();
        nameToGrades.put("Alex", List.of(10,9,5,7,9));
        nameToGrades.put("Klobn", new ArrayList<>());
        nameToGrades.get("Klobn").add(4);
        nameToGrades.get("Klobn").add(6);
        nameToGrades.get("Klobn").add(10);
        System.out.println(nameToGrades);

        Map<String, GradeAndDiscipline> nameToGradesAndDiscipline = new HashMap<>();
        nameToGradesAndDiscipline.put("Jojo", new GradeAndDiscipline(10,"Matematica"));
        System.out.println(nameToGradesAndDiscipline);
    }
}
