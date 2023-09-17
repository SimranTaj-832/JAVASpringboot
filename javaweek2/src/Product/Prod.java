package Product;

public class Prod {
	int pid;
	String name, color;
	Double cost;
	
	Prod(){}
	Prod(int pid, String name,String color,double cost){
		this.pid=pid;
		this.name=name;
		this.color=color;
		this.cost=cost;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Prod [pid=" + pid + ", name=" + name + ", color=" + color + ", cost=" + cost + "]";
	}
	
	
	

}
