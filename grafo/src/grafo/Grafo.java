package grafo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Grafo {

    private boolean[][] matriz;
    private int numVertices;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        this.matriz = new boolean[numVertices][numVertices];
    }

    // métodos da classe
    public void construir(boolean aleatorio) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();

        try {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    boolean adjacencia = false;

                    if (aleatorio) {
                        adjacencia = random.nextBoolean();
                    } else {
                        System.out.print("Existe aresta entre " + i + " e " + j + "? (s/n): ");
                        String entrada = reader.readLine();
                        if (entrada != null) {
                            entrada = entrada.trim().toLowerCase();
                            adjacencia = entrada.equals("s") || entrada.equals("sim") || entrada.equals("true") || entrada.equals("1");
                        }
                    }

                    matriz[i][j] = adjacencia;
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler a entrada pelo BufferedReader: " + e.getMessage());
        }
    }

    private boolean procurarPercursoRecursivo(boolean[] visitado, int inicio, int fim) {
        if (inicio == fim) return true;

        visitado[inicio] = true;
        for (int vizinho = 0; vizinho < matriz.length; vizinho++) {
            if ((matriz[inicio][vizinho]) && (!visitado[vizinho])) {
                if (procurarPercursoRecursivo(visitado, vizinho, fim)) {
                    System.out.print(vizinho + " <- ");
                    return true;
                }
            }
        }

        return false;
    }

    public void procurarPercurso(int inicio, int fim) {
        if (inicio < 0 || inicio >= numVertices || fim < 0 || fim >= numVertices) {
            System.out.println("Vértice inválido! Informe valores entre 0 e " + (numVertices - 1) + ".");
            return;
        }

        if (procurarPercursoRecursivo(new boolean[matriz.length], inicio, fim)) {
            System.out.println(inicio);
        } else {
            System.out.println("NÃO HÁ caminho entre esses vértices!");
        }
    }

    public void exibirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print((matriz[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }}
