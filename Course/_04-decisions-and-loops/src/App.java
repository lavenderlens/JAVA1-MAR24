import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //++ and -- increment and decrenent operators
        int ss1 = 1;
        int ss2 = 1;

        int a = 3;
        int b = 4;

        var result = a > b && b < a; // first not true so second not evaluated
        result = a>b || b< a; // or evalution, first part is false  so both are evaluated
        result = a <b || b >a ; // first side is true so no need to evaluate second part


        ss1++;
        ++ss2;
        System.out.println("ss1 :" + ss1);//2
        System.out.println("ss2 : " + ss2);//2


       var postFix = a + ss1++;//5
       var preFix = a + ++ss2;//6
        System.out.println(postFix);

        // IF ELSES

        var scanner = new Scanner(System.in);
        System.out.println("Enter the day of the week");
        var dayOfWeek = scanner.nextInt();

        // one branch if

        if(dayOfWeek == 6 || dayOfWeek == 7){
            System.out.println("Its the weekend");
        } if (dayOfWeek == 5) {
            System.out.println("Its nearly the weekend");
        }
            else
         {
            System.out.println("Its a weekday");
        }


            //switch statement

        

    }
}
