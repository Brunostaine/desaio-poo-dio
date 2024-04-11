import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();

        curso3.setTitulo("Curso Node");
        curso3.setDescricao("Descrição curso node");
        curso3.setCargaHoraria(6);

//        System.out.println(curso1);
//        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria Node");
        mentoria2.setDescricao("Descricao mentoria node");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp node developer");
        bootcamp2.setDescricao("Descrição bootcamp node developer");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(mentoria2);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");

        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Bruno: " + devBruno.getConteudosInscritos());
        devBruno.progredir();
        System.out.println("Conteudos incritos Bruno: " + devBruno.getConteudosInscritos());
        System.out.println("Conteudos concluidos Bruno: " + devBruno.getConteudosConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXp());


        System.out.println("----------");

        Dev devAna = new Dev();
        devAna.setNome("Ana");

        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos Ana: " + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("Conteudos incritos Ana: " + devAna.getConteudosInscritos());
        System.out.println("Conteudos incritos Ana: " + devAna.getConteudosConcluidos());
        System.out.println("XP: " + devAna.calcularTotalXp());

        System.out.println("----------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp2);
        System.out.println("Conteudos incritos João: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        devJoao.progredir();
        System.out.println("Conteudos incritos João: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        devJoao.progredir();
        System.out.println("Conteudos incritos João: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}