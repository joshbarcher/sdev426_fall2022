package decorators;

public class CCDecorator implements IEmail
{
    //this is an instance of the Email class, or... another decorator
    private IEmail iEmail;
    private String cc;

    public CCDecorator(IEmail iEmail, String cc)
    {
        this.iEmail = iEmail;
        this.cc = cc;
    }

    @Override
    public String getHeaderText()
    {
        //leave the same!
        return iEmail.getHeaderText() + "CC: " + cc + "\n";
    }

    @Override
    public String getBodyText()
    {
        return iEmail.getBodyText();
    }
}