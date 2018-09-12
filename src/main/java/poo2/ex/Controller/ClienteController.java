
package poo2.ex.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import poo2.ex.Beans.ClienteBeans;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import poo2.ex.DAO.ClienteDAO;

@Controller
public class ClienteController {
    
    @RequestMapping(value = "/novoCliente", method = RequestMethod.GET)
    public String novoCliente(Model model){
        List<String>profissoes = new ArrayList<String>();
        profissoes.add("Desenvolvedor C#");
        profissoes.add("Analista de Sistemas");
        profissoes.add("Engenheiro de Software");
        profissoes.add("Desenvolvedor Java");
        
        model.addAttribute("Profissoes", profissoes);
        model.addAttribute("ClienteBeans", new ClienteBeans());
        return "novoCliente";
    }
    
    @RequestMapping(value = "/Cadastrar", method = RequestMethod.POST)
    public String Cadastrar(@ModelAttribute ClienteBeans Cliente, Model model) throws SQLException{
        Cliente.informacoesCliente();
        ClienteDAO.AdicionarCliente(Cliente);
        
        model.addAttribute("Cliente", new ClienteBeans());
        return "novoCliente";
    }
    
    @RequestMapping(value = "/buscarClientes", method = RequestMethod.GET)
    public String buscClientes(Model model) throws SQLException{
        model.addAttribute("ClienteBeans", ClienteDAO.buscarClientes());
        return "ClienteBeans";
    }
}
