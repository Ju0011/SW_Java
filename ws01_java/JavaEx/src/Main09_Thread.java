public class Main09_Thread {
    public static void main(String[] args) throws Exception{
        ThreadEx t1 = new ThreadEx();
        ThreadEx t2 = new ThreadEx();
        t1.start(); t2.start(); // run() 이 호출됨.
        t1.join(); t2.join();
        System.out.println(" 종료 ");
    }
}
class ThreadEx extends Thread{  //또는  implements Runnable
    public void run(){
        for(int i=0 ; i < 1000 ; i++) {
            System.out.println(i + getName());// Thread에 이름이 자동 할당되는데, 그 이름 출력.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}