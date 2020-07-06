package com.wipro.encapsulationabstraction;







class Author{







	   public String name;



	   public String email;



	   public char gender;   











	   Author(String name, String email, char gender) {



	      this.name = name;



	      this.email = email;



	      this.gender = gender;



	   }











	}







 class Book  {



	   private String name;



	   private String author;



	   private double price;



	   private int qty;











	 Book(String name,double price,int qty){



		 Author a=new Author("richard","sss@sss",'f');



		   author=a.name;



		   this.name=name;



		   this.price=price;



		   this.qty=qty;







	 }



	 void setName(String name)



	 {



		 this.name=name;



	 }



	 void setAuthor(String author) {



		 Author a=new Author("richard","sss@sss",'f');



		 this.author=a.name;



	 }



	 void setPrice(double price)



	 {



		 this.price=price;



	 }



	 void setqty(int qty) {



		 this.qty=qty;



	 }



	 String getName()



	 {



		 return name;



	 }



	 String getAuthor() {



		 return author;



	 }



	 double getPrice()



	 {



		 return price;



	 }



	 int getQty()



	 {



		 return qty;



	 }



	 public String toString() {



		 return "author is "+author+"\n"+"book name is "+name+"\nbook price is "+price+"\nquantity is "+qty;



	 }







}







public class Book1{	



	public static void main(String args[]) {



		Book b=new Book("firstbook",55.5,6);



		System.out.println(b);







	}



		}