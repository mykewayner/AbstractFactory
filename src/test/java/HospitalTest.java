import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HospitalTest {

    @Test
    void emitirReceitaConsulta() {
        FabricaClass fabrica = new FabricaReceita();
        Hospital hospital = new Hospital(fabrica);
        assertEquals("Receita gerada", hospital.emitirConsulta());
    }

    @Test
    void emitirExameConsulta() {
        FabricaClass fabrica = new FabricaExame();
        Hospital hospital = new Hospital(fabrica);
        assertEquals("Exame solicitado", hospital.emitirConsulta());
    }

    @Test
    void emitirReceitaInternacao() {
        FabricaClass fabrica = new FabricaReceita();
        Hospital hospital = new Hospital(fabrica);
        assertEquals("Receita gerada", hospital.emitirInternacao());
    }

    @Test
    void emitirExameInternacao() {
        FabricaClass fabrica = new FabricaExame();
        Hospital hospital = new Hospital(fabrica);
        assertEquals("Exame solicitado", hospital.emitirInternacao());
    }

}