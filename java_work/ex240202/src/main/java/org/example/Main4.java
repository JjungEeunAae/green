package org.example;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Comp implements Comparator<Person> {
    @Override
    public int compare(Person o, Person o2) {
        return o.age - o2.age;
    }
}

public class Main4 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>(new Comp());
        ts.add(new Person("hong", 20));
        ts.add(new Person("jung", 18));
        ts.add(new Person("lee", 30));
        System.out.println(ts);
    }
}
