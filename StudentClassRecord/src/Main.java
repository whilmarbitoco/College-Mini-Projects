import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
    	
    	Scanner scann = new Scanner(System.in);
    
    	String student = "";
    	
    	int noOfQuiz = 0; 
    	int quiz[] = new int[noOfQuiz];
    	
    	int noOfPerformace = 0; 
    	int performance[] = new int[noOfPerformace];
    	
    	int noOfExam = 0;
    	int exam[] = new int[noOfExam];
    	
//    	Name
    	System.out.println("Enter Student Name?");
    	student = scann.nextLine();
    	
//    	Quizzes
    	System.out.println("Enter How many quiz?");
    	noOfQuiz = scann.nextInt();  	
    	quiz = new int[noOfQuiz];
    	
//    	Performance
    	System.out.println("Enter How many performance?");
    	noOfPerformace = scann.nextInt();
    	performance = new int[noOfPerformace];
 
//    	Exam
    	System.out.println("Enter How many Exam?");
    	noOfExam = scann.nextInt();
    	exam = new int[noOfExam];

    	
//    	Exam score
    	int totalScore = 0;
    	for(int ctr= 0; ctr<quiz.length; ctr++){
    		System.out.println("Enter score of "+ (ctr+1) +" quiz:");
    		int score = scann.nextInt();
    		quiz[ctr] = score;
    		totalScore = totalScore + score;
    	}
    	
//    	Calculate the total quiz rate
    	int totalQuiz = 10*noOfQuiz;
    	double quizRate = ((totalScore/totalQuiz)+50)*0.20;
    	

//    	Performance Score
    	int totalPerformanceScore = 0;
    	for (int i = 0; i < performance.length; i++) {
    		System.out.println("Enter score for " + (i+1) + " performance:");
    		int score = scann.nextInt();
    		performance[i] = score;
    		totalPerformanceScore += score;
    	}
    	
//    	Calculate the performance rate
    	int totalPerformance = 30 * noOfPerformace;
    	double performanceRate = ((totalPerformanceScore/totalPerformance)+50) * 0.20;
    	
    	
//    	Exam score
    	int totalExamScore = 0;
    	for (int j = 0; j < exam.length; j++) {
    		System.out.println("Enter score for " + (j+1) + " exam:");
    		int score = scann.nextInt();
    		exam[j] = score;
    		totalExamScore += score;
    	}
    	
//    	closed the scanner
    	scann.close();  
    	
//    	Calculate the exam rate
    	int totalExam = 50 * noOfExam;
    	double examRate = ((totalExamScore/totalExam) + 50) * 0.20;
    	
//    	calculate the grade
    	double grade = quizRate + performanceRate + examRate;
    	
//    	output everything
    	System.out.println("Student Name: "+ student);
    	System.out.println("Total Quiz score: "+ totalScore);
    	System.out.println("Quiz Rate(20%): "+ quizRate);
    	System.out.println("Performance Rate (30%):" + performanceRate);
    	System.out.println("Exam rate (50%):" + examRate);
    	System.out.println("Grade: " + grade);
    		
    	
    }
}