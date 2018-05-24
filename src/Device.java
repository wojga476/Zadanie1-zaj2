public class Device {

    String code;
    String producer;
    String type;
    double cena;


    Device(String code, String producer, String type, double cena){
        this.code = code;
        this.producer = producer;
        this.type = type;
        this.cena = cena;

    }
    Device(String code, String producer, String type){
        this.code = code;
        this.producer = producer;
        this.type = type;

    }
    String getInfo() {
        return "Kod: "+code+", producent: "+producer+", typ: "+type+", cena: "+cena;
    }
}




