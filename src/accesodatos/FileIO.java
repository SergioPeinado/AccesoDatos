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
 
class FileIO{
public static void main(String [] args)
   throws FileNotFoundException, IOException{
 
   FileInputStream in = new FileInputStream(args[0]);
   FileOutputStream out = new FileOutputStream(args[1]);
 
   int n=0,c;
   System.out.print ("\nCopiando ...");
   while( (c = in.read()) != -1){
      out.write(c);
      n++;
   }
   in.close();
   out.close();
   System.out.print ("\nSe han copiado "+n+" caracteres\n");
}}