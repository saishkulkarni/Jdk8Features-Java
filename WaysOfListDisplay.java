package java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WaysOfListDisplay {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 8, 6, 2, 7, 9);
		
		//1
		System.out.println(list);
		System.out.println("****************************");
		//2
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("****************************");
		//3
		for(int i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("****************************");
		//4
		Iterator<Integer> iterrator = list.iterator();
		while(iterrator.hasNext())
		{
			System.out.print(iterrator.next()+" ");
		}
		System.out.println();
		System.out.println("****************************");
		//5
		list.forEach(x->System.out.print(x+" "));
	}
}
