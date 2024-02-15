import java.rmi.Remote;

public class Main02_InterfaceTest {
    public static void main(String[] args) {
        RemoteControllerCase r =  new TVRemoteController ();
        r.on();

        TVRemoteController r1 = new TVRemoteController();
        DVDremoteController r2 = new DVDremoteController();
        Main02_Robot robot = new Main02_Robot();
        robot.powerOn(r1);  //upcasting
        robot.powerOn(r2);  //upcasting
    }
}

class Main02_Robot{
    void powerOn(RemoteControllerCase r){
        r.on();
    }

    void powerOff(RemoteControllerCase r){
        r.off();
    }
}

interface RemoteControllerCase{
    void on();    //public abstract 자동으로 붙음.
    void off();   //public abstract 자동으로 붙음.
}
class TVRemoteController implements RemoteControllerCase{
    public void on() {System.out.println("tv on ") ; }
    public void off() {System.out.println("tv off ") ; }
}
class DVDremoteController implements RemoteControllerCase{
    public void on() {System.out.println("DVD on ") ; }
    public void off() {System.out.println("DVD off ") ; }
}

interface A {}
interface  B {}
class C implements A,B{}
class D extends C {}
class Test{
    public static void main(String[] args) {
        A a = new D();  // 묵시적 upcasting OK
        //D d = new C();  // 묵시적 downcasting 컴파일 오류
        D d = (D) new C();  // 명시적 downcasting  컴파일 ok
        //실행은 될 수 있고, 안될 수 있는데, 이 예제는 실행안됌
        
        int i = 10;
        long l = i;
        short s = (short) i;    //명시적 캐스팅
    }
}
