import java.util.Scanner;

public class Main {
  
public static void main(String[] args)
{
  
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number of books");
int numOfBooks = sc.nextInt();

System.out.println("Enter information of the "+numOfBooks+" books  ");
  
// creating Books Array

Book[] books = new Book[numOfBooks];

// for loop to Store the Book information

for(int i = 0; i < numOfBooks; i++)
{
System.out.print("Enter Book "+(i+1)+" title : ");
//sc.nextLine();
String title = sc.next();
System.out.print("Enter Book "+(i+1)+" author : ");
sc.nextLine();
String author = sc.nextLine();
System.out.print("Enter Book "+(i+1)+" number Of Pages : ");
int numOfPages = sc.nextInt();
  
// creating Book Object with above details

Book b1 = new Book(title,author,numOfPages);
  
// adding Book Object to Array

books[i] = b1;
}
System.out.println("You have completed the information of the "+numOfBooks+" Books");  
System.out.println("Enter Volume Name : ");
String vname = sc.next();

// Creating Volume Object with input Parameters


Volume volume1 = new Volume(vname,books.length,books);
  
System.out.println();

// Display All Information About Volume
System.out.println(" Volume Information: ");
  
System.out.println("Volume Name"+"\t"+"NumberOfBooks");
System.out.println(volume1.toString());
Book[] b = volume1.getBookArray();
System.out.println("----------------------");
System.out.println("Books Details");
System.out.println("Title"+"         "+"Author"+"         "+"Number Of Pages");
for(int i = 0; i < b.length;i++)
{
System.out.println(b[i]);
}
}
  
}