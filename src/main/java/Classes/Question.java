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

    //Constructor
    public Question(String question, String[] answer, int correct_answer) {
        this.question = question;
        this.answer = answer;
        this.correct_answer = correct_answer;
    }
    
    //Getters
    public String getQuestion() {
        return question;
    }

    public int getCorrect_answer() {
        return correct_answer;
    }

    //Check if the answer picked its correct
    public int checkAnswer(int picked) {

        if (picked == correct_answer) {
            System.out.println("\nEleccion correcta\n");
            return 1;
        } else {
            System.out.println("\nEleccion incorrecta\n");
            return 2;
        }

    }
    //Show the question and answer 
    public int getQuestionAndAnswer() {
        int i = 1;
        Scanner scan = new Scanner(System.in);
        //Show question
        System.out.println("\n" + question);
        //Show all answer of question
        for (String ans : answer) {
            System.out.println(i + ") " + ans);
            i++;
        }
        System.out.println("\nRespuesta: ");
        int select = scan.nextInt();
            
        boolean correct = true;
        do {
            if (select > 0 && select < 5) {
                //check if answer is correct 
                return checkAnswer(select);

            } else {
                System.out.println("\nOpcion desconocida ingrese una valida:");
                select = scan.nextInt();
                correct = false;
            }

        } while (correct = true);

        return 2;

    }
}
