import java.util.Scanner;

public class Exercise_1_JUnit_Test {

    public class Exercise_1 {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);

            System.out.print("What is your name? ");
            String name = input.nextLine();
            System.out.println("Hello, " + name + ", nice to meet you!");
        }
    }
}
