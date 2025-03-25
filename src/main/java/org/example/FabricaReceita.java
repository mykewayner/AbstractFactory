package org.example;
public class FabricaReceita implements FabricaClass {
    @Override
    public Internacao createInternacao() {
        return new InternacaoReceita();
    }

    @Override
    public Consulta createConsulta() {
        return new ConsultaReceita();
    }


}
