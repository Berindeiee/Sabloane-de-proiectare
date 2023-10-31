class Author {
    private String name;
    private String surname;

    public Author(String fullName) {
        String[] names = fullName.split(" ");
        this.name = names[0];
        this.surname = names[1];
    }

    public void print() {
        System.out.println("Author: " + name + " " + surname);
    }
}