package Abstract;

import Entities.Customer;

public interface CustomerService {
    void add(Customer customer) throws Exception;
    void delete(Customer customer);
    void update(Customer customer);
}
