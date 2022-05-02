
import fatec.poo.model.Palestra;
import fatec.poo.model.Palestrante;
import fatec.poo.model.Participante;

/**
 *
 * @author cassio
 */
public class Aplic {


    public static void main(String[] args) {
        Palestrante palestrante = new Palestrante("123.456.789-11", "Carlos Silva", 75);
        palestrante.setAreaAtuacao("Segurança em Redes de Computadores");

        Palestra palestra = new Palestra("15/06/2020", "Segurança Corporativa");
        palestra.setLocal("Auditório Carlos Penha");
        palestra.setValor(600);
        palestrante.setPalestra(palestra);
        palestra.setPalestrante(palestrante);


        
        
        Participante participante1 = new Participante("121.121.121-22", "Ana Beatriz", 1);
        participante1.setEscolaridade("Ensino Médio");
        Participante participante2 = new Participante("131.131.131-33", "Fabio Souza", 2);
        participante2.setEscolaridade("Ensino Médio");
        Participante participante3 = new Participante("141.141.141-44", "Marcos Silva", 3);
        participante3.setEscolaridade("Ensino Superior");

        palestrante.listarPalestras();
        
        palestra.emitirListaParticipantes();
    }
    
}
