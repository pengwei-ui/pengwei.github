package second_chapter;

/**
 * @author 彭伟
 * @version 1.0
 */
public class Static_demo {
   public static void main(String[] args) {
      Static aStatic1 = new Static();
      Static aStatic2 = new Static();
      aStatic1.a = 20;
      System.out.println(aStatic2.a);
      aStatic1.count++;
      System.out.println(aStatic2.count);
   }
}
class Static{
   int a = 10;//实例变量、每个对象实例都会开辟一个空间
   static int count = 0;//类变量、开辟一个公共空间进行存储数据
   public static void get(){
      count++;
//      a++ 静态类只能访问静态变量，不能访问实例变量
   }
}