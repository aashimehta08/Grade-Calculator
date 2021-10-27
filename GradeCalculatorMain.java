 import java.util.Scanner;
 
 public class GradeCalculatorMain{
 public static void main (String[] args){
 
 GradeCalculator calc = new GradeCalculator(90.0, 22.0, 32.0, 54.0);
 
  calc.setAvgProject(90.70);
  calc.setAvgLab(100.00);
  calc.setAvgZybooks(100.0);
  calc.calcExamAvg();
  calc.numericGrade();
  calc.letterGrade();
  
  
  GradeCalculator calc2 = new GradeCalculator(45.0, 72.0, 72.0, 48.0);
  
  calc2.setAvgProject(81.60);
  calc2.setAvgLab(100.00);
  calc2.setAvgZybooks(98.46);
  calc2.calcExamAvg();
  calc2.numericGrade();
  calc2.letterGrade();

 
 }

} 