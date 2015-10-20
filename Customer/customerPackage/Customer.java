// This is the customer parent class.
package customerPackage;


public class Customer 
{
	
   protected String firstName;
   protected String lastName;
   protected String middleInitial;
   protected String email;
   protected int memberType;
   public String[][] out;
  
   
   public Customer()
   {
       firstName = " ";
       lastName = " ";
       middleInitial = " ";
       email = " ";
       memberType = 0;
       out = new String[4][3];
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
