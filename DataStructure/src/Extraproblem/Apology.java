package Extraproblem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Apology extends JFrame {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apology();
            }
        });
    }
    public Apology() {
        int strengthOfFeelings = 0;
        boolean apologyAccepted = false;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] understandableResponses = new String[] {"Apology accepted", "Grovel some more"};
        while (!apologyAccepted) {
            // Cumulative apology intensity is O(n^2) in the number of rejections.
            // TODO: Would something exponential help? You can never apologize
            // too much for a dumb "joke" like that.
            StringBuffer apologyMessage = new StringBuffer("I'm ");
            for (int i = 0; i < strengthOfFeelings; ++i) {
                apologyMessage.append("so ");
            }
            apologyMessage.append("sorry.");
            int result = JOptionPane.showOptionDialog(this, apologyMessage.toString(),
                "Accept the apology?", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                understandableResponses, understandableResponses[0]);
            if (result == 0) {
                // Everyone knows that click-through EULAs are legally binding.
                apologyAccepted = true;
            }
            else {
                ++strengthOfFeelings;
            }
        }
        JOptionPane.showMessageDialog(this, "Thank you! I promise I won't do that again.", "Sincere thanks",
            JOptionPane.PLAIN_MESSAGE);
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
}
