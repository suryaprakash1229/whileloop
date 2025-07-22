import java.util.Scanner;
public class Palindrome {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter num: ");
    int num = sc.nextInt();
    int originalnumber=num;
    int reverse=0;
    while (num !=0){
        int digit = num%10;
        reverse=reverse*10+digit;
        num/=10;
    }
    if(originalnumber==reverse){
        System.out.println("is Palindrom");
    }else{
        System.out.println("is not a Palindrome");
    }
  }  
}
