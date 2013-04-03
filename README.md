Laboratorio de ProgramaciÃ³n y Lenguajes. Universidad Nacional de Tierra del Fuego (Probando los commits!)

TP NÂº1 Patrones
==============================================


Se adjunta un proyecto netbeans con los package a usar en el trabajo.


1 -  Dentro del package â€œar.edu.untdf.labprog.tp1.ejer1â€� se definen 3 clases, referentes a conexiones sql a diferentes servidores de base de datos. La clase Sql hace uso de estas conexiones para ejecutar querys. Se requiere independizar la lÃ³gica de la clase Sql del tipo de base de datos a utilizar, para esto utilizar el patrÃ³n â€œFactory Methodâ€�.  Escriba las clases refactorizadas en un package con nombre â€œar.edu.untdf.labprog.tp1.ejer1.solâ€�.


2 -  Dentro del package â€œar.edu.untdf.labprog.tp1.ejer2â€� hay una clase mssql, agregue la posibilidad de utilizar Ms Sql a la soluciÃ³n del ejercicio 1, utilizando la clase mssql como driver pero sin modificarla. Utilice el patrÃ³n adapter.

3 â€“ Nombre algÃºn Framework en java que utilice el patrÃ³n decorator, explique para que funcionalidad y como es utilizado el patrÃ³n.       
 

4 â€“ El â€œar.edu.untdf.labprog.tp1.ejer4â€�  contiene una clase ListaInt, implementa una lista de enteros y la ordenaciÃ³n por los algoritmos quicksort y mergesort. Refactorice el cÃ³digo utilizando el patrÃ³n strategy  de manera que se pueda utilizar la clase ListaInt independientemente del algoritmo de bÃºsqueda a utilizar.

5 â€“ Implemente el mÃ©todo bÃºsqueda en la clase ListaInt  de manera independiente al algoritmo a usar utilizando el patrÃ³n strategy,  implemente la estrategia de bÃºsqueda binaria y la estrategia de bÃºsqueda secuencial a partir de la implementaciÃ³n dada en la pÃ¡gina http://www.vogella.de/articles/JavaAlgorithmsSearch/article.html#binarysearch  .

6 -  El package â€œar.edu.untdf.labprog.tp1.ejer6â€�  contiene una simulaciÃ³n del protocolo ftp, se implementan los siguiente comandos:  checkUser (chequea usuario), checkPass(chequea la clave), getFile (toma un archivo del ftp) y close (cierra la conexiÃ³n),  el comportamiento de lo  comandos son dependientes del estado en que se encuentra el ftp. Refactorice el cÃ³digo utilizando el patrÃ³n state. 

7 â€“ En que se diferencia el patrÃ³n state del patrÃ³n strategy? 

8 â€“ Explique como se utiliza el patrÃ³n strategy en la implementaciÃ³n del LayoutManager del  api de java.

9 -  En el package â€œar.edu.untdf.labprog.tp1.ejer9â€� va a encontrar una clase Validador  que extiende un JFrame, en el formulario hay 2 campos de tipo string, uno para documento y otro para email. 
Implemente una clase FieldValidator con un mÃ©todo validate()  que imprima si la validaciÃ³n es valida en la salida estÃ¡ndar. Implemente un mÃ©todo isValid() para los diferentes tipos de campos usando el patrÃ³n strategy .     

10 â€“ Agregue a la soluciÃ³n del ejercicio anterior la validaciÃ³n para un campo texto que contenga una provincia argentina valida. No debe modificar la clase FieldValidator.


