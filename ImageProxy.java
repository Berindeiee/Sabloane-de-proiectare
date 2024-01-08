import services.Visitor;

public class ImageProxy implements Element{
    private String url;
    private Dimension dim;

    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.realImage = null;
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url) {
                @Override
                public void add(Element element) {

                }

                @Override
                public void remove(Element element) {

                }

                @Override
                public Element get(int index) {
                    return null;
                }
            };
        }
        return realImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    @Override
    public void print() {
        this.loadImage();
        this.realImage.print();
    }

    @Override
    public void add(Element e) {
        this.add(e);
    }

    @Override
    public void remove(Element e) {
        this.remove(e);
    }

    @Override
    public Element get(int index) {
        return this.get(index);
    }

    @Override
    public void accept(Visitor v) {
        v.visitImageProxy(this);
    }
}
