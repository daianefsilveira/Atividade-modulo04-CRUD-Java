package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Passagens;
import model.Pessoas;

public class DAO {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://127.0.0.1:3306/agenciadeviagem";
	private static String user = "root";
	private static String password = "Gohan21bolinha/";

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public void test() {
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** CRUD CREATE **/
	
	public void inserirPassagem(Passagens passagem) {
		String create = "insert into passagens (origem, destino, trecho, dataIda, dataVolta, qtdPassageiros) values (?,?,?,?,?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			// pst.setInt(1, cadastro.getCodPassagens());
			pst.setString(1, passagem.getOrigem());
			pst.setString(2, passagem.getDestino());
			pst.setString(3, passagem.getTrecho());
			pst.setString(4, passagem.getDataIda());
			pst.setString(5, passagem.getDataVolta());
			pst.setInt(6, passagem.getQtdPassageiros());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void inserirCadastro(Pessoas cadastro) {
		String create = "insert into pessoas (nome, cpf) values (?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			// pst.setInt(1, cadastro.getCodPessoa());
			pst.setString(1, cadastro.getNome());
			pst.setString(2, cadastro.getCpf());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** CRUD READ **/
	
	public ArrayList<Passagens> listarPassagem() {
		ArrayList<Passagens> passagens = new ArrayList<>();
		String read = "select * from passagens order by codPassagens";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int codPassagens = rs.getInt(1);
				String origem = rs.getString(2);
				String destino = rs.getString(3);
				String trecho = rs.getString(4);
				String dataIda = rs.getString(5);
				String dataVolta = rs.getString(6);
				int qtdPassageiros = rs.getInt(7);
				passagens.add(new Passagens(codPassagens, origem, destino, trecho, dataIda, dataVolta, qtdPassageiros));
			}
			con.close();
			return passagens;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public ArrayList<Pessoas> listarCadastro() {
		ArrayList<Pessoas> cadastros = new ArrayList<>();
		String read = "select * from pessoas order by nome";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int codPessoa = rs.getInt(1);
				String nome = rs.getString(2);
				String cpf = rs.getString(3);
				cadastros.add(new Pessoas(codPessoa, nome, cpf));
			}
			con.close();
			return cadastros;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/** CRUD UPDATE **/
	
	public void selecionarPassagem(Passagens passagem) {
		String read2 = "select * from passagens where codPassagens=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setInt(1, passagem.getCodPassagens());
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				passagem.setCodPassagens(rs.getInt(1));
				passagem.setOrigem(rs.getString(2));
				passagem.setDestino(rs.getString(3));
				passagem.setTrecho(rs.getString(4));
				passagem.setDataIda(rs.getString(5));
				passagem.setDataVolta(rs.getString(6));
				passagem.setQtdPassageiros(rs.getInt(7));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void selecionarCadastro(Pessoas cadastro) {
		String read2 = "select * from pessoas where codPessoa=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read2);
			pst.setInt(1, cadastro.getCodPessoa()); 
			ResultSet rs = pst.executeQuery(); 
			while (rs.next()) {
				cadastro.setCodPessoa(rs.getInt(1));
				cadastro.setNome(rs.getString(2));
				cadastro.setCpf(rs.getString(3));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** CRUD EDIT **/
	
	public void alterarPassagem(Passagens passagem) {
		String update = "update passagens set origem=?, destino=?, trecho=?, dataIda=?, dataVolta=?, qtdPassageiros=? where codPassagens=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, passagem.getOrigem());
			pst.setString(2, passagem.getDestino());
			pst.setString(3, passagem.getTrecho());
			pst.setString(4, passagem.getDataIda());
			pst.setString(5, passagem.getDataVolta());
			pst.setInt(6, passagem.getQtdPassageiros());
			pst.setInt(7, passagem.getCodPassagens());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void alterarCadastro(Pessoas cadastro) {
		String update = "update pessoas set nome=?,cpf=? where codPessoa=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, cadastro.getNome());
			pst.setString(2, cadastro.getCpf());
			pst.setInt(3, cadastro.getCodPessoa());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** CRUD DELETE **/
	
	public void deletarPassagem(Passagens passagem) {
		String delete = "delete from passagens where codPassagens=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setInt(1, passagem.getCodPassagens());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deletarCadastro(Pessoas cadastro) {
		String delete = "delete from pessoas where codPessoa=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setInt(1, cadastro.getCodPessoa());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
