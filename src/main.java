import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Book []books = new Book[10];
        books[0]= new Book("1","sagsa",2,"cvcv","JS","sdsd");
        books[1]= new Book("2","yuys",8,"mmnn","Java","vcxx");
        books[2]= new Book("3","mms",4,"cvcv","HTML","sdsd");
        books[3]= new Book("4","sfsd",9,"cvcv","Java","sdsd");
        books[4]= new Book("5","wwd",6,"cvcv","JS","sdsd");
        books[5]= new Book("6","vcbbd",2,"cvcv","JS","ss");
        books[6]= new Book("7","xcxxd",7,"cvcv","Java","sdsd");
        books[7]= new Book("8","ydsss",3,"cvcv","CSS","sdsd");
        books[8]= new Book("9","bnbd",1,"yh","C++","sdsd");
        books[9]= new Book("10","rasfd",1,"vvv","C","sdsd");

            int []prices = new int[10];
            String []languages = new String[10];
            Book[] cheapbooks;

            for(int i=0;i<prices.length;i++){
                prices[i]=books[i].getPrice();
            }
            for(int i=0;i<languages.length;i++){
                languages[i]=books[i].getLanguage();
            }
            int totalprice = Book.getAmount(prices);
            System.out.println(totalprice);

        int Javabooks = Book.countJava(languages);
        System.out.println(Javabooks);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount:");
        int amount = scanner.nextInt();
        cheapbooks =Book.findBook(amount,prices,books);

        for (int i=0;i<cheapbooks.length;i++) {
            if (cheapbooks != null) {
                System.out.print(cheapbooks.toString() + " ");
            }
        }
    }
}
