package com.uestclzy.utils;

import com.uestclzy.domain.entity.Article;
import com.uestclzy.domain.vo.HotArticleVo;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/9 22:41
 */
public class BeanCopyUtils {
    private BeanCopyUtils(){
    }

    //希望pojo类所有内容拷贝到vo类
    public static <V> V copyBean(Object source, Class<V> clazz) {
        //创建目标对象
        V result = null;
        try {
            result = clazz.newInstance();
            //实现属性copy
            BeanUtils.copyProperties(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //返回结果
        return result;
    }

    public static <O,V> List<V> copyBeanList(List<O> list, Class<V> clazz){
        return  list.stream()
                .map(o -> copyBean(o,clazz))
                .collect(Collectors.toList());
    }

//    public static void main(String[] args)  {
//        Article article = new Article();
//        article.setId(12L);
//        article.setTitle("aaa");
//
//        HotArticleVo hotArticleVo = copyBean(article, HotArticleVo.class);
//        System.out.println(hotArticleVo);
//
//    }
}
