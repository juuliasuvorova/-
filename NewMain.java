public class NewMain {
    public static void main(String[] args) {
        //Если проигрыватель и носитель не подходят друг другу
        Record one = new Record();
        CDPlayer vp=new CDPlayer();
        vp.Connect(one);
        //Если проигрыватель и носитель подходят друг другу
        Record two = new Record();
        VinylPlayer vp1=new VinylPlayer();
        vp1.Connect(two);
    }
}