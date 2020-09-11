import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int Fact(int a){
        int f = 1; int b = 2;
        do{
            f *= b;
            b++;
        } while(b != a + 1);
        return f;
    }

    public static  void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5};
        int S = 0;
        for(int num : arr){
            S = S + num;
        }
        System.out.println( "Сумма эл. массива через for: " + S);
        int i = 0;
        int Sum = 0;
        while(i < 5){
            Sum = arr[i] + Sum;
            i++;
        }
        System.out.println("Сумма эл. массива через while: " + Sum);
        int b = 0;
        int Sum2 = 0;
        do{
            Sum2 = Sum2 + arr[b];
            b++;
        } while(b < 5);
        System.out.println("Сумма эл. массива через do while: "+ Sum2);
        int [] Array = new int [5];
        for(int j = 0; j < Array.length; j++){
            Array[j] = ((int)(Math.random() * 5));
        }
        System.out.println("Массив чисел созданный через метод random: " + Arrays.toString(Array));
        Arrays.sort(Array);
        System.out.println("Массив чисел созданный через метод random после сортировки: " + Arrays.toString(Array));
        Random rand = new Random();
        int [] Arr = new int[6];
        for(int j = 0; j < Arr.length; j++) {
            Arr[j] = rand.nextInt(10);
        }
        System.out.println("Массив чисел созданный через класс Random: " + Arrays.toString(Arr));
        Arrays.sort(Arr);
        System.out.println("Массив чисел созданный через класс Random после сортировки: " + Arrays.toString(Arr));
        System.out.println("4! = " + Fact(4));
    }

}