package app.demo.domain.util;

import app.demo.domain.constantes.ConstantesRediferidos;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fechas {
	
	private static final Logger LOGGER = Logger.getLogger("app.demo.domain.util.Fechas");

	private Fechas() {}

	/**
	 * 
	 * @param strFecha
	 * @param patron
	 * @return
	 * @throws ParseException 
	 */
	public static Date strToDate(String strFecha, String patron){
		Date convertDate = null;
		try {
			convertDate = (new SimpleDateFormat(patron)).parse(strFecha);
			return convertDate;
		} catch (ParseException pex) {
			LOGGER.log(Level.WARNING, "Error parseando la fecha");
		}
		return null;
	}

	/**
	 * 
	 * @param fecha
	 * @param patron
	 * @return
	 */
	public static String dateToStr(Date fecha, String patron) {
		try {
			Format formatter = new SimpleDateFormat(patron);
			if (fecha != null) {
				return formatter.format(fecha);
			}
		} catch (Exception e) {
			LOGGER.info(String.format("Error en dateToStr ( %s , %s ): %s", fecha.toString(), patron, e.toString()));
		}
		return "";
	}

	/**
	 * 
	 * @param fechaNumerica
	 * @return
	 */
	public static Date numberToDate(String fechaNumerica) {
		Date convertDate = null;
		String fechaTotal = "";
		String patron = "yyyy/MM/dd";

		try {
			if (fechaNumerica != null && fechaNumerica.equals("") == false && fechaNumerica.trim().length() == 8) {
				String ano = fechaNumerica.substring(0, 4);
				String mes = fechaNumerica.substring(4, 6);
				String dia = fechaNumerica.substring(6, 8);

				if (ano.equals("") || mes.equals("") || dia.equals("")) {
					return convertDate;
				} else {
					fechaTotal = ano + "/" + mes + "/" + dia;
					convertDate = (new SimpleDateFormat(patron)).parse(fechaTotal);
					return convertDate;
				}
			} else {
				LOGGER.info(String.format("Error en las validaciones de  %s",fechaNumerica));
			}
		} catch (ParseException pex) {
			LOGGER.info(String.format("Error tratando de obtener una fecha de  %s",fechaNumerica));
		}
		return convertDate;
	}

	/**
	 * 
	 * @param fecha
	 * @param dias
	 * @param meses
	 * @param aF1os
	 * @param semanas
	 * @return
	 */
	public static Date sumar(Date fecha, int dias, int meses, int aF1os, int semanas) {
		try {
			Calendar c = Calendar.getInstance();
			c.setTime(fecha);
			c.add(5, dias);
			c.add(2, meses);
			c.add(1, aF1os);
			c.add(5, semanas * 7);
			fecha = c.getTime();
			return fecha;
		} catch (Exception e) {
			LOGGER.info("Error tratando de sumar dias a fecha");
		}
		return new Date();
	}

	/**
	 * 
	 * @param fecha
	 * @return
	 */
	public static int getDiaDelMes(Date fecha) {
		Calendar c = Calendar.getInstance();
		c.setTime(fecha);
		return c.get(5);
	}

	/**
	 * 
	 * @param fecha
	 * @return
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar convertirDateAXMLGregorianDate(Date fecha)
			throws DatatypeConfigurationException {
		if (fecha == null) {
			return null;
		}
		DateFormat format = new SimpleDateFormat(ConstantesRediferidos.FORMAT_DATE_YYYY_MM_DD);
		try {
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(fecha));
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * 
	 * @param fch
	 * @param dias
	 * @return
	 */
	public static Date restarDias(Date fch, int dias) {
		Calendar cal = new GregorianCalendar();
		cal.setTimeInMillis(fch.getTime());
		cal.add(Calendar.DATE, -dias);
		return new Date(cal.getTimeInMillis());
	}

	/**
	 * 
	 * @param fecha
	 * @return
	 */
	// Encuentra el dia de la semana segun la fecha actual
	// -----Lunes,martes,miercoles...
	public static int getMonthOfDate(Date fecha) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		return calendar.get(Calendar.MONTH);
	}

	/**
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static double days360(Date startDate, Date endDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		int startDay = calendar.get(Calendar.DAY_OF_MONTH);
		int startMonth = calendar.get(Calendar.MONTH);
		int realMonth = startMonth + 1;
		int startYear = calendar.get(Calendar.YEAR);

		LOGGER.info(String.format("StartDate: %s - Dia del mes: %s - Mes: %s - Mes Real: %s - Ahno: %s", startDate, startDay, startMonth, realMonth, startYear));

		Calendar calendarEnd = Calendar.getInstance();
		calendarEnd.setTime(endDate);
		int endDay = calendarEnd.get(Calendar.DAY_OF_MONTH);
		int endMonth = calendarEnd.get(Calendar.MONTH);
		int realEndMonth = endMonth + 1;
		int endYear = calendarEnd.get(Calendar.YEAR);

		LOGGER.info(String.format("EndDate: %s - Dia del mes: %s - Mes: %s - Mes Real: %s - Ahno: %s", endDate, endDay, endMonth, realEndMonth, endYear));

		if (startDay == 31 || isLastDayOfFebruary(calendar)) {
			startDay = 30;
		}

		if (startDay == 30 && endDay == 31) {
			endDay = 30;
		}
		double firstOperation = ((endYear - startYear) * 360D);
		double secondOperation = ((endMonth - startMonth) * 30D);
		double thirdOperation = (endDay - startDay);
		return firstOperation + secondOperation + thirdOperation;
	}

	/**
	 * 
	 * @param calendar
	 * @return
	 */
	public static boolean isLastDayOfFebruary(Calendar calendar) {
		LOGGER.info(String.format("######### Inicio al metodo isLastDayOfFebruary ############"));
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int realMonth = month + 1;
		int diaDelMes = calendar.get(Calendar.DAY_OF_MONTH);

		YearMonth yearMonthObject = YearMonth.of(year, realMonth);

		// Si el mes es 2 (Febrero) y el dia del mes es el ultimo (28 de Febrero) -->
		// retorno true
		boolean respuesta = (realMonth == 2) && (diaDelMes == yearMonthObject.lengthOfMonth());
		LOGGER.info(String.format("######### Finalizo al metodo isLastDayOfFebruary ############  %s",respuesta));
		return respuesta;
	}

	/**
	 * 
	 * @param fecha
	 * @param diaPago
	 * @return
	 */
	public static Date setDayToDate(Date fecha, int diaPago) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha);
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		calendar.set(year, month, diaPago, 0, 0);
		return calendar.getTime();
	}
}