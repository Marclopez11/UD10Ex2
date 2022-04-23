package ej2;

public class MiException extends Exception {

	private int codigoException;

	public MiException(int codigoException) {
		super();
		this.codigoException = codigoException;
	}

	@Override
	public String getMessage() {

		String mensaje = "";
		switch (codigoException) {
		case 1:
			 mensaje = "Exception capturada con mensaje: Esto es un objeto Exception ";
				break;

		default:
			break;
		}
		return mensaje;

	}

}
