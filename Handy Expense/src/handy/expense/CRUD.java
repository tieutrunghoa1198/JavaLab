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
public class CRUD {
    //create expense 
    public static boolean createExpense(List<Expense> list, Date date, double amount, String content){
        int id, lastIndex;
        if(list.isEmpty()){
            id = list.size() + 1;
        } else {
            lastIndex = list.size() - 1;
            id = list.get(lastIndex).getId() + 1;
        }
        try {
            Expense newExpense = new Expense(id, date, amount, content);
            list.add(newExpense);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //delete expense 
    public static boolean deleteExpense(List<Expense> list, int id) {
        try {
            Expense exp = list.get(id);
            list.remove(exp);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
