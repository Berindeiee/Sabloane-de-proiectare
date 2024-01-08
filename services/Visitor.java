package ro.uvt.info.designpatternslab2023.services;

import ro.uvt.info.designpatternslab2023.models.*;

public interface Visitor {
     void visitBook (Book b);
     void visitSection (Section s);
     void visitTableOfContents (TableOfContents toc);
     void visitParagraph (Paragraph p);
     void visitImageProxy (ImageProxy ip);
     void visitImage (Image i);
     void visitTable (Table t);
}
