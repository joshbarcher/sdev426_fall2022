package command;

import domain.Television;

public class MuteCommand implements ITVCommand
{
    private Television receiver;

    public MuteCommand(Television receiver)
    {
        this.receiver = receiver;
    }

    @Override
    public void doSomething()
    {
        toggle();
    }

    @Override
    public void undoSomething()
    {
        //is this a bad design?
        toggle();
    }

    private void toggle()
    {
        //toggle the mute status
        if (receiver.getVolume() == 0) //muted currently!
        {
            receiver.setVolume(5);
        }
        else //unmuted currently!
        {
            receiver.setVolume(0);
        }
    }
}
