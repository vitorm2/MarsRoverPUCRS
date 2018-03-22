
public class Rover {

    private String xInicial;
    private String yInicial;
    private String dInicial;
    private String xFinal;
    private String yFinal;
    private String dFinal;


    public Rover(String xInicial, String yInicial, String dInicial) {
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.dInicial = dInicial;
    }


    public String getxInicial() {
        return xInicial;
    }


    public void setxInicial(String xInicial) {
        this.xInicial = xInicial;
    }


    public String getyInicial() {
        return yInicial;
    }


    public void setyInicial(String yInicial) {
        this.yInicial = yInicial;
    }


    public String getdInicial() {
        return dInicial;
    }


    public void setdInicial(String dInicial) {
        this.dInicial = dInicial;
    }


    public String getxFinal() {
        return xFinal;
    }


    public void setxFinal(String xFinal) {
        this.xFinal = xFinal;
    }


    public String getyFinal() {
        return yFinal;
    }


    public void setyFinal(String yFinal) {
        this.yFinal = yFinal;
    }


    public String getdFinal() {
        return dFinal;
    }


    public void setdFinal(String dFinal) {
        this.dFinal = dFinal;
    }


    public void setPosicaoFinal(String xFinal, String yFinal, String dFinal) {
        this.xFinal = xFinal;
        this.yFinal = yFinal;
        this.dFinal = dFinal;
    }


    public String movimentaRover(String c) throws Exception {

        String t = "";
        String xf = xInicial;
        String yf = yInicial;
        String df = dInicial;
        int aux = 0;
        String posicaoFinal = null;
        try {
            if (c.toLowerCase().contains("l") && c.toLowerCase().contains("m") || c.toLowerCase().contains("r") && c.toLowerCase().contains("m") || c.toLowerCase().contains("m") && c.toLowerCase().contains("l") && c.toLowerCase().contains("r")) {
                for (int i = 0; i < c.length(); i++) {
                    t = "" + c.charAt(i);
                    for (int j = 0; j < 2; j++) {
                        if (t.contentEquals("l")) {
                            if (df.contentEquals("n")) {
                                df = "w";
                                break;
                            }
                            if (df.contentEquals("w")) {
                                df = "s";
                                break;
                            }
                            if (df.contentEquals("s")) {
                                df = "e";
                                break;
                            }
                            if (df.contentEquals("e")) {
                                df = "n";
                                break;
                            }

                        }
                    }
                    for (int j = 0; j < 2; j++) {
                        if (t.contentEquals("r")) {
                            if (df.contentEquals("n")) {
                                df = "e";
                                break;
                            }
                            if (df.contentEquals("e")) {
                                df = "s";
                                break;
                            }
                            if (df.contentEquals("s")) {
                                df = "w";
                                break;
                            }
                            if (df.contentEquals("w")) {
                                df = "n";
                                break;
                            }

                        }
                    }
                    for (int j = 0; j < 2; j++) {
                        if (t.contentEquals("m")) {
                            if (df.contentEquals("n")) {

                                try {
                                    aux = Integer.parseInt(yf);
                                } catch (NumberFormatException e) {

                                }
                                aux = aux + 1;
                                yf = "" + aux;
                                break;
                            }
                            if (df.contentEquals("e")) {

                                try {
                                    aux = Integer.parseInt(xf);
                                } catch (NumberFormatException e) {

                                }
                                aux = aux + 1;
                                xf = "" + aux;
                                break;
                            }
                            if (df.contentEquals("s")) {

                                try {
                                    aux = Integer.parseInt(yf);
                                } catch (NumberFormatException e) {

                                }
                                aux = aux - 1;
                                yf = "" + aux;
                                break;
                            }
                            if (df.contentEquals("w")) {

                                try {
                                    aux = Integer.parseInt(xf);
                                } catch (NumberFormatException e) {

                                }
                                aux = aux - 1;
                                xf = "" + aux;
                                break;
                            }
                        }
                    }

                }
                System.out.println("Posição final: " + xf + " " + yf + " " + df.toUpperCase());
                posicaoFinal = xf + yf + df;
                setPosicaoFinal(xf, yf, df);
            }
        } catch (Exception e) {
            throw new Exception("Movimento do rover está errado.");
        }
        return posicaoFinal;
    }


    public String toString() {
        return "Rover Posicao Inicial: " + xInicial + " " + yInicial + " " + dInicial.toUpperCase() +
                "  PosicaoFinal: " + xFinal + " " + yFinal + " " + dFinal.toUpperCase() + " ";
    }


}
