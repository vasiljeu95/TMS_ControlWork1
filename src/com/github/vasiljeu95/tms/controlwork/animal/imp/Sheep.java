package com.github.vasiljeu95.tms.controlwork.animal.imp;

import com.github.vasiljeu95.tms.controlwork.animal.Animal;

public class Sheep extends Animal {

    public Sheep(int age) {
        super(age);
    }

    @Override
    public int feed() {
        int age = super.getAge();

        if (age <= 4) {
            return 6;
        } else {
            return 7;
        }
    }
}
