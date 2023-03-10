
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> nameList = new TreeSet<>();
        Set<Book> pageNumberList =new TreeSet<>(new orderByPageNumber());



        nameList.add(new Book("Sefiller",300,"Victor Hugo",1996));
        nameList.add(new Book("Dönüşüm",500,"Franz Kafka",1856));
        nameList.add(new Book("Satranç",150,"Stefan Zweig",1870));
        nameList.add(new Book("Suç ve Ceza",320,"Dostoyevski",1711));
        nameList.add(new Book("Ölü Canlar",450,"Tolstoy",1911));

        pageNumberList.addAll(nameList);
        System.out.println();
        System.out.println("======Kitap Adına Göre Sıralama=======");

        for(Book i : nameList){
            System.out.println(i.getName()+" "+i.getPageNumber()+" "+i.getWriter()+" "+i.getReleaseDate());
        }
        System.out.println();
        System.out.println("======Sayfa Sayısına Göre Sıralama=======");
        for(Book i : pageNumberList){
            System.out.println(i.getName()+" "+i.getPageNumber()+" "+i.getWriter()+" "+i.getReleaseDate());
        }


    }
}