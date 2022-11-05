public class Student {
    private String Fullname;
    private int number;
    private String date;
    private String phonenumber;
    private String facult;

    public Student(String Fullname, int number, String facult, String date, String phonenumber){
        this.Fullname = Fullname;
        this.number = number;
        this.facult = facult;
        this.date = date;
        this.phonenumber = phonenumber;
    }

    public Student(){
    }

    public void setName(String name) {
        this.Fullname = Fullname;
    }

    public String getName() {
        return Fullname;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setPhone(String phone) {
        this.phonenumber = phonenumber;
    }

    public String getPhone() {
        return phonenumber;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public String getFacult() {
        return facult;
    }


    public void takeBook(String... books) {

        System.out.println("Студент "+ this.Fullname + " взял книгу:");
        for (String book : books){
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(int number) {
        System.out.println("Студент " + this.Fullname + " взял " + number + " книгу");
    }

    public void returnBook(String... books) {
        System.out.println("Студент " + this.Fullname + " вернул книгу:");
        for(String book : books){
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(int number){
        System.out.println("Студент " + this.Fullname + " вернул " + number + " книгу");
    }

    public String StudentInfo(){
        return " Имя: " + Fullname + " Телефон: " + phonenumber + " Номер билета: " + number + " Факультет: "
                + facult + " Дата рождения: " + date ;
    }

}