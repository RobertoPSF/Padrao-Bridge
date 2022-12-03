package Devices;

public class Radio implements Device {

    private boolean isEnabled = false;
    private int volume = 0;
    private int channel = 0;

    @Override
    public void enable() {
        this.isEnabled = true;
        
    }

    @Override
    public void disable() {
        this.isEnabled = false;
        
    }

    @Override
    public int getVolume() {
        return this.volume;
        
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        
    }

    @Override
    public int getChannel() {
        return this.channel;
        
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
    
}
