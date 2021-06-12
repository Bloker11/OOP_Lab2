package com.company;

import com.company.animals.Animal;
import com.company.animals.Human;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("dog");

        dog.name = "Szarik";

        Phone onePlus = new Phone("onePlus",
                "8Pro",
                2.3,
                "Android");

        Human me = new Human(1000.0);
        me.firstName = "Marek";
        me.lastName = "Towarek";
        me.pet = dog;
        me.cash = 2000;
        me.phone = onePlus;

        Human buyer = new Human(2000.0);
        buyer.firstName = "Franek";
        buyer.lastName = "Kimono";
        buyer.cash = 30000;

        me.phone.sell(me,buyer,150.0);

        System.out.println(me.cash);
        System.out.println(buyer.cash);







    }
}