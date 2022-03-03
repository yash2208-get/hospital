import java .awt.*;
import java .awt.event.*;
import javax .swing.*;
class vi extends Frame implements WindowListener,ActionListener
{
	private Button b1,b2;
	public vi()
	{
		setSize(400,400);
		setTitle("Student Main Page ");
		b1=new Button("Admin Login");
		b2=new Button("User Login");
		GridLayout f1=new GridLayout(2,1);
		add(b1);
		add(b2);
		setLayout(f1);
		addWindowListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);
	}
	public void windowClosing(WindowEvent e)
	{
		this.dispose();
	}
	public void windowClosed(WindowEvent e)
	{
		
	}
	public void windowOpened(WindowEvent e)
	{
	}
	public void windowActivated(WindowEvent e)
	{	
	}
	public void windowDeactivated(WindowEvent e)
	{
	}
	public void windowIconified(WindowEvent e)
	{	
	}
	public void windowDeiconified(WindowEvent e)
	{
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			dispose();
			new admin();
		}
		else if(e.getSource()==b2)
		{
			dispose();
			new user();
		}
	}
}
public class Main
{
	public static void main(String arr[])
	{
		vi f=new vi();
	}
}