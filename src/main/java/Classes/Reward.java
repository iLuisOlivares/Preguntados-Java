/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author LuisO
 */
public class Reward {

    private int id_reward;
    private String reward_name;
    private int points;

    public Reward(int id_reward, String reward_name, int points) {
        this.id_reward = id_reward;
        this.reward_name = reward_name;
        this.points = points;
    }

    public int getId_reward() {
        return id_reward;
    }

    public String getReward_name() {
        return reward_name;
    }

    public int getPoints() {
        return points;
    }

}
