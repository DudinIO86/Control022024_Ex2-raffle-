import java.util.ArrayList;
import java.util.Random;

//класс перемешивания корзины
public class basketRandom {
     Random rnd=new Random();
    public  String[] shuff(String[] arr){
        for(int i = 0; i < arr.length; i++) {
            int index = rnd.nextInt(i+1);
            String a = arr[index];
            arr[index]=arr[i];
            arr[i]=a;
        }
        return arr;
    }
}
