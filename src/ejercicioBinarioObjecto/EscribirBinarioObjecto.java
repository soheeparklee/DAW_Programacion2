package ejercicioBinarioObjecto;

import ejercicioBinarioPrimitivo.Animal;
import ficherosObjetos.MiObjectOutputStream;

import java.io.*;
import java.util.ArrayList;

public class EscribirBinarioObjecto {
    public static void main(String[] args) throws IOException {
        File file = new File("EjercicioBinario.obj");
        //FileOutputStream fileout = new FileOutputStream(file);
        //ObjectOutputStream dataOS = new ObjectOutputStream(fileout);

        Animal dog = new Animal("dog", 4, 34.2, false);
        Animal cat = new Animal("cat", 4, 12.4, false);
        Animal bird = new Animal("bird", 2, 4.7, false);
        Animal fish = new Animal("fish", 0, 3.24, false);
        Animal lion = new Animal("lion", 4, 34.5, false);
        Animal human = new Animal("human", 2, 174.2, true);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(cat);
        animalList.add(bird);
        animalList.add(fish);
        animalList.add(lion);
        animalList.add(human);

        FileOutputStream fileout;
        ObjectOutputStream dataOS;
        if(!file.exists()){
            fileout = new FileOutputStream(file);
            dataOS = new ObjectOutputStream(fileout);
        }else{
            fileout = new FileOutputStream(file, true);
            dataOS = new MiObjectOutputStream(fileout);
        }

        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            dataOS.writeObject(animal);
        }
        dataOS.close();
    }
}
