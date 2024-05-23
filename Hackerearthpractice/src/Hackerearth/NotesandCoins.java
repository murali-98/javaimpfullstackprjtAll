package Hackerearth;

import java.util.*;
public class NotesandCoins {
	   public static void main(String []args)
	   {
	       Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int val = 0;
	       Bag<Coin> bagOfCoins = new Bag<Coin>();
	       Bag<Note> bagOfNotes = new Bag<Note>();
	       for(int i=0;i<n;i++)
	       {
	           String str = sc.next();
	           val = sc.nextInt();
	           switch(str)
	           {
	               case "Coin":
	                   Coin coin = new Coin();
	                   int c = coin.setValue(val);
	                   bagOfCoins.add(c);
	                   break;
	               case "Note":
	                   Note note = new Note();
	                   int c1 = note.setValue(val);
	                   bagOfNotes.add(c1);
	                   break;
	           }

	       }
	       System.out.println("Coins :");
	       bagOfCoins.display();
	       System.out.println("Notes :");
	       bagOfNotes.display();
	   }

	}

	class Note

	{
	   public int setValue(int val)
	   {
	       return val;
	   }
	}

	 

	class Coin
	{
	   public int setValue(int val)
	   {
	       return val;
	   }

	}

	class Bag<T>

	{
	   List <Integer> l1 = new ArrayList<>();
	   public void add(int obj)
	   {
	       l1.add(obj);
	   }
	   public void display()
	   {
	       for(int i=0;i<l1.size();i++)
	       {
	           System.out.println(l1.get(i));
	       }

	   }

	}
/*
 7
Note 83
Coin 19
Coin 85
Note 8
Note 30
Coin 56
Coin 53
 */

