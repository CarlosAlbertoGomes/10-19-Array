package herancaPolimorfismoOverride;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TesteCursosLivres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean sistema = true;
        int opcao;
        String cursoLista, cursoEdicao;
        List<String> menu = new ArrayList<String>();

        while (sistema) {
            System.out.println("******** Escolha uma opção no menu abaixo ********");
            System.out.println("***************************************************");
            System.out.println("********** 1 - Adicionar um novo curso   ***********");
            System.out.println("********** 2 - Remover um curso da lista ***********");
            System.out.println("******* 3 - Exibir todos os cursos da lista ********");
            System.out.println("********** 4 - Editar um curso da lista ************");
            System.out.println("************** 0 - Sair do sistema ****************");
            System.out.println("***************************************************");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("opção 1");
                    System.out.println("Digite o nome do curso que deseja cadastrar: \n");
                    cursoLista = entrada.next();
                    menu.add(cursoLista);
                    System.out.println("O curso " + cursoLista + " foi adicionado ao menu");
                }
                case 2 -> {
                    System.out.println("opção 2");
                    System.out.println("Digite o nome do curso que deseja apagar do menu");
                    cursoLista = entrada.next();
                    menu.remove(cursoLista);
                    System.out.println("O curso " + cursoLista + " foi removido do menu");
                }
                case 3 -> {
                    System.out.println("opção 3");
                    System.out.println("Os cursos que estão no menu: \n" + menu);
                }
                case 4 -> {
                    System.out.println("opção 4");
                    System.out.println("Digite o nome do curso que deseja alterar");
                    cursoLista = entrada.next();
                    System.out.println("Agora digite o novo nome do curso");
                    cursoEdicao = entrada.next();
                    menu.set(menu.indexOf(cursoLista), cursoEdicao);
                    System.out.println("O curso " + cursoLista + " foi modificado para " + cursoEdicao);
                }
                case 0 -> {
                    System.out.println("Saindo do sistema");
                    sistema = false;
                }
            }
        }
    }
}
