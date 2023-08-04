package app.demo.domain.gateway.jpa;

import app.demo.domain.*;
import app.demo.domain.security.Payload;

import java.util.List;

public interface GatewayRediferidosJPA {

	public boolean persistirInformacionCredito(
			InformacionDispositivo informacionDispositivo) throws Exception;

	public String consultarNombreProductoByIdPlan(String idPlan);

	public List<String> consultarTiposSeguroIncluidos(String tipoSeguro, Double cuotaSeguroVida,
			Double cuotaSeguroDesempleo);

	public Producto consultarProductoByIdPlan(String idPlan);

	public List<InformacionTransaccion> listInformacionTransaccion(String idSesion);

	public Long persistirTrazaServicios(TrazaServicios trazaServicios, Payload payload);

	public List<TrazaServicios> consultarTrazaServiciosTransmisionContenidoPendiente();

	public List<TrazaServicios> consultarTrazaServiciosRegistrarVentaPendiente();

	public RegistrarVentaRequestParams consultarDatosRegistrarVenta(String idSession);

	public LogTrazabilidadRequestParams consultarDatosInformacionCredito(String idSession);

	public InformacionTransaccionAuth findInfoTransaccionAuthByIdSession(String idSesion, String pageAuth,
			String pageAuth3sa);
	
	public InformacionTransaccion findInfoTransaccionByIdSession(String idSesion);
	
}