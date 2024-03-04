import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем корзины игрушек");
        int size=scanner.nextInt();

        basketToys bask = new basketToys(size);
        basketRandom s=new basketRandom();
        raffle raf=new raffle();

        //добавление игрушек
        toys lego = new toys(1, "лего", 0.1);
        toys girl = new toys(2, "девочка", 0.1);
        toys boy = new toys(3, "мальчик", 0.2);
        toys car = new toys(4, "машина", 0.1);
        toys constructor = new toys(5, "конструктор", 0.1);

        //добавляем в корзину
        bask.putBasket(lego.getName(), lego.getWeight());
        bask.putBasket(girl.getName(), girl.getWeight());
        bask.putBasket(boy.getName(), boy.getWeight());
        bask.putBasket(car.getName(), car.getWeight());
        bask.putBasket(constructor.getName(), constructor.getWeight());

        //перемешиваем корзину
        s.shuff(bask.getBasket());

        System.out.println("Введите число розыгрышей");
        int rf=scanner.nextInt();

        System.out.println("Розыгрыш");
        raf.raffle(bask.getBasket(),bask.getSize(),rf);






    }



}
