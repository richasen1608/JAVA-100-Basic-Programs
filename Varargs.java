import java.util.Arrays;

public class Varargs {
  /*  public static void main(String[] args) {
        fun(2,3,9,6,0,23,67);

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }

   */
  public static void main(String[] args) {

      fun(88);
      fun("richa");
  }
      static void fun(int a){
          System.out.println(a);

      }
      static void fun(String name){
          System.out.println(name);

      }
  }

