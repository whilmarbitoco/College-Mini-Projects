
public class studentModel {
	private Student studentList[];
	
	public studentModel(int length) {
		this.studentList = new Student[length];
	}
	
    public void addMember(int index, Student student){
    	this.studentList[index] = student;
    }
    
    public void display(){
    	for(int ctr= 0; ctr<studentList.length; ctr++)
    		if (studentList[ctr] != null) {
    			System.out.println ("ID No." + ctr + "\n"
    		    		+ "Name: " + studentList[ctr].name + "\n"
	    				+ "Age: " + studentList[ctr].age + "\n"
    		    		+ "Gender: " + studentList[ctr].gender + "\n"
    		    		+ "Year Level: " + studentList[ctr].yearLevel + "\n"
    		    		+ "Course: " + studentList[ctr].course + "\n\n");
    		}
    }
    
    
    public int getLength(){
    	return studentList.length;
    }
    
    public int findIndex(String name){
    	int index = -1; //null
    	
    	for(int ctr= 0; ctr<studentList.length; ctr++){
    		if(!(studentList[ctr] == null)){
    			if(studentList[ctr].name.equalsIgnoreCase(name)){
	    			index = ctr;
    			}
    		}
    	}
    		
    	return index;
    }
    
    public void deleteMember(int index){
    	studentList[index] = null;
    }
    
    
}
