package ejercicioBinarioObjecto;

import ejercicioBinarioPrimitivo.Animal;

import java.io.*;

public class LeerBinarioObjecto {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("EjercicioBinario.obj");
        ObjectInputStream dataIS = new ObjectInputStream(new FileInputStream(file));

        try{
            while(true){
                Animal animal = (Animal) dataIS.readObject();
                System.out.println(animal);
            }
        } catch (EOFException ex) {
            System.out.println("Fichero finalizado");
        } catch (StreamCorruptedException e) {
        }

        dataIS.close();
    }
}
