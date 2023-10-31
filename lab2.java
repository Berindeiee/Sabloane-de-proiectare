/*
import java.util.ArrayList;

//e1
class Author {
    private String name;

    Author(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Book {
    private String title;
    private ArrayList<Chapter> chapters = new ArrayList<>();
    private ArrayList<Author> authors = new ArrayList<>();

    Book(String t) {
        title = t;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String name) {
        chapters.add(new Chapter(name));
        return chapters.size() - 1;
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }
}

class Chapter {
    private String name;
    private ArrayList<SubChapter> subChapters = new ArrayList<>();

    Chapter(String n) {
        name = n;
    }

    public int createSubChapter(String name) {
        subChapters.add(new SubChapter(name));
        return subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int index) {
        return subChapters.get(index);
    }
}

class SubChapter {
    private String name;
    private ArrayList<Object> content = new ArrayList<>();

    SubChapter(String n) {
        name = n;
    }

    public void createNewParagraph(String text) {
        content.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        content.add(new Image(imageName));
    }

    public void createNewTable(String title) {
        content.add(new Table(title));
    }

    public void print() {
        System.out.println("SubChapter: " + name);
        for (Object item : content) {
            if (item instanceof Paragraph) {
                ((Paragraph) item).print();
            } else if (item instanceof Image) {
                ((Image) item).print();
            } else if (item instanceof Table) {
                ((Table) item).print();
            }
        }
    }
}

class Image {
    private String imageName;

    Image(String t) {
        imageName = t;
    }

    public void print() {
        System.out.println("Image: " + imageName);
    }
}

class Table {
    private String title;

    Table(String n) {
        title = n;
    }

    public void print() {
        System.out.println("Table: " + title);
    }
}

class Paragraph {
    private String text;

    Paragraph(String t) {
        text = t;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }
}

public class lab2 {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author author = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(author);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewParagraph("Paragraph 3");
        scOneOne.createNewImage("Image 1");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewParagraph("Paragraph 5");
        scOneOne.print();
    }
}
*/