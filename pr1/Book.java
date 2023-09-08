import java.lang.*;

public class Book {
    private String name;
    private String genre;


    public Book(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book[name = " + name + ", genre = " + genre + "]";
    }
}