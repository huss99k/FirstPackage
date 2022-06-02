package loops;

public class shapes{

    private  int length;
   private  double radius;

   public void calculate(){
       System.out.println("The result is : " + length * radius);
   }




   public shapes(){}

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



}
