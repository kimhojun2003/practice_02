package PictureFind.ex;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class timer extends Thread{
   JLabel timeCheck;
   JFrame main;
   int remainTime;
   public timer (JFrame frame, JLabel label) {
      timeCheck = label;
      main = frame;
      remainTime = 300;
   }
   
   public void run() {
      while(remainTime > 0) {
         try {
            Thread.sleep(1000);
         }
         catch(Exception e) {
            e.printStackTrace();
         }
         remainTime--;
         timeCheck.setText("남은 시간: " + Integer.toString(remainTime));
      }
      JOptionPane.showMessageDialog(main, "Time Out");
   }
}
