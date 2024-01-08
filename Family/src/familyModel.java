
public class familyModel {


	private Family familyMember[]; 
	
    public familyModel(int length) { 
    	this.familyMember = new Family[length];
    }
    
    
    
    //methods
    
    //add 
    public void addMember(int index, Family member){
    	familyMember[index] = member;
    }
    
    public void display(){
    	for(int ctr= 0; ctr<familyMember.length; ctr++)
    		if (familyMember[ctr] != null) {
    			System.out.println ("Family " + ctr + "\n"
    		    		+ "Name: " + familyMember[ctr].name + "\n"
    		    		+ "Age: " + familyMember[ctr].age + "\n"
    		    		+ "Gender: " + familyMember[ctr].gender + "\n\n");
    		}
    }
    
    public int getLength(){
    	return familyMember.length;
    }
    
    public int findIndex(String name){
    	int index = -1; //null
    	
    	for(int ctr= 0; ctr<familyMember.length; ctr++){
    		if(!(familyMember[ctr] == null)){
    			if(familyMember[ctr].name.equalsIgnoreCase(name)){
	    			index = ctr;
    			}
    		}
    	}
    		
    	return index;
    }
    
    public void deleteMember(int index){
    	familyMember[index] = null;
    }
    
    
}