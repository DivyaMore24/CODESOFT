//Java Program to create student grade calculator

import java.util.Scanner;

public class StudentGradeCalculator
{
          public static void main(String args[])
          {
            Scanner sc=new Scanner(System.in);

            System.out.println("Hello, enter the number of subjects:");
            int numSub=sc.nextInt();

            int[] marks=new int[numSub];
            int total_marks=0;

            for(int i=0;i<numSub;i++)
            {

                System.out.println("Enetr Marks Obtained in Subject "+(i+1)+":");
                marks[i]=sc.nextInt();
                total_marks+=marks[i];
            }

            double average_percentage=(double) total_marks/(numSub*100)*100;

            System.out.println("Your Result is Here:");
            System.out.println("Your Total Marks: "+total_marks);
            System.out.println("Average Percentage: "+average_percentage+"%");

            if(average_percentage>=90)
            {
                System.out.println("A");
            }
            else if(average_percentage>=80)
            {
                System.out.println("A");
            }
            else if(average_percentage>=70)
            {
                System.out.println("B");
            }
            else if(average_percentage>=60)
            {
                System.out.println("C");
            }
            else if(average_percentage>=50)
            {
                System.out.println("D");
            }
            else
            {
                System.out.println("Fail");
            }
         sc.close();
          }
}
            /*String grade=calculateGrade(average_percentage);
            System.out.println("Grade: "+grade);*/

           

          /*public static String calculateGrade(double Percentage)
          {
            if(Percentage>=90)
            {
                return "A";
            }
            else if(Percentage>=80)
            {
                return "A";
            }
            else if(Percentage>=70)
            {
                return "B";
            }
            else if(Percentage>=60)
            {
                return "C";
            }
            else if(Percentage>=50)
            {
                return "D";
            }
            else
            {
                return "F";
            }
          } */
