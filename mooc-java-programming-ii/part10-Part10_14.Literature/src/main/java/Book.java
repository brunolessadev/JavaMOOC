public class Book implements Comparable<Book>{
    private String nameBook;
    private int age;

    public Book(String nameBook, int age) {
        this.nameBook = nameBook;
        this.age = age;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return nameBook + "(recommended for " + age + " year-olds or older)";
    }


    @Override
    public int compareTo(Book other) {
        int ageComparison = Integer.compare(this.age, other.getAge());

        if (ageComparison != 0){
            return ageComparison;
        }
        return this.nameBook.compareTo(other.getNameBook());
    }
}
