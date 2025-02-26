package org.example;

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
String candidato1="", candidato2="", candidato3="" ;
int  medio=0, s1=0,s2=0,s3=0,vtotal=0, entrada=0, voto=0,voto1=0,voto2=0,voto3=0, hv1=0,hv2=0,hv3=0, r1=0,r2=0,r3=0, i1=0, i2=0,i3=0,t1=0,t2=0,t3=0;
double pv1=0,pv2=0,pv3=0, pr=0;
Scanner teclado= new Scanner(System.in);
        Scanner registro= new Scanner(System.in);

do {
    System.out.println("Menú electoral");
    System.out.println("1- Registro Candidato");
    System.out.println("2- Votar Candidato");
    System.out.println("3- Calcular valor campaña de cada Candidato");
    System.out.println("4- Vaciar urnas");
    System.out.println("5- Conocer el número de votos");
    System.out.println("6- Porcentaje de votos obtenidos por cada candidato");
    System.out.println("7- Costo promedio de campaña en las elecciones");

    entrada=teclado.nextInt();

            switch(entrada)
            {
                case 1:

                    System.out.println("REGISTRO DE CANDIDATO");
                    System.out.println("INGRESE EL NOMBRE DEL CANDIDATO 1");
                    candidato1=registro.nextLine();
                    System.out.println("INGRESE EL NOMBRE DEL CANDIDATO 2");
                    candidato2=registro.nextLine();
                    System.out.println("INGRESE EL NOMBRE DEL CANDIDATO 3");
                    candidato3=registro.nextLine();
                    System.out.println("LOS CANDIDATOS REGISTRADOS SON: ");
                   System.out.println(candidato1+"\t"+candidato2+"\t"+candidato3+"\t");
                    break;

                case 2:

                    System.out.println("VOTE POR SU CANDIDATO:");
                    System.out.println("1- "+candidato1+"\t 2- "+candidato2+"\t 3- "+candidato3+"\t");
                    voto=teclado.nextInt();

                    switch(voto)
                    {
                        case 1:
                            System.out.println("Usted acaba de votar por: "+candidato1);
                            if(voto==1){voto1++;hv1++;}
                            System.out.println("indique el medio por donde lo conoció");
                            System.out.println("Seleccione 1->radio, 2-> internet, 3-> Tv");
                            medio=teclado.nextInt();
                            switch (medio)
                            {
                                case 1:
                                {
                                    if(medio==1)
                                        r1++;
                                }
                                    break;

                                case 2:
                                {if(medio==2) i1++;}
                                    break;

                                case 3:
                                {if(medio==3) t1++;}
                                    break;

                                default:
                                    System.out.println("opción no valida --> SALIR");
                                    break;
                            }



                            break;

                        case 2:
                            System.out.println("Usted acaba de votar por: "+candidato2);
                            if(voto==2){voto2++;hv2++;}
                            System.out.println("indique el medio por donde lo conoció");
                            System.out.println("Seleccione 1->radio, 2-> internet, 3-> Tv");
                            medio=teclado.nextInt();
                            switch (medio)
                            {
                                case 1:
                                {if(medio==1) r2++;}
                                break;

                                case 2:
                                {if(medio==2) i2++;}
                                break;

                                case 3:
                                {if(medio==3) t2++;}
                                break;

                                default:
                                    System.out.println("opción no valida --> SALIR");
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Usted acaba de votar por: "+candidato3);
                            if(voto==3){voto3++;hv3++;}
                            System.out.println("indique el medio por donde lo conoció");
                            System.out.println("Seleccione 1->radio, 2-> internet, -> Tv");
                            medio=teclado.nextInt();
                            switch (medio)
                            {
                                case 1:
                                {if(medio==1) r3++;}
                                break;

                                case 2:
                                {if(medio==2) i3++;}
                                break;

                                case 3:
                                {if(medio==3) t3++;}
                                break;

                                default:
                                    System.out.println("opción no valida --> SALIR");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("opción no valida --> SALIR");
                            break;

                    }

                    break;

                case 3:

                    System.out.println("Valor campaña Candidato: "+candidato1);
                    System.out.println("Radio: $"+r1*200000+" Internet: $"+i1*700000+" Televisión: $"+t1*600000+"\t");
                    s1=(r1*200000)+(i1*700000)+(t1*600000);
                    System.out.println("costo total: $"+s1);
                    System.out.println("Valor campaña Candidato: "+candidato2);
                    System.out.println("Radio: $"+r2*200000+" Internet: $"+i2*700000+" Televisión: $"+t2*600000+"\t");
                    s2=(r2*200000)+(i2*700000)+(t2*600000);
                    System.out.println("costo total: $"+s2);
                    System.out.println("Valor campaña Candidato: "+candidato3);
                    System.out.println("Radio: $"+r3*200000+" Internet: $"+i3*700000+" Televisión: $"+t3*600000+"\t");
                    s3=(r3*200000)+(i3*700000)+(t3*600000);
                    System.out.println("costo total: $"+s3);

                    break;

                case 4:
                    System.out.println("RESETEAR VOTOS DE LA URNA");
                    voto1=0;
                    voto2=0;
                    voto3=0;
                    System.out.println(candidato1+" con "+voto1+" votos");
                    System.out.println(candidato2+" con "+voto2+" votos");
                    System.out.println(candidato3+" con "+voto3+" votos");

                    break;

                case 5:
                    vtotal=hv1+hv2+hv3;
                    System.out.println("total de votos registrados "+vtotal+ " votos");
                    break;

                case 6:
                    pv1=(hv1/vtotal);
                    System.out.println("Porcentaje de participación "+candidato1+" es "+pv1);
                    pv2=(hv2/vtotal);
                    System.out.println("Porcentaje de participación "+candidato2+" es "+pv2);
                    pv3=(hv3/vtotal);
                    System.out.println("Porcentaje de participación "+candidato3+" es "+pv3);
                    break;

                case 7:
                    pr=(s1+s2+s3)/3;
                    System.out.println("costo promedio "+pr+" por candidato");
                    break;


                default:
                    break;

            }


}
while(entrada>0);


    }
}