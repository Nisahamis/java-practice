package mini_projects;

import java.util.Scanner;

/*
Project: Mini Quiz App

Input:
- answers to 5 multiple-choice questions (A/B/C/D)

Output:
- correct count
- wrong count
- score
*/
public class P10_MiniQuizApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] questions = {
                "1) What is the result of 2 + 2?\nA) 3  B) 4  C) 5  D) 22",
                "2) Which one is a Java keyword?\nA) class  B) banana  C) laptop  D) coffee",
                "3) Which data type stores true/false?\nA) int  B) double  C) boolean  D) char",
                "4) Which loop runs at least once?\nA) for  B) while  C) do-while  D) none",
                "5) What does JVM stand for?\nA) Java Visual Machine  B) Java Virtual Machine  C) Just Very Massive  D) Joint Vector Model"
        };

        char[] answers = {'B', 'A', 'C', 'C', 'B'};

        int correct = 0;
        int wrong = 0;

        System.out.println("=== Mini Quiz App ===");
        System.out.println("Answer with A/B/C/D\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            String userInput = input.nextLine().trim().toUpperCase();

            if (userInput.length() != 1 || "ABCD".indexOf(userInput.charAt(0)) == -1) {
                System.out.println("Invalid answer! (counted as wrong)\n");
                wrong++;
                continue;
            }

            char userAnswer = userInput.charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                correct++;
            } else {
                System.out.println("Wrong! Correct answer: " + answers[i] + "\n");
                wrong++;
            }
        }

        int score = correct * 20; // 5 questions => 100 points

        System.out.println("=== Results ===");
        System.out.println("Correct: " + correct);
        System.out.println("Wrong: " + wrong);
        System.out.println("Score: " + score + "/100");
    }
}
