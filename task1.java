import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        while (age < 0) {
            System.out.print("Age cannot be negative. Enter age again: ");
            age = sc.nextInt();
            sc.nextLine();
        }
        System.out.print("Enter your profession: ");
        String profession = sc.nextLine();
        System.out.println(" User Information");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Profession: " + profession);
        if (age >= 13 && age <= 19) {
            System.out.println("Message: You're a teenager.");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Message: You're an adult.");
        } else if (age >= 60) {
            System.out.println("Message: You're a senior citizen.");
        } else {
            System.out.println("Message: You're a child.");
        }
        sc.close();
    }
}
