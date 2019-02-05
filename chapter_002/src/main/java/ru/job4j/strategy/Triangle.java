package ru.job4j.strategy;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("    A");
        System.out.println("   AAA");
        System.out.println("  AAAAA");
        System.out.println(" AAAAAAA");
        System.out.println("AAAAAAAAA");
    }
}
