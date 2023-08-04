package app.demo.domain.LoanDetail;

public class Insurance {
    private static final long serialVersionUID = 7058131430326310626L;
    private String type;
    private Double rate;
    private Double additionalRate;
    private String calculationMethod;
    private String calculationBase;
    private Double fixedAmount;

    public Insurance() {
    }

    public Insurance(String type, Double rate, Double additionalRate,
                     String calculationMethod, String calculationBase, Double fixedAmount) {
          this.type = type;
          this.rate = rate;
          this.additionalRate = additionalRate;
          this.calculationMethod = calculationMethod;
          this.calculationBase = calculationBase;
          this.fixedAmount = fixedAmount;
     }

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     public Double getRate() {
          return rate;
     }

     public void setRate(Double rate) {
          this.rate = rate;
     }

     public Double getAdditionalRate() {
          return additionalRate;
     }

     public void setAdditionalRate(Double additionalRate) {
          this.additionalRate = additionalRate;
     }

     public String getCalculationMethod() {
          return calculationMethod;
     }

     public void setCalculationMethod(String calculationMethod) {
          this.calculationMethod = calculationMethod;
     }

     public String getCalculationBase() {
          return calculationBase;
     }

     public void setCalculationBase(String calculationBase) {
          this.calculationBase = calculationBase;
     }

     public Double getFixedAmount() {
          return fixedAmount;
     }

     public void setFixedAmount(Double fixedAmount) {
          this.fixedAmount = fixedAmount;
     }
}
