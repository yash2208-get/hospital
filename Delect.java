import java .awt.*;

import java .awt.event.*;
import javax .swing.*;
public class Delect extends Frame implements WindowListener,ActionListener
{
	private Label l1,l2,l3,l4,l5,l6,l7,l8;
	private Button b1,b2;
	private TextField t1,t2,t3,t4,t5,t6;
	private String s1,s2;
	public String r;
	public Delect()
	{
		setSize(400,400);
		setTitle("Srech Student");
		l1=new Label("Enter Your Name");
		l2=new Label("Enter Your Password");
		l3=new Label("Enter Your Roll number");
		l4=new Label("Enter Your E-mail");
		l5=new Label("Enter Your Phone");
		l6=new Label("Enter Your Adress");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		t5=new TextField(10);
		t6=new TextField(10);
		b1=new Button("Login");
		b2=new Button("Back");
		GridLayout f3=new GridLayout(7,2);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		add(l6);
		add(t6);
		add(b1);
		add(b2);
		addWindowListener(this);
		b2.addActionListener(this);
		setLayout(f3);
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
		if(e.getSource()==b2)
		{
			dispose();
			new welc(r);
		}
	}
}
