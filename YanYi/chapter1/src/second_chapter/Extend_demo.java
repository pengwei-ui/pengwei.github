package second_chapter;

/**
 * @author 彭伟
 * @version 1.0
 */
public class Extend_demo {
   public static void main(String[] args) {
      Cat_ cat1 = new Cat_();
      Cat_ cat2 = new Cat_("jerry");
      cat1.eat();
      cat2.eat();
   }
}
class Animal_{
   public String name = "tom";
   public Animal_() {
   }
   public Animal_(String name) {
      this.name = name;
   }
   public void eat(){
      System.out.println("小动物在吃饭");
   }

}
class Cat_ extends Animal_{
   public String name;
   public Cat_() {
   }
   public Cat_(String name) {
      super(name);
      this.name = name;
   }
   @Override
   public void eat() {
      System.out.println(name + "小猫在吃饭");
   }
}
