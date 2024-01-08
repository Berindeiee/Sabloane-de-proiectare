import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    protected String title;

    protected List<Element> children = new ArrayList<>();

    public Section() {}

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Element> getChildren() {
        return children;
    }

    public void setChildren(List<Element> children) {
        this.children = children;
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
        System.out.println(title);
//        for (Element child : children) {
//            child.print();
//        }
    }

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
        for (Element e: children){
            e.accept(v);
        }
    }
}
