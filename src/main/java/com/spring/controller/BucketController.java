package com.spring.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.dto.BucketDto;
import com.spring.dto.QnaCommentDto;
import com.spring.service.BucketService;

import spring.react.util.SpringFileWriter;

@RestController
@CrossOrigin
public class BucketController {

	@Autowired
	private BucketService bservice;

	@RequestMapping(value = "/save",consumes = {"multipart/form-data"},
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

	@RequestMapping("/bucketadd")
	public void insertBucket(@RequestBody BucketDto dto)
	{
	
		bservice.insertBucket(dto);
	}

	@RequestMapping("/bucketwithup")
	public void bucketWithUp(@RequestBody Map<String, String> map)
	{
		String user_name = map.get("user_name");
		String num = map.get("num");
		

		bservice.WaitComplete(num);
		bservice.bucketWithUp(user_name,num);
	}

	@RequestMapping("/bucketlikeup")
	public void bucketLikeUp(@RequestBody Map<String, String> map)
	{
		String user_name = map.get("user_name");
		String num = map.get("num");

		

		bservice.bucketLiekUp(user_name,num);
	}

	@RequestMapping("/allselect")
	public List<BucketDto> AllSelect()
	{
	
		return bservice.AllSelect();
	}

	@RequestMapping("/oneselect")
	public BucketDto OneSelect(@RequestParam int num)
	{

		return bservice.OneSelect(num);
	}

	@RequestMapping(value="/searchselect" , method = RequestMethod.GET)
	public List<BucketDto> SearchSelect(@RequestParam String keyword)
	{

		return bservice.SearchSelect(keyword);
	}

	
	
	// 마이페이지 나의 버킷 관련  
	@RequestMapping("/mypage/mylist")
	public List<BucketDto> getMyList(@RequestParam String user_name)
	{

		return bservice.getMyList(user_name);
	}
	
	@RequestMapping("/myage/mydelete")
	public void MyBucketDelte(@RequestParam int num)
	{
		bservice.MyBucketDelte(num);
	}
	
	
	@RequestMapping("/mypage/offlist")
	public List<BucketDto> MyOffBucketList(@RequestParam String user_name)
	{
		return bservice.MyOffBucketList(user_name);
	}
	
	
	//대기중인 나의 버킷 리스트
	@RequestMapping("/mypage/waitlist")
	public List<BucketDto> WaitMyBucket(@RequestParam String user_name)
	{
		return bservice.WaitMyBucket(user_name);
	}
	
	
	
	//우리
 
	@RequestMapping(value="/mypage/ourlist", method = RequestMethod.GET) 
	public List<BucketDto> getOurList(@RequestParam String user_name)
	{
		return  bservice.getOurList(user_name);
	}
	  
	
	 @RequestMapping(value="/offupdate" , method = RequestMethod.GET) 
	 public void OffUpdate(@RequestParam int num) 
	 { 
		 bservice.OffUpdate(num); 
	 }
	 
	 @RequestMapping("/offselect") 
	 public List<BucketDto> OffSelect() 
	 { 
		 return bservice.OffSelect(); 
	 }
	 
	 @RequestMapping("/offoneselect") 
	 public BucketDto OffOneSelect(@RequestParam int num)
	 { 
		 return bservice.OffOneSelect(num); 
	 }
	 
	 @RequestMapping("/soloselect") 
	 public List<BucketDto> SoloSelect() 
	 { 
		 return bservice.SoloSelect();
	 }
	 
	 @RequestMapping("/withselect") 
	 public List<BucketDto> WithSelect() 
	 { 
		 return bservice.WithSelect(); 
	 } 
	 
	 @RequestMapping(value="/bucketwithcheck", method = RequestMethod.GET) 
	 public BucketDto BucketWithCheck(@RequestParam int num) 
	 { 
		 return bservice.BucketWithCheck(num);
	 }
	 
	 @RequestMapping("/mylikeupbucket")
	 public List<BucketDto> MyLikeUpBucket(@RequestParam String user_name)
	 {
		 return bservice.MyLikeUpBucket(user_name);
	 }

	 
	 @RequestMapping("/with_user")
	 public String withuserselect(@RequestParam int num)
	 {
		 return bservice.withuserselect(num);
	 }
	 
	 @RequestMapping("/withcountcheck")
	 public int WithCountCheck(@RequestParam int num)
	 {
		 return bservice.WithCountCheck(num);
	 }
	 
	 @RequestMapping("/withopenupdate")
	 public void WithOpenUpdate(@RequestParam int num) 
	 {
		 bservice.WithOpenUpdate(num);
	 }
	 
	
}





















