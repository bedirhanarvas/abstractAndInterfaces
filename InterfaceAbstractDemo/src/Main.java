import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		customer.setDateOfBirth("1985");
		customer.setFirstName("Ahmet Bedirhan ");
		customer.setLastName("Arvas");
		customer.setNationalId("36579651687");
		customer.setId(1);
		baseCustomerManager.save(customer);

		
	}

}
