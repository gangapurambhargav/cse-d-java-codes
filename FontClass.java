import java.applet.Applet; 
import java.awt.*; 
/* <APPLET CODE ="FontClass.class" WIDTH=300 HEIGHT=200> </APPLET> */ 
public class FontClass extends Applet 
    { 
        Font f; 
        String m; 
          public void init() 
             { 
                 f=new Font(Font.SANS_SERIF,Font.BOLD,30); 
                 m="Welcome to Java"; 
                 setFont(f); 
             } 
                 public void paint(Graphics g) 
                     { 
                          //Color c=new Color(0,255,0); 
                          g.setColor(Color.blue); 
                          g.drawString(m,4,20); 
                     } 
  }                