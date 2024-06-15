package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class CampaignManager implements CampaignService {


    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName() + " campaign added");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName() + " campaign deleted");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getName() + " campaign updated");
    }

}
