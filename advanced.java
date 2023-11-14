import java.util.Scanner;

public class advanced {
    public static void main(String[] args) {
        int years = 26;
        boolean isWorthDating=years >10 && years<29 ;
        System.out.println(isWorthDating);
        boolean hasHighIncome=true;
        boolean hasGoodCredit=false;
        boolean hasCriminalRecord=true;
        boolean isEligible=(hasHighIncome||hasGoodCredit)&& !hasCriminalRecord;
        System.out.println(isEligible);
        //if statements
        int temp = 17;
         if (temp > 35){
         System.out.println("It's a hot Day cold a warm beer");
        }
        else if (temp > 15 && temp <=30)
        System.out.println("It's a Cold Day drink a warm beer");
        else
        System.out.println("Quit drinking alcohol");
        //simplifying if statements
        int salary=120000;
        boolean luxuryLife= salary>150000;
        System.out.println(luxuryLife);
        //ternary operator
        int Income=120000;
        String className= Income>100000?"first" : "Economy";
        System.out.println(className);
        //switch 
    
        switch ("Role") {
            case "Boyfriend":
            System.out.println("Send money to her");
                break;
        case "Not her Boyfriend":
        System.out.println("Dont reply her Favour Texts and messages");
            default:
            System.out.println("punny ass Kinuthia");
                break;
        }
        //fizzbuzz
        Scanner scanner= new Scanner(System.in);
        System.out.println("Number");
        int Number=scanner.nextInt();
        if(Number% 5== 0)
        System.out.println("FizzBuzz");
        else
        System.out.println("impossible math");
        scanner.close();
        
    }
}
