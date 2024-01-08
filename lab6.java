import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import ro.uvt.info.designpatternslab2023.services.*;

@SpringBootApplication
public class lab6 {

	public static void main(String[] args) throws Exception {
		printStatistics();
	}

	public static ResponseEntity<?> printStatistics(){
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo"));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		cap1.accept(stats);
		stats.printStatistics();
		return new ResponseEntity<>("", HttpStatus.OK);
	}

	public static void createTableOfContent() {
		Book b = new Book("The book");
		Section cap1 = new Section("Chapter 1");
		Section cap11 = new Section("Subchapter 1.1");
		Section cap2 = new Section("Chapter 2");
		cap1.add(new Paragraph("Paragraph 1"));
		cap1.add(new Paragraph("Paragraph 2"));
		cap1.add(new Paragraph("Paragraph 3"));

		cap11.add(new ImageProxy("ImageOne"));
		cap11.add(new Image("ImageTwo"));

		cap2.add(new Paragraph("Paragraph 4"));
		cap1.add(cap11);
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		b.addContent(cap1);
		b.addContent(cap2);
		TableOfContentUpdate tocUpdate = new TableOfContentUpdate();
		b.accept(tocUpdate);
		tocUpdate.getToC().accept(new RenderContentVisitor());
	}
}