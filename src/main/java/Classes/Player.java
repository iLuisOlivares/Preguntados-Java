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

    public Player(String name) {
        this.player_name = name;
    }

    public void getScore() {
        System.out.println("\n" + player_name + " - Score: " + score);
    }

    @Override
    public String toString() {
        return "nombre del jugador = " + player_name + ", Puntaje = " + score;
    }

    public void deleteScore(){
        score = 0;
    }
    public void setScore(int points) {
        score = score + points;
    }

}
