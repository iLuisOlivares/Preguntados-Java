/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author LuisO
 */
public class Question {
    String question;
    String answer[];
    int correct_answer;
    
    public Question(String question, String[] answer, int correct_answer ){
    this.question = question;
    this.answer =  answer;
    this.correct_answer = correct_answer;
    }
    
    public boolean CheckAnswer(int picked){
       
        if(picked == this.correct_answer){
            System.out.println("Eleccion correcta");
            return true;
        }else{
            System.out.println("Eleccion incorrecta");
            return false;
        }
        
    } 
    
    public String[] getAnswer(){
        System.out.println(this.question + " - " +  this.answer[0] + " - " +  this.answer[1] + " - " +  this.answer[2] + " - " +  this.answer[3] );
        return this.answer;
    }
}
