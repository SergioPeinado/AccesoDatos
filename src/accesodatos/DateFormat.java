/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Sergio
 */
public class DateFormat {
    public static void main(String[] args){
        Date hoy = Calendar.getInstance().getTime();
        System.out.printf("Hoy es %1$td de %1$tB, %1$tY%n", hoy);
    }
}
