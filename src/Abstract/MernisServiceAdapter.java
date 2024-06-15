package Abstract;

import Entities.Customer;
import MernisServiceReference.PGNKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

    PGNKPSPublicSoap client = new PGNKPSPublicSoap();

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        boolean result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                customer.getFirstName().toLowerCase(),
                customer.getLastName().toUpperCase(),
                Integer.parseInt(customer.getBirthDay()));

        return result;
    }
}
