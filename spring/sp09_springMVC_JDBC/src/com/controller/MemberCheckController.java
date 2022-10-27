package com.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.MemberDAO;
import com.model.MemberVO;

@Controller
public class MemberCheckController {

   @Autowired
   private MemberDAO memberDAO;
   
   @RequestMapping(value = "/check.kosa", method = RequestMethod.GET)
   public String form() {// get 방식으로 들어 올 때 처리
      return "membercheckForm";
      
   }

   @RequestMapping(value = "/check.kosa", method = RequestMethod.POST)
   public ModelAndView submit(@RequestParam(value="id",required=true)String id) throws SQLException {// get 방식으로 들어 올 때 처리
      ModelAndView mav = new ModelAndView();
      MemberVO vo = memberDAO.selectMemberById(id);
      
      mav.addObject("memberok", vo); // data save
      
      if(vo != null) {
         mav.setViewName("membercheckSuccess");
      }else {
         mav.setViewName("membercheckForm");
      }
      return mav;

   }
}