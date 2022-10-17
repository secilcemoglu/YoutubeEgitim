
public class Programm {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
	  	
		
		//CrediManager crediManager = new CrediManager();
		//crediManager.Calculate();
		//crediManager.Save();
		

		//Customer customer = new Customer(); //örnegini olusturmak instance creation
		//customer.Id = 1;
		//customer.FirstName = "Laçin";
		//customer.LastName = "Doğan";
		//customer.NationalIdentity = "1251471236";
		//customer.City = "İstanbul";
		
		
		//Company company = new Company();
		//company.TaxNumber ="123231";
		//company.CompanyName = "Arcelik";
		//company.Id = 100;
		
		//CustomerManager customerManager2 = new CustomerManager(new Person() );
		
		//Person person = new Person();
		//person.FirstName = "Ali";
		//person.NationalIdentity = "";
		
		
		
		//customerManager.Delete();
		
		//BURADA REFERANS TİPLERİNİ OLUŞTURDUK
		//Customer c1 = new Customer();
		//Customer c2 = new Person();
		//Customer c3 = new Company();
		
	}

}
