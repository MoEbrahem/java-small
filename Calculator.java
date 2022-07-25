package calculator;
import java.util.Scanner;
public class Calculator {
   
    public static void main(String[] args) {
       
       Scanner s = new Scanner(System.in);
           
        System.out.println("Hello");
        System.out.println("Name : Mohamed Ebrahem Abdelhamed");
        System.out.println("Id : 20191473804");
   
    /****************************************************************/
        System.out.println("please Enter first No To Sum : \n");
        int x=s.nextInt();
        System.out.println("please Enter second No To Sum : \n");
        int y=s.nextInt();
        int result =x+y;
        System.out.println(result);
    /***************************************************************/
        System.out.println("please Enter first No To Divided : \n");
        int m=s.nextInt();
        System.out.println("please Enter second No To Divided : \n");
        int n=s.nextInt();
        int divided =m/n;
        System.out.println(divided);
    /***************************************************************/
        System.out.println("please Enter first No To Multiply : \n");
        int p=s.nextInt();
        System.out.println("please Enter second No To Multiply : \n");
        int q=s.nextInt();
        int multiply =p*q;
        System.out.println(multiply);
    /***************************************************************/
        System.out.println("please Enter first No To subtract : \n");
        int r=s.nextInt();
        System.out.println("please Enter second No To subtract : \n");
        int t=s.nextInt();
        int subtract =r-t;
        System.out.println(subtract);
       
        System.out.println("Good BYE");
    }
    }   

