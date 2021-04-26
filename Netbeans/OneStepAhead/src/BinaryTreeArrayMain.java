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
public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        boolean repeat = true;
//        System.out.println("How many number you want to input ? ");
//        System.out.print("> ");
//        int inp = sc.nextInt();
//        bta.addIdx(inp);
//        for(int i=0;i<inp;i++){
//            System.out.println("Input to array : ");
//            int value = sc.nextInt();
//           
//        }
             bta.add(0);
        int idxLast = 6;
//        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
    }
}
