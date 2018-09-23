package gz;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FrameBall extends JFrame {
    private static ArrayList<Ball> list=new ArrayList<Ball>();
    private Graphics g;
    public void showUI(){
        this.setTitle("小球");
        this.setSize(1000,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setLayout(new FlowLayout());
        this.setVisible(true);
        g=this.getGraphics();
    }
    public static void main(String[] args){
        FrameBall fb=new FrameBall();
        fb.showUI();

        DrawBall db=new DrawBall();
        db.setG(fb.g,fb,list);
        db.start();

        MoveBall mb=new MoveBall();
        mb.setL(list);
        mb.start();
    }
}
