package org.example;
public class Hospital {
    private Internacao internacao;
    private Consulta consulta;

    public Hospital(FabricaClass fabrica) {
        this.consulta = fabrica.createConsulta();
        this.internacao = fabrica.createInternacao();
    }

    public String emitirInternacao() {
        return this.internacao.emitir();
    }

    public String emitirConsulta() {
        return this.consulta.emitir();
    }

}
