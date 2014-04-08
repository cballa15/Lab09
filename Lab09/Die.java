/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Write a description of class Die here.
 *
 * @author Chris
 * @version (a version number or a date)
 */
public class Die {

    /**
     * Constructor for objects of class Die
     */

    private int numSides;
    private int faceValue;

    public Die() {
        numSides = 6;
        faceValue = (int)(Math.random()*numSides) + 1;

    }

    public Die(int inNumSides) {
        numSides = inNumSides;
        faceValue = (int)(Math.random()*inNumSides) + 1;

    }

    public Die(Die inDie) {
        this.faceValue = inDie.faceValue;
        this.numSides = inDie.numSides;
    }

    public void roll() {
        faceValue = (int)(Math.random()*numSides) + 1;
    }

    public boolean equals(Die inDie) {
        if(this.faceValue == inDie.faceValue &&
                this.numSides == inDie.numSides) {
            return true;
        } else {
            return false;
        }
    } // equals equals

    public int compareTo(Die inDie) {
        if(this.faceValue == inDie.faceValue) {
            return 0;
        } else if(this.faceValue < inDie.faceValue) {
            return -1;
        } else {
            return 1;
        }
    } // end compareTo

    public String toString() {
        String result;
        result = "Num Sides: " + numSides + "\nFace Value: " + faceValue;
        return result;
    }
}
