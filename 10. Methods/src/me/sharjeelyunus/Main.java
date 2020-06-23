package me.sharjeelyunus;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score is: " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
