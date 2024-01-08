package ro.uvt.info.designpatternslab2023.services;

import ro.uvt.info.designpatternslab2023.models.*;

public class BookStatistics implements Visitor {

    private int numberOfImages = 0;
    private int numberOfTables = 0;
    private int numberOfParagraphs = 0;

    @Override
    public void visitBook(Book b) {}

    @Override
    public void visitSection(Section s) {}

    @Override
    public void visitTableOfContents(TableOfContents toc) {}

    @Override
    public void visitParagraph(Paragraph p) {
        numberOfParagraphs++;
    }

    @Override
    public void visitImageProxy(ImageProxy ip) {
        numberOfImages++;
    }

    @Override
    public void visitImage(Image i) {
        numberOfImages++;
    }

    @Override
    public void visitTable(Table t) {
        numberOfTables++;
    }

    public void printStatistics() {
        System.out.println("Books statistics");
        System.out.println("*** Number of images: " + numberOfImages);
        System.out.println("*** Number of tables: " + numberOfTables);
        System.out.println("*** Number of paragraphs: " + numberOfParagraphs);
    }
}
