public class Client {
    public static void main(String args[]){

        Heater heater = new Heater();   // heater 생성
        Lamp lamp = new Lamp();         // lamp 생성

        Command heaterOnCommand = new HeaterOnCommand(heater);
        Command lampOnCommand = new LampOnCommand(lamp);
        OKGoogle okGoogle = new OKGoogle();

        // 히터를 켠다
        okGoogle.setCommand(heaterOnCommand);
        okGoogle.talk();

        // 램프를 켠다
        okGoogle.setCommand(lampOnCommand);
        okGoogle.talk();

    }
}