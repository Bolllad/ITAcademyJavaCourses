public class Main {
    public static void main(String[] args) {
        System.out.println(Umnj(2, 2));
        System.out.println(Umnj(2, 2, 3));         //Вывод умножения. Забыл сколько надо было чисел перемножить
        System.out.println(Umnj(2, 2, 3, 4));   //поэтому сделал 3 метода.
    }

    private static int Umnj(int a, int b){                  //3 Метода для умножения
        return a * b;                                       //Методы являются разными если их имена отличаются
    }                                                       //или отличаются передаваеммые им переменные

    private static int Umnj(int a, int b, int c){
        return a * b * c;
    }

    private static int Umnj(int a, int b, int c, int d){
        return a * b * c * d;
    }

}