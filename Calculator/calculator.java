import java.awt.*;  
import java.awt.event.*; 
import java.awt.Font;

class Calculator extends WindowAdapter implements ActionListener{ 
    Frame f; 
    Label l1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback;
    double xd;
    double num1,num2,check;

Calculator()
{   
    //Creating the frame and its componants

    f= new Frame("MY CALCULATOR");
    l1=new Label();
    Font newFont = new Font("Serif", Font.BOLD, 24);
    l1.setFont(newFont);
    f.setBackground(Color.black);

    l1.setBackground(Color.LIGHT_GRAY);
    l1.setBounds(50,50,260,60);
    b1=new Button("1");
    b1.setForeground(Color.black);
    b1.setBackground(Color.white);
    b1.setBounds(50,340,50,50);
    b2=new Button("2");
    b2.setForeground(Color.black);
    b2.setBackground(Color.white);
    b2.setBounds(120,340,50,50);
    b3=new Button("3");
    b3.setForeground(Color.black);
    b3.setBackground(Color.white);
    b3.setBounds(190,340,50,50);
    b4=new Button("4");
    b4.setForeground(Color.black);
    b4.setBackground(Color.white);
    b4.setBounds(50,270,50,50);
    b5=new Button("5");
    b5.setForeground(Color.black);
    b5.setBackground(Color.white);
    b5.setBounds(120,270,50,50); 
    b6=new Button("6");
    b6.setForeground(Color.black);
    b6.setBackground(Color.white);
    b6.setBounds(190,270,50,50);
    b7=new Button("7");
    b7.setForeground(Color.black);
    b7.setBackground(Color.white);
    b7.setBounds(50,200,50,50);
    b8=new Button("8");
    b8.setForeground(Color.black);
    b8.setBackground(Color.white);
    b8.setBounds(120,200,50,50);
    b9=new Button("9");
    b9.setForeground(Color.black);
    b9.setBackground(Color.white);
    b9.setBounds(190,200,50,50);
    b0=new Button("0");
    b0.setForeground(Color.black);
    b0.setBackground(Color.white);
    b0.setBounds(120,410,50,50);
    bneg=new Button("+/-");
    bneg.setForeground(Color.black);
    bneg.setBackground(Color.white);
    bneg.setBounds(50,410,50,50);
    bpts=new Button(".");
    bpts.setForeground(Color.black);
    bpts.setBackground(Color.white);
    bpts.setBounds(190,410,50,50);
    bback=new Button("back");
    bback.setForeground(Color.black);
    bback.setBackground(Color.white);
    bback.setBounds(120,130,50,50);

    badd=new Button("+");
    badd.setForeground(Color.black);
    badd.setBackground(Color.white);
    badd.setBounds(260,340,50,50);
    bsub=new Button("-");
    bsub.setForeground(Color.black);
    bsub.setBackground(Color.white);
    bsub.setBounds(260,270,50,50);
    bmult=new Button("*");
    bmult.setForeground(Color.black);
    bmult.setBackground(Color.white);
    bmult.setBounds(260,200,50,50);
    bdiv=new Button("/");
    bdiv.setForeground(Color.black);
    bdiv.setBackground(Color.white);
    bdiv.setBounds(260,130,50,50);
    bmod=new Button("%");
    bmod.setForeground(Color.black);
    bmod.setBackground(Color.white);
    bmod.setBounds(190,130,50,50);
    bcalc=new Button("=");
    bcalc.setForeground(Color.black);
    bcalc.setBackground(Color.white);
    bcalc.setBounds(245,410,65,50);
    bclr=new Button("CE");
    bclr.setForeground(Color.black);
    bclr.setBackground(Color.white);
    bclr.setBounds(50,130,65,50);

    //Adding a listener for each componant of the frame for event handling.

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
    bpts.addActionListener(this);  
    bneg.addActionListener(this);
    bback.addActionListener(this); 

    badd.addActionListener(this);
    bsub.addActionListener(this);
    bmult.addActionListener(this);
    bdiv.addActionListener(this);
    bmod.addActionListener(this);
    bcalc.addActionListener(this);
    bclr.addActionListener(this); 
    f.addWindowListener(this);
     
    //Adding each  componant to the frame, for them to be displayed

    f.add(l1);  
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(b0);
    f.add(badd);
    f.add(bsub);
    f.add(bmod);
    f.add(bmult);
    f.add(bdiv);
    f.add(bmod);
    f.add(bcalc);
    f.add(bclr);
    f.add(bpts);
    f.add(bneg);
    f.add(bback);

    //Setting the frame characteristics
    f.setSize(360,500);  
    f.setLayout(null); //Because we want to set the dimensions of frame componants b y ourselves 
    f.setVisible(true);  //THe frame should be displayed in order to see what we've done
}

//handle window closing

public void windowClosing(WindowEvent e)
{
  f.dispose();
}

    public void actionPerformed(ActionEvent e)
    { 
        String z,zt;

        if(e.getSource()==b1) {
            zt=l1.getText();          //getting the current displayed text in the label
            z=zt+"1";                 //concataining it with the corresponding clicked button
            l1.setText(z);            // setting the new corrrsponding text to the label
        }
        if(e.getSource()==b2) {
            zt=l1.getText();
            z=zt+"2";
            l1.setText(z);
        }
        if(e.getSource()==b3) {
            zt=l1.getText();
            z=zt+"3";
            l1.setText(z);
        }
        if(e.getSource()==b4) {
            zt=l1.getText();
            z=zt+"4";
            l1.setText(z);
        }
        if(e.getSource()==b5) {
            zt=l1.getText();
            z=zt+"5";
            l1.setText(z);
        }
        if(e.getSource()==b6) {
            zt=l1.getText();
            z=zt+"6";
            l1.setText(z);
        }
        if(e.getSource()==b7) {
            zt=l1.getText();
            z=zt+"7";
            l1.setText(z);
        }
        if(e.getSource()==b8) {
            zt=l1.getText();
            z=zt+"8";
            l1.setText(z);
        }
        if(e.getSource()==b9) {
            zt=l1.getText();
            z=zt+"9";
            l1.setText(z);
        }
        if(e.getSource()==b0) {
            zt=l1.getText();
            z=zt+"0";
            l1.setText(z);
        }
        if(e.getSource()==bpts) {
            zt=l1.getText();
            z=zt+".";
            l1.setText(z);
        }
        if(e.getSource()==bneg) {
            zt=l1.getText();
            z="-"+zt;
            l1.setText(z);
        }
        if(e.getSource()==bback) {
            zt=l1.getText();
            try
            {
                z=zt.substring(0, zt.length()-1);                     //Deletion of one character
            }
            catch(StringIndexOutOfBoundsException f)                 //error case
            {
                return;
            }
            l1.setText(z);
        }
        if(e.getSource()==badd) {                     //ADDITION
            try
            {
                num1=Double.parseDouble(l1.getText());
            }
            catch(NumberFormatException f)
            {
                l1.setText("Invalid Format");
                return;
            }
            z="";
            l1.setText(z);
            check=1;
        }
        if(e.getSource()==bsub) {                      //FOR SUBTRACTION
            try
            {
                num1=Double.parseDouble(l1.getText());
            }
            catch(NumberFormatException f)
            {
                l1.setText("Invalid Format");
                return;
            }
            z="";
            l1.setText(z);
            check=2;
        }
        if(e.getSource()==bmult) {                   //FOR MULTIPLICATION
            try
            {
                num1=Double.parseDouble(l1.getText());
            }
            catch(NumberFormatException f)
            {
                l1.setText("Invalid Format");
                return;
            }
            z="";
            l1.setText(z);
            check=3;
        }
        if(e.getSource()==bdiv) {                   //FOR DIVISION
            try
            {
                num1=Double.parseDouble(l1.getText());
            }
            catch(NumberFormatException f)
            {
                l1.setText("Invalid Format");
                return;
            }
            z="";
            l1.setText(z);
            check=4;
        }
        if (e.getSource()==bmod) {                  //FOR MOD/REMAINDER
            try
            {
                num1=Double.parseDouble(l1.getText());
            }
            catch(NumberFormatException f)
            {
                l1.setText("Invalid Format");
                return;
            }
            z="";
            l1.setText(z);
            check=5;
        }
                                                       //Handling results
        if(e.getSource()==bcalc) {          
            try
            {
                num2=Double.parseDouble(l1.getText());
            }
            catch(Exception f)
            {
                l1.setText("ENTER NUMBER FIRST ");
                return;
            }
            if(check==1)
                xd =num1+num2;
            if(check==2)
                xd =num1-num2;
            if(check==3)
                xd =num1*num2;
            if(check==4)
                xd =num1/num2; 
            if(check==5)
                xd =num1%num2;    
            l1.setText(String.valueOf(xd));
        }
        if(e.getSource()==bclr) {                        //CLEAR button
            num1=0;
            num2=0;
            check=0;
            xd=0;
            z="";
            l1.setText(z);
        } 
}  
    public static void main(String args[])
    {  
        new Calculator();  
    }
}  

