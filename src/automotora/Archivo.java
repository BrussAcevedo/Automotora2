package automotora;

import java.io.File;
import java.io.IOException;

public class Archivo {
	private Directorio directorio;
	private String nombreArchivo;
	private String formatoArchivo;

	
	public Archivo(Directorio directorio, String nombreArchivo, String formatoArchivo) {
		this.nombreArchivo = nombreArchivo;
		this.formatoArchivo = formatoArchivo;
		this.directorio = directorio;
	}
	
	
	public String getNombreArchivoU() {
		return nombreArchivo;
	}
	
	public String getFormatoArchivo() {
		return formatoArchivo;
	}
	
	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	
	public void setFormatoArchivo(String formatoArchivo) {
		this.formatoArchivo = formatoArchivo;
	}
	
	public Directorio getDirectorio () {
		return directorio;
	}
	
	public void setDirectorio(Directorio directorio) {
		this.directorio = directorio;
	}
	
	//Fin Constructor, Setters y Getters.
	

	public void nuevoArchivo() {
		File newFile = new File(this.directorio +"/"+ this.nombreArchivo + this.formatoArchivo);
		if (!newFile.exists()) {
			try {
				newFile.createNewFile();
				System.out.println("Archivo Creado exitosamente: " + this.directorio +"/"+ this.nombreArchivo + this.formatoArchivo);
				
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("ExeptionError: "+ e.getMessage());
			}
			
			
		}else {
			System.out.println("No se ha podido crear el archivo: ");
			System.out.println("El archivo ya existe.");
		}
	}
	
}
