/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamestop;

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
    
    //==================== G E N R E S ==================//
    
    // Adventure array.
    String adventure[] = { "Uncharted", "Far Cry 4", "Black Island" };
    int adventCopies[] = {10, 10, 10};
    
    // Action array.
    String action[] = { "Bioshock 2", "Assasin's Creed", "Gears of War" };
    int actionCopies[] = {10, 10, 10};
    
    // RGP array.
    String rpg[] = { "Skyrim", "DragonAge", "Oblivion" };
    int rpgCopies[] = {10, 10, 10};
    
    // Sports array.
    String sports[] = { "FIFA5", "Lethal League", "Starwhal" };
    int sportsCopies[] = {10, 10, 10};
    
    // Strategy array.
    String strategy[] = { "Myst", "The Room", "Darkest Dungeon" };
    int stratCopies[] = {10, 10, 10};
    
    // Indie array. 
    String indie[] = { "Runes of Brennos", "Ceres", "Undertales" };
    int indieCopies[] = {10, 10, 10};
    
    // Massively Multiplayer array.
    String multiMass[] = { "Halo", "Destiny", "Grand Theft Auto Online" };
    int multiCopies[] = {10, 10, 10};
    
    // Casual array.
    String casual[] = { "Minecraft", "Besiege", "Titan Souls" };
    int casualCopies[] = {10, 10, 10};
    
    // Simulation array.
    String simulation[] = { "Dungeon 2", "Piloteer", "Creativerse" };
    int simCopies[] = {10, 10, 10};
    
    // Racing array.
    String racing[] = { "Wipeout", "Midtown Madness 3", "DiRT" };
    int raceCopies[] = {10, 10, 10};
    


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



