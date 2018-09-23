package gz;

import java.awt.*;
import java.util.ArrayList;

public class DrawBall extends Thread {
    ArrayList<Ball> list=new ArrayList<Ball>();
    Graphics g;
    FrameBall fb;

    public void setG(Graphics g,FrameBall fb,ArrayList<Ball> list){
        this.g=g;
        this.fb=fb;
        this.list=list;
    }
    public void run(){
        while (true){
            Ball b=new Ball();
            b.setG(g,fb);
            list.add(b);
            try{
                sleep(10);
            }catch (Exception e){}
            System.out.println(list.size());
            if(list.size()==10)break;
        }
    }
}
