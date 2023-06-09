/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Simulates a All-7 player, who is handled by the computer
 * @author Kwnstantinos Perrakis
 * @author Sokratis Athanasiadis
 * @version 1
 */
public class BotAll7 extends All7Player {
    
    public BotAll7(TileStack stack,int numTiles){
        super(stack,numTiles);
    }
    
    /**
     * Search the given table for an available move.
     * @param table The current Tiles on the table
     * @return position is an ArrayList with the structure (selected_tile,reverse/no_reverse,place_left/right)
     */
    public ArrayList<Integer> searchtile(ArrayList<Tile> table){
        ArrayList<Integer> position=new ArrayList<>();
        if(table.isEmpty()){
            position.add(0);// The 1st Tile on the bot's stack, we pick a random first choice
            position.add(0);// We add 0 so it will not be reversed
            position.add(0);// We add 0 so it will be placed on the left side
            return position;
        }
        //Code below Checks if there is any 0 in the table from any side, means that player has moves according to Rules Given
        int first_side1=table.get(0).get_side1();
        int last_side2=table.get(table.size()-1).get_side2();
        if(table.get(0).get_side1()==0){ 
            position.add(0);
            position.add(0);
            position.add(0);
            return position;
       }
        else if(table.get(table.size()-1).get_side2()==0){
           position.add(0);
           position.add(0);
           position.add(1);
           return position;
       }  
        //Checks if there is any Balader.. in players stack of Tiles
      for(int i=0;i<Stack.size();i++){
        if(checkBalader(i)==1){
           position.add(i);
           position.add(0);
           position.add(1);
           return position;
       }
       else if (Stack.get(i).get_side1()+first_side1==7){
                position.add(i); // The (i)th. tile on the bot's stack  
                position.add(1); // We add 1 so we will reverse it
                position.add(0); // We add 0 so it will be placed on the left side
                return position;
       }
       else if(Stack.get(i).get_side2()+first_side1==7){
                position.add(i);// The (i)th. tile on the bot's stack
                position.add(0);// We add 0 so we will not reverse it
                position.add(0);// We add 0 so it will be placed on the left side
                return position;
            }
      else if(Stack.get(i).get_side1()+last_side2==7){
                position.add(i);// The (i)th. tile on the bot's stack
                position.add(0);// We add 0 so we will not reverse it
                position.add(1);// We add 1 so it will be placed on the right side
                return position;
            }
      else if(Stack.get(i).get_side2()+last_side2==7) {
                position.add(i);// The (i)th. tile on the bot's stack
                position.add(1);// We add 0 so we will not reverse it
                position.add(1);// We add 1 so it will be placed on the right side
                return position;
            }
        }
        return null;
    }
    
   /**
    * Performs the selected move
    * @param table The Tiles which are on the table
    * @param position is an ArrayList with the structure (selected_tile,reverse/no_reverse,place_left/right)
    * @return true if a move has been made, if no move has been made returns false
    */
    public boolean moves(ArrayList<Tile> table,ArrayList<Integer> position )
    {
        position=searchtile(table);
        boolean flag=super.moves(table,position);
        return flag;
      
    }
    
}
