package first_chapter;

/**
 * @author 彭伟
 * @version 1.0
 */
public class circle {
   private double radius;
   public circle() {//无参构造器
   }
   public circle(double radius) {
      this.radius = radius;
   }
   public double getRadius() {
      return radius;
   }
   public void setRadius(double radius) {
      this.radius = radius;
   }
   public double area(){
      return Math.PI*radius*radius;
   }
   public double volumn(){
      return Math.PI*2*radius;
   }
}
