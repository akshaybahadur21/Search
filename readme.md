## Searching Algorithms
This code helps you to understand the different Searchind algorithms. The sorting algorithms depicted in this code are:
1) Linear Search
2) Binary Seacrh
3) Binary Search with recursion

### Code Requirements
The example code is in Java ([version 1.8](https://java.com/en/download/) or higher will work). 

### Description
In computer science, a search algorithm is any algorithm which solves the Search problem, namely, to retrieve information stored within some data structure, or calculated in the search space of a problem domain. Examples of such structures include but are not limited to a Linked List, an Array data structure, or a Search tree. The appropriate search algorithm often depends on the data structure being searched, but also on any a priori knowledge about the data.

Search algorithms can be classified based on their mechanism of searching. Linear search algorithms check every record for the one associated with a target key in a linear fashion.[3][4] Binary, or half interval searches, repeatedly target the center of the search structure and divide the search space in half. 

For more information, [see](https://en.wikipedia.org/wiki/Search_algorithm)

<img src="https://github.com/akshaybahadur21/Search/blob/master/search.gif" align=center>

```java

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
``` 


You can select any algorithm from the list and then enter an array. Following that, enter a term that you want to search in the list.


### Execution
To compile the code, simply run the `javac Search.java`.
To run the code, type `java Search`

```
javac Search.java
java Search
```