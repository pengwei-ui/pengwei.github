package second_chapter;

/**
 * @author 彭伟
 * @version 1.0
 */
public class Abstract_demo {
   public static void main(String[] args) {
      Animal tom = new Cat("tom");//父类指向子类向上转型
      //左边是编译类型右边是运行类型 最后是按照Cat中的类执行的
      tom.eat();
      tom.cry();
   }
}
abstract class Animal{
   public abstract void eat();//抽象类不能有方法体
   public abstract void cry();
}
class Cat extends Animal{
   public String name;
   public Cat(String name) {
      this.name = name;
   }
   @Override
   public void eat() {
      System.out.println(this.name + "正在吃");
   }
   @Override
   public void cry() {
      System.out.println(this.name +"正在哭");
   }
}
