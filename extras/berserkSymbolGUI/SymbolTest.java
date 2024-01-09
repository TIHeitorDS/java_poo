package extras.berserkSymbolGUI;

import javax.swing.JFrame;

public class SymbolTest {
    public static void main(String[] args) {
        Symbol berserkSymbol = new Symbol();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(berserkSymbol);
        application.setSize(480, 480);
        application.setVisible(true);
    }
}
