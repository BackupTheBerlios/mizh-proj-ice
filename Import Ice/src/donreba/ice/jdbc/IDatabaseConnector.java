// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) space 

package donreba.ice.jdbc;


public interface IDatabaseConnector
{

    public abstract int loadSettings(String s);

    public abstract void doConnect();
}
