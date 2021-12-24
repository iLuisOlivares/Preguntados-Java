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
public class Question {
    private final String question;
    private final String answer[];
    private final int correct_answer;
    
    public Question(String question, String[] answer, int correct_answer ){
    this.question = question;
    this.answer =  answer;
    this.correct_answer = correct_answer;
    }

    public String getQuestion() {
        return question;
    }

    public int getCorrect_answer() {
        return correct_answer;
    }
    
    public boolean CheckAnswer(int picked){
       
        if(picked == correct_answer){
            System.out.println("Eleccion correcta");
            return true;
        }else{
            System.out.println("Eleccion incorrecta");
            return false;
        }
        
    } 
    
    public boolean getQuestionAndAnswer(){
        int i = 1;
        Scanner scan = new Scanner (System.in);
        System.out.println(question);
        for (String ans: answer) {
            System.out.println(i + ") " + ans );
            i++;
        }
        System.out.println("Respuesta: ");
        int select = scan.nextInt();

        boolean correct = true;
        do {
            if(select > 0 && select < 5){
            return CheckAnswer(select);

            }else{
            System.out.println("Opcion desconocida ingrese una valida:");
            select = scan.nextInt();
            correct = false;
            }
            
        } while (correct = true);
        
        return false;
        
    }
}
