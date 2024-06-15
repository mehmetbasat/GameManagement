import Abstract.MernisServiceAdapter;
import Concrete.*;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {
    public static void main(String[] args) throws Exception {

        Customer customer = new Customer(1,
                "Mehmet",
                "BASAT",
                "mehmetbasatt@gmail.com",
                "5555555555",
                "1976",
                "6349425676");
        Game game = new Game(
                1,
                "Fifa 24",
                2000
        );

        Campaign campaign = new Campaign(
                1,
                "Öğrenci İndirimi",
                20
        );

        CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
        customerManager.add(customer);


        GameManager gameManager = new GameManager();
        gameManager.add(game);

        SaleManager saleManager = new SaleManager(new CampaignManager());
        saleManager.sale(customer, game);
        saleManager.saleWithCampaign(customer,game,campaign);


        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);


    }


}