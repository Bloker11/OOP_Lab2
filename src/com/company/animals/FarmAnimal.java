package com.company.animals;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public double eat() {
        if (getWeight()>0){
            double oldWeight = getWeight();
            setWeight(0.0);
            return oldWeight;

        }
        else{
            System.out.println("Animal can't be eaten");
            return 0;
        }
    }
}
