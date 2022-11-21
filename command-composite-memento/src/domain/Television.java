package domain;

public class Television
{
    private int volume; //0-10 (0 is muted)
    private int channelNum;

    public Television()
    {
        volume = 5;
        channelNum = 2;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public int getChannelNum()
    {
        return channelNum;
    }

    public void setChannelNum(int channelNum)
    {
        this.channelNum = channelNum;
    }

    @Override
    public String toString()
    {
        return "Television{" +
                "volume=" + volume +
                ", channelNum=" + channelNum +
                '}';
    }
}
