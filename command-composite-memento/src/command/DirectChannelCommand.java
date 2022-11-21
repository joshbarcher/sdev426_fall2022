package command;

import domain.Television;

public class DirectChannelCommand implements ITVCommand
{
    private int previousChannel;
    private int targetChannel;
    private Television receiver;

    public DirectChannelCommand(int targetChannel, Television receiver)
    {
        this.targetChannel = targetChannel;
        this.receiver = receiver;
    }

    @Override
    public void doSomething()
    {
        //save the previous channel in case we need to undo
        previousChannel = receiver.getChannelNum();

        receiver.setChannelNum(targetChannel);
    }

    @Override
    public void undoSomething()
    {
        receiver.setChannelNum(previousChannel);
    }
}
