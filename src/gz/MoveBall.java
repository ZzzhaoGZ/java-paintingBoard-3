package gz;

import java.util.ArrayList;

public class MoveBall extends Thread {
    int i=0;
    private ArrayList<Ball> list;
    public void setL(ArrayList<Ball> list){
        this.list=list;
    }
    public void run(){
        try{
            sleep(500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        while (true){
            for(int i=0;i<list.size();i++){
                list.get(i).run();
                try{
                    sleep(3);
                }catch (Exception e){};
            }
        }
    }
}
