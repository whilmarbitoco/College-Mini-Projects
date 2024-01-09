import java.util.Scanner;

public class Main {

	static String setGender(int choice) {
		 String gender = "";
			switch (choice) {
			case 1: 
				gender = "Male";
				break;
			case 2:
				gender = "Female";
				break;
			default:
				System.out.println("Please choice between 1 and 2");
			
			}
		
		return gender;
	}
	
	static String setYearLevel(int choice) {
		String yearLevel = "";
		switch(choice) {
		case 1:
			yearLevel = "1st Year";
			break;
		case 2:
			yearLevel = "2nd Year";
			break;
		case 3:
			yearLevel = "3rd Year";
			break;
		case 4:
			yearLevel = "4th Year";
			break;
		default:
			System.out.println("Please choice between 1 to 4");
			
		}
		
		return yearLevel;
	}
	
	static String setCourse(int choice) {
		String course = "";
		switch(choice) {
		case 1:
			course = "BSIT";
			break;
		case 2:
			course = "BSHM";
			break;
		case 3:
			course = "BSBA";
			break;
		case 4:
			course = "BSED";
			break;
		default:
			System.out.println("Please choice between 1 to 4");
			
		}
		
		return course;
	}
	
public static void main (String[] args) {
    	
    	Scanner scann = new Scanner(System.in);
    
    	    	
    	String studentList[]; //Declaring
    	int l; //Temporay Variable that will hold the input from user - length of Array
    	int option; //Temporary variable that will hold the option of the user;
    	int index = 0; // Temporary varialble that will hold the index of an ;
    	String name; // Temporary varialble that will hold the name;
    	int age;
    	String yearLevel;
    	String course;
    	String gender;
    	int indexFound; 
    
    	//Validate if the lenght is morethan 2.
    	do{
    	
    		System.out.println ("Enter No. of Student:");
    		l = scann.nextInt();
    	
	    	if(l <= 2){
	    		System.out.println ("Enter No. of Student first!");
	    	}
    	
    	}while(l <= 2);
    	
    	

    	studentModel studentmodel = new studentModel(l);
    	
    	do{
    		
    	System.out.println ("Select Option \n"
    		+"[1] - ADD\n"
    		+"[2] - EDIT\n"
    		+"[3] - DELETE\n"
    		+"[4] - DISPLAY");
    	option = scann.nextInt();
    	
    	switch(option){
    		case 1:
    			if(index == studentmodel.getLength()){
    				System.out.println ("Student List is already Complete! You cannot add new.");
    				return;
    			}
    			System.out.println ("Enter Name of Student: ");
    			name = scann.next();
    			System.out.println("Enter Age of "+name+": ");
    			age = scann.nextInt();
    			do {
        			System.out.println("Enter Gender of "+name+" [1]Male or [2]Female: ");
    				gender = setGender(scann.nextInt());
    			} while (gender.equals(""));
    			
    			do {
    				System.out.println("Enter Year Level of student " + name);
    				System.out.println("[1] 1st Year [2] 2nd Year [3] 3rd Year [4] 4th Year");
    				yearLevel = setYearLevel(scann.nextInt());
    			} while (yearLevel.equals(""));
    			do {
    				System.out.println("Enter Course of student " + name);
    				System.out.println("[1]BSIT [2]BSHM [3]BSBA [4]BSED");
    				course = setCourse(scann.nextInt());
    			} while (course.equals(""));
    			Student newStudent = new Student(name, age, gender, yearLevel, course);
    			studentmodel.addMember(index, newStudent);
    			index++;
    			break;
    		case 2:
    			System.out.println ("Enter Name of Student you want to Edit:");
    			name = scann.next();
    			indexFound = studentmodel.findIndex(name);
    			if(indexFound < 0){
    				System.out.println ("No record found!");
    			}else{
    				System.out.println ("Record found @ index "+ indexFound);
    				System.out.println ("Enter Name you wanna replace with: ");
        			name = scann.next();
        			System.out.println("Enter Age you wanna replace with: ");
        			age = scann.nextInt();
        			do {
        				System.out.println("Enter Gender you wanna replace with [1]Male or [2]Female: ");
            			gender = setGender(scann.nextInt());
        			} while(gender.equals(""));
        			do {
        				System.out.println("Enter Year Level of student you wanna replace with " + name);
        				System.out.println("[1] 1st Year [2] 2nd Year [3] 3rd Year [4] 4th Year");
        				yearLevel = setYearLevel(scann.nextInt());
        			} while (yearLevel.equals(""));
        			do {
        				System.out.println("Enter Course of student you wanna replace with " + name);
        				System.out.println("[1]BSIT [2]BSHM [3]BSBA [4]BSED");
        				course = setCourse(scann.nextInt());
        			} while (course.equals(""));
        			Student editStudent = new Student(name, age, gender, yearLevel, course);
        			studentmodel.addMember(indexFound, editStudent);
    				System.out.println ("Record has been successfully updated!");
    			}
    			break;
    		case 3:
    			System.out.println ("Enter Name of Student You Want To Delete:");
    			name = scann.next();
    			indexFound = studentmodel.findIndex(name);
    			if(indexFound < 0){
    				System.out.println ("No record found!");
    			}else{
    				studentmodel.deleteMember(indexFound);
    				System.out.println ("Record has been successfully deleted!");
    			}
    			break;
    		case 4:
    			studentmodel.display();
    			break;
    			
    		default:
    				System.out.println ("Invalid Option");
    		
    	}
    	
    	}while(option > 0 && option < 5);
    					
    
    	studentmodel.display();
    	System.out.println ("No. of Student is "+ studentmodel.getLength());
    	
    }

}
