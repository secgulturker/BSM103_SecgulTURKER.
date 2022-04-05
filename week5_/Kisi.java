package ilkUygulama;

public class Kisi {
	
	private String isim;
	private int yas;
	public Kisi(String isim,int yas) {
		this.isim=isim;
		this.yas=yas;
		
	}
public String getIsim() {
	return isim;
	
}
public void SetIsim(String isim) {
	
	this.isim=isim;
	
}

public int getYas() {
	return yas ;
	
}
public void SetYas(int yas) {
	this.yas=yas;
}
}
