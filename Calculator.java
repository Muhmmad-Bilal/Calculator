import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
	
	JFrame win=new JFrame();
	GridLayout grid=new GridLayout(7,5);
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton b0=new JButton("0");
	JButton back=new JButton("Del");
	JButton dot=new JButton(".");
	JButton ans=new JButton("ans");
	JButton ln=new JButton("ln");
	JButton sine=new JButton("sin");
	JButton cose=new JButton("cos");
	JButton tane=new JButton("tan");
	JButton x=new JButton("x");
	JButton plus=new JButton("+");
	JButton minus=new JButton("-");
	JButton multi=new JButton("*");
	JButton div=new JButton("/");
	JButton rem=new JButton("%");
	JButton equal=new JButton("=");
	JButton exp=new JButton("EXP");
	JButton sq=new JButton("²");
	JButton cubic=new JButton("³");
	JButton obreak=new JButton("("); 	
	JButton cbreak=new JButton(")");
	JButton pi=new JButton("π");
	JButton fact=new JButton("!");
	JButton ncr=new JButton("nCr");
	JButton log=new JButton("log");
	JLabel h=new JLabel("Memory"); 
	JRadioButton size=new JRadioButton();
		JButton ac=new JButton("AC");
		JButton mc=new JButton("MC");
		JButton mr=new JButton("MR");
		JButton mp=new JButton("M+");
		JButton mn=new JButton("M-");
		JButton ms=new JButton("MS");
		
	String value="";
	String op="";
	String s;
	Double s3;
		Double s4;
		double s5;
	//int a;
	//int b;
	JTextField tf=new JTextField();
	JTextField tfh=new JTextField();
	Calculator()
	{
		
		//con.setBackground(Color.gray);
		
		con.setLayout(null);
		con.setBackground(Color.gray);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		b5.setBackground(Color.white);
		b6.setBackground(Color.white);
		b7.setBackground(Color.white);
		b8.setBackground(Color.white);
		b9.setBackground(Color.white);
		b0.setBackground(Color.white);
		dot.setBackground(Color.white);
		ans.setBackground(Color.white);
		tf.setBackground(Color.white);
		b0.setBounds(30,380,60,30);
		b1.setBounds(30,340,60,30);
		b2.setBounds(100,340,60,30);
		b3.setBounds(170,340,60,30);
		b4.setBounds(30,300,60,30);
		b5.setBounds(100,300,60,30);
		b6.setBounds(170,300,60,30);
		b7.setBounds(30,260,60,30);
		b8.setBounds(100,260,60,30);
		b9.setBounds(170,260,60,30);
		sine.setBounds(170,230,60,30);
		cose.setBounds(240,230,60,30);
		x.setBounds(100,230,60,30);
		ans.setBounds(170,380,60,30);
		tane.setBounds(310,230,60,30);
		dot.setBounds(100,380,60,30);
		minus.setBounds(310,340,60,30);
		rem.setBounds(310,380,60,30);
		ln.setBounds(310,260,60,30);
		div.setBounds(310,300,60,30);
		back.setBounds(240,260,60,30);
		multi.setBounds(240,300,60,30);
		plus.setBounds(240,340,60,30);
		equal.setBounds(240,380,60,30);
		exp.setBounds(30,230,60,30);
		sq.setBounds(30,200,60,30);
		cubic.setBounds(100,200,60,30);
		obreak.setBounds(170,200,60,30);
		cbreak.setBounds(240,200,60,30);
		pi.setBounds(310,200,60,30);
		ncr.setBounds(30,170,60,30);
		fact.setBounds(100,170,60,30);
		log.setBounds(170,170,60,30);
		ac.setBounds(240,170,60,30);
		size.setBounds(320,175,20,20);
		equal.setBackground(Color.blue);
		tf.setBounds(30,25,330,60);
		tfh.setBounds(400,90,120,320);
		h.setBounds(400,20,80,80);
		mc.setBounds(30,140,60,30);
		mr.setBounds(100,140,60,30);
		mp.setBounds(170,140,60,30);
		mn.setBounds(240,140,60,30);
		ms.setBounds(310,140,60,30);
		win.setTitle("Calculator");
		//con.setBounds(200,150,400,400);
		//win.setBackground(Color.BLACK);
		tf.setEditable(false);
		tf.setHorizontalAlignment(JTextField.RIGHT);
		tfh.setHorizontalAlignment(JTextField.RIGHT);
		con.add(tf);
		con.add(h);
		//h.setFont(Color.blue);
		con.add(tfh);
		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(b4);
		con.add(b5);
		con.add(b6);
		con.add(b7);
		con.add(b8);
		con.add(b9);
		con.add(b0);
		con.add(back);
		con.add(dot);
		con.add(ans);
		con.add(plus);
		con.add(minus);
		con.add(multi);
		con.add(div);
		con.add(rem);
		con.add(equal);
		con.add(ln);
		con.add(sine);
		con.add(cose);
		con.add(tane);
		con.add(x);
		con.add(exp);
		con.add(sq);
		con.add(cubic);
		con.add(obreak);
		con.add(cbreak);
		con.add(pi);
		con.add(ncr);
		con.add(fact);
		con.add(log);
		con.add(ac);
		con.add(mc);
		con.add(mn);
		con.add(mr);
		con.add(ms);
		con.add(mp);
		con.add(size);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		ac.addActionListener(this);
		tfh.addActionListener(this);
		dot.addActionListener(this);
		back.addActionListener(this);
		ans.addActionListener(this);
		ln.addActionListener(this);
		sine.addActionListener(this);
		cose.addActionListener(this);
		tane.addActionListener(this);
		x.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		multi.addActionListener(this);
		div.addActionListener(this);
		rem.addActionListener(this);
		equal.addActionListener(this);
		exp.addActionListener(this);
		sq.addActionListener(this);
		cubic.addActionListener(this);
		obreak.addActionListener(this);
		cbreak.addActionListener(this);
		pi.addActionListener(this);
		ncr.addActionListener(this);
		fact.addActionListener(this);
		log.addActionListener(this);
		mc.addActionListener(this);
		mr.addActionListener(this);
		mp.addActionListener(this);
		mn.addActionListener(this);
		ms.addActionListener(this);
		size.addActionListener(this);
		win.setBounds(0,0,560,460);
		win.show();
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(b1==e.getSource())
		{
			String s=tf.getText()+b1.getText();
			tf.setText(s);
		}
		if(b2==e.getSource())
		{
			String s=tf.getText()+b2.getText();
			tf.setText(s);
		}
		if(b3==e.getSource())
		{
			String s=tf.getText()+b3.getText();
			tf.setText(s);
		}
		if(b4==e.getSource())
		{
			String s=tf.getText()+b4.getText();
			tf.setText(s);
		}
		
		if(b6==e.getSource())
		{
			String s=tf.getText()+b6.getText();
			tf.setText(s);
		}
		if(b7==e.getSource())
		{
			String s=tf.getText()+b7.getText();
			tf.setText(s);
		}
		if(b8==e.getSource())
		{
			String s=tf.getText()+b8.getText();
			tf.setText(s);
		}
		if(b9==e.getSource())
		{
			String s=tf.getText()+b9.getText();
			tf.setText(s);
		}
		if(b0==e.getSource())
		{
			String s=tf.getText()+b0.getText();
			tf.setText(s);
		}
		if(pi==e.getSource())
		{
			double p=Math.PI;
			tf.setText(p+"");
		}
		if(ac==e.getSource())
		{
			tf.setText("");
		}
		if(plus==e.getSource())		//plus
		{
			String s=tf.getText();
			tf.setText(s);
		}
		if(rem==e.getSource())
		{
			String s=tf.getText();
			tf.setText(s);
		}
		
		if(b5==e.getSource())
		{
			String s=tf.getText()+b5.getText();
			tf.setText(s);
			
			//tf.setText(5*7+"");
		}	
		if(log==e.getSource())
		{
			String s=tf.getText();
			double s1=Double.parseDouble(s);
			tf.setText(Math.log(s1)+"");
		}
		
		if(dot==e.getSource())
		{
			String s=tf.getText();
			int index=s.indexOf(".");
			if(index==-1)
			{
				tf.setText(s+".");
			}
		}
		if(minus==e.getSource())
		{
			String s=tf.getText();
			tf.setText(s);
		}
		
		if(sine==e.getSource())
		{
			String s=tf.getText();
			double s1=Double.parseDouble(s);
			tf.setText("" + Math.sin(s1));

		}
		if(cose==e.getSource())
		{
			String s=tf.getText();
			double s1=Double.parseDouble(s);
		tf.setText("" + Math.cos(s1));
		}
		if(tane==e.getSource())
		{
			String s=tf.getText();
			double s1=Double.parseDouble(s);
			tf.setText("" + Math.tan(s1));
		}
		if(exp==e.getSource())
		{
			String s=tf.getText();
			double s1=Double.parseDouble(s);
			tf.setText(""+Math.exp(s1));
		}
		if(sq==e.getSource())
		{
			String s=tf.getText();
			double s1=Double.parseDouble(s);
			tf.setText(Math.pow(s1,2)+"");
		}
		if(cubic==e.getSource())
		{
			String s=tf.getText();
			double s1=Double.parseDouble(s);
			tf.setText(Math.pow(s1,3)+"");
		}
		if(fact==e.getSource())
		{
			Double s=Double.parseDouble(tf.getText());
			int fact=1;
			for(int i=1;i<=s;i++)
			{
				fact=fact*i;
			}
			tf.setText(fact+"");
			
			
		}
		
			
		if(plus==e.getSource())	//plus`
		{
			value=tf.getText();
			op="+";
			tf.setText("");
		}
		if(minus==e.getSource())
		{
			value=tf.getText();
			op="-";
			tf.setText("");
		}
		if(multi==e.getSource())
		{
			value=tf.getText();
			op="*";
		tf.setText("");
			
		}
		if(div==e.getSource())
		{
		value=tf.getText();
			op="/";
			tf.setText("");
			
		}
		if(rem==e.getSource())
		{
			value=tf.getText();
			op="%";
			tf.setText("");
			//System.out.println(op);
		}
		
		if(ms==e.getSource())
		{
		s3=Double.parseDouble(tf.getText());
		tfh.setText(s3+"");
		}
		if(mp==e.getSource())
		{
			 s4=Double.parseDouble(tfh.getText());
			 s5=s4+s3;
			tfh.setText(s5+"");
			//tf.setText(s3+"");
			//tfh.setText(s3+"");
		}
		if(mn==e.getSource())
		{
			s4=Double.parseDouble(tfh.getText());
			 s5=s4-s3;
			tfh.setText(s5+"");
		}
		if(mr==e.getSource())
		{
			tf.setText(s5+"");
		}
		if(mc==e.getSource())
		{
			tfh.setText("");
		}
		if(size==e.getSource())
		{
			win.setBounds(0,0,650,650);
		}
		if(b2==e.getSource())
		{
			 s=tf.getText();
			tf.setText(s);
		}
		
		
		if(equal==e.getSource())
		{

			Double	a=Double.parseDouble(value);
						
			Double c=Double.parseDouble(tf.getText());
		
		if(op.equals("+"))
				tf.setText(""+(a+c));
			if(op.equals("-"))
				tf.setText(""+(a-c));
			if(op.equals("*"))
				tf.setText(""+a*c);
			if(op.equals("/"))
				tf.setText(""+a/c);
			if(op.equals("%"))
			{
				tf.setText(""+a%c);
			}
			
		}
		if(back==e.getSource())
		{
			String s=tf.getText();
			int len=s.length();
			String cutstr=s.substring(0,len-1);
			tf.setText(cutstr);
		}		
		
			//System.out.println(value);
		
	}
public static void main(String arg[])
	{
	new Calculator();
	}
}