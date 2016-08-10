package com.y1.java8.stream;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

/*
 * reference : https://github.com/winterbe/java8-tutorial
 *  
 * [Example] 
 *    - filtering
 *    - filtering & sorting
 *    - matching
 *    - mapping
 *    - counting
 *    - reducing
 * 
 */
public class Stream {
	public static void main(String[] args) {
		
		List<String> stringCollection = new ArrayList<>();
        stringCollection.add("azzz");
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("ccc1");
        stringCollection.add("yyy,");
        stringCollection.add("basdfasdfasdf");
        stringCollection.add("acd,");
        stringCollection.add("dsdf");
        
        // filtering
        stringCollection
        		.stream()
        		.filter((s)->s.startsWith("a"))
        		.forEach(System.out::println);
        
		
        // filtering & sorting
        stringCollection
        		.stream()
        		.sorted()
        		.filter((s)->s.startsWith("a"))
        		.forEach(System.out::println);
        
        // matching
        boolean anyStartsWithA = stringCollection
                .stream()
                .anyMatch((s) -> s.startsWith("a"));

        System.out.println("Any matching"); 
        System.out.println(anyStartsWithA);      // true

        boolean allStartsWithA = stringCollection
                .stream()
                .allMatch((s) -> s.startsWith("a"));

        System.out.println("All matching"); 
        System.out.println(allStartsWithA);      // false

        boolean noneStartsWithZ = stringCollection
                .stream()
                .noneMatch((s) -> s.startsWith("z"));

        System.out.println("None matching");
        System.out.println(noneStartsWithZ);      // true
        
        // mapping
        stringCollection
        		.stream()
        		.map(String::toUpperCase)
        		.sorted((a, b)->b.compareTo(a))
        		.forEach(System.out::println);
        
        // counting
        long startWithB = stringCollection
        		.stream()
        		.filter((s)->s.startsWith("b"))
        		.count();
        System.out.println(startWithB);
        
        // reducing
        Optional<String> reduced = 
        		stringCollection
        			.stream()
        			.sorted()
        			.reduce((s1, s2) -> s1 + "#" + s2);
        
       reduced.ifPresent(System.out::println); 
	}

}