

package MernisServiceReference;
//------------------------------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 9.0.0.0
//
// Created by Quasar Development 
//
// This class has been generated for test purposes only and cannot be used in any commercial project.
// To use it in commercial project, you need to generate this class again with Premium account.
// Check https://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
//
// Licence: 5A3202B4B674BD54F4D28482BD36CCE1BABACB41774D757CFC7EFBDDBE256DA3F3BA30D13D296D0DBB6173E313585ADAC7C36E460D752B77F9DA4A55AA4362B5
//------------------------------------------------------------------------

public class PGNSoapException extends java.lang.Exception
{
    private org.w3c.dom.Element _details=null;
    private Object _fault = null;
    
    public PGNSoapException(String message,org.w3c.dom.Element details)
    {
        super(message);
        _details=details;
    }

    public PGNSoapException(Object fault)
    {
        _fault=fault;
    }

    public Object getFault() {
        return _fault;
    }


    public org.w3c.dom.Element getDetails() {
        return _details;
    }
}