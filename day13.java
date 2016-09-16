class MyBook extends Book {
    int price;
    MyBook (String t, String a, int price){
        super(t, a);
        this.price = price;
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + this.price);
    }
}
   