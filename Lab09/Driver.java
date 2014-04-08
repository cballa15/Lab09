/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * Write a description of class Driver here.
 * 
 * @author Chris
 * @version (a version number or a date)
 */
public class Driver {

    /**
     * Constructor for objects of class Driver
     */
    public Driver() {
    }

    /**
     * main method, application starts here.
     * 
     * @param args execution arguments
     */
    public static void main(String[] args) {
        Sequences s1 = new Sequences();
        int[][] scores = s1.getScores();
        int rows = 2;
        int cols = 3;
        int[][] test = new int[rows][cols];

        s1.playGame();

        //for(int i = 0;i <scores.length; i ++) {
          //  for(int k = 0; k < scores[i].length; k ++) {
            //    System.out.println("Player: " + i + " Score: " + scores[i][k]);
            //}
        //}

        //System.out.println(test.length);
        
        //System.out.println();
        for(int i = 0;i <scores.length; i ++) {
            for(int k = 0; k < scores[i].length; k ++) {
                System.out.print(scores[i][k] + " ");
            }
            System.out.println();
        }

        //s1.roll();
        //int blah = s1.scoreFinder();
        //s1.addScores(6);
    }
}
