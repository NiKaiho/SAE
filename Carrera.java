class Carrera {

//ATRIBUTOS
      private int clave;
      private String carrera;
  
//CONSTRUCTORES

//METODOS
    /*   public void CapturaCalificaciones() {
         System.out.println("\nCaptura de Calificaciones:\n");
         LeeCalculo();
         LeeGeometria();
         LeeAlgebra();
         LeeProgra();
      }	

      public void Clave() {
         clave = 1000;
         nombre = "Ingenieria en Computacion";
      }

      public void Carrera() {
         geometria = Teclado.LeeEntero("Geometria: ");
      }

      public void LeeAlgebra() {
         algebra = Teclado.LeeEntero("Algebra: ");
      }

      public void LeeProgra() {
         progra = Teclado.LeeEntero("Progamacion Avanzada: ");
      }*/

	public void Listar() {		
		System.out.println("\nClave: "+clave+" "+carrera);
	}

	public void ElegirCarrera() {
		int opcion;
		Menu menu = new Menu();//creo el objeto menu
		//do {
			opcion = menu.ListaMenu("\nElija la Carrera a la que pertenece:"+
            "\n1)Ingenieria en Computacion\n2)Ingenieria Civil\n3)Ingenieria Petrolera\nOpcion: ",3);
		   switch (opcion) {
				case 1:
               clave = 1000;
               carrera = "Ingenieria en Computacion";
				break;

				case 2:
               clave = 2000;
               carrera = "Ingenieria Civil";
				break;

				case 3:
               clave = 3000;
               carrera = "Ingenieria Petrolera";
				break;
				
			//}
		} //while (opcion != 3);
	}
}