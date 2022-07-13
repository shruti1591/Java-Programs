
/*Write a java program to demonstarate arraylist*/


import java.util.*;

class ArrayListExample
{
public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String>();
list.add("Mango");
list.add("Apple");
list.add("Grapes");

Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

list.set(1,"Kiwi");

System.out.println(list);

}}