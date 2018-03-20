import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

	//Grade. Primeiro o usuario digita 2 numeros string separados por espaco, os quais representam o x e o y
		//da grade. O xyg2 eh a entrada e o t eh apenas um auxiliar que serve para quebrar essa entrada em  x e  
		//y da grade.

		
		 Scanner xyg = new Scanner(System.in);
		
		          String xyg2="";
		       String x = "" ;
		       
		          String y = "";
		          String t = "";
		          
		 
		         System.out.print("Digite as dimensoes da grade: ");
		
		         xyg2 = xyg.nextLine();
		       

		         //Passa todos os char da entrada, vai copiando todos para o x ate chegar em espaco em branco.
		         //Quando chega no espaco em branco, pula essa posicao e comeca a copiar todo o resto para o y,
		         //quando terminar usa break no primeiro for para nao copiar o resto para x tambem.

		         for (int i = 0; i < xyg2.length(); i++) {
		        	 t=""+xyg2.charAt(i);
		        	if(t.contentEquals(" ")) {
						for(int j=i+1; j< xyg2.length(); j++) {
							y=y+xyg2.charAt(j);
							
							
						}
						break;
					}
		        	 x=x+xyg2.charAt(i);
						

					}

		         //Agora o usuario digita a posicao inicial atraves de 3 strings separadas por espacos. Onde a
		         //primeira representa o x inicial, a segunda respresenta o y inicial e a terceira a 
		         //direcao que aponta inicial. O p eh a entrada e o t serve novamente para quebrar a entrada em 3 dados.
		         //A primeira string sera  o x1, a segunda o y2 e a terceira o d1.
		         
		         

		         //System.out.println("x: "+x);
		         //System.out.println("y: "+y);

		         
		         Scanner posicoes = new Scanner(System.in);
		 		
		          String p="";
		       String x1 = "" ;
		       
		          String y1 = "";
		          String d1="";
		          
		          
		 
		         System.out.print("Digite a posicao inicial: ");
		
		         p = posicoes.nextLine();
		       

		         //Le a entrada e copia tudo para o x1 ate achar um espaco em branco. Quando achar, pula um e
		         //passa a copiar para y1 ate achar outro espaco em branco. Quando achar, pula um e passa a
		        //copiar para d1 ate terminar. Depois os breaks evitam que mais informacoes sejam copiadas para y1
		         // e x1.

		         for (int i = 0; i < p.length(); i++) {
		        	 t=""+p.charAt(i);
		        	if(t.contentEquals(" ")) {
						for(int j=i+1; j< p.length(); j++) {
							t=""+p.charAt(j);
							if(t.contentEquals(" ")) {
								for (int k=j+1; k< p.length();k++) {
								d1=d1+p.charAt(k);	
									
								}
								break;
							}
							
							y1=y1+p.charAt(j);
							
							
						}
						break;
					}
		        	 x1=x1+p.charAt(i);
						

					}

		         //Agora o usuario digita os comandos de movimento o "c". A variavel xf representa a posicao
		         // final em x, a yf a posicao final em y e df a direcao final.
		         
		         
		         Scanner comandos = new Scanner(System.in);
		         //xf recebe x inicial, yf recebe y incial e df recebe direcao incial.

		         //System.out.println("x1: "+x1);
		         //System.out.println("y1: "+y1);
		        // System.out.println("d1: "+d1);
		         
		         Scanner comandos = new Scanner(System.in);
		         

		         String c = "";
		         String xf = x1;
		         String yf = y1;
		         String df = d1;

		         //A entrada c eh lida char por char. Se a leitura do char for "l", verifica-se o df. Se for "n"
		         // troca-se por "w", se for "w" troca-se por "s", se for s troca-se por "e". O segundo for serve
		         //apenas para quando usar o break ele nao continue fazendo os if naquele mesmo i. A mesma
		         // logica serve para o "r". Quando for "m", se df for "n", o yf recebe+1, se o df for "e" o xf recebe+1
		         // se o df for "s" o yf recebe-1, se o df for "w" o xf recebe-1.

		         

		         int aux=0;
		         System.out.print("Digite os comandos: ");
		         c= comandos.nextLine();
		         
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
		         System.out.println("Posicao final"+" "+xf+" "+yf+" "+df);
	}

}
