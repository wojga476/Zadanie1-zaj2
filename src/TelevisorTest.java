public class TelevisorTest {

    public static void main(String[] args) {
        Televisor telewizor = new Televisor();
            telewizor.wlCzyWyl ="Telewizor wyłączony";
            telewizor.showStatus();
            telewizor.turnOn();
            telewizor.showStatus();
            telewizor.turnOff();
            telewizor.showStatus();

    }
}
