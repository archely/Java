import java.util.Scanner;

public class practice {
    public static void main(String[] args) {


        String name;
        int age;
        double gpa;
        boolean isFemale;

        Scanner input = new Scanner(System.in);


        name = "Arda";
        age = 21;
        gpa = 3.9;

        System.out.printf("Enter student's name: ");
        name= input.nextLine();
        System.out.printf("Enter student's age: ");
        age = input.nextInt();

        System.out.printf("Enter student's gpa: ");
        gpa = input.nextDouble();

        System.out.print("Are you Female ? (true/false) : ");
        isFemale= input.nextBoolean();



        System.out.printf("%s is %d years old. %s has a %2.3f gpa.\n",name, age, name, gpa);

    }
}
