package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService=customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			BaseCustomerManager baseCustomerManager = new BaseCustomerManager();
			baseCustomerManager.save(customer);
		}else {
			System.out.println("Not a valid person");
		}
		
		
		
	}


}
