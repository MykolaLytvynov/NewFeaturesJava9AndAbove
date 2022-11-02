package ua.mykola.java17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Generator {
    public static void main(String[] args) {

//        RandomGenerator randomGenerator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(999);
        RandomGenerator randomGenerator = RandomGeneratorFactory.getDefault().create();

        int counter = 0;
        while(counter<=10){
            // 0-10
            int result = randomGenerator.nextInt(11);
            System.out.println(result);
            counter++;
        }
    }
}
