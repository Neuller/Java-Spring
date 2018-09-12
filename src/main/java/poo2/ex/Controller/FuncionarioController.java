package poo2.ex.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import poo2.ex.Beans.FuncionarioBeans;
import poo2.ex.DAO.FuncionarioDAO;

@Controller
public class FuncionarioController {
    @RequestMapping(value = "/novoFuncionario", method = RequestMethod.GET)
    public String novoFuncionario(Model model){
        List<String>cargo = new ArrayList<String>();
        cargo.add("Gerente");
        cargo.add("Técnico");
        
        model.addAttribute("Cargo", cargo);
        model.addAttribute("FuncionarioBeans", new FuncionarioBeans());
        return "novoFuncinario";
    }
    
    @RequestMapping(value = "/Cadastrar", method = RequestMethod.POST)
    public String Cadastrar(@ModelAttribute FuncionarioBeans Funcionario, Model model) throws SQLException{
        Funcionario.informacoesFunc();
        FuncionarioDAO.AdicionarFuncionario(Funcionario);
        
        model.addAttribute("Funcionario", new FuncionarioBeans());
        return "novoFuncionario";
    }
    
    @RequestMapping(value = "/buscarFuncionario", method = RequestMethod.GET)
    public String buscarFuncionarios(Model model) throws SQLException{
        model.addAttribute("FuncionarioBeans", FuncionarioDAO.buscarFuncionario());
        return "FuncionarioBeans";
    }
    
}
