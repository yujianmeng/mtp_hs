package com.core.dao;


import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.core.model.RequestPage;
import com.core.model.ResponsePage;


/**
 * @author Yao.shulin
 * @create Date: 2016年01月16日-下午5:27:09
 */
public interface BaseDao<E> {

    /**
     * 条件查询
     * 
     * @param criteria
     * @return
     */
    public ResponsePage<E> queryEntitys(RequestPage page);

    /**
     * 持久化对象实体
     * 
     * @param entity
     *            对象实体
     * @return 生成的ID主键
     */
    public Serializable persist(E entity);

    /**
     * 删除对象实体
     * 
     * @param entity
     *            对象实体
     */
    public void delete(E entity);

    /**
     * 以HQL的方式，根据多个属性删除对象实体
     * 
     * @param properties
     *            键String为属性名称；值Object为 属性值
     */
    public void deleteByProperties(Map<String, Object> properties);

    /**
     * 根据给定的Detached对象标识符更新对象实体
     * 
     * @param entity
     *            对象实体
     */
    public void update(E entity);
    public void merge(E entity);
    /**
     * 根据ID立即加载持久化对象实体
     * 
     * @param id
     *            ID值
     * @return 返回对象实体
     */
    public E get(Serializable id);

    /**
     * 根据属性数组获取单个对象实体
     * 
     * @param properties
     *            键String为属性名称；值Object为 属性值
     * @return 返回对象实体
     */
    public E getByProerties(Map<String, Object> properties);

    /**
     * 根据属性和要返回的记录数目获取对象实体列表
     * 
     * @param properties
     *            键String为属性名称；值Object为 属性值
     * @param start
     *            要返回的起始记录位置
     * @param top
     *            要返回的记录数目
     * @return 返回对象实体列表
     */
    public List<E> queryByProerties(Map<String, Object> properties, Integer start, Integer top);

    /**
     * 根据属性获取对象实体列表
     * 
     * @param properties
     *            键String为属性名称；值Object为 属性值
     * @return 返回对象实体列表
     */
    public List<E> queryByProerties(Map<String, Object> properties);

    /**
     * 根据属性获取对象实体列表所有数目
     * 
     * @param properties
     *            键String为属性名称；值Object为 属性值
     * @return 返回对象实体所有数目
     */
    public Long countByProerties(Map<String, Object> properties);

    /**
     * 查询出对象实体的所有数目
     * 
     * @return 返回对象实体所有数目
     */
    public Long countAll();

    /**
     * 查询出所有的对象实体列表
     * 
     * @return 返回对象实体列表
     */
    public List<E> queryAll();

}
