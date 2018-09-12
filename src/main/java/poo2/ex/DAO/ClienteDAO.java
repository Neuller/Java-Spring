package poo2.ex.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import poo2.ex.Beans.ClienteBeans;
import poo2.ex.Utilitarios.Conexao;


public class ClienteDAO {
    
    public static void AdicionarCliente(ClienteBeans Cliente) throws SQLException{
        Connection con = Conexao.getConnection();
        //System.out.println("Conectado com Sucesso");
        String sql = "insert into Clientes" + "(Nome), (TipoLogradouro), (Logradouro), (NumLogradouro), (TelResidencial), (TelComercial), (TelCelular), (CPF), (RG), (Profissao)" + "values (?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, Cliente.getNome());
        stmt.setString(2, Cliente.getTipoLogradouro());
        stmt.setInt(3, Cliente.getNumLogradouro());
        stmt.setString(4, Cliente.getTelResidencial());
        stmt.setString(5, Cliente.getTelComercial());
        stmt.setString(6, Cliente.getTelCelular());
        stmt.setString(7, Cliente.getCPF());
        stmt.setString(8, Cliente.getRG());
        stmt.setString(9, Cliente.getProfissao());
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public static List<ClienteBeans> buscarClientes() throws SQLException{
        Connection con = Conexao.getConnection();
        //System.out.println("Conectado com Sucesso");
        String sql = "select * Clientes";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        List<ClienteBeans> clientes = new ArrayList<ClienteBeans>();
        while(rs.next()){
            ClienteBeans cliente = new ClienteBeans();
            cliente.setNome(rs.getString("Nome"));
            cliente.setTipoLogradouro(rs.getString("TipoLogradouro"));
            cliente.setNumLogradouro(rs.getInt("NumLogradouro"));
            cliente.setTelResidencial(rs.getString("TelResidencial"));
            cliente.setTelComercial(rs.getString("TelComercial"));
            cliente.setTelCelular(rs.getString("TelCelular"));
            cliente.setCPF(rs.getString("CPF"));
            cliente.setRG(rs.getString("RG"));
            cliente.setProfissao(rs.getString("Profissao"));
            
            clientes.add(cliente);
        }
        rs.close();
        stmt.close();
        con.close();
        return clientes;
    }
    
}
