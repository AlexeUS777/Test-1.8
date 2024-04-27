import java.util.Scanner;

public class MyClass8 {
    public static void main(String[] args){

        //1.Напишите этот код короче, используя тернарный оператор:
        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        if(x > y){
//            System.out.println("x > y");
//        } else{
//            System.out.println("x <= y");
//        }
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        String z = x > y ? "x > y" : "x <= y";
        System.out.println(z);

        //2. Самостоятельно перепишите данный код используя тернарные операторы.
        //String quote1 = quote.length() > 50 ? quote.substring(0, 50) + "..." : quote;

        //3. Самостоятельно добавьте вывод цитат только Walter White, используя тернарные операторы.
        //Измените данный код чтобы вместо конструкции if else, был тернарный оператор (рис.10).
        //String author1 = !author.equals("Walter White") ? "Restart and try again" : quote + "\n" + author;


    }
}
