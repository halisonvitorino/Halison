package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.spring.filmes.models.Filme;
import com.spring.filmes.repository.FilmesRepository;

@Controller
public class FilmesController {
	
	@Autowired
	private FilmesRepository fr;
	
	  @RequestMapping("/")
	  public String index() {
	    return "index";
	  }

	  @RequestMapping("/index2")
	  public String index2() {
	    return "index2";
	  }
	  
	  @RequestMapping(value="/cadastrarFilme", method=RequestMethod.GET)
	  public String cadastrarFilme() {
	    return "index";
	  }

	  @RequestMapping(value="/cadastrarFilme", method=RequestMethod.POST)
	  public String cadastrarFilme(Filme filme){
		fr.save(filme);
		return "redirect:/";
	  }
}
