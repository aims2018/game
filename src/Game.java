import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Game extends JFrame implements ActionListener {
	public JButton[] buttons;
	public String candidate;
	public String word;
	
	public char[] scramble(char[] input) {
		for (int counter=0;counter<100;counter++) {
			int position = (int)(input.length*Math.random());
			
			int position1 = position;
			
			while(position == position1) {
				position1 = (int)(input.length*Math.random());
			}
			
			char temp = input[position];
			input[position] = input[position1];
			input[position1] = temp;
		}
		
		return(input);
	}
	
	
	public Game(String title) {
		super(title);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Game game = new Game("Unscramble");
		
		game.setSize(400,400);
		game.setLocationRelativeTo(null);
		game.setDefaultCloseOperation(EXIT_ON_CLOSE);
		game.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}