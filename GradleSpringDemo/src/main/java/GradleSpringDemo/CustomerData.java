package GradleSpringDemo;

public class CustomerData {
	private int cID;
	private String cName;
	private int Items;
	private String iName;
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getItems() {
		return Items;
	}
	public void setItems(int items) {
		Items = items;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	@Override
	public String toString() {
		return "CustomerData [ID: " + cID + ", Name: " + cName + ", Items: " + Items + ", Item Name: " + iName + "]";
	}
	

}
