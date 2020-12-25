import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="SimpleKey" width=300 height=100>
</applet>
*/
public class SimpleKey extends Applet implements 
KeyListener {
String msg = "";
int X = 50, Y = 100; 
public void init() {
addKeyListener(this); //registering listener
}
public void keyPressed(KeyEvent ke) {
showStatus("Key Down");
}
public void keyReleased(KeyEvent ke) {
showStatus("Key Up");
}
public void keyTyped(KeyEvent ke) {
msg += ke.getKeyChar();
repaint();
}

public void paint(Graphics g) {
	System.out.println(msg);
}
}