package ejercicioBinarioPrimitivo;

import java.io.*;
import java.util.ArrayList;

public class EscribirBinarioFile {
    public static void main(String[] args) throws IOException {
        File file = new File("EjercicioBinario.dat");
        FileOutputStream fileout = new FileOutputStream(file);
        DataOutputStream dataOS = new DataOutputStream(fileout);

//        String animals[] = {"Dog", "Cat", "Bird", "Fish", "Lion", "Human"};
//        int numOfLegs[] = {4, 4, 2, 0, 4, 2};
//        double height[] = {34.2, 23.9, 9.5, 5.5, 124.6, 163.6};
//        boolean inMyHouse[] = {false, false, false, false, false, true};

        Animal dog = new Animal("dog", 4, 34.2, false);
        Animal cat = new Animal("cat", 4, 12.2, false);
        Animal bird = new Animal("bird", 2, 4.2, false);
        Animal fish = new Animal("fish", 0, 3.24, false);
        Animal lion = new Animal("lion", 4, 34.2, false);
        Animal human = new Animal("human", 2, 174.2, true);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(cat);
        animalList.add(bird);
        animalList.add(fish);
        animalList.add(lion);
        animalList.add(human);

        for (int i = 0; i < animalList.size(); i++) {
            dataOS.writeUTF(animalList.get(i).getName());
            dataOS.writeInt(animalList.get(i).getNumPatas());
            dataOS.writeDouble(animalList.get(i).getHeight());
            dataOS.writeBoolean(animalList.get(i).isInMyhouse());
        }
        dataOS.close();
    }
}
