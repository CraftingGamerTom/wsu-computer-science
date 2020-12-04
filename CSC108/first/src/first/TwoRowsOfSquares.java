package first;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.util.Scanner;

public class TwoRowsOfSquares {
	

	
	public static void draw(Graphics g, int columns, int rows)
	{

		
		final int width = 20;
		g.setColor(Color.BLUE);
		
		
		int x = 0;
		int y = 0;
		
		//Creates multiple rows
		//rows will execute two at a time
		for (int ii = 1; ii < rows + 1; ii++)
		{	
			//Top row. Note that the top left corner of the drawing has the coordinates (0,0)
			for (int i = 0; i < columns; i++)
			{
				g.drawRect(x, y, width, width);
				x = x + 2 * width;
			}
			x = width;
			y = y + width;
			
			// Second row, offset from the first one
			for (int i = 0; i < columns; i++)
			{
				g.fillRect(x, y, width, width);
				x = x + 2 * width;
			}
			x = width - width;
			y = y + width;
		}
		
	}
	public static void main(String [] args)
	{
		// Do not look at the code in the main method
		// Your code will go into the draw method above
		
		JFrame frame = new JFrame();
		
		final int FRAME_WIDTH = 3000;
		final int FRAME_HEIGHT = 2000;
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many sets of rows?");
		int rows = in.nextInt();
		System.out.println("How many columns?");
		int columns = in.nextInt();
		
		JComponent component = new JComponent()
		{
			public void paint(Graphics graph)
			{
				draw(graph, columns, rows);
			}
		};
		
		frame.add(component);
		frame.setVisible(true);
		
		in.close();
				
	}

}
