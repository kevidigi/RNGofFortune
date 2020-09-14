/*
 * Board.java - represents the board with the phrase to guess
 */

package rngoffortune;
import java.util.ArrayList;

/**
 *
 * @author kevinlynch
 */

public class Board {

    private int strLen;
    private char[] charAry;

    public Board() {
    }

    public void initBoard(int oriStrLen) {
        strLen = oriStrLen;
        charAry = new char[strLen];
        initCharAry(charAry); // init it with ' ' char
    }

    public boolean insertCharArray(ArrayList<Integer> idxAry, char inputChar) {
        boolean exist = false;
        inputChar = Character.toUpperCase(inputChar);
        for (Integer idx : idxAry) {
            if (charAry[idx] == (inputChar)) {
                exist = true;
                break;
            } else {
                charAry[idx] = inputChar;
            }
        }
        return exist;
    }

    public void showBoard() {
        showTop();
        fillCharAry(charAry);
        showBottom();
        showLineEnd();
    }

    public void showTop() {
        for (int i = 0; i < strLen; i++) {
            showUnit("-----");
        }
        showLineEnd();
        for (int i = 0; i < strLen; i++) {
            showUnit("|   |");
        }
        showLineEnd();
    }

    public void showBottom() {
        for (int i = 0; i < strLen; i++) {
            showUnit("|   |");
        }
        showLineEnd();
        for (int i = 0; i < strLen; i++) {
            showUnit("-----");
        }
        showLineEnd();
    }

    public void fillCharAry(char[] current) {
        for (int i = 0; i < strLen; i++) {
            showUnit("| " + current[i] + " |");
        }
        showLineEnd();
    }

    public void showUnit(String drawStr) {
        System.out.print(drawStr);
    }

    public void showLineEnd() {
        System.out.println();
    }

    public void initCharAry(char[] ary) {
        for (int i = 0; i < strLen; i++) {
            ary[i] = ' ';
        }
    }

    public char[] getCharAry() {
        return charAry;
    }
}