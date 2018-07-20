import javax.swing.*;
import java.util.*;

// Set up window, draw to window...
//Set up random number (Getter Setter) to correspond to grid which then displays to window\
// interface controls to adjust grid, current alivecells, 
public class conwayMain {
	public static void main(String[] args) {
	
		System.out.println("Hello World");
		
		
		int generation = 10;
		Random randomGenerator = new Random();
		JFrame frame = new JFrame("Set up");
		
		//Intial Setup Generation count then generate... // text to ask , txt box, submit button 
		
		frame.setSize(250,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	
		conwayCell nCell[] = new conwayCell[600]; 
		
		while (generation != 0) {
			System.out.println(generation + "**" + randomGenerator.nextInt(10));
			
			generation -= 1;
		}
	}	
}
