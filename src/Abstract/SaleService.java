package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface SaleService {
    void sale(Customer customer, Game game);
    void saleWithCampaign(Customer customer, Game game, Campaign campaign);
}
