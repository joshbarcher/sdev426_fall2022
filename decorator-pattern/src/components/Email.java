package components;

import decorators.IEmail;

public class Email implements IEmail
{
    private String sender;
    private String recipient;
    private String body;

    public Email(String sender, String recipient, String body)
    {
        this.sender = sender;
        this.recipient = recipient;
        this.body = body;
    }

    public String getSender()
    {
        return sender;
    }

    public String getRecipient()
    {
        return recipient;
    }

    public String getBody()
    {
        return body;
    }

    @Override
    public String getHeaderText()
    {
        return "Sender: " + sender + "\nRecipient: " + recipient + "\n";
    }

    @Override
    public String getBodyText()
    {
        return body + "\n";
    }

    @Override
    public String toString()
    {
        return sender + "\n" + recipient + "\n" + body;
    }
}








