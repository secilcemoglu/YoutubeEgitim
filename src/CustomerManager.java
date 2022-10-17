
public class CustomerManager {
	
	private Customer _customer;
	private CreditManager _creditManager ;
	

	public CustomerManager(Customer customer, CreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
		
	}
	
	public void Save() {
		System.out.println("MUSTERI KAYDEDILDI : "  );
		
	}
	public void Delete() {
		System.out.println("MUSTERI SILINDİ : "  );
		
	}
	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("KREDİ VERİLDİ");
	}
	
	}