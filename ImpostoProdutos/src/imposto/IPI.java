package imposto;

import model.Item;
import model.Produto;

public class IPI implements Imposto{
    @Override
    public double calcular(Item item) {
        if(item instanceof Produto && ((Produto) item).isIndustrial()){
            double impostCalculado = item.getValor() * 0.12;
            return impostCalculado;
        }
        System.out.println("Para esse tipo de imposto deve ser Produto e deve ser industrial");
        return 0;
    }
}
