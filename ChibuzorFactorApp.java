import java.util.Scanner;
public class ChibuzorFactorApp{
public static void main(String[]args){

Scanner lotanna = new Scanner(System.in);

 System.out.print("Enter your favorite digit :  ");
  int number = lotanna.nextInt();

System.out.println("Factors of "   + number +   " are :  ");

               for (int counter =1 ; counter <= number ; counter++) {
            if ( number % counter == 0){

                                   System.out.println(counter);
}


}
       
}
}