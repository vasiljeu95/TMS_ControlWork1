package com.github.vasiljeu95.tms.controlwork.animal;

import com.github.vasiljeu95.tms.controlwork.animal.imp.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfAnimals = sc.nextInt();

        Animal[] ferma = new Animal[numberOfAnimals];

        int sumOfEat = 0;

        for (int i = 0; i < ferma.length; i++) {
            String animal = sc.next();
            int ageOfAnimal = sc.nextInt();

            if (animal.equals("pig") && ageOfAnimal > 0) {
                ferma[i] = new Pig(ageOfAnimal);
                sumOfEat += ferma[i].feed();
            } else if (animal.equals("sheep") && ageOfAnimal > 0) {
                ferma[i] = new Sheep(ageOfAnimal);
                sumOfEat += ferma[i].feed();
            }
        }

        System.out.println("sum of animals eat = " + sumOfEat);
    }
}
