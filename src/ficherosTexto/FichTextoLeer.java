package ficherosTexto;

import java.io.*;

public class FichTextoLeer {
  public static void main(String[] args) throws IOException {
      //declarar fichero
      File fichero = new File("src\\ficherosTexto\\FichTextoLeer.java");
      //crear el flujo de entrada hacia el fichero
      FileReader fic = new FileReader(fichero);

      int i;
      i = fic.read();
      while (i != -1) { //se va leyendo un carácter
          System.out.println((char) i + "==>" + i);
          i = fic.read();
      }
      fic.close(); //cerrar fichero

      //SEGUNDO EJEMPLO
    System.out.println("SEGUNDO EJEMPLO: ");
    fic = new FileReader("src\\ficherosTexto\\FichTextoLeer.java ");
    char b[]= new char[20];
    i = fic.read(b);
    while (i  != -1) {
		System.out.println(b);
        i = fic.read(b);
    }
    fic.close(); //cerrar fichero
  }
  }