package app.demo.domain.gateway.trazabilidadutil;

import app.demo.domain.*;

import java.io.File;
import java.util.List;

public interface GatewayTrazabilidadUtil {

	File generateLog(InformacionCreditoActual informacionCreditoActual,
			InformacionCreditoRediferido informacionCreditoRediferido, Producto producto, Rescatame rescatame,
			List<InformacionTransaccion> itList, Long estadoMantenimientoCartera, String stepAceptaCambioCuotas,
			String idSesion, InformacionTransaccionAuth auth);
}
