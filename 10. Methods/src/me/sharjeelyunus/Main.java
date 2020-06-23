package me.sharjeelyunus;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is: " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displyHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displyHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displyHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displyHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displyHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displyHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displyHighScorePosition("Frank", highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displyHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into postion " + highScorePosition + " on high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
