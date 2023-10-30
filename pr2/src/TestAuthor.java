public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Saul Goodman", "bettercallsaul@yahoo.com", 'M');
        System.out.println("Author Info:");
        System.out.println("Name: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Gender: " + author.getGender());
        author.setEmail("badend@yahoo.com");
        System.out.println("New Email: " + author.getEmail());
        System.out.println(author);
    }
}
