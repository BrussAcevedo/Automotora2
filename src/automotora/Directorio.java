package automotora;

import java.io.File;
import java.io.IOException;

public class Directorio {
	private String carpetaDir;
	private String nombreCarpeta;

	
	
	public Directorio(	String carpetaDir, String nombreCarpeta) {
		this.carpetaDir = carpetaDir;
		this.nombreCarpeta = nombreCarpeta;
	}
	
	public String getCarpetaDir() {
		return carpetaDir;
	}
	
	public void setCarpetaDir(String carpetaDir) {
		this.carpetaDir = carpetaDir;
	}
	
	public String getNombreCarpeta() {
		return nombreCarpeta;
	}
	
	public void setNombreCarpeta(String nombreCarpeta) {
		this.nombreCarpeta = nombreCarpeta;
	}
	
	
	
	// Fin Constructor getter y setter;
	
	public void nuevoDirectorio() {
		File directorio = new File(this.carpetaDir +"/"+ this.nombreCarpeta);	
		if(!directorio.exists()) {
			directorio.mkdirs();
			System.out.println("Directorio creado exitosamente: "+this.carpetaDir +"/"+ this.nombreCarpeta);
		}else {
			System.out.println("No se pudo crear el directorio: ");
			System.out.println("El directorio ya existe.");
			
		}
	
	}

	@Override
	public String toString() {
		return carpetaDir + "/" + nombreCarpeta;
	}
	

	
	
	
}
