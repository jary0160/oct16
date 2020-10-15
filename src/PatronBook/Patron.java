
package PatronBook;

import java.util.Scanner;


public class Patron {
Book book1, book2, book3;    
String  name;    
    Patron(String name) {

    }
    //Patron p = new Patron();

    public Patron() {
        
    }
    
       public String getName(){
           Scanner input = new Scanner(System.in);
           System.out.println("Enter Your Name: ");
           this.name = input.nextLine();
           
           return name;
}
       public String hasBook(){
           if(book1==false);
           
}
       public boolean Borrow(Book b){
           if (book1==null){
               book1 = b;
               return true;
           }
           else {
                return false;
       }
            if (book2==null){
               book2 = b;
               return true;
           }
           else {
                   return false;
       }
           if (book3==null){
               book3 = b;
               return true;
           }
           else {
                   return false;
           }
       
       public boolean returnBook(Book b){
           if(book1 == b){
               book1=null;
               return true;
           }
           
           if(book2 == b){
               book2=null;
               return true;
           }
           
           if(book3 == b){
               book3=null;
               return true;
           }
  
   
       

