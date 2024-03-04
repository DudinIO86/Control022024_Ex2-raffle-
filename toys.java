//класс создания игрушек
public class toys {
    private int ID;
    private String name;
    private double weight;

    //конструктор класса
    public toys(int ID, String name, double weight){
        this.ID=ID;
        this.name=name;
        this.weight=weight;
    }
    //метод получение имени игрушки
    public String getName(){
        return name;
    }
    //метод получение ID
    public int getID(){
        return ID;
    }
    //метод получения веса игрушки
    public double getWeight(){
        return weight;
    }
}
