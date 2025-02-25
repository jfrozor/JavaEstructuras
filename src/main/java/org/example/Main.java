package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            int menu=0, moneda=0, m20=0, m50=0, m100=0, m200=0,m500=0, suma=0;
            Scanner teclado = new Scanner(System.in);

            System.out.println("dato");

            do
            {
                System.out.println("MENU ALCANCÍA");
                System.out.println("1 - INSERTAR MONEDAS");
                System.out.println("2- CONTAR MONEDAS");
                System.out.println("3- VALOR POR CADA DENOMINACIÓN");
                System.out.println("4- SUMA");

                menu=teclado.nextInt();

                switch (menu)
                {
                    case 1:
                        System.out.println("\n - INSERTAR MONEDA");
                        System.out.println("INGRESA LA DENOMINACIÓN MONEDA 20, 50, 100, 200, 500");
                        moneda= teclado.nextInt();
                        switch (moneda)
                        {
                            case 20:
                            {
                                if(moneda==20)
                                {m20++;}
                            }
                            break;

                            case 50:
                            {
                                if(moneda==50)
                                {m50++;}
                            } break;

                            case 100:
                            {
                                if(moneda==100)
                                {m100++;}
                            }
                            break;
                            case 200:
                            {
                                if(moneda==200)
                                {m200++;}
                            }
                            break;

                            case 500:
                            {
                                if(moneda==500)
                                {m500++;}
                            }
                            break;
                            default:
                                System.out.println("LA DENOMINACIÓN INGRESADA NO ES VÁLIDA");
                                break;
                        }

                        break;

                    case 2:
                        System.out.println("\n CANTIDAD MONEDAS POR DENOMINACIÓN");
                        System.out.println("MONEDAS $20: "+m20);
                        System.out.println("MONEDAS $50: "+m500);
                        System.out.println("MONEDAS $100: "+m100);
                        System.out.println("MONEDAS $200: "+m200);
                        System.out.println("MONEDAS $500: "+m500);
                        System.out.println("\n");

                        break;

                    case 3:

                        System.out.println("\n SUBTOTALS POR DENOMINACIÓN");
                        System.out.println("MONEDAS $20: "+m20*20);
                        System.out.println("MONEDAS $50: "+m500*50);
                        System.out.println("MONEDAS $100: "+m100*100);
                        System.out.println("MONEDAS $200: "+m200*200);
                        System.out.println("MONEDAS $500: "+m500*500);
                        System.out.println("\n");

                        break;
                    case 4:
                        suma=(m20*20)+(m50*50)+(m100*100)+(m200*200)+(m500*500);
                        System.out.println("\n EL VALOR TOTAL DE MONEDAS ES: "+suma);
                        System.out.println("\n");
                        break;
                    default:
                        System.out.println("OPCIÓN NO VALIDA");
                        break;
                }
            }

            while(menu!=0);
            System.out.println("CARACTER NO PERMITIDO");

        }
    }
