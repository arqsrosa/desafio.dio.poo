import desafio.dio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição em Mentoria de Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devSilvia = new Dev();
        devSilvia.setNome("Silvia");
        devSilvia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Silvia" + devSilvia.getConteudosInscritos());
        devSilvia.progredir();
        devSilvia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Silvia" + devSilvia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Silvia" + devSilvia.getConteudosConcluidos());
        System.out.println("XP:" + devSilvia.calcularXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devSilvia.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularXp());
    }
}
