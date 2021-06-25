package reflection;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Demo {

    @HolaMundo(nombre = "Carlos")
    public void unMetodo() {
        System.out.println("Este es un metodo...");
    }
    
    @HolaMundo
    public void otroMetodo() {
        System.out.println("Este es un metodo...");
    }
}
