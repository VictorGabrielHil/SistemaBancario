package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cliente;

public class ClienteDao {

	private static final String sqlInsert = "INSERT INTO cliente (cpf, nome, sobrenome, rg, endereco) VALUES (?,?,?,?,?);";

	private static final String sqlUpdate = "UPDATE cliente SET cpf = ?, "
			+ "nome = ?, sobrenome = ?, rg = ?, endereco = ? WHERE id = ?; ";

	private static final String sqlDelete = "DELETE FROM cliente WHERE id = ?;";

	private static final String sqlGetById = "SELECT id, cpf, nome, sobrenome, "
			+ "rg, endereco FROM cliente WHERE id = ?;";

	private static final String sqlGetByCpf = "SELECT id, cpf, nome, sobrenome,"
			+ " rg, endereco FROM cliente WHERE cpf = ?;";

	private static final String sqlList = "SELECT id, cpf, nome, sobrenome, rg, " + "endereco FROM cliente;";

	private static final String sqlIsCpfAvailable = "SELECT cpf FROM cliente " + "WHERE cpf = ?";

	private static final String sqlIsRgAvailable = "SELECT rg FROM cliente " + "WHERE rg = ?";

	public static void inserirCliente(Cliente cliente) throws SQLException {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(sqlInsert);
			stmt.setString(1, cliente.getCpf());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getSobreNome());
			stmt.setString(4, cliente.getRg());
			stmt.setString(5, cliente.getEndereco());
			stmt.executeUpdate();

		} finally {
			stmt.close();
			con.close();
		}
	}

	public static void updateCliente(Cliente cliente, int idCliente) throws SQLException {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(sqlUpdate);
			stmt.setString(1, cliente.getCpf());
			stmt.setString(2, cliente.getNome());
			stmt.setString(3, cliente.getSobreNome());
			stmt.setString(4, cliente.getRg());
			stmt.setString(5, cliente.getEndereco());
			stmt.setInt(6, idCliente);
			stmt.executeUpdate();

		} finally {
			stmt.close();
			con.close();
		}

	}
	
	public static void deleteCliente(Cliente cliente, int idCliente) throws SQLException {

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(sqlDelete);
			stmt.setInt(1, idCliente);
			stmt.executeUpdate();

		} finally {
			stmt.close();
			con.close();
		}

	}

}
