
abstract class BaseCreditManager implements CreditManager{

public abstract void Calculate();
//Calculate ortak değil her yerde değişken sadece imza
// Abstract ortak operasyonları tutar fakat bu operasyonlar her classts değişkenlik gösterebilir

	public void Save() {
		System.out.println("KAYDEDİLDİ");
	}
	
}
