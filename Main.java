import Controls.AdvancedRemoteControl;
import Controls.RemoteControl;
import Devices.Radio;
import Devices.Tv;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        RemoteControl rc = new RemoteControl(tv);
        rc.togglePower();
        rc.channelUp();

        Radio radio = new Radio();
        RemoteControl arc = new AdvancedRemoteControl(radio);
        arc.togglePower();
    }
}
