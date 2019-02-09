/**
 * Created by ZAISMIT - EVYNET
 **/
public class facade_file {
    public static void main(String[] args){
        math mymath;
             mymath = new math();
        int s = mymath.square(4);
        System.out.println(s);

        //===============static=================

        int s_m = static_math.static_square(5);
        System.out.println(s_m);
    }
}
