import java .awt.*;
import java .awt.event.*;
import javax .swing.*;
public class welc extends Frame implements ActionListener
{
	private MenuBar mb;
	private Menu m1,m2,m3;
	private MenuItem i1,i2,i3,i4,i5,i6;
	private Label l1;
	String r;
	public welc(String x)
	{
		r=x;
		setSize(400,400);
		setTitle("n");
		Font font = new Font("Verdana", Font.BOLD, 30);
		mb=new MenuBar();
		m1=new Menu("Course");	
		i1=new MenuItem("Student New");
		i2=new MenuItem("Student Update");
		i3=new MenuItem("Student Search");
		i4=new MenuItem("Student Delete");
		l1=new Label("Welcome "+ r);
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.add(i4);
		mb.add(m1);
		setMenuBar(mb);
		GridLayout f1=new GridLayout(2,1);
		setLayout(f1);
		add(l1);
		setFont(font);
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==i1)
		{
			dispose();
			new new_student();
		}
		else if(e.getSource()==i2)
		{	
			//JOptionPane.showMessageDialog(this,"BA Welcome");
			dispose();
			new update_student();
		}
		else if(e.getSource()==i3)
		{	
			//JOptionPane.showMessageDialog(this,"BA Welcome");
			dispose();
			new serch();
		}
		else if(e.getSource()==i4)
		{	
			//JOptionPane.showMessageDialog(this,"BA Welcome");
			dispose();
			new Delect();
		}	
	}
}
/*
It is a java API which is use to communieation between application and date base application
need of Date base handling .
As we known that we can store the date  varables array object etc but these all are tempication
and then solution is date base handling file handling.
Data base & file handling.
Data base handling is manialy recomnded for Storing the large ammount of data because it provide
well organize way to store the data.
 file handling is mainly recomnded for storing the small amont data main Draw back of file
 handling it Dose not provide well mgnt to Store the Data.
 Package => it is collection of classes and  interface.
 	----------- Data base Connnection-----------
 1 DrivesManager	class
 2 Connnection      interface
 3 statement        interface
 4 Resultset        interface
 1. DrivesManager =>
 					this class provide the various methods to eastabliish
 	1.registerDriver=>

 	public void registerDriver(Drivername)
getConnection=>this method is used to connect databasE AND java return an object of Connection
type
 	Connection getConnection(String Connectionstring)
------------------Connnection interface--------------
 	this method used to create an object of statement types which is used for execute the Data base
 	 qurse
 	createStatement();
--------------------Statement-----------------------
this interface is used to store an instance of statement type which is return by CreateStatement()
method.
1.executeQuery()
2.executeupadta()
	executeQuery()=>
		syntax: ResultexecuteQuery(Sting query)
	executeupata()
	this method used to execte the insert,delect and
	long executeUpata(Sting query)
-------------------Resultset------------------
1.next()
			boolean next();
2.getString():
			
*/