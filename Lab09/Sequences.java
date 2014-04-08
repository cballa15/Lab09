/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Write a description of class Sequences here.
 * 
 * @author Chris
 * @version (a version number or a date)
 */
public class Sequences {

    /**
     * Constructor for objects of class Sequences
     */

    private String[] players;
    private Die[] dice;
    private int[][] scores;
    private int frame;


    public Sequences() {

        players = new String[2];
        dice = new Die[6];
        scores = new int[2][3];

        players[0] = "Joe";
        players[1] = "Jim";

        for(int i =0; i<dice.length; i++) {
            dice[i] = new Die();
        }
        frame = 0;
    } // end default constructor

    public Sequences(String p1, String p2) {

        players = new String[2];
        dice = new Die[6];
        scores = new int[2][3];

        players[0] = p1;
        players[1] = p2;

        for(int i =0; i<dice.length; i++) {
            dice[i] = new Die();
        }
        frame = 0;
    } // end constructor

    public void roll() {
        for(int i = 0; i < dice.length; i++) {
            dice[i].roll();
            //System.out.println(dice[i].getFaceValue());
        } // end for
    } // end roll

    public int scoreFinder() {

        int score1 = 5;
        int score2 = 10;
        int score3 = 15;
        int score4 = 20;
        int score5 = 25;
        int score6 = 35;

        int score7 = 100;

        int returnScore = 0;

        int ding1 = 0;
        int ding2 = 0;
        int ding3 = 0;
        int ding4 = 0;
        int ding5 = 0;
        int ding6 = 0;

        for(int i = 0; i < dice.length; i ++) {
            if(dice[i].getFaceValue() == 1) {
                ding1++;
            }
            if(dice[i].getFaceValue() == 2) {
                ding2++;
            }
            if(dice[i].getFaceValue() == 3) {
                ding3++;
            }
            if(dice[i].getFaceValue() == 4) {
                ding4++;
            }
            if(dice[i].getFaceValue() == 5) {
                ding5++;
            }
            if(dice[i].getFaceValue() == 6) {
                ding6++;
            }
        } // end for

        //System.out.println(ding1 + " " + ding2 + " " + ding3 +
                //" " + ding4 + " " + ding5 + " " + ding6 + " " );

        // 1
        if(ding1 > 0) {
            returnScore = score1;
        }
        // 1, 2
        if(ding1 > 0 && ding2 > 0) {
            returnScore = score2;
        }
        // 1, 2, 3
        if(ding1 > 0 && ding2 > 0 && ding3 > 0) {
            returnScore = score3;
        }
         // 1, 2, 3 ,4
        if(ding1 > 0 && ding2 > 0 && ding3 > 0 && ding4 > 0) {
            returnScore = score4;
        }
         // 1, 2, 3 ,4 , 5
        if(ding1 > 0 && ding2 > 0 && ding3 > 0 && ding4 > 0 &&
                ding5 > 0 ) {
            returnScore = score5;
        }
        // 1, 2, 3 ,4 , 5, 6
        if(ding1 > 0 && ding2 > 0 && ding3 > 0 && ding4 > 0 &&
                ding5 > 0 && ding6 > 0) {
            returnScore = score6;
        }
        // 1, 1, 1
        if(ding1 == 3) {
            returnScore = score7;
        }

        //System.out.println(returnScore);

        return returnScore;
    } // end scoreFinder;

    public void addScores(int playerNum, int inScore) {

        // array expansion
        System.out.println(scores[playerNum].length);
        System.out.println(frame);
        if(scores[playerNum].length-1  < frame) {
            int[][] holder = new int[2][frame];
            for(int i = 0; i < scores[playerNum].length; i++) {
                holder[playerNum][i] = scores[playerNum][i];
            }
            scores = holder;
        }


        // add the score to the frame
        if(this.scoreFinder() == 100) {
            scores[playerNum][frame] = 0;
        } else
        {
            scores[playerNum][frame] += this.scoreFinder();
        }
        //System.out.println(scores[playerNum].length);
    } // end addScores

    public void playGame() {
        int highScore = 0;

        for(int i = 0; i < 6; i++) {
            this.roll();
            this.addScores(0, this.scoreFinder());

            this.roll();
            this.addScores(1, this.scoreFinder());
            frame++;
            
        }
    } // end playGame

    public int[][] getScores() {
        return scores;
    }

} // end Sequences
