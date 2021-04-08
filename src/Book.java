import java.lang.reflect.Array;
public class Book {
    private String bookCode;
    private String name;
    private int price;
    static int number = 10;
    private String author;
    private String language;
    private String frameWork;
    public String getBookCode() {
        return bookCode;
    }
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(Book []arr) {
        this.number = arr.length;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getFrameWork() {
        return frameWork;
    }
    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }
    Book(String bookCode, String name, int price, String author, String language, String frameWork){
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
        this.language = language;
    }
    public static int getAmount(int[] arr){
        int sum= 0;
        for (int i=0;i< arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int countJava(String[] arr){
        int count=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]=="Java"){
                count++;
            }
        }
        return count;
    }
    private static int countBook(int x, int[] arr){
        int count =0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]<x){
                count++;
            }
        }
        return count;
    }
    public static Book[] findBook(int x,int[] arr, Book[] arr1){
        Book[] temp ;
        int count = countBook(x, arr);
        temp = new Book[count];
        for (int i=0;i<count;i++){
            if (arr[i]<x){
                temp[i]=arr1[i];
            }

        }
        return temp;
    }
    public String toString() {
        return "Book{" +
                "bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", frameWork='" + frameWork + '\'' +
                '}';
    }
}
