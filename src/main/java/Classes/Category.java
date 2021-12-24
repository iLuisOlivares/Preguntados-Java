/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author LuisO
 */
public class Category {
    int level;
    String category_name;
    Question question_arr[];
    Reward reward;
    
    public Category(int level,String category_name,Question[] question_arr,Reward reward){
        this.level = level;
        this.category_name = category_name;
        this.question_arr = question_arr;
        this.reward = reward;
    }
    
    public Question SelectRandomQuestion(){
        int numero = (int)(Math.random()*3);
        System.out.println(numero);
        return this.question_arr[numero];
    }
    
    public void ShowInfo(int i){
        System.out.println(this.level+ " - " + this.category_name + " - " + this.question_arr[i].getAnswer() + " - " + this.reward.points);
    }
    
}
