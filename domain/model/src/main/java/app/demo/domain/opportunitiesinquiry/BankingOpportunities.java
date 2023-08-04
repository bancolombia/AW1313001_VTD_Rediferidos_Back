package app.demo.domain.opportunitiesinquiry;

import java.util.ArrayList;

public class BankingOpportunities {
    private ArrayList<GeneralInformation> generalInformation;

    public BankingOpportunities() {
        //Do nothing
    }
    public ArrayList<GeneralInformation> getGeneralInformation() {
        return generalInformation;
    }

    public void setGeneralInformation(ArrayList<GeneralInformation> generalInformation) {
        this.generalInformation = generalInformation;
    }
}
