package edu.kosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteFormController {
		@RequestMapping("/login.kosa")
		public String writeForm(Model model) {
			
			return "deleteform";      //  /WEB-INF/views/writeform.jsp
		}
	}
