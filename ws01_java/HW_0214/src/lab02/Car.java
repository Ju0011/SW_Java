package lab02;

public abstract class Car {
    private int angle;  //각도
    public abstract void run();
    public abstract void stop() ;
    public abstract void turnRight() ;
    public abstract void turnLeft();

    //Getter
    public int getAngle(){
        return angle;
    }

    //Setter
    public void setAngle(int angle){
        this.angle = angle;
    }

}
