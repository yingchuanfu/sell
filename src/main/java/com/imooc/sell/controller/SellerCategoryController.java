package com.imooc.sell.controller;

import com.imooc.sell.exception.SellException;
import com.imooc.sell.form.CategoryForm;
import com.imooc.sell.model.ProductCategory;
import com.imooc.sell.service.ProductCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * created by yingchuanfu on 2018/12/8 13:01
 */
@Controller
@RequestMapping("/seller/category")
public class SellerCategoryController {

    private static final Logger logger = LoggerFactory
            .getLogger(SellerCategoryController.class);

    @Autowired
    private ProductCategoryService categoryService;

    /**
     * 类目列表
     * @param map
     * @return
     */
    @GetMapping("/list")
    public ModelAndView list(Map<String,Object> map){
        List<ProductCategory> productCategoryList = categoryService.findAll();
        map.put("productCategoryList", productCategoryList);
        return new ModelAndView("category/list", map);
    }

    /**
     * 展示
     * @param categoryId
     * @param map
     * @return
     */
    @GetMapping("/index")
    public ModelAndView index(@RequestParam(value = "categoryId", required = false) Integer categoryId,
                              Map<String,Object> map){
        if (categoryId != null){
            ProductCategory productCategory = categoryService.fineOne(categoryId);
            map.put("productCategory", productCategory);
        }
        return new ModelAndView("category/index", map);
    }

    /**
     * 保存/更新
     * @param form
     * @param bindingResult
     * @param map
     * @return
     */
    @PostMapping("/save")
    public ModelAndView save(@Valid CategoryForm form,
                             BindingResult bindingResult,
                             Map<String,Object> map){
        if (bindingResult.hasErrors()){
            map.put("msg", bindingResult.getFieldError().getDefaultMessage());
            map.put("url", "/sell/seller/category/index");
            return new ModelAndView("common/error", map);
        }

        ProductCategory productCategory = new ProductCategory();
        try {
            BeanUtils.copyProperties(form, productCategory);
            if (form.getCategoryId() != null) {
                productCategory = categoryService.fineOne(form.getCategoryId());
                productCategory.setCreateTime(productCategory.getCreateTime());
            }else {
                productCategory.setCreateTime(new Date());
            }
            productCategory.setUpdateTime(new Date());
            categoryService.save(productCategory);
        }catch (SellException e){
            map.put("url", "/sell/seller/category/index");
            return new ModelAndView("common/error", map);
        }
        map.put("url", "/sell/seller/category/list");
        return new ModelAndView("common/success", map);
    }
}
