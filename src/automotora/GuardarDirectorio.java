package automotora;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GuardarDirectorio {
	private String nombreArchivo;
	private String formatoArchivo;
	private String carpetaDir;
	private String nombreCarpeta;

	public GuardarDirectorio(String carpetaDir, String nombreCarpeta, String nombreArchivo, String formatoArchivo) {
		this.nombreArchivo = nombreArchivo;
		this.formatoArchivo = formatoArchivo;
		this.carpetaDir = carpetaDir;
		this.nombreCarpeta = nombreCarpeta;
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

	// Fin Constructor, Setters y Getters.

	public void nuevoDirectorio() {
		File directorio = new File(this.carpetaDir + "/" + this.nombreCarpeta);
		if (!directorio.exists()) {
			directorio.mkdirs();
			System.out.println("Directorio creado exitosamente: " + this.carpetaDir + "/" + this.nombreCarpeta);
		} else {
			System.out.println("No se pudo crear el directorio: ");
			System.out.println("El directorio ya existe.");

		}
	}

	public void nuevoArchivo() {
		File newFile = new File(this.carpetaDir + "/" + nombreCarpeta + "/" + this.nombreArchivo + this.formatoArchivo);
		if (!newFile.exists()) {
			try {
				newFile.createNewFile();
				System.out.println("Archivo Creado exitosamente: " + this.carpetaDir + "/" + nombreCarpeta + "/"
						+ this.nombreArchivo + this.formatoArchivo);

			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("ExeptionError: " + e.getMessage());
			}

		} else {
			System.out.println("No se ha podido crear el archivo: ");
			System.out.println("El archivo ya existe.");
		}
	}

	public void EscrituraArchivo(List<String> lista) {
		File archivo = new File(this.carpetaDir + "/" + nombreCarpeta + "/" + this.nombreArchivo + this.formatoArchivo);

		try (FileWriter fw = new FileWriter(archivo); BufferedWriter bw = new BufferedWriter(fw)) {

			for (String Linea : lista) {
				bw.write(Linea);
				bw.newLine();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
