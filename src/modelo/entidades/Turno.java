
package modelo.entidades;

public enum Turno {
    
    M("Manhã")
    ,T("Tarde")
    ,N("Noite");
    
    private String descricao;

//Metodo Construtor
        private Turno(String descricao)
    {
        this.descricao = descricao;
    }
    
//Set&Get
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
}
