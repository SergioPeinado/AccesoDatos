/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

/**
 *
 * @author Sergio
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Acumulador {
  public static void main( String[ ] args )
    throws IOException
  {
     DataInputStream input = new DataInputStream( System.in );
     String bufferIn;
     int valor, total = 0;
     System.out.print("\n["+total+"] ");
    
      try {
          while((bufferIn = input.readLine()) != null){
              valor = Integer.parseInt( bufferIn );
              total += valor;
              System.out.print("\n["+total+"] ");
          }} catch (NumberFormatException nfe) {
          System.err.println("Por favor introduzca un número");
      }
     System.out.println("\n["+total+"]\n");
  }
}