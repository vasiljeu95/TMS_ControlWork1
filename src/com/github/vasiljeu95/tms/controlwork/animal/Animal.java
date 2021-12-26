package com.github.vasiljeu95.tms.controlwork.animal;

import java.util.Random;

public abstract class Animal {
    private int age;

    public int feed () {
        int feed = 0;
        return feed;
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


//    //////////// lesson
//    private boolean isSimple() {
//        Random random = new Random();
//        int num = random.nextInt(1000);
//        return isSimple(num);
//    }
//
//    private boolean isSimple(int num) {
//        return true;
//    }
}
