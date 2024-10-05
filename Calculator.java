import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.lang.Math;
import javax.swing.Timer;
class Main{
   
  public static long numberOne;
  public static long numberTwo;
  public static Timer timer;
  public static final int TEN_SECOND = 1000;
  public static int you = 10;
  

  public static void main(String[] args)  throws NumberFormatException  {
    
    JFrame CalFrame = new JFrame("CalcNA");
    JPanel PanelJTextArea = new JPanel();
    JPanel PanButton = new JPanel();
   
    Color WHITE = new Color(250,250,250);
    Color LIGHT_GRAY = new Color(220,220,220);
    Color DARKER_GRAY = new Color(200, 200, 200);
    Color DARK_GRAY = new Color(140, 140, 140);
    Color LIGHT_BLACK  = new Color(9, 9, 9);
    Color GRAY = new Color(190, 190, 190);
    Color BLACK = new Color(0,0,0);
    


  
    CalFrame.setLayout(new FlowLayout());
    CalFrame.setVisible(true);
    CalFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    CalFrame.setResizable(true);
    CalFrame.add(PanelJTextArea, BorderLayout.NORTH);
    CalFrame.add(PanButton, BorderLayout.SOUTH);
    

    PanButton.setPreferredSize(new Dimension(210,200));
    Border emptyBorder = BorderFactory.createEmptyBorder();

    JButton squarert = new JButton("sqrt");
    squarert.setVisible(true);
    squarert.setBorder(emptyBorder);
    squarert.setBackground(GRAY);
    squarert.setPreferredSize(new Dimension (45,20));
    squarert.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton square = new JButton("^");
    square.setVisible(true);
    square.setBorder(emptyBorder);
    square.setBackground(GRAY);
    square.setPreferredSize(new Dimension (45,20));
    square.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton Division = new JButton("÷");
    Division.setVisible(true);
    Division.setBorder(emptyBorder);
    Division.setBackground(GRAY);
    Division.setPreferredSize(new Dimension (45,20));
    Division.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton X = new JButton("X");
    X.setVisible(true);
    X.setBorder(emptyBorder);
    X.setBackground(GRAY);
    X.setPreferredSize(new Dimension (45,20));
    X.setFont(new Font("Monospaced", Font.PLAIN, 12));


    JButton Seven = new JButton("7");
    Seven.setVisible(true);
    Seven.setBorder(emptyBorder);
    Seven.setBackground(GRAY);
    Seven.setPreferredSize(new Dimension (45,25));
    Seven.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton Eight = new JButton("8");
    Eight.setVisible(true);
    Eight.setBorder(emptyBorder);
    Eight.setBackground(GRAY);
    Eight.setPreferredSize(new Dimension (45,25));
    Eight.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton nine = new JButton("9");
    nine.setVisible(true);
    nine.setBorder(emptyBorder);
    nine.setBackground(GRAY);
    nine.setPreferredSize(new Dimension (45,25));
    nine.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton minus = new JButton("-");
    minus.setVisible(true);
    minus.setBorder(emptyBorder);
    minus.setBackground(GRAY);
    minus.setPreferredSize(new Dimension (45,25));
    minus.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton four = new JButton("4");
    four.setVisible(true);
    four.setBorder(emptyBorder);
    four.setBackground(GRAY);
    four.setPreferredSize(new Dimension (45,25));
    four.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton five = new JButton("5");
    five.setVisible(true);
    five.setBorder(emptyBorder);
    five.setBackground(GRAY);
    five.setPreferredSize(new Dimension (45,25));
    five.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton six = new JButton("6");
    six.setVisible(true);
    six.setBorder(emptyBorder);
    six.setBackground(GRAY);
    six.setPreferredSize(new Dimension (45,25));
    six.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton plus = new JButton("+");
    plus.setVisible(true);
    plus.setBorder(emptyBorder);
    plus.setBackground(GRAY);
    plus.setPreferredSize(new Dimension (45,25));
    plus.setFont(new Font("Monospaced", Font.PLAIN, 12));
    
    JButton one = new JButton("1");
    one.setVisible(true);
    one.setBorder(emptyBorder);
    one.setBackground(GRAY);
    one.setPreferredSize(new Dimension (45,25));
    one.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton two = new JButton("2");
    two.setVisible(true);
    two.setBorder(emptyBorder);
    two.setBackground(GRAY);
    two.setPreferredSize(new Dimension (45,25));
    two.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton three = new JButton("3");
    three.setVisible(true);
    three.setBorder(emptyBorder);
    three.setBackground(GRAY);
    three.setPreferredSize(new Dimension (45,25));
    three.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton Equal = new JButton("=");
    Equal.setVisible(true);
    Equal.setBorder(emptyBorder);
    Equal.setBackground(GRAY);
    Equal.setPreferredSize(new Dimension (45,25));
    Equal.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton Zero = new JButton("0");
    Zero.setVisible(true);
    Zero.setBorder(emptyBorder);
    Zero.setBackground(GRAY);
    Zero.setPreferredSize(new Dimension (95,25));
    Zero.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton dot = new JButton(".");
    dot.setVisible(true);
    dot.setBorder(emptyBorder);
    dot.setBackground(GRAY);
    dot.setPreferredSize(new Dimension (45,25));
    dot.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton exp = new JButton("exp ");
    exp.setVisible(true);
    exp.setBorder(emptyBorder);
    exp.setBackground(GRAY);
    exp.setPreferredSize(new Dimension (95,25));
    exp.setFont(new Font("Monospaced", Font.PLAIN, 12));


    JButton ac = new JButton("CE");
    ac.setVisible(true);
    ac.setBorder(emptyBorder);
    ac.setBackground(GRAY);
    ac.setPreferredSize(new Dimension (45,25));
    ac.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JButton Pi = new JButton("π");
    Pi.setVisible(true);
    Pi.setBorder(emptyBorder);
    Pi.setBackground(GRAY);
    Pi.setPreferredSize(new Dimension (95,25));
    Pi.setFont(new Font("Monospaced", Font.PLAIN, 12));

    JTextArea area = new JTextArea();
    area.setPreferredSize(new Dimension(195,170));
    area.setFont(new Font("Monospaced", Font.PLAIN, 12));

    area.setEditable(false);

    area.setLineWrap(true);
    area.setForeground(LIGHT_BLACK);
    area.setBackground(WHITE);
    PanelJTextArea.add(area);

     


    PanButton.add(squarert);
    PanButton.add(square);
    PanButton.add(Division);
    PanButton.add(X);
    PanButton.add(Seven);
    PanButton.add(Eight);
    PanButton.add(nine);
    PanButton.add(minus);
    PanButton.add(four);
    PanButton.add(five);
    PanButton.add(six);
    PanButton.add(plus);
    PanButton.add(one);
    PanButton.add(two);
    PanButton.add(three);
    PanButton.add(Equal);
    PanButton.add(Zero);
    PanButton.add(dot);
    PanButton.add(ac);
    PanButton.add(exp);
    PanButton.add(Pi);



    PanelJTextArea.setPreferredSize(new Dimension(195,195)); 
    
   
    
    CalFrame.pack();
    CalFrame.setVisible(true);
    CalFrame.setSize(230,420);

    X.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      
       area.append("x");


       Equal.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        
        System.out.println(area.getText().length());
        String ni = area.getText();
        String[] numbers = ni.split("x");

        
        Integer numberOne = Integer.parseInt(numbers[0]);
        Integer numberTwo = Integer.parseInt(numbers[1]);
        
        
        Integer n = numberOne * numberTwo;
        
        
        String t = String.valueOf(n);
        
        
        
        area.append(" = "+t+".0");

         timer = new Timer(TEN_SECOND, new ActionListener() {
        
         int you = 0;
        public void actionPerformed(ActionEvent evt) {
        
        you = 10;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        area.setText(t);
        
        if (you >= 10){
          timer.stop();
          area.setText(t);
        }
       
				
			  }
       

    });
        
        timer.start();

        if (you >= 10){
          timer.stop();
          area.setText(t);
          
        }
       

       

        
        }

    });

       }

    });


    one.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       area.append("1");
       }

    });

    two.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       area.append("2");
       }

    });

    three.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
   
       area.append("3");
    }

    });

    four.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      
       area.append("4");
      }

    });

    five.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      
       area.append("5");
      }

    });


    six.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      
       area.append("6");
      }

    });

    Seven.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      
       area.append("7");
      }

    });

    Eight.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      
       area.append("8");
      }

    });

    nine.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      
       area.append("9");
      }

    });

    Zero.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      
       area.append("0");
      }

    });



    dot.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      
       area.append(".");
      }

    });

    plus.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      
       area.append("+");


    Equal.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        
    System.out.println(area.getText().length());
        String[] numbers = area.getText().split("\\+");

        
        double number = Double.parseDouble(numbers[0]);
        double numbe  = Double.parseDouble(numbers[1]);
        
        
        double n = number + numbe;
        String t = String.valueOf(n);
        area.append(" = "+t);

         timer = new Timer(TEN_SECOND, new ActionListener() {
          int you = 0;
        public void actionPerformed(ActionEvent evt) {
        
        you = 10;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        area.setText(t);
        
        if (you >= 10){
          timer.stop();
          area.setText(t);
        }
       
				
			  }
       

    });
        
        timer.start();

        if (you >= 10){
          timer.stop();
          area.setText(t);
        }
       

        
        }

    });
    
      }

    });


 
 minus.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      
       area.append("-");


    Equal.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        
        System.out.println(area.getText().length());
        String[] numbers = area.getText().split("-");

        
        double num = Double.parseDouble(numbers[0]);
        double numb  = Double.parseDouble(numbers[1]);
        
        
        double n = num - numb;
        
        String t = String.valueOf(n);
        area.append(" = "+t);

       
  

         timer = new Timer(TEN_SECOND, new ActionListener() {
           int you = 0;
        public void actionPerformed(ActionEvent evt) {
        
        
        you = 10;
      

        System.out.print("\033[H\033[2J");
        System.out.flush();

        area.setText(t);
        
        if (you >= 10){
          timer.stop();
          area.setText(t);
        }
       
				
			  }
       

    });
        
        timer.start();

        if (you >= 10){
          timer.stop();
          area.setText(t);
        }
       

        
        }

    });
    
      }

    });



    ac.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
      area.setText("");
      }

    });

    square.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
       area.append("sq");

        Equal.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
        
        System.out.println(area.getText().length());
        
        String[] numbers = area.getText().split("sq");
        double nu = Double.parseDouble(numbers[0]);
        double n  = Double.parseDouble(numbers[1]);
        
        double ni = Math.pow(nu,n);
        
        String ti = String.valueOf(ni);
        area.append(" = "+ti);

         

         timer = new Timer(TEN_SECOND, new ActionListener() {
            int you = 0;
        public void actionPerformed(ActionEvent evt) {
        
        you = 10;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        area.setText(ti);
        
        if (you >= 10){
          timer.stop();
          area.setText(ti);
        }
       
				
			  }
       

    });
        
        timer.start();

        if (you >= 10){
          timer.stop();
          area.setText(ti);
        }
       
        
        }

    });

     }

    });

Pi.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
      
       area.append(" π");


       Equal.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        
         String[] number = area.getText().split(" π");
        double nu = Double.parseDouble(number[0]);

        double pi = Math.PI;
        double ni = pi*nu;
        String t = String.valueOf(ni);
        
        area.append(" = "+t);

       

         timer = new Timer(TEN_SECOND, new ActionListener() {
        
         int you = 0;
        public void actionPerformed(ActionEvent evt) {
        
        you = 10;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        area.setText(t);
        
        if (you >= 10){
          timer.stop();
          area.setText(t);
        }
       
				
			  }
       

    });
        
        timer.start();

        if (you >= 10){
          timer.stop();
          area.setText(t);
          
        }
       

       

        
        }

    });

       }

    });

try{
    
    Division.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        area.append("÷");

  
        
        Equal.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
            

        String[] numbers = area.getText().split("÷");

        
        double num = Double.parseDouble(numbers[0]);
        double numb = Double.parseDouble(numbers[1]);
        
        
        double n = num / numb;
        
        String t = String.valueOf(n);
        area.append(" = "+t);
        
         

         timer = new Timer(TEN_SECOND, new ActionListener() {
           int  you = 0;
        public void actionPerformed(ActionEvent evt) {
        
        you = 10;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        area.setText(t);
        
        if (you >= 10){
          timer.stop();
          area.setText(t);
        }
       
				
			  }
       

    });
        
        timer.start();

       
       
             
        
        }

    });
    

       }

    });


            








    
    squarert.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){ 
        area.append("√ ");

  
        
        Equal.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
        
        String[] number = area.getText().split("√ ");
        double nu = Double.parseDouble(number[1]);
        double ni = Math.sqrt(nu);
        
        String t = String.valueOf(ni);
        
        area.append(" = "+t);

        

        timer = new Timer(TEN_SECOND, new ActionListener() {
        
        int you = 0;
        public void actionPerformed(ActionEvent evt) {
        
        you = 10;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        area.setText(t);
        
        if (you >= 10){
          timer.stop();
          area.setText(t);
        }
       
				
			  }
       

    });
        
        timer.start();

        if (you >= 10){
          timer.stop();
          area.setText(t);
        }
       

             
        
        }

    });
    

       }

    });
 

    
   exp.addActionListener(new ActionListener(){  
  public void actionPerformed(ActionEvent e){ 
        area.append("exp ");

  
        
        Equal.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
        
        String[] number = area.getText().split("exp ");
        double nu = Double.parseDouble(number[1]);
        double ni = Math.exp(nu);
        
        String t = String.valueOf(ni);
        
        area.append(" = "+t);
       
       
       
       timer = new Timer(TEN_SECOND, new ActionListener() {
         int  you = 0;
        public void actionPerformed(ActionEvent evt) {
        
        you = 10;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        area.setText(t);
        
        if (you >= 10){
          timer.stop();
          area.setText(t);
        }
       
				
			  }
       

    });
        
        timer.start();

        if (you >= 10){
          timer.stop();
          area.setText(t);
        }
       
             
        
        }

    });
    

       }

    }); 

  }catch(Exception ex){

}


    
    
  


    


  }
}
