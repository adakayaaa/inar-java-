package week_09.live_class;

public class TvTest {
    public static void main(String[] args){
        TV tv = new TV();

        tv.turnOn();
        System.out.println(tv.isOn);

        tv.channelUp();
        System.out.println(tv.channel);

        tv.volumeUp();
        System.out.println(tv.volumeLevel);

        tv.setChannel(38);
        System.out.println(tv.channel);

        tv.turnOff();
        System.out.println(tv.isOn);

    }
}
