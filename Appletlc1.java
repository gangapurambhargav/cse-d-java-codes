import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Appletlc1 extends Applet {
   
    public void init()
    {
        System.out.println("Applet : Initialized");
    }
    
    public void start()
    {
        System.out.println("Applet : Started");
    }
    
    public void stop()
    {
        System.out.println("Applet : Stopped");
    }
    
    public void paint(Graphics g)
    {
        
        System.out.println("Applet : Running");
    }
    
    public void destroy()
    {
        System.out.println("Applet : Destroyed"); 
    }
}

/*
<applet code = "Appletlc1.class"  height = "120" width = "320">
</applet>
*/






