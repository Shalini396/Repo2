package Encaps2;

//Account class - private data members bundled with getters and setters
class Account {  
//private data members  
private long acc_no;  
private String name,email;  
private float amount;  

//public getter and setter methods for each data member 
public long getAcc_no() {  
  return acc_no;  
}  
public void setAcc_no(long acc_no) {  
  this.acc_no = acc_no;  
}  
public String getName() {  
  return name;  
}  
public void setName(String name) {  
  this.name = name;  
}  
public String getEmail() {  
  return email;  
}  
public void setEmail(String email) {  
  this.email = email;  
}  
public float getAmount() {  
  return amount;  
}   
public void setAmount(float amount) {  
  this.amount = amount;  
}  

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account myAcc=new Account();  
	        //set values for data members through setter methods  
	        myAcc.setAcc_no(775492842L);  
	        myAcc.setName("SoftwareTestingHelp.com");  
	        myAcc.setEmail("sth_account@sth.com");  
	        myAcc.setAmount(25000f);  
	        //read data member values through getter methods  
	        System.out.println("Account No:" + myAcc.getAcc_no()+" "+"Account Name:"
	                + myAcc.getName()+" \n"+"Account holder email:" + myAcc.getEmail()+"\n "
	                + "Amount in Account:" + myAcc.getAmount());  

	}

}
}


