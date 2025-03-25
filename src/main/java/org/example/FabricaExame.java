package org.example;
public class FabricaExame implements FabricaClass {
    @Override
    public Internacao createInternacao() {
        return new InternacaoExame();
    }

    @Override
    public Consulta createConsulta() {
        return new ConsultaExame();
    }
}
