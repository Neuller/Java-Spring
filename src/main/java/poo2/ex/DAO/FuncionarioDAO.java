package poo2.ex.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import poo2.ex.Beans.FuncionarioBeans;
import poo2.ex.Utilitarios.Conexao;

public class FuncionarioDAO {
    public static void AdicionarFuncionario(FuncionarioBeans Funcionario) throws SQLException{
        Connection con = Conexao.getConnection();
        //System.out.println("Conectado com Sucesso");
        String sql = "insert into Funcionario" + "(Nome), (Sobrenome), (Cargo), (Salario)" + "values (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, Funcionario.getNome());
        stmt.setString(2, Funcionario.getSobrenome());
        stmt.setString(3, Funcionario.getCargo());
        stmt.setInt(4, Funcionario.getSalario());

        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public static List<FuncionarioBeans> buscarFuncionario() throws SQLException{
        Connection con = Conexao.getConnection();
        //System.out.println("Conectado com Sucesso");
        String sql = "select * Funcionario";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<FuncionarioBeans> funcionario = new ArrayList<FuncionarioBeans>();
        while(rs.next()){
            FuncionarioBeans funcionarios = new FuncionarioBeans();
            funcionarios.setNome(rs.getString("Nome"));
            funcionarios.setSobrenome(rs.getString("Sobrenome"));
            funcionarios.setCargo(rs.getString("Cargo"));
            funcionarios.setSalario(rs.getInt("Salario"));
            
            funcionario.add(funcionarios);
        }
        rs.close();
        stmt.close();
        con.close();
        return funcionario;
    }
}
