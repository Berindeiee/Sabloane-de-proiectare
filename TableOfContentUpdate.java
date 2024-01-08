public class TableOfContentUpdate implements Visitor {

    TableOfContents table;

    @Override
    public void visitBook(Book b) {

    }

    @Override
    public void visitSection(Section s) {

    }

    @Override
    public void visitTableOfContents(TableOfContents toc) {

    }

    @Override
    public void visitParagraph(Paragraph p) {

    }

    @Override
    public void visitImageProxy(ImageProxy ip) {

    }

    @Override
    public void visitImage(Image i) {

    }

    @Override
    public void visitTable(Table t) {

    }

    public TableOfContents getToC() {
        return this.table;
    }
}
