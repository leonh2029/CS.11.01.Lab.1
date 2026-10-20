import java.io.IOException;
import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter your age: ");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        int min_dateable=7+age/2;
        System.out.println(age+"-year olds should date somebody who is at least "+min_dateable+" years old.");
    }
}
