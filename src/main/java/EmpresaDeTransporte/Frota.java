package EmpresaDeTransporte;
import java.util.ArrayList;
import java.util.Scanner;

public class Frota {
    public static void main(String[] args) {

        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do {

            System.out.println("1)Adicionar veiculo");
            System.out.println("2)Consultar veiculos");
            System.out.println("3)Simular valor de viagem");
            System.out.println("4) Realizar manutencao");
            System.out.println("5) Sair");
            System.out.println("R: ");
            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1:
                    System.out.println("Selecione o tipo de veiculo\n1)Onibus\n2)Carro\n3)Caminhao\nR: ");
                    int tipoSelecionado = sc.nextInt();
                    sc.nextLine();
                    try {
                        switch (tipoSelecionado) {
                            case 1:
                                System.out.println("Digite a placa do onibus: ");
                                String placaOnibus = sc.nextLine();
                                System.out.println("Digite o modelo do onibus:");
                                String modeloOnibus = sc.nextLine();
                                Onibus onibus = new Onibus(placaOnibus, modeloOnibus);
                                listaVeiculos.add(onibus);
                                break;
                            case 2:
                                System.out.println("Digite a placa do carro: ");
                                String placaCarro = sc.nextLine();
                                System.out.println("Digite o modelo do carro:");
                                String modeloCarro = sc.nextLine();
                                Carro carro = new Carro(placaCarro, modeloCarro);
                                listaVeiculos.add(carro);
                                break;
                            case 3:
                                System.out.println("Digite a placa do Caminhao: ");
                                String placaCaminhao = sc.nextLine();
                                System.out.println("Digite o modelo do caminhao:");
                                String modeloCaminhao = sc.nextLine();
                                Caminhao caminhao = new Caminhao(placaCaminhao, modeloCaminhao);
                                listaVeiculos.add(caminhao);
                                break;

                            default:
                                System.out.println("Opcao invalida.");
                                break;
                        }
                        break;
                    } catch(PlacaInvalidaException e) {
                        System.out.println(e.getMessage());
                    }

                case 2:
                    int i = 1;
                    for(Veiculo veiculo : listaVeiculos) {
                        System.out.println("Veiculo " + i);
                        System.out.println("Modelo: " + veiculo.getModelo());
                        System.out.println("Placa: " + veiculo.getPlaca());
                        System.out.println("\n");
                        i++;
                    }
                    break;

                case 3:
                    System.out.println("Digite a placa do veiculo em que deseja simular uma viagem: ");
                    String placaSimulado = sc.nextLine();

                    for(Veiculo veiculo : listaVeiculos) {
                        if (veiculo.getPlaca().equals(placaSimulado.trim())){
                            System.out.println("Digite a distancia a ser percorrida: ");
                            double distancia = sc.nextDouble();
                            sc.nextLine();

                            if (veiculo.getPlaca().equals(placaSimulado.trim())){
                                if (veiculo.getClass() == Carro.class) {
                                    System.out.println("Custo total da viagem: " + ((Carro) veiculo).calcularCustoViagem(distancia));
                                } else if (veiculo.getClass() == Caminhao.class) {
                                    System.out.println("Custo total da viagem: " + ((Caminhao) veiculo).calcularCustoViagem(distancia));
                                } else if (veiculo.getClass() == Onibus.class) {
                                    System.out.println("Custo total da viagem: " + ((Onibus) veiculo).calcularCustoViagem(distancia));
                                }

                            } else {
                                System.out.println("Veiculo nao encontrado.");
                            }

                        } else {
                            System.out.println("Veiculo nao encontrado.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Digite a placa do veiculo que ira para manutencao: ");
                    String placaManutencao = sc.nextLine();

                    for (Veiculo veiculo : listaVeiculos) {
                        if (veiculo.getPlaca().equals(placaManutencao.trim())){
                            if (veiculo.getClass() == Carro.class) {
                                System.out.println(((Carro) veiculo).realizarManutencao());
                            } else if (veiculo.getClass() == Caminhao.class) {
                                System.out.println(((Caminhao) veiculo).realizarManutencao());
                            } else if (veiculo.getClass() == Onibus.class) {
                                System.out.println(((Onibus) veiculo).realizarManutencao());
                            }

                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }

        } while (op != 5);
    }
}
