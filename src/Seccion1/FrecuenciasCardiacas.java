/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seccion1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author escob
 */
public class FrecuenciasCardiacas {
    private String nombre;
	private String apellido;
	private int dia;
	private int mes;
	private int año;
	
	public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int año){
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		
	}

	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setapellido(String apellido) {
		this.apellido = apellido;
	}



	public int dia() {
		return dia;
	}



	public void setdia(int dia) {
		this.dia = dia;
	}



	public int getmes() {
		return mes;
	}



	public void setmes(int mes) {
		this.mes = mes;
	}



	public int getaño() {
		return año;
	}



	public void setaño(int año) {
		this.año = año;
	}



	public void edadPersona(){
		
		LocalDate fechaNac = LocalDate.of(año, mes, dia);
		LocalDate ahora = LocalDate.now();
		
		Period periodo = Period.between(fechaNac, ahora);
		System.out.printf("%nEdad: %d agnos", periodo.getYears());
		
	}
	
	public void frecMaxPersona(){
		
		//la fórmula para calcular su frecuencia cardiaca máxima en pulsos por minuto 
		//es 220 menos su edad en agnos
		
		LocalDate fechaNac = LocalDate.of(año, mes, dia);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("%nFrecuencia cardiaca maxima: %d", 220 - periodo.getYears());
		
	}
	
	public void frecEspPersona(){
		
		//La frecuencia cardiaca esperada tiene un rango que está entre el 50 y el 85% de la 
		//frecuencia a cardiaca máxima
		
		LocalDate fechaNac = LocalDate.of(año, mes, dia);
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		
		System.out.printf("%nRango de frecuencia cardiaca esperada: entre %.0f y %.0f", 
																			   (220 - periodo.getYears())*0.5, 
																		       (220 - periodo.getYears())*0.85);
		
	}
}
