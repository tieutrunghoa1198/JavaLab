/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handy.expense;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author songm
 */
public class Validate {
    static Scanner sc = new Scanner(System.in);
    //validate choices in main menu 
    public static int choice(int min, int max) {
        int number;
        while (true) {
            try {
                //write here 
                number = Integer.parseInt(sc.nextLine());
                if (number < min) {
                    System.out.println("Interval " + "[" + min + "-" + max + "]");
                    System.out.print("Retype: ");
                    continue;
                } else if (number > max) {
                    System.out.println("Interval " + "[" + min + "-" + max + "]");
                    System.out.print("Retype: ");
                    continue;
                }
                break;
            } catch (Exception e) {
                //write here 
//                System.out.println(e);
                System.out.println("Your choice must be a number!");
                System.out.print("Retype: ");
            }
        }
        return number;
    }
    
    //validate amount is a number or not 
    public static int amount(){
        int amount;
        while (true) {            
            try {
                amount = Integer.parseInt(sc.nextLine());
                if(amount < 0){
                    System.out.println("Amount must be a positive number.");
                    System.out.print("Retype: ");
                }
                else {
                    return amount;
                }
            } catch (Exception e) {
                System.out.println("Amount must be a number.");
                System.out.print("Retype: ");
            }
        }
    }
    //validate content of expense 
    public static String content() {
        String content;
        String regex = "\\w";
        while (true) {
            content = sc.nextLine();
            if (content.matches(regex)) {
                break;
            } else {
                System.out.println("Content only contain numbers and characters.");
                System.out.print("Retype: ");
            }
        }
        return content;
    }

    public static Date date() {
        Date date = null;
        while (true) {
            String da = sc.nextLine();
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                date = sdf.parse(da);
                break;
            } catch (Exception e) {
                System.out.println("Wrong");
            }
        }
        return date;
    }
    
    public static int number() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Must be a number.");
                System.out.print("Retyoe: ");
            }
        }
        return number;
    }
}
