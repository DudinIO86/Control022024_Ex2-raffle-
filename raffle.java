import java.util.ArrayList;

public class raffle {

    private basketRandom rnd=new basketRandom();

    private String[] basketPrize=new String [10];
    int cout=0;

    public void raffle(String[] bask,int size,int numberRaff){
         String[] basketPrize=new String [size];
        while(cout<numberRaff-1){
            for (int i = 0; i <numberRaff; i++) {
                if (bask[i]!=null){
                    System.out.println("Розыгрыш "+(int)(cout+1));
                    System.out.println("Ваш приз:"+bask[i]);
                    bask[i]=null;
                    rnd.shuff(bask);
                    cout++;
                }
                else {
                    System.out.println("Розыгрыш "+(int)(cout+1));
                    System.out.println("Вы не выиграли");
                    cout++;
                }
            }

        }



    }


}
