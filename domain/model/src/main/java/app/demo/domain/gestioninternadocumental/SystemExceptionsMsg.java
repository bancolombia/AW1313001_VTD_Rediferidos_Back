package app.demo.domain.gestioninternadocumental;

import javax.transaction.SystemException;
import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebFault(name = "systemException", targetNamespace = "http://grupobancolombia.com/intf/Corporativo/administracionDocumentos/GestionInternaDocumental/V1.0")
public class SystemExceptionsMsg extends Exception{

    /**
     * Java type that goes as soapenv:Fault detail element.
     *
     */
    private SystemException faultInfo;

    /**
     *
     * @param faultInfo
     * @param message
     */
    public SystemExceptionsMsg(String message, SystemException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SystemExceptionsMsg(String message, SystemException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     *
     * @return
     *     returns fault bean: com.grupobancolombia.intf.corporativo.administraciondocumentos.gestioninternadocumental.v1.SystemException
     */
    public SystemException getFaultInfo() {
        return faultInfo;
    }


}
