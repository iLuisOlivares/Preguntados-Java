/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author LuisO
 */
public class Player {
    String player_name;
    int score;
    
    
    
    public Player(String name){
        this.player_name = name;
    }
    
    public void getScore(){
        System.out.println(player_name + " - Score: " + score);
    }
    
    public void setScore(int points){
        this.score = points;
    }
    
}
