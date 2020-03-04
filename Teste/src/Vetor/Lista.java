package Vetor;

public class Lista {
    int []vetor;
    int cont;
    final int MAX = 5;

    public Lista(){
        this.cont = 0;
        vetor = new int[MAX];
    }

    public void inserir(int valor){
        vetor[cont] = valor;
        cont++;
    }

    public void Listar(){
        for(int i=0; i<MAX; i++){
            System.out.println(vetor[i]);
        }
    }

}