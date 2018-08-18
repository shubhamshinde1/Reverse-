class book 
{
 String author,title,publisher;
 book(String t1,String a1,String p1)
 { 
author=a1; title=t1; publisher=p1; 
}
 }
 class bookinfo extends book
 { 
int price,s_p;
 bookinfo(String t1, String a1, String p1, int p,int sp) 
{ 
super(t1,a1,p1);
 price=p; s_p=sp;
 }
 void show() 
{ 
 System.out.println("Title: "+title);
 System.out.println("Author: "+author); 
 System.out.println("Publisher: "+publisher); 
 System.out.println("Price: Rs."+price); 
 System.out.println("Stock Position: "+s_p);
 }
 }
 class bookdemo
 {
 public static void main(String args[])
 { 
 bookinfo b1=new bookinfo("Harry Potter","J.K. Rowling","Bloomsbury",500,1); 
 bookinfo b2=new bookinfo("Twilight","Stephenie Meyer","Atom",150,2);
 bookinfo b3=new bookinfo("Master Of The Game","Sidney Sheldon","Harper",800,3);
 b1.show(); 
 b2.show();
 b3.show();
 }
 }