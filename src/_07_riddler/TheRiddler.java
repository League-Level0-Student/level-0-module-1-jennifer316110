package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("What color is the wind?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equals("Blew")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}
else {
	// 5. Otherwise, say "wrong" and tell them the answer
	JOptionPane.showMessageDialog(null, "Incorrect:(");
	
}
		

		// 6. Add some more riddles
JOptionPane.showInputDialog("What do you call two witches who live together?");
if (answer.equals("Broommates!")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect:(");
}
	

}
		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}

