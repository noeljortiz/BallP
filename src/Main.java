import javax.swing.*;
import java.awt.*;
public class Main{

    public static void main(String[]args){
        JFrame myFrame = new JFrame();

        BallP myBallp = new BallP();
        //myFrame.add(myDrawp);
        myFrame.setVisible(true);
        myFrame.setSize(500,500);
        myFrame.add(myBallp);




    }
}