import factory.ConcretFactoryImposto;
import factory.ImpostoFactory;
import factory.TipoImposto;
import imposto.Imposto;
import model.Item;
import model.Produto;
import model.Servico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ImpostoFactory impostoFactory = new ConcretFactoryImposto();
        Imposto ICMS = impostoFactory.getImposto(TipoImposto.TIPOICMS);
        Imposto IPI = impostoFactory.getImposto(TipoImposto.TIPOIPI);
        Imposto ISS = impostoFactory.getImposto(TipoImposto.TIPOISS);
        Imposto PIS = impostoFactory.getImposto(TipoImposto.TIPOPIS);

        ArrayList<Item> lista = new ArrayList<>();

        Produto cafe = new Produto();
        cafe.setCodigo(34235234);
        cafe.setDescricao("Cafe arabico");
        cafe.setValor(18);
        cafe.setIndustrial(false);
        cafe.setImpostoCalculado(ICMS.calcular(cafe));
        cafe.setTotal();
        lista.add(cafe);

        Produto chaveInglesa = new Produto();
        chaveInglesa.setCodigo(26634532);
        chaveInglesa.setDescricao("Chave da inglaterra");
        chaveInglesa.setValor(30);
        chaveInglesa.setIndustrial(true);
        chaveInglesa.setImpostoCalculado(IPI.calcular(chaveInglesa));
        chaveInglesa.setTotal();
        lista.add(chaveInglesa);

        Servico entrega = new Servico();
        entrega.setCodigo(43425564);
        entrega.setDescricao("Entrega em residencia");
        entrega.setValor(12);
        entrega.setImpostoCalculado(ISS.calcular(entrega));
        entrega.setTotal();
        lista.add(entrega);

        Produto arroz = new Produto();
        arroz.setCodigo(43255342);
        arroz.setDescricao("arroz vermelho");
        arroz.setValor(8);
        arroz.setIndustrial(false);
        arroz.setImpostoCalculado(PIS.calcular(arroz));
        arroz.setTotal();
        lista.add(arroz);

        double totalProduto = 0;
        double totalServico = 0;
        double total = 0;

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
            total += lista.get(i).getTotal();
            if(lista.get(i) instanceof Produto){
                totalProduto += lista.get(i).getImpostoCalculado();
            }if(lista.get(i) instanceof Servico){
                totalServico += lista.get(i).getImpostoCalculado();
            }
        }
        String totalFormatado = String.format("%.2f", total);
        System.out.println("Valo total dos itens: "+totalFormatado);
        String totalProdutoFormatado = String.format("%.2f", totalProduto);
        System.out.println("Valo total dos impostos dos produtos: "+totalProdutoFormatado);
        String totalServicoFormatado = String.format("%.2f", totalServico);
        System.out.println("Valo total dos impostos dos servicos: "+totalServicoFormatado);
    }
}
