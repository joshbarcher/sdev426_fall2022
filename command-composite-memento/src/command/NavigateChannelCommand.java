package command;

import domain.Television;

public class NavigateChannelCommand implements ITVCommand
{
    private int previousChannel;
    private Direction direction;
    private Television receiver;

    public NavigateChannelCommand(Direction direction, Television receiver)
    {
        this.direction = direction;
        this.receiver = receiver;
    }

    @Override
    public void doSomething()
    {
        //save the previous channel in case we need to undo
        previousChannel = receiver.getChannelNum();

        if (direction == Direction.UP)
        {
            receiver.setChannelNum(receiver.getChannelNum() + 1);
        }
        else if (direction == Direction.DOWN)
        {
            receiver.setChannelNum(receiver.getChannelNum() - 1);
        }
    }

    @Override
    public void undoSomething()
    {
        receiver.setChannelNum(previousChannel);
    }

    public enum Direction
    {
        UP,
        DOWN
    }
}
