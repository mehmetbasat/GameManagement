package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

    private CustomerCheckService customerCheckService;

    public CustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) throws Exception {

        if(customerCheckService.CheckIfRealPerson(customer)) {
            System.out.println("Customer added : " + customer.getFirstName() + " " + customer.getLastName());
        } else {
            System.out.println("Customer not added. İnformation is missing or incorrect  : " + customer.getFirstName() + " " + customer.getLastName());
        }
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Customer deleted : " + customer.getFirstName() + " " + customer.getLastName());

    }

    @Override
    public void update(Customer customer) {
        System.out.println("Customer information updated : " + customer.getFirstName() + " " + customer.getLastName());

    }
}
