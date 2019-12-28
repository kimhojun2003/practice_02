package PictureFind.ex;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class app extends JFrame{
   JLabel location;
   timer timer1;
   
   public app() {
      this.setTitle("틀린그림찾기");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // 이미지를 띄울 곳
      JPanel panel1 = new JPanel();
      panel1.setLayout(null);
      
      // 버튼 및 시간 check
      JPanel panel2 = new JPanel();
      panel2.setLayout(new BorderLayout());
      
      int score = 0;
	  JLabel scoreLabel = new JLabel("점수 : 0");
	  MyMouseListener listener = new MyMouseListener(panel1, this, score, scoreLabel);
      
      location = new JLabel("위치");
      
      // 이미지 띄우기
      ImageIcon icon = new ImageIcon("picture1.jpg");
      Image im = icon.getImage(); //뽑아온 이미지 객체 사이즈를 새롭게 만들기!
      Image im2 = im.getScaledInstance(500, 584, Image.SCALE_DEFAULT);
      ImageIcon icon2 = new ImageIcon(im2);
      JLabel imgView = new JLabel(icon2);

      // button
      JButton button = new JButton("다음 그림");
      // label
      JLabel label = new JLabel("남은 시간 : 300");
      
      // 시간을 측정하는 쓰레드
      timer1 = new timer(this, label);
      timer1.start();
      
      JPanel panel2_inside = new JPanel();
      panel2.add(panel2_inside, BorderLayout.LINE_START);
      
      imgView.setLocation(0,0);
      imgView.setSize(500, 584);

      panel1.add(imgView);
      panel1.setComponentZOrder(imgView, 0);      
      panel2_inside.add(label);
      panel2_inside.add(button);
      panel2_inside.add(scoreLabel);
      addMouseListener(listener);
      panel2.add(location, BorderLayout.NORTH);
      
      this.add(panel1);
      
      this.add(panel2, BorderLayout.LINE_END);
      
      this.setSize(600,684);
      this.setVisible(true);
   }
   
   // 마우스 event listener 라고 있을꺼야
   // 누르면 x,y 좌표 출력
   class MyMouseListener implements MouseListener {
      JPanel imgPanel;
      JFrame main;
      int score1;
      JLabel scoreLabel1;
      public MyMouseListener(JPanel iImg, JFrame iMain, int score, JLabel scoreLabel) {
         imgPanel = iImg;
         main = iMain;
         score1= score;
         scoreLabel1 = scoreLabel;
      }
      
      @Override
      public void mouseClicked(MouseEvent e) {     //더블 클릭
         
      }
      
      @Override
      public void mousePressed(MouseEvent e) {     //눌렀을 때 
         Thread.State state = timer1.getState();
         
         if (state == Thread.State.TERMINATED) {
            System.exit(0);
         }
         location.setText(Integer.toString(e.getX()) +" " + Integer.toString(e.getY()));
         
         if (e.getX() > 175 && 
            e.getX() <222 && 
            e.getY() > 369 && 
            e.getY() <430) {
        	 JLabel circle;
        	 ImageIcon icon3 = new ImageIcon("circle.jpg");
             Image im3 = icon3.getImage(); //뽑아온 이미지 객체 사이즈를 새롭게 만들기!
             Image im4 = im3.getScaledInstance(100, 102, Image.SCALE_DEFAULT);
             ImageIcon icon4 = new ImageIcon(im4);
             circle = new JLabel(icon4);
             
             circle.setLocation(150, 300);
             circle.setSize(100, 102);
             imgPanel.add(circle);
             imgPanel.setComponentZOrder(circle, 0);    // 이미지 겹쳤을 때 먼저 보여주는 것
             main.repaint();
             
             score1 = score1+2;
			 scoreLabel1.setText("점수 : " + Integer.toString(score1));
         }
         else if (e.getX() > 35 && 
            e.getX() <66 && 
            e.getY() > 104 && 
            e.getY() <149) {
        	 JLabel circle;
        	 ImageIcon icon3 = new ImageIcon("circle.jpg");
             Image im3 = icon3.getImage(); //뽑아온 이미지 객체 사이즈를 새롭게 만들기!
             Image im4 = im3.getScaledInstance(100, 102, Image.SCALE_DEFAULT);
             ImageIcon icon4 = new ImageIcon(im4);
             circle = new JLabel(icon4);
             
             circle.setLocation(1, 45);
             circle.setSize(100, 102);
             imgPanel.add(circle);
             imgPanel.setComponentZOrder(circle, 0);    // 이미지 겹쳤을 때 먼저 보여주는 것
             main.repaint();

             score1 = score1+2;
			 scoreLabel1.setText("점수 : " + Integer.toString(score1));
         }
         else {
            score1 = score1-2;
			scoreLabel1.setText("점수 : " + Integer.toString(score1));
         }
      }
      
      @Override
      public void mouseReleased(MouseEvent e) {
        
      }
      
      @Override
      public void mouseEntered(MouseEvent e) {
         
      }
      
      @Override
      public void mouseExited(MouseEvent e) {
         
      }
   }
   
   public static void main(String args[]) {
      new app();
   }
}