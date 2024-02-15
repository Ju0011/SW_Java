package lab02;

interface AutoParkable{
    void autoPark();
}
interface Driveable{
    void drive(Car r);
}

class DriveableRobot implements Driveable{
    @Override
    public void drive(Car r) {
        r.run() ;
        r.turnRight();
        r.turnLeft();
        r.stop();

        //만약 AutoParkable 타입의 차 이면 autoPark() 호출
        if ( r instanceof AutoParkable ){
            Palisade P = (Palisade)r;
            P.autoPark();
        }
    }
}


class Palisade extends Car implements  AutoParkable{
    public void run() {
        System.out.println("Palisade 가 움직이기 시작");
    }
    public void stop(){
        System.out.println("Palisade 가 정지");
    }
    public void turnRight(){
        System.out.println(getAngle() + "의 각도로 소나타가 오른쪽 회전");
    }
    public void turnLeft(){
        System.out.println(getAngle() + "의 각도로 소나타가 왼쪽 회전");
    }
    public void autoPark() {
        System.out.println("자동 주차");
    }
}

class Morning extends Car{
    public void run() {
        System.out.println("Morning 움직이기 시작");
    }
    public void stop(){
        System.out.println("Morning 정지");
    }
    public void turnRight(){
        System.out.println("45 의 각도로 Morning 오른쪽 회전");
    }
    public void turnLeft() {
        System.out.println("45의 각도로  Morning 왼쪽 회전");
    }
}

public class DriveableRobotTest {
    public static void main(String[] args) {
        Palisade p = new Palisade(); //Palisade객체 만들기
        Morning m = new Morning();  //Morning 객체 만들기
        DriveableRobot DR = new DriveableRobot();   // DriveableRobot 객체 만들기
        // DriveableRobot 객체에게 Palisade을 주고 drive 메소드 호출
        DR.drive(p);
        // DriveableRobot 객체에게 Morning 을 주고 drive 메소드 호출
        DR.drive(m);
    }


}
