/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Charly Cimino
 */

/*
Con @Retention indicamos qué tratamiento de retención queremos que el compilador
le de a la anotación. Las opciones son:
    • RetentionPolicy.CLASS, el compilador almacenará la anotación en el .class,
    pero esta no será retenida por la máquina virtual durante el tiempo de ejecución. 
    • RetentionPolicy.RUNTIME, ídem, pero, en este caso, la anotación estará disponible 
    durante el tiempo de ejecución y podrá ser leída por reflection.
    • RetencionPolicy.SOURCE, indica que la anotación es solo descriptiva por lo que
    será descartada durante el tiempo de compilación.
*/

/*
Con @Target, indicamos en qué sección del código fuente podrá ser
aplicada esta anotación. Algunas de las opciones son:
• ElementType.TYPE
• ElementType.FIELD
• ElementType.CONSTRUCTOR
• ElementType.METHOD
*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface HolaMundo {
    String nombre();
}
