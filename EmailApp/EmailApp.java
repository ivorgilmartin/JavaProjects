import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {

        System.out.println("******* CREATE EMAIL *********");
        System.out.print("ENTER FIRST NAME: ");
        Scanner in = new Scanner(System.in);
        String firstName = in.next();
        System.out.print("ENTER LAST NAME: ");
        String lastName = in.next();
        System.out.println("CREATING ACCOUNT FOR: " + firstName + " " + lastName);

        Email eml1 = new Email(firstName, lastName);
        System.out.println("******* EMAIL CREATED *********");
        System.out.println(eml1.showInfo());

        in.close();

    }

}
