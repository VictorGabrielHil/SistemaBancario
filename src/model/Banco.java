package model;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import dao.ClienteDao;
import dao.ConnectionFactory;

public class Banco {

    public static void main(String[] args) throws SQLException {
    	
        Scanner scanner = new Scanner(System.in);
    	
        Cliente cliente = new Cliente();
        System.out.println("Digite o nome do cliente");
        cliente.setNome("Victor");
        System.out.println("Digite o sobrenome do cliente");
        cliente.setSobreNome("Gabriel");
        System.out.println("Digite o cpf do cliente");
        cliente.setCpf("1288888");
        System.out.println("Digite o endereço do cliente");
        cliente.setEndereco("Rua Lanches");
        System.out.println("Digite o RG do cliente");
        cliente.setRg("111111");

        ClienteDao.deleteCliente(cliente,1);
        
        
    }
}
