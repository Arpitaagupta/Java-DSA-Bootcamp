package methods;

public class methods {
    public static void main(String[] args) {

        /*int value = mySum(10,20);
        System.out.println(value);*/


        //function call
      //  System.out.println(mySum(10,20));
       // System.out.println((mySum(11,5)));

        methods obj  =new methods();
        System.out.println(obj.mySum(20,30));



    }

    //user defined functions
   public static int mySum(int a, int b){

        int c = a+b;
        return c;

        //or you can directly do --> return a+b

    }

}
