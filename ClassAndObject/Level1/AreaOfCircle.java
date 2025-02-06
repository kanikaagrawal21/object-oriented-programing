package ClassAndObjectLevelOne;

class Circle{
   private float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getRadius(){
        return radius;
    }
    public void area(float radius){
        float area = 22/7*radius*radius;
        System.out.println(area);
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(6);
        System.out.println(c.getRadius());
        c.area(c.getRadius());

    }
}
