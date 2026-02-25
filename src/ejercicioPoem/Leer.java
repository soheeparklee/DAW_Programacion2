package ejercicioPoem;

import java.io.*;

public class Leer {
    public static void main(String[] args) {


        //File Reader
        //File file = new File("poema.txt");
//        FileReader fileReader = new FileReader(file);
//        int i = 0;
//        i = fileReader.read();
//        while(i != -1){
//            System.out.println((char) i + "==>" + i);
//            i = fileReader.read();
//        }
//        fileReader.close();

        //Buffered Reader

        try {
            File file = new File("poema.txt");// declara fichero
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line;
            int i = 0;
            while ((line = bufferedReader.readLine()) != null){
                i++;
                if(i%2 == 0){
                    System.out.println(line);
                }
            }
                bufferedReader.close();
        } catch (FileNotFoundException fn) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException io) {
            System.out.println("Error de E/S ");
        }


    }
}
