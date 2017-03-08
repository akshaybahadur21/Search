import java.io.*;
import java.lang.*;
import java.util.*;
class Search
{
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int ch;
	do
	{
	System.out.println("\n1.Linear Search\n2.Binary Search\n3.Binary Search with recursion\n4.Exit");
	ch=Integer.parseInt(br.readLine());
	if(ch==4)
		return;
	System.out.println("Enter the number of terms");
	int n=Integer.parseInt(br.readLine());
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+"th term");
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter number to be searched");
		int num=Integer.parseInt(br.readLine());
		switch(ch)
		{
			case 1:
				LinearSearch(a,n,num);
				break;
			case 2:
				BinarySearch(a,n,num);
				break;
			case 3:
				int first=0;
				int last=n;
				BinarySearchRec(a,n,num,first,last);
				break;
		}
	}
	while(ch!=4);
}

public static void LinearSearch(int a[],int n,int num)
{
	for(int i=0;i<n;i++)
	{
		if(a[i]==num)
		{
			System.out.println(num+" found at "+(i+1)+"th position");
			return;
		}
	}
	System.out.println(num+" not found");
}
public static void BinarySearch(int a[],int n,int num)
{
	int first=0;
	int last=n;
	int mid=(first+last)/2;
	while(first!=last)
	{
		if(a[mid]==num)
			{
			System.out.println(num+" found at "+(mid+1)+"th position");
			return;
			}
		if(a[mid]<num)
			{
				first=mid+1;
				last=n;
				 mid=(first+last)/2;
			}
		else
			{
				first=0;
				last=mid-1;
				 mid=(first+last)/2;
			}
	}
		System.out.println(num+" not found");

}
public static void BinarySearchRec(int a[],int n,int num,int first, int last)
{
		
	if(first>last)
	{
		System.out.println(num+" not found");
		return;
	}
		int mid=(first+last)/2;
		try{
		if(a[mid]==num)
			{
			System.out.println(num+" found at "+(mid+1)+"th position");
			return;
			}
		if(a[mid]<num)
			{
				BinarySearchRec( a, n, num, mid+1, last);
			}
		if(a[mid]>num)
			{
				BinarySearchRec( a, n, num, first,  mid-1);
			}
		}
		catch(ArrayIndexOutOfBoundsException exception) {
				System.out.println(num+" not found");

			}
			
		
}
}