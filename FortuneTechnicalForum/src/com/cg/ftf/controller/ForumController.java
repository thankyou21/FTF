package com.cg.ftf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.ftf.entities.Query;
import com.cg.ftf.service.QueryService;

@Controller
public class ForumController 
{
	@Autowired
	QueryService qSer;
	
	@RequestMapping("search")
	public String searchQuery(@RequestParam("queryId")Integer queryId, Model model)
	{		
		Query qdetail = qSer.fetchQuery(queryId);
		if(qdetail!=null)
		{
			model.addAttribute("qdetails",qdetail);
			return "result";
		}
		else
		{
			model.addAttribute("queryId",queryId);
			return "notFound";
		}
	}
}
