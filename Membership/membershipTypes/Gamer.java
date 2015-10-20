package membershipTypes;

import java.util.Calendar;

import customerPackage.Customer;

public class Gamer extends Customer implements Membership {
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
	public String getCost() {
		return("Cost = "+Membership.Gamer+" / month"+"\n 2 games /month" );
	}
/*
 * @see membershipTypes.Membership#getDueDate()
 */
	@Override
	public String getDueDate() {
		Calendar dueDate = Calendar.getInstance();
		dueDate.add(Calendar.DATE, +2);
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
