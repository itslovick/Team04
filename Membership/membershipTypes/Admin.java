package membershipTypes;

import customerPackage.Customer;
import java.util.Calendar;
import java.util.Scanner;

public class Admin extends Customer implements Membership {

	/*
	 * @see membershipTypes.Membership#getCheckOut()
	 * From override allow admin to input items directly into a users 
	 */
	@Override
	public int getCheckOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * @see membershipTypes.Membership#getCost()
	 */
	@Override
	public String getCost() {
		return ("You're cost is: " + Membership.Free+" / month");
	}
/*
 * @see membershipTypes.Membership#getDueDate()
 */
	@Override
	public String getDueDate() {
		Scanner adminDue = new Scanner(System.in);
		int adminInt;
		Calendar now = Calendar.getInstance();
		Calendar dueDate = Calendar.getInstance();
		System.out.printf("The Current date is :",now,"\nHow many days to be checked out?: ");
		adminInt = adminDue.nextInt();
		dueDate.add(Calendar.DATE, +adminInt);
		adminDue.close();
		return (dueDate.getTime().toString());
	}
/*
 * @see membershipTypes.Membership#getBasket()
 */
	@Override
	public String getBasket() {
		// TODO Auto-generated method stub
		return null;
	}

}
