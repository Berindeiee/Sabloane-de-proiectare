interface Element {
    void print();
    default void add(Element e) {}
    default void remove(Element e) {}
    default Element get(int index) { return null; }
}