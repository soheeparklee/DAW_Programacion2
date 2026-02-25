package ejercicioBinarioPrimitivo;

import java.io.*;

public class LeerBinarioFile {
    public static void main(String[] args) throws IOException {
        File file = new File("EjercicioBinario.dat");
        DataInputStream dataIS = new DataInputStream(new FileInputStream(file));

        String n;
        int e;
        double d;
        boolean b;

        try{
            while(true){
                n = dataIS.readUTF();
                e = dataIS.readInt();
                d = dataIS.readDouble();
                b = dataIS.readBoolean();

                System.out.printf("This animal %s has %d legs and is %f tall. It is %b that I have this animal in my house.\n", n, e, d, b);

            }
        } catch (EOFException ex) {
            System.out.println("Fichero finalizado");
        }

        dataIS.close();
    }
}
