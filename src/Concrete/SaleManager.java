package Concrete;

import Abstract.CampaignService;
import Abstract.Entity;
import Abstract.GameService;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SaleManager implements SaleService {

    private CampaignService campaignService;

    public SaleManager(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @Override
    public void sale(Customer customer, Game game) {
        System.out.println(customer.getFirstName() + " bought " + game.getGameName());
    }

    @Override
    public void saleWithCampaign(Customer customer, Game game, Campaign campaign) {
        System.out.println(customer.getFirstName() + " bought " + game.getGameName() + " with campaign : " + campaign.getName());

    }



}
