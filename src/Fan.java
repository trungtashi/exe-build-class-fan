public class Fan {
    private boolean status = false;
    private int speed = 1;
    private double radius ;
    private String color;
    public Fan(String color, double radius){
        this.radius = radius;
        this.color = color;
    }
    public void turnOn(){
        this.status = true;
    }
    public void plusSpeed(){
        if (this.status == true) {
            if (this.speed < 3)
                this.speed++;
            else if (this.speed >= 3) {
                this.speed = 3;
            }
        }
    }
    public void SubSpeed(){
        if (this.status == true) {
            if (this.speed > 0)
                this.speed--;
            if (this.speed <= 1)
                this.speed = 1;
        }
    }
    public void turnOff(){
        this.status = false;
    }
    public String showStatus(){
        if (this.status == true){
            return "Fan is on (speed: " + this.speed + ", color: " + this.color + ", R: " +radius ;
        }
        else
            return "Fan is off";
    }
}
