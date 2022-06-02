public class MethodCallExample {

    public static void main(String[] args) {


        method1();
    }


    public static void method1() {

        System.out.println("1");

        method2();
        method4();
        method3();
    }
        public static void method2(){
            System.out.println("2");
        }
        public static void method3() {

            System.out.println("3");

        }
        public static void method4(){
        System.out.println("4");

    }
}
