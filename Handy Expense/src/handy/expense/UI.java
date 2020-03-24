/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handy.expense;

import java.util.*;

/**
 *
 * @author songm
 */
public class UI {
    static Scanner sc = new Scanner(System.in);
    
    public static void run(){
        List<Expense> list = new ArrayList<>();
        int choice;
        boolean flag = true;
        while (flag) {
            System.out.println("======Handy Expense Program======");
            System.out.println("1. Add all expense.");
            System.out.println("2. Display all expense.");
            System.out.println("3. Delete an expense.");
            System.out.println("4. Quit");
            System.out.print("Your choice: ");
            choice = Validate.choice(1, 4);
            switch(choice){
                case 1:
                    Functions.addExp(list);
                    break;
                case 2:
                    Functions.display(list);
                    break;
                case 3:
                    Functions.deleteExp(list);
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}
