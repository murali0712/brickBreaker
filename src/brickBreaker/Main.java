package brickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj=new JFrame();
		Gameplay gp=new Gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("Breakout Ball");
		obj.setVisible(true);
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gp);
		obj.addKeyListener(gp);
		
	}

}
