package second_chapter;

/**
 * @author 彭伟
 * @version 1.0
 */
public interface MyInterface {
    public static final int MAX_AGE = 100; //变量public static final 类型
    public abstract void showInfo(); //方法是 public abstract 类型
    int M_CHANCE = 10; //合法 默认的都是 public static final 类型
    void Music(); //合法 默认的都是 public abstract 类型的
    void Call();
    //void methoda(){System.out.println("methoda");}//若不注释，编译出错，因
//    为接口中只能包含抽象方法，不能有方法体
    //public MyInterface(){} //若不注释，编译出错，因为接口中不允许定义构造方法
}
