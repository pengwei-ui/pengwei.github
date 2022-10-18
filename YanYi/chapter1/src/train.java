/**
 * @author 彭伟
 * @version 1.0
 */
public class train {
   public static void main(String[] args) {
      My_Math my_math = new My_Math();
      System.out.println(my_math.Add(1,2));
      System.out.println(my_math.Concat("hello", "world"));
   }
}
class My_Math{
   public double Add(int i, int j){
      return i + j;
   }
   public String Concat(String a, String b){
      return a + " " +b;//字符串可以加 这不就是拼接吗
   }
}