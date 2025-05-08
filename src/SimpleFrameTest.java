import java.awt.*;
import javax.swing.*;

public class SimpleFrameTest{
   public static void main(String[] args){
      EventQueue.invokeLater(() ->{
            var frame = new SimpleFrame();
            frame.setTitle("Simple Frame");
            Toolkit kit = Toolkit.getDefaultToolkit();
            Dimension screenSize = kit.getScreenSize();
            frame.setSize(screenSize.width / 2, screenSize.height / 2);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         });
   }
}

class SimpleFrame extends JFrame{
   public SimpleFrame(){
      add(new HelloWorldComponent());
      pack();
   }
}

class HelloWorldComponent extends JComponent{
   @Override
   public void paintComponent(Graphics g) {

      Toolkit kit = Toolkit.getDefaultToolkit();
      Dimension screenSize = kit.getScreenSize();
      g.drawString("Hello, World", screenSize.width/4, screenSize.height/4 - 50);
   }
   @Override
   public Dimension getPreferredSize(){  
      return new Dimension(300, 300); 
   }
}
