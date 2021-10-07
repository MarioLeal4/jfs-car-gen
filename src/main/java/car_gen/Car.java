package main.java.car_gen;

public class Car {
   private String color;
   private int year;
   private int speed = 0;
   private int maxSpeed;
   private boolean isElectric;

   public Car(String color, int year, int maxSpeed) {
       this.color = color;
       this.year = year;
       this.maxSpeed = maxSpeed;
   }

  public String getColor() {
       return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

    public int getYear() {
       return this.year;
    }

    public void setYear(int year) {
       this.year = year;
    }

    public int getSpeed() {
       return this.speed;
    }

    public void setSpeed(int speed) {
       this.speed = speed;
    }

    public int getMaxSpeed() {
       return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
       this.maxSpeed = maxSpeed;
    }

    public boolean getIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
       this.isElectric = isElectric;
    }

    public int accelerateSpeed() {
        if (speed + 5 > maxSpeed) {
            System.out.println("exceeds max speed!");
            speed = maxSpeed;
        } else {
            speed += 5;
        }
        return speed;

    }

    public int decelerateSpeed() {
    if (speed <= 0) {
    System.out.println("Speed cannot be below 0");
    } else {
        speed -= 5;
    }

       return speed;
    }

    public boolean convertToElectric() {
       if (isElectric == true) {
           System.out.println("Is already Electric!");
       } else {
           isElectric = true;
       }

       return isElectric;
    }


}
