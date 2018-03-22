import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws Exception {

        ArrayList<Rover> listaRovers = new ArrayList<>();


        // Auxiliares booleanas para controlar o menu
        boolean aux_menu = true;
        boolean aux_menu2;

        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        String gradeInformada;

        System.out.print("Digite as dimensoes da grade: ");

        gradeInformada = in.nextLine();

        verificaGrade(gradeInformada);

        while (aux_menu) {

            aux_menu2 = true;


            String p = "";

            System.out.print("\n========= Configurando Rover =========\n\n");
            System.out.print("Digite a posicao inicial do Rover: ");

            p = in2.nextLine();

            Rover r1 = new Rover(verificaPosicaoInicial(p));
            listaRovers.add(r1);

            String c = "";

            System.out.print("Digite os comandos para movimentar o Rover: ");
            c = in2.nextLine();

            r1.movimentaRover(c);

            int escolha = 0;

            while (aux_menu2) {

                System.out.println("\n\nEscolha um opção: ");
                System.out.println("1 - Criar outro Rover.");
                System.out.println("2 - Listar todos Rovers.");
                System.out.println("3 - Fechar.");
                escolha = in.nextInt();


                switch (escolha) {
                    case 1: {
                        aux_menu2 = false;
                        break;
                    }
                    case 2: {
                        for (Rover r : listaRovers) {
                            System.out.println(r);
                        }
                        break;
                    }
                    case 3: {
                        aux_menu = false;
                        aux_menu2 = false;
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
        }

    }

    public static String verificaPosicaoInicial(String p) throws Exception {

        String t = "";
        String x1 = "";

        String y1 = "";
        String d1 = "";

        try {
            for (int i = 0; i < p.length(); i++) {
                t = "" + p.charAt(i);
                if (t.contentEquals(" ")) {
                    for (int j = i + 1; j < p.length(); j++) {
                        t = "" + p.charAt(j);
                        if (t.contentEquals(" ")) {
                            for (int k = j + 1; k < p.length(); k++) {
                                d1 = d1 + p.charAt(k);

                            }
                            break;
                        }

                        y1 = y1 + p.charAt(j);

                    }
                    break;
                }
                x1 = x1 + p.charAt(i);
            }

        } catch (Exception e) {
            throw new Exception("Posição inicial inválida.");
        }
        return x1 + y1 + d1;

    }

    public static String verificaGrade(String gradeInformada) throws Exception {

        String x = "";

        String y = "";
        String t = "";
        try {
            if (Integer.parseInt(gradeInformada.replaceAll(" ", "")) > 0) {
                for (int i = 0; i < gradeInformada.length(); i++) {
                    t = "" + gradeInformada.charAt(i);
                    if (t.contentEquals(" ")) {
                        for (int j = i + 1; j < gradeInformada.length(); j++) {
                            y = y + gradeInformada.charAt(j);

                        }
                        break;
                    }
                    x = x + gradeInformada.charAt(i);

                }
            }

        } catch (Exception e) {
            throw new Exception("Formato da grade incorreta. As dimensões da grade só podem ser constituídas de números.");
        }
        return t;
    }
}
