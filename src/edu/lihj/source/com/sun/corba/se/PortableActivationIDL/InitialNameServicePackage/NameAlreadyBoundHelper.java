package com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage;


/**
* com/sun/corba/se/PortableActivationIDL/InitialNameServicePackage/NameAlreadyBoundHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u172/10810/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, March 28, 2018 3:39:56 PM PDT
*/

abstract public class NameAlreadyBoundHelper
{
  private static String  _id = "IDL:PortableActivationIDL/InitialNameService/NameAlreadyBound:1.0";

  public static void insert (org.omg.CORBA.Any a, com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage.NameAlreadyBound that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage.NameAlreadyBound extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage.NameAlreadyBoundHelper.id (), "NameAlreadyBound", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage.NameAlreadyBound read (org.omg.CORBA.portable.InputStream istream)
  {
    com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage.NameAlreadyBound value = new com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage.NameAlreadyBound ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.sun.corba.se.PortableActivationIDL.InitialNameServicePackage.NameAlreadyBound value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}
