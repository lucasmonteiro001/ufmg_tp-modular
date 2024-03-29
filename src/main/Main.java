package main;
import telefonia.CentralComutacao;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        // write your code here


        CentralComutacao c = new CentralComutacao();

        while(true) {

            Scanner reader = new Scanner(System.in);  // Reading from System.in

            out.println("Entrar como:\n" +
                    "(1) Assinante\n" +
                    "(2) Central Telefônica\n" +
                    "(3) Sistema de Comutação\n" +
                    "(4) Sair");

            Integer modo = reader.nextInt();

            switch (modo) {
                // se for assinante
                case 1:

                    out.println("Digite seu CPF:");
                    String cpf = reader.next();

                    // buscar usuario no sistema

                    // FIXME verificar se o usuario está cadastrado em  alguma central telefonica
                    Boolean usuarioExistente = true;

                    if(!usuarioExistente) {

                        out.println("Assinante não encontrado!");
                        break;
                    }

                    out.println("O que deseja fazer?\n" +
                            "(1) Realizar uma ligação\n" +
                            "(2) Desligar da ligação atual");

                    Integer acao = reader.nextInt();

                    switch (acao) {

                        // realizar uma ligação
                        case 1:
                            out.println("Qual o número para o qual você deseja ligar?");

                            String numero = reader.next();

                            // TODO chamar o método de ligacao da linha telefonica vinculada ao assinate
                            break;
                        // finalizar ligação atual
                        case 2:
                            // TODO chamar o método de finalizar ligação atual
                            break;
                        default:
                            opcaoInvalida();
                    }

                    break;

                // se for uma central telefonica
                case 2:
                    out.println("Digite o ID da Central Telefônica que deseja controlar:");

                    String idCentral = reader.next();

                    // buscar a central telefonica no sistema

                    // FIXME verificar se a central existe

                    Boolean existeCentralTelefonica = true;

                    if(!existeCentralTelefonica) {
                        out.println("Central Telefônica não encontrada!");
                        break;
                    }

                    out.println("O que deseja fazer?\n" +
                            "(1) Adicionar nova linha telefônica\n" +
                            "(2) Excluir linha telefônica\n" +
                            "(3) Suspender funcionamento de linha telefônica");

                    Integer acaoCentralTelefonica = reader.nextInt();

                    switch (acaoCentralTelefonica) {

                        // se for para adicionar uma nova linha telefonica
                        case 1:

                            out.println("Informe os dados do assinante:\n" +
                                    "Nome:");

                            String nomeAssinante = reader.next();

                            out.println("CPF:");

                            String cpfAssinante = reader.next();

                            out.println("Número da nova linha de telefone:");

                            String numeroNovaLinha = reader.next();

                            out.println("Confirma os dados abaixo ?\n" +
                                    "(1) Sim\n" +
                                    "(2) Não\n");
                            out.println("\tNome: " + nomeAssinante + "\n\tCPF: " + cpfAssinante + "\n\tLinha: " +
                                    numeroNovaLinha);

                            Integer opcaoConfirmaCriacaoNovaLinha = reader.nextInt();

                            switch (opcaoConfirmaCriacaoNovaLinha) {

                                // Se deseja realmente criar a linha com os dados inseridos
                                case 1:
                                    // TODO chamar método da Central Telefonica para adicionar uma nova linha passado
                                    // os dados acima

                                    out.println("Linha Telefônica adicionada com sucesso!");
                                    break;
                                // Se não confirma os dados e deseja cancelar o cadastro
                                case 2:
                                    break;
                                default:
                                    opcaoInvalida();
                                    break;
                            }


                            break;

                        // se for para excluir um linha telefonica
                        case 2:

                            out.println("Deseja realizar a exclusão por CPF ou por número da Linha Telefônica?\n" +
                                    "(1) CPF\n" +
                                    "(2) Número da Linha Telefônica\n");

                            Integer modoExclusaoLinhaTelefonica = reader.nextInt();

                            switch (modoExclusaoLinhaTelefonica) {

                                // realizar a exclusao da Linha Telefonica por CPF
                                case 1:

                                    out.println("Digite o número do CPF para suspensão da linha:");

                                    String cpfParaSuspenderLinha = reader.next();

                                    // TODO buscar por assinante com esse cpf
                                    Boolean assinanteExiste = true;

                                    if(!assinanteExiste) {
                                        out.println("Assinante não encontrado");
                                        break;
                                    }

                                    // TODO chamar método para suspender assinante por CPF

                                    break;
                                // realizar a exclusao da Linha Telefonica por Numero da Linha Telefonica
                                case 2:

                                    out.println("Digite o número da Linha Telefônica que será suspensa:");

                                    String numeroLinhaParaSerSuspendida = reader.next();

                                    // TODO buscar por linha com esse numero
                                    Boolean linhaTelefonicaExiste = true;

                                    if(!linhaTelefonicaExiste) {
                                        out.println("Linha Telefônica não encontrada");
                                        break;
                                    }

                                    out.println("Linha suspensa com sucesso!");

                                    // TODO chamar método para excluir linha telefonica por numero (excluir assinante
                                    // tambem)

                                    break;

                                default:
                                    opcaoInvalida();
                                    break;

                            }


                            break;

                        // se for para suspender o funcionamento de uma linha telefonica
                        case 3:

                            out.println("Deseja realizar a suspensão por CPF ou por número da Linha Telefônica?\n" +
                                    "(1) CPF\n" +
                                    "(2) Número da Linha Telefônica\n");

                            Integer modoSuspenderLinhaTelefonica = reader.nextInt();

                            switch (modoSuspenderLinhaTelefonica) {

                                // realizar a exclusao da Linha Telefonica por CPF
                                case 1:

                                    out.println("Digite o número do CPF para suspensão da linha:");

                                    String cpfParaSuspenderLinha = reader.next();

                                    // TODO buscar por assinante com esse cpf
                                    Boolean assinanteExiste = true;

                                    if(!assinanteExiste) {
                                        out.println("Assinante não encontrado");
                                        break;
                                    }

                                    // TODO chamar método para excluir assinante por CPF

                                    break;
                                // realizar a suspensão da Linha Telefonica por Numero da Linha Telefonica
                                case 2:

                                    out.println("Digite o número da Linha Telefônica que será suspensa:");

                                    String numeroLinhaParaSerSuspensa = reader.next();

                                    // TODO buscar por linha com esse numero
                                    Boolean linhaTelefonicaExiste = true;

                                    if(!linhaTelefonicaExiste) {
                                        out.println("Linha Telefônica não encontrada");
                                        break;
                                    }

                                    out.println("Linha suspensa com sucesso!");

                                    // TODO chamar método para excluir linha telefonica por numero (excluir assinante
                                    // tambem)

                                    break;

                                default:
                                    opcaoInvalida();
                                    break;

                            }
                            break;

                        default:
                            opcaoInvalida();
                            break;
                    }

                    break;

                // se for um sistema de comutacao
                case 3:

                    out.println("O que deseja fazer ?\n" +
                            "(1) Adicionar Central Telefônica\n" +
                            "(2) Remover Central Telefônica\n" +
                            "(3) Criar uma Linha de Comunicação entre duas centrais telefônicas\n" +
                            "(4) Remover uma Linha de Comunicação entre duas centrais telefônicas");

                    Integer acaoCentralComutacao = reader.nextInt();

                    switch (acaoCentralComutacao) {

                        // adicionar central telefonica
                        case 1:

                            out.println("Digite o ID da nova Central Telefônica:");

                            Integer idNovaCentralTelefonica = reader.nextInt();

                            // TODO chamar método para criar nova central telefonica e adiciona-la no array em
                            // Central de comutacao

                            break;

                        // excluir central telefonica
                        case 2:

                            out.println("Digite o ID da Central Telefônica que será removida:");

                            Integer idCentralTelefonicaRemover = reader.nextInt();

                            // TODO buscar pela central para ver se existe
                            Boolean existeCentralTel = true;

                            if(!existeCentralTel) {
                                out.println("Central Telefônica não encontrada!");
                                break;
                            }

                            // TODO exclui central telefonica

                            break;

                        // conectar duas centrais telefonicas
                        case 3:

                            out.println("Digite o ID da primeira central telefônica:");

                            String idPrimeiraCentralTelefonica = reader.next();

                            out.println("Digite o ID da segunda central telefônica:");

                            String idSegundaaCentralTelefonica = reader.next();

                            // TODO buscar se as duas centrais telefonicas existem
                            Boolean existePrimeiraCentralTelefonica = true,
                                    existeSegundaCentralTelefonica = true;

                            if(!existePrimeiraCentralTelefonica || !existeSegundaCentralTelefonica) {
                                out.println("Alguma das centrais telefônicas não foi encontrada.");
                                break;
                            }

                            // TODO realizar conexão entre as duas centrains telefonicas via Linha de Comunicação

                            break;

                        // desconectar centrais telefonicas
                        case 4:

                            out.println("Digite o ID da primeira central telefônica:");

                            String idPrimeiraCentralTelefonicaDesconectar = reader.next();

                            out.println("Digite o ID da segunda central telefônica:");

                            String idSegundaaCentralTelefonicaDesconectar = reader.next();

                            // TODO buscar se as duas centrais telefonicas existem
                            Boolean existePrimeiraCentralTelefonicaDesconectar = true,
                                    existeSegundaCentralTelefonicaDesconectar = true;

                            if(!existePrimeiraCentralTelefonicaDesconectar || !existeSegundaCentralTelefonicaDesconectar) {
                                out.println("Alguma das centrais telefônicas não foi encontrada.");
                                break;
                            }

                            // TODO DESCONETAR conexão entre as duas centrains telefonicas via Linha de Comunicação

                            break;

                        default:
                            opcaoInvalida();
                            break;
                    }

                    break;

                // se deseja sair do sistema
                case 4:
                    System.exit(0);
                    break;
                default:
                    opcaoInvalida();
                    break;

            }

            out.println("\n\nObrigado por utilizar nosso sistema!\n\n");

        }
    }

    public static void opcaoInvalida() {

        out.println("Opção inválida!");
    }
}
