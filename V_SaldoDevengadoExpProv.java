package contable.server.domain;

/**
 * En esta vista la info que se tiene es la sumatoria de todos los movimientos en la cuenta recurso comprometido, por año, partida, expediente y proveedor.
 * @author Max
 *
 */
public class   V_SaldoDevengadoExpProv extends ContableBusinessObject {

	/**
	 *
	 */
	private static final long serialVersionUID = 3539091676683134070L;

//	private Long ejercicioId;
	private Long ejercicioAnio;
	private Cuenta cuenta;
	private Partida partida = new Partida();
	private Expediente expediente;
	private Proveedor proveedor;
	private Double saldo;


	public V_SaldoDevengadoExpProv() {
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public AperturaProgramatica getAperturaProgramatica() {
		return partida.getAperturaProgramatica();
	}

	public void setAperturaProgramatica( AperturaProgramatica aperturaProgramatica) {
		partida.setAperturaProgramatica(aperturaProgramatica);
	}

	public Subparcial getSubparcial() {
		return partida.getSubparcial();
	}

	public void setSubparcial(Subparcial subparcial) {
		partida.setSubparcial(subparcial);
	}


	public void setConceptoGasto(ConceptoGasto conceptoGastoGwt) {
		partida.setConceptoGasto(conceptoGastoGwt);
	}

	public ConceptoGasto getConceptoGasto() {
		return partida.getConceptoGasto();
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setEjercicioAnio(Long ejercicioAnio) {
		this.ejercicioAnio = ejercicioAnio;
	}

	public Long getEjercicioAnio() {
		return ejercicioAnio;
	}

//	public void setEjercicioId(Long ejercicioId) {
//		this.ejercicioId = ejercicioId;
//	}
//
//	public Long getEjercicioId() {
//		return ejercicioId;
//	}

	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}

	public Expediente getExpediente() {
		return expediente;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	


}