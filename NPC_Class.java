
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */

public class NPC {
  private  String name;
   private String desc;
   private String sound;
   /**
 * 
 */
private int randNPCNUM;
    int UserNum;
    
    /**
     * @return returns the monsters unique growl upon entering the room
     */
    public String growl()
    {
    
        return "";
    }
    
    /**
     *
     */
    public void killMonster()
    {
    
    }

    /**
     *
     */
    public void dropFood(){}
    
    /**
     *
     */
    public void pickUpFood(){}
    
    /**
     *
     * @return
     */
    public int randNPCNum()
    {
        return 0;
    }
    /**
     * @return returns the NPCNum value assigned to the monster
     */
    public int getNPCNum()
    {
        return 0;
    }
    /**
     * @param randNPCNum random number assigned to a monster
     * @param UserNum number user inputs
     * @return returns true if the usernNum is equal to randNPCNum
     */
    public boolean compareNums(int randNPCNum,int UserNum)
    {
        return true;
    }
    
}
