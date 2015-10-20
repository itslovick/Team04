/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membershipTypes;

/**
 *
 * @author Abhi
 */
public interface Membership
{
    /*
     * Places game information in to out array for user.
     */
	void getCheckOut();
    /*
     * 
     */
	String getCost();
    /*
     * 
     */
	String getDueDate();
    /*
     * Don't need basket.
     */
	String getBasket();
	
	public static final double Premium  = 10.00;
	public static final double Gamer = 7.99;
	public static final double Free = 0.00;
	
            
}
