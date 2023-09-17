package p1;

public class Book {
	int bid;
	String bname;
	String author;
	float price;
	class publisher{
		String pname;
		String pdate;
		publisher()
		{ }
		void inputpbr(String pname,String pdate) {
			this.pname=pname;
			this.pdate=pdate;
		}
		void outputpbr() {
			System.out.println("Publisher : "+pname +" " +pdate);
		}
	}
		publisher pobj;
		Book(){
			this.pobj=new publisher();
		}
		public int getBid() {
			return bid;
		}
		public void setBid(int bid) {
			this.bid = bid;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public publisher getPobj() {
			return pobj;
		}
		public void setPobj(publisher pobj) {
			this.pobj = pobj;
		}
		
		public String toString() {
			return "Book details: Book Id"+bid+" Book Name "+bname+" Author name "+author+" Price "+price+" Publisher:"+pobj.pname+" "+pobj.pdate;
		}
	
	
}
