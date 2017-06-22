import controlador.Logica;
import modelo.Persona;
import util.Ayudante;
import vista.Pantallas;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pantallas vista= new Pantallas();
		Logica controlador=new Logica();
		
		int CantidadPersonas=Ayudante.conversor(vista.IngresarValor("Ingrese Cantidad Personas"));
		
		controlador.inicializarPersonas(CantidadPersonas);
		
		for(int i=0; i< CantidadPersonas;i++){
			controlador.IngresarPersona(i, vista.IngresarValor("Coloque nombre"));
		}
		
		for(int x=0; x<CantidadPersonas;x++){
			
			Persona ekis=controlador.traerPersona(x);
			vista.MostrarMensaje(ekis.getNombre());
		}
		

	}

}
