package app.demo.domain.gateway.rest;

import app.demo.domain.InformacionCreditoActual;
import app.demo.domain.LoanDetail.LoanDetailRequest;

public interface GatewayLoanDetailRest {
    InformacionCreditoActual consultCurrentRediferido(LoanDetailRequest loanDetailRequest);
}
