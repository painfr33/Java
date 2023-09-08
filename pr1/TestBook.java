public class TestBook {
    public static  void main(String[] args){
        Book author = new Book("Saul Goodman", "Criminal");
        System.out.println("Book Info:");
        System.out.println("Name: " + author.getName());
        System.out.println("Genre: " + author.getGenre());
        author.setGenre("Drama");
        System.out.println("New Genre: " + author.getGenre());
        System.out.println(author.toString());
    }
}
