interface Camera{
    void click();
}
interface MusicPlayer{
    void play();
}
class phone implements Camera, MusicPlayer{
     public void click(){
        System.out.println("Photo clicked from Mobile");
    }
     public void play(){
        System.out.println("Music playing in Phone");
    }
}


public class interfaceex{
    public static void main(String[] args) {
        phone p= new phone();
        p.click();
        p.play();   

    }
       

    
}
