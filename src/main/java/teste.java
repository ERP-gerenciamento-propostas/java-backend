import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("teste")
public class teste {

    @RequestMapping("funcao")
    public String teste(){
        return "Oi";
    }

}
