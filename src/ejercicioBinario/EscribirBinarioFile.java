package ejercicioBinario;

import java.io.*;

public class EscribirBinarioFile {
    public static void main(String[] args) throws IOException {
        File file = new File("EjercicioBinario.dat");
        FileOutputStream fileout = new FileOutputStream(file);
        DataOutputStream dataOS = new DataOutputStream(fileout);

        String animals[] = {"Dog", "Cat", "Bird", "Fish", "Lion", "Human"};
        int numOfLegs[] = {4, 4, 2, 0, 4, 2};
        double height[] = {34.2, 23.9, 9.5, 5.5, 124.6, 163.6};
        boolean inMyHouse[] = {false, false, false, false, false, true};

        for (int i = 0; i < animals.length; i++) {
            dataOS.writeUTF(animals[i]);
            dataOS.writeInt(numOfLegs[i]);
            dataOS.writeDouble(height[i]);
            dataOS.writeBoolean(inMyHouse[i]);
        }
        dataOS.close();
    }
}
