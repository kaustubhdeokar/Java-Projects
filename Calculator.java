import javax.swing.*;

public class Calculator {
	
	public static void main(String[] args){
		
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setLocation(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//or both the above can we merged together//setBounds(setLocation-x,setLocation-y,setsize-x,setsize-y) 
		
		frame.setTitle("Calc");
	}
	
}
