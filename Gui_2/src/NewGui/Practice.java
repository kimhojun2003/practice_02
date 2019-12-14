package NewGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Practice extends JFrame{
	public Practice() {
		setTitle("new window test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel MainContainer = new JPanel();
		setContentPane (MainContainer);
		
		JButton OpenWindow = new JButton("새 창 띄우기");
		
		OpenWindow.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				new newWindow();
			}
		});
		MainContainer.add(OpenWindow);
		
		setSize(1000, 500);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Practice();
	}

}

class newWindow extends JFrame {
	newWindow(){
		setTitle("새창~");
		
		JLabel newLabel = new JLabel("성공");
		
		JLabel timing = new JLabel();
		
		add(newLabel);
		setSize(300,100);
		setResizable(false);
		setVisible(true);
	}
}