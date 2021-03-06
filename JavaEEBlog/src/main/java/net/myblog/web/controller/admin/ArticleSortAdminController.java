package net.myblog.web.controller.admin;

import java.util.List;

import javax.annotation.Resource;

import net.myblog.entity.ArticleSort;
import net.myblog.service.ArticleSortService;
import net.myblog.web.controller.BaseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @description 博客标签(类别)信息的控制类
 * @author Nicky
 * @date 2017年3月7日
 */
@Controller
@RequestMapping("/articleSort")
public class ArticleSortAdminController extends BaseController{
	
	@Autowired ArticleSortService articleSortService;

	/**
	 * 获取所有的博客标签(分类)信息
	 * @return
	 */
	@RequestMapping("/listAll")
	public String listAllSort(Model model){
		List<ArticleSort> articleSorts = articleSortService.findAll();
		model.addAttribute("articleSorts", articleSorts);
		return "myblog/index";
	}
	
	/**
	 * 获取所有的博客标签(分类)信息到后台管理系统
	 * @param model
	 * @return
	 */
	@RequestMapping("/labellist")
	public String labelList(Model model){
		List<ArticleSort> articleSorts = articleSortService.findAll();
		model.addAttribute("articleSorts", articleSorts);
		return "admin/label/label_list";
	}
	
	
	
}
