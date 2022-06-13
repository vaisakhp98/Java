
<html>
<head>
</head>
<body>
         <applet code = "rect" width = "420" height = "320"></applet>
</body>
</html>
import java.awt.*;
import java.applet.*;
public class rect extends Applet
{
 	public void paint(Graphics g)
	{
	 	g.drawRect(100, 150, 100, 100);
	}
}