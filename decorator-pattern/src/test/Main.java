package test;

import components.Email;
import decorators.EmailSignatureDecorator;
import decorators.IEmail;

public class Main
{
    public static void main(String[] args)
    {
        IEmail email = new EmailSignatureDecorator(
            new Email("jarcher@greenriver.edu", "khang@greenriver.edu",
                      "Are we meeting today?"), "- Josh Archer");

        System.out.println(email.getHeaderText());
        System.out.println(email.getBodyText());
    }
}