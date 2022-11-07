package decorators;

public class EmailSignatureDecorator implements IEmail
{
    //this is an instance of the Email class, or... another decorator
    private IEmail iEmail;
    private String signature;

    public EmailSignatureDecorator(IEmail iEmail, String signature)
    {
        this.iEmail = iEmail;
        this.signature = signature;
    }

    @Override
    public String getHeaderText()
    {
        //leave the same!
        return iEmail.getHeaderText();
    }

    @Override
    public String getBodyText()
    {
        return iEmail.getBodyText() + signature + "\n";
    }
}
