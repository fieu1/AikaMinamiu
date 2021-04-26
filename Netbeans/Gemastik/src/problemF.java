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
public class problemF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eko = sc.nextLine();
        String ganesh = sc.nextLine();
        int totEko = 0, totGan = 0;
        for(int i=0;i < eko.length(); i+=2){
            if(eko.charAt(i)== 'e'){
                switch (ganesh.charAt(i)){
                    case 'h':
                        totEko++;
                        break;
                    case 'a' :
                        totGan++;
                        break;
                    default :
                        break;
                }
            } else if(eko.charAt(i)== 'h'){
                switch (ganesh.charAt(i)){
                    case 'a':
                        totEko++;
                        break;
                    case 'e' :
                        totGan++;
                        break;
                    default :
                        break;
                }
            } else {
                switch (ganesh.charAt(i)){
                    case 'e':
                        totEko++;
                        break;
                    case 'h' :
                        totGan++;
                        break;
                    default :
                        break;
                }
            } 
        }
        if(totEko>totGan){
            System.out.println("Eko Wins");
        } else if(totEko<totGan){
            System.out.println("Ganesh Wins");
        } else {
            System.out.println("Draw");
        }
    }
}
