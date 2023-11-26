public class ImageProxy implements Element {
    private String fileName;
    private Image realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    public void print() {
        if (realImage == null) {
            realImage = new Image(fileName); // Presupunând că clasa Image are un constructor care acceptă un nume de fișier
        }
        realImage.print();
    }
}
