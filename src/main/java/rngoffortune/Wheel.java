/*
 * Wheel.java - spin the wheel and see what you've won!
 */

package rngoffortune;

/**
 *
 * @author kevinlynch
 */
public class Wheel {

    private String[] wheel;
    private int wheelLen;
    
    public Wheel() {
        wheelLen = 10;
        wheel = new String[wheelLen];
        initWheel();
    }
    
    private void initWheel() {
        int ranInt;
        for (int i = 0; i < wheelLen; i++) {
            ranInt = (int) ((Math.random() * 1000) + 100);
            if (i == 5) {
                wheel[i] = "Bankrupt";
            } else {
                wheel[i] = Integer.toString(ranInt);
            }
        }
    }
    
    public String wheelTurns() {
        int ranIndex = (int)(Math.random() * 10);
        return wheel[ranIndex];
    }
    
}
