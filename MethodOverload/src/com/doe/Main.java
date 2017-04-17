package com.doe;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimetres(6,0);
        calcFeetAndInchesToCentimetres(7,5);
        calcFeetAndInchesToCentimetres(-2,5);
        calcFeetAndInchesToCentimetres(0,5);


        double centimetres = calcFeetAndInchesToCentimetres(1,-5);
            if (centimetres < 0.0) {
                System.out.println("Invalid parameters");
            }
        calcFeetAndInchesToCentimetres(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore( int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no score");
        return 0;
    }
    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {

        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double cm = 2.54 * (feet * 12);
        cm += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + cm +"cm");
        return cm;

    }
    public static double calcFeetAndInchesToCentimetres(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches/12;
        double reminches = (int) inches%12;
        System.out.println(inches + " is = " + feet + " feet and " + reminches + " inches");
        return calcFeetAndInchesToCentimetres(feet, reminches);
    }

}
