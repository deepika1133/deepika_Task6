package com.deepika;
import java.io.*; 
import java.util.*;
@SuppressWarnings("unused")
public class VectorEx {
	 
	// Java program to show why collection framework was needed 
	 
	  
 
	    @SuppressWarnings("unchecked")
		public static void main (String[] args) 
	    { 
	        // Creating instances of array, vector and hashtable 
	        int arr[] = new int[] {1, 2, 3, 4}; 
	        @SuppressWarnings("rawtypes")
			Vector<Integer> v = new Vector(); 
	       
	        v.addElement(1); 
	        v.addElement(2); 
	        v.addElement(3);
	        
	  
	        // Array instance creation requires [], while Vector 
	        // and hastable require () 
	        // Vector element insertion requires addElement(), but 
	        // hashtable element insertion requires put() 
	  
	        // Accessing first element of array, vector and hashtable 
	        System.out.println(arr[0]); 
	        System.out.println(v.elementAt(0));
	        System.out.println(v.elementAt(3));
	        System.out.println(v.elementAt(8));

	  
	        // Array elements are accessed using [], vector elements 
	        // using elementAt() and hashtable elements using get() 
	    } 
	} 

