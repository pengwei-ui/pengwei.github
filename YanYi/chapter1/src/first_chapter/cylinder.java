package first_chapter;

/**
 * @author 彭伟
 * @version 1.0
 */
public class cylinder extends circle{
   private double height;
   public cylinder() {//无参构造器每个方法都会默认拥有
   }
   //因为继承了，父类中有有参构造函数，所以子类也要写，类似于覆盖、重载
   public cylinder(double radius, double height) {
      super(radius);
      this.height = height;
   }
   public double getHeight() {
      return height;
   }
   public void setHeight(double height) {
      this.height = height;
   }
   @Override
   public double area() {
      return 2*super.area()+height*(2*Math.PI*getRadius());
      //不写super.area()系统会报错，因为系统会根据就近原则找到当前类的area
      //可是当前area没有数值，应该使用父类的area方法所以使用super
   }
   @Override
   public double volumn() {
      return super.area()*height;
   }
}
