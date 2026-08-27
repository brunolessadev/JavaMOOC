public class Book {
    public String name;
    public int pages;
    public int age;

    public Book(String name, int pages, int age) {
        this.name = name;
        this.pages = pages;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.pages + " pages, " + this.age;
    }
}
