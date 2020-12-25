import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Appletlc extends Applet {
   
    public void init()
    {
        JOptionPane.showMessageDialog(null,"Applet : Initialized");
    }
    
    public void start()
    {
        JOptionPane.showMessageDialog(null,"Applet : Started");
    }
    
    public void stop()
    {
        JOptionPane.showMessageDialog(null,"Applet : Stopped");
    }
    
    public void paint(Graphics g)
    {
        
        g.drawString("Applet : Running", 100, 100);
    }
    
    public void destroy()
    {
        JOptionPane.showMessageDialog(null,"Applet : Destroyed"); 
    }
}

/*
<applet code = "Appletlc.class"  height = "120" width = "320">
</applet>
*/






