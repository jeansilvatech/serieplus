import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;


public class manipulaserie {
	conexaoserie con=new conexaoserie();
	public void inserir(String nome,String temporada,String episodio)
	{
		String comandoSQL="insert into serie(nome,temporada,episodio)values(?,?,?)";
		PreparedStatement prepara=null;
		try
		{
			prepara=con.getConexao().prepareStatement(comandoSQL);
			prepara.setString(1, nome);
			prepara.setString(2,temporada);
			prepara.setString(3,episodio);
			prepara.execute();
			JOptionPane.showMessageDialog(null, "Dados Salvos com sucesso");
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}

	public void editar(String nomenovo,String temporada,String episodio, String nomeantigo)
	{
		String comandoSQL="update serie set Nome=?,temporada=?,episodio=? where Nome=?";
		PreparedStatement prepara=null;
		try
		{
			prepara=con.getConexao().prepareStatement(comandoSQL);
			prepara.setString(1,nomenovo);
			prepara.setString(2,temporada);
			prepara.setString(3,episodio);
			prepara.setString(4,nomeantigo);
			prepara.execute();
		}
		catch(Exception a)
		{
			JOptionPane.showMessageDialog(null, a.getMessage());
		}
	}
	
	public ResultSet listagem(){
		ResultSet resultado=null;
		String comandoSQL="select * from serie";
		PreparedStatement prepara=null;
		try
		{
			prepara=con.getConexao().prepareStatement(comandoSQL);
			resultado=prepara.executeQuery();
			
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}	
		
		return resultado;		
	}

	public ResultSet listagemarrow()
	{
		ResultSet resultado1=null;
		String comandoSQL="select Episodio from serie where Nome='Arrow'";
		PreparedStatement prepara=null;
		try
		{
			prepara=con.getConexao().prepareStatement(comandoSQL);
			resultado1=prepara.executeQuery();
			
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}	
		
		return resultado1;		
	}
	
}
