interface Element {
    void print();
    default void addContent(Element e) {}
    default void remove(Element e) {}
    default Element get(int index) { return null; }
}