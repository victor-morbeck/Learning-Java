import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {

        //First test of Git using intellij

        int amountOfBooks;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de livros: ");
        amountOfBooks = sc.nextInt();

        double firstWay = (float) (amountOfBooks * 0.25) + 7.50;
        double secondWay = (float) (amountOfBooks * 0.50) + 2.50;

        if (firstWay > secondWay){
            System.out.println("Criterio B");
        }else if(secondWay > firstWay){
            System.out.println("Criterio A");
        }else {
            System.out.println("Indiferente");
        }
    }
}