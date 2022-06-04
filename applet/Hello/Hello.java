import java.applet.*;
import java.awt.*;



/* <applet code = "hello.class" height = "100" width = "100">
 </applet> */
public class Hello extends Applet{
    public void paint (Graphics g){
        g.drawString("HelloWorld",100,100);
    }

}