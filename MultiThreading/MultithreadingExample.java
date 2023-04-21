public class MultithreadingExample {

    static class Addition extends Thread{
        @Override
        public void run() {

            int a = 5 ;
            int b = 6;
            System.out.println(a+b);

        }
    }

    static class Subtraction extends Thread{
        @Override
        public void run() {

            int a = 6 ;
            int b = 5 ;
            System.out.println(a-b);

        }
    }

    static class Multiplication extends Thread{
        @Override
        public void run() {

            int a = 5 ;
            int b = 3 ;

            System.out.println(a*b);

        }
    }

    static class  Division extends Thread{
        @Override
        public void run() {

            int a = 5;
            int b = 0;

            System.out.println(a/b);

        }
    }
    public static void main(String[] args) {
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication multiply = new Multiplication();
        Division div = new Division();

        div.start();
        add.start();
        multiply.start();
        sub.start();


    }
}
