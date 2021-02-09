package pruebasCodigo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import pruebasCodigo.enums.TransaccionType;
import pruebasCodigo.model.Usuario;
import pruebasCodigo.servicio.Cuenta;

public class Ejemplo {
	

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta();
		
		//System.out.println("Balance antes de la transaccion "+cuenta.getBalance());
		TransaccionType.COMPRAR.doTransacionOperation(BigDecimal.valueOf(100), cuenta);
		//System.out.println("Balance despues de la transaccion "+cuenta.getBalance());
		
		
		Usuario user = new Usuario(1L, "edilson", "Arias", 27);
		
		Object object = user;
		
		System.out.println("==== Java: "+user.getNombre());
		System.out.println("==== Class: "+user.getApellido());
		
		Usuario userDos = (Usuario) object;
        
		System.out.println("==== Convert: "+userDos.getNombre());
		
	}
	
}
