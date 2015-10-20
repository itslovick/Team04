/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamePackage;

/**
 *
 * @author kristiansaenz
 */
public class Game 
{
    //----- F I E L D S -----------------//----------------
    
    public String title;
    public String genre;
    public int quantity;
    public int id_Num;
    


    //--- C O N S T R U C T O R S ----------------//-----------
    
    public Game()
    {
        title = null;
        genre = null;
        quantity = 0;
        id_Num = 0;
    }
    
    public Game(String t, String g, int q, int i)
    {
        title = t;
        genre = g;
        quantity = q;
        id_Num = i;
    }
    
    
    //--- S E T T E R S (mutators) ----------------//-----------
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public void setId_Num(int id_Num)
    {
        this.id_Num = id_Num;
    }
    
    
    
    //--- G E T T E R S (accessors) ----------------//-----------
    
    public String getTitle()
    {
        return this.title;
    }
    
    public String getGenre()
    {
        return this.genre;
    }
    
    public int getQuantity()
    {
        return this.quantity;
    }
    
    public int getId_Num()
    {
        return this.id_Num;
    }

}



