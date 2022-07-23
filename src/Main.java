import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Turmas turmas1 = new Turmas("5? ano A");
        Turmas turmas2 = new Turmas("6? ano B");
        Turmas turmas3 = new Turmas("7? ano C");
        Turmas turmas4 = new Turmas("8? ano D");


        Estagiario estagiario1 = new Estagiario("Jhonatan", "098.546.321 - 21",
                "089.345.214 - 34", "Atendente - RJ", "Mestrado",
                "Filosofia", 200, 15, 1000, 500);
                estagiario1.adicionarTurma(turmas3.getNome());
        System.out.println(estagiario1.toString());
        estagiario1.reembolso();
        System.out.println();


        Estagiario estagiario2 = new Estagiario("Lucas", "123.656.444 - 22",
                "768.123.567 - 21", "Secretária da educação - RJ", "Bacharelado",
                "Sociologia", 350, 10, 900, 200);
        estagiario2.adicionarTurma(turmas4.getNome());
        System.out.println(estagiario2.toString());
        estagiario2.reembolso();
        System.out.println();

        Professor professor1 = new Professor("Luiz", "567.234.765 - 21",
                "456.789.412 - 21", "Secretaria de Educação RJ", 8000,
                "Doutor em Portugues", "Português", 100, 5,1,1500.0);

        professor1.adicionarTurma(turmas1.getNome());
        professor1.adicionarEstagiario(estagiario1.getNome());
        System.out.println(professor1.toString());
        professor1.aumentoDeSalario();
        professor1.reembolsoDespesas();
        System.out.println();


        Professor professor2 = new Professor("Mattheus", "789.765.345 - 56",
                "098.789.567 - 78", "Diretor - RJ", 3000,
                "Doutor em Literatura", "Literatura", 125, 6,3,4000.0);

        professor2.adicionarTurma(turmas2.getNome());
        professor2.adicionarEstagiario(estagiario2.getNome());
        System.out.println(professor2.toString());
        professor2.aumentoDeSalario();
        professor2.reembolsoDespesas();
        System.out.println();


        Coordenadores coordenadores1 = new Coordenadores("Gesilda", "678.453.897 - 12",
                "789.761.312 - 20", "Secretaria de Educação RJ", 3000, 2000);
        coordenadores1.adiconarProfessor(professor1.getNome());
        System.out.println(coordenadores1.toString());
        coordenadores1.aumentoDeSalario();
        coordenadores1.reembolsoDespesas();
        System.out.println();

        Coordenadores coordenadores2 = new Coordenadores("Vittória", "435.213.098 - 21",
                "986.321.500 - 44", "Secretaria da Educação - BA", 3000,5000);
        coordenadores2.adiconarProfessor(professor2.getNome());
        System.out.println(coordenadores2.toString());
        coordenadores2.aumentoDeSalario();
        coordenadores2.reembolsoDespesas();
        System.out.println();




        FuncionariosAdministrativos funcionariosAdministrativos1 = new FuncionariosAdministrativos("Milena",
                "500.809.321 - 21", "111.764.095 - 11", "Secretaria de educação - BA",
                1000, "Organização", "1 anos de experiência",1500);

        System.out.println(funcionariosAdministrativos1.toString());
        funcionariosAdministrativos1.aumentoDeSalario();
        funcionariosAdministrativos1.reembolsoDespesas();
        System.out.println();

        FuncionariosAdministrativos funcionariosAdministrativos2 = new FuncionariosAdministrativos("Iara",
                "765.798.321 - 34", "111.765.313 - 56", "Secretaria de educação - DF",
                2000, "Organização", "8 anos de experiência",5000);

        System.out.println(funcionariosAdministrativos2.toString());
        funcionariosAdministrativos2.aumentoDeSalario();
        funcionariosAdministrativos2.reembolsoDespesas();
        System.out.println();

    }

}
