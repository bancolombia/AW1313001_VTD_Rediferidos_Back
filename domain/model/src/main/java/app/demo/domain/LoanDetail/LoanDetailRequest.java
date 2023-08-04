package app.demo.domain.LoanDetail;

import app.demo.domain.Parametro;
import app.demo.domain.constantes.Parameter;

import java.util.ArrayList;
import java.util.List;

public class LoanDetailRequest {

    protected String loanId;

    protected String rediscountType = "00000";

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getRediscountType() {
        return rediscountType;
    }

    public void setRediscountType(String rediscountType) {
        this.rediscountType = rediscountType;
    }

    public List<Parametro> getListParameters() {

        List<Parametro> listaParametros = new ArrayList<>();
        listaParametros.add(new Parametro(Parameter.LOAN_ID,this.getLoanId()));
        listaParametros.add(new Parametro(Parameter.REDISCOUNT_TYPE, this.getRediscountType()));

        return listaParametros;
    }

    public List<Parametro> getHeadersList() {

        List<Parametro> listaParametros = new ArrayList<>();
        listaParametros.add(new Parametro(Parameter.LOAN_ID,this.getLoanId()));
        listaParametros.add(new Parametro(Parameter.REDISCOUNT_TYPE, this.getRediscountType()));

        return listaParametros;
    }


}
