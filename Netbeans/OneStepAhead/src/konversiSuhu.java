/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Aikacchii
 */
public class konversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float suhu, celcius, reamur, fahrenheit, kelvin;
        
        System.out.print("Input suhu : ");
        suhu = input.nextFloat();
//kalo mau yang sesuai flowchart
        celcius = suhu;
        reamur = celcius * 4/5 ;
        fahrenheit = (celcius*9/5) + 32;
        kelvin = celcius + 273;
// kalo mau yang bener hasilnya 
// reamur = celcius * 0.8f;
// fahrenheit = (celcius* 1.8f) + 32;
// f ini konversi ke float, biar ga error 
// soalnya kalo 0.8 sama 1.8 aja jadinya double
        
        System.out.println("Celcius : " + celcius);
        System.out.println("Reamur : " + reamur);
        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Kelvin : " + kelvin);
    }
}
