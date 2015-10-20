package membershipTypes;

import java.util.Calendar;

import customerPackage.Customer;

public class Gamer extends Customer implements Membership {
/*
 * @see membershipTypes.Membership#getCheckOut()
 */
	@SuppressWarnings("static-access")
	@Override
	public void getCheckOut() 
	{
		String[][] basket = new String[4][3];
		int col=0,row=0;
		
		do
		{
			if(basket[row][col].isEmpty()&&row<2)
			{
				basket[row][col].valueOf(gamePackage.Game.getId_Num());
				basket[row][col+1].valueOf(gamePackage.Game.getTitle());
				basket[row][col+2].valueOf(getDueDate());
			}
			else if(row == 3)
				row=0;
			else
				row ++;
		}while (!basket[row][col].isEmpty());
		
		for(int cRow=0;cRow < basket.length; cRow++)
		{
			for(int cCol=0;cCol<3;cCol++)
			out[cRow][cCol]=basket[cRow][cCol];
		}
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
 * do not need basket.
 */
	@Override
	public String getBasket() {
		// TODO Auto-generated method stub
		return null;
	}

}
