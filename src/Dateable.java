import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        int thing = age/2 +7;
        System.out.println(age+"-year olds should date somebody who is at least " + thing +" years old");
        System.out.println();

        
    }
}
