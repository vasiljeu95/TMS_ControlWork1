package com.github.vasiljeu95.tms.controlwork.animal.imp;

import com.github.vasiljeu95.tms.controlwork.animal.Animal;

public class Pig extends Animal {

    public Pig(int age) {
        super(age);
    }

    @Override
    public int feed() {
        int age = super.getAge();

        if (age <= 2) {
            return 4;
        } else {
            return 5;
        }
    }
}