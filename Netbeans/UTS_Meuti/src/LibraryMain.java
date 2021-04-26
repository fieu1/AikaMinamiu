
//Meuti Zari Annisa 
//TI-1H
import java.awt.Menu;
import java.util.Scanner;

/**
 *
 * @author MeiMei
 */
public class LibraryMain {

    static Scanner sc = new Scanner(System.in);
    static Scanner scs = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("WELCOME TO 1H LIBRARY");
        System.out.println("==========================================");
        int chs = 0;
        Library inp = new Library();
        do {
            Menu();
            int chs1 = sc.nextInt();
            switch (chs1) {
                case 1:
                    System.out.println("How many book do you want to input ? ");
                    int amountOfBook = sc.nextInt();

                    for (int i = 0; i < amountOfBook; i++) {
                        System.out.print("Name : ");
                        String name = scs.nextLine();
                        System.out.print("Author : ");
                        String author = scs.nextLine();
                        System.out.print("Stock : ");
                        int stock = sc.nextInt();

                        Book b = new Book(name, author, stock);
                        inp.add(b);
                    }
                    break;
                case 2:
                    int choiceCheck = sc.nextInt();
                    if (choiceCheck == 1) {
                        inp.bubbleSort();
                        inp.printStock();
                    }
                    break;

                case 3:
                    System.out.println("============================================");
                    System.out.println("What's the title do you want to search ?");
                    String titleSearch = scs.nextLine();
                    inp.FindSeqSearch(titleSearch);
                    break;
                case 4:
                    System.out.println("How many book do you want to borrow ? ");
                    int amountOfBorrow = sc.nextInt();
                    String[] borrowedBook = new String[amountOfBorrow];
                    for (int i = 0; i < amountOfBorrow; i++) {
                        System.out.println("What title do you want to borrow?");
                        String title = scs.nextLine();
                        borrowedBook[i] = inp.Borrow(title);
                    }
                    System.out.println("You'll borrow : ");
                    for (int j = 0; j < amountOfBorrow; j++) {
                        System.out.println(borrowedBook[j]);
                    }
                    System.out.println("=============================================");
                    break;
                case 5:
                    System.out.println("How many book do you want to return ? ");
                    int amountOfReturn = sc.nextInt();
                    for (int i = 0; i < amountOfReturn; i++) {
                        System.out.print("Title of book = ");
                        String titleReturn = scs.nextLine();
                        inp.Return(titleReturn);
                    }
                    break;
                case 6:
                    
                case 7:
                    System.out.println("=======================Thankyou for visiting 1H Library=================");
            }
        } while (chs == 1 || chs == 2 || chs == 3 || chs == 4 || chs == 5 || chs == 6);
    }

    static void Menu() {

        System.out.println("=============================");
        System.out.println("WELCOME TO 1H LIBRARY");
        System.out.println("=============================");
        System.out.println("What do you want to do ? ");
        System.out.println("1. Input book ");
        System.out.println("2. Check book ");
        System.out.println("3. Search book");
        System.out.println("4. Borrow book");
        System.out.println("5. Return book");
        System.out.println("6. Broken book");
        System.out.println("7. Exit library");
        System.out.print("Input in number : ");
    }

}
