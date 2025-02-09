package model;

public enum ModoCafe {

    EXPRESSO("Café Expresso"),
    AMERICANO("Café Americano"),
    PINGADO("Café Pingado");

    private String descricao;

    ModoCafe(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
