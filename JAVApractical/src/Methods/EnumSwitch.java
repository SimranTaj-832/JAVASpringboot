package Methods;

public class EnumSwitch {

	enum ch{ch1,ch2,ch3};
	enum Car {
		   lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
		   private int price;
		   Car(int p) {
		      price = p;
		   }
		   int getPrice() {
		      return price;
		   } 
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ch c=ch.ch3;
		switch(c) {
		case ch1:System.out.println("Choice 1");
		break;
		case ch2:System.out.println("Choice 2");
		break;
		case ch3:System.out.println("Choice 3");
		break;
		default:
		System.out.println("No choice");
		break;
		}
		System.out.println("All car prices:");
	      for (Car c1 : Car.values()) System.out.println(
	         c1 + " costs " + c1.getPrice() + " thousand dollars.");
	   }
	}

