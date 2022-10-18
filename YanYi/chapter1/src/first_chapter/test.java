package first_chapter;

/**
 * @author 彭伟
 * @version 1.0
 */
public class test {
   public static void main(String[] args) {
      circle c1 = new cylinder(1.0,2.0);
      //编译类型为circle 运行类型为cylinder 是向上转型 有父类指向子类
      System.out.println(c1.area());//运算结果是cylinder的，因为动态加载
      circle c2 = new cylinder(2.0,1.0);
      System.out.println(c2.area());//运算结果是cylinder的，因为动态加载
      //运算cylinder还是circle要看运行类型，不要看编译类型
      //定义变量
   }
}
