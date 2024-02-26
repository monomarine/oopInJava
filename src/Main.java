import lesson2.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rabbit> rabbits = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i<10; i++){
            rabbits.add(new Rabbit(random.nextInt(3,10)));
        }

        Wolf wolf = new Wolf(5);

        for(int i = 0; i < 10; i++) {
            wolf.Eat(rabbits.get(i));
        }
    }
}