package app;

import Connection.ConnectionDAO;

public class Main {
    public static void main(String[] args) {
        new ConnectionDAO().criarTabela();
        new ConnectionDAO().inserir("Matheus", "matheus@gmail.com");
    }
}