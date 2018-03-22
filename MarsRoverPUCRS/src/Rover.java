
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


	public String movimentaRover(String c) {

			String t = "";
			String xf = ""+posicaoInicial.charAt(0);
	        String yf = ""+posicaoInicial.charAt(1);
	        String df = ""+posicaoInicial.charAt(2);
	        int aux=0;

			for (int i = 0; i < c.length(); i++) {
	       	 t=""+c.charAt(i);
	       	 for (int j =0; j<2;j++) {
	           if(t.contentEquals("l")) {
	           	if(df.contentEquals("n")) {
	           		df="w";
	           		break;
	           	}
	           	if(df.contentEquals("w")) {
	           		df="s";
	           		break;
	           	}
	           	if(df.contentEquals("s")) {
	           		df="e";
	           		break;
	           	}
	           	if(df.contentEquals("e")) {
	           		df="n";
	           		break;
	           	}

	       	 }
	       	 }
	       	 for (int j =0; j<2;j++) {
	           if(t.contentEquals("r")) {
	           	if(df.contentEquals("n")) {
	           		df="e";
	           		break;
	           	}
	           	if(df.contentEquals("e")) {
	           		df="s";
	           		break;
	           	}
	           	if(df.contentEquals("s")) {
	           		df="w";
	           		break;
	           	}
	           	if(df.contentEquals("w")) {
	           		df="n";
	           		break;
	           	}

	       	 }
	       	 }
	       	 for (int j =0; j<2;j++) {
	           if(t.contentEquals("m")) {
	           	if(df.contentEquals("n")) {

	           		try {
	       				aux = Integer.parseInt(yf);
	       			} catch (NumberFormatException e) {

	       			}
	           		aux=aux+1;
	           		yf= ""+aux;
	           		break;
	           	}
	           	if(df.contentEquals("e")) {

	           		try {
	       				aux = Integer.parseInt(xf);
	       			} catch (NumberFormatException e) {

	       			}
	           		aux=aux+1;
	           		xf= ""+aux;
	           		break;
	           	}
	           	if(df.contentEquals("s")) {

	           		try {
	       				aux = Integer.parseInt(yf);
	       			} catch (NumberFormatException e) {

	       			}
	           		aux=aux-1;
	           		yf= ""+aux;
	           		break;
	           	}
	           	if(df.contentEquals("w")) {

	           		try {
	       				aux = Integer.parseInt(xf);
	       			} catch (NumberFormatException e) {

	       			}
	           		aux=aux-1;
	           		xf= ""+aux;
	           		break;
	           	}
	           }
	       	 }

	        }
			System.out.println("Posição final: " + xf + " " + yf + " " + df.toUpperCase());
			String posicaoFinal = xf+yf+df;
			setPosicaoFinal(posicaoFinal);
			return posicaoFinal;
		}



	public String toString() {
		return "Rover Posicao Inicial: " + posicaoInicial.charAt(0) + " " + posicaoInicial.charAt(1) + " " +String.valueOf(posicaoInicial.charAt(2)).toUpperCase() +
				"  PosicaoFinal: " + posicaoFinal.charAt(0) + " " + posicaoFinal.charAt(1) + " " + String.valueOf(posicaoFinal.charAt(2)).toUpperCase() + " ";
	}


}



