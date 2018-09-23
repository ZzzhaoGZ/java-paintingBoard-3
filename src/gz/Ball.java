package gz;

import java.awt.*;
import java.util.Random;

public class Ball {
    Random rand=new Random();
    int x=rand.nextInt(1000);
    int y=rand.nextInt(600);
    int R=rand.nextInt(100);

    private int speedX=rand.nextInt(20);
    private int speedY=rand.nextInt(20);
    private int r=1000;
    private int d=600;
    private Graphics g;
    private FrameBall fb;

    public void setG(Graphics g,FrameBall fb){
        this.g=g;
        this.fb=fb;
    }
    public void run(){//表示小球的运动，可反弹，必须放在while循环中才能跑起来
        g.setColor(fb.getContentPane().getBackground()); //切换为背景色
        //g.fillOval(x-R-speedX,y-R-speedY,R,R); //减掉R表示在坐标替换为圆心
        g.fillOval(x-R-speedX,y-R-speedY,R,R); //减掉R表示在坐标替换为圆心
        g.setColor(Color.black);
        g.fillOval(x-R,y-R,R,R);
        if(y>=d)
            speedY*=-1;
        else if(y<=0)
            speedY*=-1;
        if(x>=r)
            speedX*=-1;
        else if(x<=0)
            speedX*=-1;
        x+=speedX;
        y+=speedY;
    }
}
