package imposto;

import model.Item;
import model.Produto;

public class PIS implements Imposto{
    @Override
    public double calcular(Item item) {
        if(item instanceof Produto){
            double impostCalculado = item.getValor() * 0.065;
            return impostCalculado;
        }
        System.out.println("Para esse tipo de imposto deve ser Produto");
        return 0;
    }
}
