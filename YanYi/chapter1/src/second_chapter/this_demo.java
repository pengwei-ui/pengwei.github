package second_chapter;

/**
 * @author 彭伟
 * @version 1.0
 */
public class this_demo {
   public static void main(String[] args) {
      Father father1 = new Father();
      father1.show();//pengwei pengwei
      System.out.println("-------------");
      Father father2 = new Father("ruoji");
      father2.show();//ruoji ruoji
   }
}
class Father{
   private String name = "pengwei";
   public Father() {
   }
   public Father(String name) {
      this.name = name;//this指代调用对象
   }
   void show(){
      System.out.println(name);
      System.out.println(this.name);
   }
}
