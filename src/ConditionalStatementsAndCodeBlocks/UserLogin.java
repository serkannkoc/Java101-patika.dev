package ConditionalStatementsAndCodeBlocks;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your user name : ");
        userName = inp.nextLine();

        System.out.print("Enter your password : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Successfully logged");
        } else {
            System.out.println("Failed login!!");
            System.out.print("Do you want to reset your password ? (y/n) ");
            String choice = inp.nextLine();
            if (choice.equals("y")) {
                while (true) {
                    System.out.print("Enter the new password : ");
                    String newPassword = inp.nextLine();
                    if (newPassword.equals(password) || newPassword.equals("java123")) {
                        System.out.println("Could not create password.");
                    } else {
                        System.out.println("Password is changed.");
                        break;
                    }

                }
            }
        }

    }
}
