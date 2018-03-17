import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
	//Grade
		
		 Scanner xyg = new Scanner(System.in);
		
		          String xyg2="";
		       String x = "" ;
		       
		          String y = "";
		          String t = "";
		          
		 
		         System.out.print("Digite as dimensoes da grade: ");
		
		         xyg2 = xyg.nextLine();
		       
		         
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
		         //System.out.println("x: "+x);
		         //System.out.println("y: "+y);
		         
		         Scanner posicoes = new Scanner(System.in);
		 		
		          String p="";
		       String x1 = "" ;
		       
		          String y1 = "";
		          String d1="";
		          
		          
		 
		         System.out.print("Digite a posicao inicial: ");
		
		         p = posicoes.nextLine();
		       
		         
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
		         //System.out.println("x1: "+x1);
		         //System.out.println("y1: "+y1);
		        // System.out.println("d1: "+d1);
		         
		         Scanner comandos = new Scanner(System.in);
		         
		         String c = "";
		         String xf = x1;
		         String yf = y1;
		         String df = d1;
		         
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
