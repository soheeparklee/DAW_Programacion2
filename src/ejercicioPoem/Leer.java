package ejercicioPoem;

import java.io.*;

public class Leer {
    public static void main(String[] args) throws IOException {
        File file = new File("poema.txt");

        //File Reader
//        FileReader fileReader = new FileReader(file);
//        int i = 0;
//        i = fileReader.read();
//        while(i != -1){
//            System.out.println((char) i + "==>" + i);
//            i = fileReader.read();
//        }
//        fileReader.close();

        //Buffered Reader

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;

            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                bufferedReader.close();
            }
        } catch (FileNotFoundException fn) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException io) {
            System.out.println("Error de E/S ");
        }


    }
}
