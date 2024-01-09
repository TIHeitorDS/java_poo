package extras.berserkSymbolGUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Symbol extends JPanel {
    public Symbol() {
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);

        int width = getWidth();
        int height = getHeight();

        // vertical line
        g.drawLine(width / 2, 50, width / 2, height - 20);
        g.drawLine(width / 2, 80, (width / 2) - 20, 60);
        g.drawLine(width / 2, 80, (width / 2) + 20, 60);

        // left
        g.drawLine(120, 120, 160, 80);
        g.drawLine(120, 120, width / 2, height / 2);
        g.drawLine(width / 2, height / 2, 120, height - 120);
        g.drawLine(120, height - 120, width / 2, height - 20);

        // right
        g.drawLine(width - 120, 120, width - 160, 80);
        g.drawLine(width / 2, height / 2, width - 120, 120);
        g.drawLine(width / 2, height / 2, width - 120, height - 120);
        g.drawLine(width - 120, height - 120, width / 2, height - 20);
    }
}
