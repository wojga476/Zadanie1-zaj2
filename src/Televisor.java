public class Televisor {

    String wlCzyWyl;


    //wlCzyWyl = "Telewizor wyłączony";
    void turnOn(){
        wlCzyWyl ="Telewizor włączony";
    }
    void turnOff(){
        wlCzyWyl ="Telewizor wyłączony";
    }
    void showStatus(){
        System.out.println(wlCzyWyl);
    }
}
