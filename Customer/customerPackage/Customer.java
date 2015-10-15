// This is the customer parent class.
package customerPackage;


public class Customer 
{
   protected String firstName;
   protected String lastName;
   protected String middleInitial;
   protected String email;
   protected int memberType;
   
   public Customer()
   {
       firstName = null;
       lastName = null;
       middleInitial = null;
       email = null;
       memberType = 0;   
   }
   
   public Customer(String firstName, String lastName, String middleInitial, String email, int memberType){
	   setFirstName(firstName);
	   setLastName(lastName);
	   setMiddleInitial(middleInitial);
	   setEmailAddress(email);
	   setMemberType(memberType);
   }
   
   public void setFirstName(String fName)
   {
       firstName = fName;
   }
   
   public String getFirstName()
   {
       return firstName;
   }
   
   public void setLastName(String lName)
   {
       lastName = lName;
   }
   
   public String getLastName()
   {
       return lastName;
   }
   
   public void setEmailAddress(String email)
   {
       this.email = email;
   }
   
   public String getEmailAddress()
   {
       return email;
   }
   
   public void setMiddleInitial(String mInitial)
   {
       middleInitial = mInitial;
   }
   
   public String getMiddleInitial()
   {
       return middleInitial;
   }
   
   public void setMemberType(int member)
   {
       memberType = member;
   }
   
   public int getMemberType()
   {
       return memberType;
   }
   
   
   
}
