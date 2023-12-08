package org.example.chain;

public class Main {

    public static void main(String[] args) {

        Student s=Student.of();
        s.setCity("NKE").setAge(22).setName("Gulab");

        System.out.println(s);

    }
}
