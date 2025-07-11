package decorator;

public class Ketchup extends IngredienteDecorator {
    public Ketchup() {
        super(null);
    }

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente);
    }

    @Override
    public String imprimeIngrediente() {
        return "Ketchup, " + this.ingrediente.imprimeIngrediente();
    }

    @Override
    public double valorDoIngrediente() {
        return 1.00 + (ingrediente != null ? ingrediente.valorDoIngrediente() : 0);
    }
}
