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
public class Functions {
    static Scanner sc = new Scanner(System.in);
    
    public static void addExp(List<Expense> list){
        Date date = new Date();
        double amount;
        String content;
        System.out.println("------ Add Expense ------");
        System.out.print("Enter date: ");
        date = Validate.date();
        System.out.print("Enter Amount: ");
        amount = Validate.amount();
        System.out.print("Enter content: ");
        content = sc.nextLine();
        if (CRUD.createExpense(list, date, amount, content)) {
            System.out.println("Create new expense successful!");
        } else {
            System.out.println("Cannot create a new expense. Please try again.");
        }
    }
    
    public static void display(List<Expense> list) {
        double total = 0;
        System.out.println("------ Display All Expenses ------");
        if (list.isEmpty()) {
            System.out.println("There is no data in this list.");
            System.out.println("Choose the first option to add a new expense.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
                total += list.get(i).getAmount();
            }
        }
        System.out.println("Total: " + total);
    }
    
    public static void deleteExp(List<Expense> list) {
        int id;
        System.out.println("------ Delete An Expense ------");
        if (list.isEmpty()) {
            System.out.println("There is no expense in database.");
        } else {
            System.out.print("Enter ID: ");
            id = Validate.number() - 1;
            for(int i = 0; i < list.size(); i++){
                
            }
            if (CRUD.deleteExpense(list, id)) {
                System.out.println("Delete expense successful!");
            } else {
                System.out.println("Cannot delete expense. Please try again.");
            }
        }
    }
}
