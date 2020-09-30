import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Flag extends Frame
{
	Flag()
	{
		setVisible(true);
		setSize(1000,800);
		setLocation(100,10);
		addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
			});
	}

	
	public void paint(Graphics g)
		{
			g.setColor(Color.black);
			try
			{
				Thread.sleep(500);
				g.fillRect(100,180,10,450);
				Thread.sleep(700);
				g.fillRect(80,630,50,10);
				Thread.sleep(1000);
				g.fillRect(70,640,70,10);
				Thread.sleep(1200);
				g.fillRect(60,650,90,10);
				g.setColor(Color.orange);
				Thread.sleep(1400);
				g.fillRect(110,190,270,50);
				g.setColor(Color.green);
				Thread.sleep(1600);
				g.fillRect(110,275,270,50);
				Thread.sleep(1700);
			int x=232;
			int y=240;
			int w=40;
			int h=36;
			int sa=0;
			int ma=10;
			for(int i=1;;i++) 
			{
				int r1=(int)Math.round(Math.random()*255);
				int g1=(int)Math.round(Math.random()*255);
				int b1=(int)Math.round(Math.random()*255);
				Color c=new Color(r1,g1,b1);
				g.setColor(c);
				g.fillArc(x,y,w,h,sa,ma);
				sa=sa+15;
				
			}
		}
		catch(Exception e){}
}
	public static void main(String[] args) {
		
		Flag jf=new Flag();
		
	}
}