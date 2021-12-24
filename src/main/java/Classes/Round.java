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
     int level;
     Category categorys[];
     Reward reward;

    public Round(int level, Category[] categorys, Reward reward) {
        this.level = level;
        this.categorys = categorys;
        this.reward = reward;
    }
    
    public boolean selectCategory(){
        Scanner scan = new Scanner (System.in);
       System.out.println("Seleccione una categoria:");
            for (int i = 0; i < categorys.length; i++) {
            System.out.println((i+1)+")"+ categorys[i].getCategory_name());
            }
        int select = scan.nextInt();

        boolean correct = true;    
        do {
            if(select > 0 && select < 3){
            return categorys[select-1].SelectRandomQuestion();
            }else{
            System.out.println("Opcion desconocida ingrese una valida:");
            select = scan.nextInt();
            correct = false;
            }
            
        } while (correct = true);
        
         return false;
    }
    

    public void ShowAllCategorys() {
        for (var category: categorys) {
        System.out.println( "Round{" + "level=" + level + ", categorys=" + category.getCategory_name() +  ", reward=" + reward.getPoints() + '}');
        category.SelectRandomQuestion();
        }
    }
    
   public void ShowCategoryInfo(int selected){
        System.out.println( "Round{" + "level=" + level + ", categorys=" + categorys[selected-1].category_name +  ", reward=" + reward.getPoints() + '}');
        categorys[selected-1].SelectRandomQuestion();
       
   }
   
  
}