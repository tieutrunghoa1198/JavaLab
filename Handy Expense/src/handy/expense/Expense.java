/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handy.expense;

import java.text.*;
import java.util.*;

/**
 *
 * @author songm
 */
public class Expense {
    private int id;
    private Date date;
    private double amount;
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getDate() {
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateSimplified = sdf.format(date);
        return dateSimplified;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Expense(int id, Date date, double amount, String content) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.content = content;
    }
    
    @Override
    public String toString(){
        return "ID: " + id + "\n" + "Date: " + getDate() + "\n" + "Amount: " + amount + "\n" + "Content: " + content + "\n";
    }
    
}
