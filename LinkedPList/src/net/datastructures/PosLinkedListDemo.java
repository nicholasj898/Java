package net.datastructures;

import java.util.Iterator;

public class PosLinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedPositionalList<DataElement> list =
			new LinkedPositionalList();

		DataElement d1 = new DataElement();
		d1.person ="Fred";
		d1.score = 30;
			
		Position<DataElement> p = list.addFirst(d1);
		
		DataElement d2 = new DataElement();
		d2.person = "Susy";
		d2.score = 55;
		Position<DataElement> q = list.addFirst(d2);

		DataElement d3 = new DataElement();
		d3.person = "John";
		d3.score = 61;
		Position<DataElement> r = list.addAfter(p, d3);

		DataElement d4 = new DataElement();
		d4.person = "Mary";
		d4.score = 48;
		Position<DataElement> s = list.addBefore(r, d4);

		System.out.println(list);

		Position<DataElement> t = list.after(list.after(list.first()));

		System.out.println("Third element: " + t.getElement().person  + " scored: " + t.getElement().score);

		//list.remove(t);

		System.out.println(list);

		System.out.println("====== Element iterator =======");

		//Create ElementIterator
		Iterator<DataElement> iter = list.iterator();
		while(iter.hasNext())
		{
			DataElement pE = new DataElement();
			pE=iter.next();
			System.out.println(pE.person  + " scored: " + pE.score );
		}

		list.swap(q, s);
		
		System.out.println("====== Position iterator =======");

		//Create a position iterator
		Iterator<Position<DataElement>> posIter = list.positions().iterator();
		while(posIter.hasNext())
		{
			DataElement pE = new DataElement();
			pE=posIter.next().getElement();
			System.out.println(pE.person  + " scored: " + pE.score);
		}
		
		//list.reverseList();
		list.reverseRecur();
 
		System.out.println("====== Reverse List =======");
		Iterator<DataElement> itr = list.iterator();
		while(itr.hasNext())
		{
			DataElement pE = new DataElement();
			pE=itr.next();
		 	System.out.println(pE.person  + " scored: " + pE.score);
		}
		
	}
}