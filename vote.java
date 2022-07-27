 import java.util.Scanner;
public class  Main{
     public static  void main(String args[]){
         System.out.println("Plz inter your Age ");
         Scanner sc=new Scanner(System.in);
         int age=sc.nextInt();
         
         if(age>=18){
             System.out.println("the age of Candidate is="+age);
             System.out.println("Yes , You are eligible ");
         }
         else{
             System.out.println("Sorry candidates you are not eligible");
             int num=18-age;
             System.out.println("candidate your age is less than="+ num);
         }
          
         
     }
     
 }
