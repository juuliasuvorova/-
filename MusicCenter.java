public class MusicCenter {
    private int id;
    private String name;
    public void setID(int n){
         this.id=n;
    }
    public void setName(String n){
        this.name=n;
    }
    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void Connect(MusicCarry one){
        if (this.getID() != one.getID()){
            System.out.println("Музыкальный центр не может воспроизводить музыку с этого устройства");
        }
        else{
            System.out.printf("В данный момент играет %s by %s",one.getTrack(),this.getName());
        }

    }



}