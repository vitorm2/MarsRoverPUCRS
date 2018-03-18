
public class Rover {

	private String posicaoInicial;
	private String posicaoFinal;


	public Rover(String posicaoInicial){
		this.posicaoInicial = posicaoInicial;
	}

	public String getPosicaoInicial(){
		return posicaoInicial;
	}

	public String getPosicaoFinal(){
		return posicaoFinal;
	}

	public void setPosicaoFinal(String posicaoFinal){
		this.posicaoFinal = posicaoFinal;
	}

}
