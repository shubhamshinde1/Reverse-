import java.util.*;
 class Expt5
{
 public static void main(String args[])
{
 Vector v1=new Vector();
 v1.addElement(new Integer(5));
 v1.addElement(new Float(55.55));
 v1.addElement(new Double(555.9999));
 v1.addElement(new Character('A'));
 v1.addElement(new String("MIT"));
   int s=v1.size();
 for(int i=0;i<5;i++)
{
 System.out.println(" Vector "+v1.elementAt(i));
}
}
}