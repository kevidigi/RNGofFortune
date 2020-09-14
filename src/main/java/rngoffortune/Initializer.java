/*
 * Initializer.java - sets up the game
 */

package rngoffortune;

import java.util.ArrayList;

/**
 *
 * @author kevinlynch
 */

public class Initializer {
    
    private String sentence;
    private int sentenceLen;
    
    public Initializer() {
        
    }
    
    public int initSentence() {
        sentence = "Hello World"; // placeholder
        sentence = sentence.toUpperCase();
        sentenceLen = sentence.length();
        showMsg("Game is ready. Start playing!");
        return sentenceLen;
    }
    
    public ArrayList<Integer> receiveGuess (char inputChar) {
        inputChar = Character.toUpperCase(inputChar);
        ArrayList<Integer> indexList = new ArrayList();
        for (int i = 0; i < sentenceLen; i++) {
            if (sentence.charAt(i) == inputChar) {
                indexList.add(i);
            }          
        }
        return indexList;
    }
    
    public String getSentence() {
        return sentence;
    }
    
    public void showMsg(String msgStr) {
        System.out.println(msgStr);
    }
    
}
