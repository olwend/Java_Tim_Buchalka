package com.doe;

public class Main {

    public static void main(String[] args) {

        int highScore = calcScore(true, 10000, 8, 200);
        System.out.println("your final score was " + highScore);
        int secHighScore = calcScore(true, 800, 5, 100);
        System.out.println("the second final score was " + secHighScore);

        int highScorePosition = calcHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calcHighScorePosition(900);
        displayHighScorePosition("Bee", highScorePosition);

        highScorePosition = calcHighScorePosition(400);
        displayHighScorePosition("Kate", highScorePosition);

        highScorePosition = calcHighScorePosition(50);
        displayHighScorePosition("Lou", highScorePosition);

        highScorePosition = calcHighScorePosition(500);
        displayHighScorePosition("Dot", highScorePosition);
    }

    public static int calcScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName+" reached position "+highScorePosition+" on the high score table");
}

    public static int calcHighScorePosition(int playerScore){

        if(playerScore > 1000){
        return 1;
        }else if(playerScore >500){
        return 2;
        }else if(playerScore >100 &&playerScore <=500){
        return 3;
        }else{
        return 4;
        }

    }
}


