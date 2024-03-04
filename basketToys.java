import java.util.ArrayList;
import java.util.Arrays;

//класс корзины игрушек
public class basketToys {
    private String[] basket;

    private basketRandom baskRnd;
    private int size;
    private int cout;
    //конструктор корзины
    public basketToys(int size)
    {
        basket=new String[size];
        this.size=size;
    }
    //метод получения корзины
    public String[] getBasket() {
        return basket;
    }
    //метод положить в корзину игрушку
    public void putBasket(String name,double weight) {
        double w=weight*size;
        int w1=(int) w;
        int i=0;

        while(w1!=0){
            if(i<size){
                if(basket[i]==null){
                    basket[i]=name;
                    w1--;
                    i++;
                }
                else{
                    i++;
                }
            }
        }
    }
    //метод получения объема корзины
    public int getSize(){
        return basket.length;
    }
}

//basketToys f=new basketToys();