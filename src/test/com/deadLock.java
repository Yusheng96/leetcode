package test.com;
//死锁，多个线程互相持有对方需要的资源 模拟化妆需要的物品
public class deadLock {
    public static void main(String[] args) {
    Makeup g1=new Makeup(0,"灰姑娘");
    Makeup g2=new Makeup(1,"莉莉");

    g1.start();
    g2.start();

    }

}
class  Lipstick{

}
class Mirror{

}

class  Makeup extends Thread{
//用static 来保证 需要的对象只有一份
    static Mirror mirror=new Mirror();
    static Lipstick lipstick=new Lipstick();

    int choice;//选择
    String girlName;//使用化妆品的人
    Makeup(int choice,String girlName){
        this.choice=choice;
        this.girlName=girlName;
    }

    @Override
    public void run() {
        //化妆
        try {
            Makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void Makeup() throws InterruptedException {
        if(choice==0){
            synchronized (lipstick){//获得口红的锁
                    System.out.println(this.girlName+"获得的口红的锁");
                    Thread.sleep(1000);
                synchronized (mirror){//获得镜子的锁
                    System.out.println(this.girlName+"获得的镜子的锁");
                }
            }

        }
            else{
                synchronized (mirror){//获得镜子的锁
                    System.out.println(this.girlName+"获得的镜子的锁");
                    Thread.sleep(2000);

                }
            synchronized (lipstick){//获得口红的锁
                System.out.println(this.girlName+"获得的口红的锁");
            }


            }
        }
    }
