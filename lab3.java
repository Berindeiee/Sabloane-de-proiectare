import java.util.ArrayList;
import java.util.List;

interface Element {
    void print();
    default void add(Element e) {}
    default void remove(Element e) {}
    default Element get(int index) { return null; }
}

class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }
}

class Image implements Element {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println("Image: " + url);
    }
}

class Table implements Element {
    private String something;

    public Table(String something) {
        this.something = something;
    }

    @Override
    public void print() {
        System.out.println("Table: " + something);
    }
}

class Section implements Element {
    private String title;
    private List<Element> children = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void add(Element e) {
        children.add(e);
    }

    @Override
    public void remove(Element e) {
        children.remove(e);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element child : children) {
            child.print();
        }
    }
}

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
    public void add(Element e) {
        contents.add(e);
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
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

class Author {
    private String name;
    private String surname;

    public Author(String fullName) {
        String[] names = fullName.split(" ");
        this.name = names[0];
        this.surname = names[1];
    }

    public void print() {
        System.out.println("Author: " + name + " " + surname);
    }
}


public class lab3 {
    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);
    
        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.add(new Paragraph("Multumesc celor care ..."));
        noapteBuna.add(cap1);
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));
    
        noapteBuna.print();
    }
    
}
