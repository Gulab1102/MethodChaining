package org.example.chain;

public class Student {
    private int age;
    private String name;
    private String city;

    private Student(){

    }

    public static Student of(){
        return new Student();
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
