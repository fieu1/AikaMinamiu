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
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int awal = sc.nextInt();
        int akhir = sc.nextInt();
        
        String way = sc.next();
        for(int i=0; i<way.length();i++){
            switch (way.charAt(i)){
                case 'u' :
                    akhir--;
                    break;
                case 't' :
                    awal--;
                    break;
                case 'b' :
                    awal++;
                    break;
                case 's' :
                    akhir++;
                    break;
            }
        }
        System.out.println(awal + " " + akhir);
    }
}
