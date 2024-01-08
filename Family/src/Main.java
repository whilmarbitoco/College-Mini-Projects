
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

    
    public static void main (String[] args) {
    	
    	Scanner scann = new Scanner(System.in);
    
    	    	
    	String familyMember[]; //Declaring
    	int l; //Temporay Variable that will hold the input from user - length of Array
    	int option; //Temporary variable that will hold the option of the user;
    	int index = 0; // Temporary varialble that will hold the index of an ;
    	String name; // Temporary varialble that will hold the name;
    	int age;
    	String gender;
    	int indexFound; 
    
    	//Validate if the lenght is morethan 2.
    	do{
    	
    		System.out.println ("Enter No. of Family Member:");
    		l = scann.nextInt();
    	
	    	if(l <= 2){
	    		System.out.println ("Enter No. of Family Member first!");
	    	}
    	
    	}while(l <= 2);
    	
    	
    	
    	//Family family[] = new Family[l]
    	familyModel familymodel = new familyModel(l);
    	
    	do{
    		
    	System.out.println ("Select Option \n"
    		+"[1] - ADD\n"
    		+"[2] - EDIT\n"
    		+"[3] - DELETE\n"
    		+"[4] - DISPLAY");
    	option = scann.nextInt();
    	
    	switch(option){
    		case 1:
    			if(index == familymodel.getLength()){
    				System.out.println ("Family Member is already Complete! You cannot add new.");
    				return;
    			}
    			System.out.println ("Enter Name of Member: ");
    			name = scann.next();
    			System.out.println("Enter Age of "+name+": ");
    			age = scann.nextInt();
    			do {
        			System.out.println("Enter Gender of "+name+" [1]Male or [2]Female: ");
    				gender = setGender(scann.nextInt());
    			} while (gender.equals(""));
    			Family newFamily = new Family(name, age, gender);
    			familymodel.addMember(index, newFamily);
    			index++;
    			break;
    		case 2:
    			System.out.println ("Enter Name of Member you want to Edit:");
    			name = scann.next();
    			indexFound = familymodel.findIndex(name);
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
        			Family editFamily = new Family(name, age, gender);
        			familymodel.addMember(indexFound, editFamily);
    				System.out.println ("Record has been successfully updated!");
    			}
    			break;
    		case 3:
    			System.out.println ("Enter Name of Member you want to Delete:");
    			name = scann.next();
    			indexFound = familymodel.findIndex(name);
    			if(indexFound < 0){
    				System.out.println ("No record found!");
    			}else{
    				familymodel.deleteMember(indexFound);
    				System.out.println ("Record has been successfully deleted!");
    			}
    			break;
    		case 4:
    			familymodel.display();
    			break;
    			
    		default:
    				System.out.println ("Invalid Option");
    		
    	}
    	
    	}while(option > 0 && option < 5);
    					
    
    	familymodel.display();
    	System.out.println ("No. of Family member is "+ familymodel.getLength());
    	
    	
    }
}