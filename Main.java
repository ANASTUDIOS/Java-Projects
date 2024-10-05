import javax.swing.*;
import javax.swing.Timer;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Main {
public static JFrame Frame;
public static  JPanel ball;
public static JPanel Jand;
public static JPanel ENdrop;
public static PointerInfo ap;
public static Point bp;
public static Timer timer;
public static Timer Y_up;
public static Timer Y_down;
public static int Yforce;
public static int call;
public static int Grav;
public static int ENdropnum;
public static int num = 100;
public static int nat = 10000;
public static int net = 30; 
public static int y;
public static int x;
public static int xY;
public static int xE;
public static JButton button;
public static Timer Xplus;
public static Timer Xminus;
public static Timer Enemys;
public static Random ran;
public static Timer EX;
public static Timer XX;
public static Timer EY;
public static Timer ENdropX;
public static JLabel GameOver;
public static int EnemyInt;
public static JPanel box;
public static JPanel RAN;
public static JPanel RAM;
public static boolean drop;
public static Random rand; 
public static void main(String[] args){
    
    Frame = new JFrame("JandWork");
    Frame.setLayout(new FlowLayout());
    Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    RAM = new JPanel();
    RAM.setSize(5,10);
    RAM.setPreferredSize( new Dimension (5,10));
    RAM.setBackground(Color.GRAY);
    Frame.add(RAM);
    RAM.setVisible(true);
   
    Jand = new JPanel();
    Jand.setSize(20,10);
    Jand.setPreferredSize( new Dimension (70,20));
    Jand.setBackground(Color.GRAY);
    Frame.add(Jand);
    Jand.setVisible(true);

    RAN = new JPanel();
    RAN.setSize(5,10);
    RAN.setPreferredSize( new Dimension (5,10));
    RAN.setBackground(Color.GRAY);
    Frame.add(RAN);
    RAN.setVisible(true);
    
    ball = new JPanel();
    ball.setSize(20,20);
    ball.setPreferredSize( new Dimension (20,20));
    ball.setBackground(Color.LIGHT_GRAY);
    Frame.add(ball);
    Jand.setVisible(true);
    
    ENdrop = new JPanel();
    ENdrop.setSize(50,40);
    ENdrop.setPreferredSize(new Dimension (50,40));
    ENdrop.setBackground(Color.GRAY);
    Frame.add(ENdrop);
    ENdrop.setVisible(true);

    box = new JPanel();
    box.setSize(20,20);
    box.setPreferredSize(new Dimension (20,20));
    box.setBackground(Color.BLACK);
    Frame.add(box);
    box.setVisible(true);

    GameOver = new JLabel("GAME_OVER");
    GameOver.setForeground(Color.GRAY);
    ENdrop.add(GameOver);
    GameOver.setVisible(false);

    button = new JButton();
    button.setSize(2,2);
    button.setPreferredSize(new Dimension (2,2));
    Frame.add(button);
    button.setVisible(true);
    button.setBackground(Color.GRAY);
  
    Yforce = 11;
    Grav = 11;
    ENdropnum = 0;
    y = ball.getY();
    x = ball.getX();
    xE = 0;
    xY = box.getY();
    EnemyInt = 0;
    drop = false;
    xY = 0;
    
     Enemys = new Timer(nat, new ActionListener(){
    public void actionPerformed(ActionEvent e){
        if(drop = false ){
        ENdrop.setLocation(ENdropnum , 50);
        box.setLocation(ENdrop.getX()+50, ENdrop.getY()+20);
  
        drop = true;
         }
        if (drop = true){
            ENdrop.setVisible(true);
            ENdrop.setLocation(ENdrop.getX(), ENdrop.getY());
            box.setLocation(ENdrop.getX()+50, ENdrop.getY()+20);
            EY.restart();
           if(xY > 500){
                drop = false;
                Enemys.restart();
                EY.stop();
                }
        }
}       
   });
      Enemys.start();

    Y_up = new Timer( num, new ActionListener(){
    public void actionPerformed(ActionEvent e){
    y = y - Yforce;
    
 if(ball.getX() <= 0 |ball.getX() > Jand.getX()+37 && ball.getX() < Jand.getX()+75 && ball.getY() == 220 | Jand.getX()<=0| ball.getX() <= 0){
        Xplus.restart();
        Xminus.stop();
    
 }else if (x >= 300 | ball.getX() > Jand.getX() && ball.getX() < Jand.getX()+36 && ball.getY() == 220){
          
            Xplus.stop();
            Xminus.restart();  
            Xplus.stop();
            Xminus.restart();  
    };
        
    ball.setLocation(x, y);

        if( ball.getY() == -99 && Y_up.isRunning() | ball.getY() < -99 ){
    ball.setLocation(ball.getX() , -99);
    Y_up.stop();
    Y_down.restart();  
    System.out.println("tye");
                 
}     
 
if(ball.getX() > box.getX( )-20 && ball.getX() < box.getX()+50 && ball.getY() < box.getY()+40 && ball.getY() > box.getY()-40| box.getY() == ball.getY() && ball.getX() == box.getX() ) {
            ball.setVisible(false);
            Jand.setVisible(false);
            button.setVisible(false);
            GameOver.setVisible(true);
            Y_up.stop();
            Y_down.stop();
        } 
 else if ( box.getX() > Jand.getX()-20 && box.getX() < Jand.getX()+70){
           ball.setVisible(false);
           Jand.setVisible(false);
           button.setVisible(false);
           GameOver.setVisible(true);
           Y_up.stop();
            Y_down.stop();
            
     }    
        }
             
        });

    Y_down = new Timer (num, new ActionListener(){
    public void actionPerformed(ActionEvent e){
       y = y + Grav;
    
      if(ball.getX() >= 0 |ball.getX() > Jand.getX()+37 && ball.getX() < Jand.getX()+75 && ball.getY() == 220 )  {
        Xplus.restart();
        Xminus.stop();
          
         
    }else if (x >= 300 && x == ball.getX() | ball.getX() > Jand.getX() && ball.getX() < Jand.getX()+36 && ball.getY() == 220){
          Xplus.stop();
            Xminus.restart();
          
         
    };
 
       ball.setLocation(x, y);

        if(ball.getY() == 220 && Y_down.isRunning() | ball.getY() == 221 && Y_down.isRunning() | ball.getY() > 220 ){
     Y_up.restart();   
     Y_down.stop();
     System.out.println("bye3");
               
            }
    
        if(ball.getY() == 220 && ball.getX() < Jand.getX()-40 ) {
            ball.setVisible(false);
            Jand.setVisible(false);
            GameOver.setVisible(true);
            Y_up.stop();
            Y_down.stop();
            
        } else if( ball.getY() == 220 && ball.getX() > Jand.getX() + 70){            
            ball.setVisible(false);
            Jand.setVisible(false);
            GameOver.setVisible(true);
            Y_up.stop();
            Y_down.stop();
            
            }
         
 }
    });  
         
      if(ball.getY() == 0 && !Y_down.isRunning()){
     ball.setLocation(ball.getX(),0);
     Y_up.restart();
     Y_down.stop();
     System.out.println("bye3");

          }

      Xplus = new Timer(num, new ActionListener(){
    public void actionPerformed(ActionEvent e){

      x = x + 1;
        ball.setLocation(x, y); 

        if (x == 300 && x == ball.getX() | ball.getX() > Jand.getX()-40 && ball.getX() < Jand.getX()+36 && ball.getY() == 220){
          Xplus.stop();
            Xminus.restart();
          
         
    };

    if (x <= 0 && x == ball.getX() | ball.getX() > Jand.getX()+36 && ball.getX() < Jand.getX()+90 && ball.getY() == Jand.getY()-20 ){
          Xplus.restart();
            Xminus.stop();
          
         
    };
 
       }
      });
  
      Xminus = new Timer(num, new ActionListener(){
    public void actionPerformed(ActionEvent e){
        
        x = x - 1;
        ball.setLocation(x , y);

        if (x == 300 && x == ball.getX() | ball.getX() > Jand.getX() && ball.getX() < Jand.getX()+36 && ball.getY() == 220){
          Xplus.stop();
            Xminus.restart();
          
         
    };

    if (x <= 0 && x == ball.getX() | ball.getX() > Jand.getX()+36 && ball.getX() < Jand.getX()+90 && ball.getY() == Jand.getY()-20 ){
          Xplus.restart();
            Xminus.stop();
          
         
    };
 
        }
      });

    EY = new Timer(net, new ActionListener(){
    public void actionPerformed(ActionEvent e){
        xY = xY + 3;
        
        box.setLocation(ENdrop.getX()+15, xY); 
     
        if(xY > 500){
            xY = 0;
        
        }
     
        if(ball.getX() > box.getX( )-20 && ball.getX() < box.getX()+50 && ball.getY() < box.getY()+40 && ball.getY() > box.getY()-40| box.getY() == ball.getY() && ball.getX() == box.getX() ) {
            ball.setVisible(false);
            Jand.setVisible(false);
            button.setVisible(false);
            GameOver.setVisible(true);
            Y_up.stop();
            Y_down.stop();
        } 
 
         if ( box.getX() > Jand.getX()-30 && box.getX() < Jand.getX()+70 && box.getY() < Jand.getY()-2 && box.getY() > Jand.getY()+2 ){
           ball.setVisible(false);
           Jand.setVisible(false);
           button.setVisible(false);
           GameOver.setVisible(true);
           Y_up.stop();
            Y_down.stop();
            
     }    
        }
    });
 
    EX = new Timer(num/4, new ActionListener(){
    public void actionPerformed(ActionEvent e){
      RAN.setLocation(ENdrop.getX()-4 , ENdrop.getY()+40);
      RAM.setLocation(ENdrop.getX()+49 , ENdrop.getY()+40);
      xE = xE - 1 ;
        ENdrop.setLocation(xE, ENdrop.getY()); 
        
        }
    });
 
    XX = new Timer(num/4, new ActionListener(){
    public void actionPerformed(ActionEvent e){
      RAN.setLocation(ENdrop.getX()-2 , ENdrop.getY()+40);
      RAM.setLocation(ENdrop.getX()+50 , ENdrop.getY()+40);
      xE = xE +1 ;
        ENdrop.setLocation(xE, ENdrop.getY()); 
        
        }
    });

    ENdropX = new Timer(num*100, new ActionListener(){
    public void actionPerformed(ActionEvent e){
        rand = new Random();
        ENdropnum = rand.nextInt(300);
        
        if(ENdrop.getX() > ENdropnum){
        EX.restart();
        XX.stop();
            }
        else if (ENdrop.getX() == ENdropnum){
           EX.stop();
           XX.stop();
            
            }
        
    if(ENdrop.getX() <  ENdropnum){
        XX.restart();
        EX.stop();
         }else if(ENdrop.getX() == ENdropnum){
        EX.stop();
        XX.stop();     
            }
        }  
   });    
 ENdropX.start();

    timer = new Timer(num, new ActionListener(){
     public void actionPerformed(ActionEvent e){
     PointerInfo ap = MouseInfo.getPointerInfo();
     
     Point bp = ap.getLocation();
     
     double mouse = bp.getX();
     int mouseX = (int)mouse;
     Jand.setLocation(mouseX-37,240);
          }
       });
     timer.start();
    Frame.pack();
    Frame.setVisible(true);
    Frame.setSize(300,400);
     }
}