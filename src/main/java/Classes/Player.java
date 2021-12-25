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

    private final String player_name;
    private int score;

    //Constructor
    public Player(String name) {
        this.player_name = name;
    }

    //Getters
    public void getScore() {
        System.out.println("\n" + player_name + " - Score: " + score);
    }

    @Override
    public String toString() {
        return "nombre del jugador = " + player_name + ", Puntaje = " + score;
    }

    //Method that delete score
    public void deleteScore() {
        score = 0;
    }

    //Methos that set score
    public void setScore(int points) {
        score = score + points;
    }

}
