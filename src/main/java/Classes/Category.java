/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Random;

/**
 *
 * @author LuisO
 */
public class Category {

    int level;
    String category_name;
    Question question_arr[];

    public Category(int level, String category_name, Question[] question_arr) {
        this.level = level;
        this.category_name = category_name;
        this.question_arr = question_arr;
    }

    public int SelectRandomQuestion() {
        Random r = new Random();
        int numero = r.nextInt(5);
        return question_arr[numero].getQuestionAndAnswer();

    }

    public int getLevel() {
        return level;
    }

    public String getCategory_name() {
        return category_name;
    }

    public Question[] getQuestion_arr() {
        return question_arr;
    }

    public void ShowInfo(int i) {
        System.out.println(this.level + " - " + this.category_name);
        question_arr[i].getQuestionAndAnswer();
    }

}
