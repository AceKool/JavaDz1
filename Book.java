public class Book{
    private String BookName;

    public Book(String BookName){
        this.BookName = BookName;
    }

    public Book(){
    }

    public String getTitle(){
        return BookName;
    }

    public void setTitle(String title){
        this.BookName = BookName;
    }

    public String BookInfo(){
        return "Название: " + BookName;
    }

}
