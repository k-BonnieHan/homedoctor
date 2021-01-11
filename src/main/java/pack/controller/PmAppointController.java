package pack.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pack.doctor.BuserDto;
import pack.doctor.DoctorDao;


@Controller
public class PmAppointController {
	@Autowired
	private DoctorDao doctorDao;
	
	//방문예약
	@RequestMapping("appoint")
	public Model buserlist(Model model) {
		model.addAttribute("classdatas", doctorDao.ClassList());
		return model;
	}
	
	//?
	@RequestMapping("selectDoctor")
	public Model doctorlist(Model model) {
		model.addAttribute("doctorlist", doctorDao.DoctorList(null));
		return model;
	}
	
	
	//진료예약 리스트? appoint_list
	@RequestMapping("appoint_list")
	public String appoint_list(){
		return "appoint_list";
	}
	
	
	
	
}
