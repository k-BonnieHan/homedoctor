package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pack.model.TpBoardDaoInter;

@Controller
public class TpInsertController {

	@Autowired
	private TpBoardDaoInter tpinter;
	

	@RequestMapping(value="tpboard_insert",method=RequestMethod.GET)
	public String tpboard_insert(){
		return "tpboard_insert";
	}
	
	@RequestMapping(value="insert",method=RequestMethod.GET)
	public String insert(){
		return "tpboard_insert";
	}
	
	@RequestMapping(value="insert",method=RequestMethod.POST)
	public String process(Model model, TpBean tpbean) {
		if(tpinter.insert(tpbean))
			return "redirect:/tpboard?page=1";
		else
			return "error";
	}
}
