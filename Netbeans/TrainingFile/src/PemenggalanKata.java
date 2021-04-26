/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aikacchii
 */
public class PemenggalanKata {

    static String[] vokal = {"a", "i", "u", "e", "i"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] awalan = {"be", "me", "pe"};
        String input = sc.nextLine();

    }

    public String replacer(String kata, HashMap<String, String> pola) {
        String result = kata;
        for (Map.Entry me : pola.entrySet()) {
            result = result.replaceAll(me.getKey().toString(), me.getValue().toString());
        }
        return result;
    }

    public String unreplacer(String kata, HashMap<String, String> pola) {
        String result = kata;
        for (Map.Entry me : pola.entrySet()) {
            result = result.replaceAll(me.getValue().toString(), me.getKey().toString());
        }
        return result;
    }

    public static String praproses(String kata) {
        ArrayList<String> result = new ArrayList<String>();
        String tmp = "";
        int numKonsonan = 0;
        boolean inKonsonan = false;
        List<String> list = Arrays.asList(vokal);
        List<Character> chars = new ArrayList<>();

        for (char ch : kata.toCharArray()) {

            chars.add(ch);
        }

        for (int i = 0; i < kata.length(); i++) {
            boolean isKonsonan = false;
            for (int j = 0; j < vokal.length; j++) {
                isKonsonan = !chars.containsAll(list);
            }
            if (isKonsonan) {
                if (!inKonsonan) {
                    inKonsonan = true;
                }
                numKonsonan++;
                tmp += kata.charAt(i);
            } else {
                if (inKonsonan) {
                    inKonsonan = false;

                    if (tmp.length() == 1) {
                        result.add(tmp + kata.charAt(i));
                    } else {

                    }
                    tmp = "";
                } else {
                    result.add(Character.toString(kata.charAt(i)));
                }
            }
        }

        if (tmp.length() > 0) {
            result.add(tmp);
        }
        return kata;
    }

}
