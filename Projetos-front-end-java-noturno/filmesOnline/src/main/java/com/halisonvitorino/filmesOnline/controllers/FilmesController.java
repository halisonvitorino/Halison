package com.halisonvitorino.filmesOnline.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.halisonvitorino.filmesOnline.models.Filme;
import com.halisonvitorino.filmesOnline.repository.FilmesRepository;

@Controller
public class FilmesController {
	
	@Autowired
	private FilmesRepository fr;
	
	  @RequestMapping("/")
	  public String index() {
	    return "index";
	  }
	  
	  @RequestMapping(value="/cadastro", method=RequestMethod.GET)
	  public String cadastro() {
	    return "cadastro";
	  }

	  @RequestMapping(value="/cadastro", method=RequestMethod.POST)
	  public String cadastrar(Filme filme){
		fr.save(filme);
		return "redirect:/";
	  }

	  @RequestMapping("/lista")
	  public ModelAndView listar(){
		ModelAndView mav = new ModelAndView("/lista");
		Iterable<Filme> filme = fr.findAll();
		mav.addObject("filme", filme);
		return mav;
	  }
	  
	  @RequestMapping(value="/altera/{codigoFilme}", method=RequestMethod.GET)
	  public ModelAndView altera(@PathVariable("codigoFilme")long codigoFilme){		  
		Filme filme = fr.findByCodigoFilme(codigoFilme);
		ModelAndView mav = new ModelAndView("/altera");
		mav.addObject("filme", filme);
		return mav;
	  }
	  
	  @RequestMapping(value="/altera/{codigoFilme}", method=RequestMethod.POST)
	  public String alterar(@Validated Filme filme, BindingResult result, RedirectAttributes redirectAtributes){		  
		fr.save(filme);
		return "redirect:/lista";
	  }
	  
	  @RequestMapping("/exclui")
	  public String exclui(long codigoFilme){		  
		Filme filme = fr.findByCodigoFilme(codigoFilme);
		fr.delete(filme);
		return "redirect:/lista";
	  }
}
