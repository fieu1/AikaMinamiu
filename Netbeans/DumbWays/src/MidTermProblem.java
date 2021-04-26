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
public class MidTermProblem {

    static int day_rn, month_rn, year_rn;
    static int day_born, month_born, year_born;
    static int day_age = 0, month_age = 0, year_age = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Inputrn();
        InputBorn();
        DateAge();
        MonthAge();
        YearAge();
        
        System.out.println("Your Age is : \n" + day_age + " day, " + month_age + " month, " + year_age + " year");
    }

    static void Inputrn() {
        System.out.print("Day Right Now : ");
        day_rn = sc.nextInt();
        System.out.print("Month Right Now : ");
        month_rn = sc.nextInt();
        System.out.print("Year Right Now : ");
        year_rn = sc.nextInt();
    }

    static void InputBorn() {
        System.out.print("Day Born : ");
        day_born = sc.nextInt();
        System.out.print("Month Born : ");
        month_born = sc.nextInt();
        System.out.print("Year Born : ");
        year_born = sc.nextInt();

    }

    static void DateAge() {
        if (day_rn < day_born) {
            month_rn--;
            int monthToDay = CheckMonth(month_rn, year_rn);
            day_age = day_rn + (monthToDay - day_born);
        } else if (day_rn > day_born) {
            day_age = day_rn - day_born;
        }
    }

    static void MonthAge() {
        if (month_rn < month_born) {
            year_rn--;
            month_age = month_rn + (12 - month_born);
        } else if (month_rn > month_born) {
            month_age = month_rn - month_born;
        }
    }

    static int CheckMonth(int month, int year) {
        int amountOfMonth = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            amountOfMonth = 31;
        } else if (month == 2 && year % 4 == 0) {
            amountOfMonth = 29;
        } else if (month == 2 && year % 4 != 0) {
            amountOfMonth = 28;
        } else {
            amountOfMonth = 30;
        }
        return amountOfMonth;
    }

    static void YearAge() {
        year_age = year_rn - year_born;
    }
}
