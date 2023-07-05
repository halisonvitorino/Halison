package com.halisonvitorino.cadastro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.halisonvitorino.cadastro.models.PessoaFisica;
import com.halisonvitorino.cadastro.models.PessoaJuridica;
import com.halisonvitorino.cadastro.repository.CadastroRepositoryPf;
import com.halisonvitorino.cadastro.repository.CadastroRepositoryPj;

@Controller
public class CadastroController {
	
	@Autowired
	private CadastroRepositoryPf crpf;
	@Autowired
	private CadastroRepositoryPj repoPJ;
	
	  @RequestMapping("/")
	  public String index() {
	    return "index";
	  }
	  
	  @RequestMapping(value="/cadastro", method=RequestMethod.GET)
	  public String cadastro() {
	    return "cadastro";
	  }

	  @RequestMapping(value="/cadastro", method=RequestMethod.POST)
	  public String cadastrarPf(PessoaFisica pf){
		crpf.save(pf);
		return "redirect:/lista";
	  }

	  @RequestMapping("/lista")
	  public ModelAndView listarPf(){
		ModelAndView mav = new ModelAndView("/lista");
		Iterable<PessoaFisica> pf = crpf.findAll();
		mav.addObject("pessoaFisica", pf);
		return mav;
	  }
	  
	  @RequestMapping(value="/alteraPf/{codigoPF}", method=RequestMethod.GET)
	  public ModelAndView alteraPf(@PathVariable("codigoPF")long codigoPF){		  
		PessoaFisica pf = crpf.findByCodigoPF(codigoPF);
		ModelAndView mav = new ModelAndView("/alteraPf");
		mav.addObject("pessoaFisica", pf);
		return mav;
	  }
	  
	  @RequestMapping(value="/alteraPf/{codigoPF}", method=RequestMethod.POST)
	  public String alterarPf(@Validated PessoaFisica pf, BindingResult result, RedirectAttributes redirectAtributes){		  
		crpf.save(pf);
		return "redirect:/lista";
	  }
	  
	  @RequestMapping("/excluiPf")
	  public String excluiPf(long codigoPF){		  
		PessoaFisica pf = crpf.findByCodigoPF(codigoPF);
		crpf.delete(pf);
		return "redirect:/lista";
	  }
	  
	  
	  //Cadastro PJ//////////////////////////////////////////////////////////////////////////////////////////////////////////
	  
	  @RequestMapping(value="/cadastro2", method=RequestMethod.GET)
	  public String cadastroPj() {
	    return "cadastro2";
	  }

	  @RequestMapping(value="/cadastro2", method=RequestMethod.POST)
	  public String cadastrarPJ(PessoaJuridica pj){
		repoPJ.save(pj);
		return "redirect:/lista2";
	  }
	  
	  @RequestMapping("/lista2")
	  public ModelAndView listarPJ(){
		ModelAndView mav = new ModelAndView("/lista2");
		Iterable<PessoaJuridica> pj = repoPJ.findAll();
		mav.addObject("pessoaJuridica", pj);
		return mav;
	  }
	  
	  @RequestMapping(value="/alteraPJ/{codigoPJ}", method=RequestMethod.GET)
	  public ModelAndView alteraPJ(@PathVariable("codigoPJ")long codigoPJ){		  
		PessoaJuridica pj = repoPJ.findByCodigoPJ(codigoPJ);
		ModelAndView mav  = new ModelAndView("/alteraPJ");
		mav.addObject("pessoaJuridica", pj);
		return mav;
	  }
	  
	  @RequestMapping(value="/alteraPJ/{codigoPJ}", method=RequestMethod.POST)
	  public String alterarPJ(@Validated PessoaJuridica pj, BindingResult result, RedirectAttributes redirectAtributes){		  
		  repoPJ.save(pj);
		return "redirect:/lista2";
	  }
	  
	  @RequestMapping("/excluiPJ")
	  public String excluiPJ(long codigoPJ){		  
		PessoaJuridica pj = repoPJ.findByCodigoPJ(codigoPJ);
		repoPJ.delete(pj);
		return "redirect:/lista2";
	  }
	  
}
