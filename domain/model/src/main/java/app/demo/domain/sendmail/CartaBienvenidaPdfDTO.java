package app.demo.domain.sendmail;

import app.demo.domain.Parametro;
import app.demo.domain.constantes.Parameter;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CartaBienvenidaPdfDTO extends CartaBienvenidaMailDTO {

	public CartaBienvenidaPdfDTO() {
		super();
	}
	
	@Override
	public List<Parametro> getListParameters() {
		List<Parametro> listaParametros = new ArrayList<>();

		
		
		if (tipoCredito.equalsIgnoreCase(Parameter.TIPO_LIBREINVERSION)) {

			listaParametros.add(new Parametro(Parameter.NOMBRE_PLANTILLA_PDF, Parameter.NOMBRE_PLANTILLA_LIBREINVERSION));
			listaParametros.add(new Parametro(Parameter.IMAGENES, Parameter.IMAGENES_CORREO_LIBREINVERSION));
			listaParametros.add(new Parametro(Parameter.RUTA_PLANTILLA_CORREO, Parameter.FWK_RUTA_PLANTILLA_PDF_LIBREINVERSION));
			
		} else if (tipoCredito.equalsIgnoreCase(Parameter.TIPO_CREDIAGIL)) {

			listaParametros.add(new Parametro(Parameter.NOMBRE_PLANTILLA_PDF, Parameter.NOMBRE_PLANTILLA_CREDIAGIL));
			listaParametros.add(new Parametro(Parameter.IMAGENES, Parameter.IMAGENES_CORREO_CREDIAGIL));
			listaParametros.add(new Parametro(Parameter.RUTA_PLANTILLA_CORREO, Parameter.FWK_RUTA_PLANTILLA_PDF_CREDIAGIL));
		}

		// email to
		listaParametros.add(new Parametro(Parameter.PARA_FWK, correoElectronico));

		// info
		String rawString = nombreCliente.split(" ")[0]+"!";
		byte[] bytes = rawString.getBytes(StandardCharsets.UTF_8);
		String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
				
		listaParametros.add(new Parametro(Parameter.NOMBRE_CLIENTE,utf8EncodedString));
		listaParametros.add(new Parametro(Parameter.NUMERO_CREDITO, numeroCredito));
		listaParametros.add(new Parametro(Parameter.CUOTA, cuota));
		listaParametros.add(new Parametro(Parameter.PLAZO, plazo));
		listaParametros.add(new Parametro(Parameter.VALOR,valor));
		listaParametros.add(new Parametro(Parameter.TASA, tasa+" %"));
		listaParametros.add(new Parametro(Parameter.FECHA_INICIO, fechaInicio));
		listaParametros.add(new Parametro(Parameter.FECHA_FINAL, fechaFinal));
		listaParametros.add(new Parametro(Parameter.FECHA_UNO, fechaUno));
		listaParametros.add(new Parametro(Parameter.FECHA_DOS, fechaDos));
		listaParametros.add(new Parametro(Parameter.FECHA_TRES, fechaTres));

		// attachets
		if (documentoPdf!=null) {
			listaParametros.add(new Parametro(Parameter.ARCHIVO1_FWK, documentoPdf));
		}

		return listaParametros;
	}
}
