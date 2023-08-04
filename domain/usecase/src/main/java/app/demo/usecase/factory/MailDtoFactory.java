package app.demo.usecase.factory;

import app.demo.domain.InformacionCreditoActual;
import app.demo.domain.InformacionCreditoRediferido;
import app.demo.domain.Producto;
import app.demo.domain.constantes.ConstantesRediferidos;
import app.demo.domain.sendmail.CartaBienvenidaMailDTO;
import app.demo.domain.sendmail.CartaBienvenidaPdfDTO;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class MailDtoFactory {

	/**
	 * 
	 * @param informacionCreditoRediferido
	 * @param informacionCreditoActual
	 * @param producto
	 * @return
	 */
	public CartaBienvenidaPdfDTO createPdfDto(InformacionCreditoRediferido informacionCreditoRediferido,
			InformacionCreditoActual informacionCreditoActual, Producto producto) {
		
		SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat formatNumTasa = new DecimalFormat("#.###");
		DecimalFormat decimalFormatValor = new DecimalFormat("###,###.###");
		
		//Ten presente que hace {{fecha_uno}} adquiriste tu cr�dito, 
		//al rediferirlo a {{fecha_dos}}, el plazo total de tu cr�dito ser� de {{fecha_tres}}.
		
		CartaBienvenidaPdfDTO pdfDto = new CartaBienvenidaPdfDTO();
		pdfDto.setCorreoElectronico(informacionCreditoActual.getPersona().getCorreoElectronico());
		pdfDto.setCuota(decimalFormatValor.format(informacionCreditoRediferido.getValorNuevaCuota()));
		pdfDto.setFechaUno(informacionCreditoRediferido.getMesesTranscurridosObligacion().toString());
		pdfDto.setFechaDos(informacionCreditoRediferido.getPlazoDeseado().toString());
		pdfDto.setFechaTres(informacionCreditoRediferido.getPlazoTotalCredito().toString());
		pdfDto.setFechaInicio(parser.format(informacionCreditoRediferido.getComienzasAPagar()));
		pdfDto.setFechaFinal(parser.format(informacionCreditoRediferido.getTerminasDePagar()));
		pdfDto.setNombreCliente(informacionCreditoActual.getPersona().getNombreCompleto());
		pdfDto.setNumeroCredito(informacionCreditoActual.getNumeroPrestamoMask());
		pdfDto.setPlazo(informacionCreditoRediferido.getPlazoTotalCredito().toString());
		pdfDto.setTasa(formatNumTasa
				.format(informacionCreditoActual.getTasaFijaInteres() * ConstantesRediferidos.DOUBLE_CIEN));
		pdfDto.setValor(decimalFormatValor.format(informacionCreditoActual.getDeudaALaFecha()));
		
		pdfDto.setTipoCredito(producto.getTipoProducto());
		
		
		return pdfDto;
	}
	
	
	/**
	 * 
	 * @param informacionCreditoRediferido
	 * @param informacionCreditoActual
	 * @param producto
	 * @return
	 */
	public CartaBienvenidaMailDTO createMailDTO(InformacionCreditoRediferido informacionCreditoRediferido,
			InformacionCreditoActual informacionCreditoActual, Producto producto) {	
		
		SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
		DecimalFormat formatNumTasa = new DecimalFormat("#.###");
		DecimalFormat decimalFormatValor = new DecimalFormat("###,###.###");
		
		CartaBienvenidaMailDTO mailDto = new CartaBienvenidaMailDTO();
		mailDto.setCorreoElectronico(informacionCreditoActual.getPersona().getCorreoElectronico());
		mailDto.setCuota(decimalFormatValor.format(informacionCreditoRediferido.getValorNuevaCuota()));
		mailDto.setFechaUno(informacionCreditoRediferido.getMesesTranscurridosObligacion().toString());
		mailDto.setFechaDos(informacionCreditoRediferido.getPlazoDeseado().toString());
		mailDto.setFechaTres(informacionCreditoRediferido.getPlazoTotalCredito().toString());
		mailDto.setFechaInicio(parser.format(informacionCreditoRediferido.getComienzasAPagar()));
		mailDto.setFechaFinal(parser.format(informacionCreditoRediferido.getTerminasDePagar()));
		mailDto.setNombreCliente(informacionCreditoActual.getPersona().getNombreCompleto());
		mailDto.setNumeroCredito(informacionCreditoActual.getNumeroPrestamoMask());
		mailDto.setPlazo(informacionCreditoRediferido.getPlazoTotalCredito().toString());
		mailDto.setTasa(formatNumTasa
				.format(informacionCreditoActual.getTasaFijaInteres() * ConstantesRediferidos.DOUBLE_CIEN));
		mailDto.setValor(decimalFormatValor.format(informacionCreditoActual.getDeudaALaFecha()));
		mailDto.setTipoCredito(
				producto != null ? producto.getTipoProducto() : ConstantesRediferidos.NOMBRE_CREDITO_DEFAULT);
		return mailDto;
	}
}