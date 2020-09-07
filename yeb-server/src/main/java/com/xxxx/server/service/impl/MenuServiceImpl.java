package com.xxxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxxx.server.mapper.MenuMapper;
import com.xxxx.server.pojo.Menu;
import com.xxxx.server.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhoubin
 * @since 2020-09-07
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

	@Autowired
	private MenuMapper menuMapper;


	/**
	 * 获取所有菜单
	 * @param adminId
	 * @return
	 */
	@Override
	public List<Menu> menusWithChildren(Integer adminId) {
		return menuMapper.menusWithChildren(adminId);
	}

	/**
	 * 查询菜单权限
	 * @return
	 */
	@Override
	public List<Menu> menusWithRoles() {
		return menuMapper.menusWithRoles();
	}
}
