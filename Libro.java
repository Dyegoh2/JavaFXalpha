
/**
 * Un ejemplo POO para controlar el pr�stamo de las copias de un Libro.
 * 
 * Todos los atributos se declaran con el modificador "protected" (concepto de encapsulamiento).
 * 
 * Para cada uno de los atributos o propiedades b�sicas se crean m�todos
 * GET (para acceder al valor) y SET (para modificar el valor).
 * 
 * Los demas m�todos diferentes a GET/SET corresponde a funcionalidades 
 * espec�ficas de los requerimientos:
 * 
 * Req1: Consultar la cantidad de copias disponibles para prestar.
 * Corresponde a la resta entre numeroDeCopias y numeroDeCopiasPrestadas
 * 
 * Req2: Registrar el pr�stamo de una copia del libro.
 * 
 * Req3: Registrar la devoluci�n de una copia prestada.
 * 
 * Req4: Cambiar la cantidad de copias del libro, evitando inconsistencias.
 * numeroDeCopias no puede ser menor que numeroDeCopiasPrestadas �por qu�?
 * 
 * @author (Milton Jes�s Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Libro
{
    
   /**T�tulo del libro*/
   String titulo;
   
   /**Nombre de la Empresa editorial*/
   String editorial;

   /**Nombre de los autores*/
   String autores;
   
   /**A�o en que fu� impreso el libro*/
   int ano;
   
   /**Cantidad de hojas-p�ginas del libro*/
   int paginas;
   
   /**Valor en que se compr� el libro*/
   int precio;
   
   /**Cantidad de ejemplares-copias del libro*/   
   int cantidad;
   
   /**Cantidad de ejemplares-copias prestados*/
   int prestamos;

   /**M�todo Constructor que inicializa con valores por defecto*/
   public Libro()
   {
     prestamos = 0;
     cantidad = 0;
     precio = 0;
     paginas = 0;
     ano = 0;
       //COMPLETE
   }//Fin constructor default

   /***
    * M�todo Construye que inicializa las propiedades con los par�metros recibidos
    * @param    titulo valor inicial de la propiedad titulo
    * @param    editorial valor inicial de la propiedad editorial
    * @param    autores valor inicial de la propiedad autores
    * @param    a�oEdicion valor inicial de la propiedad a�oEdicion 
    * @param    numeroDePaginas valor inicial de la propiedad numeroDePaginas
    * @param    precio valor inicial de la propiedad precio
    * @param    numeroDeCopias valor inicial de la propiedad numeroDeCopias
    */
   public Libro(int anoEdicion, int numeroDePaginas,int precio, String titulo, String editorial,String autores, int numeroDeCopias)
   {
       this.ano = anoEdicion;
       this.paginas= numeroDePaginas;
       this.precio =precio;
       this.titulo = titulo;
       this.editorial = editorial;
       this.autores = autores;
       this.cantidad =numeroDeCopias;
       //COMPLETE
    }//Fin constructor con par�metros
    
    /**
     * M�todo de acceso a la propiedad titulo
     * @return el valor de titulo para �ste objeto Libro
     */
    public String getTitulo()
    {
       return titulo;//COMPLETE
    }//fin getTitulo

    /***
     * M�todo para modificaci�n de la propiedad titulo
     * @param   titulo el nuevo valor de la propiedad titulo
     */
    public void setTitulo(String titulo)
    {
        this.titulo =titulo;
        //COMPLETE
    }//fin setTitulo
    
    /**
     * M�todo de acceso a la propiedad editorial
     * @return el valor de editorial para �ste objeto Libro
     */
    public String getEditorial()
    {
       return editorial;//COMPLETE
    }//fin getEditorial
    
        /***
     * M�todo para modificaci�n de la propiedad editorial
     * @param   editorial el nuevo valor de la propiedad editorial
     */    
    public void setEditorial(String editorial)
    {
      this.editorial = editorial;//COMPLETE
    }//fin setEditorial
    
    /**
     * M�todo de acceso a la propiedad autores
     * @return el valor de autores para �ste objeto Libro
     */
    public String getAutores()
    {
       return autores;//COMPLETE
    }//fin getAutores
    
    /***
     * M�todo para modificaci�n de la propiedad autores
     * @param   autores el nuevo valor de la propiedad autores
     */ 
    public void setAutores(String autores)
    {
      this.autores = autores;
        //COMPLETE
    }//fin setAutores
        
    /**
     * M�todo de acceso a la propiedad a�oEdicion
     * @return el valor de a�oEdicion para �ste objeto Libro
     */
    public int getAnoEdicion()
    {
      return this.ano;
        //COMPLETE
    }//fin getA�oEdicion

        /***
     * M�todo para modificaci�n de la propiedad a�oEdicion
     * @param   a�oEdicion el nuevo valor de la propiedad a�oEdicion
     */
    public void setAnoEdicion(int anoEdicion)
    {
      this.ano =anoEdicion;//COMPLETE
    }//fin setA�oEdicion
    
    /**
     * M�todo de acceso a la propiedad numeroDePaginas
     * @return el valor de numeroDePaginas para �ste objeto Libro
     */
    public int getNumeroDePaginas()
    {
       return this.paginas;//COMPLETE
    }//fin getNumeroDePaginas

        /***
     * M�todo para modificaci�n de la propiedad numeroDePaginas
     * @param   numeroDePaginas el nuevo valor de la propiedad numeroDePaginas
     */
    public void setNumeroDePaginas(int numeroDePaginas)
    {
       this.paginas= numeroDePaginas;//COMPLETE
    }//fin setNumeroDePaginas
    
    /**
     * M�todo de acceso a la propiedad precio
     * @return el valor de precio para �ste objeto Libro
     */
    public int getPrecio()
    {
       return this.precio;//COMPLETE
    }//fin getPrecio
        
    /***
     * M�todo para modificaci�n de la propiedad precio
     * @param   precio el nuevo valor de la propiedad precio
     */
    public void setPrecio(int precio)
    {
      this.precio = precio;
        //COMPLETE
    }//fin setPrecio
       
    /**
     * M�todo de acceso a la propiedad numeroDeCopias
     * @return el valor de numeroDeCopias para �ste objeto Libro
     */
    public int getNumeroDeCopias()
    {
      return this.cantidad; //COMPLETE
    }//fin getNumeroDeCopias
    
    /**
     * M�todo de acceso a la propiedad numeroDeCopiasPrestadas
     * @return el valor de numeroDeCopiasPrestadas para �ste objeto Libro
     */
    public int getNumeroDeCopiasPrestadas()
    {
      return this.prestamos;//COMPLETE
    }//fin getNumeroDeCopiasPestadas

    /*
     * No hay m�todo SET para numeroDeCopiasPrestadas pues �sta propiedad
     * se modifica al prestar (Req2) y devolver (Req3).
     * No hay m�todo SET para numeroDeCopias, en su lugar el m�todo cambiarNumeroDeCopias (Req4)
    */
    
    /*--- Desde aqu� comienzan los m�todos para satisfacer los Requerimientos---*/
    
    /**
     * Determina la cantidad de copias disponibles para prestar (Req1)
     * @return  la diferencia entre la cantidad de copias y la cantidad de prestamos
     */
    public int getNumeroDeCopiasDisponibles()
    {
        int req1= cantidad-prestamos;
        
        return req1;//COMPLETE
    }//fin getNumeroDeCopiasDisponibles
    
    /***
     * Registra el pr�stamo de una de las copias de este libro (Req2)
     * @return  true si pudo registrar el prestamo, false si no.
     */
    public boolean prestar()
    {
       boolean sePuede = this.getNumeroDeCopiasDisponibles() >0;
       if(sePuede){ 
        this.prestamos++;}
        return sePuede;
            //COMPLETE
    }//fin m�todo prestar

    /***
     * Registra la devoluci�n de una de las copias de este libro (Req3)
     * @return  true si pudo registrar la devoluci�n, false si no.
     */
    public boolean devolver()
    {
        boolean sePuede = this.prestamos>0;
       if(sePuede){ 
        this.prestamos--;
        }
        return sePuede;
        
    }//fin m�todo devolver
    
    /***
     * M�todo para modificaci�n de la propiedad numeroDeCopias. (Req4)
     * Controla que no se reduzca numeroDeCopias a un valor inconsistente:  
     * numeroDeCopias no puede ser menor que numeroDeCopiasPrestadas
     * @param   numeroDeCopias el nuevo valor de la propiedad numeroDeCopias
     * @return true si pudo cambiar el valor, false si no se pudo. 
     */ 
    public boolean cambiarNumeroDeCopias(int numeroDeCopias)
    {
         boolean cambiazo= numeroDeCopias>=this. getNumeroDeCopiasDisponibles();
        return cambiazo;
       //COMPLETE
    }//fin setNumeroDeCopias
    
    /***
     * Regresa una cadena String con los datos del Libro
     * @override java.lang.Object.toString
     */
    public String toString()
    {
      String str = "\n**********Libro**********\n";
      str = str + "Titulo: " + this.getTitulo()+"\n";
      str = str + "Autores: "  + this.getAutores()+"\n";
      str = str + "Editorial: "  + this.getEditorial()+"\n";
      str = str + "A�o: "  + this.getAnoEdicion()+"\n";
      str = str + "Paginas: "  + this.getNumeroDePaginas()+"\n";
      str = str + "Precio: "  + this.getPrecio()+"\n";      
      str = str + "Copias: "  + this.getNumeroDeCopias()+"\n";
      str = str + "Copias Disponibles: "  + this.getNumeroDeCopiasDisponibles()+"\n";
      str = str + "Copias Prestadas: "  + this.getNumeroDeCopiasPrestadas()+"\n";
      return str;
    }
    
}//fin clase Libro