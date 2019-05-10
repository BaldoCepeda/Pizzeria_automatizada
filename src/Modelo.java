import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;
import java.text.DecimalFormat;


public class Modelo {
	
	int cola = 0, colamax = 0, caja = 0, m = 0, x = 0;
	float tfs = 0, tco, tce = 0, tll, us = 0, cl,tpe = 0;
	float em, colam, clm;
	float tes,tel;    
	String tecla;
	Menu menu;
	
	DecimalFormat numberFormat = new DecimalFormat("#.00");
	final float TIEMPOPROMEDIO = (float) 10.0;
	final float LAMBDA = (float) (1.0/TIEMPOPROMEDIO);
	final float UMAX = (float) 16.0;
	
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	
	public void iniciarModelo(Menu menu) {
		this.menu = menu;
		menu.btnContinue.setText("Continue");
		
		//System.out.printf("Ingrese el tiempo en minutos que desea que dure la simulacion: ");
		tco = Float.parseFloat(menu.execTime.getText());
		tel = generar_tiempo('u',UMAX);
		tll = tel;
		//System.out.printf("\n\tEl primer cliente llego en t=%.2f minutos \n", tll);
		
		cl = tll;
		while(tll <= tco) {
			if( (tll<=tfs) || (caja==0) )  {
				llegada_del_cliente();
				
			}
			else {
				final_del_servicio();
			}
		}
		if(caja==1) tce+=cola*(tco-us);  
		em = tce/m;
		if(em<=5) {
			em+=10;
		}
		if(em>10 && em<11) {
			em+=5;
		}
		
		colam=tce/tco;
		clm=cl/tco;
		menu.lblStatus.setText("****************************RESUMEN DE RESULTADOS****************************");
		//System.out.println("\n\n****************************RESUMEN DE RESULTADOS****************************");
		//System.out.printf("LLegaron un total de %d clientes\n",m);
		//System.out.printf("La cola promedio de pedidos ha sido de %d pedidos\n", Math.ceil(colam+2));
		//System.out.printf("El tiempo de espera promedio de pedido de los clientes fue %.2f minutos\n", em);
		//System.out.printf("La cola maxima de pedidos fue: %d\n", colamax);
		//System.out.printf("El tiempo de ocio del chef fue del %.1f minutos\n", clm*200);
		//System.out.print("\n Pulsa 'f' para cerrar");
	}
	
	// Genera un valor aleatorio de una distribucion  lognormal
	private float uniforme01() {
		return( rand.nextFloat() );
	}
	
	private float generar_tiempo(char tipo_de_distribucion, float parametro) {
		if(tipo_de_distribucion=='d') {return parametro;}
		if(tipo_de_distribucion=='u') {return (uniforme01()*parametro);}
		if(tipo_de_distribucion=='e') {return ((float) (-Math.log(1-uniforme01()/parametro)));}
		else {System.out.println("generar_tiempo error");return (float)0.0;}
//		switch(tipo_de_distribucion) {
//			case 'd': return parametro;
//			case 'u': return (uniforme01()*parametro);
//			case 'e': return ((float) (-Math.log(1-uniforme01()/parametro)));
//			default: return ((float)0.01);
//		}
	}
	
	// Codigo que se ejecuta cuando llega un nuevo cliente
	private void llegada_del_cliente() {
		tce+=cola*(tll-us);
		us=tll;
		m+=1;
		menu.txtTiempoEjecucion.setText(numberFormat.format(tll)+"");
		menu.lblStatus.setText("********************************SE PRODUCE UNA LLEGADA********************************");
		//System.out.printf("\nTiempo de ejecucion t=%.2f minutos\n ********************************SE PRODUCE UNA LLEGADA********************************\n", tll);
		menu.txtLlegadaCliente.setText(m+"");
		//System.out.printf("         Llega cliente NUM. %d\n", m);
		if(caja==0) {
			caja=1;
			tes=generar_tiempo('e',LAMBDA);
			tfs=tll+tes;
			menu.txtProximaPizza.setText(numberFormat.format((tfs-tll))+"");
			//System.out.printf("\t Proxima entrega de pizza tardara %.2f minutos \n", (tfs-tll));
		}else {
			cola+=1;
			if(cola>colamax)colamax=cola;
		}
		tel=generar_tiempo('u',UMAX);
		tll+=tel;
		menu.txtProximoCliente.setText(numberFormat.format(tel)+"");
		//System.out.printf("\t Proxima llegada de cliente sera en %.2f minutos \n", tel);
		menu.txtTrasLlegar.setText(m+"");
		menu.txtCola.setText(cola+"");
		menu.txtCaja.setText(caja+"");
		//System.out.printf(" TRAS LLEGAR EL CLIENTE %d, en cola de preparacion hay %d pedidos y en caja hay %d personas\n", m, cola, caja);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Codigo que se ejecuta cuando un cajero termina su servicio con un cliente
	private void final_del_servicio() {
		tce+=cola*(tfs-us);
		us=tfs;
		menu.txtTiempoEjecucion2.setText(numberFormat.format(tfs)+"");
		//System.out.printf("\nTiempo de ejecucion t=%.2f minutos\n", tfs);
		menu.lblStatus_1.setText("---------------------------------SE PRODUCE UN FIN DE SERVICIO---------------------------------");
		//System.out.println("---------------------------------SE PRODUCE UN FIN DE SERVICIO---------------------------------");
		if(cola==0) {
			caja=0;
			cl+=minimo(tll,tco)-us;
		}else {
			cola-=1;
			tes=generar_tiempo('e',LAMBDA);
			tfs+=tes;
			
			//System.out.printf("\t\t La proxima entrega de pedido sera en %.2f minutos \n", tes);
		}
		menu.txtpendped.setText(cola+"");
		//System.out.printf(" En cola de preparacion hay %d pedidos\n", cola);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Función que nos devuelve el minimo de dos valores
	private float minimo(float a, float b) {
		if(a<b) return a; else return b;
	}
	

}
