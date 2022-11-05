public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Дубрава ", 0001 ,
                " Прикладная информатика ", "25.06.2002 ", "123456 ");
        Student student2 = new Student("Иванов ", 0002,
                " Информационная безопасность ", "10.11.1999 ", "232323 ");

        Student[] students = {student1, student2};

        Book book1 = new Book("Фантастика");
        Book book2 = new Book("Поэзия");
        Book book3 = new Book("Детектив");
        Book book4 = new Book("Детские сказки");

        Book[] books = {book1, book2, book3, book4};

        printstudents(students);
        printBooks(books);

        student1.takeBook(2);
        student2.takeBook("Фантастика");

        student1.returnBook("Поэзия");
        student2.returnBook("Фантастика");
        student2.returnBook(1);
    }

    private static void printBooks(Book[] books){
        System.out.println("Список книг: ");
        for (Book book : books) {
            System.out.println(book.BookInfo());
        }
        System.out.println();
    }

    private static void printstudents(Student[] students){
        System.out.println("Список студентов: ");
        for (Student student: students) {
            System.out.println(student.StudentInfo());
        }
        System.out.println();
    }

}
