import java.util.ArrayList;
import java.util.List;
class Book implements Element {
    private String title;
    private ArrayList<Author> authors = new ArrayList<>();
    private List<Element> contents = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    @Override
    public void addContent(Element e) {
        contents.add(e);
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        if (authors != null) {
            for (Author author : authors) {
                author.print();
            }
        }
        for (Element content : contents) {
            content.print();
        }
    }
}