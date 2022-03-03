import java .awt.*;
import java .awt.event.*;
import javax .swing.*;
public class admin extends Frame implements WindowListener,ActionListener
{
	private Label l1,l2;
	private Button b1,b2;
	private TextField t1,t2;
	private String s1,s2;
	public String r;
	public admin()
	{
		setSize(400,400);
		setTitle("Admin Form");
		l1=new Label("Enter Your Name");
		l2=new Label("Enter Your Password");
		t1=new TextField(10);
		t2=new TextField(10);
		b1=new Button("Login");
		b2=new Button("Reset");
		GridLayout f3=new GridLayout(3,2);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		addWindowListener(this);
		b1.addActionListener(this);
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
		
		s1=t1.getText();
		s2=t2.getText();
		r=s1;
		if(e.getSource()==b1)
		{
			if(s2.equals("123"))
			{
				JOptionPane.showMessageDialog(this,"Sussull");
				welc obj=new welc(r);
				dispose();
			}
		}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t1.requestFocus();
		}
	}
}
/*https://www.microsoft.com/en-us/windows/event?ocid=prod_cons_win_awr_Preannounce*/