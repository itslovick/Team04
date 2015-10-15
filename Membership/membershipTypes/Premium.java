package membershipTypes;

import java.util.Calendar;
import java.util.Scanner;

import customerPackage.Customer;

public class Premium extends Customer implements Membership{
/*
 * @see membershipTypes.Membership#getCheckOut()
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
	public int getCost() {
		// TODO Auto-generated method stub
		return 0;
	}
/*
 * @see membershipTypes.Membership#getDueDate()
 */
	@Override
	public String getDueDate() {
	
		Calendar dueDate = Calendar.getInstance();
		dueDate.add(Calendar.DATE, +3);
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
