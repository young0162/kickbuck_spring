package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.dto.FreeBoardDto;
import com.spring.service.FreeBoardService;

import spring.react.util.SpringFileWriter;

@RestController
@CrossOrigin
public class FreeBoardController {
   
   @Autowired
   private FreeBoardService fService;
   
   @RequestMapping(value = "/community/freeboardinsert/save",consumes = {"multipart/form-data"},
         method = RequestMethod.POST)
   public String imageUpload(HttpServletRequest request,
         @RequestParam MultipartFile uploadFile)
   {
      System.out.println("react>>upload>>"+uploadFile.getOriginalFilename());
      //업로드 경로
      String path=request.getSession().getServletContext().getRealPath("/save");
      System.out.println("path:"+path);
      //이미지저장
      SpringFileWriter sfw = new SpringFileWriter();
      sfw.writeFile(uploadFile, path);
      
      return "success";
   }
   
   @RequestMapping(value="/community/freeboardlist",method = RequestMethod.GET)
   public List<FreeBoardDto> getAllDatas(
         @RequestParam(value = "start", defaultValue = "0") int start)
   {
      
      
      
      return fService.getAllDatas(start);
   }
   
   @RequestMapping("/community/freeboardlist/count")
   public void FreeBoardCount(int count)
   {
  
      
      fService.FreeBoardCount(count);
   }
   
   @RequestMapping(value="/community/freeboarddetail",method = RequestMethod.GET)
   public FreeBoardDto select(
         @RequestParam int num)
   {
     
      
      fService.updateReadCnt(num);//조회수 증가
      System.out.println(fService.getData(num));
      return fService.getData(num);
   }
   
   @RequestMapping("community/freeboardinsert/input")
   public String insertFreeBoard(
         @RequestBody FreeBoardDto dto)
   
   {
   
      
      fService.insertFreeBoard(dto);
      
      return "DB Save Success!!";
   }
   
   @RequestMapping(value = "/community/freeboarddetail/delete",method = RequestMethod.GET )
   public void deleteFreeBoard(
         @RequestParam int num)
   {
      fService.DeleteFreeBoard(num);
   }
   
   @RequestMapping("/community/freeboarddetail/update")
   public String updateFreeBoard(
         @RequestBody FreeBoardDto dto)
   {
    
      
      fService.updateFreeBoard(dto);
      
      return "DB update Success!!";   
   }


}