/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author LuisO
 */
public class Round {

    private final int level;
    private final Category categorys[];
    private final Reward reward;

    //Constructor
    public Round(int level, Category[] categorys, Reward reward) {
        this.level = level;
        this.categorys = categorys;
        this.reward = reward;
    }

    //Method for choose a category
    public int selectCategory() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nSeleccione una categoria");
        for (int i = 0; i < categorys.length; i++) {
            //Show the categorys of round
            System.out.println((i + 1) + ")" + categorys[i].getCategory_name());
        }
        System.out.println("3)Retirarse e irme con la recompensa\nRespuesta:");
        int select = scan.nextInt();

        boolean correct = true;
        do {
            if (select > 0 && select < 3) {
                //Show a random question depends the category picked
                return categorys[select - 1].selectRandomQuestion();
            } else if (select == 3) {
                //if we wanted retire
                return 3;
            } else {
                System.out.println("\nOpcion desconocida ingrese una valida:");
                select = scan.nextInt();
                correct = false;
            }

        } while (correct);

        return 3;
    }

    //Getters
    public int getReward() {
        return reward.getPoints();
    }

    //Method that show the category by round
    public void showAllCategorys() {
        for (var category : categorys) {
            System.out.println("Round{" + "level=" + level + ", categorys=" + category.getCategory_name() + ", reward=" + reward.getPoints() + '}');
            category.selectRandomQuestion();
        }
    }

    //Method that Show category info
    public void showCategoryInfo(int selected) {
        System.out.println("Round{" + "level=" + level + ", categorys=" + categorys[selected - 1].category_name + ", reward=" + reward.getPoints() + '}');
        categorys[selected - 1].selectRandomQuestion();

    }

}
