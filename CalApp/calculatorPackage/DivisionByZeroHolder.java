package CalApp.calculatorPackage;

/**
* CalApp/calculatorPackage/DivisionByZeroHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from calculator.idl
* Sunday, September 11, 2016 12:05:38 PM IST
*/

public final class DivisionByZeroHolder implements org.omg.CORBA.portable.Streamable
{
  public CalApp.calculatorPackage.DivisionByZero value = null;

  public DivisionByZeroHolder ()
  {
  }

  public DivisionByZeroHolder (CalApp.calculatorPackage.DivisionByZero initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CalApp.calculatorPackage.DivisionByZeroHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CalApp.calculatorPackage.DivisionByZeroHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CalApp.calculatorPackage.DivisionByZeroHelper.type ();
  }

}
