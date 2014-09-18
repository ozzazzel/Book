class Book
{
private String title,author;
private int numberOfPages;

Book()
{

}

// Book Class Parameter Constructor

public Book(String title,String author,int pages) {
this.title = title;
this.author = author;
this.numberOfPages = pages;
}
  
public String toString()
{
return title+"\t"+author+"\t"+numberOfPages;
}

}