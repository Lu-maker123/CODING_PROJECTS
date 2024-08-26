package examentrance.calculator;

import java.util.Scanner;

 

public class ExamEntranceCalculatorLorenzoStrauss {
    private static final double FORMATIVE_WEIGHT = 16.66;
    private static final double PASS_MARK = 30;
        
    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);
        //askes the user to enter the name of the module 
        System.out.print("Enter the name of the module:  ");
        String moduleName = scanner.nextLine(); 
               
        //Allows for input of each FA mark 
        System.out.println("Enter the marks obtained in formative assessment 1 (out of 100):");
        double FA1 = scanner.nextDouble();
        System.out.println("Enter the marks obtained in formative assessment 2 (out of 100):");
        double FA2 = scanner.nextDouble();
        System.out.println("Enter the marks obtained in formative assessment 3 (out of 100):");
        double FA3 = scanner.nextDouble();
               
        //Calculating the weight of each FA
        double results1 = FA1/100*FORMATIVE_WEIGHT;
        double results2 = FA2/100*FORMATIVE_WEIGHT;
        double results3 = FA3/100*FORMATIVE_WEIGHT;
        //Calculates the weight of all three Fas together which equals 50 as it adds the weight of all three FAs Togeter 
        double FAWeight = FORMATIVE_WEIGHT*3;
        
        //Adds the Fas together
        double gradeTotal = results1 + results2 + results3;
        
        
        //Finds the percentage by taking the total of the three Fas and then dividing it by the FaWeight which is out of 50 and then multiplies it by 100 to calculate the percentage 
        double semesterMark = gradeTotal/FAWeight*100;
        String formattedSemesterMark = String.format("%.2f", semesterMark);
        
        
        
        //prints out the semester mark percentage and the name of the module 
        System.out.println("Your Semester mark for "+moduleName+" is "+formattedSemesterMark+"%");
        
        
        //Checks to see if the semsetserMark is above or below 30 Percent and prints out the correct statement
        if (semesterMark >= PASS_MARK) {
        System.out.println("Congratulations you have qualified to write an exam");
        } else {
        System.out.println("You did not meet the qualifying criteria, you have failed your module");
        }
        
         
    }
}
