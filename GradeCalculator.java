import java.util.Scanner;

public class GradeCalculator{
 //Declaring variables 
   private double exam1 = 0;
   private double exam2 = 0;
   private double exam3 = 0;
   private double exam4 = 0;
   private double avgProject = 0;
   private double avgLab = 0;
   private double avgZybooks =0;
   private double avgExam = 0;
   Scanner scnr = new Scanner(System.in);
   private double addScores = 0;
   private double numericGrade = 0;
 
 // takes scores of all 4 exams as arguments
   public GradeCalculator(double exam1, double exam2, double exam3, double exam4) {
      this.exam1 = exam1;
      this.exam2 = exam2;
      this.exam3 = exam3;
      this.exam4 = exam4;
   }
 
 
   public void setAvgProject(double avgProject){
      this.avgProject = avgProject;
      System.out.println("Average of project scores is set to " + avgProject);
   }
    
 
   public double getAvgProject (){
       return avgProject;
   }
   

   public void setAvgLab(double avgLab){
      this.avgLab = avgLab;
      
      System.out.println("Average of Lab scores is set to " + avgLab);
   
   }
 
   public double getAvgLab (){
      return avgLab;
   }
 

   public void setAvgZybooks(double avgZybooks){
      this.avgZybooks = avgZybooks;
      System.out.println("Average of Zybooks scores is set to " + avgZybooks);
   
   }
 
   public double getAvgZybooks (){
      return avgZybooks;
   
   }
 
   public void calcExamAvg(){
      
      int count = 0;
      double storeScore = 0;
      
     //asks user if they wish to drop or include the exam score in the final average exam score
      System.out.println("Score of Exam 1: " + exam1);
      System.out.println("Do you wish to include it in the average score? Enter Y or N");
      char ans = scnr.next().charAt(0);
      
      
      if(ans == 'Y'|| ans == 'y'){
         count += 1;
         storeScore = storeScore + exam1;
      }
      
      System.out.println("Score of Exam 2: " + exam2);
      System.out.println("Do you wish to include it in the average score? Enter Y or N");
      ans = scnr.next().charAt(0);
      
      if(ans == 'Y'|| ans == 'y'){
         count += 1;
         storeScore = storeScore + exam2;
      } 
            
      System.out.println("Score of Exam 3: " + exam3);
      System.out.println("Do you wish to include it in the average score? Enter Y or N");
      ans = scnr.next().charAt(0);
      
      if(ans == 'Y'|| ans == 'y'){
         count += 1;
         storeScore = storeScore + exam3;
      } 
            
      System.out.println("Score of Exam 4: " + exam4);
      System.out.println("Do you wish to include it in the average score? Enter Y or N");
      ans = scnr.next().charAt(0);
      
      if(ans == 'Y'|| ans == 'y'){
         count += 1;
         storeScore = storeScore + exam4;
      } 
      
     //count keeps a track of number of exam scores included in the average score. 
     //If count remains 0 avgExam also remains 0 
      if(count != 0){
         avgExam = storeScore/count;
      } else {
         avgExam = 0;
      }
      
      System.out.println("Average of exam scores is: "+ avgExam);  
   }
   
   public void numericGrade(){ 
   
   //asks user to input weight of each section 
      System.out.println("Enter weight of project scores (eg. 50% is 50.0)");
      double projWeight = scnr.nextDouble();
        
      
      System.out.println("Enter weight of lab scores (eg. 50% is 50.0)");
      double labWeight = scnr.nextDouble();
              
      System.out.println("Enter weight of zybooks scores (eg. 50% is 50.0)");
      double zybookWeight = scnr.nextDouble();
        
      
      System.out.println("Enter weight of exam scores (eg. 50% is 50.0)");
      double examWeight = scnr.nextDouble();
             
      // calculates numerical grades using weights input by the user
      System.out.println(projWeight + labWeight + zybookWeight + examWeight);
      if((projWeight + labWeight + zybookWeight + examWeight) == 100.0){
         numericGrade = ((projWeight*avgProject) + (labWeight*avgLab)+ (zybookWeight*avgZybooks) + (examWeight*avgExam))/100.0;
       
     // if weights don't add up to 1 numerical grade is -1            
      } else {
         numericGrade = -1.0; 
      }
      
      System.out.println("Final numeric grade is: " + numericGrade);
   
   }
   
   public void letterGrade(){
      // if numerical grade is -1 letter grade is invalid there error message is shown
          if(numericGrade == -1.0){
         System.out.println("Error");
      }
       
        //Checks if average exam score is greater than 50

         else if(numericGrade < 60 || avgExam < 50){
         System.out.println("Final letter grade is F");
      } 
      
         else if (numericGrade >= 60 && numericGrade < 70 ){
         System.out.println("Final letter grade is D"); 
      }
      
         else if (numericGrade >= 70 && numericGrade < 80 ){
         System.out.println("Final letter grade is C"); 
      }
      
         else if (numericGrade >= 80 && numericGrade < 90 ){
         System.out.println("Final letter grade is B"); 
      }

         else if (numericGrade >= 90){
         System.out.println("Final letter grade is A"); 
      }
   
   }
   
}

