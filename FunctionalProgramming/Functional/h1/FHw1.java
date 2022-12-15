package FProgramlama.Odev1;

import java.util.function.IntConsumer;

public class FHw1 {


    private static int total;
    private static int product = 1;
    private static final int[] squares = new int[5];

    public static void main(String[] args) {

        IntConsumer printer = (i) -> System.out.print(i + " ");
        pickEvenNumber(10, printer);

        System.out.println();
        pickEvenNumber(10, (i) -> total += i);
        System.out.println("Sum: " + total);

        pickEvenNumber(10, (i) -> product *= i);
        System.out.println("Product: " + product);

        pickEvenNumber(10, (i) -> {      // accept methodu
            squares[i/2-1] = i * i;
        });

        System.out.print("Squares: ");
        for(int y : squares)              // Arraydeki baştan sona kadar olan degerleri icerisine alır.( y:4..y 16...)
            System.out.print(y+" ");
    }

    public static void pickEvenNumber(int n, IntConsumer x) {
        for (int i = 2; i <= n; i += 2)
            x.accept(i);                   // (i) -> {squares[i/2-1] = i * i;}); gibi
    }
}
