package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/_ActivatorStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u172/10810/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, March 28, 2018 3:39:55 PM PDT
*/

public class _ActivatorStub extends org.omg.CORBA.portable.ObjectImpl implements com.sun.corba.se.spi.activation.Activator
{


  // A new ORB started server registers itself with the Activator
  public void active (int serverId, com.sun.corba.se.spi.activation.Server serverObj) throws com.sun.corba.se.spi.activation.ServerNotRegistered
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("active", true);
                com.sun.corba.se.spi.activation.ServerIdHelper.write ($out, serverId);
                com.sun.corba.se.spi.activation.ServerHelper.write ($out, serverObj);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:activation/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                active (serverId, serverObj        );
            } finally {
                _releaseReply ($in);
            }
  } // active


  // Install a particular kind of endpoint
  public void registerEndpoints (int serverId, String orbId, com.sun.corba.se.spi.activation.EndPointInfo[] endPointInfo) throws com.sun.corba.se.spi.activation.ServerNotRegistered, com.sun.corba.se.spi.activation.NoSuchEndPoint, com.sun.corba.se.spi.activation.ORBAlreadyRegistered
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registerEndpoints", true);
                com.sun.corba.se.spi.activation.ServerIdHelper.write ($out, serverId);
                com.sun.corba.se.spi.activation.ORBidHelper.write ($out, orbId);
                com.sun.corba.se.spi.activation.EndpointInfoListHelper.write ($out, endPointInfo);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:activation/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.read ($in);
                else if (_id.equals ("IDL:activation/NoSuchEndPoint:1.0"))
                    throw com.sun.corba.se.spi.activation.NoSuchEndPointHelper.read ($in);
                else if (_id.equals ("IDL:activation/ORBAlreadyRegistered:1.0"))
                    throw com.sun.corba.se.spi.activation.ORBAlreadyRegisteredHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                registerEndpoints (serverId, orbId, endPointInfo        );
            } finally {
                _releaseReply ($in);
            }
  } // registerEndpoints


  // list active servers
  public int[] getActiveServers ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getActiveServers", true);
                $in = _invoke ($out);
                int $result[] = com.sun.corba.se.spi.activation.ServerIdsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getActiveServers (        );
            } finally {
                _releaseReply ($in);
            }
  } // getActiveServers


  // If the server is not running, start it up.
  public void activate (int serverId) throws com.sun.corba.se.spi.activation.ServerAlreadyActive, com.sun.corba.se.spi.activation.ServerNotRegistered, com.sun.corba.se.spi.activation.ServerHeldDown
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("activate", true);
                com.sun.corba.se.spi.activation.ServerIdHelper.write ($out, serverId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:activation/ServerAlreadyActive:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerAlreadyActiveHelper.read ($in);
                else if (_id.equals ("IDL:activation/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.read ($in);
                else if (_id.equals ("IDL:activation/ServerHeldDown:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerHeldDownHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                activate (serverId        );
            } finally {
                _releaseReply ($in);
            }
  } // activate


  // If the server is running, shut it down
  public void shutdown (int serverId) throws com.sun.corba.se.spi.activation.ServerNotActive, com.sun.corba.se.spi.activation.ServerNotRegistered
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", true);
                com.sun.corba.se.spi.activation.ServerIdHelper.write ($out, serverId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:activation/ServerNotActive:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerNotActiveHelper.read ($in);
                else if (_id.equals ("IDL:activation/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (serverId        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown


  // currently running, this method will activate it.
  public void install (int serverId) throws com.sun.corba.se.spi.activation.ServerNotRegistered, com.sun.corba.se.spi.activation.ServerHeldDown, com.sun.corba.se.spi.activation.ServerAlreadyInstalled
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("install", true);
                com.sun.corba.se.spi.activation.ServerIdHelper.write ($out, serverId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:activation/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.read ($in);
                else if (_id.equals ("IDL:activation/ServerHeldDown:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerHeldDownHelper.read ($in);
                else if (_id.equals ("IDL:activation/ServerAlreadyInstalled:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerAlreadyInstalledHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                install (serverId        );
            } finally {
                _releaseReply ($in);
            }
  } // install


  // list all registered ORBs for a server
  public String[] getORBNames (int serverId) throws com.sun.corba.se.spi.activation.ServerNotRegistered
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getORBNames", true);
                com.sun.corba.se.spi.activation.ServerIdHelper.write ($out, serverId);
                $in = _invoke ($out);
                String $result[] = com.sun.corba.se.spi.activation.ORBidListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:activation/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getORBNames (serverId        );
            } finally {
                _releaseReply ($in);
            }
  } // getORBNames


  // After this hook completes, the server may still be running.
  public void uninstall (int serverId) throws com.sun.corba.se.spi.activation.ServerNotRegistered, com.sun.corba.se.spi.activation.ServerHeldDown, com.sun.corba.se.spi.activation.ServerAlreadyUninstalled
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("uninstall", true);
                com.sun.corba.se.spi.activation.ServerIdHelper.write ($out, serverId);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:activation/ServerNotRegistered:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerNotRegisteredHelper.read ($in);
                else if (_id.equals ("IDL:activation/ServerHeldDown:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerHeldDownHelper.read ($in);
                else if (_id.equals ("IDL:activation/ServerAlreadyUninstalled:1.0"))
                    throw com.sun.corba.se.spi.activation.ServerAlreadyUninstalledHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                uninstall (serverId        );
            } finally {
                _releaseReply ($in);
            }
  } // uninstall

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:activation/Activator:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ActivatorStub
