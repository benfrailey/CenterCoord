import javax.swing.*;
import java.awt.*;

public class CoordPanel extends JPanel
{
	
	Color panelColor;
	String message; // instance variable

	public CoordPanel(Color c, String m)
	{
		panelColor = c;
		message = m;
		this.setBackground(c);
	}
	
	public void paintComponent(Graphics g
	{
		super.paintComponent(g);
		int panelWidth = this.getWidth();
		int panelHeight = this.getHeight();
		
		
		g.setColor(Color.black);
		g.drawOval(panelWidth/2, panelHeight/2, 5, 5);
		Font myFont = new Font("Courier", Font.ITALIC, 10);
		g.setFont(myFont);
		g.drawString("(" + panelWidth/2 + ", " + panelHeight/2 + ")", panelWidth/2 - 25, panelHeight/2 + 20);	
		}
}
		