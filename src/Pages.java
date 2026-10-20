import java.io.IOException;
import java.util.Scanner;

public class Pages {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter your age: ");
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        int min_pages=100-age;
        System.out.println(age+"-year olds should read at least "+min_pages+" pages before giving up on a book.");
    }
}
