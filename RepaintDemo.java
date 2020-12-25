import java.applet.Applet;
import java.awt.*;

public class RepaintDemo extends Applet {
 
    int i;
	public void init()
	{
		setForeground(Color.cyan);
		setBackground(Color.red);
	}
 
    public void paint(Graphics g)
    {
		Font f=new Font("Arial",Font.ITALIC,40);
		setFont(f);
		//Color c=new Color(0,255,0);
		//g.setColor(Color.red);
        g.drawString("i = "+i, 100, 100);
     
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ex){}
     
        i++;
        repaint();
    }
}

/*
<applet code = "RepaintDemo.class" width = "320" height = "120">
</applet>
*/