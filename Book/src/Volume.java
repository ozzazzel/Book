class Volume
{
private String volumeName;
private int numberOfBooks;
private Book[] books;
  

// Volume Class Constructor

Volume(String vname,int numOfBooks,Book[] books)
{
this.volumeName = vname;
this.numberOfBooks = numOfBooks;
this.books = books;
}
  
public String toString()
{
return volumeName+"\t\t"+numberOfBooks;
}
  
// it returns Array of Books
public Book[] getBookArray()
{
return books;
}
}