package com.spring.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.FreeBoardDao;
import com.spring.dto.FreeBoardDto;


@Service
public class FreeBoardService {
   @Autowired
   private FreeBoardDao dao;
   
   public List<FreeBoardDto> getAllDatas(int start)
   {

      return dao.getAllDatas(start);
   }
   
   public int FreeBoardCount(int count)
   {
      return dao.FreeBoardCount(count);
   }
   
   public FreeBoardDto getData(int num)
   {
      return dao.getData(num);
   }
   
   public void updateReadCnt(int num)
   {
      dao.updateReadCnt(num);
   }
   
   public void insertFreeBoard(FreeBoardDto dto)
   {
      dao.insertFreeBoard(dto);
   }
   
   public void DeleteFreeBoard(int num)
   {
      dao.DeleteFreeBoard(num);
   }
   
   public void  updateFreeBoard(FreeBoardDto dto)
   {
      dao.updateFreeBoard(dto);
   }
}