public class AplicacaoAnnotation {

    @AnnotationExecutar(arg = "teste annotation 1 ")
    public void a1 (String s){
        System.out.println("Método a1 chamado: " + s);
    }
    public void a2 (String s){
        System.out.println("Método a2 chamado: " + s);
    }
    @AnnotationExecutar(arg = "teste annotation 3 ")
    public void a3 (String s){
        System.out.println("Método a3 chamado: " + s);
    }
}
