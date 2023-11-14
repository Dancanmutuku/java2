import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) {
        for(int i=0;i<2;i++)
        System.out.println("Just advancing");
        Scanner scanner=new Scanner(System.in);
        String input="";
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input=scanner.next().toLowerCase();
            if (input.equals("pass")) {
                continue;
            }
            if (!input.equals("quit")) {
                System.out.println(input); 
            }
            System.out.println(input);
            scanner.close();
        }
    }
}
