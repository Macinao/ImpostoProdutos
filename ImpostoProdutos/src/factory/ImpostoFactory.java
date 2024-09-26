package factory;

import imposto.Imposto;

public abstract class ImpostoFactory {
    public abstract Imposto getImposto(TipoImposto tipo);
}
