package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import model.Cliente;
import model.Conta;

public class ContaDao {
	
	private static final  String sqlInsert = "INSERT INTO conta (num, id, saldo, tipo, deposito_inicial, limite, montante_min, deposito_min) VALUES (?,?,?,?,?,?,?);";
					
	private static final  String sqlUpdate = "UPDATE conta SET cpf = ? , saldoConta = ?, limiteConta = ?, saqueMinimo = ?, depositoMinimo = ?, tipoConta = ? WHERE numeroConta = ?;";
	
	private static final  String sqlDelete = "DELETE FROM conta WHERE numeroConta = ?;";



public static void inserirConta(Conta conta) throws SQLException {

	Connection con = ConnectionFactory.getConnection();
	PreparedStatement stmt = null;
	try {
		stmt = con.prepareStatement(sqlInsert);
		stmt.setString(1, conta.getDono().getCpf());
		stmt.setDouble(2, conta.getSaldo());
		
		if(conta.getTipoConta().equals("CC")) {
			stmt.setString(3, conta.getTipoConta());
			stmt.setDouble(4, conta.getDepositoInicial());
			stmt.setDouble(5, conta.getLimite());
			stmt.setNull(6, java.sql.Types.DOUBLE);
			stmt.setNull(7, java.sql.Types.DOUBLE);
		}
		else {
			stmt.setString(3, conta.getTipoConta());
			stmt.setDouble(4, conta.getDepositoInicial());
			stmt.setNull(5, java.sql.Types.DOUBLE);
			stmt.setDouble(6, conta.getDepositoMinimo());
			stmt.setDouble(7, conta.getSaqueMinimo());
			
		}
		stmt.executeUpdate();

	} finally {
		stmt.close();
		con.close();
	}
	
}

}
