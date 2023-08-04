package app.demo.domain;

public class Parametro {

	private String clave;
	private String valor;
	private Object object;
	
	public Parametro() {
		super();
	}

	public Parametro(String clave, String valor, Object object) {
		super();
		this.clave = clave;
		this.valor = valor;
		this.object = object;
	}

	public Parametro(String clave, Object object) {
		super();
		this.clave = clave;
		this.object = object;
	}

	public String getClave() {
		return clave;
	}

	public String getValor() {
		return valor;
	}

	public Object getObject() {
		return object;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "Parametro [clave=" + clave + ", valor=" + valor + ", object=" + object + "]";
	}
}