import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLOutput;

public class BallP extends JPanel{
    int x = (int)Math.random()*(1-500)+1;
    int xspeed = 3;
    int y = (int)Math.random()*(1-500)+1;
    int yspeed = 3;
    int nums[] = new int[20];
   Ball silly;
    public BallP(){
        setBackground(new Color(0,255,0));
      silly = new Ball(70,90,30);

      this.setFocusable(true);
      this.addKeyListener(new KeyListener() {
          @Override
          public void keyTyped(KeyEvent e) {

          }

          @Override
          public void keyPressed(KeyEvent e) {

              System.out.println(e.getKeyCode());
              int blahhh = e.getKeyCode();
              if (blahhh == 68 || blahhh == 39){
                  silly.moveRight();
              }
              if(blahhh == 87 || blahhh == 38){
                  silly.moveUp();
              }
              if(blahhh == 65 || blahhh == 37){
                  silly.moveLeft();
              }
              if(blahhh == 83 || blahhh == 40){
                  silly.moveDown();
              }

          }

          @Override
          public void keyReleased(KeyEvent e) {

          }
      });




    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);




            g.fillOval(silly.getX(),silly.getY(),silly.getSize(),silly.getSize());



            try{
                Thread.sleep(34);
            }
            catch(Exception e){
                System.out.println(e);
            }

            repaint();

        }
    }


