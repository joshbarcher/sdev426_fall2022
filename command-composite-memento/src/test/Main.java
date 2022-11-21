package test;

import command.DirectChannelCommand;
import command.ITVCommand;
import command.MuteCommand;
import command.NavigateChannelCommand;
import domain.Television;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import static command.NavigateChannelCommand.*;

public class Main
{
    public static void main(String[] args)
    {
        Television tv = new Television();
        System.out.println(tv);

        Queue<ITVCommand> queue = new LinkedList<>(List.of(
            new MuteCommand(tv),
            new DirectChannelCommand(100, tv),
            new NavigateChannelCommand(Direction.UP, tv),
            new NavigateChannelCommand(Direction.UP, tv),
            new NavigateChannelCommand(Direction.UP, tv)
        ));

        //create an undo stack (reversing the order of commands)
        Stack<ITVCommand> undoStack = new Stack<>();

        //perform each command
        while (!queue.isEmpty())
        {
            ITVCommand command = queue.remove();
            System.out.println("Executed command: " + command);
            command.doSomething();
            undoStack.push(command);
        }
        System.out.println(tv);

        //undo all commands
        while (!undoStack.isEmpty())
        {
            ITVCommand command = undoStack.pop();
            System.out.println("Undo command: " + command);
            command.undoSomething();
        }
        System.out.println(tv);
    }
}










