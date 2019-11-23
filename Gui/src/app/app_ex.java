// 2019/11/23

package app;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class app_ex extends JFrame{
	
	JPanel contentPane = new JPanel();
	JLabel la;
	
	app_ex(){
		 setTitle("test");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      setContentPane(contentPane);
	      
	      contentPane.addMouseListener(new MyMouseListener());
	      
	      contentPane.addMouseMotionListener(new MyMouseListener());
	      
	      la = new JLabel("Touch Me !!");
	      contentPane.add(la);
	      setSize(300,200);
	      setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener{
		public void mousePressed(MouseEvent e) {
			la.setText("MousePressed("+e.getX()+","+e.getY()+")");
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased("+e.getX()+","+e.getY()+")");
		}
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) {
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
			
				JPanel p = (JPanel)e.getSource();
				p.setBackground(new Color(r, g, b));
			}
		}
		
		public void mouseEntered(MouseEvent e) {
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.YELLOW);
		}
		
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged("+e.getX()+","+e.getY()+")");
		}
		
		public void mousExited(MouseEvent e) {
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.
					GREEN);
		}
		
		public void mouseMoved(MouseEvent e) {
			la.setText("MouseMoved("+e.getX()+","+e.getY()+")");
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new app_ex();
	}

}
