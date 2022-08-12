package q4_p1;

public class Df {
	  public int id;
    public String fName;
    public String lName;
    public String college;

    
    public Df(int i, String fname, String lname, String clg) {
  	  this.id = i;
  	  this.fName = fname;
  	  this.college=clg;
  	  this.lName = lname;
    }
    
    public void display() {
		System.out.println("id : " + id);        
		System.out.println("firstName : " + fName);
		System.out.println("lastName : " + lName);    
		System.out.println("College : " + college);  
		}

}
