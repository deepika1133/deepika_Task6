package com.deepika;
import java.util.*;
class ArrayListEx{
 @SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String args[]){
  
 List al=new ArrayList();  // creating array list
 al.add("Jack");                // adding elements    
 al.add("Tyler");
 Iterator itr=al.iterator();
 while(itr.hasNext()){
 System.out.println(itr.next());
 }
 }
 
}
