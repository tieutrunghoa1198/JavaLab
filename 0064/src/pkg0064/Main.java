package pkg0064;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("========== Validate program ==========");
        System.out.println("Phone number: ");
        String phoneNum = main.checkPhoneNum();
        System.out.println(phoneNum);
        System.out.println("Email: ");
        String email = main.correctEmail();
        System.out.println("Date: ");
        Date date = main.correctDate();
    }

    public String checkPhoneNum() {
        String phone;
        while (true) {
            phone = sc.nextLine();
            if (phone.matches("^\\d{10,11}")) {
                break;
            } else {
                System.out.println("Phone number must is number and 10-11 digits");
            }
        }
        return phone;
    }

    public String correctEmail() {
        String email;
        String regex = "^[\\w-]+(\\.[\\w\\d]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,4})$";
        while (true) {
            email = sc.nextLine();
            if (email.matches(regex)) {
                break;
            } else {
                System.out.println("Email must is correct format!");
            }
        }
        return email;
    }

    public Date correctDate() {
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
    

}
